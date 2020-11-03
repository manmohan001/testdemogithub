package com.nhance.automation.customerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class PartnerServiceOfferingPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	// BusinessFunction bMthd = new BusinessFunction();

	public PartnerServiceOfferingPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='addPlan']")
	private WebElement addPlan_Link;

	public void click_On_addPlan_Link() throws InterruptedException {
		webUtil.retryingFindClick(addPlan_Link);
	}

	@FindBy(xpath = "//h4[contains(text(),'Add Plan')]")
	private WebElement addPlan_HeaderText;

	public String getText_Of_addPlan_HeaderText() {
		String text = webUtil.getTheTextFromUI(addPlan_HeaderText);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Product Subcategory')]]/following-sibling::ui-selectbox/select")
	private WebElement productSubCategorySelectBox;

	public void selectFrom_productSubCategorySelectBox(String productSubCategoryFromExcel) {
		webUtil.selectByVisibletext(productSubCategorySelectBox, productSubCategoryFromExcel);
	}

	public String getTheValue_Of_ProductSubCategory_From_EditPage() {
		String optiontext = webUtil.getFirstSelectionOption(productSubCategorySelectBox);
		return optiontext;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Model Number')]]/following-sibling::ui-selectbox/select")
	private WebElement modelNumberSelectBox;

	public void selectFrom_modelNumberSelectBox(String modelNumberFromExcel) {
		webUtil.selectByVisibletext(modelNumberSelectBox, modelNumberFromExcel);
	}

	public String getTheValue_Of_ModelNumber_From_EditPage() {
		String optiontext = webUtil.getFirstSelectionOption(modelNumberSelectBox);
		return optiontext;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Service Offered')]]/following-sibling::ui-selectbox/select")
	private WebElement serviceOfferedSelectBox;

	public void selectFrom_serviceOfferedSelectBox(String serviceOfferedFromExcel) {
		webUtil.selectByVisibletext(serviceOfferedSelectBox, serviceOfferedFromExcel);
	}

	public String getTheValue_Of_ServiceOffered_From_EditPage() {
		String optiontext = webUtil.getFirstSelectionOption(serviceOfferedSelectBox);
		return optiontext;
	}

	// X-path of Plan Details For Service Offered "Accessory"

	
	@FindBy(xpath = "//input[@placeholder='Enter name']")
	private WebElement planName_EditBox;

	public void writeIn_planName_EditBox(String planNameFromExcel) {
		if (planName_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(planName_EditBox, planNameFromExcel);
		}
	}

	public String getText_Of_planName_EditBox() {
		String text = webUtil.get_Attribut_value(planName_EditBox);
		return text;
	}

	
	@FindBy(xpath = "//input[@placeholder='Enter price']")
	private WebElement enterPrice_EditBox;

	public void writeIn_enterPrice_EditBox(String priceFromExcel) {
		if (enterPrice_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(enterPrice_EditBox, priceFromExcel);
		}
	}

	public String getText_Of_enterPrice_EditBox() {
		String text = webUtil.get_Attribut_value(enterPrice_EditBox);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Accessory type')]]/following-sibling::ui-selectbox/select")
	private WebElement accessoryType_SelectBox;

	public void selectFrom_accessoryType_SelectBox(String accessoryType_FromExcel) {
		if (accessoryType_SelectBox.isDisplayed()) {
			webUtil.selectByVisibletext(accessoryType_SelectBox, accessoryType_FromExcel);
		}
	}

	public String getThe_Value_Of_AccessoryType_From_EditPage() {
		String optiontext = webUtil.getFirstSelectionOption(accessoryType_SelectBox);
		return optiontext;
	}

	@FindBy(xpath = "//textarea[@class='textArea']")
	private WebElement description_EditBox;

	public void writeIn_description_EditBox(String description_FromExcel) {
		if (description_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(description_EditBox, description_FromExcel);
		}
	}

	public String getText_Of_description_EditBox_From_EditPage() {
		String text = webUtil.get_Attribut_value(description_EditBox);
		return text;
	}

	@FindBy(xpath = "//input[@placeholder='Enter document url']")
	private WebElement documentURL_EditBox;

	public void writeIn_documentURL_EditBox(String documentUrl_FromExcel) {
		if (documentURL_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(documentURL_EditBox, documentUrl_FromExcel);
		}
	}

	public String getText_Of_DocumentUrl_From_EditPage() {
		String text = webUtil.get_Attribut_value(documentURL_EditBox);
		return text;
	}

	@FindBy(xpath = "//input[@placeholder='Enter image url']")
	private WebElement imageUrl_EditBox;

	public void write_In_imageUrl_EditBox(String imageUrl_FromExcel) {
		if (imageUrl_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(imageUrl_EditBox, imageUrl_FromExcel);
		}
	}

	public String getText_Of_ImageUrl_From_EditPage() {
		String text = webUtil.get_Attribut_value(imageUrl_EditBox);
		return text;
	}

	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveButton_Link;

	public void click_On_saveButton() throws InterruptedException {
		webUtil.retryingFindClick(saveButton_Link);
	}

	// X-path of Plan Details For other Service Offered except "Accessory"

	@FindBy(xpath = "//input[@placeholder='Enter Plan type']")
	private WebElement enterPlanType_EditBox;

	public void write_In_enterPlanType_EditBox(String planType_FromExcel) {
		if (enterPlanType_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(enterPlanType_EditBox, planType_FromExcel);
		}
	}

	public String getText_Of_PlanType_From_EditPage() {
		String text = webUtil.get_Attribut_value(enterPlanType_EditBox);
		return text;
	}


	@FindBy(xpath="//p[span[contains(text(),'PLAN TYPE')]]/following-sibling::span")
	private WebElement planType_For_View;
	
	public String getText_Of_planType_For_View() {
		String planTypeText = planType_For_View.getText();
		return planTypeText;
	} 
	
	@FindBy(xpath = "//input[@placeholder='Enter min range']")
	private WebElement priceRangeFrom_EditBox;

	public void writeIn_priceRangeFrom_EditBox(String priceRangeFrom_Excel) {
		if (priceRangeFrom_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(priceRangeFrom_EditBox, priceRangeFrom_Excel);
		}
	}

	public String getText_Of_PriceRangeFrom_EditPage() {
		String text = webUtil.get_Attribut_value(priceRangeFrom_EditBox);
		return text;
	}

	@FindBy(xpath = "//input[@placeholder='Enter max range']")
	private WebElement priceRangeTo_EditBox;

	public void write_In_priceRangeTo_EditBox(String priceRangeToFromExcel) {
		if (priceRangeTo_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(priceRangeTo_EditBox, priceRangeToFromExcel);
		}
	}

	@FindBy(xpath="//p[span[contains(text(),'PRICE RANGE')]]/following-sibling::b")
	private WebElement priceRange_In_ViewPage;
	
	public String getText_Of_priceRange_In_ViewPage()
	{
		return webUtil.getTheTextFromUI(priceRange_In_ViewPage);
	}
	
	
	public String getText_Of_PriceRangeTo_From_EditPage() {
		String text = webUtil.get_Attribut_value(priceRangeTo_EditBox);
		return text;
	}

	@FindBy(xpath = "//input[@placeholder='Enter amount']")
	private WebElement enterAmount_EditBox;

	public void write_In_enterAmount_EditBox(String amount_FromExcel) {
		if (enterAmount_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(enterAmount_EditBox, amount_FromExcel);
		}
	}

	@FindBy(xpath="//p[span[contains(text(),'PLAN DURATION')]]/following-sibling::b")
    private WebElement planDuration_In_ViewPage;
	
	public String getText_Of_planDuration_In_ViewPage()
	{
		return webUtil.getTheTextFromUI(planDuration_In_ViewPage);
	}
	
	
	public String getText_Of_Amount_From_EditPage() {
		String text = webUtil.get_Attribut_value(enterAmount_EditBox);
		return text;
	}

	@FindBy(xpath = "//input[@placeholder='Year']")
	private WebElement yearEditBox;

	public void write_In_yearEditBox(String yearFromExcel) {
		if (yearEditBox.isDisplayed()) {
			webUtil.retryingWriteText(yearEditBox, yearFromExcel);
		}
	}

	public String getText_Of_yearEditBox() {
		String text = webUtil.get_Attribut_value(yearEditBox);
		return text;
	}

	@FindBy(xpath = "//input[@placeholder='Month']")
	private WebElement monthEditBox;

	public void write_In_monthEditBox(String monthFromExcel) {
		if (monthEditBox.isDisplayed()) {
			webUtil.retryingWriteText(monthEditBox, monthFromExcel);
		}
	}

	public String getText_Of_Month_From_EditPage() {
		String text = webUtil.get_Attribut_value(monthEditBox);
		return text;
	}

	@FindBy(xpath="//span[@class='one wide column ruppeeSymbol']/span")
	private WebElement amountCaptured_In_ViewPage;
	
	public String getText_Of_amountCaptured_In_ViewPage()
	{
		return webUtil.getTheTextFromUI(amountCaptured_In_ViewPage);
	}
	
	@FindBy(xpath = "//b[contains(text(),'More Options ')]/following-sibling::i")
	private WebElement moreOption_Link;

	public void click_On_moreOption_Link() throws InterruptedException {
		webUtil.retryingFindClick(moreOption_Link);
	}

	@FindBy(xpath = "//span[@class='switch-handle']")
	private WebElement infoRadioButton;

	public void click_On_urlRadioButton() throws InterruptedException {
		webUtil.retryingFindClick(infoRadioButton);
	}

	@FindBy(xpath = "//input[@placeholder='Enter additional info']")
	private WebElement enterAdditionalInfo_EditBox;

	public void write_In_enterAdditionalInfo_EditBox(String additionalInfo_FromExcel) {
		if (enterAdditionalInfo_EditBox.isDisplayed()) {
			webUtil.retryingWriteText(enterAdditionalInfo_EditBox, additionalInfo_FromExcel);
		}
	}

	@FindBy(xpath = "//input[@value='Create Plan']")
	private WebElement createPlan_Link;

	public void click_On_createPlan_Link() throws InterruptedException {
		webUtil.retryingFindClick(createPlan_Link);
	}
	
	
	// X-Path for View Plan Details

	@FindBy(xpath = "//div[contains(text(),'View ')]")
	private WebElement viewLink_In_PartnerSection;

	public void click_On_viewPlan_Link() throws InterruptedException {
		if (viewLink_In_PartnerSection.isDisplayed()) {
			webUtil.retryingFindClick(viewLink_In_PartnerSection);
		}
	}

	@FindBy(xpath = "//input[@placeholder='Product Subcategory']")
	private WebElement productSubCategory_SearchBox;

	public void write_In_productSubCategory_SearchBox_InViewPlanSection(String productSubCategory_FromExcel) {
		if (productSubCategory_SearchBox.isDisplayed()) {
			webUtil.retryingWriteText(productSubCategory_SearchBox, productSubCategory_FromExcel);
		}
	}

	@FindBy(xpath = "//input[@placeholder='Purchase Type']")
	private WebElement purchaseType_SearchBox;

	public void write_In_purchaseType_SearchBox_InViewPlanSection(String purchaseType_FromExcel) {
		if (purchaseType_SearchBox.isDisplayed()) {
			webUtil.retryingWriteText(purchaseType_SearchBox, purchaseType_FromExcel);
		}
	}

	@FindBy(xpath = "//input[@placeholder='Model Number']")
	private WebElement modelNumber_SearchBox;

	public void write_In_modelNumber_SearchBox_InViewPlanSection(String modelNumber_FromExcel) {
		if (modelNumber_SearchBox.isDisplayed()) {
			webUtil.retryingWriteText(modelNumber_SearchBox, modelNumber_FromExcel);
		}
	}

	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement planName_SearchBox;

	public void write_In_planName_SearchBox(String planName_FromExcel) {
		if (planName_SearchBox.isDisplayed()) {
			webUtil.retryingWriteText(planName_SearchBox, planName_FromExcel);
		}
	}

	@FindBy(xpath = "//div[contains(text(),'View Plan')]")
	private WebElement viewPlanLink_In_PurchasePlanSection;

	public void click_On_viewPlanLink_In_PurchasePlanSection() throws InterruptedException {
		if (viewPlanLink_In_PurchasePlanSection.isDisplayed()) {
			webUtil.retryingFindClick(viewPlanLink_In_PurchasePlanSection);
		}
	}

	@FindBy(xpath = "//div[@class='edit']")
	private WebElement editSlab_Link;

	public void click_On_editSlab_Link() throws InterruptedException {
		if (editSlab_Link.isDisplayed()) {
			webUtil.retryingFindClick(editSlab_Link);
		}
	}

	@FindBy(xpath = "//div[@class='boxpaddingAlign slab_0']/div/div/div[@class='delete']")
	private WebElement deleteSlab_Link;

	public void click_On_deleteSlab_Link() throws InterruptedException {
		if (deleteSlab_Link.isDisplayed()) {
			webUtil.retryingFindClick(deleteSlab_Link);
		}
	}

	@FindBy(xpath = "//span[@class='numberCircle']")
	public List<WebElement> list_of_Slabs;

	@FindBy(xpath = "//input[@value='Create Slab']")
	private WebElement createSlab_Link;

	public void click_On_createSlab_Link() throws InterruptedException {
		if (createSlab_Link.isDisplayed()) {
			webUtil.retryingFindClick(createSlab_Link);
		}
	}

	@FindBy(xpath = "//span[@class='closeIcon']/i")
	private WebElement closeIcon_In_EditPlanWindow;

	public void click_On_closeIcon_In_EditPlanWindow() throws InterruptedException {
		if (closeIcon_In_EditPlanWindow.isDisplayed()) {
			webUtil.retryingFindClick(closeIcon_In_EditPlanWindow);
		}
	}

	@FindBy(xpath = "//tbody/tr[2]/td/app-purchase-config-page-list/app-page-list/div/div[@class='pageListContents']/ng2-smart-table/div/table/tbody/tr/td/ng2-st-tbody-edit-delete")
	private WebElement deleteIcon_In_PurchasePlanSection;

	public void click_On_deleteIcon_In_PurchasePlanSection() throws InterruptedException {
		if (deleteIcon_In_PurchasePlanSection.isDisplayed()) {
			webUtil.retryingFindClick(deleteIcon_In_PurchasePlanSection);
		}
	}


	@FindBy(xpath="//tbody/tr[2]/td/app-purchase-config-page-list/app-page-list/div/div[@class='pageListContents']/ng2-smart-table/ng2-smart-table-pager/nav/ul/li/span")
	private WebElement totalNumber_Text;
	
	public String get_TotalCount()
	{
		String text = totalNumber_Text.getText();
		return text;
		
	}
	
	@FindBy(xpath="//tbody/tr[2]/td/app-purchase-config-page-list/app-page-list/div/div[@class='pageListContents']/ng2-smart-table/div/table/tbody/tr[1]/td[1]/ng2-smart-table-cell/table-cell-view-mode/div")
	public List<WebElement> firstRowElement_For_ProductSubCategory;
	
	@FindBy(xpath="//tbody/tr[2]/td/app-purchase-config-page-list/app-page-list/div/div[@class='pageListContents']/ng2-smart-table/div/table/tbody/tr[1]/td[2]/ng2-smart-table-cell/table-cell-view-mode/div")
	public List<WebElement> firstRowElement_For_PurchaseType;
	
	@FindBy(xpath="//tbody/tr[2]/td/app-purchase-config-page-list/app-page-list/div/div[@class='pageListContents']/ng2-smart-table/div/table/tbody/tr[1]/td[3]/ng2-smart-table-cell/table-cell-view-mode/div")
	public List<WebElement> firstRowElement_For_ModelNumber;
	

	@FindBy(xpath="//tbody/tr[2]/td/app-purchase-config-page-list/app-page-list/div/div[@class='pageListContents']/ng2-smart-table/div/table/tbody/tr[1]/td[4]/ng2-smart-table-cell/table-cell-view-mode/div")
	public List<WebElement> firstRowElement_For_PlanName;
	



}
