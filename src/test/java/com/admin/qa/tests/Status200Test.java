/*
 * @author: Naveen Kumar Rajashekar
 */
package com.admin.qa.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import com.admin.qa.pages.PageLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class Status200Test extends TestBase{
	WebDriver driver = new ChromeDriver();
	LoginPage loginPage;
	HomePage homePage;
	TestUtils testUtils;
	PageLinks pageLinks;
	public static Properties props;
	//Initializing PageFactory
	public Status200Test() {
		super();   //Call the Constructor of the Super class - TestBase
		props = new Properties();
		try {
			props = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\project\\eclipse\\SymlexAdminPanel001\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			//C:\project\eclipse\SymlexResPanel001
			props.load(ip);
			System.out.println(props.getProperty("url"));
			System.out.println(props.getProperty("browser"));
		}

		catch (FileNotFoundException ip) {
			ip.printStackTrace();
		}

		catch (IOException io) {
			io.printStackTrace();
		}
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtils = new TestUtils();
		loginPage = new LoginPage();
		homePage = loginPage.login(props.getProperty("username"),props.getProperty("password"));
		
		
	}
	
//	@Test(priority=0)
//	public void LinkTest() throws MalformedURLException, IOException {
//		//testUtils.switchToFrame();
//		HttpURLConnection c=(HttpURLConnection)new URL("https://www.tutorialspoint.com/index.htm").openConnection();
//		c.setRequestMethod("HEAD");
//		c.connect();
//		int r = c.getResponseCode();
//		System.out.println("Http response code: " + r);
//		Assert.assertEquals(c.getResponseCode(), 200);
//	}
//	
	@Test(priority=2)
	public void statusResellerLinkDropDownTest() throws IOException, InterruptedException {
		//testUtils.switchToFrame();
		//pageLinks.clickOnResellerDropDown();
		driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/ul/li[1]/a")).click();
		//@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[1]/a")
		//WebElement resellerListPageLink;
		//HttpURLConnection c=(HttpURLConnection)new URL(props.getProperty("url")+"/reseller").openConnection();
		//c.setRequestMethod("HEAD");
		//c.connect();
		//int r = c.getResponseCode();
		//Assert.assertEquals(c.getResponseCode(), 200);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}
	
}
