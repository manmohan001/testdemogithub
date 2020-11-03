package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class FeedbackPage {

	public WebDriver driver;
	String text;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public FeedbackPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[h5[text()='Feedback']]/following-sibling::div/ui-button/input")
	WebElement selectFeedback;
	
	public void click_On_Feedback() throws InterruptedException {
		webUtil.retryingFindClick(selectFeedback);
	}

	
	@FindBy(xpath = "//input[@placeholder='Campaign name']")
	WebElement title;
	
	public void write_Title(String campaignNameFromExcel) {
		webUtil.retryingWriteText(title, campaignNameFromExcel);
	}

	@FindBy(xpath = "//textarea[@placeholder='Campaign message']")
	WebElement campaignMessage;
	
	public void write_Message(String campaignMessageFromExcel) {
		webUtil.retryingWriteText(campaignMessage, campaignMessageFromExcel);
	}

	@FindBy(xpath="//div[ui-label[label[text()='Answer Type']]]//ui-selectbox//select")
	WebElement answerType;

	public void select_AnswerType(String answerTypeFromExcel) {
		webUtil.selectByVisibletext(answerType, answerTypeFromExcel);
	}

	@FindBy(xpath = "//textarea[@placeholder='Question 1']")
	WebElement questionOne;
	
	public void write_questionOne(String questionOneFromExcel) {
		webUtil.retryingWriteText(questionOne, questionOneFromExcel);
	}

	
	@FindBy(xpath = "//textarea[@placeholder='Question 2']")
	WebElement questionTwo;
	
	public void write_questionTwo(String questionTwoFromExcel) {
		webUtil.retryingWriteText(questionTwo, questionTwoFromExcel);
	}
	
	@FindBy(xpath = "//div[@role='tabpanel']//label[text()='Question 02']/ancestor::tr/following-sibling::tr//input[@placeholder='option']")
	private WebElement answerChoiceOneForQuestionTwo;
	
	public void write_On_Answer_Choice_One_For_Question_Two(String answerChoiceFromExel) {
		webUtil.retryingWriteText(answerChoiceOneForQuestionTwo, answerChoiceFromExel);
	}

	
	@FindBy(xpath = "//input[@placeholder='option']")
	WebElement answerChoiceOne;
	
	public void write_answerChoiceOne(String answerChoiceOneFromExcel) {
		webUtil.retryingWriteText(answerChoiceOne, answerChoiceOneFromExcel);
	}

	@FindBy(xpath="//th[span[text()='click here to add more questions (max 5)']]//ui-icon//img")
	WebElement clickForMoreQuestions;
	
	public void click_On_More_Options() throws InterruptedException {
		webUtil.retryingFindClick(clickForMoreQuestions);
	}

	
	@FindBy(xpath="//th[span[text()='click here to add more options (max 5)']]//ui-icon//img")
	WebElement clickForMoreOptions;
	
	public void clickForMoreQuestions() throws InterruptedException {
		webUtil.retryingFindClick(clickForMoreOptions);
	}
	
	@FindBy(xpath="//ui-textarea[@formcontrolname='question']/textarea")
	private List<WebElement> list_of_Question_EditBox;
	public void write_OnQuestion_EditBox(String questionFromExcel , int i)
	{
		webUtil.retryingWriteText(list_of_Question_EditBox.get(i),questionFromExcel);
	}
	
	@FindBy(xpath="//ui-input-box[@formcontrolname='feedbackOptions']/input")
	private List<WebElement> list_of_answerEditBox;
	public void write_On_answerEditBox(String anwerFromExcel , int i)
	{
		webUtil.retryingWriteText(list_of_answerEditBox.get(i),anwerFromExcel);
	}
	
	@FindBy(xpath="//span[contains(text(),'to add more options')]/preceding-sibling::ui-icon/img[@class='create']")
	private List<WebElement> list_of_answer_Plus_sign;
	public void click_on_answerPlusSign(int i) throws InterruptedException
	{
		webUtil.retryingFindClick(list_of_answer_Plus_sign.get(i));
	}
	
	@FindBy(xpath="//span[contains(text(),'to add more questions')]/preceding-sibling::ui-icon/img[@class='create']")
	private List<WebElement> list_of_questions_Plus_sign;
	public void click_on_questions_Plus_sign(int i) throws InterruptedException
	{
		webUtil.retryingFindClick(list_of_questions_Plus_sign.get(i));
	}
	
	@FindBy(xpath="//span[@class='ui-radiobutton-icon ui-clickable fa fa-circle']")
	WebElement scheduleRadio;
	
	public void click_On_Schdeule_Radio() throws InterruptedException {
		webUtil.retryingFindClick(scheduleRadio);
	}
	
	@FindBy(xpath="//div[@class='ui-radiobutton-box ui-widget ui-state-default']")
	WebElement eventRadio;
	
	public void click_On_Event_Radio() throws InterruptedException {
		webUtil.retryingFindClick(eventRadio);
	}
	
	@FindBy(xpath="//div[h3[text()='Schedule']]//select")
	WebElement scheduleEvent;

	public void select_Schedule_Event(String eventScheduleFromExcel) {
		webUtil.selectByVisibletext(scheduleEvent, eventScheduleFromExcel);
	}
	
	@FindBy(xpath="//ui-label[label[text()='From']]/following-sibling::p-selectbutton//div//span[contains(text(),'All')]")
	private WebElement allButton;
	
	public void click_On_All() throws InterruptedException {
		webUtil.retryingFindClick(allButton);
	}
	
	@FindBy(xpath="//span[text()='Consumers']")
	WebElement consumersButton;
	
	public void click_On_Consumers() throws InterruptedException {
		webUtil.retryingFindClick(consumersButton);
	}
	
	@FindBy(xpath = "//span[text()='All ']")
	private WebElement conumserAll;
	
	public void click_On_ConsumerAll() throws InterruptedException {
		webUtil.retryingFindClick(conumserAll);
	}

	@FindBy(xpath = "//ui-label[label[text()='From']]/following-sibling::p-selectbutton//div//span[contains(text(),'Any')]")
	private WebElement consumerAny;
	
	public void click_On_ConsumerAny() throws InterruptedException {
	webUtil.retryingFindClick(consumerAny);	
	}

	@FindBy(xpath = "//label[text()='Answer Type']")
	public WebElement answerTypeText;
	
	
		
	@FindBy(xpath = "//input[@formcontrolname='startTime']")
	private WebElement scheduleTime;
	
	public void write_On_Scheduled_Time(String timeFromExcel) {
		webUtil.retryingWriteText(scheduleTime, timeFromExcel);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Select date']")
	WebElement scheduleDate;
	
	public void write_ScheduleDate(String scheduleDateFromExcel) {
		webUtil.retryingWriteText(scheduleDate, scheduleDateFromExcel);
	}

	@FindBy(xpath="//ui-selectbox[@formcontrolname='timeZone']/select")
	WebElement scheduleTimeZone;
	
	public void select_Schedule_TimeZone(String timeZoneFromExcel) {
		webUtil.selectByVisibletext(scheduleTimeZone, timeZoneFromExcel);
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
	
	
	
}
