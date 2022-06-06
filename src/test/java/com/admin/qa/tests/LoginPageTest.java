/*
 * @author: Naveen Kumar Rajashekar
 */

package com.admin.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	//Initializing PageFactory
	public LoginPageTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "SYMLEX VPN - Administrator Login");
	}
	
	@Test(priority=2)
	public void loginTest() throws IOException {
		homePage = loginPage.login(props.getProperty("username"),props.getProperty("password"));
		props = new Properties();
		HttpURLConnection c=(HttpURLConnection)new URL("https://www.tutorialspoint.com/index.htm").openConnection();
		c.setRequestMethod("HEAD");
		c.connect();
		int r = c.getResponseCode();
		System.out.println("Http response code: " + r);
	}
	
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}

}
