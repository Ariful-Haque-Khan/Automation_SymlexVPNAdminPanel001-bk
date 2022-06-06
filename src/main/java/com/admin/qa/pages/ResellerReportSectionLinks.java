package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerReportSectionLinks extends TestBase{
	
	
	//1. Reseller Report Drop Down
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement resellerReportSectionDropdown;
	
	//2. Sales Graph
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement salesGraphPageLink;
	
	//3. Reseller's Sold PIN
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement resellerssoldPINPageLink;
	
	//4. Reseller's total subscription
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement resellerstotalPageLink;
	
	//5. Reseller4 daily sales
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement reseller4dailysalesPageLink;
	
	//6. Reseller4 PIN Analysis
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement reseller4PINAnalysisPageLink;
	
	//7. Reseller Daily Bal History
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement resellerDailyBalHistoryPageLink;
	
	
	public ResellerReportSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Reseller Report Drop Down
	public ResellerReportSectionLinks clickOnIPManagementDropDownLink() {
		resellerReportSectionDropdown.click();
		return new ResellerReportSectionLinks();
	}
	//02. Click on Sales Graph page Link
	public ResellerReportSectionLinks clickOnIPListLink() {
		salesGraphPageLink.click();
		return new ResellerReportSectionLinks();
	}
	
	//03. Click on Reseller's total subscriptionpage Link
	public ResellerReportSectionLinks clickOnIPBundleLink() {
		resellerssoldPINPageLink.click();
		return new ResellerReportSectionLinks();
	}
	
	//04. Click on Reseller4 daily sales page Link
	public ResellerReportSectionLinks clickOnAssigntoBatchLink() {
		resellerstotalPageLink.click();
		return new ResellerReportSectionLinks();
	}
	//05. Click on Reseller4 PIN Analysis page Link
	public ResellerReportSectionLinks clickOnNewBlockRecordLink() {
		reseller4dailysalesPageLink.click();
		return new ResellerReportSectionLinks();
	}
	
	//06. Click on IP Block History List page Link
	public ResellerReportSectionLinks clickOnIPBlockHistoryLink() {
		reseller4PINAnalysisPageLink.click();
		return new ResellerReportSectionLinks();
	}
	
	//07. Click on Reseller Daily Bal History Report page Link
	public ResellerReportSectionLinks clickOnServerLockSchedulesPlanLink() {
		resellerDailyBalHistoryPageLink.click();
		return new ResellerReportSectionLinks();
	}
	
	
}
