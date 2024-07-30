package com.search_campaign_list;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.CampaignModuleElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;
import java.util.concurrent.TimeUnit;

public class SelectResellerDropDownField extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	CampaignModuleElement campaignModuleElement;
	
	//Initializing PageFactory
	public SelectResellerDropDownField() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
 
  	
	
	//@Ignore
	@Test(priority=1)
	public void enter_active_status_from_dropdown_field_in_the_campaign_list() throws IOException, InterruptedException {
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");//navigate to the Campaign List page
    	campaignModuleElement.selecActivefromSearchStatusDropDownElement();
    	Thread.sleep(1000);
    	campaignModuleElement.typeToCampaignCouponCodeFieldParam("test");
    	Thread.sleep(2000);
    	campaignModuleElement.selectSelectAffiliatorResellerDropDownElement();
    	campaignModuleElement.selectDatafromSearchPagination50DropDownElement();
    	campaignModuleElement.clickOnCouponCodeSearchbutton();
    	
	}	
	
	@Test(priority=2)
	public void enter_inactive_status_from_dropdown_field_in_the_campaign_list() throws IOException, InterruptedException {
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");//navigate to the Campaign List page
    	campaignModuleElement.selecInactivefromSearchStatusDropDownElement();
    	Thread.sleep(1000);
    	campaignModuleElement.typeToCampaignCouponCodeFieldParam("");
    	Thread.sleep(2000);
    	campaignModuleElement.selectrumyqaResellerDropDownElement();
    	campaignModuleElement.selectDatafromSearchPagination50DropDownElement();
    	campaignModuleElement.clickOnCouponCodeSearchbutton();
    	
	}	
	
	@Test(priority=3)
	public void enter_Select_status_from_dropdown_field_in_the_campaign_list() throws IOException, InterruptedException {
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");//navigate to the Campaign List page
    	campaignModuleElement.selectStatusfromSearchStatusDropDownElement();
    	Thread.sleep(1000);
    	campaignModuleElement.typeToCampaignCouponCodeFieldParam("test");
    	Thread.sleep(2000);
    	campaignModuleElement.selectemailsymlexResellerDropDownElement();
    	campaignModuleElement.selectDatafromSearchPagination50DropDownElement();
    	campaignModuleElement.clickOnCouponCodeSearchbutton();
    	
	}	
	

	
}


