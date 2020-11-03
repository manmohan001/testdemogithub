package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class PartnerPlanPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();
	String partnerName_FromUI;
	String partnerMobile_FromUI;

	public PartnerPlanPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='addPlan']")
	private WebElement addPlan_Link;
	
	public void click_On_addPlan_Link() throws InterruptedException
	{
		webUtil.retryingFindClick(addPlan_Link);
	}

	
	@FindBy(xpath="//h4[contains(text(),'Add Plan')]")
	private WebElement addPlan_Header_Text;
	
	public String getText_Of_addPlan_Header_Text()
	{
		String addPlanHeaderText = webUtil.getTheTextFromUI(addPlan_Header_Text);
		return addPlanHeaderText;
		
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Product Subcategory')]]/following-sibling::div")
	private WebElement product_Sub_Category;

	public void click_On_Product_SubCategory_Add_plan() throws InterruptedException {
	webUtil.retryingFindClick(product_Sub_Category);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Product Subcategory')]]/following-sibling::div//input")
	private WebElement subCategory_Search_Box;

	public void write_On_Subcategory_Search(String subcategoryFromExcel) {
	webUtil.retryingWriteText(subCategory_Search_Box, subcategoryFromExcel);
	}

	@FindBy (xpath = "//ui-label[label[contains(text(),'Product Subcategory')]]/following-sibling::div//ul//li//label")
	private List<WebElement> list_Of_Subcategory;

	public void select_Required_Subcategory_Add_Plan(String subCategoryFromExcel) {
	System.out.println("Size of the subcategory List is : "+list_Of_Subcategory.size());
	for (int i = 0; i < list_Of_Subcategory.size(); i++) 
	{
	System.out.println("The List Of subcategory are : " + list_Of_Subcategory.get(i).getText());
	if (list_Of_Subcategory.get(i).getText().trim().equals(subCategoryFromExcel.trim())) 
	{
	list_Of_Subcategory.get(i).click();
	break;
	} else 
	{
	System.out.println("There is not match.....");
	}
	}
	}


	    @FindBy(xpath = "//ui-label[label[contains(text(),'Model Number')]]/following-sibling::div")
	private WebElement product_Model_Number;
	    
	    public void click_On_Product_ModelNumber_Add_plan() throws InterruptedException {
	webUtil.retryingFindClick(product_Model_Number);
	}
	    
	    @FindBy(xpath = "//ui-label[label[contains(text(),'Model Number')]]/following-sibling::div//input")
	    private WebElement model_Number_Search_Box_Add_Plan;
	    
	    public void write_On_ModelNumber_Search_Add_Plan(String modelNumberFromExcel) {
	    webUtil.retryingWriteText(model_Number_Search_Box_Add_Plan, modelNumberFromExcel);
	    }
	    
	    @FindBy(xpath = "//ui-label[label[contains(text(),'Model Number')]]/following-sibling::div//ul//li//label")
	    private List<WebElement> list_Of_ModelNumber;
	    
	    public void select_Required_Model_Number(String modelNumberFromExcel) {
	System.out.println("Size of the modelNumber List is : "+list_Of_ModelNumber.size());
	for (int i = 0; i < list_Of_ModelNumber.size(); i++) 
	{
	System.out.println("The List Of model number are : " + list_Of_ModelNumber.get(i).getText());
	if (list_Of_ModelNumber.get(i).getText().trim().equals(modelNumberFromExcel.trim())) 
	{
	list_Of_ModelNumber.get(i).click();
	break;
	} else 
	{
	System.out.println("There is not match.....");
	}
	}
	}
	    
	    
	    @FindBy(xpath = "//ui-label[label[contains(text(),'Service Offered')]]/following-sibling::div")
	    private WebElement product_Service_Offered;

	    public void click_On_Product_Service_Offered_Add_Plan() throws InterruptedException {
	webUtil.retryingFindClick(product_Service_Offered);
	}
	    
	    
	    @FindBy(xpath = "//ui-label[label[contains(text(),'Service Offered')]]/following-sibling::div//input")
	    private WebElement service_Offered_Add_Plan;
	    
	    public void write_On_Service_Offered_add_plan(String serviceofferedFromExcel) {
	    webUtil.retryingWriteText(service_Offered_Add_Plan, serviceofferedFromExcel);
	    }
	    
	    @FindBy(xpath = "//ui-label[label[contains(text(),'Service Offered')]]/following-sibling::div//ul//li//label")
	    private List<WebElement> list_Of_Service_Offered_Add_Plan;
	    
	    public void select_Required_Service_Offered_Add_Plan(String serviceOfferedFromExcel) {
	System.out.println("Size of the service offered List is : "+list_Of_Service_Offered_Add_Plan.size());
	for (int i = 0; i < list_Of_ModelNumber.size(); i++) 
	{
	System.out.println("The List Of service offered are : " + list_Of_Service_Offered_Add_Plan.get(i).getText());
	if (list_Of_Service_Offered_Add_Plan.get(i).getText().trim().equals(serviceOfferedFromExcel.trim())) 
	{
	list_Of_Service_Offered_Add_Plan.get(i).click();
	break;
	} else 
	{
	System.out.println("There is not match.....");
	}
	}
	}
	
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Product Subcategory')]]/following-sibling::ui-selectbox/select")
	private WebElement prdouctSubcategorySelectBox;
	
	public void selectProductSubCategory(String productSubCategoryFromExcel) {
		webUtil.selectByVisibletext(prdouctSubcategorySelectBox, productSubCategoryFromExcel);
	}

	public String getThe_Value_Of_selectedProductSubCategoryInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(prdouctSubcategorySelectBox);
		return optionText;
	}
 

	@FindBy(xpath="//ui-label[label[contains(text(),'Model Number')]]/following-sibling::ui-selectbox/select")
	private WebElement modelNumberSelectBox;
	
	public void selectmodelNumber(String ModelNumberFromExcel) {
		webUtil.selectByVisibletext(modelNumberSelectBox, ModelNumberFromExcel);
	}

	public String getThe_Value_Of_selectedModelNumberInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(modelNumberSelectBox);
		return optionText;
	}
	

	@FindBy(xpath="//ui-label[label[contains(text(),'Service Offered')]]/following-sibling::ui-selectbox/select")
	private WebElement serviceOfferedSelectBox;
	
	public void selectserviceOffered(String serviceOfferedFromExcel) {
		webUtil.selectByVisibletext(serviceOfferedSelectBox, serviceOfferedFromExcel);
	}

	public String getThe_Value_Of_selecteserviceOfferedInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(serviceOfferedSelectBox);
		return optionText;
	}

	
	@FindBy(xpath="//input[@placeholder='Enter Plan type']")
	private WebElement planType_EditBox;
	
	public void write_On_planType_EditBox(String planTypeFromExcel) {
		webUtil.retryingWriteText(planType_EditBox, planTypeFromExcel);
	}

	public String getText_Of_planType_EditBox() {
		String planTypeText = planType_EditBox.getAttribute("value");
		return planTypeText;
	}

	
	
	@FindBy(xpath="//input[@placeholder='Enter min range']")
	private WebElement minimumPriceRange_EditBox;
	
	public void write_On_minimumPriceRange_EditBox(String minimumPriceRangeFromExcel) {
		webUtil.retryingWriteText(minimumPriceRange_EditBox, minimumPriceRangeFromExcel);
	}

	public String getText_Of_minimumPriceRange_EditBox() {
		String minPriceText = minimumPriceRange_EditBox.getAttribute("value");
		return minPriceText;
	}
	
	
	@FindBy(xpath="//input[@placeholder='Enter max range']")
	private WebElement maximumPriceRange_EditBox;
	
	public void write_On_maximumPriceRange_EditBox(String maximumPriceRangeFromExcel) {
		webUtil.retryingWriteText(maximumPriceRange_EditBox, maximumPriceRangeFromExcel);
	}

	public String getText_Of_maximumPriceRange_EditBox() {
		String maxPriceText = maximumPriceRange_EditBox.getAttribute("value");
		return maxPriceText;
	}
		
	@FindBy(xpath="//input[@placeholder='Enter amount']")
	private WebElement amount_EditBox;
	
	public void write_On_amount_EditBox(String amountFromExcel) {
		webUtil.retryingWriteText(amount_EditBox, amountFromExcel);
	}

	public String getText_Of_amount_EditBox() {
		String amountText = amount_EditBox.getAttribute("value");
		return amountText;
	}
	
	
	@FindBy(xpath="//input[@placeholder='Year']")
	private WebElement year_EditBox;
	
	public void write_On_year_EditBox(String yearFromExcel) {
		webUtil.retryingWriteText(year_EditBox, yearFromExcel);
	}

	public String getText_Of_year_EditBox() {
		String yearText = year_EditBox.getAttribute("value");
		return yearText;
	}
	
	@FindBy(xpath="//input[@placeholder='Month']")
	private WebElement month_EditBox;
	
	public void write_On_month_EditBox(String monthFromExcel) {
		webUtil.retryingWriteText(month_EditBox, monthFromExcel);
	}

	public String getText_Of_month_EditBox() {
		String monthText = month_EditBox.getAttribute("value");
		return monthText;
	}
		
	@FindBy(xpath="//input[@value='Create Plan']")
	private WebElement createPlan_Link;
	
	public void click_On_createPlan_Link() throws InterruptedException
	{
		webUtil.retryingFindClick(createPlan_Link);
	}
	
	
	@FindBy(xpath="//div[contains(text(),'View ')]")
	private WebElement viewLink;
	
	public void click_On_viewLink() throws InterruptedException
	{
		webUtil.retryingFindClick(viewLink);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Product Subcategory']")
	private WebElement productSubCategory_SerachBox_InViewPlan;
	
	public void write_In_productSubCategory_SerachBox_InViewPlan(String productSubCategory_From_Excel)
	{
		webUtil.retryingWriteText(productSubCategory_SerachBox_InViewPlan, productSubCategory_From_Excel);
	}
	

	@FindBy(xpath = "//input[@placeholder='Purchase Type']")
	private WebElement purchaseType_SearchBox;
	
	public void write_In_purchaseType_SearchBox(String purchaseType_From_Excel)
	{
		webUtil.retryingWriteText(purchaseType_SearchBox, purchaseType_From_Excel);
	}


	@FindBy(xpath = "//input[@placeholder='Model Number']")
	private WebElement modelNumber_SearchBox;
	
	public void write_In_modelNumber_SearchBox(String modelNumber_From_Excel)
	{
		webUtil.retryingWriteText(modelNumber_SearchBox, modelNumber_From_Excel);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement planName_SearchBox;
	
	public void write_In_planName_SearchBox(String planName_From_Excel)
	{
		webUtil.retryingWriteText(planName_SearchBox, planName_From_Excel);
	}



	@FindBy(xpath="//div[contains(text(),'View Plan')]")
	private WebElement viewPlanLink_In_PurchasePlans;
	
	public void click_On_viewPlanLink_In_PurchasePlans() throws InterruptedException
	{
		webUtil.retryingFindClick(viewPlanLink_In_PurchasePlans);
	}

}
