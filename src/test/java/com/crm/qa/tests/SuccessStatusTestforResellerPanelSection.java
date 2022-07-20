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

import com.admin.qa.pages.MailAddressSectionLinks;
import com.admin.qa.pages.RateSectionLinks;
import com.admin.qa.pages.ResellerPanelSectionLinks;
import com.admin.qa.pages.ResellerSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforResellerPanelSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	ResellerPanelSectionLinks resellerPanelSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforResellerPanelSection() {
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
		resellerPanelSectionLinks = loginPage.loginResellerPanelSectionLinksSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		resellerPanelSectionLinks.openindexLink();
		
		String title;
		title = resellerPanelSectionLinks.getTextfromResellerPanelList();
	    Assert.assertEquals(title, "Resellers Customized Panel List");
	}
	
	/* 02. Check Add Form Reseller Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestAddFormRateLink() throws IOException {
		resellerPanelSectionLinks = loginPage.loginResellerPanelSectionLinksSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		resellerPanelSectionLinks.openAddFormLinks();
		String title;
		title = resellerPanelSectionLinks.getTextfromAddNewResellerPanel();
	    Assert.assertEquals(title, "New Customize Reseller Panel  x");
	}
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
