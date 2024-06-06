/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.edit_server;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.WebsiteFormRequestElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class ServerSearchList extends TestBase {

	LoginPage loginPage;

	TestUtils testUtils;
	
	WebsiteFormRequestElement websiteFormRequestElement;

	// Initializing PageFactory
	public ServerSearchList() {
		super(); // Call the Constructor of the Super class - TestBase
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	@Test(priority=2)
	//@Ignore
	public void search_the_server_in_the_panel() throws IOException, InterruptedException {
		
		websiteFormRequestElement = loginPage.websiteFormRequestLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/VpnServer/index");	//navigate to the Affiliator Sign Up Requests page
    	
    	WebElement nameSearch = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[1]/div[1]/input"));// find the path of Your Preferable Location of server request form
    	nameSearch.sendKeys("Test Server");//taking input for the Preferable Location field
    	Thread.sleep(2000);
    	
    	WebElement IPSearch = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[1]/div[2]/input"));// find the path of Your Preferable Location of server request form
    	IPSearch.sendKeys("anika");//taking input for the Preferable Location field
    	Thread.sleep(2000);
    	
    	websiteFormRequestElement.selectDatafromFormDropDownElement();
    	
    	Thread.sleep(2000);
    	
    	websiteFormRequestElement.clickOnSearchButton();//click on search button
    	
    	websiteFormRequestElement.clickOnEditButton(); //click on edit button   	
    	Thread.sleep(2000);
    	
    	websiteFormRequestElement.typeAndClearAffNameEditField("");//clear the name field
  
    	
    	websiteFormRequestElement.typeToNameEditFieldParam("mimbo"); //re-write the name field
    	
        Thread.sleep(2000);
        
        websiteFormRequestElement.clickOnUpdateButton();//click on update button

	}

}
