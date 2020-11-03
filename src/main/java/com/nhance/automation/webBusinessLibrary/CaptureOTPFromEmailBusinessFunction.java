package com.nhance.automation.webBusinessLibrary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.InternetAddress;
import javax.mail.search.FlagTerm;
import javax.mail.search.OrTerm;
import javax.mail.search.SearchTerm;
import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.EnvironmentVariablesForWeb;


public class CaptureOTPFromEmailBusinessFunction {
	/**
	 * Searches for e-mail messages containing the specified keyword in Subject
	 * field.
	 * 
	 * @param host
	 * @param port
	 * @param userName_For_CustomerAdmin
	 * @param password_For_CustomerAdmin
	 * @param keyword
	 * @throws IOException
	 */
	
	@SuppressWarnings("unused")
	private boolean textIsHtml = false;
	String OTPCode;

	/**
	 * Return the primary text content of the message.
	 */
	private String getText(Part p) throws MessagingException, IOException {
		if (p.isMimeType("text/*")) {
			String s = (String) p.getContent();
			textIsHtml = p.isMimeType("text/html");
			return s;
		}
		if (p.isMimeType("multipart/alternative")) {
			// prefer html text over plain text
			Multipart mp = (Multipart) p.getContent();
			String text = null;
			for (int i = 0; i < mp.getCount(); i++) {
				Part bp = mp.getBodyPart(i);
				if (bp.isMimeType("text/plain")) {
					if (text == null)
						text = getText(bp);
					continue;
				} else if (bp.isMimeType("text/html")) {
					String s = getText(bp);
					if (s != null)
						return s;
				} else {
					return getText(bp);
				}
			}
			return text;
		} else if (p.isMimeType("multipart/*")) {
			Multipart mp = (Multipart) p.getContent();
			for (int i = 0; i < mp.getCount(); i++) {
				String s = getText(mp.getBodyPart(i));
				if (s != null)
					return s;
			}
		}
		return null;
	}

