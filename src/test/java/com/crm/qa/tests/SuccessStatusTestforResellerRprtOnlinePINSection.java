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
import com.admin.qa.pages.ResellerRprtOnlinePINSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforResellerRprtOnlinePINSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	ResellerRprtOnlinePINSectionLinks resellerRprtOnlinePINSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforResellerRprtOnlinePINSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Web Transaction Report of Redcard Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestAllOnlineTransactionLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerRprtOnlinePINSectionLinks.openAllOnlineTransactionReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Redcard Online Active Subscription Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestRedcardOnlineActiveSubscriptionLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		resellerRprtOnlinePINSectionLinks.openRedcardOnlineActiveSubscriptionReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check BDPlus Online Active Subscription Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestBDPlusOnlineActiveSubscriptionLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		resellerRprtOnlinePINSectionLinks.openBDPlusOnlineActiveSubscriptionReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 04. Check Keymax Online Active Subscription Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestKeymaxOnlineActiveSubscriptionLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		resellerRprtOnlinePINSectionLinks.openBDPlusOnlineActiveSubscriptionReport();
		
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
