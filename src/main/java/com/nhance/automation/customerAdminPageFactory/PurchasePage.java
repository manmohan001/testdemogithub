package com.nhance.automation.customerAdminPageFactory;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class PurchasePage {

	
	public WebDriver driver;
	WebDriverCommonUtill webCmnUtil = new WebDriverCommonUtill();
	boolean r1;
	Dimension size;
	String labelName_of_Product;
	String orderID;
	String orderStatus;

	public PurchasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Order ID']")
	private WebElement orderID_Search_EditBox;
	public void write_In_orderID_Search_EditBox(String orderIdFromExcel) throws InterruptedException
	{
		webCmnUtil.retryingWriteText(orderID_Search_EditBox, orderIdFromExcel);
	}
	
	@FindBy(xpath="//input[@placeholder='Accessory Name']")
	private WebElement accesoryName_Search_EditBox;
	public void write_In_accesoryName_Search_EditBox(String accesorryNameFromExcel) throws InterruptedException
	{
		webCmnUtil.retryingWriteText(accesoryName_Search_EditBox, accesorryNameFromExcel);
	}
	
	@FindBy(xpath="//div[contains(text(),'Reply')]")
	private WebElement replyLink;
	public void click_On_ReplyLink() throws InterruptedException
	{
		webCmnUtil.retryingFindClick(replyLink);
	}
	
	@FindBy(xpath="//ui-selectbox[@formcontrolname='responseStatus']/select")
	private WebElement responseStatus_SelectBox;
	public void select_from_responseStatus_SelectBox(String responseStatusFromExcel)
	{
		webCmnUtil.selectByVisibletext(responseStatus_SelectBox, responseStatusFromExcel);
	}
	
	@FindBy(xpath="//textarea[@class='textArea']")
	private WebElement reply_EditBox;
	public void write_on_reply_EditBox(String replyMessageFromExcel) throws InterruptedException
	{
		webCmnUtil.retryingWriteText(reply_EditBox, replyMessageFromExcel);
	}
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement save_Button;
	public void click_On_save_Button() throws InterruptedException
	{
		webCmnUtil.retryingFindClick(save_Button);
	}
	
	@FindBy(xpath="//span[contains(text(),'Others')]")
	private WebElement othersLink;
	public void click_on_othersLink() throws InterruptedException
	{
		webCmnUtil.retryingFindClick(othersLink);
	}
	
	
	
}
