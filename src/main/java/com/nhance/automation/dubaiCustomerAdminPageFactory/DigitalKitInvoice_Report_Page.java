package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class DigitalKitInvoice_Report_Page {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public DigitalKitInvoice_Report_Page(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Consumer Name']")
	private WebElement conusmerName_Search_EditBox;
	public void write_On_conusmerName_Search_EditBox(String consumerName)
	{
		webUtil.retryingWriteText(conusmerName_Search_EditBox, consumerName);
	}
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	private WebElement mobileNumber_Search_EditBox;
	public void write_On_mobileNumber_Search_EditBox(String mobileNumber)
	{
		webUtil.retryingWriteText(mobileNumber_Search_EditBox, mobileNumber);
	}
	
	@FindBy(xpath="//input[@placeholder='Invoice Date']")
	private WebElement invoiceDate_Search_EditBox;
	public void write_On_invoiceDate_Search_EditBox(String invoiceDate)
	{
		webUtil.retryingWriteText(invoiceDate_Search_EditBox, invoiceDate);
	}
	
	@FindBy(xpath="//input[@placeholder='Invoice Number']")
	private WebElement invoiceNumber_SearchEditBox;
	public void write_On_invoiceNumber_SearchEditBox(String invoiceNumber)
	{
		webUtil.retryingWriteText(invoiceNumber_SearchEditBox, invoiceNumber);
	}
	
	@FindBy(xpath="//select[@class='form-control ng-untouched ng-pristine ng-valid']")
	private WebElement paymentMode_Select_SearchBox;
	public void select_From_paymentMode_Select_SearchBox(String PaymentMode)
	{
		webUtil.selectByVisibletext(paymentMode_Select_SearchBox, PaymentMode);
	}
	
	@FindBy(xpath="//table/tbody/tr/td[1]/descendant::div/div")
	public List<WebElement> listOfConsumerName;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfConsumerMobileNumber;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[2]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfInvoiceDate;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[3]/ng2-smart-table-cell/table-cell-view-mode/div/descendant::a")
	public List<WebElement> listOfInvoiceNumber;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[3]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfPaymentTerms;
	
	
	
	

}
