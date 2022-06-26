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

	
	/* 03. Check Resellers Mail List Link Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestOnlinePinsYallavpnLink() throws IOException {
		onlinePINReportSuccessStatusSectionLinks = loginPage.loginOnlinePINReportSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		onlinePINReportSuccessStatusSectionLinks.clickOnOnlinePinsYallavpnLink();
		
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
	
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
