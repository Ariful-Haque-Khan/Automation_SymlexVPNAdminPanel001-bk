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

import com.admin.qa.pages.IPManagementSectionLinks;
import com.admin.qa.pages.PageLinks;
import com.admin.qa.pages.RateSectionPageLinks;
import com.admin.qa.pages.ResellerandPINPageLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforIPManagement extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PageLinks pageLinks;
	ResellerandPINPageLinks resellerandPINPageLinks;
	RateSectionPageLinks rateSectionPageLinks;
	IPManagementSectionLinks ipManagementSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforIPManagement() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 02. Check IP List Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void IPListTest() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnIPListLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check IP Bundle Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void IPBundleTest() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnIPBundleLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 04. Check Assign to Batch Page is okay and return http status 200! */
	
	@Test(priority=3)
	public void AssigntoBatchPageTest() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnAssigntoBatchLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 05. Check New Block Record Page is okay and return http status 200! */
	
	@Test(priority=4)
	public void NewBlockRecordTest() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnNewBlockRecordLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 06. Check IP Block History Page is okay and return http status 200! */
	
	@Test(priority=6)
	public void IPBlockHistoryTest() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnIPBlockHistoryLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 07. Check Server Lock Schedules Page is okay and return http status 200! */
	
	@Test(priority=7)
	public void ServerLockSchedulesTest() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnServerLockSchedulesPlanLink();
		
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
