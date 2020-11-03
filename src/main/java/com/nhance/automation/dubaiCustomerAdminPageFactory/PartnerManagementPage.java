package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class PartnerManagementPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();
	String partnerName_FromUI;
	String partnerMobile_FromUI;

	public PartnerManagementPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Partner Name')]]/following-sibling::ui-input-box/input")
	private WebElement partnerName_editBox;

	public void write_In_partnerName_editBox(String partnerNameFromExcel) {
		webUtil.retryingWriteText(partnerName_editBox, partnerNameFromExcel);
	}

	public String getText_Of_partnerName_editBox() {
		String partnerEditdetails = webUtil.get_Attribut_value(partnerName_editBox);
		return partnerEditdetails;
	}

	@FindBy(xpath = "//ui-label[label[text()='Address']]/following-sibling::div/ui-input-box/input")
	private WebElement address_editBox;

	public void write_In_address_editBox(String addressFromExcel) {
		webUtil.retryingWriteText(address_editBox, addressFromExcel);
	}

	public String getText_Of_address_editBox() {
		String addressEditdetails = webUtil.get_Attribut_value(address_editBox);
		return addressEditdetails;
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Service Offered')]]/following-sibling::ss-multiselect-dropdown/div/button")
	private WebElement serviceOffered_SelectBox_Button;
	public void click_On_serviceOffered_SelectBox_Button() throws InterruptedException
	{
		webUtil.retryingFindClick(serviceOffered_SelectBox_Button);
	}
	
	@FindBy(xpath = "//div[@class='c-btn']")
	private WebElement searchSelect;
	
	public void click_On_Select_Field() throws InterruptedException {
		webUtil.retryingFindClick(searchSelect);
	}
	
	@FindBy(xpath = "//div[@class='list-area']//div//ul//li")
	private List<WebElement> list_of_CheckBox_ServiceOffered;
		
/*	@FindBy(xpath="//ui-label[label[contains(text(),'Service Offered')]]/following-sibling::ss-multiselect-dropdown/div/div/a/span/input")
	private List<WebElement> list_of_CheckBox_ServiceOffered;*/
	
	public void click_on_All_CheckBox_of_ServiceOffered() throws InterruptedException
	{
		int countCheckBox = list_of_CheckBox_ServiceOffered.size();
		System.out.println("The total checkboxed are "+countCheckBox);
		for(int i=0;i<countCheckBox;i++) {
			list_of_CheckBox_ServiceOffered.get(i).click();
		}
	}

	@FindBy(xpath = "//ui-label[label[text()='Email Address']]/following-sibling::ui-input-box/input")
	private WebElement email_Address_editBox;

	public void write_In_email_Address_editBox(String emailaddressFromExcel) {
		webUtil.retryingWriteText(email_Address_editBox, emailaddressFromExcel);
	}

	public String getText_Of_email_Address_editBox() {
		String email_addressEditdetails = webUtil.get_Attribut_value(email_Address_editBox);
		return email_addressEditdetails;
	}
	
	@FindBy(xpath = "//div[@class='iti-arrow']")
	private WebElement country_Select_Arrow_Link;

	@FindBy(xpath = "//ul[@class='country-list dropdown-menu']/li/span[@class='country-name']")
	private List<WebElement> list_of_CountryName;

	public void select_Country_From_SelectOption(String countryName) throws InterruptedException {
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
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Partner Logo')]]/following-sibling::div/ui-fileupload/span /span/input")
	private WebElement partnerLogo_Attach_File_EditBox;
	public void click_On_partnerLogo_Attach_File_EditBox(String partnerLogoAttachPath) throws InterruptedException, IOException
	{
		webUtil.retryingFindClick(partnerLogo_Attach_File_EditBox);
		Thread.sleep(1000);
		webUtil.fileUpload(partnerLogoAttachPath);
	}

	@FindBy(xpath = "//input[@id='phone']")
	private WebElement conatctNumber_EditBox;

	public void write_On_conatctNumber_EditBox(String PartnerConatctNumberFromExcel) {
		webUtil.retryingWriteText(conatctNumber_EditBox, PartnerConatctNumberFromExcel);
	}

	public String getText_of_conatctNumber_EditBox() {
		String text = webUtil.get_Attribut_value(conatctNumber_EditBox);
		return text;
	}

	@FindBy(xpath = "//input[@placeholder= 'Partner Name']")
	private WebElement partner_name_search;

	public void write_In_partnerName_Search(String partnerNameFromExcel) {
		webUtil.retryingWriteText(partner_name_search, partnerNameFromExcel);
	}
	
	@FindBy(xpath = "//table/tbody/tr/td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_Of_PartnerNames;
	public String getThe_first_Data_of_PartnerName(String partnerName_FromExcel)
	{
		for(int i=0;i<list_Of_PartnerNames.size();i++)
		{
			if(list_Of_PartnerNames.get(i).getText().equals(partnerName_FromExcel))
			{
				partnerName_FromUI=list_Of_PartnerNames.get(i).getText();
				break;
			}
		}
		return partnerName_FromUI;
	}
	
	
	@FindBy(xpath = "//table/tbody/tr/td[3]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_Of_PartnerMobileNumber;
	public String getThe_list_Of_PartnerMobileNumber(String mobile_FromExcel)
	{
		for(int i=0;i<list_Of_PartnerMobileNumber.size();i++)
		{
			if(list_Of_PartnerMobileNumber.get(i).getText().equals(mobile_FromExcel))
			{
				partnerMobile_FromUI=list_Of_PartnerMobileNumber.get(i).getText();
				break;
			}
		}
		return partnerMobile_FromUI;
	}

	@FindBy(xpath = "//input[@placeholder='Mobile No.']")
	private WebElement mobileNumber_search;

	public void write_In_mobileNumber_search(String mobileNumberFromExcel) {
		webUtil.retryingWriteText(mobileNumber_search, mobileNumberFromExcel);
	}

	@FindBy(xpath = "//ui-page-title[h1[text()='Partner & Service Offering']]")
	private WebElement partner_service_headertext;

	public String getPartner_service_header() {
		String partner_service_header_Text = webUtil.get_Attribut_value(partner_service_headertext);
		return partner_service_header_Text;
	}

	@FindBy(xpath = "//input[@value= 'Upload Plan']")
	private WebElement uploadPlanButton;

	public void click_on_uploadPlanButton() throws InterruptedException {
		webUtil.retryingFindClick(uploadPlanButton);
	}

	@FindBy(xpath = "//input[@value='Import']")
	private WebElement importButton;

	public void click_on_importPlan() throws InterruptedException {
		webUtil.retryingFindClick(importButton);
	}
	
	@FindBy(xpath="//table/tbody/tr/td[5]/ng2-st-tbody-edit-delete/img[@class='edit']")
	private List<WebElement> list_of_edit_Link;
	@SuppressWarnings("unused")
	public void click_On_first_edit_link() throws InterruptedException
	{
		for(int i=0;i<list_of_edit_Link.size();i++)
		{
			webUtil.retryingFindClick(list_of_edit_Link.get(i));
			break;
		}
	}
	
	@FindBy(xpath="//table/tbody/tr/td[5]/ng2-st-tbody-edit-delete/img[@class='delete']")
	private List<WebElement> list_of_delete_Link;
	@SuppressWarnings("unused")
	public void click_On_first_delete_Link() throws InterruptedException
	{
		for(int i=0;i<list_of_delete_Link.size();i++)
		{
			webUtil.retryingFindClick(list_of_delete_Link.get(i));
			break;
		}
	}

}
