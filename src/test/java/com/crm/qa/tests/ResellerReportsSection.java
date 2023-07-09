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
import com.admin.qa.pages.ResellerReports;
import com.admin.qa.pages.SSLCommerzTransaction;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class ResellerReportsSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	ResellerReports resellerReports;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public ResellerReportsSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Success Sales Graph Report Link Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestopenSalesGraphReportLink() throws IOException {
		resellerReports = loginPage.ResellerReportsLogin(props.getProperty("username"),props.getProperty("password"));
		
		resellerReports.opeSalesGraphReportLink();
		
		String title;
		title = resellerReports.getTextofTitleofSalesGraphReport();
	    Assert.assertEquals(title, "Reseller Sales Analysis");
	}

	
	
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}

}
