/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.admin.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.pages.PageLinks;
import com.admin.qa.pages.ResellerandPINPageLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PageLinks pageLinks;
	ResellerandPINPageLinks resellerandPINPageLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	@Ignore
	@Test(priority=1)
	public void loginTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks = pageLinks.clickOnResellerPINLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 82. check mail address link is okay and return http status 200! */
	@Ignore
	@Test(priority=2)
	public void MailAddressLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks = pageLinks.clickOnMailAddressLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 83. check mail list page is okay and return http status 200! */
	@Ignore
	@Test(priority=3)
	public void MailListLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickOnMailAddressLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnMailListLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 84. check reseller mail list page is okay and return http status 200! */
	@Ignore
	@Test(priority=4)
	public void ResellersMailListLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickOnMailAddressLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnResellersMailListLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. check SSL Commerz Tnx list page is okay and return http status 200! */
	@Ignore
	@Test(priority=4)
	public void SSLCommerzTnxListLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks = pageLinks.clickOnSSLCommerzTnxLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 81. check Latest Success Transaction page is okay and return http status 200! */
	
	@Ignore
	@Test(priority=4)
	public void LatestSuccessTnxLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickOnSSLCommerzTnxLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnLatestSuccessTnxLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	
	/* 77. check Receipt Report page is okay and return http status 200! */
	@Ignore
	@Test(priority=4)
	public void ReceiptReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickOnPaymentndRechargeReportLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnReceiptReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 78. Check Recharged Report page is okay and return http status 200! */
	@Ignore
	@Test(priority=4)
	public void RechargedReporttLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickOnPaymentndRechargeReportLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnRechargedReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 79. Check Balance Report page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void BalanceReporttLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickOnPaymentndRechargeReportLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnBalanceReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Sales Graph page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void SalesGraphtLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickResellerReportLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickSalesGraphLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Reseller's Sold Pin page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ResellerSoldPinLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickResellerReportLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickResellerSoldPINLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Reseller's Total Subscription Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ResellerTotalSubscriptionLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickResellerReportLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickResellerTotalSubscriptionLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Reseller4 Daily Sales Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void Reseller4DailySalesLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickResellerReportLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickReseller4DailySalesLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Reseller4 PIN Analysis Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void Reseller4PINAnalysisLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickResellerReportLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnReseller4PINAnalysisLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Reseller Daily Balance History Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ResellerDailyBalanceHistoryLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickResellerReportLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnResellerDailyBalanceHistoryLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Hourly Server Connection Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void HourlyServerConnectionLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickServerConnectionLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickHourlyServerConnectionLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Hourly Max Connections Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void HourlyMaxConnectionsLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickServerConnectionLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickHourlyMaxConnectionsLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Server Connection Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ServerConnectionLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickServerConnectionLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clicksServerConnectionLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check PIN Subscription Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void PINSubscriptionReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickPINSubscriptionReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Hourly Subscription Search Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void HourlySubscriptionSearchReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickHourlySubscriptionSearchReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Hourly Subscription Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void HourlySubscriptionReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickHourlySubscriptionReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Online Transaction PIN Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void OnlineTransactionPINReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnlineTransactionPINReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Individual Sold PINs Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void IndividualSoldPINsReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickIndividualSoldPINsReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Reseller Pin Login Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ResellerPinLoginReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickResellerPinLoginReportReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check YallaVPN Subscription Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void YallaVPNSubscriptionReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickYallaVPNSubscriptionReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Package Wise Subscription Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void PackageWiseSubscriptionReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickPackageWiseSubscriptionLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check User Log Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void UserLogReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickUserLogReportLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Online Payment Subscription Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void OnlinePaymentSubscriptionReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnlinepaymentSubscriptionLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Free Sign Up PINS Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void FreeSignUpPINSReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickFreeSignUpPINStLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Online Sign Up PINS Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void OnlineSignUpPINSReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickOnlineSignUpPINSLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Country Wise Online PINS Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void CountryWiseOnlinePINSReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		pageLinks = pageLinks.clickCountryWiseOnlinePINSLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check iOS Payment Log Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void iOSPaymentLogReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickiOSPaymentLogLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Return PIN Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ReturnPINReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickReturnPINReportLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Reset PIN Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ResetPINReporttLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickResetPINReportLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Campaign Sale Report Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void CampaignSaleReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPINReportsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickCampaignSaleReportLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Profile Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ProfileReportLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickVPNSettingsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickProfileLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Admin Users Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void AdminUserstLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickVPNSettingsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAdminUsersLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Application Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ApplicationLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickVPNSettingsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickApplicationLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Campaign List Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void CampaignListLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickCampaignsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickCampaignListLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Add New Campaign Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void AddNewCampaignLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickCampaignsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAddNewCampaignLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Affiliator List Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void AffiliatorListLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickCampaignsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAffiliatorListLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Affiliator Withdraw Tnx Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void AffiliatorWithdrawTnxLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickCampaignsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAffiliatorWithdrawTnxLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check APP List Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void APPListLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPushManagementLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAffiliatorPaymantGatewaysLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Push Automation Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void PushAutomationLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPushManagementLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAffiliatorPaymantGatewaysLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Send Push Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void SendPushLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPushManagementLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAffiliatorPaymantGatewaysLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Pending Push Request Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void PendingPushRequestLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickCampaignsLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAffiliatorPaymantGatewaysLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Push Templates Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void PushTemplatesLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPushManagementLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAffiliatorPaymantGatewaysLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check News For Reseller Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void NewsForResellerLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPushManagementLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickAffiliatorPaymantGatewaysLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 80. Check Notice For Users Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void NoticeForUsersLinkTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		pageLinks.clickPushManagementLink(); // depend on mail address(82) parent drop down.
		
		pageLinks.clickNoticeForUsersLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	
	/* 80. Check Notice For Users Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void ResellerDDLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		//pageLinks.clickNoticeForUsersLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
