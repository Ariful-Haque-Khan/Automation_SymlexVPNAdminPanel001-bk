/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_signup_blacklist_domain;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewSignUpBlacklistDomain;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class DomainNameFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewSignUpBlacklistDomain addNewSignUpBlacklistDomain;
	
	
	
	//Initializing PageFactory
	public DomainNameFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void addNewSignUpBlacklistDomainCommon(String Domain_Name) throws IOException, InterruptedException {
		addNewSignUpBlacklistDomain = loginPage.addNewSignUpBlacklistDomainLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewSignUpBlacklistDomain.openAddNewSignUpBlacklistDomainForm();// open the Add New Sign Up Black list Domain Page.
		addNewSignUpBlacklistDomain.typeDomainNameFieldParam(Domain_Name);//taking input from the Domain Name
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
				
		
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Domain_Name_input_field() throws IOException, InterruptedException {addNewSignUpBlacklistDomainCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_Domain_Name_input_field() throws IOException, InterruptedException {addNewSignUpBlacklistDomainCommon("ABC123");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("ABCdefasASD"); }
	@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon(",./;?.,;/.,./?><:;,./;.,"); }
	@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("こんにちは"); }
	@Test(priority=17)
	public void enter_text_containing_emojis_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("😊, 🐱, 🍕, 🎉"); }
	@Test(priority=18)
	public void enter_text_with_accented_characters_into_Domain_Name_input_field() throws IOException, InterruptedException{addNewSignUpBlacklistDomainCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Domain_Name_input_field() throws IOException, InterruptedException{ 
			
	}

	@Test(priority=21)
	public void enter_then_clear_the_text_into_coupon_code_input_field() throws IOException, InterruptedException{
		addNewSignUpBlacklistDomain = loginPage.addNewSignUpBlacklistDomainLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewSignUpBlacklistDomain.openAddNewSignUpBlacklistDomainForm();// open the Add New Sign Up Black list Domain Page.
		addNewSignUpBlacklistDomain.typeDomainNameFieldParam("abc-domain");//taking input from the Domain Name
		addNewSignUpBlacklistDomain.typeAndClearDomainNameFieldParam("");//clear the text
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
		
	}
	
	@Test(priority=22)
	public void enter_then_undo_the_input_action_into_coupon_code_input_field() throws IOException, InterruptedException{
		addNewSignUpBlacklistDomain = loginPage.addNewSignUpBlacklistDomainLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewSignUpBlacklistDomain.openAddNewSignUpBlacklistDomainForm();// open the Add New Sign Up Black list Domain Page.
		addNewSignUpBlacklistDomain.typeDomainNameFieldParam("abc-domain");//taking input from the Domain Name
		addNewSignUpBlacklistDomain.typeAndClearDomainNameFieldParam("");//undo the text
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
		
	}
	
	@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_coupon_code_input_field() throws IOException, InterruptedException{
		addNewSignUpBlacklistDomain = loginPage.addNewSignUpBlacklistDomainLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewSignUpBlacklistDomain.openAddNewSignUpBlacklistDomainForm();// open the Add New Sign Up Black list Domain Page.
		addNewSignUpBlacklistDomain.typeDomainNameFieldParam("abc-domain");//taking input from the Domain Name
		addNewSignUpBlacklistDomain.typeAndClearDomainNameFieldParam("");//undo the text
		addNewSignUpBlacklistDomain.typeDomainNameFieldParam("abc-domain");//redo the text
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
		
	}
	
	@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_coupon_code_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		addNewSignUpBlacklistDomain = loginPage.addNewSignUpBlacklistDomainLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewSignUpBlacklistDomain.openAddNewSignUpBlacklistDomainForm();// open the Add New Sign Up Black list Domain Page.
		addNewSignUpBlacklistDomain.typeDomainNameFieldParam("abc-domain");//taking input from the Domain Name
		addNewSignUpBlacklistDomain.typetoDomainNametabKey();// navigate the tab key
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
		
	}
	
	//@Test(priority=25)
	public void paste_the_text_into_coupon_code_input_field_using_the_paste_action() throws IOException, InterruptedException{
		addNewSignUpBlacklistDomain = loginPage.addNewSignUpBlacklistDomainLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewSignUpBlacklistDomain.openAddNewSignUpBlacklistDomainForm();// open the Add New Sign Up Black list Domain Page.
		addNewSignUpBlacklistDomain.typeDomainNameFieldParam("abc-domain");//taking input from the Domain Name
		addNewSignUpBlacklistDomain.typeAndClearDomainNameFieldParam("");//clear the text
		//addNewSignUpBlacklistDomain.clickONSubmitButton();// click on save button
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}


