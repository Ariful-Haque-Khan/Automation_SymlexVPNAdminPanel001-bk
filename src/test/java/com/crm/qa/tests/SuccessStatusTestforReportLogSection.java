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

import com.admin.qa.pages.ReportLog;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforReportLogSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	ReportLog reportLog;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforReportLogSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check User Log Link Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestUserLogLink() throws IOException {
		reportLog = loginPage.ReportLogLogin(props.getProperty("username"),props.getProperty("password"));
		
		reportLog.openUserLog();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check API Payment Log Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestAPIPaymentLogLink() throws IOException {
		reportLog = loginPage.ReportLogLogin(props.getProperty("username"),props.getProperty("password"));
		
		reportLog.openAPIPaymentLogReport();
		
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
