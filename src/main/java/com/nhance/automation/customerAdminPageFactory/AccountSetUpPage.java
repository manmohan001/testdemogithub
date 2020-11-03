package com.nhance.automation.customerAdminPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class AccountSetUpPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	// BusinessFunction bMthd = new BusinessFunction();

	public AccountSetUpPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Approval required')]]/following-sibling::ui-selectbox/select")
	private WebElement ProductApprovalRequire_Selectbox;

	public void select_From_ProductApprovalRequire_Selectbox(String valueFromExcel) {
		webUtil.selectByVisibletext(ProductApprovalRequire_Selectbox, valueFromExcel);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Service request payment mode')]]/following-sibling::ui-selectbox/select")
	private WebElement serviceRqstPaymntMode_Selectbox;

	public void select_From_serviceRqstPaymntMode_Selectbox(String valueFromExcel) {
		webUtil.selectByVisibletext(serviceRqstPaymntMode_Selectbox, valueFromExcel);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Allow Partial Payment')]]/following-sibling::ui-selectbox/select")
	private WebElement allowPartialPayment_Selectbox;

	public void select_From_allowPartialPayment_Selectbox(String valueFromExcel) {
		webUtil.selectByVisibletext(allowPartialPayment_Selectbox, valueFromExcel);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Round Off')]]/following-sibling::ui-selectbox/select")
	private WebElement roundOff_Selectbox;

	public void select_From_roundOff_Selectbox(String valueFromExcel) {
		webUtil.selectByVisibletext(roundOff_Selectbox, valueFromExcel);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Ecommerce Link')]]/following-sibling::ui-input-box/input")
	private WebElement ecommerce_Link_Editbox;

	public void write_on_ecommerce_Link_EditBox(String ecommerce_Link_FromExcel) {
		webUtil.retryingWriteText(ecommerce_Link_Editbox, ecommerce_Link_FromExcel);
	}

	
	
	public void clear_Ecommerce_Link_EditBox_Field() {
		ecommerce_Link_Editbox.clear();
	}
	
	@FindBy(xpath= "//ui-label[label[contains(text(),'Invoice Pattern')]]/following-sibling::ui-input-box/input")
	private WebElement invoicePattern_EditBox;
	public void write_On_invoicePattern_EditBox(String invoicePatternFromExcel)
	{
		webUtil.retryingWriteText(invoicePattern_EditBox, invoicePatternFromExcel);
	}
	public String getTextOf_InvoicePattern_EditBox()
	{
		String text = webUtil.get_Attribut_value(invoicePattern_EditBox);
		return text;
	}
	
	
	@FindBy(xpath = "//ui-label[label[contains(text(),'Sequence for Invoice')]]/following-sibling::ui-input-box/input")
	private WebElement sequenceForInvoice_EditBox;

	public void write_On_sequenceForInvoice_EditBox(String sequenceForInvoiceFromExcel) {
		webUtil.retryingWriteText(sequenceForInvoice_EditBox, sequenceForInvoiceFromExcel);
	}
	public String getTextOf_sequenceForInvoice_EditBox()
	{
		String text = webUtil.get_Attribut_value(sequenceForInvoice_EditBox);
		return text;
	}
	
	
	@FindBy(xpath = "//ui-selectbox[@ng-reflect-name='allowToShare']//select")
	private WebElement allowToShare;

	public void select_From_allowToShare(String allowToShareFromExcel) {
		webUtil.selectByVisibletext(allowToShare, allowToShareFromExcel);
	}
	
	

	@FindBy(xpath = "//ui-label[label[contains(text(),'Enable Manual Entry for Invoice Number')]]/following-sibling::ui-selectbox/select")
	private WebElement InvoiceNoManualEntry_From_Dropdown;

	public void select_From_InvoiceNoManualEntry_From_Dropdown(String invoiceNumber_From_Excel) {
		webUtil.selectByVisibletext(InvoiceNoManualEntry_From_Dropdown, invoiceNumber_From_Excel);
	}
	public String getTheSelected_Option_For_InvoiceNoManualEntry_From_Dropdown()
	{
		String text = webUtil.getFirstSelectionOption(InvoiceNoManualEntry_From_Dropdown);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Invoice Prefix')]]/following-sibling::ui-input-box/input")
	private WebElement InvoicePrefix_Editbox;

	public void write_on_InvoicePrefix_Editbox(String InvoicePrefix_FromExcel) {
		webUtil.retryingWriteText(InvoicePrefix_Editbox, InvoicePrefix_FromExcel);
	}
	public String getTheTextOf_InvoicePrefix_Editbox()
	{
		String text = webUtil.get_Attribut_value(InvoicePrefix_Editbox);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Invoice Suffix')]]/following-sibling::ui-input-box/input")
	private WebElement InvoiceSuffix_Editbox;

	public void write_on_InvoiceSuffix_Editbox(String InvoiceSuffix_FromExcel) {
		webUtil.retryingWriteText(InvoiceSuffix_Editbox, InvoiceSuffix_FromExcel);
	}
	
	public String getTheTextOf_InvoiceSuffix_Editbox()
	{
		String text = webUtil.get_Attribut_value(InvoiceSuffix_Editbox);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Help Desk Reference')]]/following-sibling::ui-selectbox/select")
	private WebElement helpDeskReferenceSelectBox;

	public void select_From_helpDeskReferenceSelectBox(String helpDeskText) {
		webUtil.selectByVisibletext(helpDeskReferenceSelectBox, helpDeskText);
	}

	public String getThe_Value_Of_selectedHelpDeskReference() {
		String optionText = webUtil.getFirstSelectionOption(helpDeskReferenceSelectBox);
		return optionText;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Location Reference')]]/following-sibling::ui-selectbox/select")
	private WebElement locationReferenceSelectBox;

	public void select_From_locationReferenceSelectBox(String locationPreference) {
		webUtil.selectByVisibletext(locationReferenceSelectBox, locationPreference);
	}

	public String getThe_Value_Of_selectedLocationReference() {
		String optionText = webUtil.getFirstSelectionOption(locationReferenceSelectBox);
		return optionText;
	}
}
