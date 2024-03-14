/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_pin_validity.test;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewRatePlan;
import com.admin.qa.function.AddPINJail;
import com.admin.qa.function.AddPINValidity;
import com.admin.qa.function.CreateNewApp;
import com.admin.qa.function.OnlinePINMigration;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AddPINValidityNumberofDaysFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddPINValidity addPINValidity;
	
	//Initializing PageFactory
	public AddPINValidityNumberofDaysFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	public void AddNewRatePlanFormCommon(String number_of_days) throws IOException, InterruptedException {
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam(number_of_days);//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
		
	}
	//@Ignore
	@Test(priority=1) 
	public void enter_empty_text_into_the_new_pin_or_username_input_field() throws IOException, InterruptedException {AddNewRatePlanFormCommon("");	}
	@Test(priority=1)
	public void enter_the_above_maximum_allowed_length_of_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{AddNewRatePlanFormCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanika@kolpolok.com");}
	@Test(priority=1)
	public void enter_the_below_minimum_allowed_length_of_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("a");}
	@Test(priority=1)
	public void enter_only_alphabetic_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("abcdefgh");}
	@Test(priority=1)
	public void enter_numeric_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("123456789123456789");}
	@Test(priority=1)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("abc123@gmail.com");}
	@Test(priority=1)
	public void enter_special_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("!@#$%^&*!@#$%^&*@gmail.com"); }
	@Test(priority=1)
	public void enter_text_with_leading_whitespaces_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("           abc@gmail.com"); }
	@Test(priority=1)
	public void enter_text_with_trailing_whitespaces_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("abc@gmail.com                   ");}
	@Test(priority=1)
	public void enter_text_in_uppercase_letters_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("ABC@GMAIL.COM");}
	@Test(priority=1)
	public void enter_text_in_lowercases_letters_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("abc@gmail.com");}
	@Test(priority=1)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("ABCdef@gmail.com"); }
	@Test(priority=1)
	public void enter_text_with_punctuation_marks_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon(",./;?.,;/.,./?><:;,./;.,"); }
	@Test(priority=1)
	public void enter_text_with_line_breaks_or_newlines_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("\\\\\"883da8da-ba2e-4966-a025-d1a2483\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ba2e-4966-a025-d\\\\\\\""); }
	@Test(priority=1)
	public void enter_text_with_unicode_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("こんにちは"); }
	@Test(priority=1)
	public void enter_text_containing_emojis_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("😊, 🐱, 🍕, 🎉"); }
	@Test(priority=1)
	public void enter_text_with_accented_characters_into_the_pin_or_username_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("á, ç, ō,  á, ç, ō");}
	@Test(priority=1)
	public void enter_default_placeholder_text_into_the_rate_name_field() throws IOException, InterruptedException{
		
	}
	@Test(priority=1)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("a");//for taking inputs from the Number of Days input text field
		addPINValidity.typeToNumberofDaysParam("");//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
	}
	@Test(priority=1)
	public void enter_then_undo_the_input_action_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("a");//for taking inputs from the Number of Days input text field
		addPINValidity.typeToNumberofDaysParam("");//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
	}
	@Test(priority=1)
	public void enter_then_undo_then_redo_the_input_action_into_the_pin_or_username_field() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("a");//for taking inputs from the Number of Days input text field
		addPINValidity.typeToNumberofDaysParam("");//for taking inputs from the Number of Days input text field
		addPINValidity.typeToNumberofDaysParam("a");//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
	}
	@Test(priority=1)
	public void enter_text_and_navigate_through_the_input_field_using_the_tab_key() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("a");//for taking inputs from the Number of Days input text field
		addPINValidity.typeToNumberofDaysTabKey();//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
	}
	@Test(priority=1)
	public void paste_the_text_into_the_pin_or_username_field_using_the_paste_action() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("a");//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/
}
