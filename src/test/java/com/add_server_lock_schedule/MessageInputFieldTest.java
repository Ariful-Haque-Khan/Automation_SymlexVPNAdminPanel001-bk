/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_server_lock_schedule;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddServerLockSchedule;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class MessageInputFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddServerLockSchedule addServerLockSchedule;
	
	//Initializing PageFactory
	public MessageInputFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void addServerLockScheduleFormCommon(String message) throws IOException, InterruptedException {
		addServerLockSchedule = loginPage.addServerLockScheduleLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addServerLockSchedule.openAddServerLockScheduleForm();// open the Add New Notice Form Page.
		addServerLockSchedule.selectDatafromSelectServerDropDownElement();//select inputs data form the Notice Type drop down field
		addServerLockSchedule.selectDatafromUserTypeDropDownElement();// select inputs data form the User Type drop down field
		addServerLockSchedule.lockPeriodStartFromField();// select inputs data form the Operation Type drop down field
		addServerLockSchedule.lockPeriodEndFromField();// select inputs data form the Time Period Type drop down field
		addServerLockSchedule.statusSelectField();// select inputs data form the time to Type drop down field
		addServerLockSchedule.typeToMessageFieldParam(message);// select inputs data form the Page Control drop down field
		addServerLockSchedule.typeToRemarksFieldParam("");//taking inputs from the Notice Message input text field
		//addServerLockSchedule.clickONSaveNowtButton();//taking inputs from the Push Message input text field

	}
	
	//@Ignore
		//@Test(priority=1)
		public void enter_empty_text_into_Message_input_field() throws IOException, InterruptedException {addServerLockScheduleFormCommon("");	}
		@Test(priority=2)
		public void enter_a_valid_text_into_Message_input_field() throws IOException, InterruptedException {addServerLockScheduleFormCommon("test notice for automation");	}
		//@Test(priority=3)
		public void enter_the_above_maximum_allowed_length_of_characters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
		//@Test(priority=4)
		public void enter_the_below_minimum_allowed_length_of_characters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("a");}
		//@Test(priority=5)
		public void enter_only_alphabetic_characters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("abcdefgh");}
		//@Test(priority=6)
		public void enter_numeric_characters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("123456789123456789");}
		//@Test(priority=7)
		public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("abc1234567abc");}
		//@Test(priority=8)
		public void enter_special_characters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
		//@Test(priority=9)
		public void enter_text_with_leading_whitespaces_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("           ani1yr"); }
		//@Test(priority=10)
		public void enter_text_with_trailing_whitespaces_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("abc1yr                   ");}
		//@Test(priority=11)
		public void enter_text_in_uppercase_letters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("asdfghjkzxcvbnm");}
		//@Test(priority=12)
		public void enter_text_in_lowercases_letters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("anianiani");}
		//@Test(priority=13)
		public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("ABCdefasASD"); }
		//@Test(priority=14)
		public void enter_text_with_punctuation_marks_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon(",./;?.,;/.,./?><:;,./;.,"); }
		//@Test(priority=15)
		public void enter_text_with_line_breaks_or_newlines_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
					+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
		//@Test(priority=16)
		public void enter_text_with_unicode_characters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("こんにちは"); }
		//@Test(priority=17)
		public void enter_text_containing_emojis_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("😊, 🐱, 🍕, 🎉"); }
		//@Test(priority=18)
		public void enter_text_with_accented_characters_into_Message_input_field() throws IOException, InterruptedException{addServerLockScheduleFormCommon("á, ç, ō,  á, ç, ō");}
		//@Test(priority=19)
		public void enter_default_placeholder_text_into_Message_input_field() throws IOException, InterruptedException{
				
		}
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
