package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ServiceOffering_Page {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();
	String statusText;

	public ServiceOffering_Page(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Service Offering Name')]]/following-sibling::ui-input-box/input")
	private WebElement service_Offering_Name_EditBox;
	public void write_On_service_Offering_Name_EditBox(String serviceOfferingNameFromExcel)
	{
		webUtil.retryingWriteText(service_Offering_Name_EditBox, serviceOfferingNameFromExcel);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Accessories')]]/following-sibling::p-radiobutton[1]/div/div[2]")
	private WebElement accessoriesRadioBtn;
	public void click_On_accessoriesRadioBtn() throws InterruptedException
	{
		webUtil.retryingFindClick(accessoriesRadioBtn);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Others')]]/following-sibling::p-radiobutton[1]/div/div[2]")
	private WebElement othersRadioBtn;
	public void click_On_othersRadioBtn() throws InterruptedException
	{
		webUtil.retryingFindClick(othersRadioBtn);
	}
	
	@FindBy(xpath="//input[@placeholder='Service Offering Name']")
	private WebElement serviceOfferingName_Search_EditBox;
	public void write_On_serviceOfferingName_Search_EditBox(String serviceOfferingNameFromExcel)
	{
		webUtil.retryingWriteText(serviceOfferingName_Search_EditBox, serviceOfferingNameFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Service Offering Type']")
	private WebElement serviceOfferingType_Search_EditBox;
	public void write_On_serviceOfferingType_Search_EditBox(String serviceOfferingTypeFromExcel)
	{
		webUtil.retryingWriteText(serviceOfferingType_Search_EditBox, serviceOfferingTypeFromExcel);
	}
	
	// List of Service Offering Name in record
	@FindBy(xpath="//table/tbody/tr/td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_Of_service_Offering_Name_In_Record_Table;
	public String getTheTextOf_service_Offering_Name_In_Record_Table() {
		String text = webUtil.getTheTextFromUI(list_Of_service_Offering_Name_In_Record_Table.get(0));
		return text;
	}
	
	// List of Service Offering Type in record
	@FindBy(xpath="//table/tbody/tr/td[2]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> lsit_Of_service_Offering_Type_In_Record_Table;
	public String getTheTextOf_service_Offering_Type_In_Record_Table() {
		String text = webUtil.getTheTextFromUI(lsit_Of_service_Offering_Type_In_Record_Table.get(0));
		return text;
	}
	
	// List of Servie Offering Type in Record
	
	// List of Delete ICon
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[2]/ng2-st-tbody-edit-delete/img[@class='delete']")
	public WebElement list_of_ServiceOffering_delete_Icon;

	public void click_On_Delete_ServiceOffering_icon() throws InterruptedException {
		webUtil.retryingFindClick(list_of_ServiceOffering_delete_Icon);
	}

}
