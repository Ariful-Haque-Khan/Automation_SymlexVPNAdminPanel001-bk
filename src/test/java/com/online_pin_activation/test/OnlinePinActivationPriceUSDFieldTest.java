/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.online_pin_activation.test;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddPINValidity;
import com.admin.qa.function.OnlinePINActivation;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class OnlinePinActivationPriceUSDFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	OnlinePINActivation onlinePINActivation;
	
	//Initializing PageFactory
	public OnlinePinActivationPriceUSDFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	public void OnlinePinActivationFormCommon(String price_usd) throws IOException, InterruptedException {
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page.
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("abcdefghji");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam(price_usd);// for taking inputs from the Price USD input text field
		onlinePINActivation.typetotheUsernameandPINParam("ani1yr");// for taking inputs from the Username/PIN input text field
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
		
		
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_price_usd_input_field() throws IOException, InterruptedException {OnlinePinActivationFormCommon("");	}
	//@Test(priority=2)
	public void enter_a_valid_text_into_price_usd_input_field() throws IOException, InterruptedException {OnlinePinActivationFormCommon("120");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_price_usd_input_field() throws IOException, InterruptedException{OnlinePinActivationFormCommon("123456789098765432123333456789098765432123456789876543212345678900000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("1");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("abc1234567890");}
	//@Test(priority=8)
	public void enter_special_characters_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("!@#$%^&*!@#$%^&*@gmail.com"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("           123456789"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("11111112345                 ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("ABC@GMAIL.COM");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("abc@gmail.com");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("ABCdef@gmail.com"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("\\\\\"1111111111111111111111111111\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"22222222222222222222222222\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_price_usd_input_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_price_usd_input_field() throws IOException, InterruptedException{
			
	}
	//@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page. 
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typeAndClearthePriceUSDParam("");//clear the text
		onlinePINActivation.typetotheUsernameandPINParam("ani1yr");// for taking inputs from the Username/PIN input text field
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
	}
	//@Test(priority=21)
	public void enter_then_undo_the_input_action_into_price_usd_input_field() throws IOException, InterruptedException{
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page. 
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typeAndClearthePriceUSDParam("");//clear the text
		onlinePINActivation.typetotheUsernameandPINParam("ani1yr");// for taking inputs from the Username/PIN input text field
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
	}
	@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_price_usd_input_field() throws IOException, InterruptedException{
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page. 
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typeAndClearthePriceUSDParam("");//clear the text
		onlinePINActivation.typetothePriceUSDParam("10");
		onlinePINActivation.typetotheUsernameandPINParam("ani1yr");// for taking inputs from the Username/PIN input text field
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
	}
	//@Test(priority=23)
	@Ignore
	public void enter_text_and_navigate_through_into_price_usd_input_field_using_the_tab_key() throws IOException, InterruptedException{
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page.
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typetotheUsernameandPINParam("ani1yr");// for taking inputs from the Username/PIN input text field
		onlinePINActivation.typetotheUsernameandPINParamTabKey();// for taking inputs from the Payment TNX ID input text field
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
	}
	//@Test(priority=24)
	public void paste_the_text_into_price_usd_input_field_using_the_paste_action() throws IOException, InterruptedException{
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page.
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typetotheUsernameandPINParam("");// for taking inputs from the Username/PIN input text field
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
	}
		
	/*
	@AfterMethod
	public void tearDown() {
	    super.tearDown();
	}*/

}
