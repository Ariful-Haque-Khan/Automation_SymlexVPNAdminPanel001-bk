/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/
package com.admin.qa.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PageLinks extends TestBase{

	//Logout
	@FindBy(xpath="/html/body/div[2]/header/nav/div/ul/li[2]/a")
	WebElement logout;
	
	//1. Reseller & PIN
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement resellerPINDropdown;
	
	//2. Reseller
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement resellerListPageLink;
	
	//3. Single PIN
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement singlePINPageLink;
	
	//4. PIN Batch
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement pinBatchPageLink;
	
	//5. Add PIN Validity
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement addPINValidityPageLink;
	
	//6. Reseller Panel Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement resellerPanelListsListPageLink;
	
	//7. All Reseller
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement allResellerPageLink;
	
	//8. Online PIN Activation
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement onlinePINActivationPageLink;
	
	//9. Online PIN Activation 2
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement onlinePINActivation2tPageLink;
	
	//10. Online PIN Migration
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement onlinePINMigrationListPageLink;
	
	//11. Redcheck Pins
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement redcheckPinstPageLink;
	
	//12. Reseller Connected Users
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement  resellerConnectedUsersPageLink;
	
	//13. Device Wise Reseller PINs
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement deviceWiseResellerPINsListPageLink;
	
	//14. Suspicious Block PINs
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement suspiciousBlockPINsPageLink;
	
	//15. Return Pin Request
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement returnPinRequestPageLink;
	
	//16. Rates Section
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement rateSectionPageLink;
	
	//17. Add New Rate Plan
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement addNewRatePlanPageLink;
	
	//18. Rate Plan
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement ratePlanPageLink;
	
	//19. IP Management
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement ipManagementPageLink;
	
	//20. IP List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement ipListPageLink;
	
	//21. IP Bundle
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement ipBundlePageLink;
	
	//22. Assign to Batch
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement assigntoBatchPageLink;
	
	//23. New Block Record
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement newBlockRecordPageLink;
	
	//24. IP Block History
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement ipBlockHistoryPageLink;
	
	//25. Server Lock Schedules
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement serverLockSchedulesPageLink;
	
	//26. VPN Server
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement vpnServernPageLink;
	
	//27. Server List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement serverListPageLink;
	
	//28. Add VPN Server
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement addVPNServerPageLink;
	
	//29. Push Management
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement pushManagementPageLink;
	
	//30. APP List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement appListPageLink;
	
	//31. Push Automation
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement  pushAutomationPageLink;
	
	//32. Send Push
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement sendPushPageLink;
	
	//33. Pending Push Request
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement pendingPushRequestPageLink;
	
	//34. Push Templates
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement pushTemplatesPageLink;
	
	//35. News For Reseller
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement newsForResellerPageLink;
	
	//36. Notice For Users
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement noticeForUsersPageLink;
	
	//37. Campaigns
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement campaignsPageLink;
	
	//38. Campaign List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement campaignListPageLink;
	
	//39. Add New Campaign
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement addNewCampaignPageLink;
	
	//40. Affiliator List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement affiliatorListPageLink;
	
	//41. Affiliator Withdraw Tnx
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement affiliatorWithdrawTnxPageLink;
	
	//42. Affiliator Paymant Gateways
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement affiliatorPaymantGatewaysPageLink;
	
	//43. VPN Settings
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement vpnSettingsPageLink;
	
	//44. Profile
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement ProfilePageLink;
		
	//45. Admin Users
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement adminUsersPageLink;
		
	//46. Application
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement ApplicationLink;
		
	//47. PIN Reports
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement pinReportsPageLink;
	
	//48. PIN Subscription
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement pinSubscriptionPageLink;
	
	//49. Hourly Subscription
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement hourlySubscriptionPageLink;
	
	//50. Hourly Subscription Search
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement hourlySubscriptionSearchPageLink;
	
	//51. Online Transaction (PIN)
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement onlineTransactionPINPageLink;
		
	//52. Individual Sold PINs
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement individualSoldPINsPageLink;
		
	//53. Reseller Pin Login Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement ResellerPinLoginReportPageLink;
		
	//54. YallaVPN Subscrption
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement yallaVPNSubscrptionPageLink;
		
	//55.Package Wise Subscription
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement packageWiseSubscriptionPageLink;
		
	//56. User Log
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement userLogPageLink;
		
	//57. Online Payment Subscription Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement onlinePaymentSubscriptionReportPageLink;
		
	//58. Free Sign Up PINS Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement freeSignUpPINSReportPageLink;
		
	//59. Online Sign Up PINS
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement onlineSignUpPINSPageLink;
		
	//60. Country Wise Online PINS
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement countryWiseOnlinePINSPageLink;
		
	//61. iOS Payment Log
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement iOSPaymentLogPageLink;
		
	//62. Return PIN Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement returnPINReportPageLink;
		
	//63. Hourly Server Connection
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement hourlyServerConnectionPageLink;
		
	//64. Reset PIN Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement resetPINReportPageLink;
		
	//65. Campaign Sale Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement campaignSaleReportPageLink;
		
	//66. Server Connection
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement serverConnectionPageLink;
		
	//67. Hourly Max Connections
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement hourlyMaxConnectionsPageLink;
		
	//68. Server Connection
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement sserverConnectionPageLink;
		
	//69. Reseller Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[14]/a")
	WebElement resellerReportPageLink;
		
	//70. Sales Graph
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[14]/ul/li[1]/a")
	WebElement salesGraphPageLink;
		
	//71. Reseller's Sold PIN
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[14]/ul/li[2]/a")
	WebElement resellersSoldPINPageLink;
		
	//72. Reseller's total subscription
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[14]/ul/li[3]/a")
	WebElement resellerstotalsunscriptionPageLink;
		
	//73. Reseller4 daily sales
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[14]/ul/li[4]/a")
	WebElement reseller4dailysalesPageLink;
		
	//74. Reseller4 PIN Analysis
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[14]/ul/li[5]/a")
	WebElement reseller4PINAnalysisPageLink;
		
	//75. Reseller Daily Balance History
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[14]/ul/li[6]/a")
	WebElement resellerDailyBalanceHistoryPageLink;
	
	//76. Payment & Recharge
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[15]/a")
	WebElement paymentAndRechargePageLink;
			
	//77. Receipt Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[15]/ul/li[1]")
	WebElement receiptReportPageLink;
			
	//78. Recharged Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[15]/ul/li[2]")
	WebElement rechargedReportPageLink;
	
	//79. Balance Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[15]/ul/li[3]")
	WebElement balanceReortPageLink;
			
	//80. SSL Commerz Tnx
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[16]/a")
	WebElement sslCommerzTnxPageLink;
	
	//81. Latest Success Tnx
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[16]/ul/li/a")
	WebElement latestSuccessTnxPageLink;
			
	//82. Mail Address
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[17]/a")
	WebElement mailAddressPageLink;
	
	//83. Mail List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[17]/ul/li[1]/a")
	WebElement mailListPageLink;
	
	//84. Resellers mail List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[17]/ul/li[2]/a")
	WebElement resellersmailListPageLink;
	
	
	public PageLinks(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public PageLinks clickOnResellerPINLink() {
		resellerListPageLink.click();
		return new PageLinks();
	}
	
	//Logout
	public PageLinks Logout() {
		logout.click();
		return new PageLinks();
	}
	
	//84. Resellers mail List
	public PageLinks clickOnResellersMailListLink() {
		resellersmailListPageLink.click();
		return new PageLinks();
	}
	
	//83. Mail List
	public PageLinks clickOnMailListLink() {
		mailListPageLink.click();
		return new PageLinks();
	}
	
	//82. Mail Address
	public PageLinks clickOnMailAddressLink() {
		mailAddressPageLink.click();
		return new PageLinks();
	}
	//81. Latest Success Tnx
	public PageLinks clickOnLatestSuccessTnxLink() {
		latestSuccessTnxPageLink.click();
		return new PageLinks();
	}
	
	//80. SSL Commerz Tnx
	public PageLinks clickOnSSLCommerzTnxLink() {
		sslCommerzTnxPageLink.click();
		return new PageLinks();
	}
	
	//79. Balance Report
	public PageLinks clickOnBalanceReportLink() {
		balanceReortPageLink.click();
		return new PageLinks();
	}
	
	//78. Recharged Report
	public PageLinks clickOnRechargedReportLink() {
		rechargedReportPageLink.click();
		return new PageLinks();
	}
	
	//77. Receipt Report
	public PageLinks clickOnReceiptReportLink() {
		receiptReportPageLink.click();
		return new PageLinks();
	}
	
	//76. Payment & Recharge
	public PageLinks clickOnPaymentndRechargeReportLink() {
		paymentAndRechargePageLink.click();
		return new PageLinks();
	}
	
	//75. Reseller Daily Balance History
	public PageLinks clickOnResellerDailyBalanceHistoryLink() {
		resellerDailyBalanceHistoryPageLink.click();
		return new PageLinks();
	}
	
	//74. Reseller4 PIN Analysis
	public PageLinks clickOnReseller4PINAnalysisLink() {
		reseller4PINAnalysisPageLink.click();
		return new PageLinks();
	}
	
	//73. Reseller4 Daily Sales
	public PageLinks clickReseller4DailySalesLink() {
		reseller4dailysalesPageLink.click();
		return new PageLinks();
	}
	
	//72. Reseller's Total Subscription
	public PageLinks clickResellerTotalSubscriptionLink() {
		resellerstotalsunscriptionPageLink.click();
		return new PageLinks();
	}
	
	//71. Reseller's Sold PIN
	public PageLinks clickResellerSoldPINLink() {
		resellersSoldPINPageLink.click();
		return new PageLinks();
	}
	
	//70. Sales Graph
	public PageLinks clickSalesGraphLink() {
		salesGraphPageLink.click();
		return new PageLinks();
	}
	
	//69. Reseller Report
	public PageLinks clickResellerReportLink() {
		resellerReportPageLink.click();
		return new PageLinks();
	}
	
}
