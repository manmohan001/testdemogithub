package com.nhance.automation.customerAdminPageFactory;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nhance.automation.webBusinessLibrary.BusinessFunctionWebSpecific;
import com.nhance.automation.webGenericLibrary.ConstantValueForWeb;
import com.nhance.automation.webGenericLibrary.EnvironmentVariablesForWeb;
import com.nhance.automation.webGenericLibrary.ExcelLibrary;
import com.nhance.automation.webGenericLibrary.WebDriverCommonUtill;

public class TemplatesPage {
	
	public WebDriver driver;
	String text;
	WebDriverCommonUtill webUtil = new WebDriverCommonUtill();
	CustomerAdminCommonWebElementInAllPage cmnWebElmnt = new CustomerAdminCommonWebElementInAllPage(driver);
	BusinessFunctionWebSpecific bMthd = new BusinessFunctionWebSpecific();
	
	
	String assignServiceEngineerLabel;
	String productDetailsPageHeadingLabel;
	String serviceChargePageHeadingLabel;
	String serviceRequestPageHeadingLabel;
	String serviceRequestStatisticsPageHeadingLabel;
	String serviceRequestSummaryPageHeadingLabel;
	
	String isDiscoverableFieldLabelLabel;
	String modelNumberFieldLabel;
	String productCategoryFieldLabel;
	String productDetailsFieldlabel;
	String productImageFieldLabel;
	String productManufacturerFieldLabel;
	String productSubCategoryFieldLabel;
	String purchasedDateFieldLabel;
	String requestIdFieldLabel;
	static String requestTypeFieldLabel;
	String serviceProcessedFieldLabel;
	String serviceRequestedFieldLabel;
	String serviceTypeFieldLabel;
	String serialNumberFieldLabel;
	String warrantyExpiredFieldLabel;
	String warrantyExpiresInFieldLabel;
	String warrantyExpiresOnFieldLabel;
	String warrantyPeriodFieldLabel;
	String listingCategoryFieldLabel;
	String infoUrlFieldLabel;
	
	String campaignReportHeadingLabel;
	String campaignStatisticsReportHeadingLabel;
	String digitalKitEventReportHeadingLabel;
	String digitalKitInvoiceReportHeadingLabel;
	String digitalKitsIssuedReportHeadingLabel;
	String inventoryReportSparePartsAndAccessoriesReportHeadingLabel;
	String purchaseAccessoriesReportHeadingLabel;
	String purchaseRenewalsReportHeadingLabel;
	String purchaseReportOthersReportHeadingLabel;
	String serviceRequestDetailsReportHeadingLabel;
	String serviceRequestReportHeadingLabel;
	String sparePartsConsumptionReportHeadingLabel;
	
	String billingLeftMenuLabel;
	String campaignManagerLeftMenuLabel;
	String configureUniqueCodeLeftMenuLabel;
	String dashboardLeftMenuLabel;
	String digitalKitManagementLeftMenuLabel;
	String helpConfigurationLeftMenuLabel;
	String imageConfigurationLeftMenuLabel;
	String partnerServiceOfferingLeftMenuLabel;
	String productApprovalLeftMenuLabel;
	String productManagementLeftMenuLabel;
	String purchaseLeftMenuLabel;
	String reportsLeftMenuLabel;
	String serviceRequestLeftMenuLabel;
	String settingsLeftMenuLabel;
	

	public TemplatesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//a[text()='Template']")
	WebElement template;
	
	public void click_On_Template() throws InterruptedException {
		webUtil.retryingFindClick(template);
	}
	
	@FindBy(xpath="//th[span[contains(text(),'LABEL_PH_PRODUCTDETAILS')]]/following-sibling::th/ui-input-box/input")
	WebElement productDetails;
	
	public void write_On_Pageheader_ProductDetails(String detailsFromExcel) {
		webUtil.retryingWriteText(productDetails, detailsFromExcel);
	}
	
	public String get_Text_On_Pageheader_ProductDetails() {
		return webUtil.get_Attribut_value(productDetails);
	}
	

	@FindBy(xpath="//th[span[contains(text(),'LABEL_PH_SERVICECHARGE')]]/following-sibling::th/ui-input-box/input")
	WebElement serviceCharge;

	public void write_On_PageHeader_ServiceCharge(String chargeFromExcel) {
		webUtil.retryingWriteText(serviceCharge, chargeFromExcel);
	}
	public String get_Text_On_Pageheader_ServiceCharge() {
		return webUtil.get_Attribut_value(serviceCharge);
	}

	
	@FindBy(xpath="//th[span[text()='LABEL_PH_SERVICEREQUEST']]/following-sibling::th/ui-input-box/input")
	WebElement serviceRequest;

	public void write_On_PageHeader_ServiceRequest(String requestFromExcel) {
		webUtil.retryingWriteText(serviceRequest, requestFromExcel);
	}
	
	public String get_Text_On_Pageheader_ServiceRequest() {
		return webUtil.get_Attribut_value(serviceRequest);
	}

	@FindBy(xpath="//th[span[text()='LABEL_PH_SERVICEREQUESTSTATISTICS']]/following-sibling::th/ui-input-box/input")
	WebElement serviceRequestStatistics;

	public void write_On_PageHeader_ServiceRequestStatistics(String requestStatisticsFromExcel) {
		webUtil.retryingWriteText(serviceRequestStatistics, requestStatisticsFromExcel);
	}
	
	public String get_Text_On_Pageheader_ServiceRequestStatistics() {
		return webUtil.get_Attribut_value(serviceRequestStatistics);
	}

	@FindBy(xpath="//th[span[text()='LABEL_PH_SERVICEREQUESTSUMMARY']]/following-sibling::th/ui-input-box/input")
	WebElement serviceRequestSummary;

	public void write_On_PageHeader_ServiceRequestSummary(String requestSummaryFromExcel) {
		webUtil.retryingWriteText(serviceRequestSummary, requestSummaryFromExcel);
	}

	public String get_Text_On_Pageheader_ServiceRequestSummary() {
		return webUtil.get_Attribut_value(serviceRequestSummary);
	}
	
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_ASSIGNSERVICEENGG']]/following-sibling::th/ui-input-box/input")
	WebElement assignServiceEngineer;
	
	public void write_On_Field_Label_AssignServiceEngineer(String serviceEngineerFromExcel) {
		webUtil.retryingWriteText(assignServiceEngineer, serviceEngineerFromExcel);
	}
	
