/*
 * @author: Naveen Kumar Rajashekar
 * 
 */

package com.crm.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FreeCRMTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		 System.setProperty("webdriver.chrome.driver", "C:\\jar_files\\chromedriver_win32\\102\\chromedriver.exe");
		 driver=new ChromeDriver();//launch chrome browser

		 driver.manage().window().maximize(); //maximize the windows
		 driver.manage().deleteAllCookies(); // delete all the cookies
		 //dynamic wait
		 
		 driver.get("https://classic.crmpro.com");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
	}
	
	//Role based -permission based use case
	//admin
	//superuser
	//customer
	//seller	````
	//distributor
	//delivery boy
	@Ignore
	@Test(priority=1)
	public void loginWithGroupUserTest() throws InterruptedException {
		
	}
	
		 
	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}
		 
}
