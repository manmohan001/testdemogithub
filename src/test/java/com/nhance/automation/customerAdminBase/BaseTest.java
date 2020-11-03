package com.nhance.automation.customerAdminBase;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.EnvironmentVariablesForWeb;
import com.nhance.automation.webGenericLibrary.WebDriverIgnit;
import com.nhance.automation.webGenericLibrary.ExcelLibrary;
import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;


public class BaseTest extends WebDriverIgnit{
	
    protected WebDriverCommonUtill webCmnUtil = new WebDriverCommonUtill();
	protected BusinessFunctionWebSpecific bFuction = new BusinessFunctionWebSpecific();
    WebDriverWait wait;
	
	
	String userName_For_Superuser;
	String password_For_Superuser;

		public void startUp_For_India_CustomerAdmin() throws InterruptedException, InvalidFormatException, EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, AWTException {
			String userName_For_CustomerAdmin;
			String password_For_CustomerAdmin;
		    	getFireFox_browser_For_India();
		    	userName_For_CustomerAdmin = ExcelLibrary.getXlSheetStringValue(
		    			EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
		    			EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_CREDENTIAL), 2, 0);
				Testlistener.log("User Name for Customer Admin Picked From Excel : " + userName_For_CustomerAdmin);

				password_For_CustomerAdmin = ExcelLibrary.getXlSheetStringValue(
						EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
						EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_CREDENTIAL), 2, 1);
				Testlistener.log("Password for Customer Admin Picked From Excel : " + password_For_CustomerAdmin);
				bFuction.login_For_NhanceAngular_Web(userName_For_CustomerAdmin, password_For_CustomerAdmin);
		        wait = new WebDriverWait(getDriver(),15);    
		    }
		
		public void startUp_For_Dubai_CustomerAdmin() throws InterruptedException, InvalidFormatException, EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, AWTException {
			String userName_For_CustomerAdmin;
			String password_For_CustomerAdmin;
	    	getFireFox_browser_For_Dubai();
	    	userName_For_CustomerAdmin = ExcelLibrary.getXlSheetStringValue(
	    			EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_DUBAI_WEB_TESTDATA_EXCEL_FILE_LOC),
	    			EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_CREDENTIAL), 6, 0);
			Testlistener.log("User Name for Customer Admin Picked From Excel : " + userName_For_CustomerAdmin);
			
			System.out.println("User Name for Customer Admin Picked From Excel : " + userName_For_CustomerAdmin);

			password_For_CustomerAdmin = ExcelLibrary.getXlSheetStringValue(
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_DUBAI_WEB_TESTDATA_EXCEL_FILE_LOC),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_CREDENTIAL), 6, 1);
			Testlistener.log("Password for Customer Admin Picked From Excel : " + password_For_CustomerAdmin);
			System.out.println("Password for Customer Admin Picked From Excel : " + password_For_CustomerAdmin);
			
			bFuction.login_For_Dubai_Customer(userName_For_CustomerAdmin, password_For_CustomerAdmin);
	        wait = new WebDriverWait(getDubaiDriver(),15);    
	    }
		
		public void startUp_For_USA_CustomerAdmin() throws InterruptedException, InvalidFormatException, EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, AWTException {
			String userName_For_CustomerAdmin;
			String password_For_CustomerAdmin;
			getFireFox_browser_For_USA();
	    	userName_For_CustomerAdmin = ExcelLibrary.getXlSheetStringValue(
	    			EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_USA_WEB_TESTDATA_EXCEL_FILE_LOC),
	    			EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_CREDENTIAL), 10, 0);
			Testlistener.log("User Name for Customer Admin Picked From Excel : " + userName_For_CustomerAdmin);

			password_For_CustomerAdmin = ExcelLibrary.getXlSheetStringValue(
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_USA_WEB_TESTDATA_EXCEL_FILE_LOC),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_CREDENTIAL), 10, 1);
			Testlistener.log("Password for Customer Admin Picked From Excel : " + password_For_CustomerAdmin);
			bFuction.login_For_NhanceAngular_Web(userName_For_CustomerAdmin, password_For_CustomerAdmin);
	        wait = new WebDriverWait(driver,15);    
	    }
		
		public void startUp_For_SuperUser() throws InterruptedException, InvalidFormatException, EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, AWTException {
		    
			getFireFox_browser_For_India();
			userName_For_Superuser = ExcelLibrary.getXlSheetStringValue(
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_SUPERUSER_TESTDATA_EXCEL_FILE_LOCATION),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_SUPERUSER), 0, 5);
			System.out.println(userName_For_Superuser);
			Testlistener.log("User Name For Superuser Picked From Excel : " + userName_For_Superuser);
			password_For_Superuser = ExcelLibrary.getXlSheetStringValue(EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_SUPERUSER_TESTDATA_EXCEL_FILE_LOCATION),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_SUPERUSER), 2, 1);
	        System.out.println(password_For_Superuser);
			Testlistener.log("Password for Super User Picked From Excel : " + password_For_Superuser);
			bFuction.login_For_NhanceAngular_Web(userName_For_Superuser, password_For_Superuser);
			Thread.sleep(5000); 
	    }
		
		public void loginToTheSuperUserWebApp() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			userName_For_Superuser = ExcelLibrary.getXlSheetStringValue(
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_SUPERUSER_TESTDATA_EXCEL_FILE_LOCATION),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_SUPERUSER), 0, 5);
			System.out.println(userName_For_Superuser);
			Testlistener.log("User Name For Superuser Picked From Excel : " + userName_For_Superuser);
			password_For_Superuser = ExcelLibrary.getXlSheetStringValue(EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_SUPERUSER_TESTDATA_EXCEL_FILE_LOCATION),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_LOGIN_SUPERUSER), 2, 1);
	        System.out.println(password_For_Superuser);
			Testlistener.log("Password for Super User Picked From Excel : " + password_For_Superuser);
			bFuction.login_For_NhanceAngular_Web(userName_For_Superuser, password_For_Superuser);
			Thread.sleep(5000); 
		}
		
		public void cleanUpForIndiaLogin() throws InterruptedException
		{
			try{
			bFuction.logOut_Application();
			}catch (Exception e) {
				Testlistener.log("Got Exception while logout" + e.getMessage());
			}
			//getDriver().quit();
		}
		
		public void cleanUpForDubaiLogin() throws InterruptedException
		{
			try{
			bFuction.logOut_Application();
			}catch (Exception e) {
				Testlistener.log("Got Exception while logout" + e.getMessage());
			}
			getDubaiDriver().quit();
		}
		
		public void logOut()
		{
			try{
				bFuction.logOut_Application();
				}catch (Exception e) {
					Testlistener.log("Got Exception while logout" + e.getMessage());
				}
		}
	    

}
