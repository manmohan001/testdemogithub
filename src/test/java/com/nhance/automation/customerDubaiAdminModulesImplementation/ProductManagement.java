package com.nhance.automation.customerDubaiAdminModulesImplementation;

import java.io.IOException;
import java.util.Map;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.nhance.automation.customerAdminBase.BaseFeatureOfNhanceCustomerAdmin;
import com.nhance.automation.customerAdminBase.BaseTest;
import com.nhance.automation.dubaiCustomerAdminPageFactory.CustomerAdminCommonWebElementInAllPage;
import com.nhance.automation.dubaiCustomerAdminPageFactory.ProductManagementPage;
import com.nhance.automation.enumFiles.Product_specific_identifier;
import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.EnvironmentVariablesForWeb;
import com.nhance.automation.webGenericLibrary.ExcelLibrary;
import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill_For_Dubai;


/**
 * @author Manmohan
 *
 */
public class ProductManagement extends BaseTest implements BaseFeatureOfNhanceCustomerAdmin {

	WebDriverCommonUtill_For_Dubai webCmnUtil;
	BusinessFunctionWebSpecific bFuction;
	CustomerAdminCommonWebElementInAllPage cmnElement;
	ProductManagementPage productPage;
	WebDriverWait wait;
	String productCategoryFromExcel;
	String SubCategory;
	String subCategory2;
	String manufacturerFromExcel;
	String modelNumberFromExcel;
	String descriptionFromExcel;
	String updatedDescriptionFromExcel;
	String warrantyPeriodFromExcel;
	String updatedWarrantyFromExcel;
	String videoDocumentTypeFromExcel;
	String updatevideoDocumentTypeFromExcel;
	String videodocumentNameFromExcel;
	String updatevideodocumentNameFromExcel;
	String manualdocumentTypeFromExcel;
	String updated_manualdocumentTypeFromExcel;
	String VideoURLFromExcel;
	String updated_VideoURLFromExcel;
	String fileUpload_fileDetailsFromExcel;
	String documentNameFromExcel;
	String second_documentNameFromExcel = "SecondManualGuide";
	String updated_second_documentNameFromExcel = "UpdatedSecondManualGuide";
	String thrid_documentNameFromExcel = "ThirdManualGuide";
	String updated_thrid_documentNameFromExcel = "UpdatedThirdManualGuide";
	String URL_fileDetailsFromExcel;
	String updated_URL_fileDetailsFromExcel;
	String titleFromExcel;
	String durationFromExcel;
	String messageFromExcel;
	String runsAtFromExcel;
	String serviceTypeFromExcel;
	String timeZoneFromExcel;
	String priceFromExcel;
	String URLFromExcel;
	String updated_URLFromExcel;
	String attributeCode;
	String propertyNameFromExcel;
	String dataTypeFromExcel;
    String mandatoryOptionFromExcel;
	String updatedrunsAtFromExcel;
	String updatedtitleFromExcel;
	String updatedmessageFromExcel;
	String updateddurationFromExcel;
	String updatedtimeZoneFromExcel;
	String updatedserviceTypeFromExcel;
	String updatedpriceFromExcel;
	String upadtedattributeCode;
	String updatedpropertyName;
	String updatedDataType;
	String updatedMandatoryType;
	String partialText;
	String getTheTotalCount;
	String nodatafoundText;
	String infoUrlFromExcel;
	String listingCategoryFromExcel;

	
	@Override
	public void moduleSpecificSetUp(Map<String, String> map)
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		Integer productSpecificSetUp = Integer.parseInt(map.get(Product_specific_identifier.PRODUCT_SET_UP.getName()));
		if (productSpecificSetUp == Product_specific_identifier.PRODUCT_SET_UP.getCode()) {
			productSpecificSetup();
		}
	}

	@Override
	public void addTest(Map<String, String> map) throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		Integer addproduct = Integer.parseInt(map.get(Product_specific_identifier.ADD_PRODUCT.getName()));
		if (addproduct == Product_specific_identifier.ADD_PRODUCT.getCode()) {
			addProducts();
		}
	}

	@Override
	public void checkDuplicateTest(Map<String, String> map) throws InterruptedException {
		Integer duplicateProduct = Integer.parseInt(map.get(Product_specific_identifier.DUPLICATE_PRODUCT.getName()));
		if (duplicateProduct == Product_specific_identifier.DUPLICATE_PRODUCT.getCode()) {
			product_Duplicate_Test();
		}
	}

	@Override
	public void inLineSearchTest(Map<String, String> map) throws InterruptedException {
		Integer inlineSearchForProduct = Integer.parseInt(map.get(Product_specific_identifier.INLINE_SEARCH_IN_PRODUCT.getName()));
		if (inlineSearchForProduct == Product_specific_identifier.INLINE_SEARCH_IN_PRODUCT.getCode()) {
			product_inline_Search_By_all_Search_Field();
		}
	}

	@Override
	public void validate_All_Field_For_Added_Item(Map<String, String> map) throws InterruptedException {
		Integer validateAddProductAllField = Integer.parseInt(map.get(Product_specific_identifier.VALIDATE_PRODUCT.getName()));
		if (validateAddProductAllField == Product_specific_identifier.VALIDATE_PRODUCT.getCode()) {
			search_And_Validate_All_The_Field_Data_For_Added_Product_In_Product_Edit_Page();
		}
	}

	@Override
	public void editTest(Map<String, String> map)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Integer editProduct = Integer.parseInt(map.get(Product_specific_identifier.EDIT_PRODUCT.getName()));
		if (editProduct == Product_specific_identifier.EDIT_PRODUCT.getCode()) {
			search_And_Edit_All_The_Field_In_Product_Edit_Page_For_ParticularProduct();
		}
	}

	@Override
	public void deleteTest(Map<String, String> map) throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		Integer editProduct = Integer.parseInt(map.get(Product_specific_identifier.DELETE_PRODUCT.getName()));
		if (editProduct == Product_specific_identifier.DELETE_PRODUCT.getCode()) {
			delete_The_Added_Product();
		}
	}

	void productSpecificSetup()
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		webCmnUtil = new WebDriverCommonUtill_For_Dubai();
		bFuction = new BusinessFunctionWebSpecific();
		cmnElement = new CustomerAdminCommonWebElementInAllPage(getDubaiDriver());
		productPage = new ProductManagementPage(getDubaiDriver());
	
		
		cmnElement.click_on_nhance_Logo_Link();
		Thread.sleep(2000);
		cmnElement.click_On_Configure_Link();
		webCmnUtil.implicitWait();
		if(cmnElement.productManagementLinkDisplay()) {
		cmnElement.click_productManagemnet_Menu_Link();
		webCmnUtil.implicitWait();
		}else {
			cmnElement.click_On_Configure_Link();
			webCmnUtil.implicitWait();
			cmnElement.click_productManagemnet_Menu_Link();
			webCmnUtil.implicitWait();	
		}
		
		
		productCategoryFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 1,
				1);
		SubCategory = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 3,
				1);
		subCategory2 = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 4,
				0);
		manufacturerFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 5,
				1);
		modelNumberFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 7,
				1);
		descriptionFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 9,
				1);
		
		updatedDescriptionFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 9,
				2);
		
		warrantyPeriodFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 11,
				1);
		
		updatedWarrantyFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 11,
				2); 
				
		videoDocumentTypeFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 14,
				1);
		updatevideoDocumentTypeFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 14,
				2);
		videodocumentNameFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 16,
				1);
		updatevideodocumentNameFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 16,
				2);
		manualdocumentTypeFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 13,
				1);
		updated_manualdocumentTypeFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 13,
				2);
		VideoURLFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 20,
				1);
		updated_VideoURLFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 20,
				2);
		documentNameFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 15,
				1);
		URL_fileDetailsFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 17,
				1);
		updated_URL_fileDetailsFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 17,
				2);
		fileUpload_fileDetailsFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 18,
				1);
		titleFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 21,
				1);
		durationFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 23,
				1);
		messageFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 25,
				1);
		runsAtFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 27,
				1);
		serviceTypeFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 29,
				1);
		timeZoneFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 33,
				1);
		priceFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 31,
				1);
		URLFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 19,
				1);
		updated_URLFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 19,
				2);
		attributeCode = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 35,
				1);
		propertyNameFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 37,
				1);
		dataTypeFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 39,
				1);
		mandatoryOptionFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 41,
				1);
		updatedtitleFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 21,
				2);
		updateddurationFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 23,
				2);
		updatedmessageFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 25,
				2);
		updatedrunsAtFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 27,
				2);
		updatedtimeZoneFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 33,
				2);
		updatedserviceTypeFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 29,
				2);
		updatedpriceFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 31,
				2);
		upadtedattributeCode = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 35,
				2);
		updatedpropertyName = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 37,
				2);
		updatedDataType = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 39,
				2);
		updatedMandatoryType = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 41,
				2);
		
		infoUrlFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 43,
				1);

		listingCategoryFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 45,
				1);

	}
	
	
	
	public void addProducts_for_delete() throws InterruptedException, IOException, InvalidFormatException {

		cmnElement.click_plus_Sign_Link_For_Adding();
		webCmnUtil.implicitWait();
		productPage.click_On_ProductCategory();
		webCmnUtil.implicitWait();
		productPage.write_On_Category_Search(productCategoryFromExcel);
		
		productPage.select_CategoryFromSearch(productCategoryFromExcel);
		webCmnUtil.implicitWait();
		/*productPage.selectProductCategory(productCategoryFromExcel);*/
		
		productPage.click_On_Product_SubCategory();
		Testlistener.log("Sub Category Fetched From Excel is : " + SubCategory);
		webCmnUtil.implicitWait();
		productPage.write_OnSubCategorySearch(SubCategory);
		
		productPage.select_SubCategoryFromSearch(SubCategory);
		
		//Thread.sleep(1000);
		productPage.click_On_ProductManufacturer();
		
		Testlistener.log("Manufacturer Fetched From Excel is : " + manufacturerFromExcel);
		webCmnUtil.implicitWait();
		productPage.write_OnManufacturerSearch(manufacturerFromExcel);
		//Thread.sleep(1000);
		productPage.select_ManufacturerFromSearch(manufacturerFromExcel);
		webCmnUtil.implicitWait();
		
		productPage.write_On_modelNumber_EditBox(modelNumberFromExcel);
		Testlistener.log("Model Number Fetched From Excel is : " + modelNumberFromExcel);
		productPage.write_On_description_EditBox(descriptionFromExcel);
		Testlistener.log("Description Fetched From Excel is : " + descriptionFromExcel);
		productPage.write_On_warrantyPeriod_EditBox(warrantyPeriodFromExcel);
		Testlistener.log("Warranty Period Fetched From Excel is : " + warrantyPeriodFromExcel);
		//Thread.sleep(1000);
		productPage.click_On_productImage_Attach_Btn();
		webCmnUtil.implicitWait();
		//Thread.sleep(1000);
		webCmnUtil.fileUpload((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.PRODUCT_IMAGE_PATH_FILE_TO_ATTACH));
		webCmnUtil.implicitWait();
		Thread.sleep(4000);
		Testlistener.log("Product Image Attached Sucessfully...");
		
		cmnElement.click_On_Save_Btn_In_Adding();
		Testlistener.log("Clicked On click_On_Save_Btn_In_Adding");
		webCmnUtil.implicitWait();
		//Thread.sleep(5000);
		String popUpMessage = bFuction.click_On_OK_BUtton_And_CaptureThe_POPUpMessage(
				"Done! Product details have been added to our database");
		Testlistener
				.log("The Actual Pop Up message Captured from UI after clikcing on Save button is : " + popUpMessage);

	}
	
	public void AddTheSameProductWithDifferentSubcategory() throws InterruptedException, IOException {
		
		
		cmnElement.click_productManagemnet_Menu_Link();
		webCmnUtil.implicitWait();		
		cmnElement.click_plus_Sign_Link_For_Adding();
		webCmnUtil.implicitWait();

		productPage.click_On_ProductCategory();
		webCmnUtil.implicitWait();
		productPage.write_On_Category_Search(productCategoryFromExcel);
		
		productPage.select_CategoryFromSearch(productCategoryFromExcel);
		webCmnUtil.implicitWait();
		
		productPage.click_On_Product_SubCategory();
		Testlistener.log("Sub Category Fetched From Excel is : " + subCategory2);
		System.out.println("Sub Category Fetched From Excel is : " + subCategory2);
		webCmnUtil.implicitWait();
		productPage.write_OnSubCategorySearch(subCategory2);
		
		productPage.select_SubCategoryFromSearch(subCategory2);
		
		//Thread.sleep(1000);
		productPage.click_On_ProductManufacturer();
		
		Testlistener.log("Manufacturer Fetched From Excel is : " + manufacturerFromExcel);
		webCmnUtil.implicitWait();
		productPage.write_OnManufacturerSearch(manufacturerFromExcel);
		//Thread.sleep(1000);
		productPage.select_ManufacturerFromSearch(manufacturerFromExcel);
		webCmnUtil.implicitWait();
		
		productPage.write_On_modelNumber_EditBox(modelNumberFromExcel);
		Testlistener.log("Model Number Fetched From Excel is : " + modelNumberFromExcel);
		productPage.write_On_description_EditBox(descriptionFromExcel);
		Testlistener.log("Description Fetched From Excel is : " + descriptionFromExcel);
		productPage.write_On_warrantyPeriod_EditBox(warrantyPeriodFromExcel);
		Testlistener.log("Warranty Period Fetched From Excel is : " + warrantyPeriodFromExcel);
		//Thread.sleep(1000);
		productPage.click_On_productImage_Attach_Btn();
		webCmnUtil.implicitWait();
		//Thread.sleep(1000);
		webCmnUtil.fileUpload((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.PRODUCT_IMAGE_PATH_FILE_TO_ATTACH));
		webCmnUtil.implicitWait();
		Thread.sleep(4000);
		Testlistener.log("Product Image Attached Sucessfully...");
		
		cmnElement.click_On_Save_Btn_In_Adding();
		Testlistener.log("Clicked On click_On_Save_Btn_In_Adding");
		webCmnUtil.implicitWait();
		//Thread.sleep(5000);
		String popUpMessage = bFuction.click_On_OK_BUtton_And_CaptureThe_POPUpMessage(
				"Done! Product details have been added to our database");
		Testlistener
				.log("The Actual Pop Up message Captured from UI after clikcing on Save button is : " + popUpMessage);

		
	}
	

	private void addProducts() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		

		cmnElement.click_plus_Sign_Link_For_Adding();
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();
/*		productPage.selectProductCategory(productCategoryFromExcel);
*/		//Thread.sleep(1000);
		productPage.click_On_ProductCategory();
		webCmnUtil.implicitWait();
		productPage.write_On_Category_Search(productCategoryFromExcel);
		
		productPage.select_CategoryFromSearch(productCategoryFromExcel);
		webCmnUtil.implicitWait();
		productPage.click_On_Product_SubCategory();
		Testlistener.log("Sub Category Fetched From Excel is : " + SubCategory);
		webCmnUtil.implicitWait();
		productPage.write_OnSubCategorySearch(SubCategory);
		
		productPage.select_SubCategoryFromSearch(SubCategory);
		
		//Thread.sleep(1000);
		productPage.click_On_ProductManufacturer();
		
		Testlistener.log("Manufacturer Fetched From Excel is : " + manufacturerFromExcel);
		webCmnUtil.implicitWait();
		productPage.write_OnManufacturerSearch(manufacturerFromExcel);
		//Thread.sleep(1000);
		productPage.select_ManufacturerFromSearch(manufacturerFromExcel);
		webCmnUtil.implicitWait();
		productPage.write_On_modelNumber_EditBox(modelNumberFromExcel);
		Testlistener.log("Model Number Fetched From Excel is : " + modelNumberFromExcel);
		productPage.write_On_description_EditBox(descriptionFromExcel);
		Testlistener.log("Description Fetched From Excel is : " + descriptionFromExcel);
		productPage.write_On_warrantyPeriod_EditBox(warrantyPeriodFromExcel);
		Testlistener.log("Warranty Period Fetched From Excel is : " + warrantyPeriodFromExcel);
		//Thread.sleep(1000);
		webCmnUtil.implicitWait();
		productPage.click_On_productImage_Attach_Btn();
		webCmnUtil.implicitWait();
		//Thread.sleep(1000);
		webCmnUtil.fileUpload((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.PRODUCT_IMAGE_PATH_FILE_TO_ATTACH));
		Thread.sleep(4000);
		Testlistener.log("Product Image Attached Sucessfully...");
		// Documents Section
		productPage.click_documents_Link();
		Testlistener.log("Clicked On Documents_header_Link");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();

		// Add 1st Row Document
		productPage.selectdocumentTypeSelectBox(videoDocumentTypeFromExcel);
		Testlistener.log("Document Type Fetched From Excel is : " + videoDocumentTypeFromExcel);
		productPage.write_On_documentName_EditBox(videodocumentNameFromExcel);
		Testlistener.log("Document Name Fetched From Excel is : " + videodocumentNameFromExcel);
		productPage.write_enterUrl_EditBox(VideoURLFromExcel);
		Testlistener.log("URL Fetched From Excel is : " + VideoURLFromExcel);
		//Thread.sleep(1000);
		webCmnUtil.implicitWait();
		productPage.click_On_plus_Sign_In_Document_Section();
		Testlistener.log("clicked on + sign in Documents Section for adding one more row ");
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();
		// Add 2nd Row Document
		productPage.select_second_documentTypeSelectBox(manualdocumentTypeFromExcel);
		Testlistener.log("Second Document Type Fetched From Excel is : " + manualdocumentTypeFromExcel);
		productPage.write_On_seocnd_documentName_EditBox(second_documentNameFromExcel);
		Testlistener.log("Second Document Name Fetched From Excel is : " + second_documentNameFromExcel);
		productPage.select_Second_fileUploadType_SelectBox(URL_fileDetailsFromExcel);
		Testlistener.log("File Details Fetched From Excel is : " + URL_fileDetailsFromExcel);
		productPage.write_second_enterUrl_EditBox(URLFromExcel);
		Testlistener.log(" URL Fetched From Excel  for second Document is : " + URLFromExcel);

		productPage.click_On_plus_Sign_In_Document_Section();
		Testlistener.log("clicked on + sign in Documents Section for adding one more row ");
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();

		// Add 3rd Row Document
		productPage.select_third_documentTypeSelectBox(manualdocumentTypeFromExcel);
		Testlistener.log("Third Document Type Fetched From Excel is : " + manualdocumentTypeFromExcel);
		productPage.write_On_third_documentName_EditBox(thrid_documentNameFromExcel);
		Testlistener.log("Third Document Name Fetched From Excel is : " + thrid_documentNameFromExcel);
		productPage.select_third_fileUploadType_SelectBox(fileUpload_fileDetailsFromExcel);
		Testlistener.log("File Details Fetched From Excel is : " + fileUpload_fileDetailsFromExcel);
		productPage.click_third_attachFile_EditBox_and_Browse_The_File_To_Upload((String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.DOCS_ATTACHFILEPATH));
		Thread.sleep(1000);
		webCmnUtil.implicitWait();
		productPage.click_documents_Link();
		Testlistener.log("Clicked On Documents_header_Link after entering all data");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();
		// Events Section
		productPage.click_On_events_Header_Link();
		Testlistener.log("Clicked On events_Header_Link");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();
		productPage.write_On_title_EditBox(titleFromExcel);
		Testlistener.log("Title Fetched From Excel is : " + titleFromExcel);
		productPage.write_On_Duration_EditBox(durationFromExcel);
		Testlistener.log("Duration Fetched From Excel is : " + durationFromExcel);
		productPage.write_On_Message_EditBox(messageFromExcel);
		Testlistener.log("Message Fetched From Excel is : " + messageFromExcel);
		productPage.write_On_runsAt_EditBox(runsAtFromExcel);
		Testlistener.log("Runs At  Fetched From Excel is : " + runsAtFromExcel);
		productPage.select_TimeZone_SelectBox(timeZoneFromExcel);
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();
		productPage.click_On_events_Header_Link();
		Testlistener.log("Clicked On events_Header_Link after entering all data ");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();
		// Service Charge Section
		productPage.click_On_Service_Charge_Header_Link();
		Testlistener.log("Clicked On serviceCharge_Header_Link");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();
		productPage.select_service_Type_SelectBox(serviceTypeFromExcel);
		Testlistener.log("Service Type Fetched From Excel is : " + serviceTypeFromExcel);
		productPage.write_Amount_EditBox(priceFromExcel);
		Testlistener.log("Price Fetched From Excel is : " + priceFromExcel);
		productPage.click_On_Service_Charge_Header_Link();
		Testlistener.log("Clicked On serviceCharge_Header_Link after entering all data ");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();

		// Additional Info Section
		productPage.click_On_custom_Header_Link();
		Testlistener.log("Clicked On click On Custom Header Link");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();
		productPage.write_In_PropertyName_EditBox(propertyNameFromExcel);
		productPage.select_dataType_SelectBox(dataTypeFromExcel);
		productPage.select_IsMandatory_SelectBox(mandatoryOptionFromExcel);

		productPage.click_On_custom_Header_Link();
		Testlistener.log("Clicked On click_On_Customer_Header_Link after entering all data in Additional Info Section");
		
		/*productPage.click_On_Additional_Info_Link();
		webCmnUtil.implicitWait();
		productPage.write_On_Enter_Info_Url(infoUrlFromExcel);
		
		productPage.write_On_Listing_Category(listingCategoryFromExcel);
		productPage.click_On_Additional_Info_Link();*/
		webCmnUtil.implicitWait();
		
		cmnElement.click_On_Save_Btn_In_Adding();
		Testlistener.log("Clicked On click_On_Save_Btn_In_Adding");
		webCmnUtil.implicitWait();
		//Thread.sleep(5000);
		String popUpMessage = bFuction.click_On_OK_BUtton_And_CaptureThe_POPUpMessage(
				"Done! Product details have been added to our database");
		Testlistener
				.log("The Actual Pop Up message Captured from UI after clikcing on Save button is : " + popUpMessage);

	}

	private void product_Duplicate_Test() throws InterruptedException {
		cmnElement.click_plus_Sign_Link_For_Adding();
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();
		
		productPage.click_On_ProductCategory();
		webCmnUtil.implicitWait();
		productPage.write_On_Category_Search(productCategoryFromExcel);
		
		productPage.select_CategoryFromSearch(productCategoryFromExcel);
		webCmnUtil.implicitWait();
		
		//Thread.sleep(1000);
		productPage.click_On_Product_SubCategory();
		Testlistener.log("Sub Category Fetched From Excel is : " + SubCategory);
		webCmnUtil.implicitWait();
		productPage.write_OnSubCategorySearch(SubCategory);
		
		productPage.select_SubCategoryFromSearch(SubCategory);
		
		//Thread.sleep(1000);
		productPage.click_On_ProductManufacturer();
		
		Testlistener.log("Manufacturer Fetched From Excel is : " + manufacturerFromExcel);
		webCmnUtil.implicitWait();
		productPage.write_OnManufacturerSearch(manufacturerFromExcel);
		//Thread.sleep(1000);
		productPage.select_ManufacturerFromSearch(manufacturerFromExcel);
		webCmnUtil.implicitWait();
		productPage.write_On_modelNumber_EditBox(modelNumberFromExcel);
		Testlistener.log("Model Number Fetched From Excel is : " + modelNumberFromExcel);
		productPage.write_On_description_EditBox(descriptionFromExcel);
		Testlistener.log("Description Fetched From Excel is : " + descriptionFromExcel);
		productPage.write_On_warrantyPeriod_EditBox(warrantyPeriodFromExcel);
		Testlistener.log("Warranty Period Fetched From Excel is : " + warrantyPeriodFromExcel);
		//Thread.sleep(1000);
		webCmnUtil.implicitWait();
		cmnElement.click_On_Save_Btn_In_Adding();
		Testlistener.log("Clicked On click_On_Save_Btn_In_Adding");
		//Thread.sleep(8000);
		webCmnUtil.implicitWait();
		String popUpMessage = bFuction.click_On_OK_BUtton_And_CaptureThe_POPUpMessage(
				"Product already exist with this model.");
		Testlistener
				.log("The Actual Pop Up message Captured from UI after clikcing on Save button is : " + popUpMessage);
	}

	private void product_inline_Search_By_all_Search_Field() throws InterruptedException {
		// TODO Auto-generated method stub
		// Search By Model Number
		try {
			Testlistener.log("Search by Model Number is started...");
			productPage.write_On_modelNumberSearchEditBox(modelNumberFromExcel);
			Thread.sleep(3000);
			String expectedCountSize = "Total : 1";
			String totalCountSize = cmnElement.get_totalNumber_Text();
			webCmnUtil.compareString(totalCountSize, expectedCountSize);
			Testlistener.log(
					"The " + totalCountSize + " Result found after Searching for Model Number " + modelNumberFromExcel);
			Testlistener.log("Assertion Completed and Total Count is Verified after searching... ");
			String actualModelNumberAfterSearch = productPage.getTheTextOf_modelNumberInRecordTable();
			Testlistener.log("The Model Number Fetched From Table is : " + actualModelNumberAfterSearch);
			webCmnUtil.compareString(actualModelNumberAfterSearch, modelNumberFromExcel);
			Testlistener.log("Exact Search is working as expected for Model Number");

		} catch (Exception e) {
			Testlistener.log("Exact Search is not working as expected for Model Number :::::::: FAIL");
		}
		
		// Partial Search for Model Number
		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(3000);
		webCmnUtil.implicitWait();
		partialText=bFuction.text_for_The_PartialSearch(modelNumberFromExcel);
		productPage.write_On_modelNumberSearchEditBox(partialText + Keys.ENTER);
		Thread.sleep(3000);
		bFuction.doThePartialSearch(productPage.listOfmodelNumberInRecordTable, partialText);
	    getTheTotalCount=cmnElement.get_totalNumber_Text();
		Testlistener.log("The Total Count Number is : "+ getTheTotalCount);
		if(getTheTotalCount.equals("Total : 0"))
    	{
    		Testlistener.log("Partial Search is not working as expected for Model Number ::::: FAIL ");
    	}
		else
		{
			Testlistener.log("Partial Search is working as expected for Model Number ");
		}
	
		Thread.sleep(5000);
		
		// In line Search with Invalid Model Number Input
		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(3000);
		webCmnUtil.implicitWait();
		String invalidModelNumberText="Llfjksdjj400";
		productPage.write_On_modelNumberSearchEditBox(invalidModelNumberText + Keys.ENTER);
		Thread.sleep(5000);
		bFuction.doTheInvalidSearch(productPage.listOfmodelNumberInRecordTable, invalidModelNumberText);
	    nodatafoundText=cmnElement.get_noDataFound_Text();
	    if(getTheTotalCount.equals("Total : 0") || nodatafoundText.equals("No data found"))
    	{
    		Testlistener.log("Invalid Input Search is working as expected for Model Number ");
    	}
	    else{
	    	Testlistener.log("Invalid Input Search is Not working as expected for Model Number :::::: FAIL ");
	    }
		//Thread.sleep(5000);
	    webCmnUtil.implicitWait();

		// Search By Product Category
		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(4000);
		webCmnUtil.implicitWait();
		try {
			Testlistener.log("Search by Product Category is started...");
			int expectedCountOf_ProductCategory_InTable = bFuction.getThe_ExpectedCount_Of_Particular_Row_In_Table(
					productPage.productCategory_List_in_Table, productCategoryFromExcel);
			Testlistener.log("Expected Count of same product Category in table before Inline search is : "
					+ expectedCountOf_ProductCategory_InTable);
			//Thread.sleep(5000);
			productPage.write_On_productCategory_Search_Field(productCategoryFromExcel);
			Thread.sleep(3000);
			int totalCount = bFuction.totalCount_In_ViewPage();
			Testlistener.log("Actual Count for product Category After Inline Search is : " + totalCount);
			if (totalCount == expectedCountOf_ProductCategory_InTable) {
				Testlistener
						.log("Exact Search is working as expected for Product category");
			} else {
				Testlistener.log(
						"Exact Search is not working as expected for Product category ::::::: FAIL");
			}

		} catch (Exception e) {
			Testlistener.log("Exception Caught....Search is not working for product Category Search Field");
		}
		
		// Partial Search for Product Category
		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(5000);
		webCmnUtil.implicitWait();
		partialText=bFuction.text_for_The_PartialSearch(productCategoryFromExcel);
		productPage.write_On_productCategory_Search_Field(partialText);
		Thread.sleep(3000);
		bFuction.doThePartialSearch(productPage.productCategory_List_in_Table, partialText);
	    getTheTotalCount=cmnElement.get_totalNumber_Text();
		Testlistener.log("The Total Count Number is : "+ getTheTotalCount);
		if(getTheTotalCount.equals("Total : 0"))
    	{
    		Testlistener.log("Partial Search is not working as expected for Product Category ::::::: FAIL");
    	}
		else
		{
			Testlistener.log("Partial Search is working as expected for Product Category  ");
		}
	
		//Thread.sleep(5000);
		
		// In line Search with Invalid Product Category Input
		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(3000);
		webCmnUtil.implicitWait();
		String invalidProductCategory="Ljj400";
		productPage.write_On_productCategory_Search_Field(invalidProductCategory);
		Thread.sleep(3000);
		bFuction.doTheInvalidSearch(productPage.productCategory_List_in_Table, invalidProductCategory);
	    nodatafoundText=cmnElement.get_noDataFound_Text();
	    if(getTheTotalCount.equals("Total : 0") || nodatafoundText.equals("No data found"))
    	{
    		Testlistener.log("Invalid Input Search is working as expected for Product Category ");
    	}
	    else{
	    	Testlistener.log("Invalid Input Search is Not working as expected for Product Category :::::: FAIL ");
	    }
		//Thread.sleep(5000);

		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(4000);
		webCmnUtil.implicitWait();

		// Search by Product Sub Category

		try {
			Testlistener.log("Search by Product Sub Category is started...");
			int expectedCountOf_ProductSubCategory_InTable = bFuction.getThe_ExpectedCount_Of_Particular_Row_In_Table(
					productPage.productSubCategory_List_in_Table, SubCategory);
			Testlistener.log("Expected Count of same product Sub Category in table before Inline search is : "
					+ expectedCountOf_ProductSubCategory_InTable);
			//Thread.sleep(2000);
			productPage.write_On_productSubCategory_Search_Field(SubCategory);
			Thread.sleep(3000);
			int totalCount = bFuction.totalCount_In_ViewPage();
			Testlistener.log("Actual Count for product Sub Category After Inline Search is : " + totalCount);
			if (totalCount == expectedCountOf_ProductSubCategory_InTable) {
				Testlistener.log(
						"Exact Search is working as expected for Product Sub Category");
			} else {
				Testlistener.log(
						"Exact Search is not working as expected for Product Sub Category ::::::: FAIL");
			}

		} catch (Exception e) {
			Testlistener.log("Exception Caught....Search is not working for product Sub Category Search Field");
		}
		
		// Partial Search for Product Sub Category
		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(5000);
		webCmnUtil.implicitWait();
		partialText=bFuction.text_for_The_PartialSearch(SubCategory);
		productPage.write_On_productSubCategory_Search_Field(partialText);
		Thread.sleep(3000);
		bFuction.doThePartialSearch(productPage.productSubCategory_List_in_Table, partialText);
	    getTheTotalCount=cmnElement.get_totalNumber_Text();
		Testlistener.log("The Total Count Number is : "+ getTheTotalCount);
		if(getTheTotalCount.equals("Total : 0"))
    	{
    		Testlistener.log("Partial Search is not working as expected for Product Sub Category ::::::: FAIL  ");
    	}
		else
		{
			Testlistener.log("Partial Search is working as expected for Product Sub Category ");
		}
	
		//Thread.sleep(5000);
		
		// In line Search with Invalid Product Sub Category Input
		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(3000);
		webCmnUtil.implicitWait();
		String invalidProductSubCategory="Lj00";
		productPage.write_On_productSubCategory_Search_Field(invalidProductSubCategory);
		Thread.sleep(3000);
		bFuction.doTheInvalidSearch(productPage.productSubCategory_List_in_Table, invalidProductSubCategory);
	    nodatafoundText=cmnElement.get_noDataFound_Text();
	    if(getTheTotalCount.equals("Total : 0") || nodatafoundText.equals("No data found"))
    	{
    		Testlistener.log("Invalid Input Search is working as expected for Product Sub Category ");
    	}
	    else{
	    	Testlistener.log("Invalid Input Search is Not working as expected for Product Sub Category :::::: FAIL ");
	    }
		//Thread.sleep(5000);

		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(4000);
		webCmnUtil.implicitWait();

		// Search by Manufaturer

		try {
			Testlistener.log("Search by Manufacturer is started...");
			int expectedCountOf_Manufacturer_InTable = bFuction.getThe_ExpectedCount_Of_Particular_Row_In_Table(
					productPage.manufacturer_List_in_Table, manufacturerFromExcel);
			Testlistener.log("Expected Count of same product Manufacturer in table before Inline search is : "
					+ expectedCountOf_Manufacturer_InTable);
			//Thread.sleep(2000);
			productPage.write_on_Manufacturer_search_Field(manufacturerFromExcel);
			Thread.sleep(3000);
			int totalCount = bFuction.totalCount_In_ViewPage();
			Testlistener.log("Actual Count for Manufaturer After Inline Search is : " + totalCount);
			if (totalCount == expectedCountOf_Manufacturer_InTable) {
				Testlistener.log("Exact Search is working as expected for Product Manufacturer");
			} else {
				Testlistener
						.log("Exact Search is not working as expected for Product Manufacturer :::::: FAIL");
			}

		} catch (Exception e) {
			Testlistener.log("Exception Caught....Search is not working for Manufaturer Search Field");
		}
		
		// Partial Search for Product Manufacturer
		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(5000);
		webCmnUtil.implicitWait();
		partialText=bFuction.text_for_The_PartialSearch(manufacturerFromExcel);
		productPage.write_on_Manufacturer_search_Field(partialText);
		Thread.sleep(3000);
		bFuction.doThePartialSearch(productPage.manufacturer_List_in_Table, partialText);
	    getTheTotalCount=cmnElement.get_totalNumber_Text();
		Testlistener.log("The Total Count Number is : "+ getTheTotalCount);
		if(getTheTotalCount.equals("Total : 0"))
    	{
    		Testlistener.log("Partial Search is not working as expected for Product Manufacturer ::::::: FAIL ");
    	}
		else
		{
			Testlistener.log("Partial Search is working as expected for Product Manufacturer ");
		}
	
		//Thread.sleep(5000);
		
		// In line Search with Invalid Product Manufacturer Input
		cmnElement.click_productManagemnet_Menu_Link();
		//Thread.sleep(3000);
		webCmnUtil.implicitWait();
		String invalidProductManufacturer="Lj00";
		productPage.write_on_Manufacturer_search_Field(invalidProductManufacturer);
		Thread.sleep(3000);
		bFuction.doTheInvalidSearch(productPage.manufacturer_List_in_Table, invalidProductManufacturer);
	    nodatafoundText=cmnElement.get_noDataFound_Text();
	    if(getTheTotalCount.equals("Total : 0") || nodatafoundText.equals("No data found"))
    	{
    		Testlistener.log("Invalid Input Search is working as expected for Product Manufacturer ");
    	}
	    else{
	    	Testlistener.log("Invalid Input Search is Not working as expected for Product Product Manufacturer :::::: FAIL ");
	    }
		//Thread.sleep(5000);

	}

	private void search_And_Edit_All_The_Field_In_Product_Edit_Page_For_ParticularProduct()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		// Search for added product and click on Edit Field.................
		productPage.write_On_modelNumberSearchEditBox(modelNumberFromExcel);
		Thread.sleep(4000);
		String expectedCountSize = "Total : 1";
		String totalCountSize = cmnElement.get_totalNumber_Text();
		webCmnUtil.compareString(totalCountSize, expectedCountSize);
		Testlistener.log(
				"The " + totalCountSize + " Result found after Searching for Model Number " + modelNumberFromExcel);
		Testlistener.log("Assertion Completed and Total Count is Verified after searching... ");
		String actualModelNumberAfterSearch = productPage.getTheTextOf_modelNumberInRecordTable();
		Testlistener.log("The Model Number Fetched From Table is : " + actualModelNumberAfterSearch);
		webCmnUtil.compareString(actualModelNumberAfterSearch, modelNumberFromExcel);
		Testlistener.log("Assertion Completed....The Model Number Matched In the table ");
		productPage.click_On_edit_Image_Link();
		//Thread.sleep(5000);
		webCmnUtil.implicitWait();

		String updatedescriptionFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 9,
				2);
		productPage.write_On_description_EditBox(updatedescriptionFromExcel);
		Testlistener.log("The Updated Description Fetched From Excel is : " + updatedescriptionFromExcel);
		//Thread.sleep(1000);

		String updatedwarrantyPeriodFromExcel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_ADD_PRODUCT_TESTDATA), 11,
				2);
		productPage.write_On_warrantyPeriod_EditBox(updatedwarrantyPeriodFromExcel);
		Testlistener.log("The Updated Warranty Period Fetched From Excel is : " + updatedwarrantyPeriodFromExcel);
		//Thread.sleep(1000);
		webCmnUtil.implicitWait();
		productPage.click_documents_Link();
		Testlistener.log("Clicked On Documents_header_Link....");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();
		// delete all the documents
		productPage.click_On_delete_Icon_In_Document_Section();
		//Thread.sleep(1000);
		webCmnUtil.implicitWait();
		productPage.click_On_second_delete_Icon_In_Document_Section();
		//Thread.sleep(1000);
		webCmnUtil.implicitWait();
		productPage.click_On_third_delete_Icon_In_Document_Section();
		Thread.sleep(1000);
		webCmnUtil.implicitWait();

		// After delete Save the product
		cmnElement.click_On_Save_Btn_In_Adding();
		Testlistener.log("Clicked On click_On_Save_Btn_In_Adding");
		//Thread.sleep(8000);
		webCmnUtil.implicitWait();
		String popUpMessage = bFuction
				.click_On_OK_BUtton_And_CaptureThe_POPUpMessage("Product details have been updated");
		Testlistener
				.log("The Actual Pop Up message Captured from UI after clikcing on Save button is : " + popUpMessage);

		productPage.write_On_modelNumberSearchEditBox(modelNumberFromExcel);
		Thread.sleep(4000);
		productPage.click_On_edit_Image_Link();
		//Thread.sleep(5000);
		webCmnUtil.implicitWait();
		productPage.click_documents_Link();
		Testlistener.log("Clicked On Documents_header_Link....");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();
		// Add 1st Row Document
		productPage.selectdocumentTypeSelectBox(updatevideoDocumentTypeFromExcel);
		Testlistener.log("Updated Document Type Fetched From Excel is : " + updatevideoDocumentTypeFromExcel);
		productPage.write_On_documentName_EditBox(updatevideodocumentNameFromExcel);
		Testlistener.log("update Document Name Fetched From Excel is : " + updatevideodocumentNameFromExcel);
		productPage.write_enterUrl_EditBox(updated_VideoURLFromExcel);
		Testlistener.log("Updated URL Fetched From Excel is : " + updated_VideoURLFromExcel);
		//Thread.sleep(1000);
		webCmnUtil.implicitWait();
		productPage.click_On_plus_Sign_In_Document_Section();
		Testlistener.log("clicked on + sign in Documents Section for adding one more row ");
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();

		// Add 2nd Row Document
		productPage.select_second_documentTypeSelectBox(updated_manualdocumentTypeFromExcel);
		Testlistener.log("Updated Second Document Type Fetched From Excel is : " + updated_manualdocumentTypeFromExcel);
		productPage.write_On_seocnd_documentName_EditBox(updated_second_documentNameFromExcel);
		Testlistener
				.log("Updated Second Document Name Fetched From Excel is : " + updated_second_documentNameFromExcel);
		productPage.select_Second_fileUploadType_SelectBox(updated_URL_fileDetailsFromExcel);
		Testlistener.log("Updated File Details Fetched From Excel is : " + updated_URL_fileDetailsFromExcel);
		productPage.write_second_enterUrl_EditBox(updated_URLFromExcel);
		Testlistener.log(" Updated URL Fetched From Excel  for second Document is : " + updated_URLFromExcel);

		productPage.click_On_plus_Sign_In_Document_Section();
		Testlistener.log("clicked on + sign in Documents Section for adding one more row ");
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();

		// Add 3rd Row Document
		productPage.select_third_documentTypeSelectBox(updated_manualdocumentTypeFromExcel);
		Testlistener.log("Updated Third Document Type Fetched From Excel is : " + updated_manualdocumentTypeFromExcel);
		productPage.write_On_third_documentName_EditBox(updated_thrid_documentNameFromExcel);
		Testlistener.log("Updated Third Document Name Fetched From Excel is : " + updated_thrid_documentNameFromExcel);
		productPage.select_third_fileUploadType_SelectBox(fileUpload_fileDetailsFromExcel);
		Testlistener.log("Updated File Details Fetched From Excel is : " + fileUpload_fileDetailsFromExcel);
		productPage.click_third_attachFile_EditBox_and_Browse_The_File_To_Upload(
				(String) EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.DOCS_ATTACHFILEPATH));
		Thread.sleep(1000);
		webCmnUtil.implicitWait();
		productPage.click_documents_Link();
		Testlistener.log("Clicked On Documents_header_Link after entering all data");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();

		// Events Section
		productPage.click_On_events_Header_Link();
		Testlistener.log("Clicked On events_Header_Link");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();

		productPage.write_On_title_EditBox(updatedtitleFromExcel);
		Testlistener.log("The Updated Title Fetched From Excel is : " + updatedtitleFromExcel);

		productPage.write_On_Duration_EditBox(updateddurationFromExcel);
		Testlistener.log("The Updated Duration Fetched From Excel is : " + updateddurationFromExcel);

		productPage.write_On_Message_EditBox(updatedmessageFromExcel);
		Testlistener.log("The Updated Message Fetched From Excel is : " + updatedmessageFromExcel);

		productPage.write_On_runsAt_EditBox(updatedrunsAtFromExcel);
		Testlistener.log("The Updated Runs At  Fetched From Excel is : " + updatedrunsAtFromExcel);

		productPage.select_TimeZone_SelectBox(updatedtimeZoneFromExcel);
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();

		productPage.click_On_events_Header_Link();
		Testlistener.log("Clicked On events_Header_Link after entering all data ");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();

		// Service Charge Section
		productPage.click_On_Service_Charge_Header_Link();
		Testlistener.log("Clicked On serviceCharge_Header_Link");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();

		productPage.select_service_Type_SelectBox(updatedserviceTypeFromExcel);
		Testlistener.log("The updated Service Type Fetched From Excel is : " + updatedserviceTypeFromExcel);

		productPage.write_Amount_EditBox(updatedpriceFromExcel);
		Testlistener.log("The Updated Price Fetched From Excel is : " + updatedpriceFromExcel);

		productPage.click_On_Service_Charge_Header_Link();
		Testlistener.log("Clicked On serviceCharge_Header_Link after entering all data ");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();

		// Additional Info Section
		productPage.click_On_custom_Header_Link();
		Testlistener.log("Clicked On click_On_additionalInfo_Header_Link");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();

		productPage.write_In_PropertyName_EditBox(updatedpropertyName);

		productPage.select_dataType_SelectBox(updatedDataType);

		productPage.select_IsMandatory_SelectBox(updatedMandatoryType);

		productPage.click_On_custom_Header_Link();
		Testlistener.log(
				"Clicked On click_On_additionalInfo_Header_Link after updating all the field in Additional Info Section");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();

		cmnElement.click_On_Save_Btn_In_Adding();
		Testlistener.log("Clicked On click_On_Save_Btn_In_Adding after Updating all the data");

		//Thread.sleep(5000);
		webCmnUtil.implicitWait();
		boolean sts = cmnElement.get_popUp_DialogBox_Sts();
		Testlistener.log("The Pop Up Box is Displayed : " + sts);
		String expectedPopUpMessageText = "Product details have been updated";
		String actualpopUpMessgaeText = cmnElement.get_PopUP_MessageText();
		webCmnUtil.compareString(actualpopUpMessgaeText, expectedPopUpMessageText);
		Testlistener.log("Assertion Completed....The Message in Pop Up Box : " + actualpopUpMessgaeText);
		cmnElement.click_ok_Btn();
		//Thread.sleep(3000);
		webCmnUtil.implicitWait();

		productPage.write_On_modelNumberSearchEditBox(modelNumberFromExcel);
		Thread.sleep(4000);
		webCmnUtil.compareString(totalCountSize, expectedCountSize);
		Testlistener.log(
				"The " + totalCountSize + " Result found after Searching for Model Number " + modelNumberFromExcel);
		Testlistener.log("Assertion Completed and Total Count is Verified after searching... ");
		Testlistener.log("The Model Number Fetched From Table is : " + actualModelNumberAfterSearch);
		webCmnUtil.compareString(actualModelNumberAfterSearch, modelNumberFromExcel);
		Testlistener.log("Assertion Completed....The Model Number Matched In the table ");
		productPage.click_On_edit_Image_Link();
		//Thread.sleep(5000);
		webCmnUtil.implicitWait();

		String productCategorySelected = productPage.getThe_Value_Of_selectedProductCategoryInEditPage();
		Testlistener.log(
				"The Selected Product Category in Product Edit Page after editing is : " + productCategorySelected);
		webCmnUtil.compareString(productCategorySelected, productCategoryFromExcel);
		Testlistener.log("Assertion Passed..The Product Category Field Validated..");

		String productSubCategorySelected = productPage.getThe_Value_Of_selectProductSubCategoryInEditPage();
		Testlistener.log("The Selected Product Sub Category in Product Edit Page after editing is : "
				+ productSubCategorySelected);
		webCmnUtil.compareString(SubCategory, productSubCategorySelected);
		Testlistener.log("Assertion Passed..The Product Sub Category Field Validated..");

		String manufacturerSelected = productPage.getThe_Value_Of_manufacturerSelectBoxInEditPage();
		Testlistener.log("The Selected Manufacturer in Product Edit Page after editing is : " + manufacturerSelected);
		webCmnUtil.compareString(manufacturerFromExcel, manufacturerSelected);
		Testlistener.log("Assertion Passed..The Product Sub Category Field Validated..");

		String modelNumberInEditPage = productPage.getText_Of_modelNumber_EditBox();
		Testlistener.log("The Model Number Fetched from Product Edit page is : " + modelNumberInEditPage);
		webCmnUtil.compareString(modelNumberInEditPage, modelNumberFromExcel);
		Testlistener.log("Assertion Completed....The Model Number Validated In the Product Edit Page ");

		String warrantyPeriodinEditPage = productPage.getText_Of_warrantyPeriod_EditBox();
		Testlistener.log(
				"The Warranty Period Fetched from Product Edit page after editing is : " + warrantyPeriodinEditPage);
		webCmnUtil.compareString(updatedwarrantyPeriodFromExcel, warrantyPeriodinEditPage);
		Testlistener.log("Assertion Passed..The Warranty Period Field is Validated..");

		String descriptionInEditPage = productPage.getText_Of_description_EditBox();
		Testlistener.log("The Description Fetched from Product Edit page after editing is : " + descriptionInEditPage);
		webCmnUtil.compareString(updatedescriptionFromExcel, descriptionInEditPage);
		Testlistener.log("Assertion Passed..The Description Field is Validated..");

		productPage.click_documents_Link();
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();

		// 1st Document Verification
		String documentTypeInEditPage = productPage.getThe_Value_Of_documentTypeSelectBoxInEditPage();
		Testlistener.log("The Updated First Document Type in Product Edit page is : " + documentTypeInEditPage);
		webCmnUtil.compareString(updatevideoDocumentTypeFromExcel, documentTypeInEditPage);
		Testlistener.log("Assertion Passed..The Updatd Fisrt Document Type Slect Box Field is Validated..");

		String documentNameText_In_ProductEditPage = productPage.getText_Of_documentName_EditBox();
		Testlistener
				.log("Updated First Document Name in product edit page is : " + documentNameText_In_ProductEditPage);
		webCmnUtil.compareString(updatevideodocumentNameFromExcel, documentNameText_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The first updated Document Name Editbox Field is Validated..");

		String attach_File_or_URL_In_Product_Edit_Page = productPage.getTextOf_enterUrl_EditBox();
		Testlistener
				.log("Updated URL text Fetched From Product Edit Page is : " + attach_File_or_URL_In_Product_Edit_Page);
		webCmnUtil.compareString(updated_VideoURLFromExcel, attach_File_or_URL_In_Product_Edit_Page);
		Testlistener.log("Assertion Passed..The Updated Attach file or URL Edit Box field data is Validated..");

		// 2nd Document Validation
		String seconddocumentTypeInEditPage = productPage.getThe_Value_Of_second_documentTypeSelectBoxInEditPage();
		Testlistener.log(
				"The Updated Second Selected Document Type in Product Edit page is : " + seconddocumentTypeInEditPage);
		webCmnUtil.compareString(updated_manualdocumentTypeFromExcel, seconddocumentTypeInEditPage);
		Testlistener.log("Assertion Passed..The Updated 2nd row Document Type Slect Box Field is Validated..");

		String second_documentNameText_In_ProductEditPage = productPage.getText_Of_seocnd_documentName_EditBox();
		Testlistener.log(
				"Second Updated Document Name in product edit page is : " + second_documentNameText_In_ProductEditPage);
		webCmnUtil.compareString(updated_second_documentNameFromExcel, second_documentNameText_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Updated Second Document Name Editbox Field is Validated..");

		String second_fileDetails_In_Product_Edit_Page = productPage
				.getThe_Value_Of_Second_FileDetails_SelectBoxInEditPage();
		Testlistener.log("Updated File Details for 2nd row Fetched From Product Edit Page is : "
				+ second_fileDetails_In_Product_Edit_Page);
		webCmnUtil.compareString(updated_URL_fileDetailsFromExcel, second_fileDetails_In_Product_Edit_Page);
		Testlistener.log("Assertion Passed..The Updated File Details in 2nd row Select Box filed data is Validated..");

		String second_attach_File_or_URL_In_Product_Edit_Page = productPage.getTextOf_second_enterUrl_EditBox();
		Testlistener.log("Updated URL text of Second row Fetched From Product Edit Page is : "
				+ second_attach_File_or_URL_In_Product_Edit_Page);
		webCmnUtil.compareString(updated_URLFromExcel, second_attach_File_or_URL_In_Product_Edit_Page);
		Testlistener
				.log("Assertion Passed..The updated Attach file or URL Edit for 2nd row Box field data is Validated..");

		// 3rd Document Validation
		String thirddocumentTypeInEditPage = productPage.getThe_Value_Of_third_documentTypeSelectBoxInEditPage();
		Testlistener.log("The Third Selected Document Type in Product Edit page is : " + thirddocumentTypeInEditPage);
		webCmnUtil.compareString(updated_manualdocumentTypeFromExcel, thirddocumentTypeInEditPage);
		Testlistener.log("Assertion Passed..The Updated 3rd row Document Type row Slect Box Field is Validated..");

		String third_documentNameText_In_ProductEditPage = productPage.getText_Of_third_documentName_EditBox();
		Testlistener.log(
				"Upadted Third Document Name in product edit page is : " + third_documentNameText_In_ProductEditPage);
		webCmnUtil.compareString(updated_thrid_documentNameFromExcel, third_documentNameText_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Updated Third Document Name Editbox Field is Validated..");

		String third_fileDetails_In_Product_Edit_Page = productPage
				.getThe_Value_Of_third_FileDetails_SelectBoxInEditPage();
		Testlistener.log("File Details for 3rd row documents Fetched From Product Edit Page is : "
				+ third_fileDetails_In_Product_Edit_Page);
		webCmnUtil.compareString(fileUpload_fileDetailsFromExcel, third_fileDetails_In_Product_Edit_Page);
		Testlistener.log("Assertion Passed..The File Details Select Box filed data is Validated..");

		productPage.click_documents_Link();
		webCmnUtil.implicitWait();
		productPage.click_On_events_Header_Link();
		String titleText_InProductEditPage = productPage.getTheText_Of_TitleEditBox_in_Event_Section();
		Testlistener.log("Title text Fetched From Product Edit Page after editing is : " + titleText_InProductEditPage);
		webCmnUtil.compareString(updatedtitleFromExcel, titleText_InProductEditPage);
		Testlistener.log("Assertion Passed..The Title Edit Box field data is Validated..");

		String messageText_In_Product_EditPage = productPage.getTheText_Of_MessageEditBox_in_Event_Section();
		Testlistener.log(
				"Message text Fetched From Product Edit Page after editing is : " + messageText_In_Product_EditPage);
		webCmnUtil.compareString(updatedmessageFromExcel, messageText_In_Product_EditPage);
		Testlistener.log("Assertion Passed..The Message Edit Box field data is Validated..");

		String durationText_in_Product_Edit_page = productPage.getTheText_Of_DurationEditBox_in_Event_Section();
		Testlistener.log(
				"Duration Text Fetched From Product Edit page after editing is : " + durationText_in_Product_Edit_page);
		webCmnUtil.compareString(updateddurationFromExcel, durationText_in_Product_Edit_page);
		Testlistener.log("Assertion Passed..The duration Edit Box field data is Validated..");

		String runsAt_Text_In_Product_EditPage = productPage.getTheText_Of_RunsAtEditBox_in_Event_Section();
		Testlistener.log(
				"Runs At Text Fetched From Product Edit page after editing is : " + runsAt_Text_In_Product_EditPage);
		webCmnUtil.compareString(updatedrunsAtFromExcel, runsAt_Text_In_Product_EditPage);
		Testlistener.log("Assertion Passed..The Runs At Edit Box field data is Validated..");

		String timeZone_Text_In_Product_EditPage = productPage.getThe_Value_Of_TimeZone_Select_BoxInvent_Section();
		Testlistener.log("Time Zone text Fetched From Product Edit page  after editing is : "
				+ timeZone_Text_In_Product_EditPage);
		webCmnUtil.compareString(updatedtimeZoneFromExcel, timeZone_Text_In_Product_EditPage);
		Testlistener.log("Assertion Passed..The Time Zone select Box field data is Validated..");

		productPage.click_On_events_Header_Link();
		Testlistener.log("Clicked On events_Header_Link after entering all data ");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();

		// Service Charge Section
		productPage.click_On_Service_Charge_Header_Link();
		Testlistener.log("Clicked On serviceCharge_Header_Link");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();

		String serviceType_In_ProductEditPage = productPage
				.getThe_Value_Of_ServiceType_Select_Box_In_ServiceCharge_Section();
		Testlistener.log(
				"The Service Type Selected in Product Edit page after editing is : " + serviceType_In_ProductEditPage);
		webCmnUtil.compareString(updatedserviceTypeFromExcel, serviceType_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Service Type select Box field data is Validated..");

		String pricText_In_Product_EditPage = productPage.getTheText_Of_AmountEditBox_in_ServiceCharge_Section();
		Testlistener.log(
				"The Price Text Fetched from Product Edit page after editing is : " + pricText_In_Product_EditPage);
		webCmnUtil.compareString(updatedpriceFromExcel, pricText_In_Product_EditPage);
		Testlistener.log("Assertion Passed..The Price Edit Box field data is Validated..");

		productPage.click_On_Service_Charge_Header_Link();
		Testlistener.log("Clicked On serviceCharge_Header_Link after entering all data ");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();

		// Additional Info Section
		productPage.click_On_custom_Header_Link();
		Testlistener.log("Clicked On click_On_additionalInfo_Header_Link");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();

		String propertyName_In_ProductEditPage = productPage
				.getTheText_Of_PropertyNameEditBox_in_AdditionalInfo_Section();
		Testlistener.log("The Property Name Text Fetched from Product Edit page after editing is : "
				+ propertyName_In_ProductEditPage);
		webCmnUtil.compareString(updatedpropertyName, propertyName_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Property Name Edit Box field data is Validated..");

		String selected_dataType_In_ProductEditPage = productPage
				.getThe_Value_Of_dataType_Select_Box_In_AdditionalInfo_Section();
		Testlistener.log("The Selected Data Type Fetched from Product Edit page after editing is : "
				+ selected_dataType_In_ProductEditPage);
		webCmnUtil.compareString(updatedDataType, selected_dataType_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Data Type Select Box field data is Validated..");

		String mandatory_Type_In_ProductEditPage = productPage
				.getThe_Value_Of_IsMandatory_Select_Box_In_AdditionalInfo_Section();
		Testlistener.log("The Manadatory Option Fetched from Product Edit page after editing is : "
				+ mandatory_Type_In_ProductEditPage);
		webCmnUtil.compareString(updatedMandatoryType, mandatory_Type_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Mandatory Option Select Box field data is Validated..");

		productPage.click_On_custom_Header_Link();
		Testlistener.log("Clicked On click_On_additionalInfo_Header_Link");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();
		

		/*productPage.click_On_Additional_Info_Link();
		webCmnUtil.implicitWait();
		productPage.write_On_Enter_Info_Url(infoUrlFromExcel);
		
		productPage.write_On_Listing_Category(listingCategoryFromExcel);
		productPage.click_On_Additional_Info_Link();
		webCmnUtil.implicitWait();*/

		cmnElement.click_On_Save_Btn_In_Adding();
		Testlistener.log("Clicked On click_On_Save_Btn_In_Adding after field validation..");

		//Thread.sleep(5000);
		webCmnUtil.implicitWait();
		webCmnUtil.compareString(actualpopUpMessgaeText, expectedPopUpMessageText);
		Testlistener.log("Assertion Completed....The Message in Pop Up Box : " + actualpopUpMessgaeText);
		cmnElement.click_ok_Btn();
		//Thread.sleep(3000);
		webCmnUtil.implicitWait();

	}

	private void search_And_Validate_All_The_Field_Data_For_Added_Product_In_Product_Edit_Page()
			throws InterruptedException {
		// TODO Auto-generated method stub
		productPage.write_On_modelNumberSearchEditBox(modelNumberFromExcel);
		Thread.sleep(4000);
		String expectedCountSize = "Total : 1";
		String totalCountSize = cmnElement.get_totalNumber_Text();
		webCmnUtil.compareString(totalCountSize, expectedCountSize);
		Testlistener.log(
				"The " + totalCountSize + " Result found after Searching for Model Number " + modelNumberFromExcel);
		Testlistener.log("Assertion Completed and Total Count is Verified after searching... ");
		String actualModelNumberAfterSearch = productPage.getTheTextOf_modelNumberInRecordTable();
		Testlistener.log("The Model Number Fetched From Table is : " + actualModelNumberAfterSearch);
		webCmnUtil.compareString(actualModelNumberAfterSearch, modelNumberFromExcel);
		Testlistener.log("Assertion Completed....The Model Number Matched In the table ");
		productPage.click_On_edit_Image_Link();
		//Thread.sleep(5000);
		webCmnUtil.implicitWait();

		String productCategorySelected = productPage.getThe_Value_Of_selectedProductCategoryInEditPage();
		Testlistener.log("The Selected Product Category in Product Edit Page is : " + productCategorySelected);
		System.out.println("The Selected Product Category in Product Edit Page is : " + productCategorySelected);
		webCmnUtil.compareString(productCategorySelected, productCategoryFromExcel);
		Testlistener.log("Assertion Passed..The Product Category Field Validated..");
		System.out.println("Assertion Passed..The Product Category Field Validated..");

		String productSubCategorySelected = productPage.getThe_Value_Of_selectProductSubCategoryInEditPage();
		Testlistener.log("The Selected Product Sub Category in Product Edit Page is : " + productSubCategorySelected);
		System.out.println("The Selected Product Sub Category in Product Edit Page is : " + productSubCategorySelected);
		webCmnUtil.compareString(SubCategory, productSubCategorySelected);
		Testlistener.log("Assertion Passed..The Product Sub Category Field Validated..");
		System.out.println("Assertion Passed..The Product Sub Category Field Validated..");

		String manufacturerSelected = productPage.getThe_Value_Of_manufacturerSelectBoxInEditPage();
		Testlistener.log("The Selected Manufacturer in Product Edit Page is : " + manufacturerSelected);
		System.out.println("The Selected Manufacturer in Product Edit Page is : " + manufacturerSelected);
		webCmnUtil.compareString(manufacturerFromExcel, manufacturerSelected);
		Testlistener.log("Assertion Passed..The Product Sub Category Field Validated..");
		System.out.println("Assertion Passed..The Product Sub Category Field Validated..");

		String modelNumberInEditPage = productPage.getText_Of_modelNumber_EditBox();
		Testlistener.log("The Model Number Fetched from Product Edit page is : " + modelNumberInEditPage);
		System.out.println("The Model Number Fetched from Product Edit page is : " + modelNumberInEditPage);
		webCmnUtil.compareString(modelNumberInEditPage, modelNumberFromExcel);
		Testlistener.log("Assertion Completed....The Model Number Validated In the Product Edit Page ");

		String warrantyPeriodinEditPage = productPage.getText_Of_warrantyPeriod_EditBox();
		Testlistener.log("The Warranty Period Fetched from Product Edit page is : " + warrantyPeriodinEditPage);
		webCmnUtil.compareString(warrantyPeriodFromExcel, warrantyPeriodinEditPage);
		Testlistener.log("Assertion Passed..The Warranty Period Field is Validated..");

		String descriptionInEditPage = productPage.getText_Of_description_EditBox();
		Testlistener.log("The Description Fetched from Product Edit page is : " + descriptionInEditPage);
		webCmnUtil.compareString(descriptionFromExcel, descriptionInEditPage);
		Testlistener.log("Assertion Passed..The Description Field is Validated..");

		// Document Section
		productPage.click_documents_Link();
		//Thread.sleep(2000);
		webCmnUtil.implicitWait();

		// 1st Document Verification
		String documentTypeInEditPage = productPage.getThe_Value_Of_documentTypeSelectBoxInEditPage();
		Testlistener.log("The Selected First Document Type in Product Edit page is : " + documentTypeInEditPage);
		webCmnUtil.compareString(videoDocumentTypeFromExcel, documentTypeInEditPage);
		Testlistener.log("Assertion Passed..The Fisrt Document Type Slect Box Field is Validated..");

		String documentNameText_In_ProductEditPage = productPage.getText_Of_documentName_EditBox();
		Testlistener.log("Document Name in product edit page is : " + documentNameText_In_ProductEditPage);
		webCmnUtil.compareString(videodocumentNameFromExcel, documentNameText_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The first Document Name Editbox Field is Validated..");

		String attach_File_or_URL_In_Product_Edit_Page = productPage.getTextOf_enterUrl_EditBox();
		Testlistener.log("URL text Fetched From Product Edit Page is : " + attach_File_or_URL_In_Product_Edit_Page);
		webCmnUtil.compareString(VideoURLFromExcel, attach_File_or_URL_In_Product_Edit_Page);
		Testlistener.log("Assertion Passed..The Attach file or URL Edit Box field data is Validated..");

		// 2nd Document Validation
		String seconddocumentTypeInEditPage = productPage.getThe_Value_Of_second_documentTypeSelectBoxInEditPage();
		Testlistener.log("The Second Selected Document Type in Product Edit page is : " + seconddocumentTypeInEditPage);
		webCmnUtil.compareString(manualdocumentTypeFromExcel, seconddocumentTypeInEditPage);
		Testlistener.log("Assertion Passed..The Document Type Slect Box Field is Validated..");

		String second_documentNameText_In_ProductEditPage = productPage.getText_Of_seocnd_documentName_EditBox();
		Testlistener
				.log("Second Document Name in product edit page is : " + second_documentNameText_In_ProductEditPage);
		webCmnUtil.compareString(second_documentNameFromExcel, second_documentNameText_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Second Document Name Editbox Field is Validated..");

		String second_fileDetails_In_Product_Edit_Page = productPage
				.getThe_Value_Of_Second_FileDetails_SelectBoxInEditPage();
		Testlistener.log("File Details Fetched From Product Edit Page is : " + second_fileDetails_In_Product_Edit_Page);
		webCmnUtil.compareString(URL_fileDetailsFromExcel, second_fileDetails_In_Product_Edit_Page);
		Testlistener.log("Assertion Passed..The File Details Select Box filed data is Validated..");

		String second_attach_File_or_URL_In_Product_Edit_Page = productPage.getTextOf_second_enterUrl_EditBox();
		Testlistener.log("URL text of Second row Fetched From Product Edit Page is : "
				+ second_attach_File_or_URL_In_Product_Edit_Page);
		webCmnUtil.compareString(URLFromExcel, second_attach_File_or_URL_In_Product_Edit_Page);
		Testlistener.log("Assertion Passed..The Attach file or URL Edit Box field data is Validated..");

		// 3rd Document Validation
		String thirddocumentTypeInEditPage = productPage.getThe_Value_Of_third_documentTypeSelectBoxInEditPage();
		Testlistener.log("The Third Selected Document Type in Product Edit page is : " + thirddocumentTypeInEditPage);
		webCmnUtil.compareString(manualdocumentTypeFromExcel, thirddocumentTypeInEditPage);
		Testlistener.log("Assertion Passed..The Document Type Slect Box Field is Validated..");

		String third_documentNameText_In_ProductEditPage = productPage.getText_Of_third_documentName_EditBox();
		Testlistener.log("Third Document Name in product edit page is : " + third_documentNameText_In_ProductEditPage);
		webCmnUtil.compareString(thrid_documentNameFromExcel, third_documentNameText_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Third Document Name Editbox Field is Validated..");

		String third_fileDetails_In_Product_Edit_Page = productPage
				.getThe_Value_Of_third_FileDetails_SelectBoxInEditPage();
		Testlistener.log("File Details for 3rd row documents Fetched From Product Edit Page is : "
				+ third_fileDetails_In_Product_Edit_Page);
		webCmnUtil.compareString(fileUpload_fileDetailsFromExcel, third_fileDetails_In_Product_Edit_Page);
		Testlistener.log("Assertion Passed..The File Details Select Box filed data is Validated..");

		productPage.click_documents_Link();

		productPage.click_On_events_Header_Link();
		String titleText_InProductEditPage = productPage.getTheText_Of_TitleEditBox_in_Event_Section();
		Testlistener.log("Title text Fetched From Product Edit Page is : " + titleText_InProductEditPage);
		webCmnUtil.compareString(titleFromExcel, titleText_InProductEditPage);
		Testlistener.log("Assertion Passed..The Title Edit Box field data is Validated..");

		String messageText_In_Product_EditPage = productPage.getTheText_Of_MessageEditBox_in_Event_Section();
		Testlistener.log("Message text Fetched From Product Edit Page is : " + messageText_In_Product_EditPage);
		webCmnUtil.compareString(messageFromExcel, messageText_In_Product_EditPage);
		Testlistener.log("Assertion Passed..The Message Edit Box field data is Validated..");

		String durationText_in_Product_Edit_page = productPage.getTheText_Of_DurationEditBox_in_Event_Section();
		Testlistener.log("Duration Text Fetched From Product Edit page is : " + durationText_in_Product_Edit_page);
		webCmnUtil.compareString(durationFromExcel, durationText_in_Product_Edit_page);
		Testlistener.log("Assertion Passed..The duration Edit Box field data is Validated..");

		String runsAt_Text_In_Product_EditPage = productPage.getTheText_Of_RunsAtEditBox_in_Event_Section();
		Testlistener.log("Runs At Text Fetched From Product Edit page is : " + runsAt_Text_In_Product_EditPage);
		webCmnUtil.compareString(runsAtFromExcel, runsAt_Text_In_Product_EditPage);
		Testlistener.log("Assertion Passed..The Runs At Edit Box field data is Validated..");

		String timeZone_Text_In_Product_EditPage = productPage.getThe_Value_Of_TimeZone_Select_BoxInvent_Section();
		Testlistener.log("Time Zone text Fetched From Product Edit page is : " + timeZone_Text_In_Product_EditPage);
		webCmnUtil.compareString(timeZoneFromExcel, timeZone_Text_In_Product_EditPage);
		Testlistener.log("Assertion Passed..The Time Zone select Box field data is Validated..");

		productPage.click_On_events_Header_Link();
		Testlistener.log("Clicked On events_Header_Link after entering all data ");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();

		// Service Charge Section
		productPage.click_On_Service_Charge_Header_Link();
		Testlistener.log("Clicked On serviceCharge_Header_Link");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();

		String serviceType_In_ProductEditPage = productPage
				.getThe_Value_Of_ServiceType_Select_Box_In_ServiceCharge_Section();
		Testlistener.log("The Service Type Selected in Product Edit page is : " + serviceType_In_ProductEditPage);
		webCmnUtil.compareString(serviceTypeFromExcel, serviceType_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Service Type select Box field data is Validated..");

		String pricText_In_Product_EditPage = productPage.getTheText_Of_AmountEditBox_in_ServiceCharge_Section();
		Testlistener.log("The Price Text Fetched from Product Edit page is : " + pricText_In_Product_EditPage);
		webCmnUtil.compareString(priceFromExcel, pricText_In_Product_EditPage);
		Testlistener.log("Assertion Passed..The Price Edit Box field data is Validated..");

		productPage.click_On_Service_Charge_Header_Link();
		Testlistener.log("Clicked On serviceCharge_Header_Link after entering all data ");
		//Thread.sleep(1500);
		webCmnUtil.implicitWait();

		// Additional Info Section
		productPage.click_On_custom_Header_Link();
		Testlistener.log("Clicked On click_On_additionalInfo_Header_Link");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();

		String propertyName_In_ProductEditPage = productPage
				.getTheText_Of_PropertyNameEditBox_in_AdditionalInfo_Section();
		Testlistener
				.log("The Property Name Text Fetched from Product Edit page is : " + propertyName_In_ProductEditPage);
		webCmnUtil.compareString(propertyNameFromExcel, propertyName_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Property Name Edit Box field data is Validated..");

		String selected_dataType_In_ProductEditPage = productPage
				.getThe_Value_Of_dataType_Select_Box_In_AdditionalInfo_Section();
		Testlistener.log(
				"The Selected Data Type Fetched from Product Edit page is : " + selected_dataType_In_ProductEditPage);
		webCmnUtil.compareString(dataTypeFromExcel, selected_dataType_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Data Type Select Box field data is Validated..");

		String mandatory_Type_In_ProductEditPage = productPage
				.getThe_Value_Of_IsMandatory_Select_Box_In_AdditionalInfo_Section();
		Testlistener
				.log("The Manadatory Option Fetched from Product Edit page is : " + mandatory_Type_In_ProductEditPage);
		webCmnUtil.compareString(mandatoryOptionFromExcel, mandatory_Type_In_ProductEditPage);
		Testlistener.log("Assertion Passed..The Mandatory Option Select Box field data is Validated..");

		productPage.click_On_custom_Header_Link();
		Testlistener.log(
				"Clicked On click_On_additionalInfo_Header_Link After all field validation in Additional Info Section");
		//Thread.sleep(500);
		webCmnUtil.implicitWait();

		cmnElement.click_On_Save_Btn_In_Adding();
		Testlistener.log("Clicked On click_On_Save_Btn_In_Adding after field validation..");
		webCmnUtil.implicitWait();
		//Thread.sleep(8000);
		String popUpMessage = bFuction
				.click_On_OK_BUtton_And_CaptureThe_POPUpMessage("Product details have been updated");
		Testlistener
				.log("The Actual Pop Up message Captured from UI after clikcing on Save button is : " + popUpMessage);

	}
	
	private void delete_The_Added_Product() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		
		String popuPmessage=bFuction.deleteProduct("Product deleted successfully", modelNumberFromExcel);
		Testlistener
		.log("The Actual Pop Up message Captured from UI after clikcing on delete Icon is : " + popuPmessage);
		
	}

}
