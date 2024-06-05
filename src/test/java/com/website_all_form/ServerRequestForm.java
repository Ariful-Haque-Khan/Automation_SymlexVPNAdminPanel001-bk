/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.website_all_form;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.ServerModuleElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class ServerRequestForm extends TestBase {

	LoginPage loginPage;

	TestUtils testUtils;
	
	ServerModuleElement serverModuleElement;

	// Initializing PageFactory
	public ServerRequestForm() {
		super(); // Call the Constructor of the Super class - TestBase
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	@Test(priority=1)
	//@Ignore
	public void search_the_server_in_the_panel() throws IOException, InterruptedException {
		
		serverModuleElement = loginPage.addNewServerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/VpnServer/index");	//navigate to the VPN Server List page
    	
    	WebElement nameSearch = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[1]/div[1]/input"));// search by name from panel
    	nameSearch.sendKeys("TEST SERVER");//taking input for the Preferable Location field
    	Thread.sleep(2000);
    	
    	WebElement ipSearch = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[1]/div[2]/input"));// search by IP from panel
    	ipSearch.sendKeys("100");//taking input for the Preferable Location field
    	Thread.sleep(2000);
    	
    	/*WebElement pathSearch = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[1]/div[3]/input"));// search by path from panel
    	pathSearch.sendKeys("");//taking input for the Preferable Location field
    	Thread.sleep(2000);*/
    	
    	//serverModuleElement.selectDatafromFormDropDownElement();
    	
    	//Thread.sleep(2000);
    	
    	serverModuleElement.clickVPNServerSearchButton();//click on search button
    	
    	//serverModuleElement.clickOnEditButton(); //click on edit button   	
    	Thread.sleep(2000);
    	
    	//serverModuleElement.typeAndClearAffNameEditField("");//clear the name field
  
    	
    	//serverModuleElement.typeToNameEditFieldParam("mimbo"); //re-write the name field
    	
        Thread.sleep(2000);
        
        //serverModuleElement.clickOnUpdateButton();//click on update button

	}

}
