/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.edit_discount_for_camapign;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.CampaignModuleElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class EditDiscountAmountFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	CampaignModuleElement campaignModuleElement;
	
	//Initializing PageFactory
	public EditDiscountAmountFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void editDiscountforCampaign(String discount_Amount) throws IOException, InterruptedException {
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editDiscountForm");// open the Edit Discount for Campaign Form Page.
		campaignModuleElement.typeToDiscountAmountFieldParam(discount_Amount);// taking input from the Discount Amount
		campaignModuleElement.typeToExtraBonusFieldParam("10");//taking input from the Extra Bonus Validity in days
		//campaignModuleElement.clickOnUpdateEditDiscountButton();////click on update button
			
	}
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_discount_Amount_input_field() throws IOException, InterruptedException {editDiscountforCampaign("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_discount_Amount_input_field() throws IOException, InterruptedException {editDiscountforCampaign("20.98");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_discount_Amount_input_field() throws IOException, InterruptedException{editDiscountforCampaign("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_discount_Amount_input_field() throws IOException, InterruptedException{ 
			
	}
	@Test(priority=21)
	public void enter_then_clear_the_text_into_discount_Amount_input_field() throws IOException, InterruptedException{
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editDiscountForm");// open the Edit Discount for Campaign Form Page.
		campaignModuleElement.typeToDiscountAmountFieldParam("20.00");// taking input from the Discount Amount
		campaignModuleElement.typeAndClearDiscountAmountFieldParam("");//clear the text
		campaignModuleElement.typeToExtraBonusFieldParam("10");//taking input from the Extra Bonus Validity in days
		//campaignModuleElement.clickOnUpdateEditDiscountButton();////click on update button
		
	}
	@Test(priority=22)
	public void enter_then_undo_the_input_action_into_discount_Amount_input_field() throws IOException, InterruptedException{
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editDiscountForm");// open the Edit Discount for Campaign Form Page.
		campaignModuleElement.typeToDiscountAmountFieldParam("20.00");// taking input from the Discount Amount
		campaignModuleElement.typeAndClearDiscountAmountFieldParam("");//undo the text
		campaignModuleElement.typeToExtraBonusFieldParam("10");//taking input from the Extra Bonus Validity in days
		//campaignModuleElement.clickOnUpdateEditDiscountButton();////click on update button
		
	}
	
	@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_discount_Amount_input_field() throws IOException, InterruptedException{
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editDiscountForm");// open the Edit Discount for Campaign Form Page.
		campaignModuleElement.typeToDiscountAmountFieldParam("20.00");// taking input from the Discount Amount
		campaignModuleElement.typeAndClearDiscountAmountFieldParam("");//undo the text
		campaignModuleElement.typeToDiscountAmountFieldParam("20.00");//redo the text
		campaignModuleElement.typeToExtraBonusFieldParam("10");//taking input from the Extra Bonus Validity in days
		//campaignModuleElement.clickOnUpdateEditDiscountButton();////click on update button
		
	}
	
	@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_discount_Amount_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editDiscountForm");// open the Edit Discount for Campaign Form Page.
		campaignModuleElement.typeToDiscountAmountFieldParam("20.00");// taking input from the Discount Amount
		campaignModuleElement.typeAndClearDiscountAmountFieldParam("");
		campaignModuleElement.typetoEditDiscountAmounttabKey();//taking input from the Extra Bonus Validity in days
		//campaignModuleElement.clickOnUpdateEditDiscountButton();////click on update button
		
	}
	//@Test(priority=25)
	public void paste_the_text_into_discount_Amount_input_field_using_the_paste_action() throws IOException, InterruptedException{
		campaignModuleElement = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/campaign/editDiscountForm");// open the Edit Discount for Campaign Form Page.
		campaignModuleElement.typeToDiscountAmountFieldParam("20.00");// taking input from the Discount Amount
		campaignModuleElement.typeToExtraBonusFieldParam("10");//taking input from the Extra Bonus Validity in days
		//campaignModuleElement.clickOnUpdateEditDiscountButton();////click on update button
	}
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/				
}
