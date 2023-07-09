/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.crm.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.admin.qa.pages.ResellerPanelSectionLinks;
import com.admin.qa.pages.SSLCommerzTransaction;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforSSLCommerzTransactionSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	ResellerPanelSectionLinks resellerPanelSectionLinks;
	SSLCommerzTransaction sslCommerzTransactionLogin;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforSSLCommerzTransactionSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Success TNX(Last 30) Report Link Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestopenSuccessTNXLast30ReportLink() throws IOException {
		sslCommerzTransactionLogin = loginPage.SSLCommerzTransactionLogin(props.getProperty("username"),props.getProperty("password"));
		
		sslCommerzTransactionLogin.openSuccessTNXLast30Report();
		
		String title;
		title = sslCommerzTransactionLogin.getTextofTitleofTNXLas30eport();
	    Assert.assertEquals(title, "SSL Commerz Tnx Report (Max Last 30 Days)");
	}
	
	/* 02. Check Success All Success TNX Report Link Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestopenAllSuccessTNXReportLink() throws IOException {
		sslCommerzTransactionLogin = loginPage.SSLCommerzTransactionLogin(props.getProperty("username"),props.getProperty("password"));
		
		sslCommerzTransactionLogin.openAllSuccessTNXReport();
		
		String title;
		title = sslCommerzTransactionLogin.getTextofTitleofAllSuccessTNXReport();
	    Assert.assertEquals(title, "SSL Commerz Success Payment History");
	}
	
	
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}

}
