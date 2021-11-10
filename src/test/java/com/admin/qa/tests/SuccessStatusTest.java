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
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PageLinks pageLinks;
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
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
