package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.EnvironmentVariablesForWeb;
import com.nhance.automation.webGenericLibrary.ExcelLibrary;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ForgotPasswordPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	//BusinessFunction bMthd = new BusinessFunction();

	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='julie@widgetco.com']")
	private WebElement emailID_EditBox_In_ForgotPassword_Page;
	public void write_In_emailID_EditBox_In_ForgotPassword_Page(String emailIDFromExcel)
	{
		webUtil.retryingWriteText(emailID_EditBox_In_ForgotPassword_Page, emailIDFromExcel);
	}
	
	@FindBy(xpath = "//div[@class='iti-arrow']")
	private WebElement country_Select_Arrow_Link;

	@FindBy(xpath = "//ul[@class='country-list dropdown-menu show']//li//span[@class='country-name']")
	private List<WebElement> list_of_CountryName;

	public void select_Country_From_SelectOption(String countryName) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
	webUtil.retryingFindClick(country_Select_Arrow_Link);
	Thread.sleep(500);
	for (int i = 0; i < list_of_CountryName.size(); i++) {
	if (list_of_CountryName.get(i).getText().trim().equals(countryName.trim())) {
	list_of_CountryName.get(i).click();
	break;
	}
	}
	Thread.sleep(1000);
	}

	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	private WebElement mobileNumberTextField;

	public void write_On_MobileNumber_TextField_In_ForgotPassword_Page(String mobileNumberFromExcel) {
	webUtil.retryingWriteText(mobileNumberTextField, mobileNumberFromExcel);
	}
	
	@FindBy(xpath = "//p-radiobutton[@formcontrolname='mobileNumber']//div//div[2]")
	private WebElement mobileRadioButton;

	public void click_On_Mobile_RadioButton() throws InterruptedException {
	webUtil.retryingFindClick(mobileRadioButton);
	}
	
	
	
	
	@FindBy(xpath="//input[@value='Next']")
	private WebElement next_Btn_in_ForgotPassword_Page;
	public void click_On_next_Btn_in_ForgotPassword_Page() throws InterruptedException
	{
		webUtil.retryingFindClick(next_Btn_in_ForgotPassword_Page);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter OTP']")
	private WebElement enterOTP_EditBox;
	public void write_enterOTP_EditBox(String OTPrecievedFromEmail)
	{
		webUtil.retryingWriteText(enterOTP_EditBox, OTPrecievedFromEmail);
	}
	
	@FindBy(xpath="//input[@value='Verify']")
	private WebElement verify_Btn;
	public void click_On_Verfiy_Btn() throws InterruptedException
	{
		webUtil.retryingFindClick(verify_Btn);
	}
	
	@FindBy(xpath="//input[@formcontrolname='newPassword']")
	private WebElement enterNewPassword_EditBox;
	public void enterNewPassword_EditBox(String newPasswordFromExcel)
	{
		webUtil.retryingWriteText(enterNewPassword_EditBox, newPasswordFromExcel);
	}
	
	@FindBy(xpath="//input[@formcontrolname='repeatPassword']")
	private WebElement enterRetypePassword_EditBox;
	public void write_On_enterRetypePassword_EditBox(String RetypePasswordFromExcel)
	{
		webUtil.retryingWriteText(enterRetypePassword_EditBox, RetypePasswordFromExcel);
	}
	
	@FindBy(xpath="//input[@value='Update']")
	private WebElement update_Button;
	public void click_On_update_Button() throws InterruptedException
	{
		webUtil.retryingFindClick(update_Button);
	}
	
	
	
	
}
