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

import com.admin.qa.pages.MailAddressSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforMailReport extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MailAddressSectionLinks mailAddressSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforMailReport() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Mail List Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestMailListLink() throws IOException {
		mailAddressSectionLinks = loginPage.loginMailAddressSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		mailAddressSectionLinks.opennMailAddress();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Resellers Mail List Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestResellersMailListLink() throws IOException {
		mailAddressSectionLinks = loginPage.loginMailAddressSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		mailAddressSectionLinks.openResellerMailsListLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Promotional Email List Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestPromotionalEmailsListLink() throws IOException {
		mailAddressSectionLinks = loginPage.loginMailAddressSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		mailAddressSectionLinks.openPromotionalEmailListLink();
		
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
