package com.nhance.automation.Report;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.EnvironmentVariablesForWeb;
import com.nhance.automation.webGenericLibrary.ExcelLibrary;
import com.nhance.automation.webGenericLibrary.GenericFunctionsForWeb;
import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners(Testlistener.class)
@Epic("Smoke Test")
public class GenerateReportTest {
	
	String[] strArray;
	BusinessFunctionWebSpecific blib=new BusinessFunctionWebSpecific();
	WebDriverCommonUtill webUtil=new WebDriverCommonUtill();
	//GenericFunctionsForWeb genFunctnForWeb = new GenericFunctionsForWeb();
	
	@BeforeClass
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description : Before Class Functionality start for ConsumerSignUpTest Class ..")
	public void setUp() throws AWTException, InterruptedException, IOException {
		GenericFunctionsForWeb.read_Environment_Variable_for_Web();
	}
	
	@Test(priority = 1, description = "Execute .bat file for Deleting CMD logs and Generate Allure Report")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description : Execute .bat file for Deleting CMD logs and Generate Allure Report..")
	public void executeCMDcmmnd() throws IOException, InterruptedException
	{ 
		// Read the Location line from .txt file
		
		Runtime.getRuntime().exec("cmd /c start "+(String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.BATFILEPATH_FOR_DELETING_CMDLOG_FILE));
		Thread.sleep(1000);
		try{
		Runtime.getRuntime().exec("taskkill /im cmd.exe");
		Thread.sleep(4000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		// Exceute the Batch file to generate Allure Report	
		Runtime.getRuntime().exec("cmd /c start "+(String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.BATFILEPATH_FOR_GENERATE_ALLURE_REPORT));
		Thread.sleep(20000);
		try{
		Runtime.getRuntime().exec("taskkill /im cmd.exe");
		Thread.sleep(2000);
	}catch (Exception e) {
		// TODO: handle exception
	}
	}
	
	@Test(priority = 2, dependsOnMethods="executeCMDcmmnd" , description = "Getting Allure File Location and executing the allure report upload bat file to server ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description : Getting Allure File Location and executing the allure report upload bat file to server ..")

	public void get_The_AllureReport_File_Location() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
	{      
	String line = Files.readAllLines(Paths.get((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.FILEPATH_FOR_CMDLog))).get(1);
	System.out.println(line);
	strArray = line.split("Report successfully generated to ");
	System.out.println(strArray[1]);
	Testlistener.log("Input file location is :: "+ strArray[1]);
	// Write the location of Temp folder into Input.txt
	webUtil.writeInto_File(strArray[1] , (String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.FILEPATH_FOR_INPUT ));
	Testlistener.log("Location written to input.txt file...");
	
	// Exceute the Batch file to upload the Allure report in QA Server
	   Runtime.getRuntime().exec("cmd /c start "+(String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.BATFILEPATH_FOR_ALLURE_REPORT_UPLOADING));
	   Thread.sleep(60000);
		try{
			Runtime.getRuntime().exec("taskkill /im cmd.exe");
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
		}
	
	// Get the Path of URL from OUPUT.txt file
	String outputFileline = Files.readAllLines(Paths.get((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.FILEPATH_FOR_OUTPUT))).get(0);
	System.out.println(outputFileline);
	Testlistener.log("Output File Location is :: "+outputFileline );
	ExcelLibrary.setExcelData(
			 EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_FINAL_REPORT_URL),
				0, 1,outputFileline);
	}
	
	//@Test(priority=3,dependsOnMethods="get_The_AllureReport_File_Location")
	public void move_The_Allure_report_Folder_to_LocalDrive() throws IOException, InterruptedException
	{      
	// copy the folder From C drive to Some Other Drive
	File srcDir = new File(strArray[1].replace("allure-results",""));
	String getSysTime=BusinessFunctionWebSpecific.getCurrentTime("HH:mm");
	//System.out.println(getSysTime.replaceAll(":", "_"));
	String timeStamp=getSysTime.replaceAll(":", "_");
	File destDir = new File("D:/CommandText/Allure_Result_"+timeStamp);
	FileUtils.copyDirectory(srcDir, destDir);
	}
	
	}
