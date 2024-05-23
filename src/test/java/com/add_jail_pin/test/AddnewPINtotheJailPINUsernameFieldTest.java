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
		addPINJail.searchandtypeelementDropDownField();// //select data from drop down field
		//addPINJail.clickONSaveButton(); //for disallowing submitting with the form data
		
	}
	
	
	@Test(priority=1)
	//@Ignore
	public void enter_empty_text_into_the_new_pin_or_username_input_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField(); //select data from drop down field
		addPINJail.clickONSaveButton(); //for submitting with the form data
		
	}
	
	
	@Test(priority=2)
	//@Ignore
	public void enter_a_valid_text_into_the_new_pin_or_username_input_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("rumy@kolpolok.com");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
			
	}
	
	
	@Test(priority=3)
	//@Ignore
	public void enter_the_above_maximum_allowed_length_of_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanika@kolpolok.com");// open the Online Migration Form Page.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=4)
	//@Ignore
	public void enter_the_below_minimum_allowed_length_of_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();;// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("a");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=5)
	//@Ignore
	public void enter_only_alphabetic_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("abcdefgh");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=6)
	//@Ignore
	public void enter_numeric_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("123456789123456789");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=7)
	//@Ignore
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("abc123@gmail.com");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	@Test(priority=8)
	//@Ignore
	public void enter_special_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("!@#$%^&*!@#$%^&*@gmail.com");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=9)
	//@Ignore
	public void enter_text_with_leading_whitespaces_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("           abc@gmail.com");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=10)
	//@Ignore
	public void enter_text_with_trailing_whitespaces_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("abc@gmail.com                   ");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=11)
	//@Ignore
	public void enter_text_in_uppercase_letters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("ABC@GMAIL.COM");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=12)
	//@Ignore
	public void enter_text_in_lowercases_letters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("abc@gmail.com");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=13)
	//@Ignore
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("ABCdef@gmail.com");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	@Test(priority=14)
	//@Ignore
	public void enter_text_with_punctuation_marks_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam(",./;?.,;/.,./?><:;,./;.,");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=15)
	//@Ignore
	public void enter_text_with_line_breaks_or_newlines_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("\\\"883da8da-ba2e-4966-a025-d1a2483\\\\n\\\" +\\r\\n\"\r\n"
				+ "				+ \"                                  \\\"ba2e-4966-a025-d\\\"");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	@Test(priority=16)
	//@Ignore
	public void enter_text_with_unicode_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("ã�“ã‚“ã�«ã�¡ã�¯");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=17)
	//@Ignore
	public void enter_text_containing_emojis_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("ðŸ˜Š, ðŸ�±, ðŸ�•, ðŸŽ‰");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=18)
	//@Ignore
	public void enter_text_with_accented_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("Ã¡, Ã§, Å�,  Ã¡, Ã§, Å�");//entering input into the PIN/username input field.
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	//@Test(priority=19)
	//@Ignore
	public void enter_default_placeholder_text_into_the_rate_name_field() throws IOException, InterruptedException{
		
		test("a","");
		test("a","");	
		test("adsfsdf","");
		test("a","fsdf");
		test("afsdfdsf","");
		test("a","fsfdsfsf");
		
	}
	
	
	//@Test(priority=20)
	//@Ignore
	public void test(String pinparam1,String pinparam2)throws IOException, InterruptedException {
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam(pinparam1);
		addPINJail.typeToPINorUsernamesParam(pinparam2);
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton();
		
	}
	
	
	@Test(priority=21)
	//@Ignore
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("a");//entering input into the PIN/username input field.
		addPINJail.typeAndClearPINorUsernamesParam("");//clear the text from the input field
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=22)
	//@Ignore
	public void enter_then_undo_the_input_action_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("a");//entering input into the PIN/username input field.
		addPINJail.typeAndClearPINorUsernamesParam("");//undo the text from the input field
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=23)
	//@Ignore
	public void enter_then_undo_then_redo_the_input_action_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("a");//taking input into the pin/username input field
		addPINJail.typeAndClearPINorUsernamesParam("");//undo the text from the input field
		addPINJail.typeToPINorUsernamesParam("a");//redo the text again
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_the_input_field_using_the_tab_key() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("a");//taking input into the pin/username input field
		addPINJail.typeToPINorUsernamesTabKey();//navigate to tab key
		addPINJail.searchandtypeelementDropDownField();//select data from drop down field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	
	@Test(priority=25)
	//@Ignore
	public void paste_the_text_into_the_pin_or_username_field_using_the_paste_action() throws IOException, InterruptedException{
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINJail.openAddPINJail();// open the add pin in jail Form Page.
		addPINJail.typeToPINorUsernamesParam("NNNNNNN");
		
		addPINJail.searchandtypeelementDropDownField();// for taking inputs from the email or new pin input text field
		//addPINJail.clickONSaveButton(); //for submitting with the form data
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
