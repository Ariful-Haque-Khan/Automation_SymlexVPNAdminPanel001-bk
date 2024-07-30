/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.push_automation;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.PushAutomationForm;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class PushAutomationPinWithCommaSeperatedFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	PushAutomationForm pushAutomationForm;
	
	//Initializing PageFactory
	public PushAutomationPinWithCommaSeperatedFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	public void PushAutomationFormCommon(String pin_with_comma) throws IOException, InterruptedException {
		pushAutomationForm = loginPage.pushAutomationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		pushAutomationForm.openPushAutomationFormPage();// open add push automation form page
		pushAutomationForm.selectDatafromAppNameDropDownElement();// select app name from dropdown.
		pushAutomationForm.pushTemplateDropDownElementdHighlight();// select pushtemplate from dropdown.
		pushAutomationForm.selectDatafromPushTemplateDropDownElement();// select Autopush from dropdown.
		pushAutomationForm.typeToPinWithCommaParam(pin_with_comma);
		
	}
	//@Ignore
		@Test(priority=1) 
		public void enter_empty_text_into_the_comma_separated_input_field() throws IOException, InterruptedException {PushAutomationFormCommon("");	}
		//@Test(priority=2) 
		public void enter_a_valid_text_into_the_comma_separated_input_field() throws IOException, InterruptedException {PushAutomationFormCommon("123");	}
		//@Test(priority=3) 
		public void enter_the_above_maximum_allowed_length_of_characters_into_the_comma_separated_input_field() throws IOException, InterruptedException{PushAutomationFormCommon("1234567891234567899876543211234567899987654321234567898765432123456787654321");}
		//@Test(priority=4)
		public void enter_the_below_minimum_allowed_length_of_characters_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("1");}
		//@Test(priority=5)
		public void enter_only_alphabetic_characters_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("abcdefgh");}
		//@Test(priority=6)
		public void enter_numeric_characters_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("123456789123456789");}
		//@Test(priority=7)
		public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("123zxc");}
		//@Test(priority=8)
		public void enter_special_characters_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("!@#$%^&*!@#$%^&*@gmail.com"); }
		//@Test(priority=9)
		public void enter_text_with_leading_whitespaces_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("         123456"); }
		//@Test(priority=10)
		public void enter_text_with_trailing_whitespaces_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("123456                  ");}
		//@Test(priority=11)
		public void enter_text_in_uppercase_letters_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("ABC@GMAIL.COM");}
		//@Test(priority=12)
		public void enter_text_in_lowercases_letters_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("abc@gmail.com");}
		//@Test(priority=13)
		public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("ABCdef@gmail.com"); }
		//@Test(priority=14)
		public void enter_text_with_punctuation_marks_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon(",./;?.,;/.,./?><:;,./;.,"); }
		//@Test(priority=15)
		public void enter_text_with_line_breaks_or_newlines_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("\\\\\"883da8da-ba2e-4966-a025-d1a2483\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
					+ "				+ \"				+ \\\"                                  \\\\\\\"ba2e-4966-a025-d\\\\\\\""); }
		//@Test(priority=16)
		public void enter_text_with_unicode_characters_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("こんにちは"); }
		//@Test(priority=17)
		public void enter_text_containing_emojis_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("😊, 🐱, 🍕, 🎉"); }
		//@Test(priority=18)
		public void enter_text_with_accented_characters_into_the_comma_separated_input_field() throws IOException, InterruptedException{ PushAutomationFormCommon("á, ç, ō,  á, ç, ō");}
		//@Test(priority=19)
		public void enter_default_placeholder_text_into_the_comma_separated_input_field() throws IOException, InterruptedException{
			
		}

	
	

	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
