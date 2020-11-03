package com.nhance.automation.DubaiCustomerAdminTestClasses;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nhance.automation.customerAdminBase.BaseTest;
import com.nhance.automation.customerDubaiAdminModulesImplementation.ProductManagement;
import com.nhance.automation.enumFiles.Product_specific_identifier;
import com.nhance.automation.webGenericLibrary.GenericFunctionsForWeb;
import com.nhance.automation.webGenericLibrary.Testlistener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners(Testlistener.class)
@Epic("Smoke Test")
public class ProductFeatureTest extends BaseTest{
	
	ProductManagement productManagement;
	Map<String, String> map;
	
	
	@BeforeClass
	public void startUp_For_India_CustomerAdmin() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException {
		GenericFunctionsForWeb.read_Environment_Variable_for_Web();
		super.startUp_For_Dubai_CustomerAdmin();
	}
	
	@BeforeMethod
	public void before_ProductFaeture_Test_Execution_Method() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 productManagement = new ProductManagement();
		 map = new HashMap<String, String>();
		 
		 map.put(Product_specific_identifier.PRODUCT_SET_UP.getName(), Product_specific_identifier.PRODUCT_SET_UP.getCode().toString());
		 productManagement.moduleSpecificSetUp(map);
		 // TODO: script entry to db
	}
	
    //@Test(priority =0, description ="Add Product for Delete Purpose")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description : Add Product for Delete Purpose..")
	public void addProducts_for_delete_Test()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Testlistener.log("Test Started for Adding a Product for delete purpose......");
		// Calling Add Product for delete Method from Product Module Implementation Classes	
		productManagement.addProducts_for_delete();
	}
	
	//@Test(priority = 1, description = "Delete the added Product")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description : Checking the functionality of delete for added product in product management..")
	public void deleteProduct_Test()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Testlistener.log("Test Started for Adding Fresh Product......");
		// Calling Add Product Method from Product Module Implementation Classes	
		map.put(Product_specific_identifier.DELETE_PRODUCT.getName(), Product_specific_identifier.DELETE_PRODUCT.getCode().toString());
		productManagement.deleteTest(map);
	}
	
	@Test(priority = 2, description = "Add Product Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description : Adding New Product in Product Management for Nhance Brand Admin with Fresh Data..")
	public void addProduct_Test()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Testlistener.log("Test Started for Adding Fresh Product......");
		// Calling Add Product Method from Product Module Implementation Classes	
		map.put(Product_specific_identifier.ADD_PRODUCT.getName(), Product_specific_identifier.ADD_PRODUCT.getCode().toString());
		productManagement.addTest(map);
	}
	
	//@Test(priority = 3, description = "Test Description : Adding Duplicate Product in Product Management for Nhance Brand..")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description : Adding Duplicate Product in Product Management for Nhance Brand Admin with Same Data..")
	public void addDuplicateProduct_Test() throws InterruptedException{
		Testlistener.log("Test Started for Adding Duplicate Product......");
		// Calling Duplicate Method from Product Module Implementation Classes
		map.put(Product_specific_identifier.DUPLICATE_PRODUCT.getName(), Product_specific_identifier.DUPLICATE_PRODUCT.getCode().toString());
		productManagement.checkDuplicateTest(map);
	}
	
	//@Test(priority = 4, description = "Checking the functionality of inline search field available in product view page")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description : Search the added product by inline search field available in the view page and get the count")
	public void inline_Search_By_all_Search_Field() throws InterruptedException{
		Testlistener.log("Test Started for All Inline search field for Product Management......");
		// Calling In line search Method from Product Module Implementation Classes
		map.put(Product_specific_identifier.INLINE_SEARCH_IN_PRODUCT.getName(), Product_specific_identifier.INLINE_SEARCH_IN_PRODUCT.getCode().toString());
		productManagement.inLineSearchTest(map);	
	}
	
	//@Test(priority = 5, description = "Test Description : Search the Added Product and Validate All the Field..")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description : Search the Added Product And Validate all the field in Edit page..")
	public void search_And_Validate_All_The_Field_Data_In_Product_Edit_Page() throws InterruptedException{
		Testlistener.log("Test Started for Validating all field for Added Product......");
		// Calling Add Product Method from Product Module Implementation Classes
		map.put(Product_specific_identifier.VALIDATE_PRODUCT.getName(), Product_specific_identifier.VALIDATE_PRODUCT.getCode().toString());
		productManagement.validate_All_Field_For_Added_Item(map);	
	}
	
	//@Test(priority = 6, description = "Test Description : Search the Added Product and check the edit functionality ..")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description : Search the Added Product And Update all the field in Edit page of Product..")
	public void search_And_Edit_All_The_Field_In_Product_Edit_Page_For_ParticularProduct() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		Testlistener.log("Test Started for Edit functionality by editing all the field for Added Product and validate the updated data......");
		// Calling Add Product Method from Product Module Implementation Classes
		map.put(Product_specific_identifier.EDIT_PRODUCT.getName(), Product_specific_identifier.EDIT_PRODUCT.getCode().toString());
		productManagement.editTest(map);	
	}	
	
	//@Test(priority = 7, description = "Test Description : Add the same Product with different subcategory..")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description : Add the same Product with different subcategory...")
	public void add_New_Product() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		Testlistener.log("Test Started for Add the same Product with different subcategory.......");
		// Calling Add Product Method from Product Module Implementation Classes
		productManagement.AddTheSameProductWithDifferentSubcategory();	
	}

	@AfterClass(alwaysRun=true)
	public void cleanUp() throws InterruptedException {
		super.cleanUpForDubaiLogin();;
	}
	
	
}
