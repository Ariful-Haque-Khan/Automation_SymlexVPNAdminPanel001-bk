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
import org.testng.annotations.Test;

import com.admin.qa.pages.PageLinks;
import com.admin.qa.pages.RateSectionPageLinks;
import com.admin.qa.pages.ResellerandPINPageLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforRatesSection extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PageLinks pageLinks;
	ResellerandPINPageLinks resellerandPINPageLinks;
	RateSectionPageLinks rateSectionPageLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforRatesSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Reseller Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void RateSectionDropDownTest() throws IOException {
		rateSectionPageLinks = loginPage.loginPagelinkinRateSetion(props.getProperty("username"),props.getProperty("password"));
		rateSectionPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		//resellerandPINPageLinks.clickOnResellerLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Add New Rate Plan Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void AddNewRatePlanTest() throws IOException {
		rateSectionPageLinks = loginPage.loginPagelinkinRateSetion(props.getProperty("username"),props.getProperty("password"));
		rateSectionPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		rateSectionPageLinks.clickOnAddNewRatePlanLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check Rate Plan Page is okay and return http status 200! */
	
	@Test(priority=3)
	public void RatePlanTest() throws IOException {
		rateSectionPageLinks = loginPage.loginPagelinkinRateSetion(props.getProperty("username"),props.getProperty("password"));
		rateSectionPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		rateSectionPageLinks.clickOnRatePlanLink();
		
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
