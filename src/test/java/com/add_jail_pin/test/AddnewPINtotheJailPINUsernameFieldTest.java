/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_jail_pin.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewRatePlan;
import com.admin.qa.function.CreateNewApp;
import com.admin.qa.function.OnlinePINMigration;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AddnewPINtotheJailPINUsernameFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	OnlinePINMigration onlinePINMigration;
	
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
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmail();// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmail();// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmail();//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmail(); //for taking inputs from the password of old pin input text field
		onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		
	}
	
	public void enter_the_above_maximum_allowed_length_of_characters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_the_below_minimum_allowed_length_of_characters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_only_alphabetic_characters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_numeric_characters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_special_characters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_with_leading_whitespaces_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_with_trailing_whitespaces_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_in_uppercase_letters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_in_lowercases_letters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_with_punctuation_marks_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_with_line_breaks_or_newlines_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_with_unicode_characters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_containing_emojis_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_with_accented_characters_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_default_placeholder_text_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{}
	public void enter_then_undo_the_input_action_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_then_undo_then_redo_the_input_action_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_and_navigate_through_the_input_field_using_the_tab_key() throws IOException, InterruptedException{}
	public void paste_the_text_into_the_template_id_field_using_the_paste_action() throws IOException, InterruptedException{}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
