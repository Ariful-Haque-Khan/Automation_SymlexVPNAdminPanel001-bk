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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.pages.PageLinks;
import com.admin.qa.pages.ResellerandPINPageLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforResellerandPIN extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PageLinks pageLinks;
	ResellerandPINPageLinks resellerandPINPageLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforResellerandPIN() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Reseller Page is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void ResellerLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnResellerLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Single PIN Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void SinglePINLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnSInglePINLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check PIN Batch Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void PINBatchLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnSInglePINLink();
		
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
