package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PaymentandRechargeSectionLinks extends TestBase{
	
	
	//1. Payment & Recharge
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement paymentandRechargeDropdown;
	
	//2. Receipt Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement receiptReportPageLink;
	
	//3. Recharged Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement rechargedReportPageLink;
	
	//4. Balance Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement balanceReportPageLink;
	
	
	
	public PaymentandRechargeSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Payment & Recharge Drop Down
	public PaymentandRechargeSectionLinks clickOnIPManagementDropDownLink() {
		paymentandRechargeDropdown.click();
		return new PaymentandRechargeSectionLinks();
	}
	//02. Click on Receipt Report page Link
	public PaymentandRechargeSectionLinks clickOnIPListLink() {
		receiptReportPageLink.click();
		return new PaymentandRechargeSectionLinks();
	}
	
	//03. Click on Recharged Report page Link
	public PaymentandRechargeSectionLinks clickOnIPBundleLink() {
		rechargedReportPageLink.click();
		return new PaymentandRechargeSectionLinks();
	}
	
	//04. Click on Balance Report page Link
	public PaymentandRechargeSectionLinks clickOnAssigntoBatchLink() {
		balanceReportPageLink.click();
		return new PaymentandRechargeSectionLinks();
	}
	
	
	
}
