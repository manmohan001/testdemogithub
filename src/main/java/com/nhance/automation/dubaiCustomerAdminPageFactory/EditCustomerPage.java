package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class EditCustomerPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public EditCustomerPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement editCustomerLink;
	
	public void click_On_Edit_Custoomer_Link() throws InterruptedException {
		webUtil.retryingFindClick(editCustomerLink);
	}
	
	
@FindBy(xpath="//ui-label[label[contains(text(),'Customer Name')]]/following-sibling::div/ui-input-box/input[@placeholder='Customer Name']")
	WebElement customerName;

public void write_Customer_Name(String customerNameFromExcel) {
	webUtil.retryingWriteText(customerName, customerNameFromExcel);
}


@FindBy(xpath="//ui-label[label[contains(text(),'Customer Name')]]/following-sibling::div/ui-input-box/input[@placeholder='']")
WebElement customerTypeEditBox;

public void get_Text_Of_CustomerBrand() {
	webUtil.get_Attribut_value(customerTypeEditBox);
}

public String getAttributeOfCustomerTypeEditBox()
{
	String text = customerTypeEditBox.getAttribute("value");
	return text;
}


@FindBy(xpath="//ui-label[label[text()='Manufacturer Logo']]/following-sibling::div//span[@class='ui-delete-icon']")
WebElement deleteManufacturerLogo;

public void click_On_Delete_Manufacturer_Logo() throws InterruptedException {
	webUtil.retryingFindClick(deleteManufacturerLogo);
}


@FindBy(xpath="//ui-label[label[text()='Industry']]/following-sibling::div//select")
WebElement industryEditBox;

public void get_Text_Of_IndustryEditBox() {
	webUtil.get_Attribut_value(industryEditBox);
}