	public String searchEmail(final String userName, final String password, final String subjectKeyword,
			final String fromEmail, final String bodySearchText) throws IOException, MessagingException {
		Properties properties = new Properties();
		@SuppressWarnings("unused")
		boolean val = false;
		// server setting
		/*
		 * properties.put("mail.smtp.host", "smtp.gmail.com");
		 * properties.put("mail.smtp.port", 465);
		 * properties.put("mail.smtps.auth", "true");
		 * properties.put("mail.smtp.starttls.enable", "true");
		 * 
		 * 
		 * // SSL setting
		 * properties.setProperty("mail.smtp.socketFactory.class",
		 * "javax.net.ssl.SSLSocketFactory"); //
		 * properties.setProperty("mail.smtp.socketFactory.fallback", "false");
		 * properties.setProperty("mail.smtp.socketFactory.port",String.valueOf(
		 * 465));
		 */
		properties.load(new FileInputStream(new File((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SMTP_PROPERTIES_FILE_LOC))));
		Session session = Session.getDefaultInstance(properties, null);
		try {
			// connects to the message store
			Store store = session.getStore("imaps");
			// store.connect(userName, password);
			store.connect("smtp.gmail.com", userName, password);
			System.out.println("Connected to Email server….");
			// opens the inbox folder
			Folder folderInbox = store.getFolder("INBOX");
			folderInbox.open(Folder.READ_ONLY);
			// create a search term for all "unseen" messages
			Flags seen = new Flags(Flags.Flag.SEEN);
			FlagTerm unseenFlagTerm = new FlagTerm(seen, true);
			// create a search term for all recent messages
			Flags recent = new Flags(Flags.Flag.RECENT);
			FlagTerm recentFlagTerm = new FlagTerm(recent, false);
			SearchTerm searchTerm = new OrTerm(unseenFlagTerm, recentFlagTerm);
			// performs search through the folder
			Message[] foundMessages = folderInbox.search(searchTerm);
			System.out.println("Total Messages Found :" + foundMessages.length);
			
			 int messageCount = folderInbox.getMessageCount();
			 
	            System.out.println("Total Messages:- " + messageCount);
	 
	            Message[] messages = folderInbox.getMessages();
	            System.out.println("------------------------------");
	 
	            for (int i = 0; i < messageCount; i++) {
	                System.out.println("Mail Subject:- " + messages[i].getSubject());
	                

					Message message1 = messages[i];
					Address[] froms = message1.getFrom();
					String email = froms == null ? null : ((InternetAddress) froms[0]).getAddress();
					System.out.println("From Mail is : "+email);
					//System.out.println("message1.getSubject....."+message1.getSubject());
					//System.out.println("getText(message1)...."+getText(message1));
					if (message1.getSubject() == null) {
						continue;
					}
					Date date = new Date();// Getting Present date from the system
					long diff = date.getTime() - message1.getReceivedDate().getTime();// Get
																						// The
																						// difference
																						// between
																						// two
																						// dates
					long diffMinutes = diff / (60 * 1000) % 60; // Fetching the
																// difference of
																// minute
					// if(diffMinutes>2){
					// diffMinutes=2;
					// }
					System.out.println("Difference in Minutes b/w present time & Email Recieved time :" + diffMinutes);
					try {
						if (message1.getSubject().contains(subjectKeyword) && email.equals(fromEmail)
								&& getText(message1).contains(bodySearchText) && diffMinutes <= 3) {
							String subject = message1.getSubject();
							// System.out.println(getText(message));
							System.out.println("Found message #" + i + ": ");
							System.out.println("At " + i + " :" + "Subject:" + subject);
							System.out.println("From: " + email + " on : " + message1.getReceivedDate());
							if (getText(message1).contains(bodySearchText) == true) {
								System.out.println("Message contains the search text " + bodySearchText);
								
								BufferedWriter bw = new BufferedWriter(new FileWriter((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.HTMLPAGE_OTP_CONTENT_IN_EMAIL_PATH)));
								bw.write(getText(message1));
								bw.close();
								
								 FileReader reader = new FileReader((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.HTMLPAGE_OTP_CONTENT_IN_EMAIL_PATH));
								    List<String> lines = HTMLUtils.extractText(reader);
								    for(int x=0;x<lines.size();x++)
								    {
								    	System.out.println(lines.get(x));
								 //*********** CHANGE THIS PART ONLY FROM THE EMAIL ****************************//   	
								    	if(lines.get(x).contains("Your OTP for completing the sign up / resetting your password process is"))
								    	{
								    	 	System.out.println("The line contains : "+lines.get(x));
								    	    OTPCode=lines.get(x).replaceAll("Your OTP for completing the sign up / resetting your password process is", "").trim();
								    		System.out.println("The OTP Code is : "+ OTPCode.trim());
								    		break;
								    	}
								    	else
								    	{
								    		
								    	}
								    }
								    
								val = true;
							} else {
								val = false;
							}
							break;
						}
					} catch (NullPointerException expected) {
						// TODO Auto-generated catch block
						System.out.println("Got Exception");
						expected.printStackTrace();
					}
					System.out.println("Searching.…" + "At " + i);
				
	            }
			try{
			
			}catch(Exception e){
			System.out.println("Excpetion for Array bound Index");
			}
			// disconnect
			folderInbox.close(false);
			store.close();
		} catch (NoSuchProviderException ex) {
			System.out.println("No provider.");
			ex.printStackTrace();
		} catch (MessagingException ex) {
			System.out.println("Could not connect to the message store.");
			ex.printStackTrace();
		}
		return OTPCode;
	}
			

	/**
	 * Test this program with a Gmail’s account
	 * 
	 * @throws IOException
	 * @throws MessagingException 
	 */

	//@Test
	public String OTP_IN_EMail() throws IOException, MessagingException {
		String userName = "lopadas31.test@gmail.com";
		String password = "Test@123";
		CaptureOTPFromEmailBusinessFunction searcher = new CaptureOTPFromEmailBusinessFunction();
		String subjectKeyword = "OTP for completing Sign Up/Password Reset process";
		String fromEmail = "support@nhancenow.com";
		String bodySearchText = "Your OTP for completing the sign up / resetting your password process is";
		String  OTPCodeFinal=searcher.searchEmail(userName, password, subjectKeyword, fromEmail, bodySearchText);
		System.out.println("The OTP Code in Main Class is ...."+OTPCodeFinal);
		return OTPCodeFinal;
	}
}