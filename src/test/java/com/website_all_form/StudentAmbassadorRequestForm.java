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

public class StudentAmbassadorRequestForm extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	WebsiteFormRequestElement websiteFormRequest;
	
	//Initializing PageFactory
	public StudentAmbassadorRequestForm() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}


	@Test(priority = 1)
	// @Ignore
	public void request_for_Student_Ambassador_from_website() throws IOException, InterruptedException {

		driver.get("https://symlexvpn.com/student-ambassador/#studentAmbassadorFormSection");// Navigate to the desired web page
		
		WebElement applyNowButton = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div/div[2]/a"));
		applyNowButton.click();//click on apply now button
		
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;// Create an instance of JavascriptExecutor
		js.executeScript("window.scrollBy(0, 300);"); // Scroll down by 3000 pixels vertically
		
		Thread.sleep(3000);// Optional: Add a delay to see the scroll effect
		
		WebElement NameField = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div[2]/form/div[1]/input"));// find the path of Your name of server request form
		NameField.sendKeys("Far");//taking input for the name field
		
		//Thread.sleep(2000);
		
		WebElement emailInput = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div/form/div[2]/input"));// find the path of E-mail  of server request form
		emailInput.sendKeys("faria@gmail.com");//taking input for the E-mail  Location field
		
		//Thread.sleep(3000);
		
		WebElement contactNumber = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div[2]/form/div[3]/input"));// find the path of Message of server request form
		contactNumber.sendKeys(" 017111010110");//taking input for the Message Location field
		
		Thread.sleep(3000);
		
		
		WebElement universityName = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div[2]/form/div[4]/input"));// find the path of Message of server request form
		universityName.sendKeys("United international University");//taking input for the Message Location field
		
		Thread.sleep(3000);
		
		WebElement cityName = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div[2]/form/div[5]/input"));// find the path of Message of server request form
		cityName.sendKeys("United international University");//taking input for the Message Location field
		
		Thread.sleep(2000);
		
		WebElement location = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div[2]/form/div[6]/input[1]"));// find the path of Message of server request form
		location.sendKeys("United international University");//taking input for the Message Location field
		
		Thread.sleep(3000);
		
		WebElement message = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div[2]/form/div[7]/textarea"));// find the path of Message of server request form
		message.sendKeys("applying for china");//taking input for the Message Location field
		
		Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;// Create an instance of JavascriptExecutor
		js1.executeScript("window.scrollBy(0, 200);"); // Scroll down by 3000 pixels vertically
		
		Thread.sleep(2000);
		
		WebElement submitButton = driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/div/div[2]/form/div[8]/button[1]")); 
		submitButton.click();// click on submit button
		
		Thread.sleep(2000);
		
		WebElement closeButton = driver.findElement(By.xpath("/html/body/section[4]/div/div[2]/div/div/div[2]/button"));
		closeButton.click();//click on close button
		
		Thread.sleep(2000);
	} 
	
	@Test(priority=2)
	//@Ignore
	public void search_the_Student_Ambassador_Request_in_the_panel() throws IOException, InterruptedException {
		
		websiteFormRequest = loginPage.websiteFormRequestLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/website_offer_registered_data");	//navigate to the Affiliator Sign Up Requests page
    	
    	WebElement nameSearch = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[1]/div[1]/input"));// find the path of Your Preferable Location of server request form
    	nameSearch.sendKeys("Far");//taking input for the Preferable Location field
    	Thread.sleep(2000);
    	
    	websiteFormRequest.selectDatafromFormDropDownElement();
    	
    	Thread.sleep(2000);
    	
    	websiteFormRequest.clickOnSearchButton();//click on search button
    	
    	websiteFormRequest.clickOnEditButton(); //click on edit button   	
    	Thread.sleep(2000);
    	
    	websiteFormRequest.typeAndClearAffNameEditField("");//clear the name field
  
    	
    	websiteFormRequest.typeToNameEditFieldParam("faria"); //re-write the name field
    	
        Thread.sleep(2000);
        
        websiteFormRequest.clickOnUpdateButton();//click on update button
	}
	
	
}