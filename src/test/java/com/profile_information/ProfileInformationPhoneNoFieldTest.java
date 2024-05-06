/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.profile_information;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.ProfileInformation;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class ProfileInformationPhoneNoFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	ProfileInformation profileInformation;
	
	
	//Initializing PageFactory
	public ProfileInformationPhoneNoFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void profileInformationCommon(String Phone_No) throws IOException, InterruptedException {
		profileInformation = loginPage.profileInformationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		profileInformation.openProfileInformationForm();// open the Profile Information Page.
		profileInformation.typeBillingNameFieldParam("");//taking input from the role Name
		profileInformation.typePhoneNoFieldParam(Phone_No);// taking input from the Phone No
		profileInformation.typeEmailFieldParam("abc@gmail.com");// taking inputs from the Email
		profileInformation.typeSkypeFieldParam("aniSkype"); //  taking inputs from the skype
		profileInformation.typeViberWhatsAppImoFieldParam("aniViber"); //  taking inputs from the viber
		profileInformation.typeAddressFieldParam("Mohammadpur"); //  taking inputs from the address
		//profileInformation.typeLogoFieldParam("");
		//profileInformation.clickONSubmitButton();
		
	}

	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Phone_No_input_field() throws IOException, InterruptedException {profileInformationCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_Phone_No_input_field() throws IOException, InterruptedException {profileInformationCommon("0171112345");	}
	@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Phone_No_input_field() throws IOException, InterruptedException{profileInformationCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Phone_No_input_field() throws IOException, InterruptedException{ 
			
	}

	@Test(priority=21)
	public void enter_then_clear_the_text_into_Phone_No_input_field() throws IOException, InterruptedException{
		profileInformation = loginPage.profileInformationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		profileInformation.openProfileInformationForm();// open the Profile Information Page.
		profileInformation.typeBillingNameFieldParam("Symlex ");//taking input from the role Name
		profileInformation.typePhoneNoFieldParam("012231234123");// taking input from the Phone No
		profileInformation.typeAndClearPhoneNoFieldParam("");//clear the text
		profileInformation.typeEmailFieldParam("abc@gmail.com");// taking inputs from the Email
		profileInformation.typeSkypeFieldParam("aniSkype"); //  taking inputs from the skype
		profileInformation.typeViberWhatsAppImoFieldParam("aniViber"); //  taking inputs from the viber
		profileInformation.typeAddressFieldParam("Mohammadpur"); //  taking inputs from the address
		//profileInformation.clickONSubmitButton();
		
	}
	//@Test(priority=22)
	public void enter_then_undo_the_input_action_into_Phone_No_input_field() throws IOException, InterruptedException{
		profileInformation = loginPage.profileInformationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		profileInformation.openProfileInformationForm();// open the Profile Information Page.
		profileInformation.typeBillingNameFieldParam("Symlex ");//taking input from the role Name
		profileInformation.typePhoneNoFieldParam("012231234123");// taking input from the Phone No
		profileInformation.typeAndClearPhoneNoFieldParam("");//clear the text
		profileInformation.typeEmailFieldParam("abc@gmail.com");// taking inputs from the Email
		profileInformation.typeSkypeFieldParam("aniSkype"); //  taking inputs from the skype
		profileInformation.typeViberWhatsAppImoFieldParam("aniViber"); //  taking inputs from the viber
		profileInformation.typeAddressFieldParam("Mohammadpur"); //  taking inputs from the address
		//profileInformation.clickONSubmitButton();
	}
	
	//@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_Phone_No_input_field() throws IOException, InterruptedException{
		profileInformation = loginPage.profileInformationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		profileInformation.openProfileInformationForm();// open the Profile Information Page.
		profileInformation.typeBillingNameFieldParam("Symlex ");//taking input from the role Name
		profileInformation.typePhoneNoFieldParam("012231234123");// taking input from the Phone No
		profileInformation.typeAndClearPhoneNoFieldParam("");//undo the text
		profileInformation.typePhoneNoFieldParam("012231234123");//redo thet text
		profileInformation.typeEmailFieldParam("abc@gmail.com");// taking inputs from the Email
		profileInformation.typeSkypeFieldParam("aniSkype"); //  taking inputs from the skype
		profileInformation.typeViberWhatsAppImoFieldParam("aniViber"); //  taking inputs from the viber
		profileInformation.typeAddressFieldParam("Mohammadpur"); //  taking inputs from the address
		//profileInformation.clickONSubmitButton();
	}
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_Phone_No_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		profileInformation = loginPage.profileInformationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		profileInformation.openProfileInformationForm();// open the Profile Information Page.
		profileInformation.typeBillingNameFieldParam("Symlex ");//taking input from the role Name
		profileInformation.typePhoneNoFieldParam("012231234123");// taking input from the Phone No
		profileInformation.typetoPhoneNotabKey();//navigate to the tab key
		profileInformation.typeEmailFieldParam("abc@gmail.com");// taking inputs from the Email
		profileInformation.typeSkypeFieldParam("aniSkype"); //  taking inputs from the skype
		profileInformation.typeViberWhatsAppImoFieldParam("aniViber"); //  taking inputs from the viber
		profileInformation.typeAddressFieldParam("Mohammadpur"); //  taking inputs from the address
		//profileInformation.clickONSubmitButton();
	}
	
	//@Test(priority=25)
	public void paste_the_text_into_Phone_No_input_field_using_the_paste_action() throws IOException, InterruptedException{
		profileInformation = loginPage.profileInformationLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		profileInformation.openProfileInformationForm();// open the Profile Information Page.
		profileInformation.typeBillingNameFieldParam("Symlex ");//taking input from the role Name
		profileInformation.typePhoneNoFieldParam("012231234123");// taking input from the Phone No
		profileInformation.typeEmailFieldParam("abc@gmail.com");// taking inputs from the Email
		profileInformation.typeSkypeFieldParam("aniSkype"); //  taking inputs from the skype
		profileInformation.typeViberWhatsAppImoFieldParam("aniViber"); //  taking inputs from the viber
		profileInformation.typeAddressFieldParam("Mohammadpur"); //  taking inputs from the address
		//profileInformation.clickONSubmitButton();
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}
