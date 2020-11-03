package com.nhance.automation.customerAdminPageFactory;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class DigitalKitIssued_Report_Page {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	String text;

	public DigitalKitIssued_Report_Page(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Consumer Name']")
	private WebElement consumerName_EditBox_SearchField;
	public void write_On_consumerName_EditBox_SearchField(String consumerName)
	{
		webUtil.retryingWriteText(consumerName_EditBox_SearchField, consumerName);
	}
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	private WebElement mobileNumber_EditBox_SearchField;
	public void write_On_mobileNumber_EditBox_SearchField(String mobileNumber)
	{
		webUtil.retryingWriteText(mobileNumber_EditBox_SearchField, mobileNumber);
	}
	
	@FindBy(xpath="//input[@placeholder='Email Id']")
	private WebElement emailId_EditBox_SearchField;
	public void write_On_emailId_EditBox_SearchField(String emailId)
	{
		webUtil.retryingWriteText(emailId_EditBox_SearchField, emailId);
	}
	
	@FindBy(xpath="//input[@placeholder='Product Category']")
	private WebElement productCategory_EditBox_SearchField;
	public void write_On_productCategory_EditBox_SearchField(String productCategory)
	{
		webUtil.retryingWriteText(productCategory_EditBox_SearchField, productCategory);
	}
	
	@FindBy(xpath="//input[@placeholder='Product Subcategory']")
	private WebElement productSubcategory_EditBox_SearchField;
	public void write_On_productSubcategory_EditBox_SearchField(String productSubcategory)
	{
		webUtil.retryingWriteText(productSubcategory_EditBox_SearchField, productSubcategory);
	}
	
	@FindBy(xpath="//input[@placeholder='Product Manufacturer']")
	private WebElement productManufacturer_EditBox_SearchField;
	public void write_On_productManufacturer_EditBox_SearchField(String productManufacturer)
	{
		webUtil.retryingWriteText(productManufacturer_EditBox_SearchField, productManufacturer);
	}
	
	/*@FindBy(xpath="//input[@placeholder='Model Number']")
	private WebElement mdoelNumber_EditBox_SearchField;
	public void write_On_mdoelNumber_EditBox_SearchField(String modelNumber)
	{
		webUtil.retryingWriteText(mdoelNumber_EditBox_SearchField, modelNumber);
	}
	*/
	
	@FindBy(xpath="//select-filter//select")
	private WebElement status_Product_Details_selectBox;
	public void select_status_Product_Details_selectBox(String status)
	{
	webUtil.selectByVisibletext(status_Product_Details_selectBox, status);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Serial Number']")
	private WebElement serialNumber_EditBox_SearchField;
	public void write_On_serialNumber_EditBox_SearchField(String serialNumber)
	{
		webUtil.retryingWriteText(serialNumber_EditBox_SearchField, serialNumber);
	}
	
	@FindBy(xpath="//input[@placeholder='Warranty Period']")
	private WebElement warrantyPeriod_EditBox_SearchField;
	public void write_On_warrantyPeriod_EditBox_SearchField(String warrantyPeriod)
	{
		webUtil.retryingWriteText(warrantyPeriod_EditBox_SearchField, warrantyPeriod);
	}
	
	@FindBy(xpath="//input[@placeholder='Created Date']")
	private WebElement createdDate_EditBox_SearchField;
	public void write_On_createdDate_EditBox_SearchField(String createdDate)
	{
		webUtil.retryingWriteText(createdDate_EditBox_SearchField, createdDate);
	}
	
	@FindBy(xpath="//input[@placeholder='Purchased Date']")
	private WebElement purchasedDate_EditBox_SearchField;
	public void write_On_purchasedDate_EditBox_SearchField(String purchasedDate)
	{
		webUtil.retryingWriteText(purchasedDate_EditBox_SearchField, purchasedDate);
	}
	
	@FindBy(xpath="//select[@class='form-control ng-untouched ng-pristine ng-valid']")
	private WebElement status_selectBox;
	public void select_status_selectBox(String status)
	{
		webUtil.selectByVisibletext(status_selectBox, status);
	}
	
	
	 @FindBy(xpath="//input[@placeholder='Model Number']")
	 private WebElement mdoelNumber_EditBox_SearchField;
	 public void write_On_modelNumber_EditBox_SearchField(String modelNumber)
	 {
	 webUtil.retryingWriteText(mdoelNumber_EditBox_SearchField, modelNumber);
	 }
	
	@FindBy(xpath="//table/tbody/tr/td[1]/descendant::div/div")
	public List<WebElement> listOfConsumerName;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfConsumerMobileNumber;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[3]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfProductCategory;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[4]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfProductSubCategory;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[5]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfProductManufacturer;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[6]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfProductModelNumber;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[7]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfProductSerialNumber;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[8]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfWarrantyPeriod;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[9]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfCreatedDate;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[10]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfPurchaseDate;
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[11]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> listOfStatus;
	

}
