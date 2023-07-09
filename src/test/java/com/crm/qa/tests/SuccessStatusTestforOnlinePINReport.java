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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.pages.OnlinePINReportsSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforOnlinePINReport extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	OnlinePINReportsSectionLinks onlinePINReportSuccessStatusSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforOnlinePINReport() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check IP List Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestWebTransactionReportV2Link() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.clickOnWebTransactionReportV2Link();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check IP Bundle Page is okay and return http status 200! */

	@Test(priority=2)
	public void TestOnlinePinsSymlexListLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.clickOnOnlinePinsSymlexLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 04. Check IP Bundle Page is okay and return http status 200! */

	@Test(priority=2)
	public void TestFreeSignupPinReportListLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.clickOnFreeSignupPinReportLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 05. Check Resellers Mail List Link Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestOnlineSignUpPins_2Link() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.clickOnOnlineSignUpPins_2Link();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 06. Check Country Wise Online PINs Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestCountryWiseOnlinePINsLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.openCountryWiseOnlinePinsPage();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 07. Check iOS Payment log Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestiOSPaymentlogLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.openiOSPaymentLogReportPage();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 08. Check iOS Payment log Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestCampaignSalesReportLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.openCampaignSaleReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 09. Check iOS RTDN Receipt Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestiOSRTDNReceiptLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.openiOSRTDNReceiptReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 10. Check Offline Payment Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestOfflinePaymentLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.openOfflinePaymentReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 11. Check Package Wise Online Sales Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestPackageWiseOnlineSalesLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.openPackageWiseOnlineSalesReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 12. Check Package Online Silent PINs Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestOnlineSilentPINsLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		onlinePINReportSuccessStatusSectionLinks.openOnlineSilentUsersReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 13. Check Monthly Sales Summary Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestMonthlySalesSummeryLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		onlinePINReportSuccessStatusSectionLinks.openMonthlySalesSummaryReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 14. Check Daily Sales Summary Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestDailySalesSummeryLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		onlinePINReportSuccessStatusSectionLinks.openDailyOnlineSalesSummeryReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 15. Check Daily Signup Report Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestDailySignupReportLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		onlinePINReportSuccessStatusSectionLinks.openSignupPinDailyReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 16. Check Online Renew Trend Calendar Report Page is okay and return http status 200! */

	@Test(priority=1)
	public void TestOnlineRenewTrendCalendarLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		onlinePINReportSuccessStatusSectionLinks.openOnlinRenewTrendCalenderReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	@AfterMethod
	public void tearDown() {
//		pageLinks.Logout();
		super.tearDown();
	}

}
