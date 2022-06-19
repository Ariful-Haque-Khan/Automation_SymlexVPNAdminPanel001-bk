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
	
	
	/* 02. Check Reseller Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void ResellerLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLinkNew(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnPinListLinkTest();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check Single PIN Page is okay and return http status 200! */
	@Ignore
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
	
	/* 04. Check PIN Batch Page is okay and return http status 200! */
	@Ignore
	@Test(priority=3)
	public void PINBatchLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnPINBatchLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 05. Check Add PIN Validity Page is okay and return http status 200! */
	@Ignore
	@Test(priority=4)
	public void AddPINValidityLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnAddPINValidityLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 06. Check Reseller Panel Lists Page is okay and return http status 200! */
	@Ignore
	@Test(priority=5)
	public void ResellerPanelListsLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnResellerPanelListsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 07. Check Reseller Panel Lists Page is okay and return http status 200! */
	@Ignore
	@Test(priority=6)
	public void AllResellerListsLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnAllResellerListPageLinkListsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 08. Check Online PIN Activation Lists Page is okay and return http status 200! */
	@Ignore
	@Test(priority=7)
	public void OnlinePINActivationListsLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnOnlinePINActivationListPageLinkListsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 09. Check Online PIN Activation 2 Page is okay and return http status 200! */
	@Ignore
	@Test(priority=8)
	public void OnlinePINActivation2LinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnOnlinePINActivation2ListPageLinkListsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 10. Check Online PIN Migration Page is okay and return http status 200! */
	@Ignore
	@Test(priority=9)
	public void OnlinePINMigrationLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnonlinePINMigrationLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 11. Check Redcheck Pins Page is okay and return http status 200! */
	@Ignore
	@Test(priority=10)
	public void RedcheckPinsLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnRedcheckPinsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 12. Check Reseller Connected Users Lists Page is okay and return http status 200! */
	@Ignore
	@Test(priority=11)
	public void ResellerConnectedUsersLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnResellerConnectedLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 13. Check Device Wise Reseller PINs Lists Page is okay and return http status 200! */
	@Ignore
	@Test(priority=12)
	public void DeviceWiseResellerPINsLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnDeviceWiseResellerListsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 14. Check Suspicious Block PINs Lists Page is okay and return http status 200! */
	@Ignore
	@Test(priority=13)
	public void SuspiciousBlockPINsListsLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnSuspiciousBlockPINsListPageLinkListsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 15. Check Return Pin Request Lists Page is okay and return http status 200! */
	@Ignore
	@Test(priority=14)
	public void ReturnPinRequestListsLinkTest() throws IOException {
		resellerandPINPageLinks = loginPage.loginPagelinkinResellerandPIN(props.getProperty("username"),props.getProperty("password"));
		resellerandPINPageLinks.clickOnResellerDropDownLink(); // depend on mail address(82) parent drop down.
		
		resellerandPINPageLinks.clickOnReturnPinRequestLinkListsLink();
		
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
