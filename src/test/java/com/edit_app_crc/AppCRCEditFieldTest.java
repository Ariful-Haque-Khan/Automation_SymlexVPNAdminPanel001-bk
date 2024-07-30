/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.edit_app_crc;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AppCrcBlockListElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AppCRCEditFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AppCrcBlockListElement appCrcBlockListElement;
	
	//Initializing PageFactory
	public AppCRCEditFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void editAppCRCCommon(String App_CRC) throws IOException, InterruptedException {
		appCrcBlockListElement = loginPage.addNewBlockAppCRCLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/Application/edit_block_cr/616"); //open the Edit Banner Form Page.
		//appCrcBlockListElement.typeAppCRCFieldParam("");
		Thread.sleep(3000);
		appCrcBlockListElement.typeAndClearAppCRCFieldParam("");//clear the text
		//Thread.sleep(3000);
		appCrcBlockListElement.typeAppCRCFieldParam(App_CRC);//taking input from the APP CRC
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
				
		
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_App_CRC_Edit_input_field() throws IOException, InterruptedException {editAppCRCCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_App_CRC_Edit_input_field() throws IOException, InterruptedException {editAppCRCCommon("ABC123");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("           ani1yr"); }
	// @Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{editAppCRCCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{ 
			
	}

	//@Test(priority=21)
	public void enter_then_clear_the_text_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{
		appCrcBlockListElement = loginPage.addNewBlockAppCRCLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/Application/edit_block_cr/616"); //open the Edit Banner Form Page.
		Thread.sleep(3000);
		appCrcBlockListElement.typeAndClearAppCRCFieldParam("");//clear the text
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
		
	}
	
	//@Test(priority=22)
	public void enter_then_undo_the_input_action_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{
		appCrcBlockListElement = loginPage.addNewBlockAppCRCLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/Application/edit_block_cr/616"); //open the Edit Banner Form Page.
		Thread.sleep(3000);
		appCrcBlockListElement.typeAndClearAppCRCFieldParam("");//clear the text
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
		
	}
	
	//@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_App_CRC_Edit_input_field() throws IOException, InterruptedException{
		appCrcBlockListElement = loginPage.addNewBlockAppCRCLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		appCrcBlockListElement.openAddNewBlockAppCRCForm();// open the Add New (Block App CRC) Page.
		appCrcBlockListElement.typeAppCRCFieldParam("ABC123");//taking input from the APP CRC
		appCrcBlockListElement.typeAndClearAppCRCFieldParam("");//undo the text
		appCrcBlockListElement.typeAppCRCFieldParam("ABC123");//REDO THE TEXT
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
		
	}
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_App_CRC_Edit_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		appCrcBlockListElement = loginPage.addNewBlockAppCRCLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		appCrcBlockListElement.openAddNewBlockAppCRCForm();// open the Add New (Block App CRC) Page.
		appCrcBlockListElement.typeAppCRCFieldParam("");//taking input from the APP CRC
		appCrcBlockListElement.typetoAppCRCtabKey();//clear the text
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
	}
	
	//@Test(priority=25)
	public void paste_the_text_into_App_CRC_Edit_input_field_using_the_paste_action() throws IOException, InterruptedException{
		appCrcBlockListElement = loginPage.addNewBlockAppCRCLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		appCrcBlockListElement.openAddNewBlockAppCRCForm();// open the Add New (Block App CRC) Page.
		appCrcBlockListElement.typeAppCRCFieldParam("");//taking input from the APP CRC
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}