public String getAttributeOfIndustryEditBox()
{
	String text = industryEditBox.getAttribute("value");
	return text;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Country')]]/following-sibling::div/ui-selectbox/select")
private WebElement country_SelectBox;

public void select_From_country_SelectBox(String country_Captured_FromExcel) {
	webUtil.selectByVisibletext(country_SelectBox, country_Captured_FromExcel);
}

public String getSelectedText_Of_country_SelectBox() {
	String option_Name_For_country = webUtil.getFirstSelectionOption(country_SelectBox);
	return option_Name_For_country;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Currency')]]/following-sibling::div/ui-selectbox/select")
private WebElement currency_SelectBox;

public void select_From_currency_SelectBox(String currency_Captured_FromExcel) {
	webUtil.selectByVisibletext(currency_SelectBox, currency_Captured_FromExcel);
}
public String getSelectedText_Of_currency_SelectBox() {
	String option_Name_For_currency = webUtil.getFirstSelectionOption(currency_SelectBox);
	return option_Name_For_currency;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Contact Person')]]/following-sibling::div/ui-input-box/input")
private WebElement contactPerson_EditBox;

public void write_In_contactPerson_EditBox(String contactPerson_FromExcel) {
	webUtil.retryingWriteText(contactPerson_EditBox, contactPerson_FromExcel);
}

public String getText_of_contactPerson_EditBox() {
	String text = webUtil.get_Attribut_value(contactPerson_EditBox);
	return text;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Contact Number')]]/following-sibling::div/ngx-intl-tel-input/div/div/div/div[@class='iti-flag in']")
private WebElement countryCodeSelector_Dropdown_In_MobileNumber;

public void click_On_countryCodeSelector_Dropdown_In_MobileNumber() throws InterruptedException {
	webUtil.retryingFindClick(countryCodeSelector_Dropdown_In_MobileNumber);
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Contact Number')]]/following-sibling::div/ngx-intl-tel-input/div/input")
private WebElement contactNumber_EditBox;

public void write_In_contactNumber_EditBox(String contactNumber_FromExcel) {
	webUtil.retryingWriteText(contactNumber_EditBox, contactNumber_FromExcel);
}

public String getText_of_contactNumber_EditBox() {
	String text = webUtil.get_Attribut_value(contactNumber_EditBox);
	return text;
}

@FindBy(xpath="//ui-label[label[contains(text(),'Sample Invoice')]]/following-sibling::div[@formgroupname='sampleInvoice']//span//input[@value='Attach File']")
private WebElement sampleInvoiceAttachedField;
public void attachTheSampleInvoice(String FilePathToUpload) throws IOException, InterruptedException
{
	webUtil.retryingFindClick(sampleInvoiceAttachedField);
	Thread.sleep(1000);
	webUtil.fileUpload(FilePathToUpload);
}

@FindBy(xpath="//div[ui-label[label[text()='Sample Invoice']]]//div//img[@class='ui-tinyimage']")
private WebElement sampleInvoiceImage;

public String check_Sample_Invoice_Image() {
	String image = webUtil.get_Attribut_value(sampleInvoiceImage);
	return image;
	
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Manufacturer Logo')]]/following-sibling::div/ui-fileupload/span/span/i")
private WebElement manufacturerLogoField;

public void attachTheManufacturerLogo(String FilePathToUpload) throws InterruptedException, IOException {
	webUtil.retryingFindClick(manufacturerLogoField);
	Thread.sleep(1000);
	webUtil.fileUpload(FilePathToUpload);
}

@FindBy(xpath="//i[@class='fa fa-times']")
private WebElement delete_Icon_in_BrandLogo;

public boolean get_The_Status_of_Delete_icon_In_Brand_Logo() throws InterruptedException
{
	webUtil.mouseOver(brand_logo_Image);
	Thread.sleep(1000);
	boolean sts=delete_Icon_in_BrandLogo.isDisplayed();
	return sts;
}

@FindBy(xpath="//ui-label[label[contains(text(),'Manufacturer Logo')]]/following-sibling::div/descendant::img[@class='ui-tinyimage']")
private WebElement brand_logo_Image;
public String get_The_Link_of_brand_logo_Image()
{
	String brandLogoImage=brand_logo_Image.getAttribute("src");
	return brandLogoImage;
}
public boolean get_the_status_of_brand_logo_Image()
{
	boolean sts=brand_logo_Image.isDisplayed();
	return sts;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Email Address')]]/following-sibling::div/ui-emailfield/input")
private WebElement emailId_EditBox;

public void write_In_emailId_EditBox(String emailId_FromExcel) {
	webUtil.retryingWriteText(emailId_EditBox, emailId_FromExcel);
}

public String getText_of_emailId_EditBox() {
	String text = webUtil.get_Attribut_value(emailId_EditBox);
	return text;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Helpdesk Number')]]/following-sibling::div/ngx-intl-tel-input/div/div/div/div[@class='iti-flag in']")
private WebElement countryCodeSelector_Dropdown_In_HelpDeskNumber;

public void click_On_countryCodeSelector_Dropdown_In_HelpDeskNumber() throws InterruptedException {
	webUtil.retryingFindClick(countryCodeSelector_Dropdown_In_HelpDeskNumber);
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Helpdesk Number')]]/following-sibling::div/ngx-intl-tel-input/div/input")
private WebElement helpDeskNumber_EditBox;

public void write_In_helpDeskNumber_EditBox(String helpDeskNumber_FromExcel) {
	webUtil.retryingWriteText(helpDeskNumber_EditBox, helpDeskNumber_FromExcel);
}

public String getText_of_helpDeskNumber_EditBox() {
	String text = webUtil.get_Attribut_value(helpDeskNumber_EditBox);
	return text;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Helpdesk Email')]]/following-sibling::div/ui-emailfield/input")
private WebElement helpdeskEmailId_EditBox;

public void write_In_helpdeskEmailId_EditBox(String helpdeskEmailId_FromExcel) {
	webUtil.retryingWriteText(helpdeskEmailId_EditBox, helpdeskEmailId_FromExcel);
}

public String getText_of_helpdeskEmailId_EditBox() {
	String text = webUtil.get_Attribut_value(helpdeskEmailId_EditBox);
	return text;
}

@FindBy(xpath="//ui-label[label[contains(text(),'GSTIN')]]/following-sibling::div/ui-input-box/input[@placeholder='GSTIN']")
private WebElement GSTIN_Editbox;

public void write_on_GSTIN_EditBox(String GSTINNumberFromExcel)
{
	webUtil.retryingWriteText(GSTIN_Editbox, GSTINNumberFromExcel);
}


@FindBy(xpath="//ui-label[label[contains(text(),'VAT Number')]]/following-sibling::div//input")
private WebElement vatNumber_Editbox;

public void write_on_vatNumber_EditBox(String vatNumber_EditboxFromExcel)
{
	webUtil.retryingWriteText(vatNumber_Editbox, vatNumber_EditboxFromExcel);
}


@FindBy(xpath="//ui-label[label[contains(text(),'Industry')]]/following-sibling::div/ui-selectbox/select")
private WebElement selectBox_for_Industry;
public void select_theIndutsry_SelectBox(String industryFromExcel)
{
	webUtil.selectByVisibletext(selectBox_for_Industry, industryFromExcel);
}
public String getSelectedText_Of_Industry_SelectBox() {
	String option_Name_For_TimeZone = webUtil.getFirstSelectionOption(selectBox_for_Industry);
	return option_Name_For_TimeZone;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Pin Code')]]/following-sibling::ui-input-box/input[@placeholder='Pin Code']")
private WebElement pinCode_EditBox;

public void write_In_pinCode_EditBox(String pinCode_FromExcel) {
	webUtil.retryingWriteText(pinCode_EditBox, pinCode_FromExcel);
}

public String getText_of_pinCode_EditBox() {
	String text = webUtil.get_Attribut_value(pinCode_EditBox);
	return text;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'District')]]/following-sibling::ui-input-box/input")
private WebElement district_EditBox;

public void write_In_district_EditBox(String district_FromExcel) {
	webUtil.retryingWriteText(district_EditBox, district_FromExcel);
}

public String getText_of_district_EditBox() {
	String text = webUtil.get_Attribut_value(district_EditBox);
	return text;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'State')]]/following-sibling::ui-input-box/input[@placeholder='state']")
private WebElement state_EditBox;

public void write_In_state_EditBox(String state_FromExcel) {
	webUtil.retryingWriteText(state_EditBox, state_FromExcel);
}

public String getText_of_state_EditBox() {
	String text = webUtil.get_Attribut_value(state_EditBox);
	return text;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'City')]]/following-sibling::ui-input-box/input")
private WebElement city_EditBox;

public void write_In_city_EditBox(String city_FromExcel) {
	webUtil.retryingWriteText(city_EditBox, city_FromExcel);
}

public String getText_of_city_EditBox() {
	String text = webUtil.get_Attribut_value(city_EditBox);
	return text;
}

@FindBy(xpath = "//ui-label[label[contains(text(),'Address')]]/following-sibling::ui-textarea/textarea")
private WebElement address_EditBox;

public void write_In_address_EditBox(String address_FromExcel) {
	webUtil.retryingWriteText(address_EditBox, address_FromExcel);
}

public String getText_of_address_EditBox() {
	String text = webUtil.get_Attribut_value(address_EditBox);
	return text;
}

@FindBy(xpath = "//span[contains(text(),'Check this box if')]/preceding-sibling::div/div")
private WebElement checkBox_for_AlternateAddress;

public boolean status_of_checkBox_for_AlternateAddress() {
	boolean sts = checkBox_for_AlternateAddress.isDisplayed();
	Testlistener.log("Alternate Address Check Box is displayed : " + sts);
	boolean sts1 = checkBox_for_AlternateAddress.isEnabled();
	return sts1;
}

public boolean status_of_checkBox_for_AlternateAddress_is_Checked_or_Not() {
	boolean sts = driver.findElement(By.xpath("//span[contains(text(),'Check this box if')]/preceding-sibling::div/span/input")).isSelected();
	return sts;
}

public void click_On_checkBox_for_AlternateAddress() throws InterruptedException {
	webUtil.retryingFindClick(checkBox_for_AlternateAddress);
}

@FindBy(xpath = "//span[contains(text(),'Enable Product Registration')]/preceding-sibling::div/div")
private WebElement checkBox_for_EnablingProductRegistration;

public boolean status_of_checkBox_for_EnablingProductRegistration() {
	boolean sts = checkBox_for_EnablingProductRegistration.isDisplayed();
	Testlistener.log("Alternate Address Check Box is displayed : " + sts);
	boolean sts1 = checkBox_for_EnablingProductRegistration.isEnabled();
	return sts1;
}

public boolean status_of_checkBox_for_EnablingProductRegistration_is_Checked_or_Not() {
	boolean sts = driver.findElement(By.xpath("//span[contains(text(),'Enable Product')]/preceding-sibling::div/span/input")).isSelected();
	return sts;
}

public void click_On_checkBox_for_EnablingProductRegistration() throws InterruptedException {
	webUtil.retryingFindClick(checkBox_for_EnablingProductRegistration);
}

// Alternate Address
// Alternate Zipcode
@FindBy(xpath = "//h3[contains(text(),'Alternate Address')]/following-sibling::div/div/ui-input-box/input[@placeholder='Pin Code']")
private WebElement alternateAddress_ZipCode_EditBox;

public void write_In_alternateAddress_ZipCode_EditBox(String zipcode_FromExcel) {
	webUtil.retryingWriteText(alternateAddress_ZipCode_EditBox, zipcode_FromExcel);
}

public String getText_of_alternateAddress_ZipCode_EditBox() {
	String text = webUtil.get_Attribut_value(alternateAddress_ZipCode_EditBox);
	return text;
}

// Alternate District
@FindBy(xpath = "//h3[contains(text(),'Alternate Address')]/following-sibling::div/div/ui-input-box/input[@placeholder='District']")
private WebElement alternateDistrict_EditBox;

public void write_In_alternateDistrict_EditBox(String alternatedistrict_FromExcel) {
	webUtil.retryingWriteText(alternateDistrict_EditBox, alternatedistrict_FromExcel);
}

public String getText_of_alternateDistrict_EditBox() {
	String text = webUtil.get_Attribut_value(alternateDistrict_EditBox);
	return text;
}

// Alternate State
@FindBy(xpath = "//h3[contains(text(),'Alternate Address')]/following-sibling::div/div/ui-input-box/input[@placeholder='state']")
private WebElement alternateState_EditBox;

public void write_In_alternateState_EditBox(String alternatestate_FromExcel) {
	webUtil.retryingWriteText(alternateState_EditBox, alternatestate_FromExcel);
}

public String getText_of_alternateState_EditBox() {
	String text = webUtil.get_Attribut_value(alternateState_EditBox);
	return text;
}

// Alternate City
@FindBy(xpath = "//h3[contains(text(),'Alternate Address')]/following-sibling::div/div/ui-input-box/input[@placeholder='City']")
private WebElement alternatecity_EditBox;

public void write_In_alternatecity_EditBox(String alternatecity_FromExcel) {
	webUtil.retryingWriteText(alternatecity_EditBox, alternatecity_FromExcel);
}

public String getText_of_alternatecity_EditBox() {
	String text = webUtil.get_Attribut_value(alternatecity_EditBox);
	return text;
}

// Address alternate
@FindBy(xpath = "//h3[contains(text(),'Alternate Address')]/following-sibling::div/div/ui-textarea/textarea")
private WebElement alternateaddress_EditBox;

public void write_In_alternateaddress_EditBox(String alternateaddress_FromExcel) {
	webUtil.retryingWriteText(alternateaddress_EditBox, alternateaddress_FromExcel);
}

public String getText_of_alternateaddress_EditBox() {
	String text = webUtil.get_Attribut_value(alternateaddress_EditBox);
	return text;
}

@FindBy(xpath="//input[@value='Save']")
private List<WebElement> save_Button_List;

public void click_On_Save_Button() throws InterruptedException {
	System.out.println("The List of Save Button is : "+ save_Button_List.size());
	for(int i=0; i<save_Button_List.size(); i++) {
		if(i==1)
		{
			List<WebElement> newListElemnt = save_Button_List;
			newListElemnt.get(i).click();
		}
		else
		{
			System.out.println("The value of i is : "+ i);
		}
		
	}
}


	
}
