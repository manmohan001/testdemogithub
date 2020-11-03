package com.nhance.automation.customerAdminPageFactory;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class InitialSetUpPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	CustomerAdminCommonWebElementInAllPage cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();

	public InitialSetUpPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	
	// Get the text of Welcome Message POP Up
	@FindBy(xpath="//b[contains(text(),'Welcome to')]")
	private WebElement welcomeTextIn_PopUP;
	public String getTheText_of_welcomeTextIn_PopUP()
	{
		String text=webUtil.getTheTextFromUI(welcomeTextIn_PopUP);
		System.out.println(text);
		return text;
	}
	
	// Click the cross mark in Welcome Pop Up 
	@FindBy(xpath="//span[b[contains(text(),'Welcome to')]]/following-sibling::span/i")
	private WebElement crossSign_Of_WelcomePOpUp;
	public void click_On_crossSign_Of_WelcomePOpUp() throws InterruptedException
	{
		webUtil.retryingFindClick(crossSign_Of_WelcomePOpUp);
	}
	
	// Profile Image Link
	@FindBy(xpath="//img[@class='customerProfile']")
	private WebElement profile_Image_Link;
	public void  click_On_profile_Image_Link() throws InterruptedException
	{
		webUtil.retryingFindClick(profile_Image_Link);
	}
	
	// Customer Edit Box Test Data
	@FindBy(xpath="//ui-label[label[contains(text(),'Customer Name')]]/following-sibling::div/ui-input-box/input[@placeholder='Customer Name']")
	private WebElement customerName_EditBox;
	public String getText_of_customerName_EditBox()
	{
		String customerName=webUtil.get_Attribut_value(customerName_EditBox);
		return customerName;
	}
	
	// Customer Country
	@FindBy(xpath="//ui-selectbox[@name='countryName']/select")
	private WebElement countryName_selectBox;
	public String getSelected_Option_from_countryName_selectBox()
	{
		String countryName=webUtil.getFirstSelectionOption(countryName_selectBox);
		return countryName;
	}
	
	// Customer Currency 
	@FindBy(xpath="//div[@formgroupname='currency']/ui-selectbox/select")
	private WebElement currency_selectBox;
	public String getSelected_Option_From_currency_selectBox()
	{
		String currency=webUtil.getFirstSelectionOption(currency_selectBox);
		return currency;
	}
	
	// Customer Mobile Number
	@FindBy(xpath="//ui-label[label[contains(text(),'Contact Number')]]/following-sibling::div/ngx-intl-tel-input/div/div/following-sibling::input")
	private WebElement mobileNumber_EditBox;
	public String getText_of_mobileNumber_EditBox()
	{
		String mobileNumber=webUtil.get_Attribut_value(mobileNumber_EditBox);
		return mobileNumber;
	}
	
	// Customer Email Id
	@FindBy(xpath="//ui-label[label[contains(text(),'Email Address')]]/following-sibling::div/ui-emailfield/input")
	private WebElement emailID_EditBox;
	public String getText_of_emailID_EditBox()
	{
		String emailID=webUtil.get_Attribut_value(emailID_EditBox);
		return emailID;
	}
	
	// Save Button
	@FindBy(xpath="//input[@value='Save' and @type='button' ]")
	private WebElement save_btn;
	public void click_On_save_btn() throws InterruptedException
	{
		webUtil.retryingFindClick(save_btn);
	}
	
	// Master Data Configuration
	@FindBy(xpath="//div[contains(text(),'Master Data configuration')]/preceding-sibling::ui-icon/img")
	private WebElement masterDataConfiguration_Link;
	public void click_On_masterDataConfiguration_Link() throws InterruptedException
	{
		webUtil.retryingFindClick(masterDataConfiguration_Link);
	}
	
	// Product Category Select Box
	@FindBy(xpath="//ui-label[label[contains(text(),'Product Category')]]/following-sibling::ui-selectbox/select")
	private WebElement productCategory_SelectBox;
	public void select_ProductCategory_from_SelectBox(String productCategoryFromExcel)
	{
		webUtil.selectByVisibletext(productCategory_SelectBox, productCategoryFromExcel);
	}
	
	// Product SubCategory
	@FindBy(xpath="//ui-label[label[contains(text(),'Product Subcategory')]]/following-sibling::ss-multiselect-dropdown/div/button")
	private WebElement productSubCategory_Selectbox;
	public void click_On_productSubCategory_Selectbox() throws InterruptedException
	{
		webUtil.retryingFindClick(productSubCategory_Selectbox);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Product Subcategory')]]/following-sibling::ss-multiselect-dropdown/div/div/a/span/span")
	private  List<WebElement> list_Of_allCheckBox_For_ProductSubCategory;
	public void click_on_Required_CheckBox_For_ProductSubCategory(String productSubcategoryName) throws InterruptedException
	{
		click_On_Particluar_CheckBox(list_Of_allCheckBox_For_ProductSubCategory, productSubcategoryName);
	}
	
	 @FindBy(xpath = "//ui-label[label[text()='Product Subcategory']]/following-sibling::div//div[@class='list-area']//ul//li//label")
	 private List<WebElement> subcategoryList;
	
	/* public void select_Required_Subcategory(String subCategoryFromExcel) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
			 for (int i = 0; i < subcategoryList.size(); i++) 
			 {
				 System.out.println("The List Of SubCategory are : " + subcategoryList.get(i).getText());
					if (subcategoryList.get(i).getText().trim().equals(subCategoryFromExcel.trim())) 
					{
						subcategoryList.get(i).click();
						System.out.println("");
						break;
					} else 
					{
						System.out.println("There is not match.....");
					}
				}*/
	
	
	public void click_On_Particluar_CheckBox(List<WebElement> element , String itemName) throws InterruptedException
	{
	for(int i=0; i<500; i++)
	{	
		//System.out.println("Item Name :: "+list_Of_allCheckBox_For_ProductSubCategory.get(i).getText().trim() + " found at "+ i);
		if(element.get(i).getText().trim().equals(itemName.trim()))
		{
			element.get(i).click();;
			Thread.sleep(500);
			break;
		}
		else
		{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element.get(i));
		Thread.sleep(500);
		}
	}
	
	}
	
	
	// Product Manufacturer
		@FindBy(xpath="//ui-label[label[contains(text(),'Product Manufacturer')]]/following-sibling::ss-multiselect-dropdown/div/button")
		private WebElement productManufacturer_Selectbox;
		public void click_On_productManufacturer_Selectbox() throws InterruptedException
		{
			webUtil.retryingFindClick(productManufacturer_Selectbox);
		}
		
		@FindBy(xpath="//ui-label[label[contains(text(),'Product Manufacturer')]]/following-sibling::ss-multiselect-dropdown/div/div/a/span/input")
		private  List<WebElement> list_Of_allCheckBox_For_productManufacturer;
		
		@FindBy(xpath="//ui-label[label[contains(text(),'Product Manufacturer')]]/following-sibling::ss-multiselect-dropdown/div/div/a/span/span")
		private List<WebElement> list_of_All_productManufacturer;
		public void click_on_required_CheckBox_For_productManufacturer(String productManufacturerName) throws InterruptedException
		{
			click_On_Particluar_CheckBox(list_of_All_productManufacturer, productManufacturerName);
		}
	
	// Product Management 
	@FindBy(xpath="//div[contains(text(),'Product Onboarding')]/preceding-sibling::ui-icon/img")
	private WebElement product_OnBoarding_Link;
	public void click_On_product_OnBoarding_Link() throws InterruptedException
	{
		webUtil.retryingFindClick(product_OnBoarding_Link);
	}
	
	@FindBy(xpath="//a[contains(text(),'Product Manually')]")
	private WebElement product_Manually_Link;
	public void click_on_product_Manually_Link() throws InterruptedException
	{
		webUtil.retryingFindClick(product_Manually_Link);
	}
	
	// Mobile Menu App Configure
	@FindBy(xpath="//div[contains(text(),'Mobile App menu')]/preceding-sibling::ui-icon/img")
	private WebElement mobileAppMenu_Link;
	public void click_on_mobileAppMenu_Link() throws InterruptedException
	{
		webUtil.retryingFindClick(mobileAppMenu_Link);
	}
	
	// Click on Check box
	@FindBy(xpath="//span[@class='ui-chkbox-label']/preceding-sibling::div/div")
	private WebElement checbox_in_mobileAppMenu;
	public void click_on_checbox_in_mobileAppMenu() throws InterruptedException
	{
		webUtil.retryingFindClick(checbox_in_mobileAppMenu);
	}
	
	// Click on Partner Management
	@FindBy(xpath="//div[div[contains(text(),'Partner')]]/preceding-sibling::ui-icon/img")
	private WebElement partner_Onbaording_link;
	public void click_on_partner_Onbaording_link() throws InterruptedException
	{
		webUtil.retryingFindClick(partner_Onbaording_link);
	}
	
	// Click on Add Partner Manually
	@FindBy(xpath="//a[contains(text(),'Add Partner Manually')]")
	private WebElement addpartner_Manually_button;
	public void click_on_addpartner_Manually_button() throws InterruptedException
	{
		webUtil.retryingFindClick(addpartner_Manually_button);
	}
	
	// Click on Finish Set Up Link
	@FindBy(xpath="//h3[contains(text(),'FINISH SETUP')]")
	private WebElement finishSetUp_Link;
	public void click_On_finishSetUp_Link() throws InterruptedException
	{
		webUtil.retryingFindClick(finishSetUp_Link);
	}
}
