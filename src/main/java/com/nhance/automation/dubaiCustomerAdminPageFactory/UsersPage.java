/**
 * 
 */
package com.nhance.automation.dubaiCustomerAdminPageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;


/**
 * @author Lopa
 *
 */
public class UsersPage {
	
	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	// BusinessFunction bMthd = new BusinessFunction();

	public UsersPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Settings')]")
	private WebElement settings_Menu;
	
	public void click_On_settings_Menu() throws InterruptedException
	{
		webUtil.retryingFindClick(settings_Menu);
	}
	
	@FindBy(xpath="//a[contains(text(),'Users')]")
	private WebElement usersLink;
	
	public void click_On_usersLink() throws InterruptedException
	{
		webUtil.retryingFindClick(usersLink);
	}
	
	@FindBy(xpath = "//h1[contains(text(),'Users')]")
	private WebElement users_HeaderName;

	public String getText_Of_users_HeaderName() {
		String text = webUtil.getTheTextFromUI(users_HeaderName);
		return text;

	}
	
	@FindBy(xpath = "//div[@class='moduleName column']")
	private WebElement addUserPage_HeaderName;

	public String getText_Of_addUserPage_HeaderName() {
		String text = webUtil.getTheTextFromUI(addUserPage_HeaderName);
		return text;

	}
	
	@FindBy(xpath="//input[@value='Back']")
	private WebElement backButton_In_ViewUsersPage;
	
	public void click_On_backButton_In_ViewUsersPage() throws InterruptedException
	{
		webUtil.retryingFindClick(backButton_In_ViewUsersPage);
	}
	
		
	@FindBy(xpath = "//ui-icon/img")
	private WebElement users_AddIcon;

	public void click_On_users_AddIcon() throws InterruptedException {
		webUtil.retryingFindClick(users_AddIcon);
	}
	
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Role')]]/following-sibling::ui-selectbox/select")
	private WebElement userRole_SelectBox;
	
	public void select_From_userRole_SelectBox(String userRole_From_Excel)
	{
		webUtil.selectByVisibletext(userRole_SelectBox, userRole_From_Excel);
			
	}
	
	@FindBy(xpath="//div[@class='ng2-smart-filter']/select-filter/select")
	private WebElement userRoleDropdown_In_ViewPage;
	
	public void select_From_userRoleDropdown_In_ViewPage(String userRole_From_Excel)
	{
		webUtil.selectByValue(userRoleDropdown_In_ViewPage, userRole_From_Excel);
	}
	
	public String getSelectedText_Of_userRole_SelectBox()
	{
		String text = webUtil.getFirstSelectionOption(userRole_SelectBox);
		return text;
	}
	
	
	@FindBy(xpath = "//ui-label[label[contains(text(),'Name')]]/following-sibling::ui-input-box/input")
	private WebElement name_EditBox;
	
	public void write_In_name_EditBox(String name_From_Excel)
	{
		webUtil.retryingWriteText(name_EditBox, name_From_Excel);
	}
	
	public String getText_Of_name_EditBox()
	{
		String text = webUtil.get_Attribut_value(name_EditBox);
		return text;
	}
	
	/*public void click_on_US_Country_Flag_Icon_For_ContactNumber() throws InterruptedException
	{
		driver.findElement(By.xpath("//ui-label[label[contains(text(),'Mobile Number')]]/following-sibling::ngx-intl-tel-input//div[@class='flag-container']")).click();
		Thread.sleep(1000);
		List<WebElement> listOFCountryCode=driver.findElements(By.xpath("//ul[@class='country-list dropdown-menu']/li/span[@class='country-name']"));
		for(int i=0;i<listOFCountryCode.size();i++)
		{
			if(listOFCountryCode.get(i).getText().trim().equals("United States".trim()))
			{
				listOFCountryCode.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}*/
	
