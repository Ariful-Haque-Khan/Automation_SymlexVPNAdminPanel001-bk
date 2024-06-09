package com.IP_detect;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.CampaignModuleElement;
import com.admin.qa.function.IPListElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;
import java.util.concurrent.TimeUnit;

public class IPSelectProtocolDetect extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	IPListElement iPListElement;
	
	//Initializing PageFactory
	public IPSelectProtocolDetect() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
    @Test(priority=1)
	//@Ignore
	public void search_ip_list_from_admin_panel() throws IOException, InterruptedException {
    	iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/ipList");	//navigate to the Campaign List page.
		Thread.sleep(4000);
		iPListElement.advance2ClickedConti();//taking input from the Campaign Name
		
		Thread.sleep(4000);
		iPListElement.copyDataFromIPField();
		
		driver.get(iPListElement.copy2DataFromIPField());
		
		/*driver.get("https://194.49.53.20:9439");
		Thread.sleep(2000);
		
		iPListElement.advanceClicked();
		iPListElement.advanceClickedConti();
		Thread.sleep(4000);
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);*/
		
	}
	
	//@Test(priority=1)
    public void select_payment_gateway () throws IOException, InterruptedException {
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/ipList");	//navigate to the Campaign List page.
		Thread.sleep(4000);
		iPListElement.advance2ClickedConti();//taking input from the Campaign Name
		
		Thread.sleep(4000);
		iPListElement.copyDataFromIPField();
		
		driver.get("https://6"+iPListElement.copyDataFromIPField());
		
 
    	 /*String xpath = "/html/body/div[2]/div/section[2]/div[2]/div/div/div[2]/div/table/tbody/tr[2]/td[3]";
         WebElement cellElement = driver.findElement(By.xpath(xpath));
         String cellText = cellElement.getText();
         
         // Perform a search with the extracted data
         driver.get("https://www.google.com");
         WebElement searchBox = driver.findElement(By.name("q"));
         searchBox.sendKeys(cellText);
         searchBox.submit();*/
         
         // Optional: wait for a few seconds to see the search results
         Thread.sleep(4000);
		
	}
    
    public void intearction_with_payment_gateway () throws IOException, InterruptedException {
		
    }

	
	
				
}


