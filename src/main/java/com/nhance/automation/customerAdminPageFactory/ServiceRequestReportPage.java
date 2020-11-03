package com.nhance.automation.customerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ServiceRequestReportPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public ServiceRequestReportPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
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
	
	// //input[@placeholder='Product Name']
	
	@FindBy(xpath="//input[@placeholder='Product Name']")
	private WebElement productName;
	
	public void write_Product_Name(String productNameFromExcel) {
		webUtil.retryingWriteText(productName, productNameFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Request Id']")
	private WebElement requestId;
	
	public void write_Request_Id(String requestIdFromExcel) {
		webUtil.retryingWriteText(requestId, requestIdFromExcel);
	}
	
	
	
	@FindBy(xpath="//th[@ng-reflect-klass='ng2-smart-th serviceTypeName']//select")
	private WebElement serviceType;
	
	public void select_Service_Type(String serviceTypeFromFromExcel) throws InterruptedException
	{
		webUtil.selectByVisibletext(serviceType, serviceTypeFromFromExcel);
	}
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private List<WebElement> requestIdServiceRequestInRecordTable;

	String text;
	public String getTheTextOf_requestIdServiceRequestInRecordTable() {
		for(int i=0;i<requestIdServiceRequestInRecordTable.size();i++)
		{
			text = requestIdServiceRequestInRecordTable.get(i).getText();
			break;
		}
		return text;
	}

	
	@FindBy(xpath="//input[@placeholder='Created Date']")
	private WebElement createdDate;
	
	public void write_Create_Date(String createDateFromExcel) {
		webUtil.retryingWriteText(createdDate, createDateFromExcel);
	}
	
	 
	
	@FindBy(xpath="//input[@placeholder='Last Response Date']")
	private WebElement lastResponseDate;
	
	public void write_last_Response_Date(String lastResponseDateFromExcel) {
		webUtil.retryingWriteText(lastResponseDate, lastResponseDateFromExcel);
	}
	
	
	
	@FindBy(xpath="//th[@class='ng2-smart-th srStatus']//select")
	private WebElement statusType;
	
	public void select_Status_Type(String statusTypeFromFromExcel) throws InterruptedException
	{
		webUtil.selectByVisibletext(statusType, statusTypeFromFromExcel);
	}
	
	
	@FindBy(xpath="//table/tbody/tr/td[1]//div//div")
	public List<WebElement> listOfConsumerName;
	
	@FindBy(xpath="//table/tbody/tr/td[2]//div//div")
	public List<WebElement> listOfConsumerNumber;
	
	@FindBy(xpath="//table/tbody/tr/td[3]//div//div")
	public List<WebElement> listOfProductName;

	@FindBy(xpath="//table/tbody/tr/td[4]//div//div")
	public List<WebElement> listOfRequestId;
	
	@FindBy(xpath="//table/tbody/tr/td[5]//div//div")
	public List<WebElement> listOfServiceType;

	@FindBy(xpath="//table/tbody/tr/td[6]//div//div")
	public List<WebElement> listOfCreatedDate;
	
	@FindBy(xpath="//table/tbody/tr/td[7]//div//div")
	public List<WebElement> listOfLastResponseDate;
	
	@FindBy(xpath="//table/tbody/tr/td[8]//div//div")
	public List<WebElement> listOfResolvedDate;
	
	@FindBy(xpath="//table/tbody/tr/td[9]//div//div")
	public List<WebElement> listOfStatus;
	

}



