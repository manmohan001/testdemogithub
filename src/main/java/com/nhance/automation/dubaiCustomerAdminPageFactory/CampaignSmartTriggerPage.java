package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;


public class CampaignSmartTriggerPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	// BusinessFunction bMthd = new BusinessFunction();

	public CampaignSmartTriggerPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'Smart Trigger')]")
	private WebElement smartTrigger_HeaderName;

	public String getText_Of_smartTrigger_Text() {
		String capture_HeaderName_For_SmartTrigger = webUtil.getTheTextFromUI(smartTrigger_HeaderName);
		return capture_HeaderName_For_SmartTrigger;

	}

	@FindBy(xpath = "//div[contains(text(),'Smart Trigger')]/following-sibling::div/ui-button/input[@value='Save']")
	private WebElement saveButton_In_SmartTriggerPage;

	public void click_On_saveButton_In_SmartTriggerPage() throws InterruptedException {
		webUtil.retryingFindClick(saveButton_In_SmartTriggerPage);
	}

	@FindBy(xpath = "//div[contains(text(),'Smart Trigger')]/following-sibling::div/ui-button/input[@value='Back']")
	private WebElement backButton_In_SmartTriggerPage;

	public void click_On_backButton_In_SmartTriggerPage() throws InterruptedException {
		webUtil.retryingFindClick(backButton_In_SmartTriggerPage);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Title')]]/following-sibling::ui-input-box/input")
	private WebElement title_EditBox_In_SmartTriggerPage;

	public void write_In_title_EditBox_In_SmartTriggerPage(String title_FromExcel) {
		webUtil.retryingWriteText(title_EditBox_In_SmartTriggerPage, title_FromExcel);
	}

	public String getText_of_title_EditBox_In_SmartTriggerPage() {
		String text = webUtil.get_Attribut_value(title_EditBox_In_SmartTriggerPage);
		return text;
	}

	@FindBy(xpath = "//input[@value='Attach File']")
	private WebElement attachFile_Link_In_SmartTriggerPage;

	public void click_On_attachFile_Link_In_SmartTriggerPage(String FilePathToUpload)
			throws IOException, InterruptedException {
		webUtil.retryingFindClick(attachFile_Link_In_SmartTriggerPage);
		webUtil.fileUpload(FilePathToUpload);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Message')]]/following-sibling::ui-textarea/textarea")
	private WebElement message_EditBox_In_SmartTriggerPage;

	public void write_In_message_EditBox_In_SmartTriggerPage(String message_FromExcel) {
		webUtil.retryingWriteText(message_EditBox_In_SmartTriggerPage, message_FromExcel);
	}

	public String getText_of_message_EditBox_In_SmartTriggerPage() {
		String text = webUtil.get_Attribut_value(message_EditBox_In_SmartTriggerPage);
		return text;
	}

	@FindBy(xpath = "//table[@formarrayname='campaignFilterModels']/tbody/tr/th/ui-selectbox/select")
	private WebElement if_SelectBox;

	public void select_From_if_SelectBox(String value_From_Excel) {
		webUtil.selectByVisibletext(if_SelectBox, value_From_Excel);
	}

	public String getSelectedText_Of_if_SelectBox() {
		String option_Name_For_Consumer = webUtil.getFirstSelectionOption(if_SelectBox);
		return option_Name_For_Consumer;
	}

	@FindBy(xpath = "//table[@formarrayname='campaignFilterModels']/tbody/tr/th/ui-input-box/input")
	private WebElement if_EditBox;

	public void write_In_if_EditBox(String value_FromExcel) {
		webUtil.retryingWriteText(if_EditBox, value_FromExcel);
	}

	public String getText_of_if_EditBox() {
		String text = webUtil.get_Attribut_value(if_EditBox);
		return text;
	}

	@FindBy(xpath = "//table[@formarrayname='campaignFilterModels']/tbody/tr/th/ui-icon/div ")
	private WebElement deleteIcon_In_IfSection;

	public void click_On_deleteIcon_In_IfSection() throws InterruptedException {
		webUtil.retryingFindClick(deleteIcon_In_IfSection);
	}

	@FindBy(xpath = "//table[@formarrayname='campaignFilterModels']/tfoot/tr/th/ui-icon/div")
	private WebElement addIcon_In_IfSection;

	public void click_On_addIcon_In_IfSection() throws InterruptedException {
		webUtil.retryingFindClick(addIcon_In_IfSection);
	}

	@FindBy(xpath = "//table[@formarrayname='campaignFilterModels']/tbody/tr/th/ui-input-box/input")
	private WebElement triggerMessageAt_EditBox;

	public void write_In_triggerMessageAt_EditBox(String triggerMessageTime_FromExcel) {
		webUtil.retryingWriteText(triggerMessageAt_EditBox, triggerMessageTime_FromExcel);
	}

	public String getText_of_triggerMessageAt_EditBox() {
		String text = webUtil.get_Attribut_value(triggerMessageAt_EditBox);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Trigger message at')]]/following-sibling::ui-selectbox/select")
	private WebElement triggerMessage_SelectBox;

	public void select_From_triggerMessage_SelectBox(String triggerMessageValue_From_Excel) {
		webUtil.selectByVisibletext(triggerMessage_SelectBox, triggerMessageValue_From_Excel);
	}

	public String getSelectedText_Of_triggerMessage_SelectBox() {
		String option_Name_For_triggerMessage = webUtil.getFirstSelectionOption(triggerMessage_SelectBox);
		return option_Name_For_triggerMessage;
	}

}
