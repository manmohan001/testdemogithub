package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ProductDiscoveryPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	String modelNumber;
	int size_of_the_list;
	// BusinessFunction bMthd = new BusinessFunction();

	public ProductDiscoveryPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ui-label[label='Product models']/following-sibling::ss-multiselect-dropdown/div/button")
	private WebElement productModel_SelectBox_Button;

	public void click_On_productModel_SelectBox_Button() throws InterruptedException {
		webUtil.retryingFindClick(productModel_SelectBox_Button);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Product models')]]/following-sibling::ss-multiselect-dropdown/div/button/following-sibling::div/a[1]")
	private WebElement selectAll_Link_In_Dropdown;

	public void click_On_selectAll_Link_In_Dropdown() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", selectAll_Link_In_Dropdown);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Product models')]]/following-sibling::ss-multiselect-dropdown/div/button/following-sibling::div/a[2]")
	private WebElement unselectAll_Link_in_DropDown;

	public void click_On_unselectAll_Link_in_DropDown() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", unselectAll_Link_in_DropDown);

	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Product models')]]/following-sibling::ss-multiselect-dropdown/div/button/following-sibling::div/a[@ng-reflect-klass='dropdown-item']")
	private List<WebElement> list_of_ModelNumber_In_dropdownItem;

	public int getThe_Count_of_ModelNumber_In_dropdownItem() {
		for (int i = 0; i < list_of_ModelNumber_In_dropdownItem.size(); i++) {
			size_of_the_list = list_of_ModelNumber_In_dropdownItem.size();
		}
		return size_of_the_list;
	}

	public List<String> getThe_Checked_ModelNumber_From_List() throws InterruptedException {
		size_of_the_list = list_of_ModelNumber_In_dropdownItem.size();

		for (int i = 0; i < 11; i++) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					list_of_ModelNumber_In_dropdownItem.get(i));
			webUtil.retryingFindClick(list_of_ModelNumber_In_dropdownItem.get(i));
			Thread.sleep(500);
			modelNumber += list_of_ModelNumber_In_dropdownItem.get(i).getText() + "," + " ".trim();
			;
			Reporter.log(modelNumber.replace("null", "").trim(), true);
		}

		List<String> listOfProductModelNumberInWeb = new ArrayList<String>(
				Arrays.asList(modelNumber.replace("null", "").split(",")));
		Reporter.log("The List of Product Model Number in web are :: ", true);
		for (int i = 0; i < listOfProductModelNumberInWeb.size(); i++) {
			Reporter.log("---- " + listOfProductModelNumberInWeb.get(i).trim() + " -----", true);
		}
		return listOfProductModelNumberInWeb;
	}
}
