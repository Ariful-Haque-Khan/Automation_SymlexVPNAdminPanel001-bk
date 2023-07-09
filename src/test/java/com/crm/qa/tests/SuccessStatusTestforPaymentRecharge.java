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

import com.admin.qa.pages.PaymentRecharge;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforPaymentRecharge extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	PaymentRecharge paymentRechargeLogin;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforPaymentRecharge() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Receipt Report Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestReceiptReport() throws IOException {
		paymentRechargeLogin = loginPage.PaymentRechargeLogin(props.getProperty("username"),props.getProperty("password"));
		
		paymentRechargeLogin.openReceiptReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Recharged Report Link Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestRechargedReportLink() throws IOException {
		paymentRechargeLogin = loginPage.PaymentRechargeLogin(props.getProperty("username"),props.getProperty("password"));
		
		paymentRechargeLogin.openRechargedReport();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check Balance Report Link Page is okay and return http status 200! */
	
	@Test(priority=3)
	public void TestBalanceRepoprtLink() throws IOException {
		paymentRechargeLogin = loginPage.PaymentRechargeLogin(props.getProperty("username"),props.getProperty("password"));
		
		paymentRechargeLogin.openBalanceRepoprt();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	@AfterMethod
	public void tearDown() {
//		pageLinks.Logout();
		super.tearDown();
	}

}
