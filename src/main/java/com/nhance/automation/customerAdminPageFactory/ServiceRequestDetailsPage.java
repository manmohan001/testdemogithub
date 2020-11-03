package com.nhance.automation.customerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ServiceRequestDetailsPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public ServiceRequestDetailsPage(WebDriver driver) {
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
	
	
	@FindBy(xpath="//input[@placeholder='Service Engineer Name']")
	private WebElement serviceEngineerName;
	
	public void write_Service_Engineer_Name(String serviceEngineerNameFromExcel) {
		webUtil.retryingWriteText(serviceEngineerName, serviceEngineerNameFromExcel);
	}

	
	@FindBy(xpath="//input[@placeholder='Model Number']")
	private WebElement modelNumber;
	
	public void write_Model_Number(String modelNumberFromExcel) {
		webUtil.retryingWriteText(modelNumber, modelNumberFromExcel);
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
	
	
	@FindBy(xpath="//input[@placeholder='Created Date']")
	private WebElement createdDate;
	
	public void write_Create_Date(String createDateFromExcel) {
		webUtil.retryingWriteText(createdDate, createDateFromExcel);
	}

	@FindBy(xpath="//input[@placeholder='Assigned Date']")
	private WebElement assignedDate;
	
	public void write_Assigned_Date(String assignedDateFromExcel) {
		webUtil.retryingWriteText(assignedDate, assignedDateFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Resolved Date']")
	private WebElement resolvedDate;
	
	public void write_Resolved_Date(String resolvedDateFromExcel) {
		webUtil.retryingWriteText(resolvedDate, resolvedDateFromExcel);
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
	public List<WebElement> listOfRequestId;

	@FindBy(xpath="//table/tbody/tr/td[4]//div//div")
	public List<WebElement> listOfCreatedDate;
	
	@FindBy(xpath="//table/tbody/tr/td[5]//div//div")
	public List<WebElement> listOfAssignedDate;

	@FindBy(xpath="//table/tbody/tr/td[6]//div//div")
	public List<WebElement> listOfServiceEngineerName;

	@FindBy(xpath="//table/tbody/tr/td[7]//div//div")
	public List<WebElement> listOfModelNumber;

	
	@FindBy(xpath="//table/tbody/tr/td[8]//div//div")
	public List<WebElement> listOfServiceType;

	
	@FindBy(xpath="//table/tbody/tr/td[11]//div//div")
	public List<WebElement> listOfResolvedDate;
	
	@FindBy(xpath="//table/tbody/tr/td[12]//div//div")
	public List<WebElement> listOfStatus;
	
	


}
