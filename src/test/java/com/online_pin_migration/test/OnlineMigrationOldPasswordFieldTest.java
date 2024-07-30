/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.online_pin_migration.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewRatePlan;
import com.admin.qa.function.AppListElement;
import com.admin.qa.function.OnlinePINMigration;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class OnlineMigrationOldPasswordFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	OnlinePINMigration onlinePINMigration;
	
	//Initializing PageFactory
	public OnlineMigrationOldPasswordFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	//@Test(priority=1)
	//@Ignore
	public void enter_empty_text_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.comas");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam(""); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
				
	}
	//@Test(priority=2)
	//@Ignore
	public void enter_a_valid_password_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("987654"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
			
	}
		
		
	//@Test(priority=3)
	//@Ignore
	public void enter_the_above_maximum_allowed_length_of_characters_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("987654555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
	//@Test(priority=4)
	//@Ignore
	public void enter_the_below_minimum_allowed_length_of_characters_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("98"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
	//@Test(priority=5)
	//@Ignore
	public void enter_only_alphabetic_characters_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("asdfgfd"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
		
	//@Test(priority=6)
	//@Ignore
	public void enter_numeric_characters_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("987654"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
	//@Test(priority=7)
	//@Ignore
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("sddddddddddddd987654"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
	//@Test(priority=8)
	//@Ignore
	public void enter_special_characters_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("!@#$%^&*&^%$#@");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("!@#$%^&*&^%$#@"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
	//@Test(priority=9)
	//@Ignore
	public void enter_text_with_leading_whitespaces_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("12345678");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("                    987654"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
	//@Test(priority=10)
	//@Ignore
	public void enter_text_with_trailing_whitespaces_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456789");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("987654                                        "); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
	//@Test(priority=11)
	//@Ignore
	public void enter_text_in_uppercase_letters_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("ABCASDFGHJ");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("ASDFGHJKZXCVBNM"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
		
	//@Test(priority=12)
	//@Ignore
	public void enter_text_in_lowercases_letters_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("asdfghjmnbvcxzasdfghj");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("zxcvbnmasdfghjk"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
			
			
	}
	
		
	//@Test(priority=13)
	//@Ignore
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("abcdABCD");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam("asdfghjklASDFGHJK"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
		
	//@Test(priority=14)
	//@Ignore
	public void enter_text_with_punctuation_marks_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
		onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
		onlinePINMigration.typeTopasswordforNewPINandEmailParam("1234567");// for taking inputs from the password of new pin input text field
		onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
		onlinePINMigration.typeTopasswordforOldPINandEmailParam(",./;/.,<>?:?><>?:?><.;"); //for taking inputs from the password of old pin input text field
		//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
		//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
		//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
	}
		
		
		//@Test(priority=15)
		//@Ignore
		public void enter_text_with_line_breaks_or_newlines_into_the_old_password_input_field() throws IOException, InterruptedException{
			onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
			onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
			onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("12345678");// for taking inputs from the password of new pin input text field
			onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
			onlinePINMigration.typeTopasswordforOldPINandEmailParam("\"ABNJSHGFHGF\\n\" +\r\n"
					+ "                                  \"1234567\""); //for taking inputs from the password of old pin input text field
			//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
			//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
			//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		}
		
		
		
		//@Test(priority=16)
		//@Ignore
		public void enter_text_with_unicode_characters_into_the_old_password_input_field() throws IOException, InterruptedException{
			onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
			onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
			onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("1234567");// for taking inputs from the password of new pin input text field
			onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
			onlinePINMigration.typeTopasswordforOldPINandEmailParam("こんにちは"); //for taking inputs from the password of old pin input text field
			//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
			//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
			//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		}
		
		
		//@Test(priority=17)
		//@Ignore
		public void enter_text_containing_emojis_into_the_old_password_input_field() throws IOException, InterruptedException{
			onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
			onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
			onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456");// for taking inputs from the password of new pin input text field
			onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
			onlinePINMigration.typeTopasswordforOldPINandEmailParam("😊, 🐱, 🍕, 🎉"); //for taking inputs from the password of old pin input text field
			//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
			//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
			//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		}
		
		
		//@Test(priority=18)
		//@Ignore
		public void enter_text_with_accented_characters_into_the_old_password_input_field() throws IOException, InterruptedException{
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
			onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
			onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456");// for taking inputs from the password of new pin input text field
			onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
			onlinePINMigration.typeTopasswordforOldPINandEmailParam("á, ç, ō,  á, ç, ō"); //for taking inputs from the password of old pin input text field
			//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
			//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
			//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		}
		
		
		//@Test(priority=19)
	    //@Ignore
		public void enter_default_placeholder_text_into_the_old_password_input_field() throws IOException, InterruptedException{}
		
		
		
		@Test(priority=20)
		//@Ignore
		public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
			onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
			onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
			onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("12345678");// for taking inputs from the password of new pin input text field
			onlinePINMigration.typeAndClearpasswordforOldPINandEmailParam("");
			onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
			onlinePINMigration.typeTopasswordforOldPINandEmailParam("987654"); //for taking inputs from the password of old pin input text field
			//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
			//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
			//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		}
		
		
		
		//@Test(priority=21)
		//@Ignore
		public void enter_then_undo_the_input_action_into_the_old_password_input_field() throws IOException, InterruptedException{
			onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
			onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
			onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("12345678");// for taking inputs from the password of new pin input text field
			onlinePINMigration.typeAndClearpasswordforOldPINandEmailParam("");
			onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
			onlinePINMigration.typeTopasswordforOldPINandEmailParam("987654"); //for taking inputs from the password of old pin input text field
			//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
			//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
			//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		}
		
		
		
		//@Test(priority=22)
		//@Ignore
		public void enter_then_undo_then_redo_the_input_action_into_the_old_password_input_field() throws IOException, InterruptedException{
			onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
			onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
			onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("12345678");// for taking inputs from the password of new pin input text field
			onlinePINMigration.typeAndClearpasswordforOldPINandEmailParam("");
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("12345678");
			onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
			onlinePINMigration.typeTopasswordforOldPINandEmailParam("987654"); //for taking inputs from the password of old pin input text field
			//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
			//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
			//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		}
		
		
		
		//@Test(priority=23)
		//@Ignore
		public void enter_text_and_navigate_through_the_input_field_using_the_tab_key() throws IOException, InterruptedException{
			onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
			onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
			onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("123");// for taking inputs from the password of new pin input text field
			onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
			onlinePINMigration.typeAndTabKeypasswordforOldPINandEmailParam("");//clear the new password text input field
			//onlinePINMigration.typeTopasswordforOldPINandEmailParam("987654"); //for taking inputs from the password of old pin input text field
			//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
			//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
			//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		}
		
		
		//@Test(priority=24)
		//@Ignore
		public void paste_the_text_into_the_old_password_input_field_using_the_paste_action() throws IOException, InterruptedException{
			onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
			onlinePINMigration.openOnlinePINMigrationPage();// open the Online Migration Form Page.
			onlinePINMigration.typeToNewPINandEmailParam("abc@gmail.com");// for taking inputs from the email or new pin input text field
			onlinePINMigration.typeTopasswordforNewPINandEmailParam("123456789");// for taking inputs from the password of new pin input text field
			onlinePINMigration.typeToOldPINandEmailParam("abc@gmail.com");//for taking inputs from the old email or old pin input text field
			onlinePINMigration.typeTopasswordforOldPINandEmailParam("987654"); //for taking inputs from the password of old pin input text field
			//onlinePINMigration.clickOnmigrationNowButton(); //for submitting with the form data
			//onlinePINMigration.clickOnpopUpYesButton(); //for final permission submitting with the form data
			//onlinePINMigration.clickPopUpNoButton(); //for disallowing submitting with the form data
		}
		
		/*
		@AfterMethod
		public void tearDown() {
			super.tearDown();
		}*/

	}

