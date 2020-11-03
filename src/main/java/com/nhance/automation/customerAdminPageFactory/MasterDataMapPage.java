package com.nhance.automation.customerAdminPageFactory;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.EnvironmentVariablesForWeb;
import com.nhance.automation.webGenericLibrary.ExcelLibrary;
import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class MasterDataMapPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();
	
	public MasterDataMapPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Master Data Mapping')]")
	private WebElement masterDataMappingLink;
	
	public void click_On_MasterDataMapping_Link() throws InterruptedException {
		webUtil.retryingFindClick(masterDataMappingLink);
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productCategory']//div[@class='c-btn']")
	private WebElement productCategory;
	
	public void click_On_ProductCategory_Box() throws InterruptedException {
		webUtil.retryingFindClick(productCategory);
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCategories']//div[@class='c-btn']")
	private WebElement productSubcategory;
	
	public void click_On_ProductSubCategory_Box() throws InterruptedException {
		webUtil.retryingFindClick(productSubcategory);
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='manufacturers']//div[@class='c-btn']")
	private WebElement productManufacturer;
	
	public void click_On_ProductManufacturer_Box() throws InterruptedException {
		webUtil.retryingFindClick(productManufacturer);
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productCategory']//div[@class='list-area']//div//input")
	private WebElement productCategorySearchField;
	
	public void write_On_ProductCategorySearchField(String categoryFromExcel) throws InterruptedException {
			
		webUtil.retryingWriteText(productCategorySearchField, categoryFromExcel);
	}
	
	@FindBy(xpath = "//angular2-multiselect[@formcontrolname='productSubCategories']//div[@class='list-filter']//input")
	private WebElement productSubCategorySearchField;
	
	public void write_On_ProductSubCategorySearchField(String subCategoryFromExcel) {
		webUtil.retryingWriteText(productSubCategorySearchField, subCategoryFromExcel);
	}
	
	
	 @FindBy(xpath = "//angular2-multiselect[@formcontrolname='manufacturers']//div[@class='list-filter']//input")
	 private WebElement productManufacturerSearchField;
	 
	 public void write_On_ProductManufacturerSearchField(String manufacturerFromExcel) {
			webUtil.retryingWriteText(productManufacturerSearchField, manufacturerFromExcel);
		}
	 
	 
	 @FindBy(xpath = "//ui-label[label[text()='Product Category']]/following-sibling::div//div[@class='list-area']//ul//li//label")
	 private List<WebElement> categoryList;
	 
	 public void select_Required_Category(String categoryFromExcel) {
		 System.out.println("Size of the Category List is : "+categoryList.size());
		 for (int i = 0; i < categoryList.size(); i++) 
		 {
			 System.out.println("The List Of Category are : " + categoryList.get(i).getText());
				if (categoryList.get(i).getText().trim().equals(categoryFromExcel.trim())) 
				{
					categoryList.get(i).click();
					break;
				} else 
				{
					System.out.println("There is not match.....");
				}
			}
	 }
	 
	 @FindBy(xpath = "//div[ui-label[label[text()='Product Subcategory']]]//div//input[@type='checkbox']/following-sibling::label")
	 private List<WebElement> subCategoryCheckboxList;
	 
	 @FindBy(xpath = "//ui-label[label[text()='Product Subcategory']]/following-sibling::div//div[@class='list-area']//ul//li//label")
	 private List<WebElement> subcategoryList;
	 
		 
	 public void select_Required_Subcategory(String subCategoryFromExcel) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		/* for (int i = 0; i < subcategoryList.size(); i++) 
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
		 int countCheckBox = subcategoryList.size();
			System.out.println("The total checkboxed are "+countCheckBox);
					for(int i=0;i<2;i++) 
					{
				String subcategoryText = subcategoryList.get(i).getText();
				System.out.println("The List Of Product SubCategory are : " + subcategoryText);
				subcategoryList.get(i).click();
					ExcelLibrary.setExcelData(EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
							EnvironmentVariablesForWeb
									.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA),
							4, i, subcategoryText);
					
				}
	 }
	 
	
	 public void select_Required_Subcategory_InitialSetUp(String subCategoryFromExcel) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
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
				}
	 }
	 
	 
	@FindBy(xpath = "//div[ui-label[label[text()='Product Manufacturer']]]//div//input[@type='checkbox']")
	private  List<WebElement> manufacturerCheckBoxList;
	
	@FindBy(xpath = "//ui-label[label[text()='Product Manufacturer']]/following-sibling::div//div[@class='list-area']//ul//li//label")
	private  List<WebElement> manufacturerList;
	
	
	 public void select_Required_Manufacturer(String manufacturerFromExcel) {
		 for (int i = 0; i < manufacturerList.size(); i++) 
		 {
			 System.out.println("The List Of Manufacturer are : " + manufacturerList.get(i).getText());
				if (manufacturerList.get(i).getText().trim().equals(manufacturerFromExcel.trim())) 
				{
					manufacturerList.get(i).click();
					break;
				} else 
				{
					System.out.println("There is not match.....");
				}
			}
	 }
	 
	 
	 @FindBy(xpath = "//ui-selectbox[@formcontrolname='productCatName']/select")
		private WebElement productCategorySelectBox;
	 
	 public void click_On_Product_Category_SelectBox() throws InterruptedException {
		 webUtil.retryingFindClick(productCategorySelectBox);
	 }
	 
	 public void selectProductCategory(String productCategoryFromExcel) {
			webUtil.selectByVisibletext(productCategorySelectBox, productCategoryFromExcel);
		}
	 
	 @FindBy(xpath = "//ui-selectbox[@formcontrolname='productCatName']/select/option")
	 private List<WebElement> productCategoryList;
	 
	 
	 public String getThe_Value_Of_selectedProductCategoryInProductManagementPage(String categoryFromExcel) throws InterruptedException {
		 String optionText = "";
		 for(int i=0;i<productCategoryList.size();i++)
			{
				System.out.println("The Total size is : "+ productCategoryList.size());
			if (productCategoryList.get(i).getText().trim().equals(categoryFromExcel.trim())) {
				Testlistener.log("The Product Category from Auto Suggest box is : "+ categoryFromExcel);
				System.out.println("The Product Category from Auto Suggest box is : "+ categoryFromExcel);
				Testlistener.log("The Product Category matched from Auto Suggest box");
				System.out.println("The Product Category matched from Auto Suggest box...");
				Thread.sleep(2000);
				 optionText = productCategoryList.get(i).getText();
				Thread.sleep(2000);
				break;
				
			}
			else
			{ 
				Testlistener.log("The Product Category from Auto Suggest box is...."+ categoryFromExcel);
				Testlistener.log("The Product Category is not matched from Auto Suggest box ...");
			}
			
		}
		 return optionText;
		 }
	  
	 @FindBy(xpath = "//ui-selectbox[@formcontrolname='productSubCatName']/select")
		private WebElement productSubCategorySelectBox;
	 
	 public void click_On_Product_SubCategory_SelectBox() throws InterruptedException {
		 webUtil.retryingFindClick(productSubCategorySelectBox);
	 }
	 
	 public void selectProductSubCategory(String productSubCategoryFromExcel) {
			webUtil.selectByVisibletext(productSubCategorySelectBox, productSubCategoryFromExcel);
		}
	 
	 @FindBy(xpath = "//ui-selectbox[@formcontrolname='productSubCatName']/select/option")
	 private List<WebElement> productSubCategoryList;
	 
	 
	 public String getThe_Value_Of_selectedProductSubCategoryInProductManagementPage(String subCategoryFromExcel) throws InterruptedException {
		 String optionText = "";
		 System.out.println("The Total size is : "+ productSubCategoryList.size());
		 for(int i=0;i<productSubCategoryList.size();i++)
			{
			if (productCategoryList.get(i).getText().trim().equals(subCategoryFromExcel.trim())) {
				Testlistener.log("The Product SubCategory from Auto Suggest box is : "+ subCategoryFromExcel);
				System.out.println("The Product SubCategory from Auto Suggest box is : "+ subCategoryFromExcel);
				Testlistener.log("The Product SubCategory matched from Auto Suggest box");
				System.out.println("The Product SubCategory matched from Auto Suggest box...");
				Thread.sleep(2000);
				 optionText = productSubCategoryList.get(i).getText();
				Thread.sleep(2000);
				break;
				
			}
			else
			{ 
				Testlistener.log("The Product SubCategory from Auto Suggest box is...."+ subCategoryFromExcel);
				Testlistener.log("The Product SubCategory is not matched from Auto Suggest box ...");
			}
			
		}
		 return optionText;
		 }
	 
	 
	 @FindBy(xpath = "//ui-selectbox[@formcontrolname='manufacturerName']/select")
		private WebElement productManufacturerSelectBox;
	 
	 public void click_On_Product_Manufacturer_SelectBox() throws InterruptedException {
		 webUtil.retryingFindClick(productManufacturerSelectBox);
	 }
	 
	 public void selectmanufacturerSelectBox(String manufaturerFromExcel) {
			webUtil.selectByVisibletext(productManufacturerSelectBox, manufaturerFromExcel);
		}

	 
	 @FindBy(xpath = "//ui-selectbox[@formcontrolname='manufacturerName']/select/option")
	 private List<WebElement> productManufacturerList;
	 
	 
	 public String getThe_Value_Of_selectedProductManufacturerInProductManagementPage(String manufacturerFromExcel) throws InterruptedException {
		 String optionText = "";
		 for(int i=0;i<productManufacturerList.size();i++)
			{
				System.out.println("The Total size is : "+ productManufacturerList.size());
			if (productCategoryList.get(i).getText().trim().equals(manufacturerFromExcel.trim())) {
				Testlistener.log("The Product Manufacturer from Auto Suggest box is : "+ manufacturerFromExcel);
				System.out.println("The Product Manufacturer from Auto Suggest box is : "+ manufacturerFromExcel);
				Testlistener.log("The Product Manufacturer matched from Auto Suggest box");
				System.out.println("The Product Manufacturer matched from Auto Suggest box...");
				Thread.sleep(2000);
				 optionText = productManufacturerList.get(i).getText();
				Thread.sleep(2000);
				break;
				
			}
			else
			{ 
				Testlistener.log("The Product Manufacturer from Auto Suggest box is...."+ manufacturerFromExcel);
				Testlistener.log("The Product Manufacturer is not matched from Auto Suggest box ...");
			}
			
		}
		 return optionText;
		 }
	 
	 @FindBy(xpath = "//input[@placeholder='Product Category']")
	 private WebElement productCategorySearchBox;
	 
	 public void write_On_Product_Category_SearchBox(String categoryFromExcel) {
		 webUtil.retryingWriteText(productCategorySearchBox, categoryFromExcel);
	 }
	 
	 @FindBy(xpath = "//input[@placeholder='Product Subcategory']")
	 private WebElement productSubcategorySearchBox;
	 
	 public void write_On_Product_Subcategory_SearchBox(String subCategoryFromExcel) {
		 webUtil.retryingWriteText(productSubcategorySearchBox, subCategoryFromExcel);
	 }
	 
	
	 @FindBy(xpath = "//input[@placeholder='Product Manufacturer']")
	 private WebElement productManufacturerSearchBox;
	 
	 public void write_On_Product_Manufacturer_SearchBox(String manufacturerFromExcel) {
		 webUtil.retryingWriteText(productManufacturerSearchBox, manufacturerFromExcel);
	 } 
	 
	 
	
	 @FindBy(xpath = "//table/tbody/tr/td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
		public List<WebElement> productCategory_List_in_Table;
	
		@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
		public List<WebElement> productSubCategory_List_in_Table;
		
		@FindBy(xpath = "//table/tbody/tr/td[1]/following-sibling::td[2]/ng2-smart-table-cell/table-cell-view-mode/div/div")
		public List<WebElement> manufacturer_List_in_Table;
	 
	 
}
