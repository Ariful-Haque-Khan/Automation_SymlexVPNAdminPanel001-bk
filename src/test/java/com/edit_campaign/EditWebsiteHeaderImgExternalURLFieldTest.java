/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.edit_campaign;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.CampaignModuleElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class EditWebsiteHeaderImgExternalURLFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	CampaignModuleElement campaignModuleElement;
	
	//Initializing PageFactory
	public EditWebsiteHeaderImgExternalURLFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void addNewCampaignCommon(String Website_Header) throws IOException, InterruptedException {
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editCampaign");// open the edit Campaign Form Page.
		campaignModuleElement.typeToCampaignNameFieldParam("1 year offer");//taking input from the Campaign Name
		campaignModuleElement.typeToshowAsNameOnWebsiteFieldParam("1 year campaign for all");// taking input from the Show As Name (On Website)
		campaignModuleElement.typeTowebsiteHeaderImageFieldParam(Website_Header);// taking input from the Website Header Img(External URL)
		campaignModuleElement.typeToCouponCodeFieldParam("Q-1234");// taking input from the Coupon Code
		campaignModuleElement.typeToAffiliateShareFieldParam("10%");// taking input from the Affiliate Share (%)
		campaignModuleElement.campaignPeriodStartFromField();//select inputs data form the Campaign Period start from
		campaignModuleElement.campaignPeriodEndTimeField();// select inputs data form the  Campaign Period end date
		campaignModuleElement.typeSelectField();// select inputs data from the Status drop down field 
		campaignModuleElement.typeToRemarksFieldParam("JUST FOR PREMIUM USER");//  taking input from the remarks
		//campaignModuleElement.clickONSaveNowButton();////click on save button
		
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Website_Header_img_input_field() throws IOException, InterruptedException {addNewCampaignCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_Website_Header_img_input_field() throws IOException, InterruptedException {addNewCampaignCommon("https://t4.ftcdn.net/jpg/05/68/62/81/360_F_568628131_OWTJpBnx0e78NZjPPkJcgA9JeLyaa5HC.jpg");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Website_Header_img_input_field() throws IOException, InterruptedException{addNewCampaignCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Website_Header_img_input_field() throws IOException, InterruptedException{ 
			
	}

	@Test(priority=21)
	public void enter_then_clear_the_text_into_Website_Header_img_input_field() throws IOException, InterruptedException{
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editCampaign");// open the edit Campaign Form Page.
		campaignModuleElement.typeToCampaignNameFieldParam("1 Year campaign for new user");//taking input from the Campaign Name
		campaignModuleElement.typeToshowAsNameOnWebsiteFieldParam("1 year campaign for all");// taking input from the Show As Name (On Website)
		campaignModuleElement.typeTowebsiteHeaderImageFieldParam("hhtps:websiteforurl/com");// taking input from the Website Header Img(External URL)
		campaignModuleElement.typeAndClearwebsiteHeaderImageFieldParam("");
		campaignModuleElement.typeToCouponCodeFieldParam("Q-1234");// taking input from the Coupon Code
		campaignModuleElement.typeToAffiliateShareFieldParam("10%");// taking input from the Affiliate Share (%)
		campaignModuleElement.campaignPeriodStartFromField();//select inputs data form the Campaign Period start from
		campaignModuleElement.campaignPeriodEndTimeField();// select inputs data form the  Campaign Period end date
		campaignModuleElement.typeSelectField();// select inputs data from the Status drop down field 
		campaignModuleElement.typeToRemarksFieldParam("JUST FOR PREMIUM USER");//  taking input from the remarks
		//campaignModuleElement.clickONSaveNowButton();////click on save button
		
	}
	//@Test(priority=22)
	public void enter_then_undo_the_input_action_into_Website_Header_img_input_field() throws IOException, InterruptedException{
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editCampaign");// open the edit Campaign Form Page.
		campaignModuleElement.typeToCampaignNameFieldParam("1 Year campaign for new user");//taking input from the Campaign Name
		campaignModuleElement.typeToshowAsNameOnWebsiteFieldParam("1 year campaign for all");// taking input from the Show As Name (On Website)
		campaignModuleElement.typeTowebsiteHeaderImageFieldParam("hhtps:websiteforurl/com");// taking input from the Website Header Img(External URL)
		campaignModuleElement.typeAndClearwebsiteHeaderImageFieldParam("");
		campaignModuleElement.typeToCouponCodeFieldParam("Q-1234");// taking input from the Coupon Code
		campaignModuleElement.typeToAffiliateShareFieldParam("10%");// taking input from the Affiliate Share (%)
		campaignModuleElement.campaignPeriodStartFromField();//select inputs data form the Campaign Period start from
		campaignModuleElement.campaignPeriodEndTimeField();// select inputs data form the  Campaign Period end date
		campaignModuleElement.typeSelectField();// select inputs data from the Status drop down field 
		campaignModuleElement.typeToRemarksFieldParam("JUST FOR PREMIUM USER");//  taking input from the remarks
		//campaignModuleElement.clickONSaveNowButton();////click on save button
		
		
	}
	
	@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_Website_Header_img_input_field() throws IOException, InterruptedException{
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editCampaign");// open the edit Campaign Form Page.
		campaignModuleElement.typeToCampaignNameFieldParam("1 Year campaign for new user");//taking input from the Campaign Name
		campaignModuleElement.typeToshowAsNameOnWebsiteFieldParam("1 year campaign for all");// taking input from the Show As Name (On Website)
		campaignModuleElement.typeTowebsiteHeaderImageFieldParam("hhtps:websiteforurl/com");// taking input from the Website Header Img(External URL)
		campaignModuleElement.typeAndClearwebsiteHeaderImageFieldParam("");
		campaignModuleElement.typeToCouponCodeFieldParam("Q-1234");// taking input from the Coupon Code
		campaignModuleElement.typeToAffiliateShareFieldParam("10%");// taking input from the Affiliate Share (%)
		campaignModuleElement.campaignPeriodStartFromField();//select inputs data form the Campaign Period start from
		campaignModuleElement.campaignPeriodEndTimeField();// select inputs data form the  Campaign Period end date
		campaignModuleElement.typeSelectField();// select inputs data from the Status drop down field 
		campaignModuleElement.typeToRemarksFieldParam("JUST FOR PREMIUM USER");//  taking input from the remarks
		//campaignModuleElement.clickONSaveNowButton();////click on save button
		
		
	}
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_Website_Header_img_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editCampaign");// open the edit Campaign Form Page.
		campaignModuleElement.typeToCampaignNameFieldParam("1 Year campaign for new user");//taking input from the Campaign Name
		campaignModuleElement.typeToshowAsNameOnWebsiteFieldParam("1 year campaign for all");// taking input from the Show As Name (On Website)
		campaignModuleElement.typeTowebsiteHeaderImageFieldParam("hhtps:websiteforurl/com");// taking input from the Website Header Img(External URL)
		campaignModuleElement.typeAndClearwebsiteHeaderImageFieldParam("");
		campaignModuleElement.typeToCouponCodeFieldParam("Q-1234");// taking input from the Coupon Code
		campaignModuleElement.typeToAffiliateShareFieldParam("10%");// taking input from the Affiliate Share (%)
		campaignModuleElement.campaignPeriodStartFromField();//select inputs data form the Campaign Period start from
		campaignModuleElement.campaignPeriodEndTimeField();// select inputs data form the  Campaign Period end date
		campaignModuleElement.typeSelectField();// select inputs data from the Status drop down field 
		campaignModuleElement.typeToRemarksFieldParam("JUST FOR PREMIUM USER");//  taking input from the remarks
		//campaignModuleElement.clickONSaveNowButton();////click on save button
		
	}
	//@Test(priority=25)
	public void paste_the_text_into_Website_Header_img_input_field_using_the_paste_action() throws IOException, InterruptedException{
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editCampaign");// open the edit Campaign Form Page.
		campaignModuleElement.typeToCampaignNameFieldParam("1 Year campaign for new user");//taking input from the Campaign Name
		campaignModuleElement.typeToshowAsNameOnWebsiteFieldParam("1 year campaign for all");// taking input from the Show As Name (On Website)
		campaignModuleElement.typeTowebsiteHeaderImageFieldParam("hhtps:websiteforurl/com");// taking input from the Website Header Img(External URL)
		campaignModuleElement.typeToCouponCodeFieldParam("Q-1234");// taking input from the Coupon Code
		campaignModuleElement.typeToAffiliateShareFieldParam("10%");// taking input from the Affiliate Share (%)
		campaignModuleElement.campaignPeriodStartFromField();//select inputs data form the Campaign Period start from
		campaignModuleElement.campaignPeriodEndTimeField();// select inputs data form the  Campaign Period end date
		campaignModuleElement.typeSelectField();// select inputs data from the Status drop down field 
		campaignModuleElement.typeToRemarksFieldParam("JUST FOR PREMIUM USER");//  taking input from the remarks
		//campaignModuleElement.clickONSaveNowButton();////click on save button
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}