	public void click_on_Country_Flag_Icon_For_ContactNumber(String countryFlagName) throws InterruptedException
	{
		driver.findElement(By.xpath("//ui-label[label[contains(text(),'Mobile Number')]]/following-sibling::ngx-intl-tel-input//div[@class='flag-container']")).click();
		Thread.sleep(1000);
		List<WebElement> listOFCountryCode=driver.findElements(By.xpath("//ul[@class='country-list dropdown-menu']/li/span[@class='country-name']"));
		for(int i=0;i<listOFCountryCode.size();i++)
		{
			if(listOFCountryCode.get(i).getText().trim().equals(countryFlagName.trim()))
			{
				listOFCountryCode.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}
	
	@FindBy(xpath = "//ui-label[label[contains(text(),'Mobile Number')]]/following-sibling::ngx-intl-tel-input/div/input")
	private WebElement mobileNumber_EditBox;
	
	public void write_In_mobileNumber_EditBox(String mobileNumber_From_Excel)
	{
		webUtil.retryingWriteText(mobileNumber_EditBox, mobileNumber_From_Excel);
	}
	
	public String getText_Of_mobileNumber_EditBox()
	{
		String text = webUtil.get_Attribut_value(mobileNumber_EditBox);
		return text;
	}
	
	
	@FindBy(xpath = "//ui-label[label[contains(text(),'Mobile')]]/following-sibling::ngx-intl-tel-input/div/div/div/div[@class='iti-arrow']")
	private WebElement countryCode_Dropdown;

	public void click_On_countryCode_Dropdown() throws InterruptedException {
		webUtil.retryingFindClick(countryCode_Dropdown);
	}
	
	
	@FindBy(xpath = "//ui-label[label[contains(text(),'Email Id')]]/following-sibling::ui-input-box/input")
	private WebElement emailId_EditBox;
	
	public void write_In_emailId_EditBox(String emailId_From_Excel)
	{
		webUtil.retryingWriteText(emailId_EditBox, emailId_From_Excel);
	}
	
	@FindBy(xpath = "//ui-label[label[contains(text(),'Profile Image')]]/following-sibling::div/ui-fileupload/span/span/input")
	private WebElement profileImage_Attach_Btn;

	public void click_On_profileImage_Attach_Btn() throws InterruptedException {
		webUtil.retryingFindClick(profileImage_Attach_Btn);
	}
	
	public String getText_Of_emailId_EditBox()
	{
		String text = webUtil.get_Attribut_value(emailId_EditBox);
		return text;
	}
	
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement save_Button;

	public void click_On_save_Button() throws InterruptedException {
		webUtil.retryingFindClick(save_Button);
	}
	
	@FindBy(xpath = "//input[@value='Back']")
	private WebElement backButton_In_AddUserPage;

	public void click_On_backButton_In_AddUserPage() throws InterruptedException {
		webUtil.retryingFindClick(backButton_In_AddUserPage);
	}
	
	@FindBy(xpath="//div[contains(text(),'New user details have been added')]")
	private WebElement successMessage_Alertpopup;
	
	public String getText_Of_successMessage_Alertpopup()
	{
		String text = webUtil.getTheTextFromUI(successMessage_Alertpopup);
		return text;
		
	}
	
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Role')]]/following-sibling::ui-selectbox/select")
	private WebElement roleDropdown_SelectField;
	
	public void select_From_roleDropdown_SelectField(String userRole_From_Excel)
	{
		webUtil.selectByVisibletext(roleDropdown_SelectField, userRole_From_Excel);
			
	}
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement name_SearchField;
	
	public void write_In_name_SearchField(String name_From_Excel)
	{
		webUtil.retryingWriteText(name_SearchField, name_From_Excel);
	}
	
	@FindBy(xpath="//input[@placeholder='Mobile number']")
	private WebElement mobileNumber_SearchField;
	
	public void write_In_mobileNumber_SearchField(String mobileNumber_From_Excel)
	{
		webUtil.retryingWriteText(mobileNumber_SearchField, mobileNumber_From_Excel);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Email id']")
	private WebElement emailID_SearchField;
	
	public void write_In_emailID_SearchField(String emailID_From_Excel)
	{
		webUtil.retryingWriteText(emailID_SearchField, emailID_From_Excel);
	}
	
	@FindBy(xpath="//span[@data-on='Yes']")
	private WebElement toggleButton;
	
	public void click_On_toggleButton() throws InterruptedException
	{
		webUtil.retryingFindClick(toggleButton);
	}
	
	@FindBy(xpath="//div[contains(text(),'User is inactive')]")
	private WebElement messageFor_InactiveUser;
	
	public String getText_Of_messageFor_InactiveUser()
	{
		String text = webUtil.getTheTextFromUI(messageFor_InactiveUser);
		return text;
	}
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	private WebElement okButton_In_AlertPopup;
	
	public void click_On_okButton_In_AlertPopup() throws InterruptedException
	{
		webUtil.retryingFindClick(okButton_In_AlertPopup);
	}
	
	
	@FindBy(xpath="//div[contains(text(),'User is active')]")
	private WebElement messageFor_ActiveUser;
	
	public String getText_Of_messageFor_ActiveUser()
	{
		String text = webUtil.getTheTextFromUI(messageFor_ActiveUser);
		return text;
	}
	
	@FindBy(xpath="//img[@class='edit']")
	private WebElement editButton;
	
	public void click_On_editButton() throws InterruptedException
	{
		webUtil.retryingFindClick(editButton);
	}
	
	@FindBy(xpath="//div[contains(text(),'User details have been updated')]")
	private WebElement update_Message;
	
	public String getText_Of_update_Message()
	{
		String text = webUtil.getTheTextFromUI(update_Message);
		return text;
	}
	
	@FindBy(xpath="//img[@class='delete']")
	private WebElement deleteButton;
	
	public void click_On_deleteButton() throws InterruptedException
	{
		webUtil.retryingFindClick(deleteButton);
	}
	
	@FindBy(xpath="//div[contains(text(),'Sure you want to delete?')]")
	private WebElement deleteMessage_In_Popup;
	
	public String getText_Of_deleteMessage_In_Popup()
	{
		String text = webUtil.getTheTextFromUI(deleteMessage_In_Popup);
		return text;
	}
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	private WebElement yesButton_In_DeleteMessagePopup;
	
	public void click_On_yesButton_In_DeleteMessagePopup() throws InterruptedException
	{
		webUtil.retryingFindClick(yesButton_In_DeleteMessagePopup);
	}
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement cancelButton_In_DeleteMessagePopup;
	
	public void click_On_cancelButton_In_DeleteMessagePopup() throws InterruptedException
	{
		webUtil.retryingFindClick(cancelButton_In_DeleteMessagePopup);
	}
	
	@FindBy(xpath="//div[contains(text(),'User deleted successfully.')]")
	private WebElement sucessMessage_After_Delete;
	
	public String getText_Of_sucessMessage_After_Delete()
	{
		String text = webUtil.getTheTextFromUI(sucessMessage_After_Delete);
		return text;
	}
	
	@FindBy(xpath="//td[contains(text(),'No data found')]")
	private WebElement noDataFound_Text;
	
	public String getText_Of_noDataFound_Text()
	{
		String text = webUtil.getTheTextFromUI(noDataFound_Text);
		return text;
		
		
	}
	

}
