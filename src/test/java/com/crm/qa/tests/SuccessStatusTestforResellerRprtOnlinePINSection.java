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
import com.admin.qa.pages.ResellerRprtOnlinePINSectionLinks;
import com.admin.qa.pages.ResellerSectionLinks;
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
	public void TestWebTransactionReportofRedcardLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		resellerRprtOnlinePINSectionLinks.openWebTransactionReportofRedcardLink();
		
		String title;
		title = resellerRprtOnlinePINSectionLinks.getTextfromWebTransactionReportofRedcard();
	    Assert.assertEquals(title, "Redcard Online Transaction Report (PIN)");
	}
	
	/* 02. Check Online Pins Report of Redcard Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestOnlinePinsReportofRedcardLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		resellerRprtOnlinePINSectionLinks.openOnlinePinsReportofRedcardLinks();
		String title;
		title = resellerRprtOnlinePINSectionLinks.getTextfromtitleOnlinePinsReportofRedcard();
	    Assert.assertEquals(title, "Redcard Online PIN Subscription");
	}
	
	/* 03. Check Web Transaction Report of BDplus Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestWebTransactionReportofBDplusLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		resellerRprtOnlinePINSectionLinks.openWebTransactionReportBDplusLinks();
		String title;
		title = resellerRprtOnlinePINSectionLinks.getTextfromtitleWebTransactionReportBDplus();
	    Assert.assertEquals(title, "BDPlus Online Transaction Report (PIN)");
	}
	
	/* 04. Check Online Pins BDplus Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestOnlinePinsBDplusLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		resellerRprtOnlinePINSectionLinks.openOnlinePinsBDplusLink();
		String title;
		title = resellerRprtOnlinePINSectionLinks.getTextfromOnlinePinsBDplus();
	    Assert.assertEquals(title, "BDPlus Online PIN Subscription");
	}
	
	/* 05. Check Web Transaction Report of Keymax Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestWebTransactionReportofKeymaxLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		resellerRprtOnlinePINSectionLinks.openWebTransactionReportKeymax();
		String title;
		title = resellerRprtOnlinePINSectionLinks.getTextfromWebTransactionReportKeymax();
	    Assert.assertEquals(title, "Keymax Online Transaction Report (PIN)");
	}
	
	/* 06. Check Online Pins of Keymax Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestOnlinePinsofKeymaxLink() throws IOException {
		resellerRprtOnlinePINSectionLinks = loginPage.loginResellerRprtOnlinePINSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		resellerRprtOnlinePINSectionLinks.openOnlinePinsKeymaxLinks();
		String title;
		title = resellerRprtOnlinePINSectionLinks.getTextfromOnlinePinsKeymax();
	    Assert.assertEquals(title, "Keymax Online PIN Subscription");
	}
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
