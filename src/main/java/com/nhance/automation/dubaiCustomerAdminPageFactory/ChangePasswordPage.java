package com.nhance.automation.dubaiCustomerAdminPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class ChangePasswordPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public ChangePasswordPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement changePassword;
	
	public void click_On_ChangePassword() throws InterruptedException {
		webUtil.retryingFindClick(changePassword);
	}
	
	
	@FindBy(xpath="//div[ui-label[label[text()='Old Password']]]//input")
	private WebElement oldPassword;
	
	public void write_Old_Password(String oldPasswordFromExcel) {
		webUtil.retryingWriteText(oldPassword, oldPasswordFromExcel);
	}
	
	
	@FindBy(xpath="//div[ui-label[label[text()='New Password']]]//input")
	private WebElement newPassword;
	
	public void write_New_Password(String newPasswordFromExcel) {
		webUtil.retryingWriteText(newPassword, newPasswordFromExcel);
	}
	
	
	
	@FindBy(xpath="//div[ui-label[label[text()='Re-type Password']]]//input")
	private WebElement retypePassword;
	
	public void write_Retype_Password(String retypePasswordFromExcel) {
		webUtil.retryingWriteText(retypePassword, retypePasswordFromExcel);
	}
	
	

}
