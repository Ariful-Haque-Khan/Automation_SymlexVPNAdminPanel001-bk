package com.edit_campaign;

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

public class CouponCodeCreateTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	CampaignModuleElement campaignModuleElement;
	
	//Initializing PageFactory
	public CouponCodeCreateTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
    //@Test(priority=1)
	//@Ignore
	public void create_and_assign_the__coupon_code() throws IOException, InterruptedException {
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		campaignModuleElement.openAddNewCampaignForm();// open the Add New Campaign Form Page.
		campaignModuleElement.typeToCampaignNameFieldParam("Automation Test 4");//taking input from the Campaign Name
		campaignModuleElement.typeToshowAsNameOnWebsiteFieldParam("Anika rashid");// taking input from the Show As Name (On Website)
		campaignModuleElement.typeTowebsiteHeaderImageFieldParam("https://t4.ftcdn.net/jpg/05/68/62/81/360_F_568628131_OWTJpBnx0e78NZjPPkJcgA9JeLyaa5HC.jpg");// taking input from the Website Header Img(External URL)
		campaignModuleElement.typeToCouponCodeFieldParam("mimi");// taking input from the Coupon Code
		campaignModuleElement.typeToAffiliateShareFieldParam("0%");// taking input from the Affiliate Share (%)
		campaignModuleElement.campaignPeriodStartFromField();//select inputs data form the Campaign Period start from
		campaignModuleElement.campaignPeriodEndTimeField();// select inputs data form the  Campaign Period end date
		campaignModuleElement.typeSelectField();// select inputs data from the Status drop down field 
		campaignModuleElement.typeToRemarksFieldParam("JUST FOR automation test"); //taking input from the remarks
		campaignModuleElement.clickONSaveNowButton();////click on save button	
		Thread.sleep(3000);
		
		/*driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");
		campaignModuleElement.clickOnAssignButton();
		Thread.sleep(2000);
		campaignModuleElement.selectResellerField();
		Thread.sleep(1000);
		campaignModuleElement. clickOnAssignCampaignUpdateNowButton();
		Thread.sleep(2000);*/
	}
	
	//@Test(priority=2)
    public void search_coupon_code () throws IOException, InterruptedException {
    	campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");	//navigate to the Campaign List page
    	/*campaignModuleElement.typeToCampaignCouponCodeFieldParam("mimi");
    	Thread.sleep(2000);
    	campaignModuleElement.clickOnCouponCodeSearchbutton();
    	Thread.sleep(2000);
    	campaignModuleElement.clickOnAssignButton();
    	Thread.sleep(2000);
    	campaignModuleElement.selectDatafromAssignResDropDownElement();
    	campaignModuleElement.clickOnUpdateNowAssignCampaignButtonButton();
    	Thread.sleep(9000);*/
    	campaignModuleElement.typeToCampaignCouponCodeFieldParam("mimi");
    	Thread.sleep(2000);
    	campaignModuleElement.clickOnCouponCodeSearchbutton();
    	campaignModuleElement.clickOnSetDiscountbutton();
    	Thread.sleep(1000);
    	campaignModuleElement.clickOnEditActionButton();
    	Thread.sleep(1000);
    	campaignModuleElement.typeAndClearDiscountAmountFieldParam("");
    	campaignModuleElement.typeToDiscountAmountFieldParam("71.00");
    	campaignModuleElement.typeAndClearExtraBonusFieldParam("");
    	campaignModuleElement.typeToExtraBonusFieldParam("7");
    	campaignModuleElement.clickONUpdateButton();	
    	Thread.sleep(4000);
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");	//navigate to the Campaign List page
    	campaignModuleElement.typeToCampaignCouponCodeFieldParam("mimi");
    	Thread.sleep(2000);
    	campaignModuleElement.clickOnCouponCodeSearchbutton();
    	Thread.sleep(2000);
    	campaignModuleElement.clickOnAssignButton();
    	Thread.sleep(2000);
    	campaignModuleElement.selectDatafromAssignResDropDownElement();
    	campaignModuleElement.clickOnUpdateNowAssignCampaignButtonButton();
    	
	}
   
	@Test(priority=3)
	//@Ignore
	public void login_in_the_website_and_payment() throws IOException, InterruptedException {
		
		driver.get("https://pay.symlexvpn.com/checkout/18690");  
	
	    WebElement usernameField = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[2]/div/div[4]/form/div[1]/input"));// Find the username field and input username
	    usernameField.sendKeys("anika.kolpolok@gmail.com");//taking input for the username field

	    WebElement passwordField = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[2]/div/div[4]/form/div[2]/input")); // Find the password field and input password
	    passwordField.sendKeys("123456");//taking input for password field

	    WebElement submitButton = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[2]/div/div[4]/form/div[4]/div[2]/button"));
        submitButton.click();//click on  submit button  and successfully logged in
        
        Thread.sleep(8000);
        
        WebElement codeField = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[5]/div/div/div[3]/div[3]/div[2]/form/div/input"));// Find the codeField and input code
        Thread.sleep(8000);
    	codeField.sendKeys("mim123");//taking input for the code Field
    	//codeField.sendKeys(Keys.SPACE);
    	
    	Thread.sleep(15000);
    	//codeField.sendKeys(Keys.ENTER);
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	WebElement SSLCOmmerz = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[5]/div/div/div[3]/div[7]/div[2]/input"));
    	if (!SSLCOmmerz.isSelected()) { // Check if the checkbox is not already selected before clicking
    		SSLCOmmerz.click();
    	}
    	
    	Thread.sleep(20000);
    	
    	WebElement payNowButton = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[5]/div/div/div[3]/div[7]/div[3]/button"));
    	payNowButton.click();//click on pay now button
    	
    	Thread.sleep(13000);
    	
    	WebElement mobileBanking = driver.findElement(By.xpath("/html/body/div[1]/div/div/app-root/app-transaction/div/div[1]/div[1]/div/div[1]/app-tab-nav/div/ul/li[2]/a"));
    	mobileBanking.click(); //click on mobile banking button
    	
    	Thread.sleep(1000);
    	
    	WebElement bkashPayment = driver.findElement(By.xpath("/html/body/div[1]/div/div/app-root/app-transaction/div/div[1]/div[1]/div/div[1]/app-payment-options/div/div/div/div[2]/ul/li[1]/a/img"));
    	bkashPayment.click();// click on bkash payment gateway
    	
        Thread.sleep(1000);
    	
    	WebElement bkashAccountNumberClear = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[1]/input"));
    	bkashAccountNumberClear.clear();//taking input for password field
    	
    	WebElement bkashAccountNumber = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[1]/input")); //
    	bkashAccountNumber.sendKeys("01701137664");//taking input for password field  
        	
    	WebElement bkashBConfirmButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div/button[2]"));
    	bkashBConfirmButton.click();//click on pay now button  /html/body/div[2]/div/div[3]/div/div/div[1]/input
    	
    	WebElement bkashVerificationCode = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[1]/input")); // Find the password field and input password
    	bkashVerificationCode.sendKeys("");//taking input for password field*/
    	
    	Thread.sleep(20000);
    	
    	WebElement verificatinCodeConfirm = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div/button[2]"));
    	verificatinCodeConfirm.click();// click on 
    	
    	Thread.sleep(3000);
    	
    	WebElement bkashPin = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[1]/input")); // Find the password field and input password
    	bkashPin.sendKeys("");//taking input for password field*/  
    	
    	Thread.sleep(20000);
    	
    	WebElement confirmPayment = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div/button[2]"));
    	confirmPayment.click();// click on 
    	
		}
    
    public void select_payment_gateway () throws IOException, InterruptedException {
		
	}
    
    public void intearction_with_payment_gateway () throws IOException, InterruptedException {
		
    }

	
	
				
}


