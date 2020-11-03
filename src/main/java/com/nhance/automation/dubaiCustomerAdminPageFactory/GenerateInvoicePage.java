/**
 * 
 */
package com.nhance.automation.dubaiCustomerAdminPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;


/**
 * @author Lopa
 *
 */
public class GenerateInvoicePage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	CustomerAdminCommonWebElementInAllPage cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();

	public GenerateInvoicePage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span/img")
	private WebElement brandLogoImage;
	public boolean getTheStatusOf_BrandImage()
	{
		boolean sts = brandLogoImage.isDisplayed();
		return sts;
	}
	
	@FindBy(xpath="//div[ui-label[label[contains(text(),'Company Name')]]]/following-sibling::span")
	private WebElement companyNameText;
	public String getTheTextOf_companyNameText()
	{
		String text = webUtil.getTheTextFromUI(companyNameText);
		return text;
	}
	
	

	@FindBy(xpath = "//thead[tr[th[span[contains(text(),'Invoice')]]]]/following-sibling::tbody/tr/th/ui-selectbox/select")
	private WebElement attachFileLink_for_GenerateInvoice;

	public void click_On_attachFileLink_for_GenerateInvoice() throws InterruptedException {
		webUtil.retryingFindClick(attachFileLink_for_GenerateInvoice);
	}

	@FindBy(xpath = "//div[contains(text(),'Generate invoice')]")
	private WebElement generateInvoice_PageName;

	public String getText_Of_generateInvoice_PageName() {
		String capture_generateInvoice_PageName = webUtil.getTheTextFromUI(generateInvoice_PageName);
		return capture_generateInvoice_PageName;

	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Business Name')]]/following-sibling::span[1]")
	private WebElement businessName_Text;

	public String getText_Of_businessName_Text() {
		String capture_businessName_Text = webUtil.getTheTextFromUI(businessName_Text);
		return capture_businessName_Text;

	}

	@FindBy(xpath = "//div[ui-label[label[contains(text(),'Invoice Number')]]]/following-sibling::ui-input-box/input")
	private WebElement invoiceNumber_EditBox;

	public void write_In_invoiceNumber_EditBox(String invoiceNumber_From_Excel) {
		webUtil.retryingWriteText(invoiceNumber_EditBox, invoiceNumber_From_Excel);
	}
	public String getTheText_From_InvoiceNumber_EditBox()
	{
		String text=webUtil.get_Attribut_value(invoiceNumber_EditBox);
		return text;
	}

	@FindBy(xpath = "//div[ui-label[label[contains(text(),'Company Address')]]]/following-sibling::ui-textarea/textarea")
	private WebElement companyAddress_EditBox;

	public void write_In_companyAddress_EditBox(String compnayAddress_From_Excel) {
		webUtil.retryingWriteText(companyAddress_EditBox, compnayAddress_From_Excel);
	}

	public String getText_Of_companyAddress_Text() {
		String capture_companyAddress_Text = webUtil.get_Attribut_value(companyAddress_EditBox);
		return capture_companyAddress_Text;

	}

	@FindBy(xpath = "//app-modal/div/div/div/div[@class='modal-body']/div/descendant::my-date-picker/div/div/input")
	private WebElement Date_EditBox;

	public void write_In_Date_EditBox(String Date_From_Excel) {
		webUtil.retryingWriteText(Date_EditBox, Date_From_Excel);
	}

	public String getText_Of_Date_Text() {
		String capture_Date_Text = webUtil.get_Attribut_value(Date_EditBox);
		return capture_Date_Text;

	}

	@FindBy(xpath = "//app-modal/div/div/div/div[@class='modal-body']/div/descendant::my-date-picker/div/div/div/button[@aria-label='Clear Date']/span")
	private WebElement date_ClearButton;

	public void click_On_date_ClearButton() throws InterruptedException {
		webUtil.retryingFindClick(date_ClearButton);
	}

	@FindBy(xpath = "//div[ui-label[label[contains(text(),'Customer Name')]]]/following-sibling::ui-input-box/input")
	private WebElement customerName_EditBox;

	public void write_In_customerName_EditBox(String customerName_From_Excel) {
		webUtil.retryingWriteText(customerName_EditBox, customerName_From_Excel);
	}
	public String getText_Of_customerName_EditBox() {
		String capture_customerName_Text = webUtil.get_Attribut_value(customerName_EditBox);
		return capture_customerName_Text;

	}
	
	
	@FindBy(xpath = "//div[div[ui-label[label[contains(text(),'Customer Mobile')]]]]/span[1]")
	private WebElement customerMobileNumber;
	public String getText_Of_customerMobileNumber_EditBox() {
		String capture_customerMobileNumber_Text = webUtil.getTheTextFromUI(customerMobileNumber);
		return capture_customerMobileNumber_Text;

	}

	@FindBy(xpath = "//div[ui-label[label[contains(text(),'Payment Terms')]]]/following-sibling::ui-selectbox/select")
	private WebElement paymentTerms_SelectBox;

	public void select_From_paymentTerms_SelectBox(String paymentTerms_From_Excel) {
		webUtil.selectByVisibletext(paymentTerms_SelectBox, paymentTerms_From_Excel);
	}

	public String getSelectedText_Of_paymentTerms_SelectBox() {
		String option_Name = webUtil.getFirstSelectionOption(paymentTerms_SelectBox);
		return option_Name;
	}

	@FindBy(xpath = "//div[ui-label[label[contains(text(),'Address Line 1')]]]/following-sibling::ui-textarea[1]/textarea")
	private WebElement customerAddressLine1_EditBox;

	public void write_In_customerAddressLine1_EditBox(String clientAddress_From_Excel) {
		webUtil.retryingWriteText(customerAddressLine1_EditBox, clientAddress_From_Excel);
	}

	public String getText_Of_customerAddressLine1_EditBox() {
		String capture_customerAddressLine1_Text = webUtil.getTheTextFromUI(customerAddressLine1_EditBox);
		return capture_customerAddressLine1_Text;

	}

	@FindBy(xpath = "//table[@formarrayname='digitalKitInvoiceItems']/tbody/tr/th/ui-input-box[@formcontrolname='item']/input")
	private WebElement item_EditBox;

	public void write_In_item_EditBox(String item_From_Excel) {
		webUtil.retryingWriteText(item_EditBox, item_From_Excel);
	}

	public String getText_of_item_EditBox() {
		String item_Value = webUtil.get_Attribut_value(item_EditBox);
		return item_Value;
	}

	@FindBy(xpath = "//table[@formarrayname='digitalKitInvoiceItems']/tbody/tr/th/ui-input-box[@formcontrolname='quantity']/input")
	private WebElement quantity_textBox;

	public String getText_of_quantity_textBox() {
		String quantity_Value = webUtil.get_Attribut_value(quantity_textBox);
		return quantity_Value;
	}

	@FindBy(xpath = "//table[@formarrayname='digitalKitInvoiceItems']/tbody/tr/th/ui-input-box[@formcontrolname='rate']/input")
	private WebElement rate_textBox;

	public void write_In_rate_textBox(String rate_From_Excel) {
		webUtil.retryingWriteText(rate_textBox, rate_From_Excel);
	}

	public String getText_of_rate_textBox() {
		String rate_Value = webUtil.get_Attribut_value(rate_textBox);
		return rate_Value;
	}

	@FindBy(xpath = "//table[@formarrayname='digitalKitInvoiceItems']/tbody/tr/th/ui-selectbox/select")
	private WebElement discount_SelectBox;

	public void select_From_discount_SelectBox(String discount_From_Excel) {
		webUtil.selectByVisibletext(discount_SelectBox, discount_From_Excel);
	}

	public String getSelectedText_Of_discount_SelectBox() {
		String option_Name = webUtil.getFirstSelectionOption(discount_SelectBox);
		return option_Name;
	}

	@FindBy(xpath = "//table[@formarrayname='digitalKitInvoiceItems']/tbody/tr/th/ui-input-box[@formcontrolname='discount']/input")
	private WebElement discount_textBox;

	public void write_In_discount_textBox(String discount_From_Excel) {
		webUtil.retryingWriteText(discount_textBox, discount_From_Excel);
	}

	public String getText_of_discount_textBox() {
		String rate_Value = webUtil.get_Attribut_value(discount_textBox);
		return rate_Value;
	}

	@FindBy(xpath = "//table[@formarrayname='digitalKitInvoiceItems']/tbody/tr/th/ui-input-box[@formcontrolname='amount']/input")
	private WebElement amount_textBox;

	public String getText_of_amount_textBox() {
		String quantity_Value = webUtil.get_Attribut_value(amount_textBox);
		return quantity_Value;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Subtotal')]]/following-sibling::span")
	private WebElement subTotal_Text;

	public String getText_Of_subTotal_Text() {
		String capture_subTotal_Text = webUtil.getTheTextFromUI(subTotal_Text);
		return capture_subTotal_Text;

	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='taxName']//select")
	private WebElement taxNameDropDown;
	
	public void select_For_Vat_Tax_Type(String taxFromExcel) {
		webUtil.selectByVisibletext(taxNameDropDown, taxFromExcel);
	}
	
	public void select_For_Gst_Tax_Type(String taxFromExcel) {
		webUtil.selectByVisibletext(taxNameDropDown, taxFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='tax percent']")
	private WebElement taxValueText;
	
	public void write_Tax_Value(String taxValueFromExcel) {
		webUtil.retryingWriteText(taxValueText, taxValueFromExcel);
	}

	@FindBy(xpath = "//div[@ng-reflect-klass='ui-chkbox-box ui-widget ui-sta']")
	public WebElement taxCheckBox;
	
	public void click_On_CheckBox() throws InterruptedException {
		webUtil.retryingFindClick(taxCheckBox);
	}
	
	@FindBy(xpath="//input[@placeholder='Tax Amount']")
	private WebElement gstTaxAmountBox;
	
		public String get_Text_Of_Tax_Amount_Box() {
			String quantity_Value = webUtil.get_Attribut_value(gstTaxAmountBox);
			return quantity_Value;
		}	

	
	@FindBy(xpath = "//ui-label[label[text()='SGST']]/following-sibling::span")
	private WebElement sgstValueText;
	
	public String get_Text_Of_Sgst_Value() {
		return sgstValueText.getText();
	}
	
	@FindBy(xpath = "//ui-label[label[text()='CGST']]/following-sibling::span")
	private WebElement cgstValueText;
	
	public String get_Text_Of_Cgst_Value() {
		return cgstValueText.getText();
	}
	
	@FindBy(xpath = "//ui-label[label[contains(text(),'Freight Charges')]]/following-sibling::ui-input-box/input")
	public static WebElement freightCharges_EditBox;

	public void write_In_freightCharges_EditBox(String freightCharges_From_Excel) {
		webUtil.retryingWriteText(freightCharges_EditBox, freightCharges_From_Excel);
	}

	public String getText_Of_freightCharges_EditBox() {
		String capture_freightCharges_Text = webUtil.getTheTextFromUI(freightCharges_EditBox);
		return capture_freightCharges_Text;

	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'COD Charges')]]/following-sibling::ui-input-box/input")
	private WebElement CODCharges_EditBox;

	public void write_In_CODCharges_EditBox(String CODCharges_From_Excel) {
		webUtil.retryingWriteText(CODCharges_EditBox, CODCharges_From_Excel);
	}

	public String getText_Of_CODCharges_EditBox() {
		String capture_CODCharges_Text = webUtil.getTheTextFromUI(CODCharges_EditBox);
		return capture_CODCharges_Text;

	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Other Charges')]]/following-sibling::ui-input-box/input")
	private WebElement otherCharges_EditBox;

	public void write_In_otherCharges_EditBox(String otherCharges_From_Excel) {
		webUtil.retryingWriteText(otherCharges_EditBox, otherCharges_From_Excel);
	}

	public String getText_Of_otherCharges_EditBox() {
		String capture_otherCharges_Text = webUtil.getTheTextFromUI(otherCharges_EditBox);
		return capture_otherCharges_Text;

	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='taxName']/select")
	private WebElement tax_SelectBox;

	public void select_From_tax_SelectBox(String tax_From_Excel) {
		webUtil.selectByVisibletext(tax_SelectBox, tax_From_Excel);
	}

	public String getSelectedText_Of_tax_SelectBox() {
		String option_Name = webUtil.getFirstSelectionOption(tax_SelectBox);
		return option_Name;
	}

	@FindBy(xpath = "//ui-selectbox[@formcontrolname='taxMode']/select")
	private WebElement taxMode_SelectBox;

	public void select_From_taxMode_SelectBox(String taxMode_From_Excel) {
		webUtil.selectByVisibletext(taxMode_SelectBox, taxMode_From_Excel);
	}

	public String getSelectedText_Of_taxMode_SelectBox() {
		String option_Name = webUtil.getFirstSelectionOption(taxMode_SelectBox);
		return option_Name;
	}

	@FindBy(xpath = "//ui-input-box[@formcontrolname='taxPercent']/input")
	private WebElement taxPercent_EditBox;

	@FindBy(xpath="//p-autocomplete[@formcontrolname='taxPercent']/span/input")
	private WebElement gstTaxSelectboxText;
	public String getText_Of_gstTaxSelectboxText() {
		String capture_taxPercent_Text = webUtil.get_Attribut_value(gstTaxSelectboxText);
		return capture_taxPercent_Text;

	}
	
	public void write_In_taxPercent_EditBox(String taxPercent_From_Excel) {
		webUtil.retryingWriteText(taxPercent_EditBox, taxPercent_From_Excel);
	}

	public String getText_Of_taxPercent_EditBox() {
		String capture_taxPercent_Text = webUtil.get_Attribut_value(taxPercent_EditBox);
		return capture_taxPercent_Text;

	}

	@FindBy(xpath = "//ui-label[label[text()='Total']]/following-sibling::span")
	private WebElement Total_Text;

	public String getText_Of_Total_Text() {
		String capture_Total_Text = webUtil.getTheTextFromUI(Total_Text);
		return capture_Total_Text;

	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Notes')]]/following-sibling::ui-textarea/textarea")
	private WebElement Notes_EditBox;

	public void write_In_Notes_EditBox(String Notes_From_Excel) {
		webUtil.retryingWriteText(Notes_EditBox, Notes_From_Excel);
	}

	public String getText_Of_Notes_EditBox() {
		String capture_Notes_Text = webUtil.getTheTextFromUI(Notes_EditBox);
		return capture_Notes_Text;

	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Terms')]]/following-sibling::ui-textarea/textarea")
	private WebElement Terms_EditBox;

	public void write_In_Terms_EditBox(String Terms_From_Excel) {
		webUtil.retryingWriteText(Terms_EditBox, Terms_From_Excel);
	}

	public String getText_Of_Terms_EditBox() {
		String capture_Terms_Text = webUtil.getTheTextFromUI(Terms_EditBox);
		return capture_Terms_Text;

	}

	@FindBy(xpath = "//app-modal/div/div/div/div[@class='modal-footer']/div/div/div/ui-button/input[@value='Save']")
	private WebElement saveButton_In_GenerateInvoicePage;

	public void click_On_saveButton_In_GenerateInvoicePage() throws InterruptedException {
		webUtil.retryingFindClick(saveButton_In_GenerateInvoicePage);
	}

	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	private WebElement editButton_For_GenerateInvoice;

	public void click_On_editButton_For_GenerateInvoice() throws InterruptedException {
		webUtil.retryingFindClick(editButton_For_GenerateInvoice);
	}

	@FindBy(xpath = "//span[@class='closeIcon']/i")
	private WebElement closeButton_In_GenerateInvoicePage;

	public void click_On_closeButton_In_GenerateInvoicePage() throws InterruptedException {
		webUtil.retryingFindClick(closeButton_In_GenerateInvoicePage);
	}
	
	@FindBy(xpath="//div[div[contains(text(),'Generate invoice')]]/span/i")
	private WebElement closeIcon_In_InvoicePage;
	public void click_On_closeIcon_In_InvoicePage() throws InterruptedException
	{
		webUtil.retryingFindClick(closeIcon_In_InvoicePage);
	}
	
	@FindBy(xpath = "//ui-label[label[text()='SGST']]/following-sibling::span")
	private WebElement sgstValue;
	
	public String getSgstValue() {
		return sgstValue.getText();
	}
	
	@FindBy(xpath = "//ui-label[label[text()='CGST']]/following-sibling::span")
	private WebElement cgstValue;
	
	public String getCgstValue() {
		return cgstValue.getText();
	}
	
	
	

}
