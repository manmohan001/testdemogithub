package com.nhance.automation.dubaiCustomerAdminPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class CampaignAddNotificationPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	// BusinessFunction bMthd = new BusinessFunction();

	public CampaignAddNotificationPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//div[h5[contains(text(),'Push Notification')]]/following-sibling::div/ui-button/input")
     private WebElement pushNotification_Button;
     
     public void click_On_pushNotification_Button() throws InterruptedException
     {
    	 webUtil.retryingFindClick(pushNotification_Button);
     }
     
     @FindBy(xpath="//div[h5[contains(text(),'Offers')]]/following-sibling::div/ui-button/input")
     private WebElement offers_Button;
     
     public void click_On_offers_Button() throws InterruptedException
     {
    	 webUtil.retryingFindClick(offers_Button);
     }
     
     @FindBy(xpath="//div[h5[contains(text(),'Feedback')]]/following-sibling::div/ui-button/input")
     private WebElement feedback_Button;
     
     public void click_On_feedback_Button() throws InterruptedException
     {
    	 webUtil.retryingFindClick(feedback_Button);
     }

     @FindBy(xpath="//div[h5[contains(text(),'Smart Trigger')]]/following-sibling::div/ui-button/input")
     private WebElement smartTrigger_Button;
     
     public void click_On_smartTrigger_Button() throws InterruptedException
     {
    	 webUtil.retryingFindClick(smartTrigger_Button);
     }
     
     

}
