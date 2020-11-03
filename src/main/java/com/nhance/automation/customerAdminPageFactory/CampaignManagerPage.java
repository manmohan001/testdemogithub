package com.nhance.automation.customerAdminPageFactory;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;


public class CampaignManagerPage {
	
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	// BusinessFunction bMthd = new BusinessFunction();

	public CampaignManagerPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	 @FindBy(xpath="//span[contains(text(),'Campaign Manager')]")
	 private WebElement campaign_Manager_Menu;
	 
	 public void click_On_campaign_Manager_Menu() throws InterruptedException
	 {
		webUtil.retryingFindClick(campaign_Manager_Menu);
	 }
 

	 @FindBy(xpath="//h1[contains(text(),'Campaign Manager')]")
	 private WebElement campaign_Management_Text;
	 
	 public String getText_Of_campaign_Management_Text()
	 {
		String capture_campaignManagement_Text = webUtil.getTheTextFromUI(campaign_Management_Text);
		return capture_campaignManagement_Text;	 
	 }

	 @FindBy(xpath="//img[@class='create']")
	 private WebElement campaign_Manager_AddIcon;
	 
	 public void click_On_campaign_Manager_AddIcon() throws InterruptedException
	 {
		webUtil.retryingFindClick(campaign_Manager_AddIcon);
	 }

	 @FindBy(xpath="//input[@placeholder='Campaign ID']")
	 private WebElement campaignID_SearchField;
	 
	 public void write_In_campaignID_SearchField(String campaignID_From_Excel)
	 {
		 webUtil.retryingWriteText(campaignID_SearchField, campaignID_From_Excel);
	 }
	 
	 @FindBy(xpath="//input[@placeholder='Campaign Name']")
	 private WebElement campaignName_SearchField;
	 
	 public void write_In_campaignName_SearchField(String campaignName_From_Excel)
	 {
		 webUtil.retryingWriteText(campaignName_SearchField, campaignName_From_Excel);
	 }
	 
	 @FindBy(xpath="//table/thead/tr/th[3]/ng2-smart-table-filter/div/select-filter/select")
	 private WebElement campaignType_SearchField;
	 
	 public void select_campaignType_SearchField(String campaignType_From_Excel)
	 {
		 webUtil.selectByVisibletext(campaignType_SearchField, campaignType_From_Excel);
	 }
	 
	 @FindBy(xpath="//table/thead/tr/th[5]/ng2-smart-table-filter/div/select-filter/select")
	 private WebElement campaignStatus_SearchField;
	 
	 public void select_campaignStatus_SearchField(String campaignStatus_From_Excel)
	 {
		 webUtil.selectByVisibletext(campaignStatus_SearchField, campaignStatus_From_Excel);
	 }
	 
	 @FindBy(xpath="//table/tbody/tr/td[1]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	 public List<WebElement> list_Of_campaignID;
	 
	 @FindBy(xpath="//table/tbody/tr/td[2]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	 public List<WebElement> list_Of_campaignName;
	 
	 @FindBy(xpath="//table/tbody/tr/td[3]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	 public List<WebElement> list_Of_campaignType;
	 
	 @FindBy(xpath="//table/tbody/tr/td[5]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	 public List<WebElement> list_Of_campaignStatus;
	 
	 @FindBy(xpath="//div[@class='edit']")
	 public List<WebElement> list_Of_EditIcon_In_ViewCampaignPage;

	 @FindBy(xpath="//div[@class='delete']")
	 public List<WebElement> list_Of_DeleteIcon_In_ViewCampaignPage;

     @FindBy(xpath="//div[contains(text(),'Add Notification')]")
     private WebElement addNotificationPage;
     
     public String getText_Of_addNotificationPage()
     {
    	String capture_addNotificationPage_Text = webUtil.getTheTextFromUI(addNotificationPage);
		return capture_addNotificationPage_Text; 
     }
     
     @FindBy(xpath="//input[@value='Back']")
     private WebElement backButton_In_AddNoptificationPage;
     
     public void click_On_backButton_In_AddNoptificationPage() throws InterruptedException
     {
    	 webUtil.retryingFindClick(backButton_In_AddNoptificationPage);
     }
       
     @FindBy(xpath="//div[@class='edit']")
     private WebElement edit_Icon_in_CampaignPage;
     
     public void click_On_edit_Icon_in_CampaignPage() throws InterruptedException
     {
    	 webUtil.retryingFindClick(edit_Icon_in_CampaignPage);
     }

     @FindBy(xpath="//div[@class='delete']")
     private WebElement delete_Icon_in_CampaignPage;
     
     public void click_On_delete_Icon_in_CampaignPage() throws InterruptedException
     {
    	 webUtil.retryingFindClick(delete_Icon_in_CampaignPage);
     }
     
     @FindBy(xpath="//div[@role='dialog']/div/following-sibling::h2")
     private WebElement AlertPopup_Message_AfterDeletingPopup;
     
     public String getText_Of_AlertPopup_Message_AfterDeletingPopup()
     {
    	String text = webUtil.getTheTextFromUI(AlertPopup_Message_AfterDeletingPopup);
		return text; 
     }
     
     @FindBy(xpath="//div[@role='dialog']/div/button")
     private WebElement okButton_In_AlertPopup;
     
     public void click_On_okButton_In_AlertPop() throws InterruptedException
     {
    	 webUtil.retryingFindClick(okButton_In_AlertPopup);
     }
     
     @FindBy(xpath="//div[@role='dialog']/div/button[contains(text(),'Yes')]")
     private WebElement YesButton_In_AlertPopup;
     
     public void click_On_YesButton_In_AlertPopup() throws InterruptedException
     {
    	 webUtil.retryingFindClick(YesButton_In_AlertPopup);
     }
     
     @FindBy(xpath="//div[@role='dialog']/div/button[contains(text(),'Cancel')]")
     private WebElement CancelButton_In_AlertPopup;
     
     public void click_On_CancelButton_In_AlertPopup() throws InterruptedException
     {
    	 webUtil.retryingFindClick(CancelButton_In_AlertPopup);
     }
     
     @FindBy(xpath="//ng2-smart-table-pager/nav/ul/li/span")
     private WebElement totalCount_In_CampaignPage;
     
     public String getText_Of_totalCount_In_CampaignPage()
     {
    	String text =  webUtil.getTheTextFromUI(totalCount_In_CampaignPage);
    	return text; 
     }

}
