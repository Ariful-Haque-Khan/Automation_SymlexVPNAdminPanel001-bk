/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.rate.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewRatePlan;
import com.admin.qa.function.CreateNewApp;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AddNewratePlanDescriptionFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewRatePlan addNewRatePlan;
	
	//Initializing PageFactory
	public AddNewratePlanDescriptionFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	/* ***** Test _Blank!!! */
	/*@Test(priority=1)
	//@Ignore
	public void TestAddNewServerBlankForm() throws IOException, InterruptedException {
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElement();// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElement();// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		addNewRatePlan.clickToRatePlanSubmitButtonElement(); //for submitting with the form data
		
	}*/
	
	
	
	//@Test(priority=1)
	//@Ignore
	public void enter_empty_text_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("test");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement(); //for submitting with the form data
	}
	
	
	//@Test(priority=2)
	//@Ignore
	public void enter_a_valid_description_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("the price of 1 year package is 100 dollar");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
	}
	
	
	//@Test(priority=3)
	//@Ignore
	public void enter_the_above_maximum_allowed_length_of_characters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("testffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqaccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggglkjhgfdsakjhgfdsalkjhgfdsmnbvcxoiuytrewqkjhgfds");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
	}
	
	
	@Test(priority=4)
	//@Ignore
	public void enter_the_below_minimum_allowed_length_of_characters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("1");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
	
	}
	
	
	//@Test(priority=5)
	//@Ignore
	public void enter_only_alphabetic_characters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("xcbksdcjhdcbjhdcbkdh");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
	}
	
	
	//@Test(priority=6)
	//@Ignore
	public void enter_numeric_characters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("12345678912234456678");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
	}
	
	
	//@Test(priority=7)
	//@Ignore
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("1123451 year pack 123456");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
	}
	
	
	//@Test(priority=8)
	//@Ignore
	public void enter_special_characters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("!@#$%^&*!@#$%^&*!@#$%^&*");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
	}
	
	
	//@Test(priority=9)
	//@Ignore
	public void enter_text_with_leading_whitespaces_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("!@#$%^&*!@#$%^&*!@#$%^&*");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
	}
	
	
	//@Test(priority=10)
	//@Ignore
	public void enter_text_with_trailing_whitespaces_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("the price of 1 year package is 100 dollar                       ");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
	}
	
	
	//@Test(priority=11)
	//@Ignore
	public void enter_text_in_uppercase_letters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("THE PRICE OF 1 YEAR PACKAGE IS 100 DOOLAR");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data	
		
	}
	
	
	//@Test(priority=12)
	//@Ignore
	public void enter_text_in_lowercases_letters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("the price of 1 year package is 100 dollar");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data	
	}
	
	
	//@Test(priority=13)
	//@Ignore
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("The price of 1 year package is 100 dollar");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data	
		
	}
	
	//@Test(priority=14)
	//@Ignore
	public void enter_text_with_punctuation_marks_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam(",./;,./;,./;,./;,.,;,./");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data	
		
	}
	
	
	//@Test(priority=15)
	//@Ignore
	public void enter_text_with_line_breaks_or_newlines_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("\"883da8da-ba2e-4966-a025-d1a2483\\n\" +\r\n"
				+ "                                  \"ba2e-4966-a025-d\"");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data	
	}
	
	
	//@Test(priority=16)
	//@Ignore
	public void enter_text_with_unicode_characters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("こんにちは");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data	
	}
	
	
	//@Test(priority=17)
	//@Ignore
	public void enter_text_containing_emojis_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("😊, 🐱, 🍕, 🎉");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data	
	}
	
	
	//@Test(priority=18)
	//@Ignore
	public void enter_text_with_accented_characters_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year pack");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("á, ç, ō,  á, ç, ō");// for taking inputs from the rate description input textarea field
		addNewRatePlan.clickToRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data	
	}
	
	//@Test(priority=19)
	//@Ignore
	public void enter_default_placeholder_text_into_the_rate_plan_description_field() throws IOException, InterruptedException{
		
	}
	
	
	//@Test(priority=20)
	//@Ignore
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{}
	public void enter_then_undo_the_input_action_into_the_rate_plan_description_field() throws IOException, InterruptedException{}
	public void enter_then_undo_then_redo_the_input_action_into_the_rate_name_field() throws IOException, InterruptedException{}
	public void enter_text_and_navigate_through_the_input_field_using_the_tab_key() throws IOException, InterruptedException{}
	public void paste_the_text_into_the_template_id_field_using_the_paste_action() throws IOException, InterruptedException{}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
