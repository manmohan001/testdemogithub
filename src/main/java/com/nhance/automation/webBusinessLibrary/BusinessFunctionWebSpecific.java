package com.nhance.automation.webBusinessLibrary;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.nhance.automation.customerAdminPageFactory.CustomerAdminCommonWebElementInAllPage;
import com.nhance.automation.customerAdminPageFactory.LoginPage;
import com.nhance.automation.customerAdminPageFactory.ProductManagementPage;
import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.WebDriverIgnit;
import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;
import io.qameta.allure.Step;

/**
 * 
 */
/**
 * @author Manmohan
 *
 */

public class BusinessFunctionWebSpecific extends WebDriverIgnit {

	WebDriverCommonUtill webCmnUtil = new WebDriverCommonUtill();
	LoginPage loginPage;
	com.nhance.automation.dubaiCustomerAdminPageFactory.LoginPage lgnPageForDubai;
	static boolean r1;
	static String linkedCliked;
	CustomerAdminCommonWebElementInAllPage cmnWebElmnt ;
	public static int i;
	public String[] onlyDynamicPageNumber;
	String actualpopUpMessgaeText;
	static int largest_Slab;
	String inlineSearchText;
	ProductManagementPage productPage;
    String actualMmessageCapturedAfterDeleteProduct;
    String popUpMessage;
	
	@Step("Login Step With Email Id : {0}, Password : {1}, for method : {method} step...")
	public void login_For_NhanceAngular_Web(String emailIdFromExcel, String passwordFromExcel)
			throws InterruptedException {
		loginPage = new LoginPage(getDriver());
		loginPage.write_In_EmailID_EditBox(emailIdFromExcel);
		loginPage.write_In_password_EditBox(passwordFromExcel);
		loginPage.click_On_login_Button();
	}
	
	
	@Step("Login Step With Email Id : {0}, Password : {1}, for method : {method} step...")
	public void login_For_Dubai_Customer(String emailIdFromExcel, String passwordFromExcel)
			throws InterruptedException {
		lgnPageForDubai = new com.nhance.automation.dubaiCustomerAdminPageFactory.LoginPage(getDubaiDriver());
		lgnPageForDubai.write_In_EmailID_EditBox(emailIdFromExcel);
		lgnPageForDubai.write_In_password_EditBox(passwordFromExcel);
		lgnPageForDubai.click_On_login_Button();
	}

	public void logOut_Application() throws InterruptedException {
		cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(getDriver());
		cmnWebElmnt.Logout_Link();
		Thread.sleep(1000);
		String actualpopUpMessgaeText = cmnWebElmnt.get_PopUP_MessageText();
		Testlistener.log("The Message appear in Pop Up Box after clicking on Logout Image : " + actualpopUpMessgaeText);
		cmnWebElmnt.click_On_yes_Btn_In_PopUp();
		Thread.sleep(1500);
	}
	
	public void logOut_dubai_Application() throws InterruptedException {
		cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(getDubaiDriver());
		cmnWebElmnt.Logout_Link();
		Thread.sleep(1000);
		String actualpopUpMessgaeText = cmnWebElmnt.get_PopUP_MessageText();
		Testlistener.log("The Message appear in Pop Up Box after clicking on Logout Image : " + actualpopUpMessgaeText);
		cmnWebElmnt.click_On_yes_Btn_In_PopUp();
		Thread.sleep(1500);
	}

	public String click_On_OK_BUtton_And_CaptureThe_POPUpMessage(String HardcoadedexpectedPoPUpMessage)
			throws InterruptedException {
		// Nhance system exception thrown.
		cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
		boolean sts = cmnWebElmnt.get_popUp_DialogBox_Sts();
		Testlistener.log("The Pop Up Box is Displayed after clicking on Save Button : " + sts);
		String expectedPopUpMessageText = HardcoadedexpectedPoPUpMessage;
		actualpopUpMessgaeText = cmnWebElmnt.get_PopUP_MessageText();
		webCmnUtil.compareString(expectedPopUpMessageText,actualpopUpMessgaeText);
		Testlistener.log("Assertion Completed....FOR POP UP MESSAGE---->");
		cmnWebElmnt.click_ok_Btn();
		Thread.sleep(3000);
		webCmnUtil.implicitWait();
		Testlistener.log("Clicked on OK button in Sucess POP UP....");
		return actualpopUpMessgaeText;
	}
	
