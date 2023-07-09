package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class OnlinePINReportsSectionLinks extends TestBase{
	
	//1. IP Management Drop Down For Previously Used
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement ratesSectionDropdown;
	
	public OnlinePINReportsSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of IP Management Drop Down For Previously Used
	public OnlinePINReportsSectionLinks clickOnIPManagementDropDownLink() {
		ratesSectionDropdown.click();
		return new OnlinePINReportsSectionLinks();
	}
	//02. Open URL of Web Transaction Report V2 Page Link
	public OnlinePINReportsSectionLinks clickOnWebTransactionReportV2Link() {
		driver.get(props.getProperty("url")+"OnlinePinReports/web_transaction_report_v2");
		//addNewRatePlanPageLink.click();
		return new OnlinePINReportsSectionLinks();
	}
	
	//03. Open URL of Online Pins Symlex Report Page Link
	public OnlinePINReportsSectionLinks clickOnOnlinePinsSymlexLink() {
		driver.get(props.getProperty("url")+"OnlinePinReports/online_pins_symlex");
		//ratePlanPageLink.click();
		return new OnlinePINReportsSectionLinks();
	}
	
	//04. Open URL of Free Signup Pin Report Page Link
	public OnlinePINReportsSectionLinks clickOnFreeSignupPinReportLink() {
		driver.get(props.getProperty("url")+"OnlinePinReports/free_signup_pin_report");
		return new OnlinePINReportsSectionLinks();
	}
	
	//05. Open URL of Online Sign UP Pins 2 Report page Link
	public OnlinePINReportsSectionLinks clickOnOnlineSignUpPins_2Link() {
		driver.get(props.getProperty("url")+"OnlinePinReports/online_sign_up_pins_2");
		return new OnlinePINReportsSectionLinks();
	}
	
	//06. Open URL of Online Country Wise Online Pins Report page Link
	public OnlinePINReportsSectionLinks openCountryWiseOnlinePinsPage() {
		driver.get(props.getProperty("url")+"OnlinePinReports/country_wise_online_pins");
		return new OnlinePINReportsSectionLinks();
	}
	
	//07. Open URL of Online iOS Payment Log Report page Link
	public OnlinePINReportsSectionLinks openiOSPaymentLogReportPage() {
		driver.get(props.getProperty("url")+"OnlinePinReports/ios_payment_log");
		return new OnlinePINReportsSectionLinks();
	}
	
	//08. Open URL of Campaign Sale Report page Link
	public OnlinePINReportsSectionLinks openCampaignSaleReport() {
		driver.get(props.getProperty("url")+"OnlinePinReports/campaign_sale_report");
		return new OnlinePINReportsSectionLinks();
	}
	
	//09. Open URL of iOS RTDN Receipt Report page Link
	public OnlinePINReportsSectionLinks openiOSRTDNReceiptReport() {
		driver.get(props.getProperty("url")+"OnlinePinReports/ios_rtdn_receipt_report");
		return new OnlinePINReportsSectionLinks();
	}
	
	//10. Open URL of Offline Payment Report page Link
	public OnlinePINReportsSectionLinks openOfflinePaymentReport() {
		driver.get(props.getProperty("url")+"OnlinePinReports/offline_payment_report");
		return new OnlinePINReportsSectionLinks();
	}
	
	//11. Open URL of Package Wise Online Sales page Link
	public OnlinePINReportsSectionLinks openPackageWiseOnlineSalesReport() {
		driver.get(props.getProperty("url")+"OnlinePinReports/package_wise_online_sales");
		return new OnlinePINReportsSectionLinks();
	}
	
	//12. Open URL of Online Silent Users page Link
	public OnlinePINReportsSectionLinks openOnlineSilentUsersReport() {
		driver.get(props.getProperty("url")+"OnlinePinReports/online_silent_users");
		return new OnlinePINReportsSectionLinks();
	}
	
	//13. Open URL of Monthly Sales Summary page Link
	public OnlinePINReportsSectionLinks openMonthlySalesSummaryReport() {
		driver.get(props.getProperty("url")+"OnlinePinReports/monthly_online_sales_summery");
		return new OnlinePINReportsSectionLinks();
	}
	
	//14. Open URL of Daily Online Sales Summary page Link
	public OnlinePINReportsSectionLinks openDailyOnlineSalesSummeryReport() {
		driver.get(props.getProperty("url")+"OnlinePinReports/daily_online_sales_summery");
		return new OnlinePINReportsSectionLinks();
	}
	
	//15. Open URL of Sign UP PIN Report Daily page Link
	public OnlinePINReportsSectionLinks openSignupPinDailyReport() {
		driver.get(props.getProperty("url")+"OnlinePinReports/signup_pin_report_daily");
		return new OnlinePINReportsSectionLinks();
	}
	
	//16. Open URL of Online Renew Trend Calendar page Link
	public OnlinePINReportsSectionLinks openOnlinRenewTrendCalenderReport() {
		driver.get(props.getProperty("url")+"OnlinePinReports/online_renew_trend_calender");
		return new OnlinePINReportsSectionLinks();
	}
	
}
