package com.nhance.automation.customerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class SuperUserPage {

	public WebDriver driver;
	String text;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();

	public SuperUserPage(WebDriver driver) {
		this.driver = driver;
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Reports']")
	WebElement report_Link;
	
	public void click_On_Reports() throws InterruptedException {
		webUtil.retryingFindClick(report_Link);
	}
	
	@FindBy(xpath="//input[@value='Report Configuration']")
	WebElement reportConfiguration;
	
	public void click_On_Report_Configuration() throws InterruptedException {
		webUtil.retryingFindClick(reportConfiguration);
	}
	
	@FindBy(xpath="//input[@placeholder='Tenant Name']")
	WebElement tenantName;
	
	public void write_Tenant_Name(String tenantNameFromExcel) {
		webUtil.retryingWriteText(tenantName, tenantNameFromExcel);
	}
	
	//img[@class='edit']
	
	@FindBy(xpath="//select")
	WebElement selectTenant;
	
	public void select_Tenant_Name(String tenantNameFromExcel) {
		webUtil.selectByVisibletext(selectTenant, tenantNameFromExcel);
	}
	
	
	@FindBy(xpath="//table[@formarrayname='otherReportsFormArray']/descendant::span/following-sibling::div")
	private List<WebElement> checkBoxes;
	
	public void click_On_Check_Box() throws InterruptedException {
		
		int countCheckBox = checkBoxes.size();
		System.out.println("The total checkboxed are "+countCheckBox);
		for(int i=0;i<checkBoxes.size();i++) {
			webUtil.retryingFindClick(checkBoxes.get(i));
		}
		
	}

}
