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
import com.admin.qa.function.OnlinePINMigration;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class OnlinePinActivationPaymentTNXIDFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	OnlinePINActivation onlinePINActivation;
	
	//Initializing PageFactory
	public OnlinePinActivationPaymentTNXIDFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void OnlinePinActivationFormCommon(String pin_information) throws IOException, InterruptedException {
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page.
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam(pin_information);// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typetotheUsernameandPINParam("rumy1yr");// for taking inputs from the Price USD input text field
		onlinePINActivation.selectPaymentVia();//select inputs data from the Payment Via input text field
		onlinePINActivation.selectRatePlan();//select inputs data from the Rate Plan input text field
		onlinePINActivation.typetotheRemarksParam("test");
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
		
	}
	@Test(priority=1)
	public void enter_empty_text_into_the_payment_tnx_id_input_field() throws IOException, InterruptedException {OnlinePinActivationFormCommon("");	}
	@Test(priority=1)
	public void enter_the_above_maximum_allowed_length_of_characters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{OnlinePinActivationFormCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanika@kolpolok.com");}
	@Test(priority=1)
	public void enter_the_below_minimum_allowed_length_of_characters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("a");}
	@Test(priority=1)
	public void enter_only_alphabetic_characters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("abcdefgh");}
	@Test(priority=1)
	public void enter_numeric_characters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("123456789123456789");}
	@Test(priority=1)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("abc123@gmail.com");}
	@Test(priority=1)
	public void enter_special_characters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("!@#$%^&*!@#$%^&*@gmail.com"); }
	@Test(priority=1)
	public void enter_text_with_leading_whitespaces_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("           abc@gmail.com"); }
	@Test(priority=1)
	public void enter_text_with_trailing_whitespaces_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("abc@gmail.com                   ");}
	@Test(priority=1)
	public void enter_text_in_uppercase_letters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("ABC@GMAIL.COM");}
	@Test(priority=1)
	public void enter_text_in_lowercases_letters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("abc@gmail.com");}
	@Test(priority=1)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("ABCdef@gmail.com"); }
	@Test(priority=1)
	public void enter_text_with_punctuation_marks_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon(",./;?.,;/.,./?><:;,./;.,"); }
	@Test(priority=1)
	public void enter_text_with_line_breaks_or_newlines_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("\\\\\"883da8da-ba2e-4966-a025-d1a2483\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ba2e-4966-a025-d\\\\\\\""); }
	@Test(priority=1)
	public void enter_text_with_unicode_characters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("こんにちは"); }
	@Test(priority=1)
	public void enter_text_containing_emojis_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("😊, 🐱, 🍕, 🎉"); }
	@Test(priority=1)
	public void enter_text_with_accented_characters_into_the_payment_tnx_id_field() throws IOException, InterruptedException{ OnlinePinActivationFormCommon("á, ç, ō,  á, ç, ō");}
	@Test(priority=1)
	public void enter_default_placeholder_text_into_the_rate_name_field() throws IOException, InterruptedException{
		
	}
	@Test(priority=1)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page.
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePaymentTNXIDParamClear();// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typetotheUsernameandPINParam("rumy1yr");// for taking inputs from the Username/PIN input text field
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
	}
	@Test(priority=1)
	public void enter_then_undo_the_input_action_into_the_payment_tnx_id_field() throws IOException, InterruptedException{
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page.
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePaymentTNXIDParam("");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typetotheUsernameandPINParam("rumy1yr");// for taking inputs from the Username/PIN input text field
		onlinePINActivation.selectPaymentVia();//select inputs data from the Payment Via input text field
		onlinePINActivation.selectRatePlan();//select inputs data from the Rate Plan input text field
		onlinePINActivation.typetotheRemarksParam("test");
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
	}
	@Test(priority=1)
	public void enter_then_undo_then_redo_the_input_action_into_the_payment_tnx_id_field() throws IOException, InterruptedException{
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page.
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePaymentTNXIDParamClear();// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typetotheUsernameandPINParam("rumy1yr");// for taking inputs from the Username/PIN input text field
		onlinePINActivation.selectPaymentVia();//select inputs data from the Payment Via input text field
		onlinePINActivation.selectRatePlan();//select inputs data from the Rate Plan input text field
		onlinePINActivation.typetotheRemarksParam("test");
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
	}
	@Test(priority=1)
	@Ignore
	public void enter_text_and_navigate_through_the_input_field_using_the_tab_key() throws IOException, InterruptedException{
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINActivation.openOnlinePINActivationPage();// open the online pin activation Form Page.
		onlinePINActivation.selectPaymentGateway();//select inputs data from the Payment Gateway input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePaymentTNXIDParamClear();// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePaymentTNXIDParam("1122rertt");// for taking inputs from the Payment TNX ID input text field
		onlinePINActivation.typetothePriceUSDParam("10");// for taking inputs from the Price USD input text field
		onlinePINActivation.typetothePaymentTNXIDParam("rumy1yr");// for taking inputs from the Username/PIN input text field
		onlinePINActivation.selectPaymentVia();//select inputs data from the Payment Via input text field
		onlinePINActivation.selectRatePlan();//select inputs data from the Rate Plan input text field
		onlinePINActivation.typetotheRemarksParam("test");
		//onlinePINActivation.clickOnSubmitButton(); //for submitting with the form data
		//onlinePINActivation.clickPopUpYesButton(); //for allowing submitting with the form data
	}
	@Test(priority=1)
	public void paste_the_text_into_the_payment_tnx_id_field_using_the_paste_action() throws IOException, InterruptedException{
		OnlinePinActivationFormCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanika@kolpolok.com");
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
