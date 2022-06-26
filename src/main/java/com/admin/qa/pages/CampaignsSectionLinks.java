package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CampaignsSectionLinks extends TestBase{
	
	
	//1. Campaign Drop Down For Previously Used
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/a")
	WebElement campaignDropDownLink;
	
	public CampaignsSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Campaign Drop Down For Previously Used
	public CampaignsSectionLinks clickOnCampaignDropDownLink() {
		campaignDropDownLink.click();
		return new CampaignsSectionLinks();
	}
	
	//02. Open URL of Campaign List Link For Previously Used
	public CampaignsSectionLinks clickOnCampaignListLink() {
		driver.get(props.getProperty("url")+"campaign/campaignList");
		return new CampaignsSectionLinks();
	}
	
	//03. Open URL of New Campaign page Link
	public CampaignsSectionLinks clickOnNewCampaignLink() {
		driver.get(props.getProperty("url")+"campaign/addCampaign");
		return new CampaignsSectionLinks();
	}
	
	//04. Open URL of Affiliator List page Link
	public CampaignsSectionLinks clickOnAffiliatorListpageLink() {
		driver.get(props.getProperty("url")+"campaign/affiliatorList");
		return new CampaignsSectionLinks();
	}
	//05. Open URL of Affiliator Withdraw Tnx page Link
	public CampaignsSectionLinks clickOnAffiliatorWithdrawTnxLink() {
		driver.get(props.getProperty("url")+"campaign/affiliatorWithdrawTnx");
		return new CampaignsSectionLinks();
	}
	
	//06. Open URL of Affiliator Payment Gateways page Link
	public CampaignsSectionLinks clickOnAffiliatorPaymentGatewaysLink() {
		driver.get(props.getProperty("url")+"campaign/paymentGateways");
		return new CampaignsSectionLinks();
	}
	
	//07. Open URL of  Afiliator Requests List page Link
	public CampaignsSectionLinks clickOnAfiliatorRequestsLink() {
		driver.get(props.getProperty("url")+"campaign/affiliatorRequests");
		return new CampaignsSectionLinks();
	}
}
