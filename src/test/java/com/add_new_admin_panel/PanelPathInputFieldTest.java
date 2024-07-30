/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_admin_panel;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewAdminPanelElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class PanelPathInputFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewAdminPanelElement addNewAdminPanelElement;
	
	//Initializing PageFactory
	public PanelPathInputFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	public void AddNewAdminPanelCommon(String panel_path) throws IOException, InterruptedException {
		addNewAdminPanelElement = loginPage.addNewAdminPanelElementLogin(props.getProperty("username"),props.getProperty("password"));
		addNewAdminPanelElement.openAddNewAdminPanelForm(); //open the Add New Admin Panel Page.
		addNewAdminPanelElement.typeToClientNameInputFieldParam("Test vpn"); //for taking inputs into the Client Name field
		addNewAdminPanelElement.typeToBrandNameInputFieldParam("Test VPN");//for taking inputs into the Brand Name field
		addNewAdminPanelElement.typeToPanelNameInputFieldParam("Test vpn");//for taking inputs into the Panel Name field
		addNewAdminPanelElement.typeToPanelPathInputFieldParam(panel_path);//for taking inputs into the Panel path field
		addNewAdminPanelElement.typeToLoginNameInputFieldParam("Tester");//for taking inputs into the Login Name field
		addNewAdminPanelElement.typeToLoginPasswordInputFieldParam("123456");//for taking inputs into the Login Password field
		addNewAdminPanelElement.checkisSinglePinCheckboxElement();//for clicking Single Pin check box
		//addNewAdminPanelElement.clickOnSaveButton(); //for the save button
	}
	

	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Panel_Path_input_field() throws IOException, InterruptedException {AddNewAdminPanelCommon("");	}
	//@Test(priority=2)
	public void enter_a_valid_text_into_Panel_Path_input_field() throws IOException, InterruptedException {AddNewAdminPanelCommon("TestVPN");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("M2QxMzQ3YjktYzg3NS00YmMyLWJmZjItNDk4Njlh");}
	//@Test(priority=8)
	public void enter_special_characters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("                  TestVPN"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("TestVPN                            ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("AAASDFGHJHGFDFGH");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Panel_Path_input_field() throws IOException, InterruptedException{AddNewAdminPanelCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Panel_Path_input_field() throws IOException, InterruptedException{
			
	}
	
	//@Test(priority=21)
	//@Ignore
	public void enter_text_then_clear_the_input_text_field()throws IOException,InterruptedException  {
		addNewAdminPanelElement = loginPage.addNewAdminPanelElementLogin(props.getProperty("username"),props.getProperty("password"));
		addNewAdminPanelElement.openAddNewAdminPanelForm(); //open the Add New Admin Panel Page.
		addNewAdminPanelElement.typeToClientNameInputFieldParam("Test vpn"); //for taking inputs into the Client Name field
		addNewAdminPanelElement.typeToBrandNameInputFieldParam("Test VPN");//for taking inputs into the Brand Name field
		addNewAdminPanelElement.typeToPanelNameInputFieldParam("Test vpn");//for taking inputs into the Panel Name field
		addNewAdminPanelElement.typeToPanelPathInputFieldParam("http://95.217.158.10/u2admin/");//for taking inputs into the Panel path field
		addNewAdminPanelElement.typeAndClearPanelPathInputFieldParam(""); //Clear the text
		addNewAdminPanelElement.typeToLoginNameInputFieldParam("Tester");//for taking inputs into the Login Name field
		addNewAdminPanelElement.typeToLoginPasswordInputFieldParam("123456");//for taking inputs into the Login Password field
		addNewAdminPanelElement.checkisSinglePinCheckboxElement();//for clicking Single Pin check box
		//addNewAdminPanelElement.clickOnSaveButton(); //for the save button

	}

	@Test(priority=22)
	//@Ignore
	public void enter_then_undo_the_input_action_into_the_Panel_Path_field()throws IOException,InterruptedException  {
		addNewAdminPanelElement = loginPage.addNewAdminPanelElementLogin(props.getProperty("username"),props.getProperty("password"));
		addNewAdminPanelElement.openAddNewAdminPanelForm(); //open the Add New Admin Panel Page.
		addNewAdminPanelElement.typeToClientNameInputFieldParam("Test vpn"); //for taking inputs into the Client Name field
		addNewAdminPanelElement.typeToBrandNameInputFieldParam("Test VPN");//for taking inputs into the Brand Name field
		addNewAdminPanelElement.typeToPanelNameInputFieldParam("Test vpn");//for taking inputs into the Panel Name field
		addNewAdminPanelElement.typeToPanelPathInputFieldParam("http://95.217.158.10/u2admin/");//for taking inputs into the Panel path field
		addNewAdminPanelElement.typeAndClearPanelPathInputFieldParam(""); //undo the text
		addNewAdminPanelElement.typeToLoginNameInputFieldParam("Tester");//for taking inputs into the Login Name field
		addNewAdminPanelElement.typeToLoginPasswordInputFieldParam("123456");//for taking inputs into the Login Password field
		addNewAdminPanelElement.checkisSinglePinCheckboxElement();//for clicking Single Pin check box
		//addNewAdminPanelElement.clickOnSaveButton(); //for the save button

	}

	//@Test(priority=23)
	//@Ignore
	public void enter_then_undo_then_redo_the_input_action_into_the_Panel_Path_field() throws IOException,InterruptedException  {
		addNewAdminPanelElement = loginPage.addNewAdminPanelElementLogin(props.getProperty("username"),props.getProperty("password"));
		addNewAdminPanelElement.openAddNewAdminPanelForm(); //open the Add New Admin Panel Page.
		addNewAdminPanelElement.typeToClientNameInputFieldParam("Test vpn"); //for taking inputs into the Client Name field
		addNewAdminPanelElement.typeToBrandNameInputFieldParam("Test VPN");//for taking inputs into the Brand Name field
		addNewAdminPanelElement.typeToPanelNameInputFieldParam("Test vpn");//for taking inputs into the Panel Name field
		addNewAdminPanelElement.typeToPanelPathInputFieldParam("http://95.217.158.10/u2admin/");//for taking inputs into the Panel path field
		addNewAdminPanelElement.typeAndClearPanelPathInputFieldParam(""); //undo the text
		addNewAdminPanelElement.typeToPanelPathInputFieldParam("http://95.217.158.10/u2admin/");
		addNewAdminPanelElement.typeToLoginNameInputFieldParam("Tester");//for taking inputs into the Login Name field
		addNewAdminPanelElement.typeToLoginPasswordInputFieldParam("123456");//for taking inputs into the Login Password field
		addNewAdminPanelElement.checkisSinglePinCheckboxElement();//for clicking Single Pin check box
		//addNewAdminPanelElement.clickOnSaveButton(); //for the save button

	}


	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_the_input_field_using_the_tab_key()throws IOException,InterruptedException {
		addNewAdminPanelElement = loginPage.addNewAdminPanelElementLogin(props.getProperty("username"),props.getProperty("password"));
		addNewAdminPanelElement.openAddNewAdminPanelForm(); //open the Add New Admin Panel Page.
		addNewAdminPanelElement.typeToClientNameInputFieldParam("Test vpn"); //for taking inputs into the Client Name field
		addNewAdminPanelElement.typeToBrandNameInputFieldParam("Test VPN");//for taking inputs into the Brand Name field
		addNewAdminPanelElement.typeToPanelNameInputFieldParam("Test vpn");//for taking inputs into the Panel Name field
		addNewAdminPanelElement.typeToPanelPathInputFieldParam("http://95.217.158.10/u2admin/");//for taking inputs into the Panel path field
		addNewAdminPanelElement.typetoPanelPathInputFieldtabKey(); //navigate to the tab key
		addNewAdminPanelElement.typeToLoginNameInputFieldParam("Tester");//for taking inputs into the Login Name field
		addNewAdminPanelElement.typeToLoginPasswordInputFieldParam("123456");//for taking inputs into the Login Password field
		addNewAdminPanelElement.checkisSinglePinCheckboxElement();//for clicking Single Pin check box
		//addNewAdminPanelElement.clickOnSaveButton(); //for the save button


	}


	//@Test(priority=25)
	//@Ignore
	public void paste_the_text_into_the_Panel_Path_field_using_the_paste_action() throws IOException,InterruptedException  {
		addNewAdminPanelElement = loginPage.addNewAdminPanelElementLogin(props.getProperty("username"),props.getProperty("password"));
		addNewAdminPanelElement.openAddNewAdminPanelForm(); //open the Add New Admin Panel Page.
		addNewAdminPanelElement.typeToClientNameInputFieldParam("Test vpn"); //for taking inputs into the Client Name field
		addNewAdminPanelElement.typeToBrandNameInputFieldParam("Test VPN");//for taking inputs into the Brand Name field
		addNewAdminPanelElement.typeToPanelNameInputFieldParam("Test vpn");//for taking inputs into the Panel Name field
		addNewAdminPanelElement.typeToPanelPathInputFieldParam("http://95.217.158.10/u2admin/");//for taking inputs into the Panel path field
		addNewAdminPanelElement.typeToLoginNameInputFieldParam("Tester");//for taking inputs into the Login Name field
		addNewAdminPanelElement.typeToLoginPasswordInputFieldParam("123456");//for taking inputs into the Login Password field
		addNewAdminPanelElement.checkisSinglePinCheckboxElement();//for clicking Single Pin check box
		//addNewAdminPanelElement.clickOnSaveButton(); //for the save button
	}


}

