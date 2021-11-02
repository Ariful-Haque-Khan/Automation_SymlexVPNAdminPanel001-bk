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
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PageLinks pageLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	@Test(priority=1)
	public void loginTest() throws IOException {
		pageLinks = loginPage.loginPagelink(props.getProperty("username"),props.getProperty("password"));
		
		pageLinks = pageLinks.clickOnResellerPINLink();
		
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
