/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.crm.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.pages.MailAddressSectionLinks;
import com.admin.qa.pages.RateSectionLinks;
import com.admin.qa.pages.ResellerPanelSectionLinks;
import com.admin.qa.pages.ResellerSectionLinks;
import com.admin.qa.pages.VPNServerSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforVPNServerSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	VPNServerSectionLinks vpnServerSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforVPNServerSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Reseller Index Link Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestindexLink() throws IOException {
		vpnServerSectionLinks = loginPage.loginResellerVPNServerSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		vpnServerSectionLinks.openindexLink();
		
		String title;
		title = vpnServerSectionLinks.getTextfromVPNServerList();
	    Assert.assertEquals(title, "VPN Server List");
	}
	
	/* 02. Check Add Form Reseller Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestAddFormRateLink() throws IOException {
		vpnServerSectionLinks = loginPage.loginResellerVPNServerSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		vpnServerSectionLinks.openAddFormLinks();
		String title;
		title = vpnServerSectionLinks.getTextfromtitleAddNewVPNServer();
	    Assert.assertEquals(title, "Add New Server");
	}
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
