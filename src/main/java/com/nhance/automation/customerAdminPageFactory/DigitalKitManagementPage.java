package com.nhance.automation.customerAdminPageFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.EnvironmentVariablesForWeb;
import com.nhance.automation.webGenericLibrary.ExcelLibrary;
import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class DigitalKitManagementPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	CustomerAdminCommonWebElementInAllPage cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();
	int i;
	String eventsParameter="";
	ArrayList<Object> finalArray ;

	public DigitalKitManagementPage(WebDriver driver) {
	this.driver = driver;
	// Initialise Elements
	PageFactory.initElements(driver, this);
	}

	// Header Name
	@FindBy(xpath = "//h1")
	private WebElement digitalKit_Managemenet_HeaderText;

	public String getText_Of_digitalKit_Managemenet_HeaderText() {
	String text = webUtil.getTheTextFromUI(digitalKit_Managemenet_HeaderText);
	return text;
	}

	// Model Number Edit Box in Issue Digital Kit
	/*@FindBy(xpath = "//div[angular2-multiselect[@formcontrolname='productModelNumber']]//div[@class='c-btn disabled']//span[1]")
	private WebElement modelNumber_EditBox;*/

	// Method for Model Number Edit Box in Issue Digital Kit
	public void write_On_modelNumber_EditBox(String modelNumberFromExcel) {
	if (modelNumber_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(modelNumber_EditBox, modelNumberFromExcel);
	}
	}

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	private WebElement addButton;

	public void click_On_Add_Button() throws InterruptedException {
	webUtil.retryingFindClick(addButton);
	}
	
	@FindBy(xpath = "//ui-label[label[text()='Product Category']]/following-sibling::div//input[@placeholder='Search']")
	private WebElement categorySearchField;
	
	public void write_On_Category_Search(String categoryFromExcel) {
		webUtil.retryingWriteText(categorySearchField, categoryFromExcel);	
		}
	
	@FindBy(xpath = "//ui-label[label[text()='Product Category']]/following-sibling::div//div//ul//li//label")
	private WebElement categoryList;
	
	public void select_CategoryFromSearch(String categoryFromExcel) throws InterruptedException {
		webUtil.retryingFindClick(categoryList);
	}
	
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCatName']//div[@class = 'list-area']//ul[@class='lazyContainer']/li/label")
	private List<WebElement> subCategoryList;
	
	public void select_SubCategoryFromSearch(String subCategoryFromExcel) {
		for (int j = 0; j < subCategoryList.size(); i++) {
			if (subCategoryList.get(i).getText().trim().equals(subCategoryFromExcel.trim())) {
				subCategoryList.get(i).click();
				break;
			}
		}
	}
	
	// Model Number Edit Box in Issue Digital Kit
	@FindBy(xpath = "//ui-label[label[contains(text(),'Model Number')]]/following-sibling::div//span[contains(text(),'Model Number')]")
	private WebElement modelNumber_EditBox;
	public void click_On_modelNumber_EditBox() throws InterruptedException
	{
	webUtil.retryingFindClick(modelNumber_EditBox);
	}

	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchEditBox;
	public void write_On_searchEditBox(String textFromExcel)
	{
	webUtil.retryingWriteText(searchEditBox, textFromExcel);
	}

	@FindBy(xpath="//ul[@class='lazyContainer']/li")
	private List<WebElement> listOfModelNumber;
	public void click_On_Particular_ModelNumber(String modelNumberFromExcel)
	{
	for(int i=0;i<listOfModelNumber.size();i++)
	{
	if(listOfModelNumber.get(i).getText().trim().contains(modelNumberFromExcel.trim()))
	{
	listOfModelNumber.get(i).click();
	break;
	}
	}
	}
	
	
	
	
	@FindBy(xpath = "//ul[@class='lazyContainer']/li/label")
	private List<WebElement> modelNameTextList;
	
	public void click_On_Selected_ModelName(String manufacturerFromExcel) {
		for(int i=0; i<modelNameTextList.size(); i++) {
			String ModelNameText = modelNameTextList.get(i).getText();
			if(ModelNameText.contains(manufacturerFromExcel)) {
				modelNameTextList.get(i).click();
				break;
			}
		}
	}
	
	@FindBy(xpath = "//p-radiobutton[@formcontrolname='selectedModel']//div//div/following-sibling::div")
	private List<WebElement> radioButtonList;
	
	@FindBy(xpath = "//div[div[text()='Sub Category:']]/div[@class='valueAlign']")
	private List<WebElement> subCategoryTextList;
	
	public void click_On_Particular_ModelName(String subCategoryFromExcel) {
		for(int i=0; i<subCategoryTextList.size(); i++) {
			if(subCategoryTextList.get(i).getText().equals(subCategoryFromExcel)) {
				radioButtonList.get(i).click();
				break;
			}
		}
	}
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submitButton;
	
	public void click_On_Submit_Button() throws InterruptedException {
		webUtil.retryingFindClick(submitButton);
	}
	
	
	// Method to get the text from model Number edit box field
	public String getText_Of_ModelNumber() {
	String text = webUtil.get_Attribut_value(modelNumber_EditBox);
	return text;
	}

	// Model Number in Auto suggest Box
	@FindBy(xpath = "//ul/li[@class='ui-autocomplete-list-item ui-corner-all']/span")
	private WebElement modelNumber_In_AutoSuggest;

	// Method to click on Model Number from Auto suggest box
		public void click_on_modelNumber_In_AutoSuggest(String modelNumberFromExcel, String manufacturerFromExcel) {
			String textFromAutoSuggest = modelNumber_In_AutoSuggest.getText().trim();

			if (textFromAutoSuggest.equals(modelNumberFromExcel+" - "+manufacturerFromExcel)) {
				Testlistener.log("Model Number Captured from Auto Suggest box is : "+ modelNumberFromExcel+" - "+manufacturerFromExcel);
				Testlistener.log("Model Number Matched in Auto Suggest box..");
				modelNumber_In_AutoSuggest.click();
			}
			else
			{ 
				Testlistener.log("Model Number Captured from Auto Suggest box is : "+ modelNumberFromExcel);
				Testlistener.log("Model Number Matched in Auto Suggest box..");
				modelNumber_In_AutoSuggest.click();
		
			}
		}
		
	@FindBy(xpath = "//ui-selectbox[@formcontrolname='productCatName']/select")
	private WebElement productCategorySelectBox;

	public void selectProductCategory(String productCategoryFromExcel) {
	webUtil.selectByVisibletext(productCategorySelectBox, productCategoryFromExcel);
	}

	@FindBy(xpath = "//ui-label[label[text()='Product Category']]/following-sibling::div//div//span//span")
	private WebElement productCategoryText;
	
	public String getThe_Value_Of_selectProductCategoryInEditPage() {
	return productCategoryText.getText();
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='productSubCatName']/select")
	private WebElement productSubCategorySelectBox;

	public void selectProductSubCategory(String productSubCategoryFromExcel) {
	webUtil.selectByVisibletext(productSubCategorySelectBox, productSubCategoryFromExcel);
	}

	@FindBy(xpath = "//ui-label[label[text()='Product Subcategory']]/following-sibling::div[1]//div//span//span")
	private WebElement productSubCategoryText;
	
	public String getThe_Value_Of_selectProductSubCategoryInEditPage() {
	/*String optionText = webUtil.getFirstSelectionOption(productSubCategorySelectBox);
	return optionText;*/
		return productSubCategoryText.getText();
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='manufacturerName']/select")
	private WebElement manufacturerSelectBox;

	public void selectmanufacturerSelectBox(String manufaturerFromExcel) {
	webUtil.selectByVisibletext(manufacturerSelectBox, manufaturerFromExcel);
	}

	@FindBy(xpath = "//ui-label[label[text()='Product Manufacturer']]/following-sibling::div[1]//div//span//span")
	private WebElement productManufacturerText;
	
	public String getThe_Value_Of_manufacturerSelectBoxInEditPage() {
	/*String optionText = webUtil.getFirstSelectionOption(manufacturerSelectBox);
	return optionText;*/
		return productManufacturerText.getText();
	}

	// Serial Number Edit Box
	@FindBy(xpath = "//ui-label[label[contains(text(),'Serial Number')]]/following-sibling::ui-input-box/input")
	private WebElement serialNumber_EditBox;

	// Method for Serial Number Edit Box
	public void write_On_serialNumber_EditBox(String serialNumber) {
	if (serialNumber_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(serialNumber_EditBox, serialNumber);
	}
	}

	// Method to get the text of Serial Number In Edit Page OF DK Issue
	public String getText_Of_SerialNumber_In_EditPage_OF_DKIssue() {
	String serialNumber = serialNumber_EditBox.getAttribute("value");
	return serialNumber;
	}

	@FindBy(xpath = "//input[@placeholder='Enter in months']")
	private WebElement warrantyPeriod_EditBox;

	public void write_On_warrantyPeriod_EditBox(String warrantyPeriodFromExcel) {
	webUtil.retryingWriteText(warrantyPeriod_EditBox, warrantyPeriodFromExcel);
	}

	public String getText_Of_warrantyPeriod_EditBox() {
	String modelNumberText = warrantyPeriod_EditBox.getAttribute("value");
	return modelNumberText;
	}

	// Click on X sysmbol to delete the purchase date
	@FindBy(xpath = "//ui-label[label[contains(text(),'Purchased Date')]]/following-sibling::my-date-picker/descendant::button[@class='btnclear btnclearenabled']/span")
	private WebElement remove_PurchaseDate_Link;

	public void click_On_remove_PurchaseDate_Link() throws InterruptedException {
	webUtil.retryingFindClick(remove_PurchaseDate_Link);
	}

	// Write on purchase date
	@FindBy(xpath = "//ui-label[label[contains(text(),'Purchased Date')]]/following-sibling::my-date-picker/div/div/input")
	private WebElement purchaseDate_Input_EditBox;

	public String write_on_purchaseDate_Input_EditBox() throws EncryptedDocumentException, InvalidFormatException, IOException {
	String date = BusinessFunctionWebSpecific.systemCurrentDate("dd-MM-yyyy");
	webUtil.retryingWriteText(purchaseDate_Input_EditBox, date);
	ExcelLibrary.setExcelData(
	EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
	EnvironmentVariablesForWeb
	.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ISSUE_DIGITAL_KIT_TESTDATA),
	36, 1,date);
	ExcelLibrary.setExcelData(
	EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
	EnvironmentVariablesForWeb
	.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ISSUE_DIGITAL_KIT_TESTDATA),
	38, 1,date);
	return date;
	}

	public String getText_of_purchasedate_EditBox() {
	String text = purchaseDate_Input_EditBox.getAttribute("value");
	return text;
	}

	// Customer Details Header Link
	@FindBy(xpath = "//a[contains(text(),'Consumer Details')]")
	private WebElement consumerDetails_HeaderLink;

	// Method to click on Customer Details Header Link
	public void click_consumerDetails_HeaderLink() throws InterruptedException {
	if (consumerDetails_HeaderLink.isDisplayed()) {
	webUtil.retryingFindClick(consumerDetails_HeaderLink);
	}
	}
	
	@FindBy(xpath = "//ui-label[label[text()='TimeZone']]/following-sibling::ui-label//label")
	private WebElement timeZoneText;
	
	public String getTextOfTimeZone() {
		return timeZoneText.getText();
	}

	// Customer Name Edit Box in Issue Digital Kit
	@FindBy(xpath = "//ui-label[label[contains(text(),'Consumer Name')]]/following-sibling::ui-input-box/input")
	private WebElement consumerNameEditBox;

	// Method for Customer Name Edit Box
	public void write_On_consumerNameEditBox(String consumerName) {
	if (consumerNameEditBox.isDisplayed()) {
	webUtil.retryingWriteText(consumerNameEditBox, consumerName);
	}
	}

	public String getText_of_consumerNameEditBox() {
	String text = webUtil.get_Attribut_value(consumerNameEditBox);
	return text;
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

	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phoneNumber_EditBox;

	public void write_On_PhoneNumber_EditBox(String consumerNumberFromExcel) {
	webUtil.retryingWriteText(phoneNumber_EditBox, consumerNumberFromExcel);
	}

	public String getText_of_phoneNumber_EditBox() {
	String text = webUtil.get_Attribut_value(phoneNumber_EditBox);
	return text;
	}

	// Upload Documents Header Link
	@FindBy(xpath = "//a[contains(text(),'Documents')]")
	private WebElement documents_HeaderLink;

	// Method to click on Upload Documents Header Link
	public void click_On_documents_HeaderLink() throws InterruptedException {
	if (documents_HeaderLink.isDisplayed()) {
	webUtil.retryingFindClick(documents_HeaderLink);
	}
	}

	// Invoice Section

	// Invoice Document Name Edit Box
	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody/tr/th/ui-input-box/input[@placeholder='Name']")
	private WebElement InvoicedocumentName_EditBox;

	// Method to write in Invoice Document Name Edit Box
	public void write_InvoicedocumentName_EditBox(String documentNameFromExcel) {
	if (InvoicedocumentName_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(InvoicedocumentName_EditBox, documentNameFromExcel);
	}
	}

	// Method to get the Value of Invoice Document Name Edit Box
	public String getText_Of_InvoicedocumentName_EditBox() {
	String text = InvoicedocumentName_EditBox.getAttribute("value");
	return text;
	}
	
	public String getText_Of_InvoicedocumentName_EditBox(int i) {
		String text = driver.findElement(By.xpath("//table[@formarrayname='invoices']/tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Name']")).getAttribute("value");
		return text;
		}
	
	

	// select Invoice File Detials Type
	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody/tr/th/ui-selectbox/select")
	private WebElement invoiceFileDetails_selectBox;

	// Method to select the Invoice File Detials Type
	public void select_invoiceFileDetails_selectBox(String fileDetailsFromExcel) {
	if (invoiceFileDetails_selectBox.isDisplayed()) {
	webUtil.selectByVisibletext(invoiceFileDetails_selectBox, fileDetailsFromExcel);
	}
	}

	public String getSelectedText_of_invoiceFileDetails_selectBox() {
	String text = webUtil.getFirstSelectionOption(invoiceFileDetails_selectBox);
	return text;
	}

	// Invoice Attach File EditBox
	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody/tr/th/ui-fileupload/span/span/i")
	private WebElement browseImage_for_InvoiceAttach;

	public void click_on_browseImage_for_InvoiceAttach(String invoiceAttachFilePath)
	throws InterruptedException, IOException {
	webUtil.retryingFindClick(browseImage_for_InvoiceAttach);
	Thread.sleep(1000);
	webUtil.fileUpload(invoiceAttachFilePath);
	}

	// Image file status
	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody/tr/th/ui-fileupload/span/descendant::img[1]")
	private WebElement attachimageFile;

	public boolean get_status_Of_attachimageFile() {
	boolean sts = attachimageFile.isDisplayed();
	return sts;
	}

	// Get the Link of attach file
	public String get_Attribute_of_ImageLink() {
	String linkText = attachimageFile.getAttribute("src");
	return linkText;
	}

	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody/tr/th/ui-input-box/input[@placeholder='Enter Url']")
	private WebElement enterURL_EditBox_for_Invoice;

	public void write_On_enterURL_EditBox_for_Invoice(String enterURLFromExcel) {
	webUtil.retryingWriteText(enterURL_EditBox_for_Invoice, enterURLFromExcel);
	}

	public String getText_Of_enterURL_EditBox_for_Invoice() {
	String text = webUtil.get_Attribut_value(enterURL_EditBox_for_Invoice);
	return text;
	}

	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody/tr/th/ui-icon/img[@class='delete']")
	private WebElement delete_Icon_In_Invoice_Section;

	public void click_On_delete_Icon_In_Invoice_Section() throws InterruptedException {
	webUtil.retryingFindClick(delete_Icon_In_Invoice_Section);
	}

	@FindBy(xpath = "//table[@formarrayname='invoices']/tfoot/tr/th/ui-icon/img")
	private WebElement add_Icon_In_Ivoice_section;

	public void click_On_add_Icon_In_Ivoice_section() throws InterruptedException {
	webUtil.retryingFindClick(add_Icon_In_Ivoice_section);
	}

	// Invoice 2nd Row
	// Invoice Document Name Edit Box
	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody[2]/tr/th/ui-input-box/input[@placeholder='Name']")
	private WebElement InvoicedocumentName_2nd_EditBox;

	// Method to write in Invoice Document Name Edit Box
	public void write_In_InvoicedocumentName_2nd_EditBox(String documentNameFromExcel) {
	if (InvoicedocumentName_2nd_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(InvoicedocumentName_2nd_EditBox, documentNameFromExcel);
	}
	}

	// Method to get the Value of Invoice Document Name Edit Box
	public String getText_Of_InvoicedocumentName_2nd_EditBox() {
	String text = InvoicedocumentName_2nd_EditBox.getAttribute("value");
	return text;
	}

	// select Invoice File Detials Type
	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody[2]/tr/th/ui-selectbox/select")
	private WebElement invoiceFileDetails_2nd_selectBox;

	// Method to select the Invoice File Detials Type
	public void select_invoiceFileDetails_2nd_selectBox(String fileDetailsFromExcel) {
	if (invoiceFileDetails_2nd_selectBox.isDisplayed()) {
	webUtil.selectByVisibletext(invoiceFileDetails_2nd_selectBox, fileDetailsFromExcel);
	}
	}

	public String getSelectedText_of_invoiceFileDetails_2nd_selectBox() {
	String text = webUtil.getFirstSelectionOption(invoiceFileDetails_2nd_selectBox);
	return text;
	}

	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody[2]/tr/th/ui-input-box/input[@placeholder='Enter Url']")
	private WebElement enterURL_2nd_EditBox_for_Invoice;
	
	public void write_On_enterURL_2nd_EditBox_for_Invoice(String enterURLFromExcel) {
	webUtil.retryingWriteText(enterURL_2nd_EditBox_for_Invoice, enterURLFromExcel);
	}

	public String getText_Of_enterURL_2nd_EditBox_for_Invoice() {
	String text = webUtil.get_Attribut_value(enterURL_2nd_EditBox_for_Invoice);
	return text;
	}
	
	public String getText_Of_enterURL_EditBox_for_Invoice(int i) {
		String text = webUtil.get_Attribut_value(driver.findElement(By.xpath("//table[@formarrayname='invoices']/tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Enter Url']")));
		return text;
		}
	
	@FindBy(xpath = "//table[@formarrayname='invoices']/tbody[2]/tr/th/ui-icon/img[@class='delete']")
	private WebElement delete_Icon_In_2nd_Row_Invoice_Section;

	public void click_On_delete_Icon_In_2nd_Row_Invoice_Section() throws InterruptedException {
	webUtil.retryingFindClick(delete_Icon_In_2nd_Row_Invoice_Section);
	}

	// Other Section
	// Other Document Name Edit Box
	@FindBy(xpath = "//table[@formarrayname='documents']/tbody/tr/th/ui-input-box/input[@placeholder='Name']")
	private WebElement otherdocumentName_EditBox;

	// Method to write in Other Document Name Edit Box
	public void write_otherdocumentName_EditBox(String otherdocumentNameFromExcel) {
	if (otherdocumentName_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(otherdocumentName_EditBox, otherdocumentNameFromExcel);
	}
	}

	// Method to get the Value of Other Document Name Edit Box
	public String getTextOf__OtherdocumentName_EditBox() {
	String text = otherdocumentName_EditBox.getAttribute("value");
	return text;
	}
	
	public String getTextOf__OtherdocumentName_EditBox(int i) {
		String text = driver.findElement(By.xpath("//table[@formarrayname='documents']/tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Name']")).getAttribute("value");
		return text;
		}

	// select Invoice File Detials Type
	@FindBy(xpath = "//table[@formarrayname='documents']/tbody/tr/th/ui-selectbox/select")
	private WebElement otherFileDetails_selectBox;

	// Method to select the Other File Detials Type
	public void select_otherFileDetails_selectBox(String otherfileDetailsFromExcel) {
	if (otherFileDetails_selectBox.isDisplayed()) {
	webUtil.selectByVisibletext(otherFileDetails_selectBox, otherfileDetailsFromExcel);
	}
	}

	public String getSelectedText_of_OtherFileDetails_selectBox() {
	String text = webUtil.getFirstSelectionOption(otherFileDetails_selectBox);
	return text;
	}

	// Other Attach File EditBox

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody/tr/th/ui-fileupload/span/span/i")
	private WebElement browseImage_for_OtherDocumentAttach;

	public void click_on_browseImage_for_OtherDocumentAttach(String otherDocumentAttachFilePath)
	throws InterruptedException, IOException {
	webUtil.retryingFindClick(browseImage_for_OtherDocumentAttach);
	Thread.sleep(1000);
	webUtil.fileUpload(otherDocumentAttachFilePath);
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody/tr/th/ui-input-box/input[@placeholder='Enter Url']")
	private WebElement enterURL_EditBox_for_Other;

	public void write_On_enterURL_EditBox_for_Other(String otherDocumentURLFromExcel) {
	webUtil.retryingWriteText(enterURL_EditBox_for_Other, otherDocumentURLFromExcel);
	}

	public String getText_Of_enterURL_EditBox_for_Other() {
	String text = webUtil.get_Attribut_value(enterURL_EditBox_for_Other);
	return text;
	}
	
	public String getText_Of_enterURL_EditBox_for_Other( int i) {
		String text = webUtil.get_Attribut_value(driver.findElement(By.xpath("//table[@formarrayname='documents']/tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Enter Url']")));
		return text;
		}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody/tr/th/ui-icon/img[@class='delete']")
	private WebElement delete_Icon_In_otherDocument_Section;

	public void click_On_delete_Icon_In_otherDocument_Section() throws InterruptedException {
	webUtil.retryingFindClick(delete_Icon_In_otherDocument_Section);
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tfoot/tr/th/ui-icon/img")
	private WebElement add_Icon_In_otherDocument_Section;

	public void click_On_add_Icon_In_otherDocument_Section() throws InterruptedException {
	webUtil.retryingFindClick(add_Icon_In_otherDocument_Section);
	}

	// 2nd Row Other Document
	// Other Document Name Edit Box
	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/tr/th/ui-input-box/input[@placeholder='Name']")
	private WebElement otherdocumentName_2nd_EditBox;

	// Method to write in Other Document Name Edit Box
	public void write_In_otherdocumentName_2nd_EditBox(String otherdocumentNameFromExcel) {
	if (otherdocumentName_2nd_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(otherdocumentName_2nd_EditBox, otherdocumentNameFromExcel);
	}
	}

	// Method to get the Value of Other Document Name Edit Box
	public String getTextOf_otherdocumentName_2nd_EditBox() {
	String text = otherdocumentName_2nd_EditBox.getAttribute("value");
	return text;
	}

	// select Invoice File Detials Type
	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/tr/th/ui-selectbox/select")
	private WebElement otherFileDetails_2nd_selectBox;

	// Method to select the Other File Detials Type
	public void select_otherFileDetails_2nd_selectBox(String otherfileDetailsFromExcel) {
	if (otherFileDetails_2nd_selectBox.isDisplayed()) {
	webUtil.selectByVisibletext(otherFileDetails_2nd_selectBox, otherfileDetailsFromExcel);
	}
	}

	public String getSelectedText_of_otherFileDetails_2nd_selectBox() {
	String text = webUtil.getFirstSelectionOption(otherFileDetails_2nd_selectBox);
	return text;
	}

	// Other Attach File EditBox

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/tr/th/ui-fileupload/span/span/i")
	private WebElement browseImage_for_2nd_OtherDocumentAttach;

	public void click_on_browseImage_for_2nd_OtherDocumentAttach(String otherDocumentAttachFilePath)
	throws InterruptedException, IOException {
	webUtil.retryingFindClick(browseImage_for_2nd_OtherDocumentAttach);
	Thread.sleep(1000);
	webUtil.fileUpload(otherDocumentAttachFilePath);
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/tr/th/ui-input-box/input[@placeholder='Enter Url']")
	private WebElement enterURL_2nd_EditBox_for_Other;

	public void write_On_enterURL_2nd_EditBox_for_Other(String otherDocumentURLFromExcel) {
	webUtil.retryingWriteText(enterURL_2nd_EditBox_for_Other, otherDocumentURLFromExcel);
	}

	public String getText_Of_enterURL_2nd_EditBox_for_Other() {
	String text = webUtil.get_Attribut_value(enterURL_2nd_EditBox_for_Other);
	return text;
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/tr/th/ui-icon/img[@class='delete']")
	private WebElement delete_Icon_In_2nd_otherDocument_Section;

	public void click_On_delete_Icon_In_2nd_otherDocument_Section() throws InterruptedException {
	webUtil.retryingFindClick(delete_Icon_In_2nd_otherDocument_Section);
	}

	// Image file status
	@FindBy(xpath = "//table[@formarrayname='documents']/tbody/tr/th/ui-fileupload/span/descendant::img[1]")
	private WebElement attachimageFile_in_Other;

	public boolean get_status_Of_attachimageFile_in_Other() {
	boolean sts = attachimageFile_in_Other.isDisplayed();
	return sts;
	}

	// Get the Link of attach file
	public String get_Attribute_of_ImageLink_In_Other() {
	String linkText = attachimageFile_in_Other.getAttribute("src");
	return linkText;
	}

	// Sales Details Section

	// Sales Details Header Link
	@FindBy(xpath = "//a[contains(text(),'Sales Details')]")
	private WebElement salesDetails_HeaderLink;

	// Method to click on Sales Details Header Link
	public void click_On_saleDetails_HeaderLink() throws InterruptedException {
	if (salesDetails_HeaderLink.isDisplayed()) {
	webUtil.retryingFindClick(salesDetails_HeaderLink);
	}
	}

	// Amount Edit Box
	@FindBy(xpath = "//ui-label[label[contains(text(),'Product Value')]]/following-sibling::ui-input-box/input")
	private WebElement amount_EditBox;

	// Method to write on Amount Edit Box
	public void write_On_Amount_EditBox(String amountFromExcel) {
	if (amount_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(amount_EditBox, amountFromExcel);
	}
	}
	
	// Net Paid Edit Bbox
	@FindBy(xpath="//ui-label[label[contains(text(),'Amount Paid')]]/following-sibling::div/span")
	private WebElement netPaid_EditBox;
	public String getTheText_Of_netPaid_EditBox()
	{
	String text = netPaid_EditBox.getText();
	return text;
	}

	// Method to get Text of Amount text field
	public String getText_Of_amount_EditBox() {
	String text = webUtil.get_Attribut_value(amount_EditBox);
	return text;
	}

	// Additional Fields Section
	@FindBy(xpath = "//a[contains(text(),'Custom Fields')]")
	private WebElement additionalFields_Header_Link;

	public void click_On_additionalFields_Header_Link() throws InterruptedException {
	webUtil.retryingFindClick(additionalFields_Header_Link);
	}
	
	
			@FindBy(xpath = "//tbody[1]/tr/th/ui-input-box[@formcontrolname='propertyName']/input")
	private WebElement fieldNametextBox;

	public void write_On_FieldNameTextBox(String fieldNameFromExcel) throws InterruptedException {
		webUtil.retryingWriteText(fieldNametextBox, fieldNameFromExcel);
	}
		
	
	@FindBy(xpath="//table[@formarrayname='additionalAttributeConfigs']/tfoot/descendant::img[@class='create']")
	private WebElement addSign_In_AdditionalField;
	public void click_On_addSign_In_AdditionalField() throws InterruptedException
	{
	webUtil.retryingFindClick(addSign_In_AdditionalField);
	}
	
	@FindBy(xpath="//tbody[1]/tr/th/ui-input-box[@formcontrolname='propertyValue']/input")
	private WebElement first_fieldValue_EditBox;

	public void write_On_first_fieldValue_EditBox(String firstfieldValueFromExcel) {
	webUtil.retryingWriteText(first_fieldValue_EditBox, firstfieldValueFromExcel);
	}

	public void moveMouseToFirstFieldValue()
	{
		Actions act = new Actions(driver);
		act.moveToElement(first_fieldValue_EditBox).build().perform();
	}
	
	@FindBy(css=".ui-tooltip")
	private WebElement toolTipTextForFirstFieldValue;
	public String getTheTextOfToolTipOfFirstFieldValue()
	{
		String tooltipText = toolTipTextForFirstFieldValue.getText();
		return tooltipText;
	}

	@FindBy(xpath = "//p-accordiontab[@header='Custom Fields']//tbody//th[3]//input[@placeholder='Select date']")
	private WebElement selectDateForMandatory;
	
	public String write_Date_For_MandatoryField() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String date = BusinessFunctionWebSpecific.systemCurrentDate("dd-MM-yyyy");
		webUtil.retryingWriteText(selectDateForMandatory, date);
		ExcelLibrary.setExcelData(
		EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
		EnvironmentVariablesForWeb
		.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ISSUE_DIGITAL_KIT_TESTDATA),
		36, 1,date);
		ExcelLibrary.setExcelData(
		EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
		EnvironmentVariablesForWeb
		.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ISSUE_DIGITAL_KIT_TESTDATA),
		38, 1,date);
		return date;
		}
	
	public void moveMouseToselectDateMandatory()
	{
		Actions act = new Actions(driver);
		act.moveToElement(selectDateForMandatory).build().perform();
	}
	
	@FindBy(css=".ui-tooltip")
	private WebElement toolTipTextForSelectDateForMandatory;
	public String getTheTextOfToolTipOfSelectDateForMandatory()
	{
		String tooltipText = toolTipTextForSelectDateForMandatory.getText();
		return tooltipText;
	}
	
	// Field Name Edit Box
	@FindBy(xpath = "//tbody[1]/tr/th/ui-input-box[@formcontrolname='propertyName']/input")
	private WebElement second_fieldName_EditBox;
	
	
	
	
	@FindBy(xpath = "//tbody[2]/tr/th/ui-input-box[@formcontrolname='propertyName']/input")
	private WebElement secondFieldNameEdit_Box;

	public void write_On_second_fieldName_EditBox(String secondfieldNameFromExcel) {
	webUtil.retryingWriteText(secondFieldNameEdit_Box, secondfieldNameFromExcel);
	}

	public String getText_Of_second_fieldName_EditBox() {
	String text = webUtil.get_Attribut_value(second_fieldName_EditBox);
	return text;
	}
	
	@FindBy(xpath="//tbody[2]/tr/th/ui-selectbox[@formcontrolname='dataType']/select")
	private WebElement second_DataType_SelectBox;
	public void select_second_DataType_In_CustomField(String dataTypeFromExcel)
	{
	webUtil.selectByVisibletext(second_DataType_SelectBox, dataTypeFromExcel);
	}
	
	public String get_SelectedText_Of_Second_SelectBox_Value()
	{
	String text = webUtil.getFirstSelectionOption(second_DataType_SelectBox);
	return text;
	}

	// Field Value Edit Box
	@FindBy(xpath = "//tbody[2]/tr/th/ui-input-box[@formcontrolname='propertyValue']/input")
	private WebElement second_fieldValue_EditBox;

	public void write_On_second_fieldValue_EditBox(String second_fieldValueFromExcel) {
	webUtil.retryingWriteText(second_fieldValue_EditBox, second_fieldValueFromExcel);
	}

	public String getText_Of_second_fieldValue_EditBox() {
	String text = webUtil.get_Attribut_value(second_fieldValue_EditBox);
	return text;
	}

	// DK Code Search Edit Box
	@FindBy(xpath = "//input[@placeholder='DK code']")
	private WebElement dkCode_searchEditBox;

	public void write_dkCode_searchEditBox(String dkCodeFromDB) {
	if (dkCode_searchEditBox.isDisplayed()) {
	webUtil.retryingWriteText(dkCode_searchEditBox, dkCodeFromDB);
	}
	}
	
	
	String textOfList;
	
	@FindBy(xpath="//table/tbody/tr/td[1]//div//div")
	public List<WebElement> listOfDKCode;

	@SuppressWarnings("unused")
	public String getTheTextOfDKCodeInRecordTable() {
	for(int i=0;i<listOfDKCode.size();i++)
	{
	textOfList = listOfDKCode.get(i).getText();
	break;
	}
	return textOfList;
	}

	String textOfModeName ;
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Model Number')]]/following-sibling::div//span/span")
	private WebElement modelNumberTextField;
	// Method to get the text from model Number edit box field
	public String getText_Of_ModelNumber_In_Box() {

		/*String textOfModeName = webUtil.get_Attribut_value(modelNumberTextField);
		return textOfModeName;*/
		
	String textN = modelNumberTextField.getAttribute("value");
	if(textN==null)
	{
		textOfModeName = modelNumberTextField.getText();
	}
	return textOfModeName;
	}
	
	

	// Manufacturer Search Edit Box
	@FindBy(xpath = "//input[@placeholder='Product Manufacturer']")
	private WebElement manufatcurer_Search_EditBox;

	public void write_manufatcurer_Search_EditBox(String manufacturerFromExcel) {
	if (manufatcurer_Search_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(manufatcurer_Search_EditBox, manufacturerFromExcel);
	}
	}

	// Model Number Search Edit Box
	@FindBy(xpath = "//input[@placeholder='Model Number']")
	private WebElement modelNumber_Search_EditBox;

	public void write_modelNumber_Search_EditBox(String modelNumberFromExcel) {
	if (modelNumber_Search_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(modelNumber_Search_EditBox, modelNumberFromExcel);
	}
	}
	
	
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[7]/ng2-st-tbody-edit-delete/img[@class='edit']")
	private List<WebElement> list_of_Edit_Details;

	public void click_Edit_DetailPage() {
	for(int i=0;i<list_of_Edit_Details.size();i++)
	{
	list_of_Edit_Details.get(i).click();
	break;
	}
	}

	// customerName Search Edit Box
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement consumerName_Search_EditBox;

	public void write_customerName_Search_EditBox(String customerNameFromExcel) {
	if (consumerName_Search_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(consumerName_Search_EditBox, customerNameFromExcel);
	}
	}
	
	// Consumer Mobile Number Search filed
	@FindBy(xpath="//input[@placeholder='Mobile No.']")
	private WebElement consumerMobileNumber_Search_EditBox;

	public void write_on_consumerMobileNumber_Search_EditBox(String consumerMobileNumber) {
	if (consumerMobileNumber_Search_EditBox.isDisplayed()) {
	webUtil.retryingWriteText(consumerMobileNumber_Search_EditBox, consumerMobileNumber);
	}
	}

	// Status Select Box
	@FindBy(xpath = "//select[@class='form-control ng-untouched ng-pristine ng-valid']")
	private WebElement status_SelectBox;

	public void select_From_status_SelectBox(String statusText) {
	webUtil.selectByVisibletext(status_SelectBox, statusText);
	}

	// List of DK Code
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	public WebElement dkCode_InTable;

	public String getText_of_dkCode_InTable() {
	String dkCode = webUtil.getTheTextFromUI(dkCode_InTable);
	return dkCode;
	}

	// List of Manufacturer
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_Of_Manufacturer;

	// List Model Number
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[2]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_of_ModelNumber;

	// List Customer Name
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[3]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_of_ConsumerName;
	
	// List of Consumer Mobile Number
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[4]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_of_ConsumerMobileNumber;

	// List of Status
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[6]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_of_Status;

	// List of Edit Icon
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[7]/ng2-st-tbody-edit-delete/img[@class='edit']")
	private WebElement list_of_Edit_Icon;

	public void click_On_Edit_DK_Icon() throws InterruptedException {
	webUtil.retryingFindClick(list_of_Edit_Icon);
	}

	// List of Delete ICon
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[7]/ng2-st-tbody-edit-delete/img[@class='delete']")
	public WebElement list_of_delete_Icon;

	public void click_On_Delete_DK_icon() throws InterruptedException {
	webUtil.retryingFindClick(list_of_delete_Icon);
	}
	
	// Event section Header Link
	@FindBy(xpath="//a[contains(text(),'Events')]")
	private WebElement events_Header_Link;
	public boolean status_of_EventHeader_link()
	{
	boolean sts=events_Header_Link.isDisplayed();
	return sts;	
	}
	public void click_Events_HeaderLink() throws InterruptedException
	{
	if(events_Header_Link.isDisplayed())
	{
	webUtil.retryingFindClick(events_Header_Link);
	}
	}
	
	@FindBy(xpath = "//table[@formarrayname='scheduleConfigs']/tbody/tr/th[2]/ui-label/label")
	private WebElement eventDateText;
	
	public String getEventDateText() {
		return eventDateText.getText();
	}

	
	// List of Event details
	@FindBy(xpath="//table[@formarrayname='scheduleConfigs']/tbody/tr")
	private List<WebElement> list_of_Schedule_Events;
	@FindBy(xpath="//table[@formarrayname='scheduleConfigs']/tbody/tr/th/ui-label/label")
	private List<WebElement> list_of_Schedule_Events_Parameter;
	public String getText_Of_Scheduled_Events()
	{
	Testlistener.log("The Total Number Scheduled Events in DK Edit apge is : "+ list_of_Schedule_Events.size());
	Testlistener.log("Scheduled Events list are : ");
	for(i=0;i<list_of_Schedule_Events_Parameter.size();i++)
	{
	eventsParameter += list_of_Schedule_Events_Parameter.get(i).getText()+" ";
	}
	return  eventsParameter +"\n";
	}

	public ArrayList<Object> getTheAllScheduledEvents()
	{
		finalArray  = new ArrayList<>();
		for(int i =0;i<list_of_Schedule_Events.size();i++)
		{
			eventsParameter = list_of_Schedule_Events.get(i).getText();
			System.out.println(eventsParameter);
			finalArray.add(eventsParameter.trim());
		}
		
		System.out.println("The Final List of Events are :::  ");
		System.out.println(finalArray);
		return finalArray;
	}
	
	String text;
	
	
	/*@FindBy(xpath="//table/tbody/tr/td[1]//div//div")
	public List<WebElement> listOfDKCode;

	@SuppressWarnings("unused")
	public String getTheTextOfDKCodeInRecordTable() {
		for(int i=0;i<listOfDKCode.size();i++)
		{
			text = listOfDKCode.get(i).getText();
			break;
		}
		return text;
	}*/
	
	@FindBy(xpath = "//form/app-modal[2]//div[@class='modal-dialog']")
	public WebElement modelBox;
	
	public boolean verify_Model_Box_Display() {
		boolean rt = modelBox.isDisplayed();
		if(rt) {
			return rt;
		}
		return false;
	}
	
	

}
