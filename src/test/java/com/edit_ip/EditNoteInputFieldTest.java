/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.edit_ip;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.IPListElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class EditNoteInputFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	IPListElement iPListElement;
	
	//Initializing PageFactory
	public EditNoteInputFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase  
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void editIPCommon(String note) throws IOException, InterruptedException {
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/editForm/1392/0/100");// open the edit Server Form Page.
		Thread.sleep (3000);
		Thread.sleep (3000);
		iPListElement.typeToServerNameFieldParam("");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam("");// taking input from the ip
		Thread.sleep (3000);
		iPListElement.typeAndClearNoteFieldParam("");//clear the text
		Thread.sleep (3000);
		iPListElement.typeToNoteInputFieldParam(note);// taking input from the note
		Thread.sleep (3000);
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("");// taking inputs from Site input field
		iPListElement.platformTypeSelectField();//select inputs data form the Platform drop down field 
		//iPListElement.clickTIsActiveCheckboxField();//check box for is active
		//iPListElement.clickIsStreamingCheckboxField();// check box for Is Streaming
		//iPListElement.clickIsGamingCheckboxField();// check box for Is Gaming
		iPListElement.clickIsFreeCheckboxField();// check box for Is Free
		//iPListElement.isAdsBlockerCheckboxField();// check box for Ads Blocker
		//iPListElement.isFastServerCheckboxField();// check box for  Fast Server
		//iPListElement.isLoyalUserServerCheckboxField();// check box for Loyal User Server
		//iPListElement.clickONSubmitButton();// click submit button
		//iPListElement.typeToresellerLimitInputFieldParam("10");// 
		
	}
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_note_input_field() throws IOException, InterruptedException {editIPCommon("");	}
	//@Test(priority=2)
	public void enter_a_valid_text_into_note_input_field() throws IOException, InterruptedException {editIPCommon("IP Testing note");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_note_input_field() throws IOException, InterruptedException{editIPCommon("           IP Testing note"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_note_input_field() throws IOException, InterruptedException{editIPCommon("IP Testing note                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_note_input_field() throws IOException, InterruptedException{editIPCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_note_input_field() throws IOException, InterruptedException{editIPCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_note_input_field() throws IOException, InterruptedException{editIPCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_note_input_field() throws IOException, InterruptedException{editIPCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_note_input_field() throws IOException, InterruptedException{editIPCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_note_input_field() throws IOException, InterruptedException{ 
			
	}
	
	@Test(priority=21)
	public void enter_then_clear_the_text_into_note_input_field() throws IOException, InterruptedException{
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/editForm/1392/0/100");// open the edit Server Form Page.
		Thread.sleep (3000);
		Thread.sleep (3000);
		iPListElement.typeToServerNameFieldParam("");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam("");// taking input from the ip
		Thread.sleep (3000);
		iPListElement.typeAndClearNoteFieldParam("");//clear the text
		Thread.sleep (3000);
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("");// taking inputs from Site input field
		iPListElement.platformTypeSelectField();//select inputs data form the Platform drop down field 
		//iPListElement.clickTIsActiveCheckboxField();//check box for is active
		//iPListElement.clickIsStreamingCheckboxField();// check box for Is Streaming
		//iPListElement.clickIsGamingCheckboxField();// check box for Is Gaming
		iPListElement.clickIsFreeCheckboxField();// check box for Is Free
		//iPListElement.isAdsBlockerCheckboxField();// check box for Ads Blocker
		//iPListElement.isFastServerCheckboxField();// check box for  Fast Server
		//iPListElement.isLoyalUserServerCheckboxField();// check box for Loyal User Server
		//iPListElement.clickONSubmitButton();// click submit button
		//iPListElement.typeToresellerLimitInputFieldParam("10");// 
	}
	//@Test(priority=22)
	public void enter_then_undo_the_input_action_into_note_input_field() throws IOException, InterruptedException{
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/editForm/1392/0/100");// open the edit Server Form Page.
		Thread.sleep (3000);
		Thread.sleep (3000);
		iPListElement.typeToServerNameFieldParam("");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam("");// taking input from the ip
		Thread.sleep (3000);
		iPListElement.typeAndClearNoteFieldParam("");//clear the text
		Thread.sleep (3000);
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("");// taking inputs from Site input field
		iPListElement.platformTypeSelectField();//select inputs data form the Platform drop down field 
		//iPListElement.clickTIsActiveCheckboxField();//check box for is active
		//iPListElement.clickIsStreamingCheckboxField();// check box for Is Streaming
		//iPListElement.clickIsGamingCheckboxField();// check box for Is Gaming
		iPListElement.clickIsFreeCheckboxField();// check box for Is Free
		//iPListElement.isAdsBlockerCheckboxField();// check box for Ads Blocker
		//iPListElement.isFastServerCheckboxField();// check box for  Fast Server
		//iPListElement.isLoyalUserServerCheckboxField();// check box for Loyal User Server
		//iPListElement.clickONSubmitButton();// click submit button
		//iPListElement.typeToresellerLimitInputFieldParam("10");// 

	}
	
	//@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_note_input_field() throws IOException, InterruptedException{
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/editForm/1392/0/100");// open the edit Server Form Page.
		Thread.sleep (3000);
		Thread.sleep (3000);
		iPListElement.typeToServerNameFieldParam("");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam("");// taking input from the ip
		Thread.sleep (3000);
		iPListElement.typeAndClearNoteFieldParam("");//clear the text
		Thread.sleep (3000);
		iPListElement.typeToNoteInputFieldParam(".server is down");//redo the text
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("");// taking inputs from Site input field
		iPListElement.platformTypeSelectField();//select inputs data form the Platform drop down field 
		//iPListElement.clickTIsActiveCheckboxField();//check box for is active
		//iPListElement.clickIsStreamingCheckboxField();// check box for Is Streaming
		//iPListElement.clickIsGamingCheckboxField();// check box for Is Gaming
		iPListElement.clickIsFreeCheckboxField();// check box for Is Free
		//iPListElement.isAdsBlockerCheckboxField();// check box for Ads Blocker
		//iPListElement.isFastServerCheckboxField();// check box for  Fast Server
		//iPListElement.isLoyalUserServerCheckboxField();// check box for Loyal User Server
		//iPListElement.clickONSubmitButton();// click submit button
		//iPListElement.typeToresellerLimitInputFieldParam("10");// 
	
	}
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_note_input_fieldd_using_the_tab_key() throws IOException, InterruptedException{ 
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/editForm/1392/0/100");// open the edit Server Form Page.
		iPListElement.typeToServerNameFieldParam("");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam(".00");// taking input from the ip
		iPListElement.typeToNoteInputFieldParam(".Server is down");// taking input from the note
		iPListElement.typetoNoteFieldtabKey();
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam(".11");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("");// taking inputs from Site input field
		iPListElement.platformTypeSelectField();//select inputs data form the Platform drop down field 
		iPListElement.clickTIsActiveCheckboxField();//check box for is active
		iPListElement.clickIsStreamingCheckboxField();// check box for Is Streaming
		iPListElement.clickIsGamingCheckboxField();// check box for Is Gaming
		iPListElement.clickIsFreeCheckboxField();// check box for Is Free
		iPListElement.isAdsBlockerCheckboxField();// check box for Ads Blocker
		iPListElement.isFastServerCheckboxField();// check box for  Fast Server
		iPListElement.isLoyalUserServerCheckboxField();// check box for Loyal User Server
		//iPListElement.clickONSubmitButton();// click submit button
		//iPListElement.typeToresellerLimitInputFieldParam("10");// 
		
	}
	
	//@Test(priority=25)
	public void paste_the_text_into_note_input_field_using_the_paste_action() throws IOException, InterruptedException{
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/editForm/1392/0/100");// open the edit Server Form Page.
		iPListElement.typeToServerNameFieldParam("");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam(".00");// taking input from the ip
		iPListElement.typeToNoteInputFieldParam(".server is down");// taking input from the note
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam(".22");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("");// taking inputs from Site input field
		iPListElement.platformTypeSelectField();//select inputs data form the Platform drop down field 
		iPListElement.clickTIsActiveCheckboxField();//check box for is active
		iPListElement.clickIsStreamingCheckboxField();// check box for Is Streaming
		iPListElement.clickIsGamingCheckboxField();// check box for Is Gaming
		iPListElement.clickIsFreeCheckboxField();// check box for Is Free
		iPListElement.isAdsBlockerCheckboxField();// check box for Ads Blocker
		iPListElement.isFastServerCheckboxField();// check box for  Fast Server
		iPListElement.isLoyalUserServerCheckboxField();// check box for Loyal User Server
		//iPListElement.clickONSubmitButton();// click submit button
		//iPListElement.typeToresellerLimitInputFieldParam("10");// 
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}

