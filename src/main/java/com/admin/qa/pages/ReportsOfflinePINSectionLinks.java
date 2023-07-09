package com.admin.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ReportsOfflinePINSectionLinks extends TestBase{
	
	public ReportsOfflinePINSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of PIN Subscription Link
	public ReportsOfflinePINSectionLinks openPINSubscriptionLink() {
		driver.get(props.getProperty("url")+"report/active_pins");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//02. Open URL of Hourly Subscription Search Link
	public ReportsOfflinePINSectionLinks openHourlySubscriptionSearchLink() {
		driver.get(props.getProperty("url")+"report/hourly_active_pins");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//03. Open URL of Hourly Subscription Link
	public ReportsOfflinePINSectionLinks openHourlySubscriptionLink() {
		driver.get(props.getProperty("url")+"report/hourly_active_pins2");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//04. Open URL of Individual Sold PINs Link
	public ReportsOfflinePINSectionLinks openIndividualSoldPINsLink() {
		driver.get(props.getProperty("url")+"report/reseller_individual_sold_pin_report");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//05. Open URL of Reseller PIN Login Report Link
	public ReportsOfflinePINSectionLinks openResellerPINLoginReportLink() {
		driver.get(props.getProperty("url")+"report/reseller_pin_login_report");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//06. Open URL of  Package Wise Subscription Link
	public ReportsOfflinePINSectionLinks openPackageWiseSubscriptionLink() {
		driver.get(props.getProperty("url")+"report/package_wise_pin_subbscription_report");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//07. Open URL of Return PINs Report Link
	public ReportsOfflinePINSectionLinks openReturnPINsReportLink() {
		driver.get(props.getProperty("url")+"report/reseller_pin_login_report");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//08. Open URL of Reseller Wise Sold PIN Link
	public ReportsOfflinePINSectionLinks openResellerWiseSoldPINLink() {
		driver.get(props.getProperty("url")+"report/reseller4_sold_pin_report");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//09. Open URL of Reset PINs Report Link
	public ReportsOfflinePINSectionLinks openResetPINsReportLink() {
		driver.get(props.getProperty("url")+"report/return_pin_report");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//10. Open URL of Reseller's Total Active Subscription Link
	public ReportsOfflinePINSectionLinks openResellerTotalActiveSubscriptionLink() {
		driver.get(props.getProperty("url")+"report/reseller4_active_subscribe_pin_report");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//11. Open URL of Reseller4 Daily Sales Link
	public ReportsOfflinePINSectionLinks openReseller4DailySalesLink() {
		driver.get(props.getProperty("url")+"report/resellers4_daily_sales");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//12. Open URL of Reseller4 PIN Analysis Link
	public ReportsOfflinePINSectionLinks openReseller4PINAnalysisLink() {
		driver.get(props.getProperty("url")+"report/reseller4_pin_analysis");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//13. Open URL of Reseller Daily BAL History Link
	public ReportsOfflinePINSectionLinks openResellerDailyBALHistoryLink() {
		driver.get(props.getProperty("url")+"report/reseller_daily_balance_report");
		return new ReportsOfflinePINSectionLinks();
	}
	
	//14. Open URL of Symlex PIN sales Summary By Reseller Link
	public ReportsOfflinePINSectionLinks openSymlexPINsalesSummaryByResellerLink() {
		driver.get(props.getProperty("url")+"report/symlexSalesByReseller");
		return new ReportsOfflinePINSectionLinks();
	}
}
