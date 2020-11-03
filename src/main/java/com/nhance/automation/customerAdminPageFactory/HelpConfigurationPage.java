package com.nhance.automation.customerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class HelpConfigurationPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil=new WebDriverCommonUtill();
	boolean r1;
	int i;
	Dimension size;
	String labelName_of_Product;

	public HelpConfigurationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Title')]]/following-sibling::div/ui-input-box/input")
	private WebElement helpCenter_title_EditBox;
	public void write_on_helpCenter_title_EditBox(String titleFromExcel)
	{
		webUtil.retryingWriteText(helpCenter_title_EditBox, titleFromExcel);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Default')]]/following-sibling::p-radiobutton[1]/div/div[2]")
	private WebElement default_RadioBtn;
	public void click_On_default_RadioBtn() throws InterruptedException
	{
		webUtil.retryingFindClick(default_RadioBtn);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Product Sub-Category')]]/following-sibling::p-radiobutton[1]/div/div[2]")
	private WebElement product_subCategory_RadioBtn;
	public void click_On_product_Sub_Category_RadioBtn() throws InterruptedException
	{
		webUtil.retryingFindClick(product_subCategory_RadioBtn);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Product Sub-Category')]]/following-sibling::div/p-autocomplete/span/input")
	private WebElement productSubCategoryTextBox;
	public void write_In_productSubCategoryTextBox(String productSubcategory)
	{
		webUtil.retryingWriteText(productSubCategoryTextBox, productSubcategory);
	}
	
	// Model Number in Auto suggest Box
	@FindBy(xpath = "//div[p-autocomplete[@formcontrolname='psc']]//div//ul//li//span")
	private WebElement productSubacategory_In_AutoSuggest;

	// Method to click on Model Number from Auto suggest box
	public void click_on_productSubCategory_In_AutoSuggest(String productSubCategory) {
	 String textFromAutoSuggest = productSubacategory_In_AutoSuggest.getText().trim();

			if (textFromAutoSuggest.equals(productSubCategory)) {
				Testlistener.log("Product Sub category Captured from Auto Suggest box is : "+ productSubCategory);
				Testlistener.log("Product Sub category Matched in Auto Suggest box..");
				productSubacategory_In_AutoSuggest.click();
			}
			else
			{ 
				Testlistener.log("Product Sub category is not present in Auto Suggest box ::::: FAIL");
			}
		}
	
	
	@FindBy(xpath="//div[@class='help-center-block']/div//label//input")
	private List<WebElement> first_questionButtonList;
	public void click_On_first_questionButtonList(int i) throws InterruptedException
	{
		try {
	        Thread.sleep((int) (3000));
	    } catch (InterruptedException e) {
	        //
	        e.printStackTrace();
	    }
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", first_questionButtonList.get(i));
	}
	
	
	@FindBy(xpath="//div[@class='help-center-block']/div/ui-input-box/input")
	private List<WebElement> first_Question_EditBox_List;
	public void write_On_first_Question_EditBox_List(int i, String firstQuestionFromExcel) throws InterruptedException
	{
		webUtil.retryingWriteText(first_Question_EditBox_List.get(i), firstQuestionFromExcel);
	}
	
	@FindBy(xpath="//div[@class='help-center-block child']/div//label//input")
	private List<WebElement> second_SubQuestionButtonList;
	public void click_On_second_SubQuestionButtonList(int i) throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", second_SubQuestionButtonList.get(i));
	}
	
	@FindBy(xpath="//div[@class='help-center-block child']/div/ui-input-box/input")
	private List<WebElement> second_Sub_Question_EditBox_List;
	public void write_On_second_Sub_Question_EditBox_List(int i, String secondSubQuestionFromExcel) throws InterruptedException
	{
		webUtil.retryingWriteText(second_Sub_Question_EditBox_List.get(i), secondSubQuestionFromExcel);
	}
	
	@FindBy(xpath="//div[@class='help-center-block child']/app-question-model-recurring/div/div/div/ui-input-box/input[@placeholder='Question']")
	private List<WebElement> third_Sub_Question_editBox;
	public void write_On_third_Sub_Question_editBox(int i, String thirdSubQuestionFromExcel)
	{
		webUtil.retryingWriteText(third_Sub_Question_editBox.get(i), thirdSubQuestionFromExcel);
	}
	
	@FindBy(xpath="//li[contains(text(),'Add New Question')]")
	private List<WebElement> addNewQuestion_Link;
	public void click_On_addNewQuestion_Link(int i) throws InterruptedException
	{
		webUtil.retryingFindClick(addNewQuestion_Link.get(i));
	}
	
	@FindBy(xpath="//li[contains(text(),'Add New Sub Question')]")
	private List<WebElement> addNewSubQuestion_Link;
	public void click_On_addNewSubQuestion_Link(int i) throws InterruptedException
	{
		webUtil.retryingFindClick(addNewSubQuestion_Link.get(i));
	}
	
	@FindBy(xpath="//input[@placeholder='Answer']")
	private List<WebElement> answer_EditBox;
	public void write_On_answer_EditBox(int i, String answerFromExcel )
	{
		webUtil.retryingWriteText(answer_EditBox.get(i), answerFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Title']")
	private WebElement title_Search_Box;
	public void write_On_title_Search_Box(String titleFromExcel)
	{
		webUtil.retryingWriteText(title_Search_Box, titleFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Product Sub-Category ']")
	private WebElement productCategory_Search_Box;
	public void write_On_productCategory_Search_Box(String productCategoryFromExcel )
	{
		webUtil.retryingWriteText(productCategory_Search_Box, productCategoryFromExcel);
	}
	
	@FindBy(xpath="//div[@class='tablestyle']/table/tbody/tr/td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_of_title_In_ViewTable;
	
	@FindBy(xpath="//div[@class='tablestyle']/table/tbody/tr/td[2]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_of_ProductSubCategory_In_ViewTable;
	
	

}
