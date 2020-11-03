package com.nhance.automation.customerAdminPageFactory;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

@Listeners(Testlistener.class)
public class ProductManagementPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	boolean r1;
	CustomerAdminCommonWebElementInAllPage cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	int i;
	// BusinessFunction bMthd = new BusinessFunction();

	public ProductManagementPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productCatName']//div//span[contains(text(),'Electronics')]")
	private WebElement productCategoryInSelectBox;

	public void selectProductCategory(String productCategoryFromExcel) {
		webUtil.selectByVisibletext(productCategoryInSelectBox, productCategoryFromExcel);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement categorySearch;
	
	public void write_On_Category_Search(String categoryFromExcel) {
	webUtil.retryingWriteText(categorySearch, categoryFromExcel);	
	}
	
	@FindBy(xpath = "//ul[@class='lazyContainer']/li/label")
	private WebElement category;
	//private List<WebElement> listCategory;
	
	public void select_CategoryFromSearch(String categoryFromExcel) throws InterruptedException {
		webUtil.retryingFindClick(category);
	}
	

	public String getThe_Value_Of_selectedProductCategoryInEditPage() {
		
		String optionText = webUtil.getTheTextFromUI(productCategoryInSelectBox);
		//String optionText = webUtil.getFirstSelectionOption(productCategorySelectBox);
		return optionText;
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productCatName']//div[@class='c-btn']")
	private WebElement categoryProduct;
	
	public void click_On_ProductCategory() throws InterruptedException {
		webUtil.retryingFindClick(categoryProduct);
	}
	

	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCatName']//div[@class='c-btn']")
	private WebElement productSubCategory;

	public void click_On_Product_SubCategory() throws InterruptedException {
		webUtil.retryingFindClick(productSubCategory);
	}
	
	/*public void selectProductSubCategory(String productSubCategoryFromExcel) {
		webUtil.selectByVisibletext(productSubCategorySelectBox, productSubCategoryFromExcel);
	}*/

	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCatName']//input[@placeholder='Search']")
	private WebElement subCategorySearch;
	
	public void write_OnSubCategorySearch(String subCategoryFromExcel) {
		webUtil.retryingWriteText(subCategorySearch, subCategoryFromExcel);
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCatName']//div//span")
	private WebElement subCategoryText;
	
	public String getThe_Value_Of_selectProductSubCategoryInEditPage() {
		String optionText = webUtil.getTheTextFromUI(subCategoryText);
		return optionText;
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCatName']//ul[@class='lazyContainer']/li/label")
	private WebElement subCategoryList;
	
	public void select_SubCategoryFromSearch(String categoryFromExcel) throws InterruptedException {
		webUtil.retryingFindClick(subCategoryList);
	}
	
	
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='manufacturerName']//div[@class='c-btn']")
	private WebElement manufacturer;
	
	public void click_On_ProductManufacturer() throws InterruptedException {
		webUtil.retryingFindClick(manufacturer);
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='manufacturerName']//input[@placeholder='Search']")
	private WebElement manufacturerSearch;
	
	public void write_OnManufacturerSearch(String manufacturerFromExcel) {
		webUtil.retryingWriteText(manufacturerSearch, manufacturerFromExcel);
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='manufacturerName']//ul[@class='lazyContainer']/li/label")
	private WebElement manufacturerList;
	
	public void select_ManufacturerFromSearch(String categoryFromExcel) throws InterruptedException {
		webUtil.retryingFindClick(manufacturerList);
	}

	/*@FindBy(xpath = "//ui-selectbox[@formcontrolname='manufacturerName']/select")
	private WebElement manufacturerSelectBox;

	public void selectmanufacturerSelectBox(String manufaturerFromExcel) {
		webUtil.selectByVisibletext(manufacturerSelectBox, manufaturerFromExcel);
	}*/

	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='manufacturerName']//div//span")
	private WebElement manufacturerText;
	
	public String getThe_Value_Of_manufacturerSelectBoxInEditPage() {
		String optionText = webUtil.getTheTextFromUI(manufacturerText);
		return optionText;
	}

	@FindBy(xpath = "//input[@placeholder='Enter Model Number']")
	private WebElement modelNumber_EditBox;

	public void write_On_modelNumber_EditBox(String modelNumberFromExcel) {
		webUtil.retryingWriteText(modelNumber_EditBox, modelNumberFromExcel);
	}

	
	public String getText_Of_modelNumber_EditBox() {
		String modelNumberText = modelNumber_EditBox.getAttribute("value");
		return modelNumberText;
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

	@FindBy(xpath = "//textarea[@class='textArea']")
	private WebElement description_EditBox;

	public void write_On_description_EditBox(String descriptionFromExcel) {
		webUtil.retryingWriteText(description_EditBox, descriptionFromExcel);
	}

	public String getText_Of_description_EditBox() {
		String modelNumberText = description_EditBox.getAttribute("value");
		return modelNumberText;
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Is discoverable')]]/following-sibling::span/ui-label/label")
	private WebElement discoverableText;
	public String getTheTextOfDiscoverableField()
	{
		String text = webUtil.getTheTextFromUI(discoverableText);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Product Image')]]/following-sibling::div/ui-fileupload/span/span/input")
	private WebElement productImage_Attach_Btn;

	public void click_On_productImage_Attach_Btn() throws InterruptedException {
		webUtil.retryingFindClick(productImage_Attach_Btn);
	}
	
	public String getThePlaceholderForProductImageUploadField()
	{
		String productImageUploadPlacehoderText = productImage_Attach_Btn.getAttribute("value");
		return productImageUploadPlacehoderText;
	}

	@FindBy(xpath = "//a[contains(text(),'Documents')]")
	private WebElement documents_Link;

	public void click_documents_Link() throws InterruptedException {
		webUtil.retryingFindClick(documents_Link);
	}

	// First Document row
	
	@FindBy(xpath = "//ui-selectbox[@formcontrolname='documentTypes']/select")
	private WebElement documentTypeSelectBox;

	public void selectdocumentTypeSelectBox(String documentTypeFromExcel) {
		webUtil.selectByVisibletext(documentTypeSelectBox, documentTypeFromExcel);
	}

	public String getThe_Value_Of_documentTypeSelectBoxInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(documentTypeSelectBox);
		return optionText;
	}

	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement documentName_EditBox;

	public void write_On_documentName_EditBox(String documentNameFromExcel) {
		webUtil.retryingWriteText(documentName_EditBox, documentNameFromExcel);
	}

	public String getText_Of_documentName_EditBox() {
		String text = documentName_EditBox.getAttribute("value");
		return text;
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='fileUploadType']/select")
	private WebElement filedetails_SelectBox;

	public void selectfileUploadType_SelectBox(String fileUploadTypeFromExcel) {
		webUtil.selectByVisibletext(filedetails_SelectBox, fileUploadTypeFromExcel);
	}

	public String getThe_Value_Of_FileDetails_SelectBoxInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(filedetails_SelectBox);
		return optionText;
	}

	@FindBy(xpath = "//input[@placeholder='Enter Url']")
	private WebElement enterUrl_EditBox;

	public void write_enterUrl_EditBox(String url_For_Document_FromExcel) {
		webUtil.retryingWriteText(enterUrl_EditBox, url_For_Document_FromExcel);
	}

	public String getTextOf_enterUrl_EditBox() {
		String text = enterUrl_EditBox.getAttribute("value");
		return text;
	}

	@FindBy(xpath = "//thead[tr[th[ui-label[label[contains(text(),'Attach File or URL')]]]]]/following-sibling::tbody/tr/th/ui-fileupload/span/span/input")
	private WebElement attachFile_EditBox_In_DOcument_Section;

	public void click_attachFile_EditBox_and_Browse_The_File_To_Upload(String pathOF_File_to_Upload_For_Document)
			throws InterruptedException, IOException {
		webUtil.retryingFindClick(attachFile_EditBox_In_DOcument_Section);
		webUtil.fileUpload(pathOF_File_to_Upload_For_Document);
	}

	@FindBy(xpath = "//thead[tr[th[ui-label[label[contains(text(),'Attach File or URL')]]]]]/following-sibling::tbody/tr/th/ui-icon/img[@class='delete']")
	private WebElement delete_Icon_In_Document_Section;

	public void click_On_delete_Icon_In_Document_Section() throws InterruptedException {
		webUtil.retryingFindClick(delete_Icon_In_Document_Section);
	}
	
	
	// 2nd Document row
	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/descendant::ui-selectbox[@formcontrolname='documentTypes']/select")
	private WebElement second_documentTypeSelectBox;

	public void select_second_documentTypeSelectBox(String seconddocumentTypeFromExcel) {
		webUtil.selectByVisibletext(second_documentTypeSelectBox, seconddocumentTypeFromExcel);
	}

	public String getThe_Value_Of_second_documentTypeSelectBoxInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(second_documentTypeSelectBox);
		return optionText;
	}
	
	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[1]/descendant::input[@placeholder='Name']")
	private WebElement first_documentName_EditBox;
	public void write_On_first_documentName_EditBox(String documentNameFromExcel) {
		webUtil.retryingWriteText(first_documentName_EditBox, documentNameFromExcel);
	}
	public String getText_Of_first_documentName_EditBox() {
		String text = first_documentName_EditBox.getAttribute("value");
		return text;
	}


	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/descendant::input[@placeholder='Name']")
	private WebElement seocnd_documentName_EditBox;

	public void write_On_seocnd_documentName_EditBox(String documentNameFromExcel) {
		webUtil.retryingWriteText(seocnd_documentName_EditBox, documentNameFromExcel);
	}

	public String getText_Of_seocnd_documentName_EditBox() {
		String text = seocnd_documentName_EditBox.getAttribute("value");
		return text;
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/descendant::ui-selectbox[@formcontrolname='fileUploadType']/select")
	private WebElement second_filedetails_SelectBox;

	public void select_Second_fileUploadType_SelectBox(String fileUploadTypeFromExcel) {
		webUtil.selectByVisibletext(second_filedetails_SelectBox, fileUploadTypeFromExcel);
	}

	public String getThe_Value_Of_Second_FileDetails_SelectBoxInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(second_filedetails_SelectBox);
		return optionText;
	}
	
	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[1]/descendant::input[@placeholder='Enter Url']")
	private WebElement first_enterUrl_EditBox;
	public void write_first_enterUrl_EditBox(String url_For_Document_FromExcel) {
		webUtil.retryingWriteText(first_enterUrl_EditBox, url_For_Document_FromExcel);
	}
	public String getTextOf_first_enterUrl_EditBox() {
		String text = first_enterUrl_EditBox.getAttribute("value");
		return text;
	}


	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/descendant::input[@placeholder='Enter Url']")
	private WebElement second_enterUrl_EditBox;

	public void write_second_enterUrl_EditBox(String url_For_Document_FromExcel) {
		webUtil.retryingWriteText(second_enterUrl_EditBox, url_For_Document_FromExcel);
	}

	public String getTextOf_second_enterUrl_EditBox() {
		String text = second_enterUrl_EditBox.getAttribute("value");
		return text;
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/descendant::tr/th/ui-fileupload/span/span/input")
	private WebElement second_attachFile_EditBox_In_DOcument_Section;

	public void click_Second_attachFile_EditBox_and_Browse_The_File_To_Upload(String pathOF_File_to_Upload_For_Document)
			throws InterruptedException, IOException {
		webUtil.retryingFindClick(second_attachFile_EditBox_In_DOcument_Section);
		webUtil.fileUpload(pathOF_File_to_Upload_For_Document);
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[2]/descendant::img[@class='delete']")
	private WebElement second_delete_Icon_In_Document_Section;

	public void click_On_second_delete_Icon_In_Document_Section() throws InterruptedException {
		webUtil.retryingFindClick(second_delete_Icon_In_Document_Section);
	}

	
	// Third Document row
	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[3]/descendant::ui-selectbox[@formcontrolname='documentTypes']/select")
	private WebElement third_documentTypeSelectBox;

	public void select_third_documentTypeSelectBox(String thirddocumentTypeFromExcel) {
		webUtil.selectByVisibletext(third_documentTypeSelectBox, thirddocumentTypeFromExcel);
	}

	public String getThe_Value_Of_third_documentTypeSelectBoxInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(third_documentTypeSelectBox);
		return optionText;
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[3]/descendant::input[@placeholder='Name']")
	private WebElement third_documentName_EditBox;

	public void write_On_third_documentName_EditBox(String thirddocumentNameFromExcel) {
		webUtil.retryingWriteText(third_documentName_EditBox, thirddocumentNameFromExcel);
	}

	public String getText_Of_third_documentName_EditBox() {
		String text = third_documentName_EditBox.getAttribute("value");
		return text;
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[3]/descendant::ui-selectbox[@formcontrolname='fileUploadType']/select")
	private WebElement third_filedetails_SelectBox;

	public void select_third_fileUploadType_SelectBox(String fileUploadTypeFromExcel) {
		webUtil.selectByVisibletext(third_filedetails_SelectBox, fileUploadTypeFromExcel);
	}

	public String getThe_Value_Of_third_FileDetails_SelectBoxInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(third_filedetails_SelectBox);
		return optionText;
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[3]/descendant::input[@placeholder='Enter Url']")
	private WebElement third_enterUrl_EditBox;

	public void write_third_enterUrl_EditBox(String url_For_Document_FromExcel) {
		webUtil.retryingWriteText(third_enterUrl_EditBox, url_For_Document_FromExcel);
	}

	public String getTextOf_third_enterUrl_EditBox() {
		String text = third_enterUrl_EditBox.getAttribute("value");
		return text;
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[3]/descendant::tr/th/ui-fileupload/span/span/input")
	private WebElement third_attachFile_EditBox_In_DOcument_Section;

	public void click_third_attachFile_EditBox_and_Browse_The_File_To_Upload(String pathOF_File_to_Upload_For_Document)
			throws InterruptedException, IOException {
		webUtil.retryingFindClick(third_attachFile_EditBox_In_DOcument_Section);
		Thread.sleep(1000);
		webUtil.fileUpload(pathOF_File_to_Upload_For_Document);
	}

	@FindBy(xpath = "//table[@formarrayname='documents']/tbody[3]/descendant::img[@class='delete']")
	private WebElement third_delete_Icon_In_Document_Section;

	public void click_On_third_delete_Icon_In_Document_Section() throws InterruptedException {
		webUtil.retryingFindClick(third_delete_Icon_In_Document_Section);
	}
	

	@FindBy(xpath = "//table[@formarrayname='documents']/tfoot/tr/th/ui-icon/img[@class='create']")
	private WebElement plus_Sign_In_Document_Section;

	public void click_On_plus_Sign_In_Document_Section() throws InterruptedException {
		webUtil.retryingFindClick(plus_Sign_In_Document_Section);
	}

	@FindBy(xpath = "//a[contains(text(),'Events')]")
	private WebElement events_Header_Link;

	public void click_On_events_Header_Link() throws InterruptedException {
		webUtil.retryingFindClick(events_Header_Link);
	}

	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	private WebElement title_EditBox;

	public void write_On_title_EditBox(String titleFromExcel) {
		webUtil.retryingWriteText(title_EditBox, titleFromExcel);
	}

	public String getTheText_Of_TitleEditBox_in_Event_Section() {
		String text = title_EditBox.getAttribute("value");
		return text;
	}

	public String getTheText_Of_EventDurationEditBox_in_Event_Section(int i) {
		
		String text = driver.findElement(By.xpath("//table/tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Duration(in Days)']")).getAttribute("value");;
		return text;
	}

	@FindBy(xpath = "//input[@placeholder='Duration(in Days)']")
	private WebElement duration_EditBox;
	public void write_On_Duration_EditBox(String durationFromExcel) {
		webUtil.retryingWriteText(duration_EditBox, durationFromExcel);
	}
	public String getTheText_Of_DurationEditBox_in_Event_Section() {
		String text = duration_EditBox.getAttribute("value");
		return text;
	}
	
	
	public String getTheText_Of_EventMessageEditBox_in_Event_Section(int i) {
		
		String text = driver.findElement(By.xpath("//table/tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Message']")).getAttribute("value");;
		return text;
	}

	@FindBy(xpath = "//input[@placeholder='Message']")
	private WebElement message_EditBox;

	public void write_On_Message_EditBox(String messageFromExcel) {
		webUtil.retryingWriteText(message_EditBox, messageFromExcel);
	}

	public String getTheText_Of_MessageEditBox_in_Event_Section() {
		String text = message_EditBox.getAttribute("value");
		return text;
	}

	@FindBy(xpath = "//input[@placeholder='HH:MM (24 hour)']")
	private WebElement runsAt_EditBox;

	public void write_On_runsAt_EditBox(String runsAtFromExcel) {
		webUtil.retryingWriteText(runsAt_EditBox, runsAtFromExcel);
	}

	public String getTheText_Of_RunsAtEditBox_in_Event_Section() {
		String text = runsAt_EditBox.getAttribute("value");
		return text;
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='scheduleTimeZone']/select")
	private WebElement TimeZone_SelectBox;

	public void select_TimeZone_SelectBox(String timeZoneFromExcel) {
		webUtil.selectByVisibletext(TimeZone_SelectBox, timeZoneFromExcel);
	}

	public String getThe_Value_Of_TimeZone_Select_BoxInvent_Section() {
		String optionText = webUtil.getFirstSelectionOption(TimeZone_SelectBox);
		return optionText;
	}

	@FindBy(xpath = "//a[contains(text(),'Service Charge')]")
	private WebElement serviceCharge_Header_Link;

	public void click_On_Service_Charge_Header_Link() throws InterruptedException {
		webUtil.retryingFindClick(serviceCharge_Header_Link);
	}
	
    public String getTheText_Of_ServiceType_SelectBox_in_Event_Section(int i) {
		
		String text = webUtil.getFirstSelectionOption(driver.findElement(By.xpath("//table/tbody["+i+"]/tr/th/ui-selectbox[@formcontrolname='serviceTypeGuid']/select")));
		return text;
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='serviceTypeGuid']/select")
	private WebElement service_Type_SelectBox;

	public void select_service_Type_SelectBox(String serviceTypeFromExcel) {
		webUtil.selectByVisibletext(service_Type_SelectBox, serviceTypeFromExcel);
	}

	public String getThe_Value_Of_ServiceType_Select_Box_In_ServiceCharge_Section() {
		String optionText = webUtil.getFirstSelectionOption(service_Type_SelectBox);
		return optionText;
	}
	
	public String getTheText_Of_AmountEditBox_in_ServiceCharge_Section(int i) {
		String text = driver.findElement(By.xpath("//table/tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Amount']")).getAttribute("value");;
		return text;
	}
	
	@FindBy(xpath = "//input[@placeholder='Amount']")
	private WebElement amount_EditBox;

	public void write_Amount_EditBox(String amountFromExcel) {
		webUtil.retryingWriteText(amount_EditBox, amountFromExcel);
	}

	public String getTheText_Of_AmountEditBox_in_ServiceCharge_Section() {
		String text = amount_EditBox.getAttribute("value");
		return text;
	}

	// Mandatory Attribute Section
	@FindBy(xpath = "//a[contains(text(),'Mandatory Attributes')]")
	private WebElement mandatoryAttributes_Header_Link;

	public void click_On_mandatoryAttributes_Header_Link() throws InterruptedException {
		webUtil.retryingFindClick(mandatoryAttributes_Header_Link);
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='attributeCode']/select")
	private WebElement attributeCode_SelectBox;

	public void select_attributeCode(String attributeCode) {
		webUtil.selectByVisibletext(attributeCode_SelectBox, attributeCode);
	}

	public String getThe_Value_Of_attributeCode_Select_Box_In_MandatoryAttribute() {
		String optionText = webUtil.getFirstSelectionOption(attributeCode_SelectBox);
		return optionText;
	}

	@FindBy(xpath = "//input[@placeholder='Display Name']")
	private WebElement displayName_EditBox_In_MandatoryAttribute;

	public String getTheText_Of_displayName_EditBox_In_MandatoryAttribute() {
		String text = displayName_EditBox_In_MandatoryAttribute.getAttribute("value");
		return text;
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='attributeDataType']/select")
	private WebElement attributeDataType_SelectBox;

	public String getThe_Value_Of_attributeDataType_SelectBox_In_MandatoryAttribute() {
		String optionText = webUtil.getFirstSelectionOption(attributeDataType_SelectBox);
		return optionText;
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='attributeScope']/select")
	private WebElement attributeScope_SelectBox;
	public void select_attributeScope_SelectBox(String attributeScope)
	{
		webUtil.selectByVisibletext(attributeScope_SelectBox, attributeScope);
	}

	public String getThe_Value_Of_attributeScope_SelectBox_In_MandatoryAttribute() {
		String optionText = webUtil.getFirstSelectionOption(attributeScope_SelectBox);
		return optionText;
	}
	
	@FindBy(xpath="//ui-selectbox[@formcontrolname='attributeDataType']/select")
	private WebElement attributeDataType_selectBox;
	public void select_attributeDataType_selectBoxe(String attributeType) {
		webUtil.selectByVisibletext(attributeDataType_selectBox, attributeType);
	}

	public String getThe_Value_Of_attributeType_Select_Box_In_MandatoryAttribute() {
		String optionText = webUtil.getFirstSelectionOption(attributeDataType_selectBox);
		return optionText;
	}


	// Additional Info Section
	@FindBy(xpath = "//a[contains(text(),'Custom Fields')]")
	private WebElement custom_Header_Link;

	public void click_On_custom_Header_Link() throws InterruptedException {
		webUtil.retryingFindClick(custom_Header_Link);
	}

	@FindBy(xpath = "//input[@placeholder='Property Name']")
	private WebElement propertyName_EditBox;

	public void write_In_PropertyName_EditBox(String propertyNameFromExcel) {
		webUtil.retryingWriteText(propertyName_EditBox, propertyNameFromExcel);
	}
	
	
	public String getTheText_Of_PropertyNameEditBox_in_AdditionalInfo_Section(int i) {
		String text = driver.findElement(By.xpath("//table/tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Property Name']")).getAttribute("value");
		return text;
	}

	public String getTheText_Of_PropertyNameEditBox_in_AdditionalInfo_Section() {
		String text = propertyName_EditBox.getAttribute("value");
		return text;
	}

	public String getThe_Value_Of_dataType_Select_Box_In_AdditionalInfo_Section(int i) {
		String optionText = webUtil.getFirstSelectionOption(driver.findElement(By.xpath("//table/tbody["+i+"]/tr/th/ui-selectbox[@formcontrolname='dataType']/select")));
		return optionText;
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='dataType']/select")
	private WebElement dataType_SelectBox;

	public void select_dataType_SelectBox(String dataTypeFromExcel) {
		webUtil.selectByVisibletext(dataType_SelectBox, dataTypeFromExcel);
	}

	public String getThe_Value_Of_dataType_Select_Box_In_AdditionalInfo_Section() {
		String optionText = webUtil.getFirstSelectionOption(dataType_SelectBox);
		return optionText;
	}
	
	public String getThe_Value_Of_IsMandatory_Select_Box_In_AdditionalInfo_Section(int i) {
		String optionText = webUtil.getFirstSelectionOption(driver.findElement(By.xpath("//table/tbody["+i+"]/tr/th/ui-selectbox[@formcontrolname='isMandatory']/select")));
		return optionText;
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='isMandatory']/select")
	private WebElement isMandatory_SelectBox;

	public void select_IsMandatory_SelectBox(String manadatoryOptionFromExcel) {
		webUtil.selectByVisibletext(isMandatory_SelectBox, manadatoryOptionFromExcel);
	}

	public String getThe_Value_Of_IsMandatory_Select_Box_In_AdditionalInfo_Section() {
		String optionText = webUtil.getFirstSelectionOption(isMandatory_SelectBox);
		return optionText;
	}

	@FindBy(xpath = "//input[@placeholder='Model Number']")
	private WebElement modelNumberSearchEditBox;

	public void write_On_modelNumberSearchEditBox(String modelNumberFromExcel) {
		webUtil.retryingWriteText(modelNumberSearchEditBox, modelNumberFromExcel);
	}

	public void clear_modelNumberSearchEditBox() {
		modelNumberSearchEditBox.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		modelNumberSearchEditBox.sendKeys(Keys.chord(Keys.DELETE));
		modelNumberSearchEditBox.clear();
		
	}

	
	@FindBy(xpath = "//a[text()='Additional Info']")
	private WebElement additional_Info_Link;

	public void click_On_Additional_Info_Link() throws InterruptedException {
	webUtil.retryingFindClick(additional_Info_Link);
	}

	@FindBy(xpath = "//input[@placeholder='Enter Info Url']")
	private WebElement enterInfoUrl;
	
	public void write_On_Enter_Info_Url(String infoUrlFromExcel) {
		webUtil.retryingWriteText(enterInfoUrl, infoUrlFromExcel);
	}
	
	@FindBy(xpath = "//input[@placeholder='Enter Listing Category']")
	private WebElement listingCategory;
	
	public void write_On_Listing_Category(String listingCategoryFromExcel) {
		webUtil.retryingWriteText(listingCategory, listingCategoryFromExcel);
	}
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private WebElement modelNumberInRecordTable;
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	public List<WebElement> listOfmodelNumberInRecordTable;

	public String getTheTextOf_modelNumberInRecordTable() {
		String text = webUtil.getTheTextFromUI(modelNumberInRecordTable);
		return text;
	}

	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[4]/ng2-st-tbody-edit-delete/img[@class='edit']")
	private WebElement edit_Image_link;

	public void click_On_edit_Image_Link() throws InterruptedException {
		webUtil.retryingFindClick(edit_Image_link);
	}
	
	@FindBy(xpath="//table/tbody/tr/td[1]/following-sibling::td[4]/ng2-st-tbody-edit-delete/img[@class='delete']")
	private WebElement delete_Image_link;

	public void click_On_delete_Image_link() throws InterruptedException {
		webUtil.retryingFindClick(delete_Image_link);
	}

	// Inline Search Web Element
	@FindBy(xpath = "//input[@placeholder='Product Category']")
	private WebElement productCategory_Search_Field;

	public void write_On_productCategory_Search_Field(String productCategoryFromExcel) {
		webUtil.retryingWriteText(productCategory_Search_Field, productCategoryFromExcel);
	}

	public void clear_productCategory_Search_Field() {
		productCategory_Search_Field.clear();
	}

	@FindBy(xpath = "//input[@placeholder='Product Subcategory']")
	private WebElement productSubCategory_Search_Field;

	public void write_On_productSubCategory_Search_Field(String productSubCategoryFromExcel) {
		webUtil.retryingWriteText(productSubCategory_Search_Field, productSubCategoryFromExcel);
	}

	public void clear_productSubCategory_Search_Field() {
		productSubCategory_Search_Field.clear();
	}

	@FindBy(xpath = "//input[@placeholder='Product Manufacturer']")
	private WebElement manufacturer_Search_Field;

	public void write_on_Manufacturer_search_Field(String manufacturerFromExcel) {
		webUtil.retryingWriteText(manufacturer_Search_Field, manufacturerFromExcel);
	}

	public void clear_manufacturer_Search_Field() {
		manufacturer_Search_Field.clear();
	}

	@FindBy(xpath = "//span[@class='ui-delete-icon']/i")
	private WebElement delete_Icon_For_attachDocs;

	public void click_On_delete_Icon_For_attachDocs() throws InterruptedException {
		Testlistener.log("Status of delete ICon is : " + delete_Icon_For_attachDocs.isDisplayed());
		// webUtil.retryingFindClick(delete_Icon_For_attachDocs);
		webUtil.click_On_hiddenWebElement(delete_Icon_For_attachDocs);
	}
	

	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> productCategory_List_in_Table;
	
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[2]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> productSubCategory_List_in_Table;
	
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[3]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> manufacturer_List_in_Table;
	
	@FindBy(xpath="//a[contains(text(),'HelpDesk')]")
	private WebElement helpDeskAccordianLink;
	public void click_On_helpDeskAccordianLink() throws InterruptedException
	{
		webUtil.retryingFindClick(helpDeskAccordianLink);
	}
	
	public boolean getTheStatusOfHelpDeskAccordianLink()
	{
		boolean sts =  helpDeskAccordianLink.isDisplayed();
		return sts;
	}
	
	@FindBy(xpath="//a[contains(text(),'Locations')]")
	private WebElement locationAccordianLink;
	public void click_On_locationAccordianLink() throws InterruptedException
	{
		webUtil.retryingFindClick(locationAccordianLink);
	}
	
	public boolean getTheStatusOflocationAccordianLink()
	{
		boolean sts =  locationAccordianLink.isDisplayed();
		return sts;
	}
	
	@FindBy(xpath="//div[a[contains(text(),'HelpDesk')]]/following-sibling::div/div/div/table/tbody[1]/descendant::div[@class='iti-arrow']")
	private WebElement countryFlagArrowIconInHelpDesk;
	
	public void click_On_countryFlagArrowIconInHelpDesk(int i)
	{
		driver.findElement(By.xpath("//div[a[contains(text(),'HelpDesk')]]/following-sibling::div/div/div/table/tbody["+i+"]/descendant::div[@class='iti-arrow']")).click();
	}
	
	public void write_On_HelpDeskMobileNumber_EditBox(String helpDesKNumber, int i)
	{
		driver.findElement(By.xpath("//div[a[contains(text(),'HelpDesk')]]/following-sibling::div/div/div/table/tbody["+i+"]/descendant::div/input[@placeholder='Mobile Number']")).sendKeys(helpDesKNumber);
	}
	
	
	public String getTheTextOf_HelpDeskMobileNumber_EditBox(int i)
	{
		String text = driver.findElement(By.xpath("//div[a[contains(text(),'HelpDesk')]]/following-sibling::div/div/div/table/tbody["+i+"]/descendant::div/input[@placeholder='Mobile Number']")).getAttribute("value");
		return text;
	}

	public void writeTheTextIn_HelpdeskEmail_EditBox(String helpDeskEmail , int i)
	{
		driver.findElement(By.xpath("//div[a[contains(text(),'HelpDesk')]]/following-sibling::div/div/div/table/tbody["+i+"]/tr/th/ui-input-box/input")).sendKeys(helpDeskEmail);
	}
	
	public String getTheTextOf_HelpdeskEmail_EditBox(int i)
	{
		String text = driver.findElement(By.xpath("//div[a[contains(text(),'HelpDesk')]]/following-sibling::div/div/div/table/tbody["+i+"]/tr/th/ui-input-box/input")).getAttribute("value");
		return text;
	}
	
	@FindBy(xpath="//table[@formarrayname='helpdeskModels']/tfoot/tr/th/ui-icon/img[@class='create']")
	private WebElement addIconForHelpdeskField;
	public void click_On_addIconForHelpdeskNumber() throws InterruptedException
	{
		webUtil.retryingFindClick(addIconForHelpdeskField);
	}
	
	@FindBy(xpath="//table[@formarrayname='helpdeskModels']/tbody[2]/descendant::img[@class='delete']")
	private WebElement deleteIconForHelpdeskField;
	
	public void click_On_deleteIconForHelpDeskField(int i)
	{
		driver.findElement(By.xpath("//table[@formarrayname='helpdeskModels']/tbody["+i+"]/descendant::img[@class='delete']")).click();
	}
	
	@FindBy(xpath = "//tbody/tr/th/ngx-intl-tel-input/div/div/ul[@class='country-list dropdown-menu']/li/span[@class='country-name']")
	private List<WebElement> list_of_CountryName;
	
	public void select_Country_From_SelectOption(int i) throws InterruptedException {
		click_On_countryFlagArrowIconInHelpDesk(i);
		Thread.sleep(1000);
		List<WebElement> listOfCountryName = driver.findElements(By.xpath("//tbody["+i+"]/tr/th/ngx-intl-tel-input/div/div/ul[@class='country-list dropdown-menu']/li/span[@class='country-name']"));
		for (int j = 0; j < listOfCountryName.size(); i++) {
		if (listOfCountryName.get(j).getText().trim().equals("India (भारत)".trim())) {
			listOfCountryName.get(j).click();
		break;
		}
		}
		Thread.sleep(1000);
		}
	
	
	public void write_On_location_Latitude_Editbox(String latitude , int i)
	{
		driver.findElement(By.xpath("//tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Latitude']")).sendKeys(latitude);
	}
	
	public String getText_location_Latitude_Editbox( int i)
	{
		String latitude = driver.findElement(By.xpath("//tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Latitude']")).getAttribute("value");
		return latitude;
	}
	
	
	public void write_On_location_Longitude_Editbox(String longitude , int i)
	{
		driver.findElement(By.xpath("//tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Longitude']")).sendKeys(longitude);
	}
	
	public String getText_location_Longitude_Editbox( int i)
	{
		String longitude = driver.findElement(By.xpath("//tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Longitude']")).getAttribute("value");
		return longitude;
	}
	
	public void write_On_location_Address_Editbox(String Address , int i)
	{
		driver.findElement(By.xpath("//tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Address']")).sendKeys(Address);
	}
	
	public String getText_location_Address_Editbox( int i)
	{
		String address = driver.findElement(By.xpath("//tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Address']")).getAttribute("value");
		return address;
	}
	
	@FindBy(xpath="//table[@formarrayname='address']/tfoot/tr/th/ui-icon/img[@class='create']")
	private WebElement addIconForLocationField;
	public void click_On_addIconForLocationField() throws InterruptedException
	{
		webUtil.retryingFindClick(addIconForLocationField);
	}
	
	public void click_On_deleteIconForlocation(int i)
	{
		driver.findElement(By.xpath("//table[@formarrayname='address']/tbody["+i+"]/descendant::img[@class='delete']")).click();
	}
	
	
}
