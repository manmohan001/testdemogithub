package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;


public class CampaignOffersPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	// BusinessFunction bMthd = new BusinessFunction();

	public CampaignOffersPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'Offers')]")
	private WebElement offers_HeaderName;

	public String getText_Of_smartTrigger_Text() {
		String capture_HeaderName_For_Offers = webUtil.getTheTextFromUI(offers_HeaderName);
		return capture_HeaderName_For_Offers;

	}

	@FindBy(xpath = "//div[contains(text(),'Offers')]/following-sibling::div/ui-button/input[@value='Save']")
	private WebElement saveButton_In_OffersPage;

	public void click_On_saveButton_In_OffersPage() throws InterruptedException {
		webUtil.retryingFindClick(saveButton_In_OffersPage);
	}

	@FindBy(xpath = "//div[contains(text(),'Offers')]/following-sibling::div/ui-button/input[@value='Back']")
	private WebElement backButton_In_OffersPage;

	public void click_On_backButton_In_OffersPage() throws InterruptedException {
		webUtil.retryingFindClick(backButton_In_OffersPage);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Title')]]/following-sibling::ui-input-box/input")
	private WebElement title_EditBox_In_OffersPage;

	public void write_In_title_EditBox_In_OffersPage(String title_FromExcel) {
		webUtil.retryingWriteText(title_EditBox_In_OffersPage, title_FromExcel);
	}

	public String getText_of_title_EditBox_In_OffersPage() {
		String text = webUtil.get_Attribut_value(title_EditBox_In_OffersPage);
		return text;
	}

	@FindBy(xpath = "//input[@value='Attach File']")
	private WebElement attachFile_Link_In_OffersPage;

	public void click_On_attachFile_Link_In_OffersPage(String FilePathToUpload)
			throws IOException, InterruptedException {
		webUtil.retryingFindClick(attachFile_Link_In_OffersPage);
		webUtil.fileUpload(FilePathToUpload);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Expiry Date')]]/following-sibling::my-date-picker/div/div/input")
	private WebElement expiryDate_EditBox;

	public void write_In_expiryDate_EditBox(String expiryDate_From_Excel) {
		webUtil.retryingWriteText(expiryDate_EditBox, expiryDate_From_Excel);
	}

	public String getText_of_expiryDate_EditBox() {
		String text = webUtil.get_Attribut_value(expiryDate_EditBox);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Expiry Date')]]/following-sibling::my-date-picker/div/div/input/following-sibling::div/button[@aria-label='Clear Date']/span")
	private WebElement clearButton_For_expiryDate_EditBox;

	public void click_On_clearButton_For_expiryDate_EditBox() throws InterruptedException {
		webUtil.retryingFindClick(clearButton_For_expiryDate_EditBox);
	}

	@FindBy(xpath = "//div[@class='canva-btn']")
	private WebElement designWithCanvaButtonLink_In_OffersPage;

	public void click_On_designWithCanvaButtonLink_In_OffersPage() throws InterruptedException {
		webUtil.retryingFindClick(designWithCanvaButtonLink_In_OffersPage);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Message')]]/following-sibling::ui-textarea/textarea")
	private WebElement message_EditBox_In_OffersPage;

	public void write_In_message_EditBox_In_OffersPage(String message_FromExcel) {
		webUtil.retryingWriteText(message_EditBox_In_OffersPage, message_FromExcel);
	}

	public String getText_of_message_EditBox_In_OffersPage() {
		String text = webUtil.get_Attribut_value(message_EditBox_In_OffersPage);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Description')]]/following-sibling::ui-textarea/textarea")
	private WebElement description_EditBox_In_OffersPage;

	public void write_In_description_EditBox_In_OffersPage(String description_FromExcel) {
		webUtil.retryingWriteText(description_EditBox_In_OffersPage, description_FromExcel);
	}

	public String getText_of_description_EditBox_In_OffersPage() {
		String text = webUtil.get_Attribut_value(description_EditBox_In_OffersPage);
		return text;
	}

	@FindBy(xpath = "//span[contains(text(),'Send Now')]")
	private WebElement sendNow_Link_In_Schedule;

	public void click_On_sendNow_Link_In_Schedule() throws InterruptedException {
		webUtil.retryingFindClick(sendNow_Link_In_Schedule);
	}

	@FindBy(xpath = "//span[contains(text(),'Send On')]")
	private WebElement sendOn_Link_In_Schedule;

	public void click_On_sendOn_Link_In_Schedule() throws InterruptedException {
		webUtil.retryingFindClick(sendOn_Link_In_Schedule);
	}

	@FindBy(xpath = "//div[p-selectbutton[div[div[span[contains(text(),'Send On')]]/preceding-sibling::div]]]/following-sibling::div/input")
	private WebElement sendOn_TimeField_EditBox;

	public void write_in_sendOn_TimeField_EditBox(String time_From_Excel) {
		webUtil.retryingWriteText(sendOn_TimeField_EditBox, time_From_Excel);
	}

	public String getText_of_sendOn_TimeField_EditBox() {
		String text = webUtil.get_Attribut_value(sendOn_TimeField_EditBox);
		return text;
	}

	@FindBy(xpath = "//div[p-selectbutton[div[div[span[contains(text(),'Send On')]]/preceding-sibling::div]]]/following-sibling::div/my-date-picker/div/div/input")
	private WebElement sendOn_DateField_EditBox;

	public void write_in_sendOn_DateField_EditBox(String date_From_Excel) {
		webUtil.retryingWriteText(sendOn_DateField_EditBox, date_From_Excel);
	}

	public String getText_of_sendOn_DateField_EditBox() {
		String text = webUtil.get_Attribut_value(sendOn_DateField_EditBox);
		return text;
	}

	@FindBy(xpath = "//div[p-selectbutton[div[div[span[contains(text(),'Send On')]]/preceding-sibling::div]]]/following-sibling::div/my-date-picker/div/div/div/button[@aria-label='Clear Date']/span")
	private WebElement clearButton_For_sendOn_DateField_EditBox;

	public void click_On_clearButton_For_sendOn_DateField_EditBox() throws InterruptedException {
		webUtil.retryingFindClick(clearButton_For_sendOn_DateField_EditBox);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Timezone')]]/following-sibling::div/ui-selectbox/select")
	private WebElement timeZone_SelectBox;

	public void select_From_timeZone_SelectBox(String timeZone_From_Excel) {
		webUtil.selectByVisibletext(timeZone_SelectBox, timeZone_From_Excel);
	}

	public String getSelectedText_Of_timeZone_SelectBox() {
		String text = webUtil.getFirstSelectionOption(timeZone_SelectBox);
		return text;
	}

	@FindBy(xpath = "//div[ui-label[label[contains(text(),'Recurring')]]]/following-sibling::div/span/ui-button-toggle/div/span[@class='switch-label']")
	private WebElement recurring_ToggleButton;

	public void click_On_recurring_ToggleButton() throws InterruptedException {
		webUtil.retryingFindClick(recurring_ToggleButton);
	}

	@FindBy(xpath = "//div[ui-label[label[contains(text(),'Recurring')]]]/following-sibling::div/div/div/my-date-picker/div/div/input")
	private WebElement recurring_DateField_EditBox;

	public void write_in_recurring_DateField_EditBox(String recurringDate_From_Excel) {
		webUtil.retryingWriteText(recurring_DateField_EditBox, recurringDate_From_Excel);
	}

	public String getText_of_recurring_DateField_EditBox() {
		String text = webUtil.get_Attribut_value(recurring_DateField_EditBox);
		return text;
	}

	@FindBy(xpath = "//div[ui-label[label[contains(text(),'Recurring')]]]/following-sibling::div/div/div/my-date-picker/div/div/div/button[@aria-label='Clear Date']/span")
	private WebElement clearButton_For_recurring_DateField_EditBox;

	public void click_On_clearButton_For_recurring_DateField_EditBox() throws InterruptedException {
		webUtil.retryingFindClick(clearButton_For_recurring_DateField_EditBox);
	}

	@FindBy(xpath = "//div[ui-label[label[contains(text(),'Send every')]]]/following-sibling::div/ui-input-box/input")
	private WebElement sendEvery_EditBox;

	public void write_in_sendEvery_EditBox(String sendEvery_From_Excel) {
		webUtil.retryingWriteText(sendEvery_EditBox, sendEvery_From_Excel);
	}

	public String getText_of_sendEvery_EditBox() {
		String text = webUtil.get_Attribut_value(sendEvery_EditBox);
		return text;
	}

	@FindBy(xpath = "//span[contains(text(),'All')]")
	private WebElement AllLink_In_UserSegment;

	public void click_On_AllLink_In_UserSegment() throws InterruptedException {
		webUtil.retryingFindClick(AllLink_In_UserSegment);
	}

	@FindBy(xpath = "//span[contains(text(),'Consumers')]")
	private WebElement consumerLink_In_UserSegment;

	public void click_On_consumerLink_In_UserSegment() throws InterruptedException {
		webUtil.retryingFindClick(consumerLink_In_UserSegment);
	}

	@FindBy(xpath = "//div[div[div[p-selectbutton[div[div[span[contains(text(),'Consumers')]]/preceding-sibling::div]]]]]/following-sibling::div/table/tbody/tr/th/ui-selectbox/select")
	private WebElement consumer_SelectBox;

	public void select_From_consumer_SelectBox(String consumer_From_Excel) {
		webUtil.selectByVisibletext(consumer_SelectBox, consumer_From_Excel);
	}

	public String getSelectedText_Of_consumer_SelectBox() {
		String option_Name_For_Consumer = webUtil.getFirstSelectionOption(consumer_SelectBox);
		return option_Name_For_Consumer;
	}

	@FindBy(xpath = "//input[@placeholder='value']")
	private WebElement consumer_EditBox;

	public void write_In_consumer_EditBox(String consumer_FromExcel) {
		webUtil.retryingWriteText(consumer_EditBox, consumer_FromExcel);
	}

	public String getText_of_consumer_EditBox() {
		String text = webUtil.get_Attribut_value(consumer_EditBox);
		return text;
	}

	@FindBy(xpath = "//div[@class='delete']")
	private WebElement deleteIcon_Under_UserSegmentSection;

	public void click_On_deleteIcon_Under_UserSegmentSection() throws InterruptedException {
		webUtil.retryingFindClick(deleteIcon_Under_UserSegmentSection);
	}

	@FindBy(xpath = "//div[@class='create']")
	private WebElement addIcon_Under_UserSegmentSection;

	public void click_On_addIcon_Under_UserSegmentSection() throws InterruptedException {
		webUtil.retryingFindClick(addIcon_Under_UserSegmentSection);
	}

}
