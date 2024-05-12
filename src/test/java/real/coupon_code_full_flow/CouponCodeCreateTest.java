package real.coupon_code_full_flow;

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

import com.admin.qa.function.AddNewCampaign;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;
import java.util.concurrent.TimeUnit;

public class CouponCodeCreateTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewCampaign addNewCampaign;
	
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
		addNewCampaign = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewCampaign.openAddNewCampaignForm();// open the Add New Campaign Form Page.
		addNewCampaign.typeToCampaignNameFieldParam("Automation Test 4");//taking input from the Campaign Name
		addNewCampaign.typeToshowAsNameOnWebsiteFieldParam("Anika rashid");// taking input from the Show As Name (On Website)
		addNewCampaign.typeTowebsiteHeaderImageFieldParam("https://t4.ftcdn.net/jpg/05/68/62/81/360_F_568628131_OWTJpBnx0e78NZjPPkJcgA9JeLyaa5HC.jpg");// taking input from the Website Header Img(External URL)
		addNewCampaign.typeToCouponCodeFieldParam("mimi123");// taking input from the Coupon Code
		addNewCampaign.typeToAffiliateShareFieldParam("0%");// taking input from the Affiliate Share (%)
		addNewCampaign.campaignPeriodStartFromField();//select inputs data form the Campaign Period start from
		addNewCampaign.campaignPeriodEndTimeField();// select inputs data form the  Campaign Period end date
		addNewCampaign.typeSelectField();// select inputs data from the Status drop down field 
		addNewCampaign.typeToRemarksFieldParam("JUST FOR automation test"); //taking input from the remarks
		addNewCampaign.clickONSaveNowButton();////click on save button	
		Thread.sleep(3000);
		/*driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");
		addNewCampaign.clickOnAssignButton();
		Thread.sleep(2000);
		addNewCampaign.selectResellerField();
		Thread.sleep(1000);
		addNewCampaign. clickOnAssignCampaignUpdateNowButton();
		Thread.sleep(2000);*/
	}
	
	//@Test(priority=2)
    public void search_coupon_code () throws IOException, InterruptedException {
    	addNewCampaign = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");	//navigate to the Campaign List page
    	Thread.sleep(3000);
    	addNewCampaign.typeToCampaignCouponCodeFieldParam("mimi123");
    	Thread.sleep(2000);
    	addNewCampaign.clickOnCouponCodeSearchbutton();
    	Thread.sleep(2000);
    	addNewCampaign.clickOnSetDiscountbutton();
    	Thread.sleep(1000);
    	addNewCampaign.clickOnEditActionButton();
    	Thread.sleep(1000);
    	addNewCampaign.typeAndClearDiscountAmountFieldParam("");
    	addNewCampaign.typeToDiscountAmountFieldParam("70.00");
    	addNewCampaign.typeAndClearExtraBonusFieldParam("");
    	addNewCampaign.typeToExtraBonusFieldParam("7");
    	addNewCampaign.clickONUpdateButton();	
    	Thread.sleep(2000);
		
	}
   
	//@Test(priority=3)
	//@Ignore
	public void login_in_the_website_and_payment() throws IOException, InterruptedException {
		
		driver.get("https://pay.symlexvpn.com/checkout/18690");  
		
	    WebElement usernameField = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[2]/div/div[4]/form/div[1]/input"));// Find the username field and input username
	    usernameField.sendKeys("anika.kolpolok@gmail.com");//taking input for the username field

	    WebElement passwordField = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[2]/div/div[4]/form/div[2]/input")); // Find the password field and input password
	    passwordField.sendKeys("123456");//taking input for password field

	    WebElement submitButton = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[2]/div/div[4]/form/div[4]/div[2]/button"));
        submitButton.click();//click on  submit button  and successfully logged in
        
        Thread.sleep(5000);
        WebElement codeField = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[5]/div/div/div[3]/div[3]/div[2]/form/div/input"));// Find the codeField and input code
    	codeField.sendKeys("rumytest34");//taking input for the code Field
    	codeField.sendKeys(Keys.SPACE);
    	Thread.sleep(6000);
    	//codeField.sendKeys(Keys.ENTER);
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	WebElement SSLCOmmerz = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[5]/div/div/div[3]/div[7]/div[2]/input"));
    	if (!SSLCOmmerz.isSelected()) { // Check if the checkbox is not already selected before clicking
    		SSLCOmmerz.click();
    	}
    	
    	Thread.sleep(1000);
    	
    	WebElement payNowButton = driver.findElement(By.xpath("/html/body/div[5]/div/section/div/div/div[5]/div/div/div[3]/div[7]/div[3]/button"));
    	payNowButton.click();//click on pay now button
    	
    	Thread.sleep(6000);
    	
    	WebElement mobileBanking = driver.findElement(By.xpath("/html/body/div[1]/div/div/app-root/app-transaction/div/div[1]/div[1]/div/div[1]/app-tab-nav/div/ul/li[2]/a"));
    	mobileBanking.click(); //click on mobile banking button
    	
    	Thread.sleep(10000);
    	
    	WebElement bkashPayment = driver.findElement(By.xpath("/html/body/div[1]/div/div/app-root/app-transaction/div/div[1]/div[1]/div/div[1]/app-payment-options/div/div/div/div[2]/ul/li[1]/a/img"));
    	bkashPayment.click();// click on bkash payment gateway
    	
    	//Thread.sleep(1000);
    	
    	WebElement bkashAccountNumberClear = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[1]/input"));
    	bkashAccountNumberClear.clear();//taking input for password field
    	
    	WebElement bkashAccountNumber = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[1]/input")); // Find the password field and input password
    	bkashAccountNumber.sendKeys("01701137664");//taking input for password field  
        	
    	WebElement bkashBConfirmButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div/button[2]"));
    	bkashBConfirmButton.click();//click on pay now button  /html/body/div[2]/div/div[3]/div/div/div[1]/input
    	
    	/*WebElement bkashVerificationCode = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[1]/input")); // Find the password field and input password
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


