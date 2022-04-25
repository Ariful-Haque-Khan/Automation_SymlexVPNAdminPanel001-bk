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
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a")
	WebElement resellerPINDropdown;
	
	//2. Reseller
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[1]/a")
	WebElement resellerListPageLink;
	
	//3. Single PIN
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement singlePINPageLink;
	
	//4. PIN Batch
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement pinBatchPageLink;
	
	//5. Add PIN Validity
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[4]/a")
	WebElement addPINValidityPageLink;
	
	//6. Reseller Panel Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[5]/a")
	WebElement resellerPanelListsListPageLink;
	
	//7. All Reseller
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[6]/a")
	WebElement allResellerPageLink;
	
	//8. Online PIN Activation
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[7]/a")
	WebElement onlinePINActivationPageLink;
	
	//9. Online PIN Activation 2
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[8]/a")
	WebElement onlinePINActivation2tPageLink;
	
	//10. Online PIN Migration
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[9]/a")
	WebElement onlinePINMigrationListPageLink;
	
	//11. Redcheck Pins
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[10]/a")
	WebElement redcheckPinstPageLink;
	
	//12. Reseller Connected Users
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[11]/a")
	WebElement  resellerConnectedUsersPageLink;
	
	//13. Device Wise Reseller PINs
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[12]/a")
	WebElement deviceWiseResellerPINsListPageLink;
	
	//14. Suspicious Block PINs
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[13]/a")
	WebElement suspiciousBlockPINsPageLink;
	
	//15. Return Pin Request
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[14]/a")
	WebElement returnPinRequestPageLink;
	
	//16. Rates Section
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a")
	WebElement rateSectionPageLink;
	
	//17. Add New Rate Plan
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/ul/li[1]/a")
	WebElement addNewRatePlanPageLink;
	
	//18. Rate Plan
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/ul/li[2]/a")
	WebElement ratePlanPageLink;
	
	//19. IP Management
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/a")
	WebElement ipManagementPageLink;
	
	//20. IP List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/ul/li[1]/a")
	WebElement ipListPageLink;
	
	//21. IP Bundle
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/ul/li[2]/a")
	WebElement ipBundlePageLink;
	
	//22. Assign to Batch
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/ul/li[3]/a")
	WebElement assigntoBatchPageLink;
	
	//23. New Block Record
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/ul/li[4]/a")
	WebElement newBlockRecordPageLink;
	
	//24. IP Block History
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/ul/li[5]/a")
	WebElement ipBlockHistoryPageLink;
	
	//25. Server Lock Schedules
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/ul/li[6]/a")
	WebElement serverLockSchedulesPageLink;
	
	//26. VPN Server
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[6]/a")
	WebElement vpnServernPageLink;
	
	//27. Server List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[6]/ul/li[1]")
	WebElement serverListPageLink;
	
	//28. Add VPN Server
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[6]/ul/li[2]/a")
	WebElement addVPNServerPageLink;
	
	//29. Push Management
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[7]/a")
	WebElement pushManagementPageLink;
	
	//30. APP List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[7]/ul/li[1]/a")
	WebElement appListPageLink;
	
	//31. Push Automation
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[7]/ul/li[2]/a")
	WebElement  pushAutomationPageLink;
	
	//32. Send Push
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[7]/ul/li[3]/a")
	WebElement sendPushPageLink;
	
	//33. Pending Push Request
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[7]/ul/li[4]/a")
	WebElement pendingPushRequestPageLink;
	
	//34. Push Templates
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[7]/ul/li[5]/a")
	WebElement pushTemplatesPageLink;
	
	//35. News For Reseller
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[7]/ul/li[6]/a")
	WebElement newsForResellerPageLink;
	
	//36. Notice For Users
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[7]/ul/li[7]/a")
	WebElement noticeForUsersPageLink;
	
	//37. Campaigns
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[8]/a")
	WebElement campaignsPageLink;
	
	//38. Campaign List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[8]/ul/li[1]/a")
	WebElement campaignListPageLink;
	
	//39. Add New Campaign
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[8]/ul/li[2]/a")
	WebElement addNewCampaignPageLink;
	
	//40. Affiliator List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[8]/ul/li[3]/a")
	WebElement affiliatorListPageLink;
	
	//41. Affiliator Withdraw Tnx
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[8]/ul/li[4]/a")
	WebElement affiliatorWithdrawTnxPageLink;
	
	//42. Affiliator Paymant Gateways
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[8]/ul/li[5]/a")
	WebElement affiliatorPaymantGatewaysPageLink;
	
	//42. Affiliator Request
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[8]/ul/li[6]/a")
	WebElement affiliatorRequestPageLink;
	
	//42. Referral Withdraw Tnx
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[8]/ul/li[7]/a")
	WebElement referralWithdrawTnxPageLink;
	
	//43. VPN Settings
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[9]/a")
	WebElement vpnSettingsPageLink;
	
	//44. Profile
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[9]/ul/li[1]/a")
	WebElement profilePageLink;
		
	//45. Admin Users
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[9]/ul/li[2]/a")
	WebElement adminUsersPageLink;
		
	//46. Application
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[9]/ul/li[3]/a")
	WebElement ApplicationLink;
		
	//47. PIN Reports
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/a")
	WebElement pinReportsPageLink;
	
	//48. PIN Subscription
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[1]/a")
	WebElement pinSubscriptionPageLink;
	
	//49. Hourly Subscription
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[2]/a")
	WebElement hourlySubscriptionPageLink;
	
	//50. Hourly Subscription Search
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[3]/a")
	WebElement hourlySubscriptionSearchPageLink;
	
	//51. Online Transaction (PIN)
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[4]/a")
	WebElement onlineTransactionPINPageLink;
		
	//52. Individual Sold PINs
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[5]/a")
	WebElement individualSoldPINsPageLink;
		
	//53. Reseller Pin Login Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[6]/a")
	WebElement resellerPinLoginReportPageLink;
		
	//54. YallaVPN Subscription
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[7]/a")
	WebElement yallaVPNSubscrptionPageLink;
		
	//55.Package Wise Subscription
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[8]/a")
	WebElement packageWiseSubscriptionPageLink;
		
	//56. User Log
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[9]/a")
	WebElement userLogPageLink;
		
	//57. Online Payment Subscription Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[10]/a")
	WebElement onlinePaymentSubscriptionReportPageLink;
		
	//58. Free Sign Up PINS Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[11]/a")
	WebElement freeSignUpPINSReportPageLink;
		
	//59. Online Sign Up PINS
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[12]/a")
	WebElement onlineSignUpPINSPageLink;
		
	//60. Country Wise Online PINS
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[13]/a")
	WebElement countryWiseOnlinePINSPageLink;
		
	//61. iOS Payment Log
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[14]/a")
	WebElement iOSPaymentLogPageLink;
		
	//62. Return PIN Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[15]/a")
	WebElement returnPINReportPageLink;
		
	//63. Reset PIN Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[16]/a")
	WebElement resetPINReportPageLink;
		
	//64. Campaign Sale Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[12]/ul/li[17]/a")
	WebElement campaignSaleReportPageLink;
		
	//65. Server Connection
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[13]/a")
	WebElement serverConnectionPageLink;
	
	//66. Hourly Server Connection
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[13]/ul/li[1]/a")
	WebElement hourlyServerConnectionPageLink;
		
	//67. Hourly Max Connections
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[13]/ul/li[2]/a")
	WebElement hourlyMaxConnectionsPageLink;
		
	//68. Server Connection
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[13]/ul/li[3]/a")
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
			
	//80. SSL Commerce Transaction
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[16]/a")
	WebElement sslCommerzTnxPageLink;
	
	//81. Latest Success Transaction
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
	//81. Latest Success Transaction
	public PageLinks clickOnLatestSuccessTnxLink() {
		latestSuccessTnxPageLink.click();
		return new PageLinks();
	}
	
	//80. SSL Commerce Transaction
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
	
	//68. Server Connection
	public PageLinks clicksServerConnectionLink() {
		sserverConnectionPageLink.click();
		return new PageLinks();
	}
	
	//67. Hourly Max Connections
	public PageLinks clickHourlyMaxConnectionsLink() {
		hourlyMaxConnectionsPageLink.click();
		return new PageLinks();
	}
	
	//66. Hourly Server Connection
	public PageLinks clickHourlyServerConnectionLink() {
		hourlyServerConnectionPageLink.click();
		return new PageLinks();
	}
	
	//65. Parent Server Connection
	public PageLinks clickServerConnectionLink() {
		serverConnectionPageLink.click();
		return new PageLinks();
	}
	
	//64. Campaign Sale Report
	public PageLinks clickCampaignSaleReportLink() {
		campaignSaleReportPageLink.click();
		return new PageLinks();
	}
	
	//63. Reset PIN Report
	public PageLinks clickResetPINReportLink() {
		resetPINReportPageLink.click();
		return new PageLinks();
	}
	
	//62. Return PIN Report
	public PageLinks clickReturnPINReportLink() {
		returnPINReportPageLink.click();
		return new PageLinks();
	}
	
	//61. iOS Payment Log
	public PageLinks clickiOSPaymentLogLink() {
		iOSPaymentLogPageLink.click();
		return new PageLinks();
	}
	
	//60. Country Wise Online PINS
	public PageLinks clickCountryWiseOnlinePINSLink() {
		countryWiseOnlinePINSPageLink.click();
		return new PageLinks();
	}
	
	//59. Online Sign Up PINS
	public PageLinks clickOnlineSignUpPINSLink() {
		onlineSignUpPINSPageLink.click();
		return new PageLinks();
	}
	
	//58. Free Sign Up PINS
	public PageLinks clickFreeSignUpPINStLink() {
		freeSignUpPINSReportPageLink.click();
		return new PageLinks();
	}
	
	//57. Online Payment Subscription
	public PageLinks clickOnlinepaymentSubscriptionLink() {
		onlinePaymentSubscriptionReportPageLink.click();
		return new PageLinks();
	}
	
	//56. User Log
	public PageLinks clickUserLogReportLink() {
		userLogPageLink.click();
		return new PageLinks();
	}
	
	//55. Package Wise Subscription
	public PageLinks clickPackageWiseSubscriptionLink() {
		packageWiseSubscriptionPageLink.click();
		return new PageLinks();
	}
	
	//54. YallaVPN Subscription
	public PageLinks clickYallaVPNSubscriptionReportLink() {
		yallaVPNSubscrptionPageLink.click();
		return new PageLinks();
	}
	
	//53. Reseller Pin Login Report
	public PageLinks clickResellerPinLoginReportReportLink() {
		resellerPinLoginReportPageLink.click();
		return new PageLinks();
	}
	
	//52. Individual Sold PINs
	public PageLinks clickIndividualSoldPINsReportLink() {
		individualSoldPINsPageLink.click();
		return new PageLinks();
	}
	
	//51. Online Transaction (PIN)
	public PageLinks clickOnlineTransactionPINReportLink() {
		onlineTransactionPINPageLink.click();
		return new PageLinks();
	}
	
	//50. Hourly Subscription
	public PageLinks clickHourlySubscriptionReportLink() {
		hourlySubscriptionSearchPageLink.click();
		return new PageLinks();
	}
	
	//49. Hourly Subscription Search
	public PageLinks clickHourlySubscriptionSearchReportLink() {
		hourlySubscriptionPageLink.click();
		return new PageLinks();
	}
	
	//48. PIN Subscription
	public PageLinks clickPINSubscriptionReportLink() {
		pinSubscriptionPageLink.click();
		return new PageLinks();
	}
	
	//47. PIN Reports parent drop down
	public PageLinks clickPINReportsLink() {
		pinReportsPageLink.click();
		return new PageLinks();
	}
	
	//46. Application
	public PageLinks clickApplicationLink() {
		ApplicationLink.click();
		return new PageLinks();
	}
	
	//45. Admin Users
	public PageLinks clickAdminUsersLink() {
		adminUsersPageLink.click();
		return new PageLinks();
	}
	
	//44. Profile
	public PageLinks clickProfileLink() {
		profilePageLink.click();
		return new PageLinks();
	}
	
	//43. VPN Settings parent drop down
	public PageLinks clickVPNSettingsLink() {
		vpnSettingsPageLink.click();
		return new PageLinks();
	}
	
	//42. Referral Withdraw Tnx
	public PageLinks clickReferralWithdrawTnxLink() {
		referralWithdrawTnxPageLink.click();
		return new PageLinks();
	}
	
	//42. Affiliator Paymant Gateways
	public PageLinks clickAffiliatorPaymantGatewaysLink() {
		affiliatorPaymantGatewaysPageLink.click();
		return new PageLinks();
	}
	
	//42. Affiliator Request
	public PageLinks clickAffiliatorRequestLink() {
		affiliatorRequestPageLink.click();
		return new PageLinks();
	}
	//41. Affiliator Withdraw Tnx
	public PageLinks clickAffiliatorWithdrawTnxLink() {
		affiliatorWithdrawTnxPageLink.click();
		return new PageLinks();
	}
	//40. Affiliator List
	public PageLinks clickAffiliatorListLink() {
		affiliatorListPageLink.click();
		return new PageLinks();
	}
	//39. Add New Campaign
	public PageLinks clickAddNewCampaignLink() {
		addNewCampaignPageLink.click();
		return new PageLinks();
	}
	//38. Campaign List
	public PageLinks clickCampaignListLink() {
		campaignListPageLink.click();
		return new PageLinks();
	}
	//37. Campaigns parent drop down
	public PageLinks clickCampaignsLink() {
		campaignsPageLink.click();
		return new PageLinks();
	}
	
	//36. Notice For Users
	public PageLinks clickNoticeForUsersLink() {
		noticeForUsersPageLink.click();
		return new PageLinks();
	}
	
	//35. News For Reseller
	public PageLinks clickNewsForResellerLink() {
		newsForResellerPageLink.click();
		return new PageLinks();
	}
	//34. Push Templates
	public PageLinks clickPushTemplatesLink() {
		pushTemplatesPageLink.click();
		return new PageLinks();
	}
	//33. Pending Push Request
	public PageLinks clickPendingPushRequestLink() {
		pendingPushRequestPageLink.click();
		return new PageLinks();
	}
	//32. Send Push
	public PageLinks clickSendPushLink() {
		sendPushPageLink.click();
		return new PageLinks();
	}
	//31. Push Automation
	public PageLinks clickPushAutomationLink() {
		pushAutomationPageLink.click();
		return new PageLinks();
	}
	//30. APP List
	public PageLinks clickAPPListLink() {
		appListPageLink.click();
		return new PageLinks();
	}
	
	//29. Push Management parent drop down
	public PageLinks clickPushManagementLink() {
		pushManagementPageLink.click();
		return new PageLinks();
	}
	
	//28. Add VPN Server
	public PageLinks clickAddVPNServerLink() {
		addVPNServerPageLink.click();
		return new PageLinks();
	}
	//27. Server List
	public PageLinks clickServerListLink() {
		serverListPageLink.click();
		return new PageLinks();
	}
	
	//26. VPN Server parent drop down
	public PageLinks clickVPNServerLink() {
		vpnServernPageLink.click();
		return new PageLinks();
	}
	
	//25. Server Lock Schedules
	public PageLinks clickServerLockSchedulesLink() {
		serverLockSchedulesPageLink.click();
		return new PageLinks();
	}
	
	//24. IP Block History
	public PageLinks clickIPBlockHistoryLink() {
		ipBlockHistoryPageLink.click();
		return new PageLinks();
	}
	
	//23. New Block Record
	public PageLinks clickNewBlockRecordLink() {
		newBlockRecordPageLink.click();
		return new PageLinks();
	}
	
	//22. Assign to Batch
	public PageLinks clickAssigntoBatchLink() {
		assigntoBatchPageLink.click();
		return new PageLinks();
	}
	
	//21. IP Bundle
	public PageLinks clickIPBundleLink() {
		ipBundlePageLink.click();
		return new PageLinks();
	}
	
	//20. IP List
	public PageLinks clickIPListLink() {
		ipListPageLink.click();
		return new PageLinks();
	}
	
	//19. IP Management parent drop down
	public PageLinks clickIPManagementParentDropDownLink() {
		ipManagementPageLink.click();
		return new PageLinks();
	}
	
	//18. Rate Plan
	public PageLinks clickRatePlanLink() {
		ratePlanPageLink.click();
		return new PageLinks();
	}
	
	//17. Add New Rate Plan
	public PageLinks clickAddNewRatePlanLink() {
		addNewRatePlanPageLink.click();
		return new PageLinks();
	}
	
	//16. Rates Section parent drop down
	public PageLinks clickRatesSectionParentDropDownLink() {
		rateSectionPageLink.click();
		return new PageLinks();
	}
	
	//15. Return Pin Request
	public PageLinks clickReturnPinRequestLink() {
		returnPinRequestPageLink.click();
		return new PageLinks();
	}
	//14. Suspicious Block PINs
	public PageLinks clickSuspiciousBlockPINsLink() {
		suspiciousBlockPINsPageLink.click();
		return new PageLinks();
	}
	
	//13. Device Wise Reseller PINs
	public PageLinks clickDeviceWiseResellerPINsLink() {
		deviceWiseResellerPINsListPageLink.click();
		return new PageLinks();
	}
	
	//12. Reseller Connected Users
	public PageLinks clickResellerConnectedUsersLink() {
		resellerConnectedUsersPageLink.click();
		return new PageLinks();
	}
	
	//11. Redcheck Pins
	public PageLinks clickRedcheckPinsLink() {
		redcheckPinstPageLink.click();
		return new PageLinks();
	}
	
	//10. Online PIN Migration
	public PageLinks clickOnlinePINMigrationLink() {
		onlinePINMigrationListPageLink.click();
		return new PageLinks();
	}
	
	//9. Online PIN Activation 2
	public PageLinks clickOnlinePINActivation2Link() {
		onlinePINActivation2tPageLink.click();
		return new PageLinks();
	}
	
	//8. Online PIN Activation
	public PageLinks clickOnlinePINActivationLink() {
		onlinePINActivationPageLink.click();
		return new PageLinks();
	}
	
	//7. All Reseller
	public PageLinks clickAllResellertLink() {
		allResellerPageLink.click();
		return new PageLinks();
	}
	
	//6. Reseller Panel Lists
	public PageLinks clickResellerPanelListsLink() {
		resellerPanelListsListPageLink.click();
		return new PageLinks();
	}
	
	//5. Add PIN Validity
	public PageLinks clickAddPINValidityLink() {
		addPINValidityPageLink.click();
		return new PageLinks();
	}
	
	//4. PIN Batch
	public PageLinks clickPINBatchLink() {
		pinBatchPageLink.click();
		return new PageLinks();
	}
	
	//3. Single PIN
	public PageLinks clickSinglePINLink() {
		singlePINPageLink.click();
		return new PageLinks();
	}
	
	//2. Reseller
	public PageLinks clickResellerLink() {
		resellerListPageLink.click();
		return new PageLinks();
	}
	
	//1. Reseller & PIN Parent Drop Down
	public PageLinks clickResellerPINParentDropDownLink() {
		resellerPINDropdown.click();
		return new PageLinks();
	}
}
















