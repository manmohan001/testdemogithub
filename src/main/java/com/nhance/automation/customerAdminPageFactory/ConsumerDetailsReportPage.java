package com.nhance.automation.customerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ConsumerDetailsReportPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public ConsumerDetailsReportPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Consumer Details Report']")
	WebElement consumerDetailMenu;
	
	public void click_On_Consumer_Details_Report_Menu_Link() throws InterruptedException {
		webUtil.retryingFindClick(consumerDetailMenu);
	}

	@FindBy(xpath="//input[@placeholder='Consumer Name']")
	private WebElement consumerName;
	
	public void write_Consumer_Name(String consumerNameFromExcel) {
		webUtil.retryingWriteText(consumerName, consumerNameFromExcel);
	}
	

	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	private WebElement mobileNumber;
	
	public void write_Mobile_Number(String mobileNumberFromExcel) {
		webUtil.retryingWriteText(mobileNumber, mobileNumberFromExcel);
	}

	@FindBy(xpath="//input[@placeholder='Email Id']")
	private WebElement emailId;
	
	public void write_Email_Id(String emailIdFromExcel) {
		webUtil.retryingWriteText(emailId, emailIdFromExcel);
	}

	
	@FindBy(xpath="//input[@placeholder='Date of Birth']")
	private WebElement dateOfBirth;
	
	public void write_Date_Of_Birth(String dateOfBirthFromExcel) {
		webUtil.retryingWriteText(dateOfBirth, dateOfBirthFromExcel);
	}
	
	
	@FindBy(xpath="//th[@class='ng2-smart-th addressOne']//div//span")
	private WebElement addressOne;
	
	public void write_Address_One(String addressOneFromExcel) {
		webUtil.retryingWriteText(addressOne, addressOneFromExcel);
	}
	
	@FindBy(xpath="//th[@class='ng2-smart-th addressTwo']//div//span")
	private WebElement addressTwo;
	
	public void write_Address_Two(String addressTwoFromExcel) {
		webUtil.retryingWriteText(addressTwo, addressTwoFromExcel);
	}
	
	@FindBy(xpath="//th[@class='ng2-smart-th addressThree']//div//span")
	private WebElement addressThree;
	
	public void write_Address_Three(String addressThreeFromExcel) {
		webUtil.retryingWriteText(addressThree, addressThreeFromExcel);
	}
	
	
	@FindBy(xpath="//table/tbody/tr/td[1]//div//div")
	public List<WebElement> listOfConsumerName;
	
	@FindBy(xpath="//table/tbody/tr/td[2]//div//div")
	public List<WebElement> listOfMobileNumber;
	
	@FindBy(xpath="//table/tbody/tr/td[3]//div//div")
	public List<WebElement> listOfEmailId;
	
	@FindBy(xpath="//table/tbody/tr/td[4]//div//div")
	public List<WebElement> listOfDateOfBirth;
	
	@FindBy(xpath="//table/tbody/tr/td[5]//div//div")
	public List<WebElement> listOfAddressOne;
	
	@FindBy(xpath="//table/tbody/tr/td[6]//div//div")
	public List<WebElement> listOfAddressTwo;
	
	@FindBy(xpath="//table/tbody/tr/td[7]//div//div")
	public List<WebElement> listOfAddressThree;
	
	@FindBy(xpath="//ui-label[label[contains(text(),'From Date')]]/following-sibling::my-date-picker[1]/div/div/input")
	private WebElement fromDate;
	
	public void write_From_Date(String fromDateFromExcel) {
		webUtil.retryingWriteText(fromDate, fromDateFromExcel);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'To Date')]]/following-sibling::my-date-picker[1]/div/div/input")
	private WebElement toDate;
	
	public void write_To_Date(String toDateFromExcel) {
		webUtil.retryingWriteText(toDate, toDateFromExcel);
	}

	
	@FindBy(xpath="//input[@value='Generate']")
	private WebElement generate;
	
	public void click_On_Generate() throws InterruptedException
	{
		webUtil.retryingFindClick(generate);
	}
	
	@FindBy(xpath = "//input[@value='Export']")
	private WebElement exportButton;
	
	public void moveMouseToselectDateMandatory()
	{
		Actions act = new Actions(driver);
		act.moveToElement(exportButton).build().perform();
	}
	
	@FindBy(xpath = "//ui-button[input[@value='Export']]/following-sibling::div//li[text()='EXCEL']")
	private WebElement excelButton;
	
	public void click_On_Excel_Button() throws InterruptedException {
		webUtil.retryingFindClick(excelButton);
	}
	
	
	
	
	
	
	
}
