/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.admin.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.admin.qa.pages.CampaignsSectionLinks;
import com.admin.qa.pages.PageLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforCampaignSection extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PageLinks pageLinks;
	CampaignsSectionLinks campaignsSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforCampaignSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	/* 01. Check Campaign List is okay and return http status 200! */
	
	@Test(priority=1)
	public void CampaignListLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginPagelinkinCampaignLink(props.getProperty("username"),props.getProperty("password"));
		//campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		campaignsSectionLinks.clickOnCampaignListLink();
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check New Campaign Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void NewCampaignLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginPagelinkinCampaignLink(props.getProperty("username"),props.getProperty("password"));
		campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnNewCampaignLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check Affiliator List is okay and return http status 200! */
	
	@Test(priority=3)
	public void AffiliatorListLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginPagelinkinCampaignLink(props.getProperty("username"),props.getProperty("password"));
		campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnAffiliatorListpageLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 04. Check Affiliator Withdraw Transaction Page is okay and return http status 200! */
	
	@Test(priority=4)
	public void AffiliatorWithdrawTnxLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginPagelinkinCampaignLink(props.getProperty("username"),props.getProperty("password"));
		campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnAffiliatorWithdrawTnxLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 05. Check Affiliator Payment Gateways Page is okay and return http status 200! */
	
	@Test(priority=5)
	public void AffiliatorPaymentGatewaysLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginPagelinkinCampaignLink(props.getProperty("username"),props.getProperty("password"));
		campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnAffiliatorPaymentGatewaysLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 06. Check Affiliator Requests Page is okay and return http status 200! */
	
	@Test(priority=6)
	public void AffiliatorRequestsLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginPagelinkinCampaignLink(props.getProperty("username"),props.getProperty("password"));
		campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnAfiliatorRequestsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	
	/* 07. Check Referral Withdraw Transaction Page is okay and return http status 200! */
	
	@Test(priority=9)
	public void RefferalWithdrawTnxLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginPagelinkinCampaignLink(props.getProperty("username"),props.getProperty("password"));
		campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnReferralWithdrawTnxLink();
		
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
