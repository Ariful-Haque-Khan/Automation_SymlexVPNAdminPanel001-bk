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
	//@Test(priority=1) 
	public void enter_empty_text_into_the_number_of_days_input_field() throws IOException, InterruptedException {AddNewRatePlanFormCommon("");	}
	//@Test(priority=2) 
	public void enter_a_valid_text_into_the_number_of_days_input_field() throws IOException, InterruptedException {AddNewRatePlanFormCommon("123");	}
	//@Test(priority=3) 
	public void enter_the_above_maximum_allowed_length_of_characters_into_the_number_of_days_input_field() throws IOException, InterruptedException{AddNewRatePlanFormCommon("1234567891234567899876543211234567899987654321234567898765432123456787654321");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("1");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("123zxc");}
	//@Test(priority=8)
	public void enter_special_characters_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("!@#$%^&*!@#$%^&*@gmail.com"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("         123456"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("123456                  ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("ABC@GMAIL.COM");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("abc@gmail.com");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("ABCdef@gmail.com"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("\\\\\"883da8da-ba2e-4966-a025-d1a2483\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ba2e-4966-a025-d\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_the_number_of_days_input_field() throws IOException, InterruptedException{ AddNewRatePlanFormCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_the_number_of_days_input_field() throws IOException, InterruptedException{
		
	}
	//@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("123");//for taking inputs from the Number of Days input text field
		addPINValidity.typeAndClearNumberofDaysParam("");//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
	}
	@Test(priority=21)
	public void enter_then_undo_the_input_action_into_the_number_of_days_input_field() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("1234");//for taking inputs from the Number of Days input text field
		addPINValidity.typeAndClearNumberofDaysParam("");//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
	}
	@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_the_number_of_days_input_field() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("123");//for taking inputs from the Number of Days input text field
		addPINValidity.typeAndClearNumberofDaysParam("");//for taking inputs from the Number of Days input text field
		addPINValidity.typeToNumberofDaysParam("123");//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
	}
	//@Test(priority=23)
	public void enter_text_and_navigate_through_the_input_field_using_the_tab_key() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("123");//for taking inputs from the Number of Days input text field
		addPINValidity.typeToNumberofDaysTabKey();//for taking inputs from the Number of Days input text field
		addPINValidity.typeelementDropDownField();// select value from the dropdown field called PIN Type
		addPINValidity.typeToPINinCSVorNewLineParam("rumy1yr");//for taking inputs from the PIN in CSV or New Line input text field
		//addPINValidity.clickOnSubmitButton(); //for disallowing submitting with the form data
	}
	//@Test(priority=24)
	public void paste_the_text_into_the_number_of_days_input_field_using_the_paste_action() throws IOException, InterruptedException{
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addPINValidity.openAddPINvalidityReport();// open the add pin in jail Form Page.
		addPINValidity.typeToNumberofDaysParam("123");//for taking inputs from the Number of Days input text field
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