	public String get_Text_On_Field_Label_AssignServiceEngineer() {
		return webUtil.get_Attribut_value(assignServiceEngineer);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_ISDISCOVERABLE']]/following-sibling::th/ui-input-box/input")
	WebElement isDiscoverable;
	
	public void write_On_Field_Label_IsDiscoverable(String isDiscoverableFromExcel) {
		webUtil.retryingWriteText(isDiscoverable, isDiscoverableFromExcel);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_INFOURL']]/following-sibling::th/ui-input-box/input")
	WebElement infoUrl;
	
	public void write_On_Field_Label_InfoUrl(String infoUrlFromExcel) {
		webUtil.retryingWriteText(infoUrl, infoUrlFromExcel);
	}
	public String get_Text_On_Field_Label_InfoUrl() {
		return webUtil.get_Attribut_value(infoUrl);
	}
	
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_LISTINGCATEGORY']]/following-sibling::th/ui-input-box/input")
	WebElement listingCategory;
	
	public void write_On_Field_Label_ListingCategory(String listingCategoryFromExcel) {
		webUtil.retryingWriteText(listingCategory, listingCategoryFromExcel);
	}
	public String get_Text_On_Field_Label_ListingCategory() {
		return webUtil.get_Attribut_value(listingCategory);
	}

	
	@FindBy(xpath="//th[span[text()='LABEL_FL_MODELNUMBER']]/following-sibling::th/ui-input-box/input")
	WebElement modelNumber;
	
	public void write_On_Field_Label_ModelNumber(String modelNumberFromExcel) {
		webUtil.retryingWriteText(modelNumber, modelNumberFromExcel);
	}
	
	public String get_Text_On_Field_Label_ModelNumber() {
		return webUtil.get_Attribut_value(modelNumber);
	}

	@FindBy(xpath="//th[span[text()='LABEL_FL_PRODUCTCATEGORY']]/following-sibling::th/ui-input-box/input")
	WebElement productCategory;
	
	public void write_On_Field_Label_ProductCategory(String productCategoryFromExcel) {
		webUtil.retryingWriteText(productCategory, productCategoryFromExcel);
	}
	
	public String get_Text_On_Field_Label_ProductCategory() {
		return webUtil.get_Attribut_value(productCategory);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_PRODUCTDETAILS']]/following-sibling::th/ui-input-box/input")
	WebElement productdetailsFieldLevel;
	
	public void write_On_Field_Label_Productdetails(String productdetailsFromExcel) {
		webUtil.retryingWriteText(productdetailsFieldLevel, productdetailsFromExcel);
	}
	
	public String get_Text_On_Field_Label_Productdetails() {
		return webUtil.get_Attribut_value(productdetailsFieldLevel);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_PRODUCTIMAGE']]/following-sibling::th/ui-input-box/input")
	WebElement productImage;
	
	public void write_On_Field_Label_ProductImage(String productImageFromExcel) {
		webUtil.retryingWriteText(productImage, productImageFromExcel);
	}
	
	public String get_Text_On_Field_Label_ProductImage() {
		return webUtil.get_Attribut_value(productImage);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_PRODUCTMANUFACTURER']]/following-sibling::th/ui-input-box/input")
	WebElement productManufacturer;
	
	public void write_On_Field_Label_ProductManufacturer(String productManufacturerFromExcel) {
		webUtil.retryingWriteText(productManufacturer, productManufacturerFromExcel);
	}
	
	public String get_Text_On_Field_Label_ProductManufacturer() {
		return webUtil.get_Attribut_value(productManufacturer);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_PRODUCTSUBCATEGORY']]/following-sibling::th/ui-input-box/input")
	WebElement productSubCategory;
	
	public void write_On_Field_Label_ProductSubCategory(String productSubCategoryFromExcel) {
		webUtil.retryingWriteText(productSubCategory, productSubCategoryFromExcel);
	}
	
	public String get_Text_On_Field_Label_ProductSubCategory() {
		return webUtil.get_Attribut_value(productSubCategory);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_PURCHASEDATE']]/following-sibling::th/ui-input-box/input")
	WebElement purchaseDate;
	
	public void write_On_Field_Label_PurchaseDate(String purchaseDateFromExcel) {
		webUtil.retryingWriteText(purchaseDate, purchaseDateFromExcel);
	}
	
	public String get_Text_On_Field_Label_PurchaseDate() {
		return webUtil.get_Attribut_value(purchaseDate);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_REQUESTID']]/following-sibling::th/ui-input-box/input")
	WebElement requestId;
	
	public void write_On_Field_Label_RequestId(String requestIdFromExcel) {
		webUtil.retryingWriteText(requestId, requestIdFromExcel);
	}
	
	public String get_Text_On_Field_Label_RequestId() {
		return webUtil.get_Attribut_value(requestId);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_REQUESTTYPE']]/following-sibling::th/ui-input-box/input")
	WebElement requestType;
	
	public void write_On_Field_Label_RequestType(String requestTypeFromExcel) {
		webUtil.retryingWriteText(requestType, requestTypeFromExcel);
	}
	
	public String get_Text_On_Field_Label_RequestType() {
		return webUtil.get_Attribut_value(requestType);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_SERVICEPROCESSED']]/following-sibling::th/ui-input-box/input")
	WebElement serviceProcessed;
	
	public void write_On_Field_Label_ServiceProcessed(String serviceProcessedFromExcel) {
		webUtil.retryingWriteText(serviceProcessed, serviceProcessedFromExcel);
	}
	
	public String get_Text_On_Field_Label_ServiceProcessed() {
		return webUtil.get_Attribut_value(serviceProcessed);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_SERVICEREQUEST']]/following-sibling::th/ui-input-box/input")
	WebElement serviceRequest_FieldLable;
	
	public void write_On_Field_Label_ServiceRequest(String serviceRequestFromExcel) {
		webUtil.retryingWriteText(serviceRequest_FieldLable, serviceRequestFromExcel);
	}	
	
	public String get_Text_On_Field_Label_ServiceRequest() {
		return webUtil.get_Attribut_value(serviceRequest_FieldLable);
	}

	
	@FindBy(xpath="//th[span[text()='LABEL_FL_SERVICEREQUESTED']]/following-sibling::th/ui-input-box/input")
	WebElement serviceRequested;
	
	public void write_On_Field_Label_ServiceRequested(String serviceRequestedFromExcel) {
		webUtil.retryingWriteText(serviceRequested, serviceRequestedFromExcel);
	}
	
	public String get_Text_On_Field_Label_ServiceRequested() {
		return webUtil.get_Attribut_value(serviceRequested);
	}


	@FindBy(xpath="//th[span[text()='LABEL_FL_SERVICETYPE']]/following-sibling::th/ui-input-box/input")
	WebElement serviceType;
	
	public void write_On_Field_Label_ServiceType(String serviceTypeFromExcel) {
		webUtil.retryingWriteText(serviceType, serviceTypeFromExcel);
	}
	
	public String get_Text_On_Field_Label_ServiceType() {
		return webUtil.get_Attribut_value(serviceType);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_SLNUMBER']]/following-sibling::th/ui-input-box/input")
	WebElement serialNumber;
	
	public void write_On_Field_Label_SerialNumber(String serialNumberFromExcel) {
		webUtil.retryingWriteText(serialNumber, serialNumberFromExcel);
	}
	
	public String get_Text_On_Field_Label_SerialNumber() {
		return webUtil.get_Attribut_value(serialNumber);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_WARRANTYEXPIRED']]/following-sibling::th/ui-input-box/input")
	WebElement warrantyExpired;
	
	public void write_On_Field_Label_WarrantyExpired(String warrantyExpiredFromExcel) {
		webUtil.retryingWriteText(warrantyExpired, warrantyExpiredFromExcel);
	}
	
	public String get_Text_On_Field_Label_WarrantyExpired() {
		return webUtil.get_Attribut_value(warrantyExpired);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_WARRANTYEXPIRESIN']]/following-sibling::th/ui-input-box/input")
	WebElement warrantyExpiresIn;
	
	public void write_On_Field_Label_WarrantyExpiresIn(String warrantyExpiresInFromExcel) {
		webUtil.retryingWriteText(warrantyExpiresIn, warrantyExpiresInFromExcel);
	}
	
	public String get_Text_On_Field_Label_WarrantyExpiresIn() {
		return webUtil.get_Attribut_value(warrantyExpiresIn);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_WARRANTYEXPIRYDATE']]/following-sibling::th/ui-input-box/input")
	WebElement warrantyExpiresOn;
	
	public void write_On_Field_Label_WarrantyExpiresOn(String warrantyExpiresOnFromExcel) {
		webUtil.retryingWriteText(warrantyExpiresOn, warrantyExpiresOnFromExcel);
	}
	
	public String get_Text_On_Field_Label_WarrantyExpiresOn() {
		return webUtil.get_Attribut_value(warrantyExpiresOn);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_FL_WARRANTYPERIOD']]/following-sibling::th/ui-input-box/input")
	WebElement warrantyPeriod;
	
	public void write_On_Field_Label_WarrantyPeriod(String warrantyPeriodFromExcel) {
		webUtil.retryingWriteText(warrantyPeriod, warrantyPeriodFromExcel);
	}
	
	public String get_Text_On_Field_Label_WarrantyPeriod() {
		return webUtil.get_Attribut_value(warrantyPeriod);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_CAMPAIGNREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement campaignReport;
	
	public void write_On_ReportHead_CampaignReport(String campaignReportFromExcel) {
		webUtil.retryingWriteText(campaignReport, campaignReportFromExcel);
	}
	
	public String get_Text_On_ReportHead_CampaignReport() {
		return webUtil.get_Attribut_value(campaignReport);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_CAMPAIGNSTATISTICSREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement campaignSatisticsReport;
	
	public void write_On_ReportHead_CampaignSatisticsReport(String campaignSatisticsReportFromExcel) {
		webUtil.retryingWriteText(campaignSatisticsReport, campaignSatisticsReportFromExcel);
	}
	
	public String get_Text_On_ReportHead_CampaignSatisticsReport() {
		return webUtil.get_Attribut_value(campaignSatisticsReport);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_DIGITALKITEVENTREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement digitalKitEventReport;
	
	public void write_On_ReportHead_DigitalKitEventReport(String digitalKitEventReportFromExcel) {
		webUtil.retryingWriteText(digitalKitEventReport, digitalKitEventReportFromExcel);
	}
	
	public String get_Text_On_ReportHead_DigitalKitEventReport() {
		return webUtil.get_Attribut_value(digitalKitEventReport);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_DIGITALKITINVOICE']]/following-sibling::th/ui-input-box/input")
	WebElement digitalKitInvoice;
	
	public void write_On_ReportHead_DigitalKitInvoice(String digitalKitInvoiceFromExcel) {
		webUtil.retryingWriteText(digitalKitInvoice, digitalKitInvoiceFromExcel);
	}
	
	public String get_Text_On_ReportHead_DigitalKitInvoice() {
		return webUtil.get_Attribut_value(digitalKitInvoice);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_DIGITALKITISSUED']]/following-sibling::th/ui-input-box/input")
	WebElement digitalKitsIssued;
	
	public void write_On_ReportHead_DigitalKitsIssued(String digitalKitsIssuedFromExcel) {
		webUtil.retryingWriteText(digitalKitsIssued, digitalKitsIssuedFromExcel);
	}
	
	public String get_Text_On_ReportHead_DigitalKitsIssued() {
		return webUtil.get_Attribut_value(digitalKitsIssued);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_INVENTORYREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement inventory_Report_Spare_Parts_And_Accessories;
	
	public void write_On_ReportHead_Inventory_Report_Spare_Parts_And_Accessories(String inventory_Report_Spare_Parts_And_AccessoriesFromExcel) {
		webUtil.retryingWriteText(inventory_Report_Spare_Parts_And_Accessories, inventory_Report_Spare_Parts_And_AccessoriesFromExcel);
	}
	
	public String get_Text_On_ReportHead_Inventory_Report_Spare_Parts_And_Accessories() {
		return webUtil.get_Attribut_value(inventory_Report_Spare_Parts_And_Accessories);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_PURCHASEACCESSORIESREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement purchase_accessories_Report;
	
	public void write_On_ReportHead_Purchase_accessories_Report(String purchaseaccessoriesReportFromExcel){
		webUtil.retryingWriteText(purchase_accessories_Report, purchaseaccessoriesReportFromExcel);
	}
	
	public String get_Text_On_ReportHead_Purchase_accessories_Report() {
		return webUtil.get_Attribut_value(purchase_accessories_Report);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_PURCHASERENEWALSREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement purchase_renewals_Report;
	
	public void write_On_ReportHead_Purchase_renewals_Report(String purchaseRenewalsReportFromExcel){
		webUtil.retryingWriteText(purchase_renewals_Report, purchaseRenewalsReportFromExcel);
	}
	
	public String get_Text_On_ReportHead_Purchase_renewals_Report() {
		return webUtil.get_Attribut_value(purchase_renewals_Report);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_PURCHASEREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement purchase_Report_Others;
	
	public void write_On_ReportHead_Purchase_Report_Others(String purchaseReportOthersFromExcel){
		webUtil.retryingWriteText(purchase_Report_Others, purchaseReportOthersFromExcel);
	}
	
	public String get_Text_On_ReportHead_Purchase_Report_Others() {
		return webUtil.get_Attribut_value(purchase_Report_Others);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_SERVICEREQUESTDETAILREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement service_Request_Details_Report;
	
	public void write_On_ReportHead_Service_Request_Details_Report(String serviceRequestDetailsReportFromExcel){
		webUtil.retryingWriteText(service_Request_Details_Report, serviceRequestDetailsReportFromExcel);
	}
	
	public String get_Text_On_ReportHead_Service_Request_Details_Report() {
		return webUtil.get_Attribut_value(service_Request_Details_Report);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_SERVICEREQUESTREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement service_Request_Report;
	
	public void write_On_ReportHead_Service_Request_Report(String serviceRequestReportFromExcel){
		webUtil.retryingWriteText(service_Request_Report, serviceRequestReportFromExcel);
	}
	
	public String get_Text_On_ReportHead_Service_Request_Report() {
		return webUtil.get_Attribut_value(service_Request_Report);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_RH_SPAREPARTSCONSUMPTIONREPORT']]/following-sibling::th/ui-input-box/input")
	WebElement spare_Parts_Consumption_Report;
	
	public void write_On_ReportHead_Spare_Parts_Consumption_Report(String sparePartsConsumptionReportFromExcel){
		webUtil.retryingWriteText(spare_Parts_Consumption_Report, sparePartsConsumptionReportFromExcel);
	}
	
	public String get_Text_On_ReportHead_Spare_Parts_Consumption_Report() {
		return webUtil.get_Attribut_value(spare_Parts_Consumption_Report);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_BILLING']]/following-sibling::th/ui-input-box/input")
	WebElement billing;
	
	public void write_On_LeftMenu_Billing(String billingFromExcel) {
		webUtil.retryingWriteText(billing, billingFromExcel);
	}
	
	public String get_Text_On_LeftMenu_Billing() {
		return webUtil.get_Attribut_value(billing);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_CAMPAIGNMANAGER']]/following-sibling::th/ui-input-box/input")
	WebElement campaignManager;
	
	public void write_On_LeftMenu_CampaignManager(String campaignManagerFromExcel) {
		webUtil.retryingWriteText(campaignManager, campaignManagerFromExcel);
	}
	
	public String get_Text_On_LeftMenu_CampaignManager() {
		return webUtil.get_Attribut_value(campaignManager);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_CONFIGUREUNIQUECODE']]/following-sibling::th/ui-input-box/input")
	WebElement configureUniqueCode;
	
	public void write_On_LeftMenu_ConfigureUniqueCode(String configureUniqueCodeFromExcel) {
		webUtil.retryingWriteText(configureUniqueCode, configureUniqueCodeFromExcel);
	}
	
	public String get_Text_On_LeftMenu_ConfigureUniqueCode() {
		return webUtil.get_Attribut_value(configureUniqueCode);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_DASHBOARD']]/following-sibling::th/ui-input-box/input")
	WebElement dashboard;
	
	public void write_On_LeftMenu_Dashboard(String dashboardFromExcel) {
		webUtil.retryingWriteText(dashboard, dashboardFromExcel);
	}
	
	public String get_Text_On_LeftMenu_Dashboard() {
		return webUtil.get_Attribut_value(dashboard);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_DIGITALKITMANAGMENT']]/following-sibling::th/ui-input-box/input")
	WebElement digitalKitManagement;
	
	public void write_On_LeftMenu_DigitalKitManagement(String digitalKitManagementFromExcel) {
		webUtil.retryingWriteText(digitalKitManagement, digitalKitManagementFromExcel);
	}
	
	public String get_Text_On_LeftMenu_DigitalKitManagement() {
		return webUtil.get_Attribut_value(digitalKitManagement);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_HELPCONFIGURATION']]/following-sibling::th/ui-input-box/input")
	WebElement helpConfiguration;
	
	public void write_On_LeftMenu_HelpConfiguration(String helpConfigurationFromExcel) {
		webUtil.retryingWriteText(helpConfiguration, helpConfigurationFromExcel);
	}
	
	public String get_Text_On_LeftMenu_HelpConfiguration() {
		return webUtil.get_Attribut_value(helpConfiguration);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_IMAGECONFIGURATION']]/following-sibling::th/ui-input-box/input")
	WebElement imageConfiguration;
	
	public void write_On_LeftMenu_ImageConfiguration(String imageConfigurationFromExcel) {
		webUtil.retryingWriteText(imageConfiguration, imageConfigurationFromExcel);
	}
	
	public String get_Text_On_LeftMenu_ImageConfiguration() {
		return webUtil.get_Attribut_value(imageConfiguration);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_PARTNER_SERVICE_OFFERING']]/following-sibling::th/ui-input-box/input")
	WebElement partner_Service_Offering;
	
	public void write_On_LeftMenu_Partner_Service_Offering(String partnerServiceOfferingFromExcel) {
		webUtil.retryingWriteText(partner_Service_Offering, partnerServiceOfferingFromExcel);
	}
	
	public String get_Text_On_LeftMenu_Partner_Service_Offering() {
		return webUtil.get_Attribut_value(partner_Service_Offering);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_PRODUCTAPPROVAL']]/following-sibling::th/ui-input-box/input")
	WebElement productApproval;
	
	public void write_On_LeftMenu_ProductApproval(String productApprovalFromExcel) {
		webUtil.retryingWriteText(productApproval, productApprovalFromExcel);
	}
	
	public String get_Text_On_LeftMenu_ProductApproval() {
		return webUtil.get_Attribut_value(productApproval);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_PRODUCTMANAGMENT']]/following-sibling::th/ui-input-box/input")
	WebElement productManagement;
	
	public void write_On_LeftMenu_ProductManagement(String productManagementFromExcel) {
		webUtil.retryingWriteText(productManagement, productManagementFromExcel);
	}
	
	public String get_Text_On_LeftMenu_ProductManagement() {
		return webUtil.get_Attribut_value(productManagement);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_PURCHASE']]/following-sibling::th/ui-input-box/input")
	WebElement purchase;
	
	public void write_On_LeftMenu_Purchase(String purchaseFromExcel) {
		webUtil.retryingWriteText(purchase, purchaseFromExcel);
	}
	
	public String get_Text_On_LeftMenu_Purchase() {
		return webUtil.get_Attribut_value(purchase);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_REPORTS']]/following-sibling::th/ui-input-box/input")
	WebElement reports;
	
	public void write_On_LeftMenu_Reports(String reportsFromExcel) {
		webUtil.retryingWriteText(reports, reportsFromExcel);
	}
	
	public String get_Text_On_LeftMenu_Reports() {
		return webUtil.get_Attribut_value(reports);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_SERVICEREQUEST']]/following-sibling::th/ui-input-box/input")
	WebElement serviceRequestLeftMenu;
	
	public void write_On_LeftMenu_ServiceRequest(String serviceRequestFromExcel) {
		webUtil.retryingWriteText(serviceRequestLeftMenu, serviceRequestFromExcel);
	}
	
	public String get_Text_On_LeftMenu_ServiceRequest() {
		return webUtil.get_Attribut_value(serviceRequestLeftMenu);
	}
	
	@FindBy(xpath="//th[span[text()='LABEL_LM_SETTINGS']]/following-sibling::th/ui-input-box/input")
	WebElement settings;
	
	public void write_On_LeftMenu_Settings(String settingsFromExcel) {
		webUtil.retryingWriteText(settings, settingsFromExcel);
	}
	
	public String get_Text_On_LeftMenu_Settings() {
		return webUtil.get_Attribut_value(settings);
	}
	
	
	
	//Mobile App menu
	@FindBy(xpath="//a[text()='Mobile App Menu']")
	private WebElement mobileAppMenu;
	public void click_On_Mobile_App_Menu() throws InterruptedException {
		webUtil.retryingFindClick(mobileAppMenu);
	}
	
	// Master data mapping
	@FindBy(xpath="//a[text()='Master Data Mapping']")
	private WebElement masterDataMapping;
	
	public void click_On_MDR() throws InterruptedException {
		webUtil.retryingFindClick(masterDataMapping);
	}
	
//edit_Mobile_App
	
	
	@FindBy(xpath="//img[@class='edit']")
	private WebElement editAppMenu;
	
	public void click_On_EditAppMenu() throws InterruptedException {
		webUtil.retryingFindClick(editAppMenu);
	}
	
	// mandatory attributes
	
	
	@FindBy(xpath="//a[text()='Mandatory Attributes']")
	private WebElement mandatoryAttributes;
	
	public void click_On_MandatoryAttributes() throws InterruptedException {
		webUtil.retryingFindClick(mandatoryAttributes);
	}
	
	
	
	@FindBy(xpath="//p-radiobutton[@value='2']")
	private WebElement radioButtonProductSubCategory;
	
	public void click_On_RadioButtonProductSubCategory() throws InterruptedException {
		webUtil.retryingFindClick(radioButtonProductSubCategory);
	}
	
	//Model Number
	
	public String get_Text_Of_ModelNumberDKManagementRecordTable() {
		for(int i=0;i<modelNumberProductManagementInRecordTable.size();i++)
		{
			text = modelNumberProductManagementInRecordTable.get(i).getText();
			break;
		}
		return text;
	}
	WebElement modelNumberSearchPage;
	public String get_Text_Of_ModelNumberSearchPage() throws IOException, EncryptedDocumentException, InvalidFormatException{
		modelNumberFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 19, 1);
		modelNumberSearchPage = driver.findElement(By.xpath("//input[@placeholder='"+modelNumberFieldLabel+"']"));
		String text = modelNumberSearchPage.getAttribute("placeholder");
		return	text;
	}

	public String get_Text_Of_ModelNumberTextField() throws IOException, EncryptedDocumentException, InvalidFormatException{
		modelNumberFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 19, 1);
		WebElement modelNumberTextField = driver.findElement(By.xpath("//input[@placeholder='Enter "+modelNumberFieldLabel+"']"));
		String text = modelNumberTextField.getAttribute("placeholder");
		return	text;
	}

	public void write_On_modelNumberSearchEditBox(String modelFromExcel) throws EncryptedDocumentException, InvalidFormatException, IOException {
		modelNumberFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 19, 1);
		modelNumberSearchPage = driver.findElement(By.xpath("//input[@placeholder='"+modelNumberFieldLabel+"']"));
		webUtil.retryingWriteText(modelNumberSearchPage, modelFromExcel);
	}
	
	public String get_Text_Of_ModelNumberDetailPage() throws IOException, EncryptedDocumentException, InvalidFormatException{
		modelNumberFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 19, 1);
		WebElement modelNumberDKManagement = driver.findElement(By.xpath("//label[text()='"+modelNumberFieldLabel+"']"));
		String text = modelNumberDKManagement.getText();
		return	text;
	}	
	
	@FindBy(xpath = "//table/tbody/tr/td[1]//div")
	private List<WebElement> modelNumberProductManagementInRecordTable;
	
	public void click_modelNumberProductManagementInRecordTable() {
		for(int i=0;i<modelNumberProductManagementInRecordTable.size();i++)
		{
			modelNumberProductManagementInRecordTable.get(i).click();
			break;
		}
	}
	
	//table/tbody/tr/td[4]
	@FindBy(xpath = "//table/tbody/tr/td[4]")
	private List<WebElement> editListInRecordTable;
	
	public void click_editListInRecordTableInRecordTable() {
		for(int i=0;i<editListInRecordTable.size();i++)
		{
			editListInRecordTable.get(i).click();
			break;
		}
	}
	
	
	@FindBy(xpath = "//img[@class='edit']")
	private WebElement editIcon;
	
	public void click_On_Edit_Icon() throws InterruptedException {
		webUtil.retryingFindClick(editIcon);
	}
	
	
	@FindBy(xpath="//div[text()='Product Details']")
	WebElement productDetailsProductManagement;
	
	public String get_Text_Of_ProductDetailsProductManagement() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productDetailsPageHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 1, 1);
		WebElement productDetailsProductManagement = driver.findElement(By.xpath("//div[text()='"+productDetailsPageHeadingLabel+"']"));
		String text = productDetailsProductManagement.getText();
		return	text;
	}
	
	
	
	@FindBy(xpath="//a[contains(text(),'Product Details')]")
	private WebElement productDetailsLink;
	public void click_On_productDetailsLink() throws InterruptedException
	{
		webUtil.retryingFindClick(productDetailsLink);
	}
	
	@FindBy(xpath="//h1[text()='Product Details']")
	WebElement productDetailsReport;

	public String get_Text_Of_ProductDetailsReport() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productDetailsPageHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 1, 1);
		WebElement productDetailsProductManagement = driver.findElement(By.xpath("//h1[text()='"+productDetailsPageHeadingLabel+"']"));
		String text = productDetailsProductManagement.getText();
		return	text;
	}
	
	//Product category
	
	public String get_Text_Of_ProductCategorySearch() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productCategoryFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 21, 1);
		WebElement productCategoryDkManagement = driver.findElement(By.xpath("//input[@placeholder='"+productCategoryFieldLabel+"']"));
		String text = productCategoryDkManagement.getAttribute("placeholder");
		return	text;
	}
	
	public String get_Text_Of_ProductCategoryDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productCategoryFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 21, 1);
		WebElement productCategoryProductManagement = driver.findElement(By.xpath("//label[text()='"+productCategoryFieldLabel+"']"));
		String text = productCategoryProductManagement.getText();
		return	text;
	}
	
	public String get_Text_Of_ProductCategoryMobileApp() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productCategoryFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 21, 1);
		WebElement productCategoryMobileAppMenu = driver.findElement(By.xpath("//h4[text()='Select "+productCategoryFieldLabel+"']"));
		String text = productCategoryMobileAppMenu.getText();
		return	text;
	}
	
	public String get_Text_Of_ProductCategoryMobileAppEdit() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productCategoryFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 21, 1);
		WebElement productCategoryMobileAppMenuEdit = driver.findElement(By.xpath("//h4[text()='Selected "+productCategoryFieldLabel+"']"));
		String text = productCategoryMobileAppMenuEdit.getText();
		return	text;
	}
	
	// Service charge
	
	public String get_Text_Of_ServiceChargeProductManagement() throws IOException, EncryptedDocumentException, InvalidFormatException{
		serviceChargePageHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 3, 1);
		WebElement serviceChargeProductManagement = driver.findElement(By.xpath("//a[text()='"+serviceChargePageHeadingLabel+"']"));
		String text = serviceChargeProductManagement.getText();
		return	text;
	}
	
	public String get_Text_Of_ServiceRequestDetailPage() throws IOException, EncryptedDocumentException, InvalidFormatException{
		serviceRequestPageHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 5, 1);
		WebElement serviceRequestDetailPage = driver.findElement(By.xpath("//h1[text()='"+serviceRequestPageHeadingLabel+"']"));
		String text = serviceRequestDetailPage.getText();
		return	text;
	}

	public String get_Text_Of_ServiceRequestServiceRequest() throws IOException, EncryptedDocumentException, InvalidFormatException{
		serviceRequestPageHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 5, 1);
		WebElement serviceRequestServiceRequest = driver.findElement(By.xpath("//div[text()='"+serviceRequestPageHeadingLabel+"']"));
		String text = serviceRequestServiceRequest.getText();
		return	text;
	}
	
	
	//product details Field label

	public String get_Text_Of_ProductDetailsFieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productDetailsFieldlabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 23, 1);
		WebElement productDetailsServiceRequest = driver.findElement(By.xpath("//label[text()='"+productDetailsFieldlabel+"']"));
		String text = productDetailsServiceRequest.getText();
		return	text;
	}
	
	// product image field label
	public String get_Text_Of_ProductImageFieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productImageFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 25, 1);
		WebElement productImageDetails = driver.findElement(By.xpath("//label[text()='"+productImageFieldLabel+"']"));
		String text = productImageDetails.getText();
		return	text;
	}
	
	// product Manufacturer field label
	
	public String get_Text_Of_ProductManufacturerSearch() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productManufacturerFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 27, 1);
		WebElement productManufacturerSearch = driver.findElement(By.xpath("//input[@placeholder='"+productManufacturerFieldLabel+"']"));
		String text = productManufacturerSearch.getAttribute("placeholder");
		return	text;
	}
	
	public String get_Text_Of_ProductManufacturerFieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productImageFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 27, 1);
		WebElement productManufacturerDetails = driver.findElement(By.xpath("//label[text()='"+productImageFieldLabel+"']"));
		String text = productManufacturerDetails.getText();
		return	text;
	}
	
	// product SubCategory field level
	public String get_Text_Of_ProductSubCategoryFieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productSubCategoryFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 29, 1);
		WebElement productSubCategoryDetails = driver.findElement(By.xpath("//label[text()='"+productSubCategoryFieldLabel+"']"));
		String text = productSubCategoryDetails.getText();
		return	text;
	}
	
	public String get_Text_Of_ProductSubCategorySearch() throws IOException, EncryptedDocumentException, InvalidFormatException{
		productSubCategoryFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 29, 1);
		WebElement productSubCategorySearch = driver.findElement(By.xpath("//input[@placeholder='"+productSubCategoryFieldLabel+"']"));
		String text = productSubCategorySearch.getAttribute("placeholder");
		return	text;
	}
	
	//purchased Date field label
	
	public String get_Text_Of_PurchasedDateFieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		purchasedDateFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 31, 1);
		WebElement purchasedDateDetails = driver.findElement(By.xpath("//label[text()='"+purchasedDateFieldLabel+"']"));
		String text = purchasedDateDetails.getText();
		return	text;
	}
	
	public String get_Text_Of_PurchasedDateSearch() throws IOException, EncryptedDocumentException, InvalidFormatException{
		purchasedDateFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 31, 1);
		WebElement purchasedDateSearch = driver.findElement(By.xpath("//input[@placeholder='"+purchasedDateFieldLabel+"']"));
		String text = purchasedDateSearch.getAttribute("placeholder");
		return	text;
	}
	
	// request Id field label
	
	public String get_Text_Of_Request_Id_FieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		requestIdFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 33, 1);
		WebElement requestIdDetails = driver.findElement(By.xpath("//label[text()='"+requestIdFieldLabel+":']"));
		String text = requestIdDetails.getText();
		return	text;
	}
	
	public String get_Text_Of_RequestId_Search() throws IOException, EncryptedDocumentException, InvalidFormatException{
		requestIdFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 33, 1);
		WebElement requestIdSearch = driver.findElement(By.xpath("//input[@placeholder='"+requestIdFieldLabel+"']"));
		String text = requestIdSearch.getAttribute("placeholder");
		return	text;
	}
	
	public void write_Text_Of_RequestId_Search(String purchasedDateFieldLabelFromExcel) throws IOException, EncryptedDocumentException, InvalidFormatException{
		requestIdFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 33, 1);
		WebElement requestIdSearch = driver.findElement(By.xpath("//input[@placeholder='"+requestIdFieldLabel+"']"));
		webUtil.retryingWriteText(requestIdSearch, purchasedDateFieldLabelFromExcel);
		
		String text = requestIdSearch.getAttribute("placeholder");
	}
	
	// request type
		
		
		public String get_Text_Of_Request_Type_FieldLabelSearch() throws IOException, EncryptedDocumentException, InvalidFormatException{
			requestTypeFieldLabel = ExcelLibrary.getXlSheetStringValue(
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 35, 1);
			WebElement requestTypeSearch = driver.findElement(By.xpath("//th[@class='ng2-smart-th serviceTypeName']/ng2-smart-table-filter/div/select-filter[@ng-reflect-query='']/select//option[text()='Select "+requestTypeFieldLabel+"']"));
			String text = requestTypeSearch.getText();
			return	text;
		}
		
		
		public String get_Text_Of_Request_Type_FieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
			requestTypeFieldLabel = ExcelLibrary.getXlSheetStringValue(
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 35, 1);
			WebElement requestTypeDetails = driver.findElement(By.xpath("//label[text()='"+requestTypeFieldLabel+"']"));
			String text = requestTypeDetails.getText();
			return	text;
		}
		
	
	// service type field label
	public String get_Text_Of_Service_Type_FieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		serviceTypeFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 43, 1);
		WebElement requestIdDetails = driver.findElement(By.xpath("//label[text()='"+serviceTypeFieldLabel+"']"));
		String text = requestIdDetails.getText();
		return	text;
	}
	
	// serial Number field label
	
	public String get_Text_Of_Serial_Number_FieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		serialNumberFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 45, 1);
		WebElement serialNumberDetails = driver.findElement(By.xpath("//label[text()='"+serialNumberFieldLabel+"']"));
		String text = serialNumberDetails.getText();
		return	text;
	}
	
	public String get_Text_Of_Serial_Number_Search() throws IOException, EncryptedDocumentException, InvalidFormatException{
		serialNumberFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 45, 1);
		WebElement serialNumberSearch = driver.findElement(By.xpath("//input[@placeholder='"+serialNumberFieldLabel+"']"));
		String text = serialNumberSearch.getAttribute("placeholder");
		return	text;
	}
	
	// warranty period field label
	
	public String get_Text_Of_Warranty_Period_FieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		warrantyPeriodFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 53, 1);
		WebElement warrantyPeriodDetails = driver.findElement(By.xpath("//label[text()='"+warrantyPeriodFieldLabel+"']"));
		String text = warrantyPeriodDetails.getText();
		return	text;
	}
	
	public String get_Text_Of_Warranty_Period_Search() throws IOException, EncryptedDocumentException, InvalidFormatException{
		warrantyPeriodFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 53, 1);
		WebElement warrantyPeriodSearch = driver.findElement(By.xpath("//input[@placeholder='"+warrantyPeriodFieldLabel+"']"));
		String text = warrantyPeriodSearch.getAttribute("placeholder");
		return	text;
	}
	
	// listing category
	
	public String get_Text_Of_Listing_Category_FieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		listingCategoryFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 17, 1);
		WebElement listingCategoryDetails = driver.findElement(By.xpath("//label[text()='"+listingCategoryFieldLabel+"']"));
		String text = listingCategoryDetails.getText();
		return	text;
	}
	
	public String get_Text_Of_Listing_Category_Text_Box() throws IOException, EncryptedDocumentException, InvalidFormatException{
		listingCategoryFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 17, 1);
		WebElement listingCategoryTextBox = driver.findElement(By.xpath("//input[@placeholder='Enter "+listingCategoryFieldLabel+"']"));
		String text = listingCategoryTextBox.getAttribute("placeholder");
		return	text;
	}
	
	// infoUrl field label
	
	public String get_Text_Of_Info_Url_FieldLabelDetails() throws IOException, EncryptedDocumentException, InvalidFormatException{
		infoUrlFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 13, 1);
		WebElement infoUrlDetails = driver.findElement(By.xpath("//label[text()='"+infoUrlFieldLabel+"']"));
		String text = infoUrlDetails.getText();
		return	text;
	}
	
	public String get_Text_Of_Info_Url_Text_Box() throws IOException, EncryptedDocumentException, InvalidFormatException{
		infoUrlFieldLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 13, 1);
		WebElement infoUrlTextBox = driver.findElement(By.xpath("//input[@placeholder='Enter "+infoUrlFieldLabel+"']"));
		String text = infoUrlTextBox.getAttribute("placeholder");
		return	text;
	}
	
	// campaign report Report Heading
	
	//h1[text()='Campaign Reportxfgx']
	public String get_Text_Of_Campaign_Report_Heading() throws IOException, EncryptedDocumentException, InvalidFormatException{
		campaignReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 55, 1);
		WebElement campaignReportHeading = driver.findElement(By.xpath("//h1[text()='"+campaignReportHeadingLabel+"']"));
		String text = campaignReportHeading.getText();
		return	text;
	}
	
	// Digital Kit Events Report Heading
	public String get_Text_Of_Digital_Kit_Events_Report_Heading() throws IOException, EncryptedDocumentException, InvalidFormatException{
		digitalKitEventReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 59, 1);
		WebElement digitalKitEventReportHeading = driver.findElement(By.xpath("//h1[text()='"+digitalKitEventReportHeadingLabel+"']"));
		String text = digitalKitEventReportHeading.getText();
		return	text;
	}
	
	// Digital Kit invoice Report Heading
			public String get_Text_Of_Digital_Kit_Invoice_Report_Heading() throws IOException, EncryptedDocumentException, InvalidFormatException{
				digitalKitInvoiceReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
						EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
						EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 61, 1);
				WebElement digitalKitInvoiceReportHeading = driver.findElement(By.xpath("//h1[text()='"+digitalKitInvoiceReportHeadingLabel+"']"));
				String text = digitalKitInvoiceReportHeading.getText();
				return	text;
			}
	
	// Digital Kit issued Report Heading
		public String get_Text_Of_Digital_Kit_Issued_Report_Heading() throws IOException, EncryptedDocumentException, InvalidFormatException{
			digitalKitsIssuedReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 63, 1);
			WebElement digitalKitIssuedReportHeading = driver.findElement(By.xpath("//h1[text()='"+digitalKitsIssuedReportHeadingLabel+"']"));
			String text = digitalKitIssuedReportHeading.getText();
			return	text;
		}

		// service request report heading
		public String get_Text_Of_Service_Request_Report_Heading() throws IOException, EncryptedDocumentException, InvalidFormatException{
			
			serviceRequestReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
					EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 75, 1);
			WebElement serviceRequestReportHeading = driver.findElement(By.xpath("//h1[text()='"+serviceRequestReportHeadingLabel+"']"));
			String text = serviceRequestReportHeading.getText();
			return	text;
		}
		
		// Service Request Details report heading
	public String get_Text_Of_Service_Request_Details_Report_Heading()
			throws IOException, EncryptedDocumentException, InvalidFormatException {

		serviceRequestDetailsReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 73,
				1);
		WebElement serviceRequestDetailsReportHeading = driver.findElement(By.xpath("//h1[text()='" + serviceRequestDetailsReportHeadingLabel + "']"));
		String text = serviceRequestDetailsReportHeading.getText();
		return text;
	}
	// spare parts and consumption report
	
	public String get_Text_Of_Spare_parts_Consumption_Report_Heading()  throws IOException, EncryptedDocumentException, InvalidFormatException {

		sparePartsConsumptionReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 77,
				1);
		WebElement sparePartsConsumptionReportHeading = driver.findElement(By.xpath("//h1[text()='" + sparePartsConsumptionReportHeadingLabel + "']"));
		String text = sparePartsConsumptionReportHeading.getText();
		return text;
	}
	
	// purchase renewals report
	
	public String get_Text_Of_Purchase_Renewals_Report_Heading()  throws IOException, EncryptedDocumentException, InvalidFormatException {

		purchaseRenewalsReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 69,
				1);
		WebElement purchaseRenewalsReportHeading = driver.findElement(By.xpath("//h1[text()='" + purchaseRenewalsReportHeadingLabel + "']"));
		String text = purchaseRenewalsReportHeading.getText();
		return text;
	}
	
	// purchase accessories report
	
	public String get_Text_Of_Purchase_Accessories_Report_Heading()  throws IOException, EncryptedDocumentException, InvalidFormatException {

		purchaseAccessoriesReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 67,
				1);
		WebElement purchaseAccessoriesReportHeading = driver.findElement(By.xpath("//h1[text()='" + purchaseAccessoriesReportHeadingLabel + "']"));
		String text = purchaseAccessoriesReportHeading.getText();
		return text;
	}
	
	// Purchase reports others
	
	public String get_Text_Of_Purchase_Reports_Others_Report_Heading()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		purchaseReportOthersReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 71,
				1);
		WebElement purchaseReportOthersReportHeading = driver.findElement(By.xpath("//h1[text()='" + purchaseReportOthersReportHeadingLabel + "']"));
		String text = purchaseReportOthersReportHeading.getText();
		return text;
	}
	
	// Inventory Report - Spare Parts And Accessories

	public String get_Text_Of_Inventory_Report_Spare_Parts_And_Accessories_Report_Heading()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		inventoryReportSparePartsAndAccessoriesReportHeadingLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 65,
				1);
		WebElement inventoryReportSparePartsAndAccessoriesReportHeading = driver.findElement(By.xpath("//h1[text()='" + inventoryReportSparePartsAndAccessoriesReportHeadingLabel + "']"));
		String text = inventoryReportSparePartsAndAccessoriesReportHeading.getText();
		return text;
	}
	
	// Left Menu
	public String get_Text_Of_DashBoard_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		dashboardLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 85,
				1);
		WebElement dashboardLeftMenu = driver.findElement(By.xpath("//span[text()='"+dashboardLeftMenuLabel+"']"));
		String text = dashboardLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_DK_Managment_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		digitalKitManagementLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 87,
				1);
		WebElement digitalKitManagementLeftMenu = driver.findElement(By.xpath("//span[text()='"+digitalKitManagementLeftMenuLabel+"']"));
		String text = digitalKitManagementLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_Product_Managment_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		productManagementLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 97,
				1);
		WebElement productManagementLeftMenu = driver.findElement(By.xpath("//span[text()='"+productManagementLeftMenuLabel+"']"));
		String text = productManagementLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_Product_Approval_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		productApprovalLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 95,
				1);
		WebElement productApprovalLeftMenu = driver.findElement(By.xpath("//span[text()='"+productApprovalLeftMenuLabel+"']"));
		String text = productApprovalLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_Configure_Uniquecode_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		configureUniqueCodeLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 83,
				1);
		WebElement configureUniqueCodeLeftMenu = driver.findElement(By.xpath("//span[text()='"+configureUniqueCodeLeftMenuLabel+"']"));
		String text = configureUniqueCodeLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_Purchase_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		purchaseLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 99,
				1);
		WebElement purchaseLeftMenu = driver.findElement(By.xpath("//span[text()='"+purchaseLeftMenuLabel+"']"));
		String text = purchaseLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_Billing_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		billingLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 79,
				1);
		WebElement billingLeftMenu = driver.findElement(By.xpath("//span[text()='"+billingLeftMenuLabel+"']"));
		String text = billingLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_Partner_Service_Offering_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		partnerServiceOfferingLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 93,
				1);
		WebElement partnerServiceOfferingLeftMenu = driver.findElement(By.xpath("//span[text()='"+partnerServiceOfferingLeftMenuLabel+"']"));
		String text = partnerServiceOfferingLeftMenu.getText();
		return text;
	}
	
	
	public String get_Text_Of_Service_Request_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		serviceRequestLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 103,
				1);
		WebElement serviceRequestLeftMenu = driver.findElement(By.xpath("//span[text()='"+serviceRequestLeftMenuLabel+"']"));
		String text = serviceRequestLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_Settings_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		settingsLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 105,
				1);
		WebElement settingsLeftMenu = driver.findElement(By.xpath("//span[text()='"+settingsLeftMenuLabel+"']"));
		String text = settingsLeftMenu.getText();
		return text;
	}
	
	public void click_On_Settings_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		settingsLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 105,
				1);
		WebElement settingsLeftMenu = driver.findElement(By.xpath("//span[text()='"+settingsLeftMenuLabel+"']"));
		settingsLeftMenu.click();
	}
	
	public String get_Text_Of_Campaign_Manager_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		campaignManagerLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 81,
				1);
		WebElement campaignManagerLeftMenu = driver.findElement(By.xpath("//span[text()='"+campaignManagerLeftMenuLabel+"']"));
		String text = campaignManagerLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_Reports_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		reportsLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 101,
				1);
		WebElement reportsLeftMenu = driver.findElement(By.xpath("//span[text()='"+reportsLeftMenuLabel+"']"));
		String text = reportsLeftMenu.getText();
		return text;
	}
	
	public String get_Text_Of_Help_Configuration_LeftMenu()  throws IOException, EncryptedDocumentException, InvalidFormatException {
		helpConfigurationLeftMenuLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA),89,
				1);
		WebElement helpConfigurationLeftMenu = driver.findElement(By.xpath("//span[text()='"+helpConfigurationLeftMenuLabel+"']"));
		String text = helpConfigurationLeftMenu.getText();
		return text;
	}
	
	@FindBy(xpath="//input[@placeholder='Request Id']")
	WebElement requestIdServiceRequest;
	
	public void write_RequestIdServiceRequest(String requestIdFromExcel) {
		webUtil.retryingWriteText(requestIdServiceRequest, requestIdFromExcel);
	}
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private List<WebElement> requestIdServiceRequestInRecordTable;

	public String getTheTextOf_requestIdServiceRequestInRecordTable() {
		for(int i=0;i<requestIdServiceRequestInRecordTable.size();i++)
		{
			text = requestIdServiceRequestInRecordTable.get(i).getText();
			break;
		}
		return text;
	}
	
	public void click_requestIdServiceRequestInRecordTable() {
		for(int i=0;i<requestIdServiceRequestInRecordTable.size();i++)
		{
			requestIdServiceRequestInRecordTable.get(i).click();
			break;
		}
	}

	
	@FindBy(xpath = "//div[@class='listingPageActionLink']")
	private WebElement viewDetailsServiceRequestInRecordTable;

	public void click_viewDetailsServiceRequestInRecordTable() throws InterruptedException {
		webUtil.retryingFindClick(viewDetailsServiceRequestInRecordTable);
	}
	
	
	// third
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement  mobileNumberServiceRequest;
	
	public void write_Mobile_Number(String mobileNumberFromExcel) {
		webUtil.retryingWriteText(mobileNumberServiceRequest, mobileNumberFromExcel);
	}
	
	@FindBy(xpath="//input[@value='Fetch Details']")
	WebElement fetchDetails;
	
	public void click_On_FetchDetails() throws InterruptedException {
		webUtil.retryingFindClick(fetchDetails);
	}
	
	@FindBy(xpath="//div[ui-label[label[text()='Product Details']]]//select")
	private List<WebElement> selectProductDetailsServiceRequest;
	
	public String select_SelectProductDetailsServiceRequest() throws InterruptedException {
		for(int i=0;i<selectProductDetailsServiceRequest.size();i++)
		{
			text = selectProductDetailsServiceRequest.get(i).getText();
			break;
		}
		return text;
	}
	
	
	
	@FindBy(xpath="//ui-label[label[text()='Request Type']]/following-sibling::ui-selectbox//select")
	private WebElement serviceRequestType;
	
	
	public void select_ServiceRequestType(String productDk_From_Excel) {
		webUtil.selectByVisibletext(serviceRequestType, productDk_From_Excel);

	}
	
	@FindBy(xpath="//input[@placeholder='Assign service engineer']")
	WebElement assignServiceEngineerServiceRequest;
	
	public String get_Text_Of_AssignServiceEngineerServiceRequest() {
		return webUtil.get_Attribut_value(assignServiceEngineerServiceRequest);
	}
	
	public String get_Text_Of_AssignServiceText() throws IOException, EncryptedDocumentException, InvalidFormatException{
	assignServiceEngineerLabel = ExcelLibrary.getXlSheetStringValue(
			EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
			EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 11, 1);
	WebElement assignServiceEngineertext = driver.findElement(By.xpath("//ui-label[label[contains(text(),'"+assignServiceEngineerLabel+"')]]"));
	String text = assignServiceEngineertext.getText();
	return text;
	}

	public String get_Text_Of_AssignServiceSelect() throws IOException, EncryptedDocumentException, InvalidFormatException{
		assignServiceEngineerLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 11, 1);
		WebElement assignServiceEngineerServiceRequestSelect = driver.findElement(By.xpath("//ui-label[label[contains(text(),'"+assignServiceEngineerLabel+"')]]/following-sibling::p-autocomplete//input"));
	
		String text = assignServiceEngineerServiceRequestSelect.getAttribute("placeholder");
		return	text;
	}

	public String get_Text_Of_AssignServiceSelectReply() throws IOException, EncryptedDocumentException, InvalidFormatException{
		assignServiceEngineerLabel = ExcelLibrary.getXlSheetStringValue(
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.NHANCE_WEB_TESTDATA_EXCEL_FILE_LOC),
				EnvironmentVariablesForWeb.getPropertyValue(ConstantValueForWeb.SHEETNAME_FOR_TEMPLATE_TESTDATA), 11, 1);
		
		WebElement assignServiceEngineerServiceRequestSelectType = driver.findElement(By.xpath("//input[@placeholder='"+assignServiceEngineerLabel+"']"));
		String text = assignServiceEngineerServiceRequestSelectType.getAttribute("placeholder");
		return	text;
	}
	
	
	
}

