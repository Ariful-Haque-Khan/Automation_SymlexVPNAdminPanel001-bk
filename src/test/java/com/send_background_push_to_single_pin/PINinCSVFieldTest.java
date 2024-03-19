/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.send_background_push_to_single_pin;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.SendBackgroundorSilentPushtoSinglePIN;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class PINinCSVFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	SendBackgroundorSilentPushtoSinglePIN sendBackgroundorSilentPushtoSinglePIN;
	
	//Initializing PageFactory
	public PINinCSVFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	public void SendBackgroundorSilentPushtoSinglePINFormCommon(String pin_in_csv) throws IOException, InterruptedException {
		sendBackgroundorSilentPushtoSinglePIN = loginPage.sendBackgroundorSilentPushtoSinglePINLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendBackgroundorSilentPushtoSinglePIN.openSendBackgroundorSilentPushtoSinglePINPage();// open the send background/silent push to single pin Form Page.
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownAppNameField();//select inputs data from the app name dropdown field
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownPushTypeField();// select inputs data form the push type  dropdown field
		sendBackgroundorSilentPushtoSinglePIN.typetothePINinCSVParam(pin_in_csv);//  taking inputs from the PIN in CSV input text field
		//sendBackgroundorSilentPushtoSinglePIN.clickONSaveButton();// for submit button
		
		
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_PIN_in_CSV_input_field() throws IOException, InterruptedException {SendBackgroundorSilentPushtoSinglePINFormCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_PIN_in_CSV_input_field() throws IOException, InterruptedException {SendBackgroundorSilentPushtoSinglePINFormCommon("ani1yr");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{SendBackgroundorSilentPushtoSinglePINFormCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_charactersinto_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{ SendBackgroundorSilentPushtoSinglePINFormCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{
			
	}
	//@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		sendBackgroundorSilentPushtoSinglePIN = loginPage.sendBackgroundorSilentPushtoSinglePINLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendBackgroundorSilentPushtoSinglePIN.openSendBackgroundorSilentPushtoSinglePINPage();// open the send background/silent push to single pin Form Page.
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownAppNameField();//select inputs data from the app name dropdown field
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownPushTypeField();// for select inputs data form the push type  dropdown field
		sendBackgroundorSilentPushtoSinglePIN.typetothePINinCSVParam("ani1yrrrrr");// for taking inputs from the Price USD input text field
		sendBackgroundorSilentPushtoSinglePIN.typeAndClearthePINinCSVParam("");// clear the text
		//sendBackgroundorSilentPushtoSinglePIN.clickONSaveButton();// for submit button
	}
	//@Test(priority=21)
	public void enter_then_undo_the_input_action_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{
		sendBackgroundorSilentPushtoSinglePIN = loginPage.sendBackgroundorSilentPushtoSinglePINLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendBackgroundorSilentPushtoSinglePIN.openSendBackgroundorSilentPushtoSinglePINPage();// open the send background/silent push to single pin Form Page.
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownAppNameField();//select inputs data from the app name dropdown field
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownPushTypeField();// for select inputs data form the push type  dropdown field
		sendBackgroundorSilentPushtoSinglePIN.typetothePINinCSVParam("ani1yrrrrr");// taking inputs from the PIN in CSV input text field
		sendBackgroundorSilentPushtoSinglePIN.typeAndClearthePINinCSVParam("");
		//sendBackgroundorSilentPushtoSinglePIN.clickONSaveButton();// for submit button
	
	}
	//@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_PIN_in_CSV_input_field() throws IOException, InterruptedException{
		sendBackgroundorSilentPushtoSinglePIN = loginPage.sendBackgroundorSilentPushtoSinglePINLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendBackgroundorSilentPushtoSinglePIN.openSendBackgroundorSilentPushtoSinglePINPage();// open the send background/silent push to single pin Form Page.
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownAppNameField();//select inputs data from the app name dropdown field
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownPushTypeField();// for select inputs data form the push type  dropdown field
		sendBackgroundorSilentPushtoSinglePIN.typetothePINinCSVParam("ani1yrrrrr");// taking inputs from the PIN in CSV input text field
		sendBackgroundorSilentPushtoSinglePIN.typeAndClearthePINinCSVParam("");
		sendBackgroundorSilentPushtoSinglePIN.typetothePINinCSVParam("ani1yrrrrr");
		//sendBackgroundorSilentPushtoSinglePIN.clickONSaveButton();// for submit button
	}
	//@Test(priority=23)
	@Ignore
	public void enter_text_and_navigate_through_into_PIN_in_CSV_input_field_using_the_tab_key() throws IOException, InterruptedException{
		sendBackgroundorSilentPushtoSinglePIN = loginPage.sendBackgroundorSilentPushtoSinglePINLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendBackgroundorSilentPushtoSinglePIN.openSendBackgroundorSilentPushtoSinglePINPage();// open the send background/silent push to single pin Form Page.
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownAppNameField();//select inputs data from the app name dropdown field
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownPushTypeField();// for select inputs data form the push type  dropdown field
		sendBackgroundorSilentPushtoSinglePIN.typetothePINinCSVParam("ani1yrrrrr");// taking inputs from the PIN in CSV input text field
		sendBackgroundorSilentPushtoSinglePIN.typetothePINinCSVParamTabKey();
		//sendBackgroundorSilentPushtoSinglePIN.clickONSaveButton();// for submit button
	}
	//@Test(priority=24)
	public void paste_the_text_into_PIN_in_CSV_input_field_using_the_paste_action() throws IOException, InterruptedException{
		sendBackgroundorSilentPushtoSinglePIN = loginPage.sendBackgroundorSilentPushtoSinglePINLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendBackgroundorSilentPushtoSinglePIN.openSendBackgroundorSilentPushtoSinglePINPage();// open the send background/silent push to single pin Form Page.
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownAppNameField();//select inputs data from the app name dropdown field
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownPushTypeField();// for select inputs data form the push type  dropdown field
		sendBackgroundorSilentPushtoSinglePIN.typetothePINinCSVParam("");// taking inputs from the PIN in CSV input text field
		//sendBackgroundorSilentPushtoSinglePIN.clickONSaveButton();// for submit button
	}
		
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
	
	
	

