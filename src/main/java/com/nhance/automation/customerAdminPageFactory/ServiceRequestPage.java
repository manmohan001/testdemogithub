/**
 * 
 */
package com.nhance.automation.customerAdminPageFactory;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.Testlistener;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

/**
 * @author Lopa
 *
 */
public class ServiceRequestPage {

	public WebDriver driver;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();
	String statusText;
	String firstRequestIdList;

	public ServiceRequestPage(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Service Request')]")
	private WebElement serviceRequest_Menu;

	public void click_On_serviceRequest_Menu() throws InterruptedException {
		webUtil.retryingFindClick(serviceRequest_Menu);
	}

	@FindBy(xpath = "//h1[contains(text(),'Service Request')]")
	private WebElement serviceRequest_HeaderName;

	public String getText_Of_serviceRequest_HeaderName() {
		String text = webUtil.getTheTextFromUI(serviceRequest_HeaderName);
		return text;
	}

	@FindBy(xpath = "//div[@class='create']")
	private WebElement serviceRequest_AddIcon;

	public void click_On_serviceRequest_AddIcon() throws InterruptedException {
		webUtil.retryingFindClick(serviceRequest_AddIcon);
	}

	@FindBy(xpath = "//input[@value='Back']")
	private WebElement backButton_In_ServiceRequestPage;

	public void click_On_backButton_In_ServiceRequestPage() throws InterruptedException {
		webUtil.retryingFindClick(backButton_In_ServiceRequestPage);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Email')]]/following-sibling::p-radiobutton[@formcontrolname='emailId']/div/div/span")
	private WebElement emailId_RadioButton;

	public void click_On_emailId_RadioButton() throws InterruptedException {
		webUtil.retryingFindClick(emailId_RadioButton);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Email')]]/following-sibling::ui-input-box/input")
	private WebElement emailID_TextBox;

	public void write_In_emailID_TextBox(String emailID_FromExcel) {
		webUtil.retryingWriteText(emailID_TextBox, emailID_FromExcel);
	}

	public String getText_Of_emailID_TextBox() {
		String text = webUtil.get_Attribut_value(emailID_TextBox);
		return text;
	}

	@FindBy(xpath = "//p-radiobutton[@formcontrolname='mobileNumber']/div")
	private WebElement mobileNumber_RadioButton;

	public void click_On_mobileNumber_RadioButton() throws InterruptedException {
		webUtil.retryingFindClick(mobileNumber_RadioButton);
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Mobile')]]/following-sibling::ngx-intl-tel-input/div/input")
	private WebElement mobileNumber_TextBox;

	public void write_In_mobileNumber_TextBox(String mobileNumber_FromExcel) {
		webUtil.retryingWriteText(mobileNumber_TextBox, mobileNumber_FromExcel);
	}

	public String getText_Of_mobileNumber_TextBox() {
		String text = webUtil.get_Attribut_value(mobileNumber_TextBox);
		return text;
	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Mobile')]]/following-sibling::ngx-intl-tel-input/div/div/div/div[@class='iti-arrow']")
	private WebElement countryCode_Dropdown;

	public void click_On_countryCode_Dropdown() throws InterruptedException {
		webUtil.retryingFindClick(countryCode_Dropdown);
	}

	//input[@value='Fetch Details']
	@FindBy(xpath = "//input[@value='Fetch Details']")
	private WebElement fetchDetails_Btn;

	public void click_On_getConsumer_Link() throws InterruptedException {
		webUtil.retryingFindClick(fetchDetails_Btn);
	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Name :']/following-sibling::span[1]")
	private WebElement name_Text;

	public void getText_Of_name_Text() {
		webUtil.getTheTextFromUI(name_Text);
	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Mobile Number :']/following-sibling::span[1]")
	private WebElement mobileNumber_Text;

	public void getText_Of_mobileNumber_Text() {
		webUtil.getTheTextFromUI(mobileNumber_Text);
	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Email Id :']/following-sibling::span[1]")
	private WebElement emailId_Text;

	public void getText_Of_emailId_Text() {
		webUtil.getTheTextFromUI(emailId_Text);
	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Product Details']/following-sibling::ui-selectbox[@formcontrolname='digitalKitCode']/select")
	private WebElement productDetails_SelectBox;
	

	public void select_From_productDk_SelectBox(String productDk_From_Excel) {
		webUtil.selectByVisibletext(productDetails_SelectBox, productDk_From_Excel);

	}

	public String getSelectedText_Of_productDk_SelectBox() {
		String text = webUtil.getFirstSelectionOption(productDetails_SelectBox);
		return text;
	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Type']/following-sibling::ui-selectbox[@formcontrolname='serviceTypeGuid']/select")
	private WebElement serviceType_SelectBox;

	public void select_From_serviceType_SelectBox(String serviceType_From_Excel) {
		webUtil.selectByVisibletext(serviceType_SelectBox, serviceType_From_Excel);

	}

	public String getSelectedText_Of_serviceType_SelectBox() {
		String text = webUtil.getFirstSelectionOption(serviceType_SelectBox);
		return text;
	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Amount']/following-sibling::div/ui-input-box/input")
	private WebElement amount_Field;

	public String getText_Of_amount_Field() {
		String amount=webUtil.get_Attribut_value(amount_Field);
		return amount;
	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Subject']/following-sibling::ui-input-box/input")
	private WebElement subject_TextBox;

	public void write_In_subject_TextBox(String subject_FromExcel) {
		webUtil.retryingWriteText(subject_TextBox, subject_FromExcel);
	}

	public String getText_Of_subject_TextBox() {
		String text = webUtil.get_Attribut_value(subject_TextBox);
		return text;

	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Message']/following-sibling::span/textarea")
	private WebElement message_TextBox;

	public void write_In_message_TextBox(String message_FromExcel) {
		webUtil.retryingWriteText(message_TextBox, message_FromExcel);
	}

	public String getText_Of_message_TextBox() {
		String text = webUtil.get_Attribut_value(message_TextBox);
		return text;

	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Attach File']/following-sibling::span/div/div/ui-fileupload/span/span/i")
	private WebElement attachFile_Link;

	public void click_On_attachFile_Link() throws InterruptedException {
		webUtil.retryingFindClick(attachFile_Link);
	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Address']/following-sibling::ui-selectbox/select")
	private WebElement address_SelectBox;

	public void select_From_address_SelectBox(String address_From_Excel) {
		webUtil.selectByVisibletext(address_SelectBox, address_From_Excel);

	}

	public String getSelectedText_Of_address_SelectBox() {
		String text = webUtil.getFirstSelectionOption(address_SelectBox);
		return text;
	}

	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveButton;

	public void click_On_saveButton() throws InterruptedException {
		webUtil.retryingFindClick(saveButton);
	}

	@FindBy(xpath = "//ui-tiles[@ng-reflect-tile-color='tiles-twitter']/div/div[@class='tiles-body']/div/div")
	private WebElement allTab_Link;
	public String getTheText_of_allTab_Link()
	{
		String countOfAllTab=webUtil.getTheTextFromUI(allTab_Link);
		return countOfAllTab;
	}
	public void click_On_allTab_Link() throws InterruptedException {
		webUtil.retryingFindClick(allTab_Link);
	}

	@FindBy(xpath = "//ui-tiles[@ng-reflect-tile-color='tiles-indigo']/div/div[@class='tiles-body']/div/div")
	private WebElement newTab_Link;
	public String getTheText_of_newTab_Link()
	{
		String countOfNewTab=webUtil.getTheTextFromUI(newTab_Link);
		return countOfNewTab;
	}
	public void click_On_newTab_Link() throws InterruptedException {
		webUtil.retryingFindClick(newTab_Link);
	}

	@FindBy(xpath = "//ui-tiles[@ng-reflect-tile-color='tiles-success']/div/div[@class='tiles-body']/div/div")
	private WebElement underProcessTab_Link;
	public String getTheText_of_underProcessTab_Link()
	{
		String countOfUnderprogress=webUtil.getTheTextFromUI(underProcessTab_Link);
		return countOfUnderprogress;
	}
	public void click_On_underProcessTab_Link() throws InterruptedException {
		webUtil.retryingFindClick(underProcessTab_Link);
	}

	@FindBy(xpath = "//ui-tiles[@ng-reflect-tile-color='tiles-danger']/div/div[@class='tiles-body']/div/div")
	private WebElement reopenTab_Link;
	public String getTheText_of_reopenTab_Link()
	{
		String countOfreopenTab=webUtil.getTheTextFromUI(reopenTab_Link);
		return countOfreopenTab;
	}
	public void click_On_reopenTab_Link() throws InterruptedException {
		webUtil.retryingFindClick(reopenTab_Link);
	}

	@FindBy(xpath = "//ui-tiles[@ng-reflect-tile-color='tiles-orange']/div/div[@class='tiles-body']/div/div")
	private WebElement resolvedTab_Link;
	public String getTheText_of_resolvedTab_Link()
	{
		String countOfresolvedTab=webUtil.getTheTextFromUI(resolvedTab_Link);
		return countOfresolvedTab;
	}
	public void click_On_resolvedTab_Link() throws InterruptedException {
		webUtil.retryingFindClick(resolvedTab_Link);
	}

	@FindBy(xpath = "//input[@placeholder='Request Id']")
	private WebElement serviceRequestNumber_SearchField;

	public void write_In_serviceRequestNumber_SearchField(String serviceRequestNumber_From_Excel) {
		webUtil.retryingWriteText(serviceRequestNumber_SearchField, serviceRequestNumber_From_Excel);
	}

	@FindBy(xpath = "//th[@class='ng2-smart-th srStatus']/ng2-smart-table-filter/div/select-filter[@ng-reflect-query='']/select")
	private WebElement status_Dropdown;

	public void select_From_status_Dropdown(String status_From_Excel) {
		webUtil.selectByVisibletext(status_Dropdown, status_From_Excel);

	}

	@FindBy(xpath = "//th[@class='ng2-smart-th serviceTypeName']/ng2-smart-table-filter/div/select-filter[@ng-reflect-query='']/select")
	private WebElement serviceType_Dropdown_Search;

	public void select_From_serviceType_Dropdown_Search(String serviceType_From_Excel) {
		webUtil.selectByVisibletext(serviceType_Dropdown_Search, serviceType_From_Excel);

	}

	@FindBy(xpath = "//input[@placeholder='Consumer']")
	private WebElement consumer_SearchField;
	
	@FindBy(xpath="//input[@placeholder='Consumer Mobile No.']")
	private WebElement consumer_Mobile_Number_Search_Feild;
	
	public void write_In_consumer_Mobile_Number_Search_Feild(String consumerMobile_From_Excel) {
		webUtil.retryingWriteText(consumer_Mobile_Number_Search_Feild, consumerMobile_From_Excel);
	}

	public void write_In_consumer_SearchField(String consumer_From_Excel) {
		webUtil.retryingWriteText(consumer_SearchField, consumer_From_Excel);
	}

	@FindBy(xpath = "//tbody/tr[@ng-reflect-klass='ng2-smart-row']/td/ng2-smart-table-cell/table-cell-view-mode/div[@ng-reflect-ng-switch='custom']/custom-view-component/ng-component/ui-link/a")
	private WebElement consumer_Link;

	public void click_On_consumer_Link() throws InterruptedException {
		webUtil.retryingFindClick(consumer_Link);
	}

	@FindBy(xpath = "//div[@class='modal-body']/div/div/div[@class='row head']/div")
	private WebElement consumerInformation_HeaderName;

	public String getText_Of_consumerInformation_HeaderName() {
		String text = webUtil.getTheTextFromUI(consumerInformation_HeaderName);
		return text;

	}

	@FindBy(xpath = "//ui-label[label[contains(text(),'Name')]]/following-sibling::span[1]")
	private WebElement consumerName;

	public String getText_Of_consumerName() {
		String text = webUtil.getTheTextFromUI(consumerName);
		return text;

	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Mobile Number :']/following-sibling::span[1]")
	private WebElement contactNumber;

	public String getText_Of_contactNumber() {
		String text = webUtil.getTheTextFromUI(contactNumber);
		return text;

	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Email Id :']/following-sibling::span[1]")
	private WebElement emailAddress;

	public String getText_Of_emailAddress() {
		String text = webUtil.getTheTextFromUI(emailAddress);
		return text;

	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Gender ']/following-sibling::span[1]")
	private WebElement gender;

	public String getText_Of_gender() {
		String text = webUtil.getTheTextFromUI(gender);
		return text;

	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Updated Date ']/following-sibling::span[1]")
	private WebElement updatedDate;

	public String getText_Of_updatedDate() {
		String text = webUtil.getTheTextFromUI(updatedDate);
		return text;

	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Os']/following-sibling::span[1]")
	private WebElement Os;

	public String getText_Of_Os() {
		String text = webUtil.getTheTextFromUI(Os);
		return text;

	}

	@FindBy(xpath = "//ui-label[@ng-reflect-label-name='Address']/following-sibling::span[1]")
	private WebElement Address;

	public String getText_Of_Address() {
		String text = webUtil.getTheTextFromUI(Address);
		return text;

	}

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	private WebElement closeButton;

	public void click_On_closeButton() throws InterruptedException {
		webUtil.retryingFindClick(closeButton);
	}

	@FindBy(xpath = "//div[@class='tablestyle']/table/tbody/tr/td[1]/ng2-smart-table-cell/table-cell-view-mode/div/descendant::a")
	public List<WebElement> list_Of_serviceRequestNo;

	@FindBy(xpath = "//div[@class='tablestyle']/table/tbody/tr/td[2]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_Of_statusName;
	@SuppressWarnings("unused")
	public String getTextof_Status_for_Particluar_Serached_SRN()
	{
		for(int i=0;i<list_Of_statusName.size();i++)
		{
		    statusText=list_Of_statusName.get(i).getText();
			break;
		}
		return statusText;
	}
	

	//table/tbody/tr/td[1]//div//div/following-sibling::ui-link//a
	//tbody//tr[1]//td[1]//div//a
	//div[@class='tablestyle']/table/tbody/tr/td[1]//a
	//div[@class='tablestyle']/table/tbody/tr/td[1]/ng2-smart-table-cell/table-cell-view-mode//a
	
	@FindBy(xpath = "//tbody//tr[1]//td[1]//div//a")
	public List<WebElement> list_Of_serviceRequestId;

	public String getTheTextOfServiceRequestIdInRecordTable() {
		for(int i=0;i<list_Of_serviceRequestId.size();i++)
		{
			firstRequestIdList = list_Of_serviceRequestId.get(i).getText();
			break;
		}
		return firstRequestIdList;
	}
	
	@FindBy(xpath = "//div[@class='tablestyle']/table/tbody/tr/td[3]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_Of_serviceTypeName;

	@FindBy(xpath = "//div[@class='tablestyle']/table/tbody/tr/td[4]/ng2-smart-table-cell/table-cell-view-mode/div/custom-view-component/ng-component/ui-link/a")
	public List<WebElement> list_Of_consumerName;
	
	@FindBy(xpath ="//div[@class='tablestyle']/table/tbody/tr/td[5]/ng2-smart-table-cell/table-cell-view-mode/div/div")
	public List<WebElement> list_Of_consumerMobileNumber;

	@FindBy(xpath = "//div[@class='tablestyle']/table/tbody/tr/td[5]/ng2-smart-table-cell/table-cell-view-mode/div/custom-view-component/ng-component/span")
	public List<WebElement> list_Of_latestResponseDate;

	@FindBy(xpath = "//div[@class='tablestyle']/table/tbody/tr/td[7]/ng2-st-tbody-custom/div")
	public List<WebElement> list_Of_viewDetailsLink;
	public void click_on_1stlink_Of_viewDetailsLink() throws InterruptedException
	{
		for(int i=0;i<list_Of_viewDetailsLink.size();i++)
		{
			webUtil.retryingFindClick(list_Of_viewDetailsLink.get(i));
		}
	}

	@FindBy(xpath = "//tbody/tr[@ng-reflect-klass='ng2-smart-row']/td/ng2-st-tbody-custom/div")
	private WebElement viewDetails_Link;

	public void click_On_viewDetails_Link() throws InterruptedException {
		webUtil.retryingFindClick(viewDetails_Link);
	}

	@FindBy(xpath = "//span[ui-label[label[contains(text(),'Status')]]]/following-sibling::span")
	private WebElement statusCapturedFrom_ServiceDetailsPage;

	public String getText_Of_statusCapturedFrom_ServiceDetailsPage() {
		String text = webUtil.getTheTextFromUI(statusCapturedFrom_ServiceDetailsPage);
		return text;

	}

	@FindBy(xpath = "//span[ui-label[@ng-reflect-label-name='REQUEST ID:']]/following-sibling::span")
	private WebElement requestIDCapturedFrom_ServiceDetailsPage;

	public String getText_Of_requestIDCapturedFrom_ServiceDetailsPage() {
		String text = webUtil.getTheTextFromUI(requestIDCapturedFrom_ServiceDetailsPage);
		return text;

	}

	@FindBy(xpath = "//div[@class='leftSection leftAlignText']/div/following-sibling::div[@class='productName']")
	private WebElement brandAndModelNoFrom_ServiceDetailsPage;

	public String getText_Of_brandAndModelNoFrom_ServiceDetailsPage() {
		String text = webUtil.getTheTextFromUI(brandAndModelNoFrom_ServiceDetailsPage);
		return text;

	}

	@FindBy(xpath = "//textarea")
	private WebElement reply_TextBox_In_ServiceDetailsPage;

	public void write_In_reply_TextBox_In_ServiceDetailsPage(String reply_FromExcel) {
		webUtil.retryingWriteText(reply_TextBox_In_ServiceDetailsPage, reply_FromExcel);
	}

	public String getText_Of_reply_TextBox_In_ServiceDetailsPage() {
		String text = webUtil.get_Attribut_value(reply_TextBox_In_ServiceDetailsPage);
		return text;

	}

	@FindBy(xpath = "//input[@value='Attach File']")
	private WebElement attachFileLink_In_ServiceDetailsPage;

	public void click_On_attachFileLink_In_ServiceDetailsPage() throws InterruptedException {
		webUtil.retryingFindClick(attachFileLink_In_ServiceDetailsPage);
	}

	@FindBy(xpath = "//span[@class='ui-chkbox-icon ui-clickable']")
	private WebElement markAsCritical_CheckBox_In_ServiceDetailsPage;

	public void click_On_markAsCritical_CheckBox_In_ServiceDetailsPage() throws InterruptedException {
		webUtil.retryingFindClick(markAsCritical_CheckBox_In_ServiceDetailsPage);
	}

	/*@FindBy(xpath = "//ui-selectbox[@formcontrolname='serviceEngineerUserId']/select")
	private WebElement assignServiceEngineer_SelectBox;
*/
	public void select_From_assignServiceEngineer_SelectBox(String serviceEngineer_From_Excel) {
		webUtil.selectByVisibletext(assignServiceEngineer_SelectBox, serviceEngineer_From_Excel);
	}
	
	@FindBy(xpath = "//input[@placeholder='Assign service engineer']")
	private WebElement assignServiceEngineer_SelectBox;
	public void write_On_assignServiceEngineerSelectBox(String serviceEngineerName) throws InterruptedException
	{
	//webUtil.retryingFindClick(assignServiceEngineer_SelectBox);
		webUtil.retryingWriteText(assignServiceEngineer_SelectBox, serviceEngineerName);
	}
	
	// Service Engineer Name in Auto suggest Box
	@FindBy(xpath = "//ul/li[@class='ui-autocomplete-list-item ui-corner-all']/span")
	private WebElement serviceEngineer_In_AutoSuggest;
	
	// Method to click on Model Number from Auto suggest box
	public void click_on_serviceEngineerName_In_AutoSuggest(String serviceEngineer_From_Excel) {
	String textFromAutoSuggest = serviceEngineer_In_AutoSuggest.getText().trim();
	if (textFromAutoSuggest.contains(serviceEngineer_From_Excel)) {
	Testlistener.log("Service Engineer Name Matched in Auto Suggest box..");
	serviceEngineer_In_AutoSuggest.click();
	}
	}

	public String getSelectedText_Of_serviceEngineer_From_Excel() {
		String text = webUtil.getFirstSelectionOption(assignServiceEngineer_SelectBox);
		return text;
	}

	@FindBy(xpath = "//i[@class='fa fa-angle-up']")
	private WebElement upwardLink_For_ReplyButton;

	public void click_On_upwardLink_For_ReplyButton() throws InterruptedException {
		webUtil.retryingFindClick(upwardLink_For_ReplyButton);
	}

	@FindBy(xpath = "//i[@class='fa fa-angle-down']")
	private WebElement downWardLink_For_ReplyButton;

	public void click_On_downWardLink_For_ReplyButton() throws InterruptedException {
		webUtil.retryingFindClick(downWardLink_For_ReplyButton);
	}

	@FindBy(xpath = "//input[@value='RESOLVE']")
	private WebElement resolveButton_Link;

	public void click_On_resolveButton_Link() throws InterruptedException {
		webUtil.retryingFindClick(resolveButton_Link);
	}


	public boolean verify_Resolve_Button_Display() {
	boolean rt = resolveButton_Link.isDisplayed();
	if(rt) {
	return rt;
	}
	return false;
	}
	
	@FindBy(xpath = "//input[@value='REPLY']")
	private WebElement replyButton_Link;

	public void click_On_replyButton_Link() throws InterruptedException {
		webUtil.retryingFindClick(replyButton_Link);
	}

	@FindBy(xpath = "//input[@value='Back']")
	private WebElement backButton_Link_In_ServiceDetailsPage;

	public void click_On_backButton_Link_In_ServiceDetailsPage() throws InterruptedException {
		webUtil.retryingFindClick(backButton_Link_In_ServiceDetailsPage);
	}

	@FindBy(xpath = "//input[@value='Refresh']")
	private WebElement refreshButton_Link_In_ServiceDetailsPage;

	public void click_On_refreshButton_Link_In_ServiceDetailsPage() throws InterruptedException {
		webUtil.retryingFindClick(refreshButton_Link_In_ServiceDetailsPage);
	}
	
	@FindBy(xpath = "//div[@class='iti-arrow']")
	private WebElement country_Select_Arrow_Link;

	@FindBy(xpath = "//ul[@class='country-list dropdown-menu']/li/span[@class='country-name']")
	private List<WebElement> list_of_CountryName;
	
	public void select_Country_From_SelectOption(String countryName) throws InterruptedException {
		webUtil.retryingFindClick(country_Select_Arrow_Link);
		Thread.sleep(500);
		for (int i = 0; i < list_of_CountryName.size(); i++) {
			if (list_of_CountryName.get(i).getText().trim().equals(countryName.trim())) {
				list_of_CountryName.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}
	
	@FindBy(xpath = "//input[@value='Reopen']")
	private WebElement reopenButton;

	public void click_On_ReopenButton() throws InterruptedException {
	webUtil.retryingFindClick(reopenButton);
	}

	@FindBy(xpath = "//div[div[div[text()='REOPEN']]]/following-sibling::div[@class='tiles-body']")
	private WebElement reopenCount;

	public String getTextOfReopenCount() {
	return reopenCount.getText();
	}

	
	
	
	public void select_DubaiCountry_From_SelectOption() throws InterruptedException {
		webUtil.retryingFindClick(country_Select_Arrow_Link);
		Thread.sleep(500);
		for (int i = 0; i < list_of_CountryName.size(); i++) {
			System.out.println("country on "+ i +" is :: "+ list_of_CountryName.get(i).getText() );
			if (list_of_CountryName.get(i).getText().trim().contains("United Arab Emirates".trim())) {
					try{
							webUtil.scroll_Upto_An_Element(list_of_CountryName.get(i));
							list_of_CountryName.get(i).click();
							break;
					}catch (Exception e) {
				}
			}
		}
		Thread.sleep(1000);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Country')]]/following-sibling::ui-input-box/input")
	private WebElement country_EditBox;
	public void write_on_Country_EditBox(String countryFromExcel)
	{
		webUtil.retryingWriteText(country_EditBox, countryFromExcel);
	}
	public String getTheTextOF_country_EditBox()
	{
		String countryName=webUtil.get_Attribut_value(country_EditBox);
		return countryName;
	}
	
	
	@FindBy(xpath="//ui-label[label[contains(text(),'State')]]/following-sibling::ui-input-box/input")
	private WebElement state_EditBox;
	public void write_on_state_EditBox(String stateFromExcel)
	{
		webUtil.retryingWriteText(state_EditBox, stateFromExcel);
	}
	public String getTheTextOF_state_EditBox()
	{
		String stateName=webUtil.get_Attribut_value(state_EditBox);
		return stateName;
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Address Line 1')]]/following-sibling::ui-input-box/input")
	private WebElement addressLine1_EditBox;
	public void write_On_addressLine1_EditBox(String addressFromExcel)
	{
		webUtil.retryingWriteText(addressLine1_EditBox, addressFromExcel);
	}
	
	@FindBy(xpath="//ui-label[label[contains(text(),'Address')]]/following-sibling::ui-selectbox/select")
	private WebElement addressLine1_SelectBox;
	public void select_addressLine1_SelectBox()
	{
		webUtil.selectByIndex(addressLine1_SelectBox, 1);
	}
	public String getTheTextOF_addressLine1_EditBox()
	{
		String addressLine1=webUtil.getFirstSelectionOption(addressLine1_SelectBox);
		return addressLine1;
	}
	
	@FindBy(xpath="//p-autocomplete[@formcontrolname='serviceEngineerUserId']/following-sibling::img")
	private WebElement cross_Sign_To_Unassigned_ServiceEngineer;
	public void click_On_cross_Sign_To_Unassigned_ServiceEngineer() throws InterruptedException
	{
		webUtil.retryingFindClick(cross_Sign_To_Unassigned_ServiceEngineer);
	}
	
	
	
	

	

}
