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

import com.admin.qa.pages.ApplicationSectionLinks;
import com.admin.qa.pages.MailAddressSectionLinks;
import com.admin.qa.pages.RateSectionLinks;
import com.admin.qa.pages.ResellerPanelSectionLinks;
import com.admin.qa.pages.ResellerSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforApplicationSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	ApplicationSectionLinks applicationSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforApplicationSection() {
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
	public void TestApplicationSettingsLink() throws IOException {
		applicationSectionLinks = loginPage.loginApplicationSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		applicationSectionLinks.openApplicationSettingsLink();
		
		String title;
		title = applicationSectionLinks.getTextfromApplicationSetting();
	    Assert.assertEquals(title, "Application Settings");
	}
	
	/* 02. Check Add Form Reseller Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestProfileInfoLink() throws IOException {
		applicationSectionLinks = loginPage.loginApplicationSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		applicationSectionLinks.openProfileInfoLinks();
		String title;
		title = applicationSectionLinks.getTextfromProfileInfo();
	    Assert.assertEquals(title, "Profile Information");
	}
	
	/* 03. Check Other Admin Panel Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestOtherAdminPanelLink() throws IOException {
		applicationSectionLinks = loginPage.loginApplicationSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		applicationSectionLinks.openOtherAdminPanelListLinks();
		String title;
		title = applicationSectionLinks.getTextfromOtherAdminPanel();
	    Assert.assertEquals(title, "Admin Panel List");
	}
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
