/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.edit_server;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.ServerModuleElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class EditServerNameFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	ServerModuleElement serverModuleElement;
	
	//Initializing PageFactory
	public EditServerNameFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void editServerCommon(String Server_Name) throws IOException, InterruptedException {
		serverModuleElement = loginPage.addNewServerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/VpnServer/editForm/366");// open the edit Campaign Form Page.
		serverModuleElement.typeToServerNameFieldParam(Server_Name);//taking input from Server Name
		serverModuleElement.typeAndClearIPFieldParam("");
		serverModuleElement.typeToIPFieldParam("100.000.121.11");// taking input from the IP
		serverModuleElement.typeToIPRangeFieldParam(".01");// taking input from the IP Range
		serverModuleElement.typeToPathFieldParam("");// taking input from the Path
		serverModuleElement.typeToCapacityFieldParam("1");// taking input from the Capacity
		serverModuleElement.countrySelectField();//select inputs data form the Country
		serverModuleElement.typeToCityFieldParam("");//taking input from the City
		serverModuleElement.typeToLocationFieldParam("");// taking input from the Location
		serverModuleElement.typeAndClearOrderPriorityFieldParam("");
		serverModuleElement.typeToOrderPriorityFieldParam("15");//  taking input from the Order Priority
		serverModuleElement.typeToServerPriceFieldParam("");//taking input from the Server Price $
		serverModuleElement.typeAndClearDomainFieldParam("");
		serverModuleElement.typeToDomainFieldParam("test domain");//taking input from the Domain
		serverModuleElement.clickTIsActiveCheckboxField();//click on is active checkbox
		serverModuleElement.clickTOpenVPNCheckboxField();// click on is OpenVPN checkbox
		serverModuleElement.SSHInputField();// click on is SSH checkbox
		//serverModuleElement.clickToSubmitButton();// click on Submit button

		
	}
	//@Ignore
	@Test(priority=1)
	public void enter_empty_text_into_Server_Name_input_field() throws IOException, InterruptedException {editServerCommon("");	}
	//@Test(priority=2)
	public void enter_a_valid_text_into_Server_Name_input_field() throws IOException, InterruptedException {editServerCommon("TEST SERVER");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("           TEST SERVER"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("TEST SERVER                 ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("TEST SERVER");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Server_Name_input_field() throws IOException, InterruptedException{editServerCommon("á, ç, ō,  á, ç, ō");}

	
	//@Test(priority=21)
	public void enter_then_clear_the_text_into_Server_Name_input_field() throws IOException, InterruptedException{
		serverModuleElement = loginPage.addNewServerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/VpnServer/editForm/366");// open the edit Campaign Form Page.
		serverModuleElement.typeToServerNameFieldParam("");//taking input from Server Name
		serverModuleElement.typeAndClearServerNameFieldParam("");//undo the text
		serverModuleElement.typeAndClearIPFieldParam("");
		serverModuleElement.typeToIPFieldParam("100.000.121.11");// taking input from the IP
		serverModuleElement.typeToIPRangeFieldParam(".01");// taking input from the IP Range
		serverModuleElement.typeToPathFieldParam("");// taking input from the Path
		serverModuleElement.typeToCapacityFieldParam("1");// taking input from the Capacity
		serverModuleElement.countrySelectField();//select inputs data form the Country
		serverModuleElement.typeToCityFieldParam("");//taking input from the City
		serverModuleElement.typeToLocationFieldParam("");// taking input from the Location
		serverModuleElement.typeAndClearOrderPriorityFieldParam("");
		serverModuleElement.typeToOrderPriorityFieldParam("15");//  taking input from the Order Priority
		serverModuleElement.typeToServerPriceFieldParam("");//taking input from the Server Price $
		serverModuleElement.typeAndClearDomainFieldParam("");
		serverModuleElement.typeToDomainFieldParam("test domain");//taking input from the Domain
		serverModuleElement.clickTIsActiveCheckboxField();//click on is active checkbox
		serverModuleElement.clickTOpenVPNCheckboxField();// click on is OpenVPN checkbox
		serverModuleElement.SSHInputField();// click on is SSH checkbox
		//serverModuleElement.clickToSubmitButton();// click on Submit button

		
	}
	//@Test(priority=22)
	public void enter_then_undo_the_input_action_into_Server_Name_input_field() throws IOException, InterruptedException{
		serverModuleElement = loginPage.addNewServerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/VpnServer/editForm/366");// open the edit Campaign Form Page.
		serverModuleElement.typeToServerNameFieldParam("");//taking input from Server Name
		serverModuleElement.typeAndClearServerNameFieldParam("");//undo the text
		serverModuleElement.typeAndClearIPFieldParam("");
		serverModuleElement.typeToIPFieldParam("100.000.121.11");// taking input from the IP
		serverModuleElement.typeToIPRangeFieldParam(".01");// taking input from the IP Range
		serverModuleElement.typeToPathFieldParam("");// taking input from the Path
		serverModuleElement.typeToCapacityFieldParam("1");// taking input from the Capacity
		serverModuleElement.countrySelectField();//select inputs data form the Country
		serverModuleElement.typeToCityFieldParam("");//taking input from the City
		serverModuleElement.typeToLocationFieldParam("");// taking input from the Location
		serverModuleElement.typeAndClearOrderPriorityFieldParam("");
		serverModuleElement.typeToOrderPriorityFieldParam("15");//  taking input from the Order Priority
		serverModuleElement.typeToServerPriceFieldParam("");//taking input from the Server Price $
		serverModuleElement.typeAndClearDomainFieldParam("");
		serverModuleElement.typeToDomainFieldParam("test domain");//taking input from the Domain
		serverModuleElement.clickTIsActiveCheckboxField();//click on is active checkbox
		serverModuleElement.clickTOpenVPNCheckboxField();// click on is OpenVPN checkbox
		serverModuleElement.SSHInputField();// click on is SSH checkbox
		//serverModuleElement.clickToSubmitButton();// click on Submit button
	}
	
	//@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_Server_Name_input_field() throws IOException, InterruptedException{
		serverModuleElement = loginPage.addNewServerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/VpnServer/editForm/366");// open the edit Campaign Form Page.
		serverModuleElement.typeToServerNameFieldParam("");//taking input from Server Name
		serverModuleElement.typeAndClearServerNameFieldParam("");//undo the text
		serverModuleElement.typeToServerNameFieldParam("test server 1");//redo the text
		serverModuleElement.typeAndClearIPFieldParam("");
		serverModuleElement.typeToIPFieldParam("100.000.121.11");// taking input from the IP
		serverModuleElement.typeToIPRangeFieldParam(".01");// taking input from the IP Range
		serverModuleElement.typeToPathFieldParam("");// taking input from the Path
		serverModuleElement.typeToCapacityFieldParam("1");// taking input from the Capacity
		serverModuleElement.countrySelectField();//select inputs data form the Country
		serverModuleElement.typeToCityFieldParam("");//taking input from the City
		serverModuleElement.typeToLocationFieldParam("");// taking input from the Location
		serverModuleElement.typeAndClearOrderPriorityFieldParam("");
		serverModuleElement.typeToOrderPriorityFieldParam("15");//  taking input from the Order Priority
		serverModuleElement.typeToServerPriceFieldParam("");//taking input from the Server Price $
		serverModuleElement.typeAndClearDomainFieldParam("");
		serverModuleElement.typeToDomainFieldParam("test domain");//taking input from the Domain
		serverModuleElement.clickTIsActiveCheckboxField();//click on is active checkbox
		serverModuleElement.clickTOpenVPNCheckboxField();// click on is OpenVPN checkbox
		serverModuleElement.SSHInputField();// click on is SSH checkbox
		//serverModuleElement.clickToSubmitButton();// click on Submit button
	}
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_Server_Name_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		serverModuleElement = loginPage.addNewServerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/VpnServer/editForm/366");// open the edit Campaign Form Page.
		serverModuleElement.typeToServerNameFieldParam("");//taking input from Server Name
		serverModuleElement.typeAndClearServerNameFieldParam("");//undo the text
		serverModuleElement.typeAndClearIPFieldParam("");
		serverModuleElement.typeToIPFieldParam("100.000.121.11");// taking input from the IP
		serverModuleElement.typeToIPRangeFieldParam(".01");// taking input from the IP Range
		serverModuleElement.typeToPathFieldParam("");// taking input from the Path
		serverModuleElement.typeToCapacityFieldParam("1");// taking input from the Capacity
		serverModuleElement.countrySelectField();//select inputs data form the Country
		serverModuleElement.typeToCityFieldParam("");//taking input from the City
		serverModuleElement.typeToLocationFieldParam("");// taking input from the Location
		serverModuleElement.typeAndClearOrderPriorityFieldParam("");
		serverModuleElement.typeToOrderPriorityFieldParam("15");//  taking input from the Order Priority
		serverModuleElement.typeToServerPriceFieldParam("");//taking input from the Server Price $
		serverModuleElement.typeAndClearDomainFieldParam("");
		serverModuleElement.typeToDomainFieldParam("test domain");//taking input from the Domain
		serverModuleElement.clickTIsActiveCheckboxField();//click on is active checkbox
		serverModuleElement.clickTOpenVPNCheckboxField();// click on is OpenVPN checkbox
		serverModuleElement.SSHInputField();// click on is SSH checkbox
		//serverModuleElement.clickToSubmitButton();// click on Submit button
	}
	//@Test(priority=25)
	public void paste_the_text_into_Server_Name_input_field_using_the_paste_action() throws IOException, InterruptedException{
		serverModuleElement = loginPage.addNewServerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/VpnServer/editForm/366");// open the edit Campaign Form Page.
		serverModuleElement.typeToServerNameFieldParam("");//taking input from Server Name
		serverModuleElement.typetoServerNametabKey();//undo the text
		serverModuleElement.typeAndClearIPFieldParam("");
		serverModuleElement.typeToIPFieldParam("100.000.121.11");// taking input from the IP
		serverModuleElement.typeToIPRangeFieldParam(".01");// taking input from the IP Range
		serverModuleElement.typeToPathFieldParam("");// taking input from the Path
		serverModuleElement.typeToCapacityFieldParam("1");// taking input from the Capacity
		serverModuleElement.countrySelectField();//select inputs data form the Country
		serverModuleElement.typeToCityFieldParam("");//taking input from the City
		serverModuleElement.typeToLocationFieldParam("");// taking input from the Location
		serverModuleElement.typeAndClearOrderPriorityFieldParam("");
		serverModuleElement.typeToOrderPriorityFieldParam("15");//  taking input from the Order Priority
		serverModuleElement.typeToServerPriceFieldParam("");//taking input from the Server Price $
		serverModuleElement.typeAndClearDomainFieldParam("");
		serverModuleElement.typeToDomainFieldParam("test domain");//taking input from the Domain
		serverModuleElement.clickTIsActiveCheckboxField();//click on is active checkbox
		serverModuleElement.clickTOpenVPNCheckboxField();// click on is OpenVPN checkbox
		serverModuleElement.SSHInputField();// click on is SSH checkbox
		//serverModuleElement.clickToSubmitButton();// click on Submit button
	}	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

}

