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

	
	
	// ***** Test _Blank!!! 
    @Test(priority=1)
	//@Ignore
	public void enter_empty_text_into_the_app_ID_field() throws IOException, InterruptedException {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		createNewApp.clickToSaveButtonTest(); //for the save button
			
			
	}
		
		
	//@Test(priority=2)
	//@Ignore
	public void enter_a_valid_app_id_into_the_app_ID_field() throws IOException, InterruptedException {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		//createNewApp.clickToSaveButtonTest(); //for the save button

			
	}
		      
		   
	//@Test(priority=3)
	//@Ignore
	public void enter_the_above_maximum_allowed_length_of_characters_into_the_app_id_field () throws IOException, InterruptedException{
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a248883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a2483883da8da-ba2e-4966-a025-d1a24833883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		createNewApp.clickToSaveButtonTest(); //for the save button

			
	}

	//@Test(priority=4)
	//@Ignore
    public void enter_the_below_minimum_allowed_length_of_characters_into_the_app_id_field() throws  IOException,InterruptedException {
	    createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("88");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		createNewApp.clickToSaveButtonTest(); //for the save button

	}

	//@Test(priority=5)
	//@Ignore
	public void enter_only_alphabetic_characters_into_the_app_id_field()throws  IOException,InterruptedException  {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("abcdefghijklmnop");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		//createNewApp.clickToSaveButtonTest(); //for the save button


	}


	//@Test(priority=6)
	//@Ignore
	public void enter_numeric_characters_into_the_app_id_field()throws IOException,InterruptedException {
	    createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("88382496602512483");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		//createNewApp.clickToSaveButtonTest(); //for the save button

			
	}

	    
	//@Test(priority=7)
	//@Ignore
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_app_id_field()throws IOException,InterruptedException {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		//createNewApp.clickToSaveButtonTest(); //for the save button
			

	}


	//@Test(priority=8)
	//@Ignore
	public void enter_special_characters_into_the_app_id_field()throws IOException,InterruptedException {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("!@#$%^&*!@#$%^&**&^%$#@!");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		createNewApp.clickToSaveButtonTest(); //for the save button

	}   

	//@Test(priority=9)
	//@Ignore
	public void enter_text_with_leading_whitespaces_into_the_app_id_field() throws IOException,InterruptedException {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
	    createNewApp.typeToAPPIDOneSignalTestParam("                                     883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		createNewApp.clickToSaveButtonTest(); //for the save button

	}   

		
	//@Test(priority=10)
	//@Ignore
	public void enter_text_with_trailing_whitespaces_into_the_app_id_field() throws IOException,InterruptedException  {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483                                                      ");//for taking inputs into the app id field
		//createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		createNewApp.clickToSaveButtonTest(); //for the save button

	}   

		
	//@Test(priority=11)
	//@Ignore
	public void enter_text_with_spaces_within_the_content_into_the_app_id_field() throws IOException,InterruptedException  {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		createNewApp.typeToAPPIDOneSignalTestParam("883da8da    -ba2e    -4966     -a025-d1a2483");//for taking inputs into the app id field
		createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
		createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
		createNewApp.clickToSaveButtonTest(); //for the save button

	}

	//@Test(priority=12)
	//@Ignore
	public void enter_text_in_uppercase_letters_into_the_app_id_field() throws IOException,InterruptedException {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("ASDFGHLIYGHBJVHJFDCHGFJHGXFDXNHMGJHFHJGHJ");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button


		}


		//@Test(priority=13)
		//@Ignore
		public void enter_text_in_lowercases_letters_into_the_app_id_field() throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
		    createNewApp.typeToAPPIDOneSignalTestParam("assdfghjklasdfghjklasdfghjkl");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button


		}

		 
		//@Test(priority=14)
		//@Ignore
		public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_the_app_id_field() throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("assASSFG345ASDFasdf");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button

			
		}

		
		//@Test(priority=15)
		//@Ignore
		public void enter_text_with_punctuation_marks_into_the_app_id_field() throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam(",./;,./;,./;");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			createNewApp.clickToSaveButtonTest(); //for the save button

			
		}


		//@Test(priority=16)
		//@Ignore
		public void enter_text_with_line_breaks_or_newlines_into_the_app_id_field() throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("\"883da8da-ba2e-4966-a025-d1a2483\\n\" +\r\n"
					+ "                                  \"ba2e-4966-a025-d\"");
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button

		}


		//@Test(priority=17)
		//@Ignore
		public void enter_text_with_unicode_characters_into_the_app_id_field()throws IOException,InterruptedException {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("こんにちは");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			createNewApp.clickToSaveButtonTest(); //for the save button 

		}


		//@Test(priority=18)
		//@Ignore
		public void enter_text_containing_emojis_into_the_app_id_field() throws IOException,InterruptedException {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN12345"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("😊, 🐱, 🍕, 🎉");//for taking inputs into the app id field
			//createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			createNewApp.clickToSaveButtonTest(); //for the save button


		}

		
		@Test(priority=19)
		//@Ignore
		public void enter_text_with_accented_characters_into_the_app_id_field()throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN1234"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("á, ç, ō,  á, ç, ō");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button


		}

		
		//@Test(priority=20)
		//@Ignore
		public void enter_default_placeholder_text_into_the_app_id_field()throws IOException,InterruptedException {
			

		}

		
		//@Test(priority=21)
		//@Ignore
		public void enter_text_then_clear_the_input_text_field()throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("Symlex VPN"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			createNewApp.typeAndClearAppIDInputField("");// clear the key field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			createNewApp.clickToSaveButtonTest(); //for the save button


		}


		//@Test(priority=22)
		//@Ignore
		public void enter_then_undo_the_input_action_into_the_app_id_field()throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("Symlex VPN"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			createNewApp.typeAndClearAppIDInputField("");// undo the text of  the key field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			createNewApp.clickToSaveButtonTest(); //for the save button

		}


		//@Test(priority=23)
		//@Ignore
		public void enter_then_undo_then_redo_the_input_action_into_the_app_id_field() throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("Symlex VPN"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			createNewApp.typeAndClearAppIDInputField("");// undo the text of  the key field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
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
			createNewApp.typeAndTabKeyAppIDInputFieldParam("");// navigate to the tab key
			//createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			createNewApp.clickToSaveButtonTest(); //for the save button


		}

		
		//@Test(priority=25)
		//@Ignore
		public void paste_the_text_into_the_template_id_field_using_the_paste_action() throws IOException,InterruptedException  {
			createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
			createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
			createNewApp.typeToAppNameInputFieldParam("SymlexlVPN"); //for taking inputs into the app name field
			createNewApp.typeToAPPIDOneSignalTestParam("883da8da-ba2e-4966-a025-d1a2483");//for taking inputs into the app id field
			//createNewApp.typeToAPPKeyOneSignalTestParam("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njl");//for taking inputs into the app key field
			createNewApp.clickToIsUDIDCheckChekboxInputTest();//for clicking UDID check box
			//createNewApp.clickToSaveButtonTest(); //for the save button

		}

		
		
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
