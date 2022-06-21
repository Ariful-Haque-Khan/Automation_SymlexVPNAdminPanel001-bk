package com.admin.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CampaignsSectionLinks extends TestBase{
	
	
	//1. Campaign Drop Down
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/a")
	WebElement campaignDropDownLink;
	
	//2. Campaign List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/ul/li[1]/a")
	WebElement campaignListPageLink;
	
	//3. New Campaign
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/ul/li[2]/a")
	WebElement newCampaignPageLink;
	
	//4. Affiliator List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/ul/li[3]/a")
	WebElement affiliatorListPageLink;
	
	//5. Affiliator Withdraw Tnx
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/ul/li[4]/a")
	WebElement affiliatorWithdrawTnxPageLink;
	
	//6. Affiliator Payment Gateways
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/ul/li[5]/a")
	WebElement affiliatorPaymentGatewaysPageLink;
	
	//7. Afiliator Requests
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/ul/li[6]/a")
	WebElement affiliatorRequestsPageLink;
	
	//8. Referral Withdraw Tnx
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/ul/li[7]/a")
	WebElement refferalWithdrawTnxPageLink;
	
	
	public CampaignsSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01xxx. Click on Campaign Drop Down
	public CampaignsSectionLinks openCampaignDropDownLink() {
		//WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost/vpnadmin/index.php/campaign/campaignList");
		//campaignDropDownLink.click();
		return new CampaignsSectionLinks();
	}
	
	//01. Click on Campaign Drop Down
	public CampaignsSectionLinks clickOnCampaignDropDownLink() {
		campaignDropDownLink.click();
		return new CampaignsSectionLinks();
	}
	//02. Open Campaign List Link
	public CampaignsSectionLinks clickOnCampaignListLink() {
		driver.get("http://localhost/vpnadmin/index.php/campaign/campaignList");
		//campaignListPageLink.click();
		return new CampaignsSectionLinks();
	}
	
	//03. Click on New Campaign page Link
	public CampaignsSectionLinks clickOnNewCampaignLink() {
		driver.get("http://localhost/vpnadmin/index.php/campaign/addCampaign");
		//newCampaignPageLink.click();
		return new CampaignsSectionLinks();
	}
	
	//04. Click on Affiliator List page Link
	public CampaignsSectionLinks clickOnAffiliatorListpageLink() {
		driver.get("http://localhost/vpnadmin/index.php/campaign/affiliatorList");
		//affiliatorListPageLink.click();
		return new CampaignsSectionLinks();
	}
	//05. Click on Affiliator Withdraw Tnx page Link
	public CampaignsSectionLinks clickOnAffiliatorWithdrawTnxLink() {
		driver.get("http://localhost/vpnadmin/index.php/campaign/affiliatorWithdrawTnx");
		//affiliatorWithdrawTnxPageLink.click();
		return new CampaignsSectionLinks();
	}
	
	//06. Click on Affiliator Payment Gateways page Link
	public CampaignsSectionLinks clickOnAffiliatorPaymentGatewaysLink() {
		driver.get("http://localhost/vpnadmin/index.php/campaign/paymentGateways");
		//affiliatorPaymentGatewaysPageLink.click();
		return new CampaignsSectionLinks();
	}
	
	//07. Click on Afiliator Requests List page Link
	public CampaignsSectionLinks clickOnAfiliatorRequestsLink() {
		driver.get("http://localhost/vpnadmin/index.php/campaign/affiliatorRequests");
		//affiliatorRequestsPageLink.click();
		return new CampaignsSectionLinks();
	}
	
	//08. Click on Referral Withdraw Tnx page Link
	public CampaignsSectionLinks clickOnReferralWithdrawTnxLink() {
		driver.get("http://localhost/vpnadmin/index.php/campaign/referralWithdrawTnx");
		//refferalWithdrawTnxPageLink.click();
		return new CampaignsSectionLinks();
	}
}
