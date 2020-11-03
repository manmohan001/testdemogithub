package com.nhance.automation.customerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class DigitalKitEventsPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public DigitalKitEventsPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Digital Kit Events Report')]")
	private WebElement digitalKitEventsLink;
	public void click_On_digitalKitEventsLink() throws InterruptedException
	{
		webUtil.retryingFindClick(digitalKitEventsLink);
	}
	
	@FindBy(xpath = "//table[@formarrayname='scheduleConfigs']/tbody/tr/th[2]/ui-label/label")
	private WebElement eventDateText;
	
	public String getEventDateText() {
		return eventDateText.getText();
	}


	@FindBy(xpath="//input[@placeholder='Event Date']")
	private WebElement eventDate;
	public void write_On_eventDate(String eventDateFromExcel) throws InterruptedException
	{
		webUtil.retryingWriteText(eventDate, eventDateFromExcel);
	}

	@FindBy(xpath="//input[@placeholder='Event Title']")
	private WebElement eventTitle;
	public void write_On_eventTitle(String eventTitleFromExcel) throws InterruptedException
	{
		webUtil.retryingWriteText(eventTitle, eventTitleFromExcel);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Message']")
	private WebElement message;
	public void write_On_message(String messageFromExcel) throws InterruptedException
	{
		webUtil.retryingWriteText(message, messageFromExcel);
	}
	
	

	@FindBy(xpath="//table/tbody/tr/td[1]//div//div")
	public List<WebElement> listOfConsumerName;

	@FindBy(xpath="//table/tbody/tr/td[2]//div//div")
	public List<WebElement> listOfConsumerMobile;

	@FindBy(xpath="//table/tbody/tr/td[3]//div//div")
	public List<WebElement> listOfModelNumber;

	@FindBy(xpath="//table/tbody/tr/td[4]//div//div")
	public List<WebElement> listOfEventDate;


	
	
	
	@FindBy(xpath="//table/tbody/tr/td[5]//div//div")
	public List<WebElement> listOfEventTitle;

	@FindBy(xpath="//table/tbody/tr/td[6]//div//div")
	public List<WebElement> listOfMessage;

	
	
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

	@FindBy(xpath="//input[@placeholder='Model Number']")
	private WebElement modelNumber;
	
	public void write_Model_Number(String modelNumberFromExcel) {
		webUtil.retryingWriteText(modelNumber, modelNumberFromExcel);
	}

	@FindBy(xpath="//input[@placeholder='Consumer Name']")
	private WebElement consumerName;
	
	public void write_Consumer_Name(String consumerNameFromExcel) {
		webUtil.retryingWriteText(consumerName, consumerNameFromExcel);
	}
	

	@FindBy(xpath="//input[@placeholder='Consumer Mobile Number']")
	private WebElement consumerNumber;
	
	public void write_Consumer_Number(String consumerNumberFromExcel) {
		webUtil.retryingWriteText(consumerNumber, consumerNumberFromExcel);
	}
	

	
	@FindBy(xpath="//input[@value='Generate']")
	private WebElement generate;
	
	public void click_On_Generate() throws InterruptedException
	{
		webUtil.retryingFindClick(generate);
	}

	
}
