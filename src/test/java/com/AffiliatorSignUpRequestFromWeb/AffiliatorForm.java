/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.AffiliatorSignUpRequestFromWeb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AffiliatorForm extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	//Initializing PageFactory
	public AffiliatorForm() {
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
	public void request_for_the_affiliator_from_website() throws IOException, InterruptedException {
		
		driver.get("https://symlexvpn.com/affiliate/#aff_form");  
	
	    WebElement firstnameField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[1]/div[1]/div[1]/div[1]/input"));// find the path of First Name of affiliator
	    firstnameField.sendKeys("Anika");//taking input for the First Name field
	    
	    Thread.sleep(3000);

	    WebElement lastnameField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[1]/div[1]/div[1]/div[2]/input")); // find the path of last Name of affiliator
	    lastnameField.sendKeys("Rashid");//taking input for the last Name field
	    
	    Thread.sleep(3000);

	    WebElement emailAddressField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[1]/div[1]/div[1]/div[3]/input")); //find the path of Email Address of affiliator
	    emailAddressField.sendKeys("abc@gmail.com");//taking input for Email Address field
        
        Thread.sleep(3000);
        
        WebElement phoneNumberField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[1]/div[1]/div[2]/div[1]/input")); //find the path of phone Number of affiliator
        phoneNumberField.sendKeys("010101010101");//taking input for phone Number field
    	
    	Thread.sleep(3000);
    	
    	//WebElement SkypeIDField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[1]/div[1]/div[2]/div[2]/input")); //find the path of Skype ID of affiliator
    	//SkypeIDField.sendKeys("010101010101");//taking input for Skype ID field
    	
    	Thread.sleep(3000);
    	
    	
    	//WebElement CouponCodeField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[1]/div[1]/div[2]/div[3]/input")); //find the path of  Coupon Code  of affiliator
    	//CouponCodeField.sendKeys("AFF123");//taking input for  Coupon Code  field
    	
    	Thread.sleep(3000);
    	
    	WebElement nextButton = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[1]/div[2]/button"));
    	nextButton.click();// click on  next button
    	
    	Thread.sleep(3000);
    	
    	/*WebElement AccountNameField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[1]/div[1]/input")); //find the path of  Account Name  of affiliator
    	AccountNameField.sendKeys("Anika");//taking input for  Account Name  field
    	
    	Thread.sleep(3000);*/
    	
    	WebElement websiteField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[1]/div[2]/input")); //find the path of  website of affiliator
    	websiteField.sendKeys("Anika");//taking input for  website  field
    	
    	Thread.sleep(3000);
    	/*
        WebElement countryDropdown = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[1]/div[3]/div/span"));
        countryDropdown.click();
        
        Select select = new Select(countryDropdown);
        
        String countryName = "United States"; // Replace with the desired country
        select.selectByVisibleText(countryName);*/
    	
    	WebElement countryButtonselect = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[1]/div[3]/div/span"));
    	countryButtonselect.click();// click on  next button
    	WebElement countrySearch = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[1]/div[3]/div/ul/li[9]"));
    	countrySearch.sendKeys("Agentina");
    	
    	//WebElement countrySelect = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[1]/div[3]/select")); // Update the XPath as per your HTML structure

    	//Select countrySelect1 = new Select(driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[1]/div[3]/select")));
    	//countrySelect1.selectByIndex(3);
    	
    	/*WebElement countrySelect = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[1]/div[3]/select"));
    	
    	WebElement countryDropDown = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[1]/div[1]/div[1]/div[3]/input"));
    	
    	WebElement countrySearch = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[1]/div[3]/div/ul/li[18]"));
    	
    	countrySelect.click();
    	
    	countryDropDown.sendKeys("United states");
    	
    	countrySearch.click(); */
    	
    	WebElement StreetAddressField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[2]/div[1]/input")); //find the path of  Street Address of affiliator
    	StreetAddressField.sendKeys("36 East 8th Street, New York, NY 10003,");//taking input for Street Address  field
    	
    	Thread.sleep(3000);
    	
    	WebElement cityField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[2]/div[2]/input")); //find the path of  Street Address of affiliator
    	cityField.sendKeys("Newyork");//taking input for Street Address  field
    	
    	Thread.sleep(3000);
    	
    	WebElement StateField = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[1]/div[2]/div[3]/input")); //find the path of  State of affiliator
    	StateField.sendKeys("Manhattan");//taking input for State field
    	
    	Thread.sleep(3000);


    	WebElement next2Button = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[2]/div[2]/button[2]"));
    	next2Button.click();// click on  next button
    	
    	Thread.sleep(3000);
    	
    	WebElement submitButton = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div/div/form/section[3]/div[2]/button[2]"));
    	submitButton.click();// click on  submit button
    	
    	
  
  
		}
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
