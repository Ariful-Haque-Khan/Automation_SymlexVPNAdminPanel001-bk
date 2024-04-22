/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_rate_plan;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewRatePlan;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class DescriptionFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewRatePlan addNewRatePlan;
	
	//Initializing PageFactory
	public DescriptionFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	public void addNewRatePlanCommon(String $description) throws IOException, InterruptedException {
		addNewRatePlan = loginPage.addNewRatePlanLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewRatePlan.openRatePlanNameFormPage();// open the Add New Payment Method Form Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year plan");//taking input from the Title
		addNewRatePlan.typeToRatePlanDescriptionElementParam($description);// taking input from the Key
		addNewRatePlan.clickToRatePlanStatusElement();// taking inputs from the Secret
		//addNewRatePlan.clickToRatePlanSubmitButtonElement(); //select Gateway Type drop down button
		
		
			
	}
	
	//@Ignore
	@Test(priority=1)
	public void enter_empty_text_into_description_input_field() throws IOException, InterruptedException {addNewRatePlanCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_description_input_field() throws IOException, InterruptedException {addNewRatePlanCommon("this plan 1 year");	}
	@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("a");}
	@Test(priority=5)
	public void enter_only_alphabetic_characters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("abcdefgh");}
	@Test(priority=6)
	public void enter_numeric_characters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("123456789123456789");}
	@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("abc1234567abc");}
	@Test(priority=8)
	public void enter_special_characters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("           ani1yr"); }
	@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("abc1yr                   ");}
	@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("asdfghjkzxcvbnm");}
	@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("anianiani");}
	@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("ABCdefasASD"); }
	@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon(",./;?.,;/.,./?><:;,./;.,"); }
	@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	@Test(priority=16)
	public void enter_text_with_unicode_characters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("こんにちは"); }
	@Test(priority=17)
	public void enter_text_containing_emojis_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("😊, 🐱, 🍕, 🎉"); }
	@Test(priority=18)
	public void enter_text_with_accented_characters_into_description_input_field() throws IOException, InterruptedException{addNewRatePlanCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_description_input_field() throws IOException, InterruptedException{ 
			
	}
	
	@Test(priority=21)
	public void enter_then_clear_the_text_into_description_input_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlanLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewRatePlan.openRatePlanNameFormPage();// open the Add New Payment Method Form Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year plan");//taking input from the Title
		addNewRatePlan.typeToRatePlanDescriptionElementParam("this plan 1 year ");// taking input from the Key
		addNewRatePlan.typeAndClearDescriptionInputField("");//clear the text
		addNewRatePlan.clickToRatePlanStatusElement();// taking inputs from the Secret
		//addNewRatePlan.clickToRatePlanSubmitButtonElement(); //select Gateway Type drop down button
		
	}
	@Test(priority=22)
	public void enter_then_undo_the_input_action_into_description_input_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlanLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewRatePlan.openRatePlanNameFormPage();// open the Add New Payment Method Form Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year plan");//taking input from the Title
		addNewRatePlan.typeToRatePlanDescriptionElementParam("this plan 1 year ");// taking input from the Key
		addNewRatePlan.typeAndClearDescriptionInputField("");//undo the text
		addNewRatePlan.clickToRatePlanStatusElement();// taking inputs from the Secret
		//addNewRatePlan.clickToRatePlanSubmitButtonElement(); //select Gateway Type drop down button
		
	}
	
	@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_description_input_field() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlanLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewRatePlan.openRatePlanNameFormPage();// open the Add New Payment Method Form Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year plan");//taking input from the Title
		addNewRatePlan.typeToRatePlanDescriptionElementParam("this plan 1 year ");// taking input from the Key
		addNewRatePlan.typeAndClearDescriptionInputField("");//undo the text
		addNewRatePlan.typeToRatePlanDescriptionElementParam("this plan 1 year ");//redo the tetx
		addNewRatePlan.clickToRatePlanStatusElement();// taking inputs from the Secret
		//addNewRatePlan.clickToRatePlanSubmitButtonElement(); //select Gateway Type drop down button
	}
	
	@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_description_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		addNewRatePlan = loginPage.addNewRatePlanLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewRatePlan.openRatePlanNameFormPage();// open the Add New Payment Method Form Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year plan");//taking input from the Title
		addNewRatePlan.typeToRatePlanDescriptionElementParam("this plan 1 year ");// taking input from the Key
		addNewRatePlan.typeAndTabKeyDescriptionInputFieldParam("");
		addNewRatePlan.clickToRatePlanStatusElement();// taking inputs from the Secret
		//addNewRatePlan.clickToRatePlanSubmitButtonElement(); //select Gateway Type drop down button
	}
	
	//@Test(priority=25)
	public void paste_the_text_into_description_input_field_using_the_paste_action() throws IOException, InterruptedException{
		addNewRatePlan = loginPage.addNewRatePlanLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewRatePlan.openRatePlanNameFormPage();// open the Add New Payment Method Form Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("1 year plan");//taking input from the Title
		addNewRatePlan.typeAndClearRatePlanNameInputField("");
		addNewRatePlan.typeToRatePlanDescriptionElementParam("this plan 1 year ");// taking input from the Key
		addNewRatePlan.clickToRatePlanStatusElement();// taking inputs from the Secret
		//addNewRatePlan.clickToRatePlanSubmitButtonElement(); //select Gateway Type drop down button
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}

