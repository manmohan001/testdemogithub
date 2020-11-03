package com.nhance.automation.customerAdminPageFactory;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nhance.automation.customerAdminPageFactory.CustomerAdminCommonWebElementInAllPage;
import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;


public class CampaignFeedBackPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	CustomerAdminCommonWebElementInAllPage cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();
	int i;

	public CampaignFeedBackPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@placeholder='Campaign name']")
	private WebElement campaignName_EditBox;
	public void write_on_campaignName_EditBox(String campaignTitleFromExcel)
	{
		webUtil.retryingWriteText(campaignName_EditBox, campaignTitleFromExcel);
	}
	
	@FindBy(xpath="//input[@value='Attach File']")
	private WebElement attachFeedBackImage;
	public void click_on_attachFeedBackImage(String pathOfFeedBackImage) throws InterruptedException, IOException
	{
		webUtil.retryingFindClick(attachFeedBackImage);
		Thread.sleep(1000);
		webUtil.fileUpload(pathOfFeedBackImage);
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//textarea[@class='textArea']")
	private WebElement campaignMessage_EditBox;
	public void write_On_campaignMessage_EditBox(String campaignMessageFromExcel)
	{
		webUtil.retryingWriteText(campaignMessage_EditBox, campaignMessageFromExcel);
	}
	
	@FindBy(xpath="//ui-selectbox[@formcontrolname='answerType']/select")
	private WebElement answerType_SelectBox;
	public void select_from_answerType_SelectBox(String answerTypeFromExcel)
	{
		webUtil.selectByVisibletext(answerType_SelectBox, answerTypeFromExcel);
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
	
	@FindBy(xpath="//span[contains(text(),'Send Now')]")
	private WebElement sendNow_Button;
	public void click_on_SendNowBUtton() throws InterruptedException
	{
		webUtil.retryingFindClick(sendNow_Button);
	}
	
	@FindBy(xpath="//span[contains(text(),'All')]")
	private WebElement All_Button;
	public void click_on_All_Button() throws InterruptedException
	{
		webUtil.retryingFindClick(All_Button);
	}
	
	
}
