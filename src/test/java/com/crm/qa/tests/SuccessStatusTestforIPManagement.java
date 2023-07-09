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

import com.admin.qa.pages.IPManagementSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforIPManagement extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	IPManagementSectionLinks ipManagementSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforIPManagement() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 02. Check IP List Page is okay and return http status 200! */
	@Test(priority=1)
	public void IPListTest() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnIPListLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check IP Bundle Page is okay and return http status 200! */
	@Test(priority=2)
	public void TestIPBundleLink() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnIPBundleLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 04. Check Lots Name With IP BundleList Page is okay and return http status 200! */
	@Test(priority=3)
	public void TestLotsNameWithIpBundleList() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnLotsNameWithIpBundleList();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 05. Check Server Lock Schedule List Page is okay and return http status 200! */
	@Test(priority=4)
	public void TestServerLockScheduleList() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.clickOnServerLockScheduleList();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	@Test(priority=5)
	public void TestCountriesWithIPBundleList() throws IOException {
		ipManagementSectionLinks = loginPage.loginPagelinkinIPManagement(props.getProperty("username"),props.getProperty("password"));
		//ipManagementSectionLinks.clickOnIPManagementDropDownLink(); // depend on mail address(82) parent drop down.
		
		ipManagementSectionLinks.openCountriesWithBundleList();
		
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
