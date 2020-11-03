package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ProfilePage {
	
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[contains(text(),'Profile')]")
	private WebElement profileLink;
	
	public void click_On_Profile_Link() throws InterruptedException {
		webUtil.retryingFindClick(profileLink);
	}
	
	@FindBy(xpath="//div[ui-label[label[contains(text(),'Name')]]]//input")
	private WebElement nameTextField;
	
	public void write_Name_TextField(String nameFromExcel) {
		webUtil.retryingWriteText(nameTextField, nameFromExcel);
	}
	
	public String getText_of_Name_TextField() {
		String text = webUtil.get_Attribut_value(nameTextField);
		return text;
	}
	
	@FindBy(xpath="//div[@class='flag-container']")
	private WebElement countryFlag;
	
	public void click_On_Country_Flag() throws InterruptedException {
		webUtil.retryingFindClick(countryFlag);
		
	}
	
	@FindBy(xpath="//input[@value='Send OTP']")
	private WebElement sendOtpButton;
	
	public void click_On_SendOtp_Button() throws InterruptedException {
		webUtil.retryingFindClick(sendOtpButton);
	}

	@FindBy(xpath="//div[ui-label[label[contains(text(),'Mobile Number')]]]//input[@placeholder='Mobile Number']")
	private WebElement mobileNumberTextField;
	
	public void write_Mobile_Number_TextField(String mobileNumberFromExcel) {
		webUtil.retryingWriteText(mobileNumberTextField, mobileNumberFromExcel);
	}

	public String getText_of_Mobile_Number_TextField() {
		String text = webUtil.get_Attribut_value(mobileNumberTextField);
		return text;
	}
	
	
	@FindBy(xpath="//div[ui-label[label[contains(text(),'Email Id')]]]//input")
	private WebElement emailIdTextField;
	
	public void write_Text_EmailId_TextField(String emailFromExcel) {
		webUtil.retryingWriteText(emailIdTextField, emailFromExcel); 
	}
	
	public String getText_of_EmailId_TextField() {
		String text = webUtil.get_Attribut_value(emailIdTextField);
		return text;
	}
	
	
	@FindBy(xpath="//span//input[@value='Attach File']")
	WebElement profileImage;

	
	public void attachTheProfileImage(String FilePathToUpload) throws InterruptedException, IOException {
		webUtil.retryingFindClick(profileImage);
		Thread.sleep(1000);
		webUtil.fileUpload(FilePathToUpload);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter OTP']")
	private WebElement enterOtpBox;
	
	public void moveMouseToEnterOTPTextBox()
	{
		Actions act = new Actions(driver);
		act.moveToElement(enterOtpBox).build().perform();
	}
	
	@FindBy(xpath="//input[@placeholder='Enter OTP']")
	private WebElement enterOtpBox1;
	
	public void moveMouseToEnterOTPTextBox1()
	{
		Actions act = new Actions(driver);
		act.moveToElement(enterOtpBox1).build().perform();
	}
	
	/*WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));
	
	*/
	@FindBy(css=".ui-tooltip")
	private WebElement toolTipTextForEneterOTP;
	public String getTheTextOfToolTipOfEnterOTPEditBox()
	{
		String tooltipText = toolTipTextForEneterOTP.getText();
		return tooltipText;
	}
	
	public void write_EnterOtp_TextField(String enterOtpFromExcel) {
		webUtil.retryingWriteText(enterOtpBox, enterOtpFromExcel);
	}
	
   @FindBy(xpath="//input[@value='Resend OTP']")
	private WebElement resendOtpButton;
	
	public void click_On_ResendOtp_Button() throws InterruptedException {
		webUtil.retryingFindClick(resendOtpButton);
	}
	
	@FindBy(xpath="//input[@value='Verify']")
	private WebElement verifyButton;
	
	public void click_On_Verify_Button() throws InterruptedException {
		webUtil.retryingFindClick(verifyButton);
	}
	
	@FindBy(xpath="//i[@class='fa fa-times']")
	private WebElement close_Pop_Up;
	
	public void click_On_Close_Popup() throws InterruptedException {
		webUtil.retryingFindClick(close_Pop_Up);
	}
	
	
		
}
