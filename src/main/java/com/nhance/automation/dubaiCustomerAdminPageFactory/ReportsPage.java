package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ReportsPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	String text;

	public ReportsPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Product Details')]")
	private WebElement productDetailsLink;
	public void click_On_productDetailsLink() throws InterruptedException
	{
		webUtil.retryingFindClick(productDetailsLink);
	}
	
	@FindBy(xpath="//a[contains(text(),'Digital Kits Issued')]")
	private WebElement digitalKitsIssuedLink;
	public void click_On_digitalKitsIssuedLink() throws InterruptedException
	{
		webUtil.retryingFindClick(digitalKitsIssuedLink);
	}
	
	@FindBy(xpath="//a[contains(text(),'Digital Kit Invoice')]")
	private WebElement digitalKitInvoiceLink;
	public void click_On_digitalKitInvoiceLink() throws InterruptedException
	{
		webUtil.retryingFindClick(digitalKitInvoiceLink);
	}
	
	@FindBy(xpath="//a[contains(text(),'Campaign Report')]")
	private WebElement campaignReportLink;
	
	public void click_On_campaignReportLink() throws InterruptedException
	{
		webUtil.retryingFindClick(campaignReportLink);
	}
	
	
	@FindBy(xpath="//a[text()='Digital Kit Events Report']")
	private WebElement digitalKitEventsReportLink;
	
	public void click_On_DigitalKitEventsReportLink() throws InterruptedException
	{
		webUtil.retryingFindClick(digitalKitEventsReportLink);
	}

	
	@FindBy(xpath="//a[text()='Inventory Report - Spare Parts And Accessories']")
	private WebElement inventoryReportLink;
	public void click_On_InventoryReportLink() throws InterruptedException
	{
		webUtil.retryingFindClick(inventoryReportLink);
	}
	

	@FindBy(xpath="//i[@class='fa fa-chevron-right']")
	private WebElement forward;
	
	public void click_On_Forward() throws InterruptedException
	{
		webUtil.retryingFindClick(forward);
	}

	@FindBy(xpath="//th[@class=\"ng2-smart-th campaignType\"]//select")
	private WebElement campaignType;
	
	public void select_Campaign_Type(String campaignTypeFromFromExcel) throws InterruptedException
	{
		webUtil.selectByVisibletext(campaignType, campaignTypeFromFromExcel);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Campaign Id']")
	private WebElement campaignId;
	
	public void write_Campaign_Id(String campaignIdFromExcel) {
		webUtil.retryingWriteText(campaignId, campaignIdFromExcel);
	}

	// //table/tbody/tr/td[1]//div//div
	
	@FindBy(xpath="//table/tbody/tr/td[1]//div//div")
	public List<WebElement> listOfCampaignId;
	
	@FindBy(xpath="//table/tbody/tr/td[1]//div//div")
	public WebElement listOfCampaignIdTable;
	
	public String get_First_CampaignId() {
		String text = webUtil.get_Attribut_value(listOfCampaignIdTable);
		return text;
				}

	public String getTheTextOf_campaignIdServiceRequestInRecordTable() {
		for(int i=0;i<listOfCampaignId.size();i++)
		{
			text = listOfCampaignId.get(i).getText();
			break;
		}
		return text;
	}
		
	@FindBy(xpath="//table/tbody/tr/td[3]//div//div")
	public List<WebElement> listOfCampaignName;
	
	@FindBy(xpath="//table/tbody/tr/td[4]//div//div")
	public List<WebElement> listOfCampaignMessage;
	
	@FindBy(xpath="//input[@placeholder='Campaign Name']")
	private WebElement campaignName;
	
	public void write_Campaign_Name(String campaignNameFromExcel) {
		webUtil.retryingWriteText(campaignName, campaignNameFromExcel);
	}


	@FindBy(xpath="//input[@placeholder='Campaign Message']")
	private WebElement campaignMessage;
	
	public void write_Campaign_Message(String campaignMessageFromExcel) {
		webUtil.retryingWriteText(campaignMessage, campaignMessageFromExcel);
	}

	
	@FindBy(xpath="//a[text()='Service Request Report']")
	private WebElement serviceReportLink;
	
	public void click_On_serviceRequestReportLink() throws InterruptedException
	{
		webUtil.retryingFindClick(serviceReportLink);
	}
	
	
	@FindBy(xpath="//a[text()='Service Request Details Report']")
	private WebElement serviceRequestDetailsLink;
	
	public void click_On_serviceRequestDetailsLink() throws InterruptedException
	{
		webUtil.retryingFindClick(serviceRequestDetailsLink);
	}
	
	@FindBy(xpath="//a[text()='Spare Parts Consumption Report']")
	private WebElement sparePartsLink;
	
	public void click_On_SparePartsLink() throws InterruptedException {
		webUtil.retryingFindClick(sparePartsLink);
	}
	
	@FindBy(xpath="//a[text()='Purchase Renewals Report']")
	private WebElement purchaseRenewalsReport;
	
	public void click_On_PurchaseRenewalsReportLink() throws InterruptedException {
		webUtil.retryingFindClick(purchaseRenewalsReport);
	}
	
	
	@FindBy(xpath="//a[text()='Purchase Accessories Report']")
	private WebElement purchaseAccessoriesReport;
	
	public void click_On_PurchaseAccessoriesReportLink() throws InterruptedException {
		webUtil.retryingFindClick(purchaseAccessoriesReport);
	}
	
	
	@FindBy(xpath="//a[text()='Purchase Report - Others']")
	private WebElement purchaseOthersReport;
	
	public void click_On_PurchaseOthersReportLink() throws InterruptedException {
		webUtil.retryingFindClick(purchaseOthersReport);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'From Date')]]/following-sibling::my-date-picker[1]/div/div/input")
	private WebElement fromDate;
	
	public String getTextOfFromDate() {
		return fromDate.getAttribute("value");
	}
	
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
	
}
