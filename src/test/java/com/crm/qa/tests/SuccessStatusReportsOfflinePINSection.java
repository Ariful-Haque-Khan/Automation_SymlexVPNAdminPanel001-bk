/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.crm.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.admin.qa.pages.ReportsOfflinePINSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusReportsOfflinePINSection extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ReportsOfflinePINSectionLinks reportsOfflinePINSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusReportsOfflinePINSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check PIN Subscription Page Link is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestPINSubscriptionPageLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openPINSubscriptionLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Hourly Subscription Search Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestHourlyActivePinsReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openHourlySubscriptionSearchLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check Hourly Subscription Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestHourlySubscriptionsReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openHourlySubscriptionLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 04. Check Individual Sold PINs Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestIndividualSoldPINsReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openIndividualSoldPINsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 05. Check Reseller PIN Login Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestResellerPINLoginReportReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openResellerPINLoginReportLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 06. Check Reseller PIN Login Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestPackageWiseSubscriptionReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openPackageWiseSubscriptionLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 07. Check  Return PINs Report Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestReturnPINsReportReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openReturnPINsReportLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 08. Check  Reseller Wise Sold PIN Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestResellerWiseSoldPINReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openResellerWiseSoldPINLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 09. Check Reset PINs Report Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestResetPINsReportReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openResetPINsReportLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 10. Check Reseller's Total Active Subscription Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestResellersTotalActiveSubscriptionReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openResellerTotalActiveSubscriptionLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 11. Check Reseller4 Daily Sales Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestReseller4DailySalesLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openReseller4DailySalesLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 12. Check Reseller4 PIN Analysis Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestReseller4PINAnalysisReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openReseller4PINAnalysisLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 13. Check Reseller Daily BAL History Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestResellerDailyBALHistoryReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openResellerDailyBALHistoryLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 14. Check Symlex PIN sales Summary By Reseller Report Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestSymlexPINsalesSummaryByResellerReportLink() throws IOException {
		reportsOfflinePINSectionLinks = loginPage.loginReportsOfflinePINSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		reportsOfflinePINSectionLinks.openSymlexPINsalesSummaryByResellerLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}

}
