package com.nhance.automation.customerAdminPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;


public class LoginPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	//BusinessFunction bMthd = new BusinessFunction();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

   @FindBy(xpath="//input[@formcontrolname='username']")
   private WebElement emailID_EditBox;
   public void write_In_EmailID_EditBox(String emailIDFromExcel)
   {
	   webUtil.retryingWriteText(emailID_EditBox, emailIDFromExcel);
   }
   
   @FindBy(xpath="//input[@formcontrolname='password']")
   private WebElement password_EditBox;
   public void write_In_password_EditBox(String passwordFromExcel)
   {
	   webUtil.retryingWriteText(password_EditBox, passwordFromExcel);
   }
   
   @FindBy(xpath="//input[@value='LOGIN']")
   private WebElement login_Button;
   public void click_On_login_Button() throws InterruptedException
   {
	   webUtil.retryingFindClick(login_Button);
   }
   
   @FindBy(xpath="//a[contains(text(),'Forgot Password')]")
   private WebElement forgotPassword_Link;
   public void click_On_forgotPassword_Link() throws InterruptedException
   {
	   webUtil.retryingFindClick(forgotPassword_Link);
   }
   
   
}
