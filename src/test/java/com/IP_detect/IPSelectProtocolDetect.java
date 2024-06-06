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
    	//driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/ipList");	//navigate to the Campaign List page.
		//Thread.sleep(4000);
		//iPListElement.clickONEditIPButton();//taking input from the Campaign Name
		
		//Thread.sleep(4000);
		//iPListElement.copyDataFromIPField();
		
		//driver.get("https://6"+iPListElement.copyDataFromIPField());
		
		driver.get("https://194.49.53.20:9439");
		
		iPListElement.advanceClicked();
		iPListElement.advanceClickedConti();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
		/*driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");
		campaignModuleElement.clickOnAssignButton();
		Thread.sleep(2000);
		campaignModuleElement.selectResellerField();
		Thread.sleep(1000);
		campaignModuleElement. clickOnAssignCampaignUpdateNowButton();
		Thread.sleep(2000);*/
	}
	
    
    public void select_payment_gateway () throws IOException, InterruptedException {
		
	}
    
    public void intearction_with_payment_gateway () throws IOException, InterruptedException {
		
    }

	
	
				
}


