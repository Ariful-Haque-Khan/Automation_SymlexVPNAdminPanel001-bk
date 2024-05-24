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

import com.admin.qa.function.WebsiteFormRequestElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class WriteForUsWebForm extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	WebsiteFormRequestElement websiteFormRequestElement;
	
	//Initializing PageFactory
	public WriteForUsWebForm() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	//@Test(priority = 1)
	// @Ignore
	public void Write_For_Us_Form_from_website() throws IOException, InterruptedException {

		driver.get("https://symlexvpn.com/write-for-us/");// Navigate to the desired web page

		JavascriptExecutor js = (JavascriptExecutor) driver;// Create an instance of JavascriptExecutor
		js.executeScript("window.scrollBy(0, 2100);"); // Scroll down by 3000 pixels vertically
		
		Thread.sleep(3000);// Optional: Add a delay to see the scroll effect
		
		WebElement NameField = driver.findElement(By.xpath("/html/body/section[6]/div/div[1]/div/div/form/div[1]/input"));// find the path of name field on write for us form
		NameField.sendKeys("anika");//taking input for the name field
		
		Thread.sleep(3000);
		
		WebElement emailInput = driver.findElement(By.xpath("/html/body/section[6]/div/div[1]/div/div/form/div[2]/input"));// find the path of E-mail of write for us form
		emailInput.sendKeys("mini@gmail.com");//taking input for the E-mail write for us form
		
		Thread.sleep(3000);
		
		WebElement topicField  = driver.findElement(By.xpath("/html/body/section[6]/div/div[1]/div/div/form/div[3]/input"));// find the path of Message of write for us form
		topicField.sendKeys("how to use VPN?");//taking input for the Message of write for us form
		
		Thread.sleep(3000);
		
		WebElement message = driver.findElement(By.xpath("/html/body/section[6]/div/div[1]/div/div/form/div[4]/input"));// find the path of topic of write for us form
		message.sendKeys(" for automation testing");//taking input for the topic of write for us form
		
		Thread.sleep(3000);
		
		WebElement submitButton = driver.findElement(By.xpath("/html/body/section[6]/div/div[1]/div/div/form/div[5]/button[1]"));//find the path of submit button 
		submitButton.click();// click on submit button
		
		Thread.sleep(3000);
		
		WebElement closeButton = driver.findElement(By.xpath("/html/body/section[6]/div/div[2]/div/div/div[2]/button")); //find the path of close button 
		closeButton.click();//click on close button
		
		Thread.sleep(3000);
	} 
	
	//@Test(priority=2)
	//@Ignore
	public void search_the_server_in_the_panel() throws IOException, InterruptedException {
		
		websiteFormRequestElement = loginPage.websiteFormRequestLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/website_offer_registered_data");	//navigate to the Affiliator Sign Up Requests page
    	WebElement nameSearch = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[1]/div[1]/input"));// find the path of Your Preferable Location of server request form
    	nameSearch.sendKeys("mini");//taking input for the Preferable Location field
    	Thread.sleep(2000);
    	
    	websiteFormRequestElement.clickOnSearchButton();//click on search button
    	
    	websiteFormRequestElement.clickOnEditButton(); //click on edit button   	
    	Thread.sleep(2000);
    	
    	websiteFormRequestElement.typeAndClearAffNameEditField("");//clear the name field
  
    	
    	websiteFormRequestElement.typeToNameEditFieldParam("mimbo"); //re-write the name field
    	
        Thread.sleep(2000);
        
        websiteFormRequestElement.clickOnUpdateButton();//click on update button

	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/
	}

}
