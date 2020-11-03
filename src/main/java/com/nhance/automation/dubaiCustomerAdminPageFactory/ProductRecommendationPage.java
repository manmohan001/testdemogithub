package com.nhance.automation.dubaiCustomerAdminPageFactory;

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
public class ProductRecommendationPage {
	public WebDriver driver;
	String actualpopUpMessgaeText;
	String cutsomerName_FromUI;
	
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	boolean r1;
	CustomerAdminCommonWebElementInAllPage cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	int i;

	public ProductRecommendationPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//span[text()='Product Recommendation']")
	private WebElement ProductRecomend;
	

	@FindBy(xpath="//img[@class='create']")
	private WebElement Add;
	public void setAdd() throws InterruptedException {
		webUtil.retryingFindClick(Add);
	}
	
	@FindBy(xpath="//select")
	private WebElement modelNumber;
	
	public void selectModelNumber(String modelNumberFromExcel) {
		webUtil.selectByVisibletext(modelNumber, modelNumberFromExcel);
	}
	
	
	@FindBy(xpath = "//table/tbody/tr/td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_Of_ModelNumber;
	public String getThe_first_Data_of_ModelNumber(String modelNumber_FromExcel)
	{
		for(int i=0;i<list_Of_ModelNumber.size();i++)
		{
			if(list_Of_ModelNumber.get(i).getText().trim().equals(modelNumber_FromExcel.trim()))
			{
				cutsomerName_FromUI=list_Of_ModelNumber.get(i).getText().trim();
				break;
			}
		}
		return cutsomerName_FromUI;
	}

	
	@FindBy(xpath="//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-angle-double-right']")
	private WebElement double_Right;
	public void set_double_Right() throws InterruptedException {
		webUtil.retryingFindClick(double_Right);
	}
	
	@FindBy(xpath="//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-angle-double-left']")
	private WebElement double_Left;
	public void set_double_Left() throws InterruptedException {
		webUtil.retryingFindClick(double_Left);
	}
	
	@FindBy(xpath="//input[@placeholder='Category Name']")
	private WebElement productCategory;
	
	public void writeOn_ListingCategoryEditBox(int i, String productCategoryFromExcel)
	{
		driver.findElement(By.xpath("//tbody["+i+"]/tr/th/ui-input-box/input[@placeholder='Category Name']")).sendKeys(productCategoryFromExcel);
	}

	public String getThe_Value_Of_selectedProductCategoryInEditPage() {
		String optionText = webUtil.getFirstSelectionOption(productCategory);
		return optionText;
	}
	
	public String getAttribute() {
		String attribute = webUtil.get_Attribut_value(productCategory);
		return attribute;
	}
	
	@FindBy(xpath="//input[@value='0 Selected']")
	private WebElement selected;
	public void setSelect() throws InterruptedException {
		webUtil.retryingFindClick(selected);
	}
	
	@FindBy(xpath="//input[@value='1 Selected']")
	private WebElement newSelected;
	public void setNewSelect() throws InterruptedException {
		webUtil.retryingFindClick(newSelected);
	}
	
	@FindBy(xpath="//input[@value='2 Selected']")
	private WebElement new_Selected;
	public void setNew_Selected() throws InterruptedException {
		webUtil.retryingFindClick(new_Selected);
	}
	
	@FindBy(xpath="//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-angle-right']")
	private WebElement click;
	
		public void setClick() throws InterruptedException {
			webUtil.retryingFindClick(click);
		}
		
		@FindBy(xpath="//div[@class='ui-helper-clearfix']")
		private WebElement available;
		
	public void addModel(String modelNumberFromExcel2) throws InterruptedException {
		webUtil.retryingFindClick(available);
	}
	
	@FindBy(xpath="//div[@class='ui-helper-clearfix']")
	private WebElement selectedPickList;
	
public void add_Model(String modelNumberFromExcel2) throws InterruptedException {
	webUtil.retryingFindClick(selectedPickList);
}
	
	@FindBy(xpath="//button [@icon='fa-angle-double-down']/following::span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-angle-double-down']")
	private WebElement double_Down;
	public void set_Double_Down() throws InterruptedException {
		webUtil.retryingFindClick(double_Down);
	}

	@FindBy(xpath="//button [@icon='fa-angle-double-down']/following::span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-angle-double-up']")
	private WebElement double_Up;
	public void set_Double_Up() throws InterruptedException {
		webUtil.retryingFindClick(double_Up);
	}

	@FindBy(xpath="//input[@value='Done']")
	private WebElement done;
	
	public void setDone() throws InterruptedException {
		webUtil.retryingFindClick(done);
	}
	
	@FindBy(xpath="//input[@placeholder='Model Number']")
	private WebElement model_Number_Search_Field;
	
	public void write_On_model_number_Search_Field(String modelNumberFromExcel) {
		webUtil.retryingWriteText(model_Number_Search_Field, modelNumberFromExcel);
	}
	public void clear_model_Number_Search_Field() {
		model_Number_Search_Field.clear();
	}
	
	
	@FindBy(xpath="//input[@placeholder='Product Subcategory']")
	private WebElement product_Subcategory;
	
	public void write_On_product_Subcategory_Search_Field(String productSubcategoryFromExcel) {
		webUtil.retryingWriteText(product_Subcategory, productSubcategoryFromExcel);
	}
	public void clear_product_Subcategory_Search_Field() {
		product_Subcategory.clear();
	}
	
	@FindBy(xpath="//input[@placeholder='Product Manufacturer']")
	private WebElement product_Manufacturer;
	
	public void write_On_product_Manufacturer_Search_Field(String productManufacturerFromExcel) {
		webUtil.retryingWriteText(product_Manufacturer, productManufacturerFromExcel);
	}
	public void clear_product_Manufacturer_Search_Field() {
		product_Subcategory.clear();
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
	
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private WebElement modelNumberInRecordTable;
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	public List<WebElement> listOfmodelNumberInRecordTable;

	public String getTheTextOf_modelNumberInRecordTable() {
		String text = webUtil.getTheTextFromUI(modelNumberInRecordTable);
		return text;
	}
	
	@FindBy(xpath = "//table/tbody/tr/td[2]")
	private WebElement prodcutSubCategoryInRecordTable;
	
	@FindBy(xpath = "//table/tbody/tr/td[2]")
	public List<WebElement> listOfProductSubCategoryInRecordTable;

	public String getTheTextOf_product_Subcategory_InRecordTable() {
		String text = webUtil.getTheTextFromUI(prodcutSubCategoryInRecordTable);
		return text;
	}
	
	@FindBy(xpath = "//table/tbody/tr/td[3]")
	private WebElement prodcutanufacturerInRecordTable;
	
	@FindBy(xpath = "//table/tbody/tr/td[3]")
	public List<WebElement> listOfProductManufacturerInRecordTable;

	public String getTheTextOf_product_Manufacturer_InRecordTable() {
		String text = webUtil.getTheTextFromUI(prodcutanufacturerInRecordTable);
		return text;
	}
	

	@FindBy(xpath = "//input[@placeholder='Product Category']")
	private WebElement productCategory_Search_Field;
	public List<WebElement> productCategory_List_in_Table;
	
	@FindBy(xpath="//tr[@ng-reflect-name='1']/descendant::input[@placeholder='Category Name']")
	private WebElement productCategory_Search_Field2;
	
	public void write_On_productCategory_Search_Field(String productCategoryFromExcel) {
		webUtil.retryingWriteText(productCategory_Search_Field, productCategoryFromExcel);
	}

	@FindBy(xpath = "//input[@placeholder='Enter Model Number']")
	private WebElement modelNumber_EditBox;

	public void write_On_modelNumber_EditBox(String modelNumberFromExcel) {
		webUtil.retryingWriteText(modelNumber_EditBox, modelNumberFromExcel);
	}
	@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[4]/ng2-st-tbody-edit-delete/img[@class='edit']")
	private WebElement edit_Image_link;

	public void click_On_edit_Image_Link() throws InterruptedException {
		webUtil.retryingFindClick(edit_Image_link);
	}
	
	@FindBy(xpath = "//ui-label[label[text()='Default']]/following-sibling::p-radiobutton[@value='1']//div[@class='ui-radiobutton ui-widget']/div[2]")
	private WebElement defaultRadioBtn;
	
	public boolean verifyDefaultRadioBtnDisplay() {
		boolean rt = defaultRadioBtn.isSelected();
		if(rt) {
			System.out.println("The default radio button is selected...");
			return rt;
		}else {
			System.out.println("The default radio button is not selected....");
		}
		return false;
	}
	
	public void click_On_Default_Radio_Button() throws InterruptedException {
		webUtil.retryingFindClick(defaultRadioBtn);
	}
		
	@FindBy(xpath = "//ui-label[label[text()='Model']]/following-sibling::p-radiobutton//div[@class='ui-radiobutton ui-widget']/div[2]")
	public WebElement modelRadioBtn;
	
	public boolean verifyModelRadioBtnDisplay() {
		boolean rt = modelRadioBtn.isSelected();
		if(rt) {
			System.out.println("The model radio button is selected...");
			return rt;
		}else {
			System.out.println("The radio button is not selected....");
		}
		return false;
	}
	
	public void click_On_Model_Radio_Btn() throws InterruptedException {
			webUtil.retryingFindClick(modelRadioBtn);
	}
	
	public void doThePartialSearch(List<WebElement> listOfmodelNumberInRecordTable2, String partialText) {
		
	}
	
	public void doTheInvalidSearch(List<WebElement> listOfmodelNumberInRecordTable2, String invalidModelNumberText) {
		
	}

	}

