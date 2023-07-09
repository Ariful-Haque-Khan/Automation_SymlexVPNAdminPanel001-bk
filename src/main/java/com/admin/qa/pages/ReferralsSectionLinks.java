package com.admin.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ReferralsSectionLinks extends TestBase{
	
	public ReferralsSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Referral Withdraw Transaction Link
	public ResellerReports openReferralWithdrawTransactionLink() {
		driver.get(props.getProperty("url")+"Referral/referralWithdrawTnx");
		return new ResellerReports();
	}
	
	//02. Open URL of Referral Withdraw Transaction Link
	public ResellerReports openBonusTransactionLink() {
		driver.get(props.getProperty("url")+"Referral/referralBonusTnx");
		return new ResellerReports();
	}
	
	//03. Open URL of Referral Withdraw Transaction Link
	public ResellerReports openReferCodeUserListLink() {
		driver.get(props.getProperty("url")+"Referral/referralUserList");
		return new ResellerReports();
	}
	
	//04. Open URL of Referral Bonus Summary Link
	public ResellerReports openReferralBonusSummaryLink() {
		driver.get(props.getProperty("url")+"Referral/referralBonusSummary");
		return new ResellerReports();
	}
}
