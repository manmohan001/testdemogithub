package com.nhance.automation.customerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class OffersPage {
	public WebDriver driver;
	String text;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public OffersPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[h5[text()='Offers']]/following-sibling::div/ui-button/input")
	WebElement offersLink;
	
	public void click_On_Offers() throws InterruptedException {
		webUtil.retryingFindClick(offersLink);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Campaign name']")
	WebElement title;
	
	public void write_On_Title(String titleFromExcel) {
		webUtil.retryingWriteText(title, titleFromExcel);
	}
	
	@FindBy(xpath = "//div[@class=' prefix']")
	public WebElement prefixMessage;
	
	public void write_On_Prefix_Message(String prefixFromExcel) {
		webUtil.retryingWriteText(prefixMessage, prefixFromExcel);
	}
	
	
	@FindBy(xpath="//textarea[@placeholder='Campaign message']")
	WebElement message;
	
	public void write_On_Message(String messageFromExcel) {
		webUtil.retryingWriteText(message, messageFromExcel);
	}
	
	public void click_On_Message() throws InterruptedException {
		webUtil.retryingFindClick(message);
	}
	
	@FindBy(xpath = "//div[@class=' suffix']")
	public WebElement suffixMessage;
	
	public void write_On_Suffix_Message(String suffixFromExcel) {
		webUtil.retryingWriteText(suffixMessage, suffixFromExcel);
	}
	
	@FindBy(xpath = "//div[span[contains(text(),'APPLICATION_LINK')]]/span[@class='tempKeyClass']")
	public WebElement applicationLinkDrag;
	
	@FindBy(xpath = "//div[span[contains(text(),'CONSUMER_NAME')]]")
	public WebElement consumerNameDrag;
	

	@FindBy(xpath="//input[@value='Attach File']")
	WebElement attachImage;
	
	public void click_On_Image_Attach_Btn() throws InterruptedException {
		webUtil.retryingFindClick(attachImage);
	}

	
    @FindBy(xpath = "//ui-label[label[text()='Expiry Date']]/following-sibling::my-date-picker/div//input[@placeholder='Select date']")
	private WebElement expiryDate;
	
	public void write_ExpiryDate(String expiryDateFromExcel) {
		webUtil.retryingWriteText(expiryDate, expiryDateFromExcel);
	}

	@FindBy(xpath = "//ui-label[label[text()='Expiry Date']]/following-sibling::div//input[@formcontrolname='expiryTime']")
	private WebElement expiryTime;
	
	public void write_Expiry_Time(String expiryTimeFromExcel) {
		webUtil.retryingWriteText(expiryTime, expiryTimeFromExcel);
	}
	
	
	@FindBy(xpath = "//textarea[@placeholder='Campaign message']")
	WebElement campaignMessage;
	
	public void write_Message(String campaignMessageFromExcel) {
		webUtil.retryingWriteText(campaignMessage, campaignMessageFromExcel);
	}

	
	@FindBy(xpath = "//div[@data-placeholder='Offer description']")
	WebElement description;
	
	public void write_Description(String descriptionFromExcel) {
		webUtil.retryingWriteText(description, descriptionFromExcel);
	}
	
	
	
	
	@FindBy(xpath="//span[text()='Send Now']")
	WebElement sendNow;
	
	public void click_On_SendNow() throws InterruptedException {
		webUtil.retryingFindClick(sendNow);
	}
	
	@FindBy(xpath="//span[text()='Send On']")
	WebElement sendOn;
	
	public void click_On_SendOn() throws InterruptedException {
		webUtil.retryingFindClick(sendOn);
	}
	
	@FindBy(xpath = "//div[h3[text()='Schedule']]")
	public WebElement scheduleHeader;
	
	
	@FindBy(xpath = "//div[h3[text()='Schedule']]//input[@placeholder='Select date']")
	WebElement scheduleDate;
	
	public void write_ScheduleDate(String scheduleDateFromExcel) {
		webUtil.retryingWriteText(scheduleDate, scheduleDateFromExcel);
	}
	
	
	@FindBy(xpath = "//input[@formcontrolname='startTime']")
	private WebElement scheduleTime;
	
	public void write_On_Scheduled_Time(String scheduledTimeFromExcel) {
		webUtil.retryingWriteText(scheduleTime, scheduledTimeFromExcel);
	}
	
	@FindBy(xpath = "//div[h3[text()='End Date']]//div[@class='two wide column twoWideSlab timezonefield']//span")
	private WebElement endTime;
	
	public String getTextOfEndTime() {
		return endTime.getText();
	}
	
	@FindBy(xpath = "//div[h3[text()='End Date']]//div[@class='four wide column']")
	private WebElement endDate;
	
	public String getTextOfEndDate() {
		return endDate.getText();
	}
	
	
	
	@FindBy(xpath="//div[h3[text()='Scheduled At']]//div//input[@placeholder='HH:MM (24 hour)']")
	WebElement scheduleAtTime;
	
	public void write_On_scheduleAtTime(String timeFromExcel) {
		webUtil.retryingWriteText(scheduleAtTime, timeFromExcel);
	}
	@FindBy(xpath="//ui-selectbox[@formcontrolname='timeZone']/select")
	public WebElement oneTimeTimeZone;
	
	public void select_TimeZone(String timeZoneFromExcel) {
		webUtil.selectByVisibletext(oneTimeTimeZone, timeZoneFromExcel);
	}
	
	@FindBy(xpath="//th[@class='ng2-smart-th campaignType']//select")
	WebElement campaignType;
	
	
	public void select_CampaignType(String campaignTypeFromExcel) {
		webUtil.selectByVisibletext(campaignType, campaignTypeFromExcel);
	}

	
	
	@FindBy(xpath = "//table/tbody/tr/td[3]/descendant::div/div")
	public List<WebElement> listOfcampaignType;

	
	@SuppressWarnings("unused")
	public String getTheTextOfCampaignTypeInRecordTable() {
		for(int i=0;i<listOfcampaignType.size();i++)
		{
			text = listOfcampaignType.get(i).getText();
			break;
		}
		return text;
	}

	@FindBy(xpath="//th[@class='ng2-smart-th campaignStatus']//select")
	private WebElement status;
	
	public void select_Status_Type(String statusFromFromExcel) throws InterruptedException
	{
		webUtil.selectByVisibletext(status, statusFromFromExcel);
	}
	
	@FindBy(xpath="//span[@class='switch-label']")
	WebElement changeStatus;
	
	public void click_On_Toggle_Status() throws InterruptedException {
		webUtil.retryingFindClick(changeStatus);
	}

	@FindBy(xpath="//div[@class='analytics']")
	WebElement analyticsView;
	
	public void click_On_Analytics_View() throws InterruptedException {
		webUtil.retryingFindClick(analyticsView);
	}

	@FindBy(xpath="//input[@placeholder='Campaign ID']")
	WebElement campaignID;
	
	public void write_Campaign_ID_On_SearchBox(String campaignIdFromExcel) {
		webUtil.retryingWriteText(campaignID, campaignIdFromExcel);
	}

	@FindBy(xpath="//table/tbody/tr/td[1]//div//div")
	public List<WebElement> listOfCampaignID;

	@SuppressWarnings("unused")
	public String getTheTextOfCampaignIdInRecordTable() {
		for(int i=0;i<listOfCampaignID.size();i++)
		{
			text = listOfCampaignID.get(i).getText();
			break;
		}
		return text;
	}

	@FindBy(xpath = "//span[contains(text(),'Consumers')]")
	private WebElement consumersButton;
	
	public void click_On_Consumers() throws InterruptedException {
		webUtil.retryingFindClick(consumersButton);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Campaign Name']")
	WebElement campaignName;
	
	public void write_Campaign_Name(String campaignNameFromExcel) {
		webUtil.retryingWriteText(campaignName, campaignNameFromExcel);
	}

	@FindBy(xpath="//table/tbody/tr/td[2]//div//div")
	public List<WebElement> listOfCampaignName;


	@FindBy(xpath = "//table/tbody/tr/td[4]/descendant::div/div")
	public List<WebElement> listOfStatus;

	@SuppressWarnings("unused")
	public String getTheTextOfStatusInRecordTable() {
		for(int i=0;i<listOfStatus.size();i++)
		{
			text = listOfStatus.get(i).getText();
			break;
		}
		return text;
	}
	
	@FindBy(xpath = "//ui-selectbox[@formcontrolname='filterName']/select")
	private WebElement selectConsumer;
	
	public void select_Consumer_Of(String consumerByFromExcel) {
		webUtil.selectByVisibletext(selectConsumer, consumerByFromExcel);
	}
	
	
	@FindBy(xpath = "//ui-selectbox[@formcontrolname='operator']/select")
	private WebElement selectConsumerFor;
	
	public void select_Consumer_For(String consumerForFromExcel) {
		webUtil.selectByVisibletext(selectConsumerFor, consumerForFromExcel);
	}
	
	@FindBy(xpath = "//input[@placeholder='value']")
	private WebElement consumerNameValue;
	
	public void write_On_Consumer_Name(String consumerNameFromExcel) {
		webUtil.retryingWriteText(consumerNameValue, consumerNameFromExcel);
	}
	
	@FindBy(xpath = "//tr[@ng-reflect-name='1']//ui-selectbox[@formcontrolname='filterName']/select")
	private WebElement selectMobile;
	
	public void select_Cosumer_Mobile(String consumerMobileFromExcel) {
		webUtil.selectByVisibletext(selectMobile, consumerMobileFromExcel);
	}
	
	@FindBy(xpath = "//tr[@ng-reflect-name='1']//ui-selectbox[@formcontrolname='operator']/select")
	private WebElement mobileIs;
	
	public void select_Consumer_Mobile_Is(String mobileISFromExcel) {
		webUtil.selectByVisibletext(mobileIs, mobileISFromExcel);
	}
	
	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	private WebElement mobileNumberTextField;
	
	public void write_On_Mobile_Number(String mobileNumberFromExcel) {
		webUtil.retryingWriteText(mobileNumberTextField, mobileNumberFromExcel);
		}
	
	
	@FindBy(xpath = "//div[@class='view']")
	private WebElement viewButton;
	
	public void click_On_View() throws InterruptedException {
		webUtil.retryingFindClick(viewButton);
	}
	
	
	@FindBy(xpath = "//ui-label[label[text()='Title']]/following-sibling::span")
	private WebElement titleText;
	
	public String get_Text_Of_Title() {
		return titleText.getText();
	}
	
	@FindBy(xpath = "//div[ui-label[label[text()='Expiry Date']]]//span[1]")
	private WebElement expiryDateText;
	
	public String get_Text_Expiry_Date() {
		return expiryDateText.getText();
	}
	
	@FindBy(xpath = "//div[ui-label[label[text()='Expiry Time']]]//span[2]")
	private WebElement expiryTimeText;
	
	public String get_Text_Of_Expiry_Time() {
		return expiryTimeText.getText();
	}
	
	@FindBy(xpath = "//div[ui-label[label[text()='Message']]]//span[1]")
	private WebElement messageText;
	
	public String get_Text_Of_Message() {
		return messageText.getText();
	}
	
	@FindBy(xpath = "//a[button[text()='View Description']]")
	private WebElement viewDescriptionButton;
	
	public void click_On_View_Description() throws InterruptedException {
		webUtil.retryingFindClick(viewDescriptionButton);
	}
	
	@FindBy(xpath = "//div//p")
	private WebElement descriptionText;
	
	public String get_Text_Of_Description() {
		return descriptionText.getText();
	}
	
	@FindBy(xpath = "//input[@value='Close']")
	private WebElement closeButton;
	
	public void click_On_Close() throws InterruptedException {
		webUtil.retryingFindClick(closeButton);
	}
	
	@FindBy(xpath = "//ui-label[label[text()='Start Date']]/following-sibling::div[1]//span")
	private WebElement startDateText;
	
	public String get_Text_Of_Start_Date() {
		return startDateText.getText();
	}
	
	@FindBy(xpath = "//ui-label[label[text()='Start Time']]/following-sibling::div//span")
	private WebElement startTimeText;
	
	public String get_Text_Of_Start_Time() {
		return startTimeText.getText();
	}
	
	@FindBy(xpath = "//ui-label[label[text()='Timezone']]/following-sibling::div//span")
	private WebElement timeZoneText;
	
	public String get_Text_Of_TimeZone() {
		return timeZoneText.getText();
	}
	
	@FindBy(xpath = "//ui-label[label[text()='End Date']]/following-sibling::div[1]//span")
	private WebElement endDateText;
	
	public String get_Text_Of_End_Date() {
		return endDateText.getText();
	}
	
	@FindBy(xpath = "//ui-label[label[text()='End Time']]/following-sibling::div[1]//span")
	private WebElement endTimeText;
	
	public String get_Text_Of_End_Time() {
		return endTimeText.getText();
	}
	
	@FindBy(xpath = "//table/tbody[1]//tr[2]//td[3]")
	private WebElement nameText;
	
	public String get_Text_Of_Consumer_Name() {
		return nameText.getText();
	}
	
	@FindBy(xpath = "//table/tbody[2]//tr[2]//td[3]")
	private WebElement mobileNumberText;
	
	public String get_Text_Of_Mobile_Number() {
		return mobileNumberText.getText();
	}
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement oKButton;
	
	public void click_OK_Button() throws InterruptedException {
		webUtil.retryingFindClick(oKButton);
	}
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesButton;
	
	public void click_On_Yes_Button() throws InterruptedException {
		webUtil.retryingFindClick(yesButton);
	}
	
// analytics
	
	@FindBy(xpath = "//div[div[contains(text(),'Campaign Id')]]//div[2]")
	private WebElement campaignIdTextInAnalytics;
	
	public String get_Text_Of_Campaign_Id() {
		return campaignIdTextInAnalytics.getText();
	}
	
	@FindBy(xpath = "//div[div[contains(text(),'Name')]]//div[2]")
	private WebElement campaignNameTextInAnalytics;
	
	public String get_Text_Of_Campaign_Name() {
		return campaignNameTextInAnalytics.getText();
	}
	
	
	
}