	public String click_on_YES_Button_And_Capture_ThePOPUpMessage(String HardcoadedexpectedPoPUpMessage) throws InterruptedException
	{
		cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
		boolean sts = cmnWebElmnt.get_popUp_DialogBox_Sts();
		Testlistener.log("The Pop Up Box is Displayed after clicking on delete Button : " + sts);
		System.out.println("The Pop Up Box is Displayed after clicking on delete Button : " + sts);
		String expectedPopUpMessageText = HardcoadedexpectedPoPUpMessage;//"Sure you want to delete?";
		String actualpopUpMessgaeText = cmnWebElmnt.get_PopUP_MessageText();
		Assert.assertEquals(actualpopUpMessgaeText, expectedPopUpMessageText);
		Testlistener.log("Assertion Completed....The Message in Pop Up Box : " + actualpopUpMessgaeText);
		System.out.println("Assertion Completed....The Message in Pop Up Box : " + actualpopUpMessgaeText);
		cmnWebElmnt.click_On_yes_Btn_In_PopUp();
		Thread.sleep(2000);
		webCmnUtil.implicitWait();
		//Thread.sleep(5000);
		return actualpopUpMessgaeText;
	}
	
	public String click_on_OK_Button_In_DK_Delete_And_Capture_ThePOPUpMessage(String HardcoadedexpectedPoPUpMessage) throws InterruptedException
	{
		cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
		boolean sts = cmnWebElmnt.get_popUp_DialogBox_Sts();
		Testlistener.log("The Pop Up Box is Displayed after clicking on delete Button : " + sts);
		String expectedPopUpMessageText = HardcoadedexpectedPoPUpMessage;//"Sure you want to delete?";
		String actualpopUpMessgaeText = driver.findElement(By.xpath("//h2")).getText();;
		Assert.assertEquals(actualpopUpMessgaeText, expectedPopUpMessageText);
		Testlistener.log("Assertion Completed....The Message in Pop Up Box : " + actualpopUpMessgaeText);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		webCmnUtil.implicitWait();
		//Thread.sleep(5000);
		return actualpopUpMessgaeText;
	}

