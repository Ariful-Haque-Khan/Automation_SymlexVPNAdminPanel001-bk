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

import com.admin.qa.function.WebsiteFormRequest;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class ServerRequestForm extends TestBase {

	LoginPage loginPage;

	TestUtils testUtils;
	
	WebsiteFormRequest websiteFormRequest;

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

	//@Test(priority = 1)
	// @Ignore
	public void request_for_the_server_from_website() throws IOException, InterruptedException {

		driver.get("https://symlexvpn.com/country-list/");// Navigate to the desired web page

		JavascriptExecutor js = (JavascriptExecutor) driver;// Create an instance of JavascriptExecutor
		js.executeScript("window.scrollBy(0, 3000);"); // Scroll down by 1000 pixels vertically
		
		Thread.sleep(2000);// Optional: Add a delay to see the scroll effect
		
		WebElement preferableLocation = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div/form/div[1]/input[1]"));// find the path of Your Preferable Location of server request form
		preferableLocation.sendKeys("indonesia");//taking input for the Preferable Location field
		
		Thread.sleep(2000);
		
		WebElement emailInput = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div/form/div[2]/input"));// find the path of E-mail  of server request form
		emailInput.sendKeys("mimbo@gmail.com");//taking input for the E-mail  Location field
		
		Thread.sleep(2000);
		
		WebElement message = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div/form/div[3]/input"));// find the path of Message of server request form
		message.sendKeys("automation testing purpose");//taking input for the Message  Location field
		
		Thread.sleep(2000);
		
		WebElement submitButton = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div/form/div[4]/button[1]")); 
		submitButton.click();// click on  submit button
		
		Thread.sleep(2000);
		
		WebElement closeButton = driver.findElement(By.xpath("html/body/section[4]/div/div[2]/div/div/div[2]/button"));
		closeButton.click();// click on  submit button
		
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	//@Ignore
	public void search_the_server_in_the_panel() throws IOException, InterruptedException {
		
		websiteFormRequest = loginPage.websiteFormRequestLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/website_offer_registered_data");	//navigate to the Affiliator Sign Up Requests page
    	WebElement nameSearch = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[1]/div[1]/input"));// find the path of Your Preferable Location of server request form
    	nameSearch.sendKeys("mimbo");//taking input for the Preferable Location field
    	Thread.sleep(2000);
    	
    	websiteFormRequest.clickOnSearchButton();
    	
    	websiteFormRequest.clickOnEditButton();    	
    	Thread.sleep(2000);
    	
    	websiteFormRequest.typeAndClearAffNameEditField("");
    	
    	Thread.sleep(2000);
    	
    	websiteFormRequest.typeToNameEditFieldParam("anika");
    	
        Thread.sleep(2000);
        
        websiteFormRequest.clickOnUpdateButton();	

	}

}
