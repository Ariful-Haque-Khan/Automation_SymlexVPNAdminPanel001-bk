/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_ip;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.IPListElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class IpFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	IPListElement iPListElement;
	
	//Initializing PageFactory
	public IpFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void addNewIPCommon(String IP) throws IOException, InterruptedException {
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		iPListElement.openAddNewIPForm();// open the Add New IP  Form Page.
		iPListElement.typeToServerNameFieldParam("TEST AMSSSS-18");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam(IP);// taking input from the ip
		iPListElement.typeToNoteInputFieldParam("server is down");// taking input from the note
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("config");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("111.2222");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("germany");// taking inputs from Site input field
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
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_IP_input_field() throws IOException, InterruptedException {addNewIPCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_IP_input_field() throws IOException, InterruptedException {addNewIPCommon("1000.200.21.223.");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_IP_input_field() throws IOException, InterruptedException{addNewIPCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_IP_input_field() throws IOException, InterruptedException{ 
			
	}

	@Test(priority=21)
	public void enter_then_clear_the_text_into_IP_input_field() throws IOException, InterruptedException{
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		iPListElement.openAddNewIPForm();// open the Add New IP  Form Page.
		iPListElement.typeToServerNameFieldParam("test ams-18 ");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam("100.000.23..1000");// taking input from the ip
		iPListElement.typeAndClearIPFieldParam("");//clear the text
		iPListElement.typeToNoteInputFieldParam("server is down");// taking input from the note
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("config");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("111.2222");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("germany");// taking inputs from Site input field
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
	//@Test(priority=22)
	public void enter_then_undo_the_input_action_into_IP_input_field() throws IOException, InterruptedException{
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		iPListElement.openAddNewIPForm();// open the Add New IP  Form Page.
		iPListElement.typeToServerNameFieldParam("test ams-18 ");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam("100.000.23..1000");// taking input from the ip
		iPListElement.typeAndClearIPFieldParam("");//clear the text
		iPListElement.typeToNoteInputFieldParam("server is down");// taking input from the note
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("config");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("111.2222");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("germany");// taking inputs from Site input field
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
	
	@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_IP_input_field() throws IOException, InterruptedException{
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		iPListElement.openAddNewIPForm();// open the Add New IP  Form Page.
		iPListElement.typeToServerNameFieldParam("test ams-18 ");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam("100.000.23..1000");// taking input from the ip
		iPListElement.typeAndClearIPFieldParam("");//clear the text
		iPListElement.typeToIPInputFieldParam("100.000.23..1000");//REDO THE TEXT
		iPListElement.typeToNoteInputFieldParam("server is down");// taking input from the note
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("config");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("111.2222");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("germany");// taking inputs from Site input field
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
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_IP_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		iPListElement.openAddNewIPForm();// open the Add New IP  Form Page.
		iPListElement.typeToServerNameFieldParam("test ams-18 ");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam("100.000.23..1000");// taking input from the ip
		iPListElement.typetoIPFieldtabKey();
		iPListElement.typeToNoteInputFieldParam("server is down");// taking input from the note
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("config");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("111.2222");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("germany");// taking inputs from Site input field
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
	public void paste_the_text_into_IP_input_field_using_the_paste_action() throws IOException, InterruptedException{
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		iPListElement.openAddNewIPForm();// open the Add New IP  Form Page.
		iPListElement.typeToServerNameFieldParam("test ams-18 ");//taking input from the server Name
		iPListElement.typeToIPInputFieldParam("100.000.23..1000");// taking input from the ip
		iPListElement.typeToNoteInputFieldParam("server is down");// taking input from the note
		iPListElement.typeSelectField();// select inputs data form the type of protocol dropdown field
		iPListElement.transmissionprotocolSelectField();// select inputs data form the Transmission Protocol drop down field
		iPListElement.uaeNetworkSelectField();//select inputs data form the UAE Network drop down field
		iPListElement.countrySelectField();// select inputs data form the Country drop down field
		iPListElement.vpnServerSelectField();// select inputs data from the VPN Server drop down field 
		iPListElement.typeToConfigInputFieldParam("config");//  taking input from the config
		iPListElement.connectionTypeSelectField();//select inputs data from Connection Type
		iPListElement.typeTosslIpElementInputFieldParam("111.2222");//taking input from the SSL IP
		iPListElement.typeToSiteInputFieldParam("germany");// taking inputs from Site input field
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

