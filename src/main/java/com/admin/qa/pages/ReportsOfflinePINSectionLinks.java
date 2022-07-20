package com.admin.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ReportsOfflinePINSectionLinks extends TestBase{
	
	public ReportsOfflinePINSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Active pins Report Link
	public ResellerPanelSectionLinks openActivePinsReportLink() {
		driver.get(props.getProperty("url")+"report/active_pins");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Active Pins Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleActivePinsReport;
	
	//Get Text Title of title Active Pins Report
	public String getTextfromResellerPanelList() {
		String text = titleActivePinsReport.getText();
		return text;
	}
	
	//02. Open URL of Hourly Active Pins Report Link
	public ResellerPanelSectionLinks openHourlyActivePinsReportLinks() {
		driver.get(props.getProperty("url")+"report/hourly_active_pins");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Hourly Active Pins Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div/h1")
	WebElement titleHourlyActivePinsReport;
	
	//Get Text Title of Hourly Active Pins Report
	public String getTextfromtitleHourlyActivePinsReport() {
		String text = titleHourlyActivePinsReport.getText();
		return text;
	}
	
	//03. Open URL of Hourly Active Pins Report 2 Link
	public ResellerPanelSectionLinks openHourlyActivePinsReport2Links() {
		driver.get(props.getProperty("url")+"report/report/hourly_active_pins2");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Hourly Active Pins Report 2
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleHourlyActivePins2Report;
	
	//Get Text Title of Hourly Active Pins Report 2
	public String getTextfromtitleHourlyActivePinsReport2() {
		String text = titleHourlyActivePins2Report.getText();
		return text;
	}
	
	//04. Open URL of Reseller Individual Sold Pin Report Link
	public ResellerPanelSectionLinks openResellerIndividualSoldPinReportLink() {
		driver.get(props.getProperty("url")+"report/reseller_individual_sold_pin_report");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Reseller Individual Sold Pin Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleResellerIndividualSoldPinReport;
	
	//Get Text Title of Reseller Individual Sold Pin Report
	public String getTextfromtitleResellerIndividualSoldPinReport() {
		String text = titleResellerIndividualSoldPinReport.getText();
		return text;
	}
	
	//05. Open URL of Reseller Pin Login Report Link
	public ResellerPanelSectionLinks openResellerPinLoginReport() {
		driver.get(props.getProperty("url")+"report/report/reseller_pin_login_report");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Reseller Pin Login Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div/h1")
	WebElement titleResellerPinLoginReport;
	
	//Get Text Title of Reseller Individual Sold Pin Report
	public String getTextfromtitleResellerPinLoginReport() {
		String text = titleResellerIndividualSoldPinReport.getText();
		return text;
	}
	
	//06. Open URL of Package Wise Pin Subscription Report Link
	public ResellerPanelSectionLinks openPackageWisePinSubscriptionLink() {
		driver.get(props.getProperty("url")+"report/package_wise_pin_subbscription_report");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Package Wise Pin Subscription Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div/h1")
	WebElement titlePackageWisePinSubscriptionReport;
	
	//Get Text Title of Reseller Individual Sold Pin Report
	public String getTextfromtitlePackageWisePinSubscriptionReport() {
		String text = titlePackageWisePinSubscriptionReport.getText();
		return text;
	}
	
	//07. Open URL of Return Pin Report Link
	public ResellerPanelSectionLinks openReturnPinReportLink() {
		driver.get(props.getProperty("url")+"report/return_pin_report");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Package Wise Pin Subscription Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div/h1")
	WebElement titleReturnPinReport;
	
	//Get Text Title of Reseller Individual Sold Pin Report
	public String getTextfromtitleReturnPinReport() {
		String text = titleReturnPinReport.getText();
		return text;
	}
	
	//08. Open URL of Reset Pin Report Link
	public ResellerPanelSectionLinks openResetPinReportLink() {
		driver.get(props.getProperty("url")+"report/reset_pin_report");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Package Wise Pin Subscription Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div/h1")
	WebElement titleResetPinReport;
	
	//Get Text Title of Reseller Individual Sold Pin Report
	public String getTextfromtitleResetPinReport() {
		String text = titleResetPinReport.getText();
		return text;
	}
	
	//09. Open URL of Reseller4 Sold Pin Report Link
	public ResellerPanelSectionLinks openReseller4SoldPinReportLink() {
		driver.get(props.getProperty("url")+"report/reseller4_sold_pin_report");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Reseller4 Sold Pin Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div/h1")
	WebElement titleReseller4SoldPinReport;
	
	//Get Text Title of Reseller4 Sold Pin Report
	public String getTextfromtitleReseller4SoldPinReport() {
		String text = titleReseller4SoldPinReport.getText();
		return text;
	}
	
	//10. Open URL of Reseller4 Active Subscribe Pin Report Link
	public ResellerPanelSectionLinks openReseller4ActiveSubscribePinReportLink() {
		driver.get(props.getProperty("url")+"report/reseller4_active_subscribe_pin_report");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Reseller4 Active Subscribe Pin Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleReseller4ActiveSubscribePinReport;
	
	//Get Text Title of Reseller4 Active Subscribe Pin Report
	public String getTextfromtitleReseller4ActiveSubscribePinReport() {
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", titleReseller4ActiveSubscribePinReport);
		for (int i = 0; i <2; i++) {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", titleReseller4ActiveSubscribePinReport, "color: yellow; border: 2px solid yellow;");
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", titleReseller4ActiveSubscribePinReport, "");
        }
        
		String text = titleReseller4ActiveSubscribePinReport.getText();
		return text;
	}
	
	//11. Open URL of Resellers4 Daily Sales Report Link
	public ResellerPanelSectionLinks openResellers4DailySalesReportLink() {
		driver.get(props.getProperty("url")+"report/resellers4_daily_sales");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Resellers4 Daily Sales Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleResellers4DailySales;
	
	//Get Text Title of Reseller4 Active Subscribe Pin Report
	public String getTextfromtitleResellers4DailySalesReport() {
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", titleReseller4ActiveSubscribePinReport);
		String text = titleResellers4DailySales.getText();
		return text;
	}
	
	//12. Open URL of Reseller4 Pin Analysis Report Link
	public ResellerPanelSectionLinks openReseller4PinAnalysisLink() {
		driver.get(props.getProperty("url")+"report/reseller4_pin_analysis");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Reseller4 Pin Analysis Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleReseller4PinAnalysis;
	
	//Get Text Title of Reseller4 Pin Analysis Report
	public String getTextfromtitleReseller4PinAnalysisReport() {
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", titleReseller4ActiveSubscribePinReport);
		String text = titleReseller4PinAnalysis.getText();
		return text;
	}
	
	//13. Open URL of Reseller Daily Balance Report Link
	public ResellerPanelSectionLinks openResellerDailyBalanceReportLink() {
		driver.get(props.getProperty("url")+"report/reseller_daily_balance_report");
		return new ResellerPanelSectionLinks();
	}
	//XPath of Page Title of Reseller4 Pin Analysis Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleResellerDailyBalanceReport;
	
	//Get Text Title of Reseller4 Pin Analysis Report
	public String getTextfromtitleResellerDailyBalanceReport() {
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", titleReseller4ActiveSubscribePinReport);
		String text = titleResellerDailyBalanceReport.getText();
		return text;
	}
}
