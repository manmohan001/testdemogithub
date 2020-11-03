const config = require('dotenv').config().parsed;

var SftpUpload 	= require('sftp-upload'),
	SSH2Shell 	= require ('ssh2shell'),
	fs			= require("fs");
	
function getFormattedCurrentDate() {
    var d = new Date(),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),
        year = d.getFullYear(),
		hour = d.getHours(),
		minute = d.getMinutes(),
		second = d.getSeconds();

    if (month < 10) month = '0' + month;
    if (day < 10) day = '0' + day;
    if (hour < 10) hour = '0' + hour;
    if (minute < 10) minute = '0' + minute;
    if (second < 10) second = '0' + second;

    return [year, month, day, hour, minute, second].join('-');
}

var targetFolderName = getFormattedCurrentDate();
var targetUrl = config.PROTOCOL + config.HOST + "/" + config.PROJECT_FOLDER + "/" + targetFolderName + "/index.html";

var options = {
	host: config.HOST,
	port: config.PORT,
	username: config.USERNAME,
	password: config.PASSWORD,
	path: fs.readFileSync(config.INPUT_PATH).toString(),
	remoteDir: config.REMOTE_DIR
},
host = {
	server: {   
		host: config.HOST,
		port: config.PORT,
		userName: config.USERNAME,
		password: config.PASSWORD
	},
	commands: [
		"echo $(pwd)",
		"su -",
		"mkdir -p "+ config.DESTINATION_DIR + targetFolderName,
		"cp -rf " + config.REMOTE_DIR + "* " + config.DESTINATION_DIR + targetFolderName + '/'
	],
	onCommandProcessing: function( command, response, sshObj, stream ) {
		if(!sshObj.done && response.indexOf("Password:") > -1 ){
			stream.write(config.ROOT_PASSWORD+"\n")
            sshObj.done = true;
		}
	},
	onEnd: function( sessionText, sshObj ) {
		console.log('Writing url "'+targetUrl+'" to file');
		fs.writeFile(config.OUTPUT_PATH, targetUrl, function (err,data) {
		  if (err) {
			//console.log("Error --> " + err);
		  }
		  //console.log("Data --> " + data);
		});
	}
},
sftp = new SftpUpload(options),
SSH = new SSH2Shell(host);

sftp.on('error', function(err) {
	throw err;
})
.on('uploading', function(progress) {
	console.log('Uploading', progress.file);
	console.log(progress.percent+'% completed');
})
.on('completed', function() {
	console.log('Upload Completed');
	console.log('Copying to target folder');
	SSH.connect();
})
.upload();