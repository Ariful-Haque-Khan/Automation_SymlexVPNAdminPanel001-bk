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

import com.admin.qa.pages.SuccessStatusServerConnectionSection;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforServerConnectionSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	SuccessStatusServerConnectionSection successStatusServerConnectionSection;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforServerConnectionSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check  Hourly Server Connection Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestHourlyServerConnectionLink() throws IOException {
		successStatusServerConnectionSection = loginPage.SuccessStatusServerConnectionSectionLogin(props.getProperty("username"),props.getProperty("password"));
		
		successStatusServerConnectionSection.openHourlyServerConnectionReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Hourly Max Connection Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestHourlyMaxConnectionLink() throws IOException {
		successStatusServerConnectionSection = loginPage.SuccessStatusServerConnectionSectionLogin(props.getProperty("username"),props.getProperty("password"));
		
		successStatusServerConnectionSection.openHourlyMaxConnectionLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check  Server Wise Connection Page is okay and return http status 200! */
	
	@Test(priority=3)
	public void TestServerWiseConnectionLink() throws IOException {
		successStatusServerConnectionSection = loginPage.SuccessStatusServerConnectionSectionLogin(props.getProperty("username"),props.getProperty("password"));
		
		successStatusServerConnectionSection.openServerWiseConnection();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 04. Check User Session Report Page is okay and return http status 200! */
	
	@Test(priority=4)
	public void TestUserSessionReportLink() throws IOException {
		successStatusServerConnectionSection = loginPage.SuccessStatusServerConnectionSectionLogin(props.getProperty("username"),props.getProperty("password"));
		
		successStatusServerConnectionSection.openUserSessionReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 05. Check User Session Details Report Page is okay and return http status 200! */
	
	@Test(priority=5)
	public void TestUserSessionDetailsReportLink() throws IOException {
		successStatusServerConnectionSection = loginPage.SuccessStatusServerConnectionSectionLogin(props.getProperty("username"),props.getProperty("password"));
		
		successStatusServerConnectionSection.openSessionDetailsReport();
		
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
