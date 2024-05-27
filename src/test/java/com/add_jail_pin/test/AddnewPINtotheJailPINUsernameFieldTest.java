/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_jail_pin.test;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewRatePlan;
import com.admin.qa.function.AddPINJail;
import com.admin.qa.function.CreateNewApp;
import com.admin.qa.function.OnlinePINMigration;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AddnewPINtotheJailPINUsernameFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddPINJail addPINJail;
	
	//Initializing PageFactory
	public AddnewPINtotheJailPINUsernameFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void addPINJailCommon(String Username) throws IOException, InterruptedException {
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam(Username);//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();// //select data from drop down field
		//addPINJail.clickONSaveButton(); //for disallowing submitting with the form data
		
	}
		
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_pin_username_input_field() throws IOException, InterruptedException {addPINJailCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_pin_username_input_field() throws IOException, InterruptedException {addPINJailCommon("ABC123");	}
	@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("a");}
	@Test(priority=5)
	public void enter_only_alphabetic_characters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("abcdefgh");}
	@Test(priority=6)
	public void enter_numeric_characters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("123456789123456789");}
	@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("abc1234567abc");}
	@Test(priority=8)
	public void enter_special_characters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("           ani1yr"); }
	@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("abc1yr                   ");}
	@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("asdfghjkzxcvbnm");}
	@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("anianiani");}
	@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("ABCdefasASD"); }
	@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon(",./;?.,;/.,./?><:;,./;.,"); }
	@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	@Test(priority=16)
	public void enter_text_with_unicode_characters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("こんにちは"); }
	@Test(priority=17)
	public void enter_text_containing_emojis_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("😊, 🐱, 🍕, 🎉"); }
	@Test(priority=18)
	public void enter_text_with_accented_characters_into_pin_username_input_field() throws IOException, InterruptedException{addPINJailCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_pin_username_input_field() throws IOException, InterruptedException{ }
			

	@Test(priority=21)
	//@Ignore
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("ABC123");//entering input into the PIN/username input field.
		addPINJail.typeAndClearPINorUsernamesParam("");//clear the text from the input field
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	@Test(priority=22)
	//@Ignore
	public void enter_then_undo_the_input_action_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("ABC123");//entering input into the PIN/username input field.
		addPINJail.typeAndClearPINorUsernamesParam("");//undo the text from the input field
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	@Test(priority=23)
	//@Ignore
	public void enter_then_undo_then_redo_the_input_action_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("ABC123");//taking input into the pin/username input field
		addPINJail.typeAndClearPINorUsernamesParam("");//undo the text from the input field
		addPINJail.typeToPINorUsernamesParam("ABC123");//redo the text again
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_the_input_field_using_the_tab_key() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("ABC123");//taking input into the pin/username input field
		addPINJail.typeToPINorUsernamesTabKey();//navigate to tab key
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	@Test(priority=25)
	//@Ignore
	public void paste_the_text_into_the_pin_or_username_field_using_the_paste_action() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("ABC123");
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
