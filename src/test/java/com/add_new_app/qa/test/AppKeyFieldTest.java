/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_app.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.CreateNewApp;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AppKeyFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	CreateNewApp createNewApp;
	
	//Initializing PageFactory
	public AppKeyFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void CreateNewAppCommon(String App_key) throws IOException, InterruptedException {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPNTest"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("VPNTest123");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam(App_key);//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		//createNewApp.clickToSaveButtonTest(); //for the save button
	}
	

	//@Ignore
	@Test(priority=1)
	public void enter_empty_text_into_App_key_input_field() throws IOException, InterruptedException {CreateNewAppCommon("");	}
	//@Test(priority=2)
	public void enter_a_valid_text_iinto_App_key_input_field() throws IOException, InterruptedException {CreateNewAppCommon("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4NjlhNjh");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njlh");}
	@Test(priority=8)
	public void enter_special_characters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("           M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njlh"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njlh                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("AAASDFGHJHGFDFGH");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_App_key_input_field() throws IOException, InterruptedException{CreateNewAppCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_App_key_input_field() throws IOException, InterruptedException{
			
	}
		//@Test(priority=21)
		//@Ignore
		public void enter_text_then_clear_the_input_text_field()throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("Symlex VPN"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.typeAndClearAppKeyInputField("");// clear the key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button


		}


		//@Test(priority=22)
		//@Ignore
		public void enter_then_undo_the_input_action_into_the_app_key_field()throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("Symlex VPN"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.typeAndClearAppKeyInputField("");//UNDO the key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button

		}


		//@Test(priority=23)
		//@Ignore
		public void enter_then_undo_then_redo_the_input_action_into_the_app_key_field() throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("Symlex VPN"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.typeAndClearAppKeyInputField("");// clear the key field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//REDO THE TEXT
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button
			
		}

		
		//@Test(priority=24)
		//@Ignore
		public void enter_text_and_navigate_through_the_input_field_using_the_tab_key()throws IOException,InterruptedException {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("Symlex VPN"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.typeAndTabKeyAppKeyInputFieldParam();// navigate to the tab key
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button


		}

		
		//@Test(priority=25)
		//@Ignore
		public void paste_the_text_into_the_template_app_key_field_using_the_paste_action() throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button

		}

		
		
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
