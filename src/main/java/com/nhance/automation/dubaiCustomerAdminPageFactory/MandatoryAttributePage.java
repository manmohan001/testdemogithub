package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class MandatoryAttributePage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	// BusinessFunction bMthd = new BusinessFunction();
	String campaignId;

	public MandatoryAttributePage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Mandatory Attributes')]")
	private WebElement mandatoryAttributeLink;
	
	public void click_On_Mandatory_Attribute_Link() throws InterruptedException {
		webUtil.retryingFindClick(mandatoryAttributeLink);
	}
	
	@FindBy(xpath="//input[@placeholder='Product Subcategory']")
	private WebElement mandatoryAttribute_Search_Editbox;
	
	public void write_on_mandatoryAttribute_Search_Editbox(String mandatorySetValueFromExcel)
	{
		webUtil.retryingWriteText(mandatoryAttribute_Search_Editbox, mandatorySetValueFromExcel);
	}

	@FindBy(xpath="//ui-selectbox[@formcontrolname='attributeCode']/select")
	private List<WebElement> attributeCode_SelectBox;
	
	//button[text()='OK']
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement OKPopUP;

   public void  click_On_OK() throws InterruptedException {
	webUtil.retryingFindClick(OKPopUP);
	}
	
	public void select_attributeCode_SelectBox(String attributeCode,int i) {
		webUtil.selectByVisibletext(attributeCode_SelectBox.get(i), attributeCode);
	}
	

	
	@FindBy(xpath="//ui-selectbox[@formcontrolname='attributeDataType']/select")
	private List<WebElement> attributeDataType_SelectBox;
	
	public void select_attributeDataType_SelectBox(String attributeDataType,int i) {
		webUtil.selectByVisibletext(attributeDataType_SelectBox.get(i), attributeDataType);
	}
	
	@FindBy(xpath="//ui-selectbox[@formcontrolname='attributeDataType']/select")
	private WebElement attribute_Data_Type_Select_Box;
	
	public void moveMouseToDateTypeSelectBox()
	{
		Actions act = new Actions(driver);
		act.moveToElement(attribute_Data_Type_Select_Box).build().perform();
	}
	
	@FindBy(css=".ui-tooltip")
	private WebElement toolTipTextForDateSelectBox;
	public String getTheTextOfToolTipOfDateSelectBox()
	{
		String tooltipText = toolTipTextForDateSelectBox.getText();
		return tooltipText;
	}
	
	@FindBy(xpath="//ui-selectbox[@formcontrolname='attributeScope']/select")
	private List<WebElement> attributeScope_SelectBox;
	
	public void select_attributeScope_SelectBox(String attributeScope,int i) {
		webUtil.selectByVisibletext(attributeScope_SelectBox.get(i), attributeScope);
	}
	
	@FindBy(xpath="//ui-selectbox[@formcontrolname='attributeScope']/select")
	private WebElement attribute_Scope_Select_Box;
	
	public void moveMouseToScopeSelectBox()
	{
		Actions act = new Actions(driver);
		act.moveToElement(attribute_Scope_Select_Box).build().perform();
	}
	
	@FindBy(css=".ui-tooltip")
	private WebElement toolTipTextForScopeSelectBox;
	public String getTheTextOfToolTipOfScopeSelectBox()
	{
		String tooltipText = toolTipTextForScopeSelectBox.getText();
		return tooltipText;
	}
	
	@FindBy(xpath="//input[@placeholder='Display Name']")
	private WebElement displayNameTextBox;
	
	
	public void write_On_Display_Text_Box(String displayNameFromExcel) {
		webUtil.retryingWriteText(displayNameTextBox, displayNameFromExcel);
	}
	
	
	public void moveMouseToDisplayTextBox()
	{
		Actions act = new Actions(driver);
		act.moveToElement(displayNameTextBox).build().perform();
	}
	
	@FindBy(css=".ui-tooltip")
	private WebElement toolTipTextForDisplayTextBox;
	public String getTheTextOfToolTipOfDisplayTextBox()
	{
		String tooltipText = toolTipTextForDisplayTextBox.getText();
		return tooltipText;
	}
	
	@FindBy(xpath="//ui-selectbox[@formcontrolname='productSubCategory']//select")
	private List<WebElement> productSubCategory_SelectBox;
	
	
	public void select_Product_SubCategory_SelectBox(String attributeScope,int i) {
		webUtil.selectByVisibletext(productSubCategory_SelectBox.get(i), attributeScope);
	}
	
	@FindBy(xpath="//div[ui-label[label[text()='Default']]]//p-radiobutton[@value='1']")
	private WebElement defaultRadioButton;
	
	public void click_On_Default_RadioButton() throws InterruptedException {
		webUtil.retryingFindClick(defaultRadioButton);
	}
	

	@FindBy(xpath="//div[ui-label[label[text()='Product Subcategory']]]//p-radiobutton[@value='2']")
	private WebElement productSubCategoryRadioButton;
	
	public void click_On_Produc_SubCategory_RadioButton() throws InterruptedException {
		webUtil.retryingFindClick(productSubCategoryRadioButton);
	}
	
	
	@FindBy(xpath="//img[@class='delete']")
	private WebElement deleteIcon;
	
	public void click_On_Delete() throws InterruptedException {
		webUtil.retryingFindClick(deleteIcon);
	}
	
	
	
	
	
	
}
