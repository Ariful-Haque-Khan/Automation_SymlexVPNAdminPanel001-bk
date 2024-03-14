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

	
	
	@Test(priority=1)
	//@Ignore
	public void AddNewRatePlanForm() throws IOException, InterruptedException {
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the pin or username input text field
		addPINJail.clickONSaveButton(); //for disallowing submitting with the form data
		
	}
	
	public void enter_empty_text_into_the_new_pin_or_username_input_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.typeToPINorUsernamesParam("");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
		
	}
	
	public void enter_the_above_maximum_allowed_length_of_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanika@kolpolok.com");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_the_below_minimum_allowed_length_of_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("a");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_only_alphabetic_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("abcdefgh");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_numeric_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("123456789123456789");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("abc123@gmail.com");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_special_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("!@#$%^&*!@#$%^&*@gmail.com");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_with_leading_whitespaces_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("           abc@gmail.com");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_with_trailing_whitespaces_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("abc@gmail.com                   ");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_in_uppercase_letters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("ABC@GMAIL.COM");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_in_lowercases_letters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("abc@gmail.com");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("ABCdef@gmail.com");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_with_punctuation_marks_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam(",./;?.,;/.,./?><:;,./;.,");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_with_line_breaks_or_newlines_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("\\\"883da8da-ba2e-4966-a025-d1a2483\\\\n\\\" +\\r\\n\"\r\n"
				+ "				+ \"                                  \\\"ba2e-4966-a025-d\\\"");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_with_unicode_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("こんにちは");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_containing_emojis_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("😊, 🐱, 🍕, 🎉");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_with_accented_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.typeToPINorUsernamesParam("á, ç, ō,  á, ç, ō");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_default_placeholder_text_into_the_rate_name_field() throws IOException, InterruptedException{
		
		test("a","");
		test("a","");
		
		
		test("adsfsdf","");
		test("a","fsdf");
		test("afsdfdsf","");
		test("a","fsfdsfsf");
		
	}
	
	public void test(String pinparam1,String pinparam2)throws IOException, InterruptedException {
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam(pinparam1);// open the Online Migration Form Page.
		addPINJail.typeToPINorUsernamesParam(pinparam2);// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton();
		
	}
	
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("a");// open the Online Migration Form Page.
		addPINJail.typeToPINorUsernamesParam("");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_then_undo_the_input_action_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("a");// open the Online Migration Form Page.
		addPINJail.typeToPINorUsernamesParam("");
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_then_undo_then_redo_the_input_action_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("a");// open the Online Migration Form Page.
		addPINJail.typeToPINorUsernamesParam("");
		addPINJail.typeToPINorUsernamesParam("a");
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void enter_text_and_navigate_through_the_input_field_using_the_tab_key() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("a");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	public void paste_the_text_into_the_pin_or_username_field_using_the_paste_action() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();
		addPINJail.typeToPINorUsernamesParam("NNNNNNN");// open the Online Migration Form Page.
		addPINJail.typeToPINorUsernamesTabKey();// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
