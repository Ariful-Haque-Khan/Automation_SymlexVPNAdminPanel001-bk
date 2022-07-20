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
import com.admin.qa.pages.ResellerSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforRateSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	RateSectionLinks rateSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforRateSection() {
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
		rateSectionLinks = loginPage.loginRateSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		rateSectionLinks.openindexLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Add Form Reseller Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestAddFormRateLink() throws IOException {
		rateSectionLinks = loginPage.loginRateSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		rateSectionLinks.openAddFormLinks();
		
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