	public static String scrnsht(WebDriver driver, String ScreenShotName) throws IOException {
		// String remoteBaseDir = "/var/www/html/nhance/test/";
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String screenshot = ScreenShotName + "_" + ConstantValueForWeb.currentTime + ".png";
			String Dest_Path = "D:\\CoreWallet_WorkSpace\\MavenNhanceBrandAdminProject\\src\\main\\java\\Screenshot\\"
					+ screenshot;
			File destination = new File(Dest_Path);
			FileUtils.copyFile(source, destination);
			System.out.println("ScreenShot Taken");

			// Upload this file to sftp location
			// sftp code goes here
			// -------------------------------------

			String completeFileLoc = ConstantValueForWeb.sftp_URL + screenshot;
			// writeToSftp(Dest_Path,Constant_Value.remote_Base_Dir);

			// -------------------------------------
			return completeFileLoc;
		} catch (Exception e) {
			System.out.println("Exception while taking ScreenShot" + e.getMessage());
			return e.getMessage();
		}

	}

	// Write FTP nd Capture Screenshot
	/*
	 * private static void writeToSftp(String sourcePath, String remoteBaseDir)
	 * { try { JSch jsch = new JSch(); Session session = jsch.getSession(
	 * "nhanceios", "qa.nhancenow.com", 2200 ); session.setConfig(
	 * "PreferredAuthentications", "password" ); session.setPassword(
	 * "jim!@34sim" ); java.util.Properties config = new java.util.Properties();
	 * config.put("StrictHostKeyChecking", "no");//do not prefer this. demo only
	 * session.setConfig(config); session.connect( 3600 ); Channel channel =
	 * session.openChannel( "sftp" ); ChannelSftp sftp = ( ChannelSftp )
	 * channel; sftp.connect( 600 ); channel = session.openChannel("sftp");
	 * channel.connect(); try { sftp.put(sourcePath, remoteBaseDir); } catch
	 * (Exception e) { e.printStackTrace(); } channel.disconnect();
	 * sftp.disconnect(); } catch (JSchException e) { e.printStackTrace(); } }
	 */

	public static String systemCurrentDate(String dateFormatFromExcel) {
		DateFormat dateFormat = new SimpleDateFormat(dateFormatFromExcel);
		Date date = new Date();
		String sysDate = dateFormat.format(date);
		System.out.println("Current Date Taken From System " + sysDate);
		return sysDate;
	}

	public static String getCurrentTime(String timeFormat) {
		// "HH.mm.ss"
		SimpleDateFormat time_formatter = new SimpleDateFormat(timeFormat);
		String current_time_str = time_formatter.format(System.currentTimeMillis());
		System.out.println(current_time_str);
		return current_time_str;
	}
	
	

	public void scrollingUp() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for (int i = 0; i < 1; i++) {
			jse.executeScript("window.scrollBy(0,-250)", "");
			Thread.sleep(1500);
		}
	}

	public void scrollingDown() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for (int i = 0; i < 2; i++) {
			jse.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1500);
		}
	}

	public int list_Of_Product_InDropDown(String productTypeNameFromExcel, List<WebElement> listOfWebElement) {
		int size = listOfWebElement.size();
		for (int i = 0; i < size; i++) {
			String productTypeName = listOfWebElement.get(i).getText();
			if (productTypeNameFromExcel.trim().equals(productTypeName.trim())) {
				listOfWebElement.get(i).click();
			}
		}
		return size;
	}

	public String operate_Particular_Link_From_Table(String TextFromExcel, List<WebElement> listOFTextFromTable,
			List<WebElement> listOf_ViewLink_From_Table, WebElement nextPaginationLink) {
		System.out.println("The Value of r1 at Intial= " + r1);
		while (!r1) {
			try {
				for (int i = 0; i < listOFTextFromTable.size(); i++) {
					System.out.println(listOFTextFromTable.get(i).getText());
					try {
						if (listOFTextFromTable.get(i).getText().trim().equals(TextFromExcel.trim())) {
							r1 = true;
							Thread.sleep(500);
							linkedCliked = listOFTextFromTable.get(i).getText();
							webCmnUtil.retryingFindClick(listOf_ViewLink_From_Table.get(i));
							Thread.sleep(500);
							break;
						}
					} catch (Exception e) {
						System.out.println("Catch part is runnning in if loopp..........." + e.getMessage());
						break;
					}
				}
				try {
					if (r1 == false) {
						webCmnUtil.retryingFindClick(nextPaginationLink);
						Thread.sleep(500);
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("There is no Next Btn Link Available");
					break;
				}

			} catch (Exception e1) {
				System.out.println("Catch part is running inside Main Try....................." + e1.getMessage());
				break;
			}
			continue;
		}

		r1 = false;
		return linkedCliked;

	}

	public void mandatory_Field_Validation(WebElement elementToCLick) {
		elementToCLick.click();
		webCmnUtil.implicitWait();

		List<WebElement> listOFallRequiredText = driver
				.findElements(By.xpath("//div[contains(text(),'This field is required.')]"));
		int totalRequiredTextSize = listOFallRequiredText.size();
		System.out.println("Total Number of Mandatory Field is = " + totalRequiredTextSize);

		List<WebElement> listOFAllWebElement = driver
				.findElements(By.xpath("//div[@class='panel-body']/descendant::label"));
		int totalWebElementSize = listOFAllWebElement.size();
		System.out.println("Total Number of label Present Inside The Module is = " + totalWebElementSize);

		int totalNonRequiredFieldSize = totalWebElementSize - totalRequiredTextSize;
		System.out.println("Total Number of Non Required Field Count are=" + totalNonRequiredFieldSize);

		for (int i = 0; i < totalRequiredTextSize; i++) {
			String listofRequiredFieldText = listOFallRequiredText.get(i).getText();
			try {
				List<WebElement> dropDownRequiredFieldLbelXpath = driver.findElements(By.xpath(
						"// div[span[div[contains(text(),'This field is required.')]]]/preceding-sibling::label"));
				String dropDownRequiredFieldLbel = dropDownRequiredFieldLbelXpath.get(i).getText();
				System.out.println(dropDownRequiredFieldLbel + "=============> " + listofRequiredFieldText);

			} catch (Exception e) {

			}

			try {

				List<WebElement> EditBoxRequiredFieldLbelXpath = driver.findElements(By
						.xpath("//div[div[div[contains(text(),'This field is required')]]]/preceding-sibling::label"));
				String EditBoxRequiredFieldLbel = EditBoxRequiredFieldLbelXpath.get(i).getText();
				System.out.println(EditBoxRequiredFieldLbel + "=============>" + listofRequiredFieldText);

			} catch (Exception e) {

			}

			try {

				List<WebElement> MobileNumberRequiredFieldLbelXpath = driver.findElements(By.xpath(
						"//div[div[div[div[contains(text(),'This field is required.')]]]]/preceding-sibling::label"));
				String MobileNumberRequiredFieldLbel = MobileNumberRequiredFieldLbelXpath.get(i).getText();
				System.out.println(MobileNumberRequiredFieldLbel + "=============>" + listofRequiredFieldText);

			} catch (Exception e) {

			}

		}

	}

	public int getThe_ExpectedCount_Of_Particular_Row_In_Table(List<WebElement> element, String valueFromExcel)
			throws InterruptedException {
		Testlistener.log("The Value of r1 at Intial= " + r1);
		int count = 0;
		while (!r1) {
			try {
				for (i = 0; i < element.size(); i++) {
					//Testlistener.log(element.get(i).getText());
					//try {
						if (element.get(i).getText().trim().equals(valueFromExcel.trim())) {
							//Thread.sleep(500);
							count++;
						} else {
							continue;
						}
					/*} catch (Exception e) {
					}*/
				}
				//try {
					if (i == 10) {
						cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
						cmnWebElmnt.click_On_nextPageLink();
						i = 0;
						continue;
					}
				//} catch (Exception e) {
					else
					{
					Testlistener.log(
							"Exception Caught while cliking on Next Button..May be the button is disabled..and its the ending page");
					}
				//}

			} catch (Exception e1) {
				Testlistener.log("Catch part is running inside Main Try....................." + e1.getMessage());
			}

			try {
				String pageText = cmnWebElmnt.getText_Of_pageInfoText();
				String dynamicPageNumber = pageText.replaceAll("Page ", "");
				System.out.println("dynamicPageNumber is : " + dynamicPageNumber);
				onlyDynamicPageNumber = dynamicPageNumber.split("of");
				System.out.println("onlyDynamicPageNumber is : " + onlyDynamicPageNumber[0].trim());
				System.out.println("The Constant Page Number is : " + onlyDynamicPageNumber[1].trim());
				if (onlyDynamicPageNumber[0].trim().equals(onlyDynamicPageNumber[1].trim())) {
					break;
				}
			} catch (Exception e) {
				System.out.println("Exception Caught because there is no more Page...");
				break;
			}
		}
		try{
		cmnWebElmnt.click_fast_Backward_Link();
		Thread.sleep(1000);
		}catch (Exception e) {
			System.out.println("There is no fast forward Option image...");
		}
		r1 = false;
		return count;
	}
	
	// Method to get the Total Count Number In View Page in Integer
	public int totalCount_In_ViewPage()
	{	
	cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	String totalCountSize =cmnWebElmnt.get_totalNumber_Text();
	String Total_Count_In_String = totalCountSize.replaceAll("Total : ", "");
	int totalCount_In_Integer=Integer.parseInt(Total_Count_In_String.trim());
	return totalCount_In_Integer;
	}
	
	// Method to get the Total Count Number In View Page in Integer
	public String totalCount_In_ViewPage_In_String()
	{	
	cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	String totalCountSize =cmnWebElmnt.get_totalNumber_Text();
	String Total_Count_In_String = totalCountSize.replaceAll("Total : ", "");
	return Total_Count_In_String;
	}
	
	
	public void click_on_Country_Flag_Icon_For_ContactNumber() throws InterruptedException
	{
		driver.findElement(By.xpath("//ui-label[label[contains(text(),'Contact Number')]]/following-sibling::div/descendant::div[@class='iti-arrow']")).click();
		Thread.sleep(1000);
		List<WebElement> listOFCountryCode=driver.findElements(By.xpath("//ul[@class='country-list dropdown-menu']/li/span[@class='country-name']"));
		for(int i=0;i<listOFCountryCode.size();i++)
		{
			if(listOFCountryCode.get(i).getText().trim().equals("India (भारत)".trim()))
			{
				listOFCountryCode.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}
	
	public void click_on_US_Country_Flag_Icon_For_ContactNumber() throws InterruptedException
	{
		driver.findElement(By.xpath("//ui-label[label[contains(text(),'Contact Number')]]/following-sibling::div/descendant::div[@class='iti-arrow']")).click();
		Thread.sleep(1000);
		List<WebElement> listOFCountryCode=driver.findElements(By.xpath("//ul[@class='country-list dropdown-menu']/li/span[@class='country-name']"));
		for(int i=0;i<listOFCountryCode.size();i++)
		{
			if(listOFCountryCode.get(i).getText().trim().equals("India (भारत)".trim()))
			{
				listOFCountryCode.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}
	
	public void edit_Click_on_Country_Flag_Icon_For_ContactNumber() throws InterruptedException
	{
		driver.findElement(By.xpath("//ui-label[label[contains(text(),'Contact Number')]]/following-sibling::div/descendant::div[@class='iti-arrow']")).click();
		Thread.sleep(1000);
		List<WebElement> listOFCountryCode=driver.findElements(By.xpath("//ul[@class='country-list dropdown-menu']/li/span[@class='country-name']"));
		for(int i=0;i<listOFCountryCode.size();i++)
		{
			if(listOFCountryCode.get(i).getText().trim().equals("India (भारत)".trim()))
			{
				listOFCountryCode.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}
	
	
	public void click_on_Country_Flag_Icon_For_HelpdeskNumber(String countryName) throws InterruptedException
	{
		driver.findElement(By.xpath("//ui-label[label[contains(text(),'Helpdesk Number')]]/following-sibling::div/descendant::div[@class='iti-arrow']")).click();
		Thread.sleep(1000);
		List<WebElement> listOFCountryCode=driver.findElements(By.xpath("//ul[@class='country-list dropdown-menu']/li/span[@class='country-name']"));
		for(int i=0;i<listOFCountryCode.size();i++)
		{
			if(listOFCountryCode.get(i).getText().trim().equals(countryName.trim()))
			{
				listOFCountryCode.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}

	public void edit_Click_on_Country_Flag_Icon_For_HelpdeskNumber(String countryName) throws InterruptedException
	{
		driver.findElement(By.xpath("//ui-label[label[contains(text(),'Helpdesk Number')]]/following-sibling::div/descendant::div[@class='iti-arrow']")).click();
		Thread.sleep(1000);
		List<WebElement> listOFCountryCode=driver.findElements(By.xpath("//ul[@class='country-list dropdown-menu']/li/span[@class='country-name']"));
		for(int i=0;i<listOFCountryCode.size();i++)
		{
			if(listOFCountryCode.get(i).getText().trim().equals(countryName.trim()))
			{
				listOFCountryCode.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}

	
	
	public int  largestSlab(String slab1Unit_FromExcel, String slab2Unit_FromExcel , String slab3Unit_FromExcel)
	{
		  if ( Integer.parseInt(slab1Unit_FromExcel) > Integer.parseInt(slab2Unit_FromExcel) && Integer.parseInt(slab1Unit_FromExcel) > Integer.parseInt(slab3Unit_FromExcel) )
		  {
			Testlistener.log("SLAB 1 is largest.");
		   // largest_Slab=Integer.parseInt(slab1Unit_FromExcel);
		  } else if ( Integer.parseInt(slab2Unit_FromExcel)> Integer.parseInt(slab1Unit_FromExcel)&&Integer.parseInt(slab2Unit_FromExcel) >Integer.parseInt(slab3Unit_FromExcel) )
		  {
			Testlistener.log("SLAB 2 is largest.");
		   // largest_Slab=Integer.parseInt(slab1Unit_FromExcel);
		  }else if ( Integer.parseInt(slab3Unit_FromExcel) > Integer.parseInt(slab1Unit_FromExcel) && Integer.parseInt(slab3Unit_FromExcel) > Integer.parseInt(slab2Unit_FromExcel) )
		  {
			Testlistener.log("SLAB 3 is largest.");
		    largest_Slab=Integer.parseInt(slab3Unit_FromExcel);
		  }else   
	    	Testlistener.log("Entered numbers are not distinct.");
		  
		  return largest_Slab;
	}
	
	public String text_for_The_PartialSearch(String exactTextFromExcel)
	{
		 int sizeofText=exactTextFromExcel.length();
		  String partialText="";
		  for(int i=0;i<sizeofText; i++)
		  {
			  if(i!=3)
			  {
			  partialText = partialText + exactTextFromExcel. charAt(i); 
			  }
			  
			  else
			  {
				  break;
			  }
		  }
		
		  return partialText;   
	}
	
	public String doTheExactSearch(List<WebElement> listelement, String searchText)
	{
		try{
		for(int i=0;i<listelement.size();i++)
		{
			inlineSearchText=listelement.get(i).getText();
			System.out.println("The Text in first list is : "+inlineSearchText);
			if(inlineSearchText.equals(searchText.trim()))
			{
				Testlistener.log("Exact Text Picked for Search is : "+ searchText);
				Testlistener.log("Exact Searched Matched..The First Text Present in List is : "+ inlineSearchText);
				break;
			}
			else{
				Testlistener.log("Exact Search is not working for the value text "+ searchText);
			}
			
		}
		}catch (Exception e) {
			Testlistener.log("Exact Search is not working for the value text "+ searchText);
			Testlistener.log("Exception thrown is : "+ e.getMessage());
		}
		return inlineSearchText;
	}

	public String doThePartialSearch(List<WebElement> listelement, String searchText)
	{
		for(int i=0;i<listelement.size();i++)
		{
			inlineSearchText=listelement.get(i).getText();
			System.out.println("The Text in first list is : "+inlineSearchText);
			if(inlineSearchText.contains(searchText.trim()))
			{
				Testlistener.log("Partial Text Picked for Search is : "+ searchText);
				Testlistener.log("Partial Searched Matched..The First Text Present in List is :  "+ inlineSearchText);
				break;
			}
			else{
				Testlistener.log("Partial Search is not working for the value text "+ searchText);
			}
			
		}
		return inlineSearchText;
	}
	
	public String doTheInvalidSearch(List<WebElement> listelement, String searchText)
	{
		for(int i=0;i<listelement.size();i++)
		{
			inlineSearchText=listelement.get(i).getText();
			System.out.println("The Text in first list is : "+inlineSearchText);
			if(!inlineSearchText.contains(searchText.trim()))
			{
				Testlistener.log("Incorrect Text Picked for Search is : "+ searchText);
				Testlistener.log("Searched Completed..The First Text Present in List is :  "+ inlineSearchText);
				break;
			}
			else{
				Testlistener.log("Invalid Search is not working for the value text "+ searchText);
			}
			
		}
		return inlineSearchText;
	}
	
	public String deleteProduct(String expectedMessage , String modelNumber_From_Excel)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		productPage = new ProductManagementPage(driver);
		cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
		//Thread.sleep(2000);
		cmnWebElmnt.click_productManagemnet_Menu_Link();
		webCmnUtil.implicitWait();
		//Thread.sleep(3000);
		productPage.write_On_modelNumberSearchEditBox(modelNumber_From_Excel + Keys.ENTER);
		Thread.sleep(3000);
		String expectedCountSize = "Total : 1";
		String totalCountSize = cmnWebElmnt.get_totalNumber_Text();
		webCmnUtil.compareString(totalCountSize, expectedCountSize);
		Testlistener.log("The " + totalCountSize
				+ " Result found after Searching for Product Model Number Used in DK Management is : "
				+ modelNumber_From_Excel);
		Testlistener.log("Assertion Completed and Total Count is Verified after searching... ");
		String actualModelNumberAfterSearch = productPage.getTheTextOf_modelNumberInRecordTable();
		Testlistener.log("The Model Number Fetched From Table is : " + actualModelNumberAfterSearch);
		webCmnUtil.compareString(actualModelNumberAfterSearch, modelNumber_From_Excel);
		Testlistener.log("Assertion Completed....Product Model Number is Validated.. ");
		productPage.click_On_delete_Image_link();
		webCmnUtil.implicitWait();
		//Thread.sleep(2000);
		Testlistener.log("Click on Delete icon...");
		String actlpopUpMessage = click_on_YES_Button_And_Capture_ThePOPUpMessage("Sure you want to delete?");
		webCmnUtil.implicitWait();
		//Thread.sleep(3000);
		Testlistener.log("After clicking on delete icon the pop up message displayed is : " + actlpopUpMessage);
		try{
	    popUpMessage = click_on_OK_Button_In_DK_Delete_And_Capture_ThePOPUpMessage(expectedMessage);
		Testlistener
				.log("The Actual Pop Up message Captured from UI after clicking on delete icon is : " + popUpMessage);
		}catch (Exception e) {
		popUpMessage = click_On_OK_BUtton_And_CaptureThe_POPUpMessage(expectedMessage);
		Testlistener
		.log("Entered into the Catch loop and Exception got handled");
		Testlistener
				.log("The Actual Pop Up message Captured from UI after clicking on delete icon is : " + popUpMessage);
		}
		return popUpMessage;

	}
	
	public String deleteProductAfterAddingSomething(String expectedMessage , String modelNumber_From_Excel)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		productPage = new ProductManagementPage(driver);
		cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
		Thread.sleep(2000);
		
		
		cmnWebElmnt.click_on_nhance_Logo_Link();
		Thread.sleep(2000);
		cmnWebElmnt.click_On_Configure_Link();
		webCmnUtil.implicitWait();
		if(cmnWebElmnt.productManagementLinkDisplay()) {
			cmnWebElmnt.click_productManagemnet_Menu_Link();
		webCmnUtil.implicitWait();
		}else {
			cmnWebElmnt.click_On_Configure_Link();
			webCmnUtil.implicitWait();
			cmnWebElmnt.click_productManagemnet_Menu_Link();
			webCmnUtil.implicitWait();	
		}
		productPage.write_On_modelNumberSearchEditBox(modelNumber_From_Excel + Keys.ENTER);
		Thread.sleep(3000);
		String expectedCountSize = "Total : 1";
		String totalCountSize = cmnWebElmnt.get_totalNumber_Text();
		webCmnUtil.compareString(totalCountSize, expectedCountSize);
		Testlistener.log("The " + totalCountSize
				+ " Result found after Searching for Product Model Number Used in DK Management is : "
				+ modelNumber_From_Excel);
		Testlistener.log("Assertion Completed and Total Count is Verified after searching... ");
		String actualModelNumberAfterSearch = productPage.getTheTextOf_modelNumberInRecordTable();
		Testlistener.log("The Model Number Fetched From Table is : " + actualModelNumberAfterSearch);
		webCmnUtil.compareString(actualModelNumberAfterSearch, modelNumber_From_Excel);
		Testlistener.log("Assertion Completed....Product Model Number is Validated.. ");
		productPage.click_On_delete_Image_link();
		Thread.sleep(2000);
		Testlistener.log("Click on Delete icon...");
		String actlpopUpMessage = click_on_YES_Button_And_Capture_ThePOPUpMessage("Sure you want to delete?");
		Thread.sleep(3000);
		Testlistener.log("After clicking on delete icon the pop up message displayed is : " + actlpopUpMessage);
		popUpMessage = click_On_OK_BUtton_And_CaptureThe_POPUpMessage(expectedMessage);
		Testlistener
		.log("Entered into the Catch loop and Exception got handled");
		Testlistener
				.log("The Actual Pop Up message Captured from UI after clicking on delete icon is : " + popUpMessage);
		return popUpMessage;

	}
	
	
	
	// Written By Lopa for total Count Validation
	/**
	 * 
	 */
	/**
	 * @author Lopa
	 *
	 */
	public String totalCount_For_ValidData(String countCapturedFromUI, String TotalCount)
	{
		
		String[] countforSplitting = countCapturedFromUI.split("Total : ");
		String countAfterSplit = countforSplitting[1].trim();
		Testlistener.log("After search, total count captured is :- "+countAfterSplit);
			
		if(countCapturedFromUI.equals(TotalCount))
		{
			Testlistener.log("Exact search is not working as expected.");
		}
		else
		{
			Testlistener.log("Exact search is working as expected.");
		}
		return countAfterSplit;	
	}

	public String totalCount_For_PartialData(String countCapturedFromUI, String TotalCount)
	{
		
		String[] countforSplitting = countCapturedFromUI.split("Total : ");
		String countAfterSplit = countforSplitting[1].trim();
		Testlistener.log("After search, total count captured is :- "+countAfterSplit);
			
		if(countCapturedFromUI.equals(TotalCount))
		{
			Testlistener.log("Partial search is not working as expected.");
		}
		else
		{
			Testlistener.log("Partial search is working as expected.");
		}
		return countAfterSplit;	
	}

	public String totalCount_For_inValidData(String countCaptured, String TotalCount)
	{
		String[] countforSplittingForInvalidData = countCaptured.split("Total : ");
		String countAfterSplitForInvalidData = countforSplittingForInvalidData[1].trim();
		Testlistener.log("After search, total count captured is :- "+countAfterSplitForInvalidData);
		if(countCaptured.equals(TotalCount))
		{
			Testlistener.log("Invalid search is working as expected.");
		}
		else
		{
			Testlistener.log("Invalid search is not working as expected.");
		}
		return countAfterSplitForInvalidData;	
	}
}
