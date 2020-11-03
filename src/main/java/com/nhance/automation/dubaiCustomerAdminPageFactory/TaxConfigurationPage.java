package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class TaxConfigurationPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public TaxConfigurationPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Tax Configuration')]")
	private WebElement taxConfigurationLink;
	
	public void click_Tax_Configuration_Link() throws InterruptedException {
		webUtil.retryingFindClick(taxConfigurationLink);
	}
	
	@FindBy(xpath="//ui-label[label[text()='Tax Name']]/following-sibling::div//input")
	private WebElement taxNameTextField;
	
	public void write_TaxName_TextField(String taxNameFromExcel) {
		webUtil.retryingWriteText(taxNameTextField, taxNameFromExcel);
	}
	
	@FindBy(xpath="//ui-label[label[text()='Rate(%)']]/following-sibling::div//input")
	private WebElement rateTextField;
	
	public void write_Rate_TextField(String rateFromExcel) {
		webUtil.retryingWriteText(rateTextField, rateFromExcel);
	}
	
	
	@FindBy(xpath="//ui-label[label[text()='GST(%)']]/following-sibling::p-autocomplete//button")
	public WebElement selectBoxGST;
	
	
	public void click_On_Gst_Box() throws InterruptedException {
		webUtil.retryingFindClick(selectBoxGST);
	}
	
	@FindBy(xpath = "//th//ui-selectbox[@formcontrolname='taxName']/following-sibling::p-autocomplete//span//input")
	public WebElement taxPercentageEditBox;
	
	public void write_On_Tax_Percentage_Edit_Box(String taxValueFromExcel) {
		webUtil.retryingWriteText(taxPercentageEditBox, taxValueFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='tax percent']") 
	private WebElement taxValueText;
	
	public String getTextOfTaxPercentageValue() {
		return taxValueText.getText();
	}
	
	@FindBy(xpath="//ui-label[label[text()='GST(%)']]/following-sibling::p-autocomplete//input")
	public WebElement gstSelectBox;
	
	
	public void write_On_GstSelectBox(String gstFromExcel) {
		webUtil.retryingWriteText(gstSelectBox, gstFromExcel);
	}

	@FindBy(xpath = "//label[text()='Tax Type and Percentage']")
	public  WebElement taxTypeText;
	
	@FindBy(xpath="//p-autocomplete//span//div//ul/li")
	private List<WebElement> listOfselectBoxGSTValue;
	

	public void click_On_Gst_Value() throws InterruptedException {
		
		webUtil.retryingFindClick(selectBoxGST);
		
	}
	

	
	@FindBy(xpath="//textarea[@placeholder='Company Address']")
	private WebElement companyAddress;
	
	public void write_CompanyAddress(String addressFromExcel) {
		webUtil.retryingWriteText(companyAddress, addressFromExcel);
	}
	
	
	@FindBy(xpath="//span[@class='closeIcon']//i[@class='fa fa-times']")
	private List<WebElement> closeList;
	
	public void click_On_Close() throws InterruptedException {
		for(int i=0; i<closeList.size(); i++) {
			webUtil.retryingFindClick(closeList.get(i));
			break;
		}
	}
	
	@FindBy(xpath="//input[@placeholder='Tax name']")
	private WebElement taxNameSearchBox;
	
	public void write_On_TaxName_Search_Box(String taxNameFromExcel) {
		webUtil.retryingWriteText(taxNameSearchBox, taxNameFromExcel);
	}
	
	@FindBy(xpath="//img[@class='delete']")
	private WebElement deleteIcon;
	
	public void click_On_Delete() throws InterruptedException {
		webUtil.retryingFindClick(deleteIcon);
	}
	
	
	// Method to click on Rate Values from Auto suggest box
			public void click_on_RateValues_In_AutoSuggest(String rateFromExcel) throws InterruptedException {
				
				for(int i=0;i<listOfselectBoxGSTValue.size();i++)
				{
					System.out.println("The Total size is : "+ listOfselectBoxGSTValue.size());
				//String textFromAutoSuggest = .trim();

				if (listOfselectBoxGSTValue.get(i).getText().trim().equals(rateFromExcel.trim())) {
					Testlistener.log("The GST rate value Captured from Auto Suggest box is : "+ rateFromExcel);
					System.out.println("The GST rate value Captured from Auto Suggest box is : "+ rateFromExcel);
					Testlistener.log("The GST rate value Matched in Auto Suggest box..");
					System.out.println("The GST rate value Matched in Auto Suggest box..");
					Thread.sleep(2000);
					listOfselectBoxGSTValue.get(i).click();
					Thread.sleep(2000);
					break;
				}
				else
				{ 
					Testlistener.log("The GST rate value Captured from Auto Suggest box is : "+ rateFromExcel);
					Testlistener.log("The GST rate value Matched in Auto Suggest box..");
					//listOfselectBoxGSTValue.get(i).click();
					//break;
			
				}
				
				}
			}
	
	
			
}
