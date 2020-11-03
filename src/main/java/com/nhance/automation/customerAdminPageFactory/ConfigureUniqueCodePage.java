package com.nhance.automation.customerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ConfigureUniqueCodePage {
	
	public WebDriver driver;
	String text;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	CustomerAdminCommonWebElementInAllPage cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();

	public ConfigureUniqueCodePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Model')]]/following-sibling::div/ui-selectbox/select")
	private WebElement modelNumber_For_UniqueCode_Selectbox;
	
	@FindBy(xpath = "//div[@class='c-btn']")
	private WebElement modelNameSelect;
	
	public void click_On_ModelNumber_For_UniqueCode_Selectbox() throws InterruptedException {
		webUtil.retryingFindClick(modelNameSelect);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchTextField;
	
	public void write_On_Search_Text_Field(String modelNameFromExcel) {
		webUtil.retryingWriteText(searchTextField, modelNameFromExcel);
	}
	
	@FindBy(xpath = "//div//ul[@class='lazyContainer']//li//label")
	private WebElement modelNameSelectFromList;
	
	public void click_On_ModelName_From_List() throws InterruptedException {
		webUtil.retryingFindClick(modelNameSelectFromList);
	}
	
	
	@FindBy(xpath = "//select/option")
	private List<WebElement> listOfModelNames;
	
	public void select_modelNumber_For_UniqueCode_Selectbox(String modelNumberFromExcel)
	{
		/*for(int i=0; i<listOfModelNames.size(); i++) {
			if(listOfModelNames.contains(modelNumberFromExcel)) {
				listOfModelNames.get(i).click();
				break;
			}
		}*/
		webUtil.selectByVisibletext(modelNumber_For_UniqueCode_Selectbox, modelNumberFromExcel);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Unique Code')]]/following-sibling::div/ui-input-box/input")
	private WebElement uniqueCode_EditBox;
	public void write_On_uniqueCode_EditBox(String uniqueCodeFromExcel)
	{
		webUtil.retryingWriteText(uniqueCode_EditBox, uniqueCodeFromExcel);
		
	}
	
	@FindBy(xpath="//div[text()='Unique code already exist']")
	private WebElement code_Exist_Message;
	
	public String check_Text_Message() {
		String text = webUtil.getTheTextFromUI(code_Exist_Message);
		return text;		
	}
	
	//swal2-content
	
	
	
	@FindBy(xpath="//input[@placeholder='Unique Code']")
	private WebElement uniqueCode_Search_EditBox;
	public void write_On_uniqueCode_Search_EditBox(String uniqueCodeFromExcel)
	{
		webUtil.retryingWriteText(uniqueCode_Search_EditBox, uniqueCodeFromExcel);
	}
	
	@FindBy(xpath="//span[@class='ui-radiobutton-icon ui-clickable fa fa-circle']")
	private WebElement manual;
	public void click_On_Manual_Radio_Button() throws InterruptedException {
		webUtil.retryingFindClick(manual);
	}
	
	@FindBy(xpath="//div[@class='ui-radiobutton-box ui-widget ui-state-default']")
	private WebElement sequential;
	public void click_On_Sequential_Radio_Button() throws InterruptedException {
		webUtil.retryingFindClick(sequential);
	}
	
	@FindBy(xpath="//input[@placeholder='Model Number']")
	private WebElement modelNumber_Search_EditBox;
	public void write_On_modelNumber_Search_EditBox(String modelNumberFromExcel)
	{
		webUtil.retryingWriteText(modelNumber_Search_EditBox, modelNumberFromExcel);
	}
	
	@FindBy(xpath="//select[@ng-reflect-model='sequential']")
	private WebElement sequence;
	
	public void selected_Sequence(String generatedMethod) {
		webUtil.selectByVisibletext(sequence,generatedMethod );
	}
	
	@FindBy(xpath="//select[@ng-reflect-model='manual']")
	private WebElement man;
	
	public void selected_Manual(String generatedMethod) {
		webUtil.selectByVisibletext(man, generatedMethod);
	}
	
	@FindBy(xpath="//div[@class='ng2-smart-filter']/select-filter/select")
	private WebElement generated_Method;
	public void select_Generated_Method(String textExcel) throws InterruptedException {
 webUtil.selectByVisibletext(generated_Method, textExcel);
	}
	
	@FindBy(xpath="//div[@class='ng2-smart-filter']/select-filter/select")
	private WebElement status_Unique_Code;
	public void select_Status_Unique_Code(String textExcel) throws InterruptedException {
 webUtil.selectByVisibletext(status_Unique_Code, textExcel);
	}
	
	
	
	
	@FindBy(xpath="//input[@placeholder='Prefix']")
	private WebElement prefix;
	public void write_On_Prefix_EditBox(String prefixFromExcel) {
		webUtil.retryingWriteText(prefix, prefixFromExcel);
		}

	@FindBy(xpath="//input[@placeholder='Suffix']")
	private WebElement suffix;
	public void write_On_Suffix_EditBox(String suffixFromExcel) {
		webUtil.retryingWriteText(suffix, suffixFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Start']")
	private WebElement serialNumber;
	public void write_On_Serial_Number(String serialNumberFromExcel) {
		webUtil.retryingWriteText(serialNumber, serialNumberFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Number']")
	private WebElement numberOfCodes;
	public void write_On_Number_Of_Codes(String numberOfCodesFromExcel) {
		webUtil.retryingWriteText(numberOfCodes, numberOfCodesFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Format']")
	private WebElement format;
	public void write_On_Format(String formatFromExcel) {
		webUtil.retryingWriteText(format, formatFromExcel);
	}
	
	public String getAttributeOfFromatField()
	{
		String text = format.getAttribute("value");
		return text;
	}
	
	
	public void check_Text_In_Preview(String previewFromExcel) {
		WebElement expected = driver.findElement(By.xpath("//textarea[@placeholder='Preview']"));
		String expected_text = expected.getText();
		webUtil.compareString(expected_text, previewFromExcel);
	}
	
	@FindBy(xpath="//section[@class='notif notif-notice']")
	private WebElement notify;
	
/*	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private WebElement modelNumberInRecordTable;*/
	
	@FindBy(xpath = "//table/tbody/tr/td[1]/descendant::div/div")
	public List<WebElement> listOfmodelNumberInRecordTable;

	public String getTheTextOf_modelNumberInRecordTable() {
		for(int i=0;i<listOfmodelNumberInRecordTable.size();i++)
		{
			text = listOfmodelNumberInRecordTable.get(i).getText();
			break;
		}
		return text;
	}

	
	@FindBy(xpath = "//table/tbody/tr/td[3]/descendant::div/div")
	public List<WebElement> listOfGeneratedMethodInRecordTable;

	public String getTheTextOf_generated_Method_InRecordTable() {
		for(int i=0;i<listOfGeneratedMethodInRecordTable.size();i++)
		{
			text = listOfGeneratedMethodInRecordTable.get(i).getText();
			break;
		}
		return text;
	}
	
	@FindBy(xpath="//table/tbody/tr/td[4]/descendant::div//a")
	private List<WebElement> listOfViewLogInRecordTable;

	public void click_Text_View_Log() {
		for(int i=0;i<listOfViewLogInRecordTable.size();i++)
		{
			listOfViewLogInRecordTable.get(i).click();
			break;
		}
	}	
	
	
	@FindBy(xpath="//table/tbody/tr/td[5]/descendant::div[@class='view']")
	private List<WebElement> listOfEditViewInRecordTable;

	public void click_On_Edit_View() {
		for(int i=0;i<listOfEditViewInRecordTable.size();i++)
		{
			listOfEditViewInRecordTable.get(i).click();
			break;
		}
	}	
	
	@FindBy(xpath="//pre[contains(text(),'Code already')]")
	private WebElement log_Details_Exist;

	public String already_exist() {
		String text = webUtil.getTheTextFromUI(log_Details_Exist);
		return text;
	}
	
	@FindBy(xpath="//textarea[@placeholder='Preview']")
	private WebElement preview;

	public String check_Text() {
		String text = webUtil.get_Attribut_value(preview);
				
		return text;
	}
	

	@FindBy(xpath="//input[@placeholder='Start']")
	private WebElement serialNumberAutoFetch;

	public String get_Text_SerialNumberAutoFetch() {
		String text = webUtil.get_Attribut_value(serialNumberAutoFetch);
				
		return text;
	}

	
	@FindBy(xpath="//pre")
	private WebElement log_Details_Success;
	
	public String added_Successfully() {
		String text = webUtil.getTheTextFromUI(log_Details_Success);
		return text;
	}
		
	
	@FindBy(xpath="//input[@value='Import']")
	private WebElement import_Button;
	public void click_On_Import() throws InterruptedException {
		webUtil.retryingFindClick(import_Button);
	}
		@FindBy(xpath="//input[@value='Attach File']")
	private WebElement attachFile;
	public void click_On_Attach_File() throws InterruptedException {
		webUtil.retryingFindClick(attachFile);
	}

	@FindBy(xpath="//a[text()='View log']")
	private WebElement view_Log;
	public void click_On_View_Log() throws InterruptedException {
		webUtil.retryingFindClick(view_Log);
	}
	
	@FindBy(xpath="//i[@class='fa fa-times']")
	private WebElement close;
	
	public void close_View_Log() throws InterruptedException {
		webUtil.retryingFindClick(close);
	}
	
	public void doThePartialSearch(List<WebElement> listOfmodelNumberInRecordTable2, String partialText) {
		
	}
	public void doTheInvalidSearch(List<WebElement> listOfmodelNumberInRecordTable2, String invalidModelNumberText) {
		
	}
}