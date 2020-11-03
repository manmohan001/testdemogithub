package com.nhance.automation.customerAdminPageFactory;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class SmartNotificationPage {

	public WebDriver driver;
	String text;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public SmartNotificationPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//div[h5[text()=' Smart Notification']]/following-sibling::div/ui-button/input")
	WebElement smartNotificationLink;
	
	public void click_On_SmartNotification_Link() throws InterruptedException {
		webUtil.retryingFindClick(smartNotificationLink);
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
	
	@FindBy(xpath = "//div[span[contains(text(),'APPLICATION_LINK')]]")
	public WebElement applicationLinkDrag;
	
	@FindBy(xpath = "//span[contains(text(),'CONSUMER_NAME')]")
	public WebElement consumerNameDrag;
	
	@FindBy(xpath = "//span[@class='tempCss']")
	private WebElement textInSuffix;
	
	public boolean verify_Text_Suffix() {
		boolean rt = textInSuffix.isDisplayed();
		if(rt) {
			return rt;
		}
		return false;
	}
	
	public String getTextOfSuffix() {
		return textInSuffix.getText();
	}
	
	@FindBy(xpath = "//span[@class='tempKeyClass']")
	public List<WebElement> dragAndDropList;
	
	public void dragAndDrop(String dragAndDropFromExcel, WebElement target) {
		Actions action = new Actions(driver);
		for(int i=0; i<dragAndDropList.size(); i++) {
			if(dragAndDropList.get(i).getText().contains(dragAndDropFromExcel)) {
				action.clickAndHold(dragAndDropList.get(i)).moveToElement(target).release().build().perform();
				//action.dragAndDrop(dragAndDropList.get(i), target);
				break;
			}
		}
	}

	@FindBy(xpath="//input[@value='Attach File']")
	WebElement attachImage;
	
	public void click_On_Image_Attach_Btn() throws InterruptedException {
		webUtil.retryingFindClick(attachImage);
	}

	
	@FindBy(xpath="//p-radiobutton[@value='1']")
	WebElement oneTime;
	
	public void click_On_OneTime() throws InterruptedException {
		webUtil.retryingFindClick(oneTime);
	}
	
	@FindBy(xpath="//p-radiobutton[@value='2']")
	WebElement recurring;
	
	public void click_On_Recurring() throws InterruptedException {
		webUtil.retryingFindClick(recurring);
	}
	
	@FindBy(xpath="//p-radiobutton[@value='3']")
	WebElement triggered;
	
	public void click_On_Triggered() throws InterruptedException {
		webUtil.retryingFindClick(triggered);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='HH:MM (24 hour)']")
	WebElement oneTimeScheduleTime;
	
	public void write_On_Time(String timeFromExcel) {
		webUtil.retryingWriteText(oneTimeScheduleTime, timeFromExcel);
	}

	
	@FindBy(xpath = "//div[h3[text()='Start Date']]//div//input[@placeholder='HH:MM (24 hour)']")
	WebElement recurringScheduleTime;
	
	public void write_On_RecurringScheduleTime(String timeFromExcel) {
		webUtil.retryingWriteText(recurringScheduleTime, timeFromExcel);
	}
	
	@FindBy(xpath="//div[h3[text()='End Date']]//div//input[@placeholder='HH:MM (24 hour)']")
	WebElement endTime;
	
	public void write_On_EndTime(String timeFromExcel) {
		webUtil.retryingWriteText(endTime, timeFromExcel);
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
	
	@FindBy(xpath="//div[h3[text()='Start Date']]//div//select")
	WebElement recurringtimeZone;
	
	public void select_RecurringTimeZone(String timeZoneFromExcel) {
		webUtil.selectByVisibletext(recurringtimeZone, timeZoneFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Select date']")
	WebElement startDate;
	
	public void write_On_StartDate(String dateFromExcel) {
		webUtil.retryingWriteText(startDate, dateFromExcel);
	}

	@FindBy(xpath="//div[h3[text()='Start Date']]//div//input[@placeholder='Select date']")
	WebElement recurringScheduleDate;
	
	public void write_recurringDate(String dateFromExcel) {
		webUtil.retryingWriteText(recurringScheduleDate, dateFromExcel);
	}
	
	

	@FindBy(xpath="//div[h3[text()='End Date']]//div//input[@placeholder='Select date']")
	WebElement endDate;
	
	public void write_endDate(String dateFromExcel) {
		webUtil.retryingWriteText(endDate, dateFromExcel);
	}
	
	
	
	@FindBy(xpath="//div[ui-label[label[text()='Select Event']]]/following-sibling::div/descendant::input")
	WebElement digitalKitStatusEventOnEndDate;
	
	public void write_On_DigitalKitStatusEventOnEndDate(String dateFromExcel) {
		webUtil.retryingWriteText(digitalKitStatusEventOnEndDate, dateFromExcel);
	}
	@FindBy(xpath="//span[text()='Never']")
	WebElement recurringnever;
	
	public void click_On_Never() throws InterruptedException {
	webUtil.retryingFindClick(recurringnever);
	}
	
	@FindBy(xpath="//span[text()='Till']")
	WebElement recurringtill;
	
	public void click_On_Till() throws InterruptedException {
	webUtil.retryingFindClick(recurringtill);
	}
	
	@FindBy(xpath="//span[text()='Daily']")
	WebElement daily;
	
	public void click_On_Daily() throws InterruptedException {
		webUtil.retryingFindClick(daily);
	}
	
	@FindBy(xpath="//span[text()='Weekly']")
	WebElement weekly;
	
	public void click_On_Weekly() throws InterruptedException {
		webUtil.retryingFindClick(weekly);
	}

	
	@FindBy(xpath="//span[text()='Monthly']")
	WebElement monthly;
	
	public void click_On_Monthly() throws InterruptedException {
		webUtil.retryingFindClick(monthly);
	}
	
	@FindBy(xpath="//div[h3[text()='Delivery']]//select")
	WebElement deliveryWeeklyDay;
	
	public void select_deliveryWeeklyDay(String selectDayFromExcel) {
		webUtil.selectByVisibletext(deliveryWeeklyDay, selectDayFromExcel);
	}
	
	
	@FindBy(xpath="//input[@formcontrolname='deliveryTime']")
	WebElement deliveryDailyTime;
	
	public void write_On_DeliveryDailyTime(String deliveryTimeFromExcel) {
		webUtil.retryingWriteText(deliveryDailyTime, deliveryTimeFromExcel);
	}
	
	
	@FindBy(xpath="//div[h3[text()='Delivery']]//div//input[@placeholder='HH:MM (24 hour)']")
	WebElement deliveryWeeklyTime;
	
	public void write_On_DeliveryWeeklyTime(String deliveryTimeFromExcel) {
		webUtil.retryingWriteText(deliveryWeeklyTime, deliveryTimeFromExcel);
	}
	
	@FindBy(xpath="//div[h3[text()='Delivery']]//select")
	WebElement deliveryMonthlyDate;
	
	public void select_deliveryMonthlyDate(String selectDayFromExcel) {
		webUtil.selectByVisibletext(deliveryMonthlyDate, selectDayFromExcel);
	}

		
	@FindBy(xpath="//div[h3[text()='Delivery']]//input[@placeholder='HH:MM (24 hour)']")
	WebElement deliveryMonthlyTime;
	
	public void write_On_DeliveryMonthlyTime(String deliveryTimeFromExcel) {
		webUtil.retryingWriteText(deliveryMonthlyTime, deliveryTimeFromExcel);
	}


	@FindBy(xpath="//div[ui-label[label[text()='Select Event']]]/following-sibling::div//select")
	WebElement selectEvent;
	
	public void select_EndDateEvent(String selectEventFromExcel) {
		webUtil.selectByVisibletext(selectEvent, selectEventFromExcel);
	}
	
	
	@FindBy(xpath="//div[ui-label[label[text()='Select Event']]]/following-sibling::div//ui-selectbox[@formcontrolname='warrantyOffPredicate']//select")
	WebElement warrantyEventExpires;
	
	public void select_WarrantyExpire(String selectEventFromExcel) {
		webUtil.selectByVisibletext(warrantyEventExpires, selectEventFromExcel);
	}
	
	
	@FindBy(xpath="//input[@placeholder='No of Days']")
	WebElement endDateDays;
	
	public void write_On_EndDateDays(String endDateDaysFromExcel) {
		webUtil.retryingWriteText(endDateDays, endDateDaysFromExcel);
	}

	
	
	@FindBy(xpath="//div[ui-label[label[text()='Select Event']]]/following-sibling::div//ui-selectbox[@formcontrolname='eventPredicate']//select")
	WebElement digitalKitsGenerated;
	
	public void select_DigitalKitsGenerated(String selectEventFromExcel) {
		webUtil.selectByVisibletext(digitalKitsGenerated, selectEventFromExcel);
	}

	@FindBy(xpath = "//div[h3[text()='Scheduled At']]//input[@placeholder='HH:MM (24 hour)']")
	private WebElement scheduledTime;
	
	public void write_On_Scheduled_Time(String timeFromExcel) {
		webUtil.retryingWriteText(scheduledTime, timeFromExcel);
	}
	
	
	@FindBy(xpath="//div[h3[text()='Message Delivery Time']]//p-radiobutton[@ng-reflect-value='1']")
	WebElement asSoonAsEventHappened;
	
	public void click_On_AsSoonAsEventHappened() throws InterruptedException {
		webUtil.retryingFindClick(asSoonAsEventHappened);
	}
	
	@FindBy(xpath="//div[h3[text()='Message Delivery Time']]//p-radiobutton[@ng-reflect-value='2']")
	WebElement wait;
	
	public void click_On_Wait() throws InterruptedException {
		webUtil.retryingFindClick(wait);
	}
	
	
	
	@FindBy(xpath="//div[h3[text()='Message Delivery Time']]//ui-selectbox[@formcontrolname='hourDay']//select")
	WebElement waitHour;
	
	public void select_WaitHour(String selectEventFromExcel) {
		webUtil.selectByVisibletext(waitHour, selectEventFromExcel);
	}
	
	
	@FindBy(xpath="//div[h3[text()='Message Delivery Time']]//ui-selectbox[@formcontrolname='waitingTime']//select")
	WebElement waitTime;
	
	public void select_WaitTime(String selectEventFromExcel) {
		webUtil.selectByVisibletext(waitTime, selectEventFromExcel);
	}
	
	
	@FindBy(xpath="//div[@class='analytics']")
	WebElement analyticsView;
	
	public void click_On_Analytics_View() throws InterruptedException {
		webUtil.retryingFindClick(analyticsView);
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



	@FindBy(xpath="//span[@class='switch-label']")
	WebElement changeStatus;
	
	public void click_On_Toggle_Status() throws InterruptedException {
		webUtil.retryingFindClick(changeStatus);
	}
	
	
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

	@FindBy(xpath="//input[@placeholder='Campaign ID']")
	WebElement campaignID;
	
	public void write_Campaign_ID(String campaignIdFromExcel) {
		webUtil.retryingWriteText(campaignID, campaignIdFromExcel);
	}

	@FindBy(xpath="//table/tbody/tr/td[1]//div//div")
	public List<WebElement> listOfCampaignID;

	
	
	@FindBy(xpath="//input[@placeholder='Campaign Name']")
	WebElement campaignName;
	
	public void write_Campaign_Name(String campaignNameFromExcel) {
		webUtil.retryingWriteText(campaignName, campaignNameFromExcel);
	}

	@FindBy(xpath="//table/tbody/tr/td[2]//div//div")
	public List<WebElement> listOfCampaignName;
	
	@FindBy(xpath="//th[@class='ng2-smart-th campaignStatus']//select")
	private WebElement status;
	
	public void select_Status_Type(String statusFromFromExcel) throws InterruptedException
	{
		webUtil.selectByVisibletext(status, statusFromFromExcel);
	}

	

}
