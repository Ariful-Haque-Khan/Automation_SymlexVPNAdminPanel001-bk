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

public class CampaignNameSearchInputField extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	CampaignModuleElement campaignModuleElement;
	
	//Initializing PageFactory
	public CampaignNameSearchInputField() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
 
    public void searchCouponCodeCommon(String coupon_Code) throws IOException, InterruptedException {
    	campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
    	driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/campaignList");//navigate to the Campaign List page
    	//Thread.sleep(1000);
    	//campaignModuleElement.selecActivefromSearchStatusDropDownElement();
    	//Thread.sleep(1000);
    	campaignModuleElement.typeToCampaignCouponCodeFieldParam(coupon_Code);
    	Thread.sleep(2000);
    	campaignModuleElement.selectrumyqaResellerDropDownElement();
    	campaignModuleElement.selectDatafromSearchPagination50DropDownElement();
    	campaignModuleElement.clickOnCouponCodeSearchbutton();
   
    	
	}	
	
	//@Ignore
	@Test(priority=1)
	public void enter_empty_text_into_Coupun_Code_input_field() throws IOException, InterruptedException {searchCouponCodeCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_Coupun_Code_input_field() throws IOException, InterruptedException {searchCouponCodeCommon("Automation Test 3");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("           Automation Test 3"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("Automation Test 3                 ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("AUTOMATION TEST 3");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("automation test");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("Automation Test 3 "); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
			+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Coupun_Code_input_field() throws IOException, InterruptedException{searchCouponCodeCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Coupun_Code_input_field() throws IOException, InterruptedException{ 

	}
}


