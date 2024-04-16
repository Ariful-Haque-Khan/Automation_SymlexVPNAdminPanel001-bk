/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_reseller_client;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewResellerClient;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class LoginFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewResellerClient addNewResellerClient;
	
	//Initializing PageFactory
	public LoginFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void AddNewResellerClientCommon(String login) throws IOException, InterruptedException {
		addNewResellerClient = loginPage.addNewResellerClientLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewResellerClient.openaddNewResellerForm();// open the Add New Reseller Client  Form Page.
		addNewResellerClient.typeToResellerNameInputFieldParam("khan Reseller");//taking input from the reseller Name
		addNewResellerClient.typeTologinInputFieldParam(login);// taking input from the login
		addNewResellerClient.typeToPasswordInputFieldParam("1111111111111111111");// taking input from the password
		addNewResellerClient.typeToCreditLimitInputFieldParam("1000");// taking input from the credit limit
		addNewResellerClient.searchandtypeelementDropDownIPBundleField();// select inputs data form the IP Bundle drop down field
		addNewResellerClient.searchandtypeelementDropDownIPBundle2Field();//select inputs data form the IP Bundle 2  drop down field
		addNewResellerClient.ratePlaneelementDropDownField();// select inputs data form the Rate Plan drop down field
		addNewResellerClient.pinResetOptioneelementDropDownField();// select inputs data form the PIN Reset Option drop down field 
		addNewResellerClient.resellerPanelTypeelementDropDownField();//  select inputs data form the Reseller Panel Type drop down field 
		addNewResellerClient.checkActiveInactiveCheckboxInputField();//click on active button
		addNewResellerClient.appPINLoginelementDropDownField();//select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeToBrandNameInputFieldParam("International brand");//  taking inputs from brand name input field
		addNewResellerClient.typeToBrandPINPrefixInputFieldParam("pr");//select inputs data form the Brand PIN Prefix Type drop down field 
		addNewResellerClient.typeToAllowAppsInputFieldElement();//select inputs data form the Allow Apps Type drop down field 
		addNewResellerClient.isCustomizePanelelementDropDownField();// select inputs data form the Is Customize Panel Type drop down field 
		//addNewResellerClient.typeToIsCustomizePanelPanelNameFieldParam("panel name of reseller");// taking input from the panel name
		addNewResellerClient.hasLimitofPINelementDropDownField();// select inputs data form the Has Limit of PIN??  Type drop down field 
		addNewResellerClient.typeToPinLimitInputFieldParam("2");// taking input from Pin Limit
		addNewResellerClient.onlyTypeelementDropDownField();// select inputs data form the Type Type drop down field 
		addNewResellerClient.mainResellerTypeelementDropDownField();// select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeTonumberOfDevicesInputFieldParam("5");// taking input from theNumber Of Devices
		addNewResellerClient.typeToresellerLimitInputFieldParam("10");// taking input from the Reseller Limit
		addNewResellerClient.typeTobalanceLimitInputFieldParam("2000");// taking input from the Balance Limit
		addNewResellerClient.typeToemailInputFieldFieldParam("abcd@gmail.com");// taking input from the Email
		addNewResellerClient.typeTophoneNoInputFieldEParam("1234567890987");// taking input from the phone no
		addNewResellerClient.typeTocityInputFieldEParam("Dubai");// taking input from the city
		addNewResellerClient.countryTypeelementDropDownField();// select inputs data form the country Type drop down field 
		addNewResellerClient.typeTostateInputFieldEParam("UAE");// taking input from the state name
		addNewResellerClient.typeToaddressInputFieldParam("1/E/A/Street");// taking input from the address
		//addNewResellerClient.isTVResellerelementDropDownField();// select inputs data form the Is TV Reseller Type drop down field 
		//addNewResellerClient.showAppBannerelementDropDownField();// select inputs data form the Show App Banner Type drop down field 
		//addNewResellerClient.showFullScreenelementDropDownField();// select inputs data form the Show Full Screen Type drop down field 
		//addNewResellerClient.lowBALNotifyEmailelementDropDownField();// select inputs data form the Low BAL Notify Email Type drop down field 
		//addNewResellerClient.assignPremiumLockedBundleelementDropDownField();// select inputs data form the Assign Premium Locked Bundle Type drop down field 
		//addNewResellerClient.submitButton();// click submit button	
	}
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_login_input_field() throws IOException, InterruptedException {AddNewResellerClientCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_login_input_field() throws IOException, InterruptedException {AddNewResellerClientCommon("ani1yr");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_login_input_field() throws IOException, InterruptedException{AddNewResellerClientCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_login_input_field() throws IOException, InterruptedException{ 
			
	}

	@Test(priority=21)
	public void enter_then_clear_the_text_into_reseller_name_input_field() throws IOException, InterruptedException{
		addNewResellerClient = loginPage.addNewResellerClientLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewResellerClient.openaddNewResellerForm();// open the Add New Reseller Client  Form Page.
		addNewResellerClient.typeToResellerNameInputFieldParam("khan VPN reseller");//taking input from the reseller Name
		addNewResellerClient.typeTologinInputFieldParam("ani.kolpolok@gmail.com");// taking input from the login
		addNewResellerClient.typeAndClearPasswordInputFieldParam("");
		addNewResellerClient.typeToPasswordInputFieldParam("1111111111111111111");// taking input from the password
		addNewResellerClient.typeToCreditLimitInputFieldParam("1000");// taking input from the credit limit
		addNewResellerClient.searchandtypeelementDropDownIPBundleField();// select inputs data form the IP Bundle drop down field
		addNewResellerClient.searchandtypeelementDropDownIPBundle2Field();//select inputs data form the IP Bundle 2  drop down field
		addNewResellerClient.ratePlaneelementDropDownField();// select inputs data form the Rate Plan drop down field
		addNewResellerClient.pinResetOptioneelementDropDownField();// select inputs data form the PIN Reset Option drop down field 
		addNewResellerClient.resellerPanelTypeelementDropDownField();//  select inputs data form the Reseller Panel Type drop down field 
		addNewResellerClient.checkActiveInactiveCheckboxInputField();//click on active button
		addNewResellerClient.appPINLoginelementDropDownField();//select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeToBrandNameInputFieldParam("International brand");//  taking inputs from brand name input field
		addNewResellerClient.typeToBrandPINPrefixInputFieldParam("pr");//select inputs data form the Brand PIN Prefix Type drop down field 
		addNewResellerClient.typeToAllowAppsInputFieldElement();//select inputs data form the Allow Apps Type drop down field 
		addNewResellerClient.isCustomizePanelelementDropDownField();// select inputs data form the Is Customize Panel Type drop down field 
		//addNewResellerClient.typeToIsCustomizePanelPanelNameFieldParam("panel name of reseller");// taking input from the panel name
		addNewResellerClient.hasLimitofPINelementDropDownField();// select inputs data form the Has Limit of PIN??  Type drop down field 
		addNewResellerClient.typeToPinLimitInputFieldParam("2");// taking input from Pin Limit
		addNewResellerClient.onlyTypeelementDropDownField();// select inputs data form the Type Type drop down field 
		addNewResellerClient.mainResellerTypeelementDropDownField();// select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeTonumberOfDevicesInputFieldParam("5");// taking input from theNumber Of Devices
		addNewResellerClient.typeToresellerLimitInputFieldParam("10");// taking input from the Reseller Limit
		addNewResellerClient.typeTobalanceLimitInputFieldParam("2000");// taking input from the Balance Limit
		addNewResellerClient.typeToemailInputFieldFieldParam("abcd@gmail.com");// taking input from the Email
		addNewResellerClient.typeTophoneNoInputFieldEParam("1234567890987");// taking input from the phone no
		addNewResellerClient.typeTocityInputFieldEParam("Dubai");// taking input from the city
		addNewResellerClient.countryTypeelementDropDownField();// select inputs data form the country Type drop down field 
		addNewResellerClient.typeTostateInputFieldEParam("UAE");// taking input from the state name
		addNewResellerClient.typeToaddressInputFieldParam("1/E/A/Street");// taking input from the address
		//addNewResellerClient.isTVResellerelementDropDownField();// select inputs data form the Is TV Reseller Type drop down field 
		//addNewResellerClient.showAppBannerelementDropDownField();// select inputs data form the Show App Banner Type drop down field 
		//addNewResellerClient.showFullScreenelementDropDownField();// select inputs data form the Show Full Screen Type drop down field 
		//addNewResellerClient.lowBALNotifyEmailelementDropDownField();// select inputs data form the Low BAL Notify Email Type drop down field 
		//addNewResellerClient.assignPremiumLockedBundleelementDropDownField();// select inputs data form the Assign Premium Locked Bundle Type drop down field 
		//addNewResellerClient.submitButton();// click submit button	
	}
	//@Test(priority=22)
	public void enter_then_undo_the_input_action_into_reseller_name_input_field() throws IOException, InterruptedException{
		addNewResellerClient = loginPage.addNewResellerClientLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewResellerClient.openaddNewResellerForm();// open the Add New Reseller Client  Form Page.
		addNewResellerClient.typeToResellerNameInputFieldParam("khan VPN reseller");//taking input from the reseller Name
		addNewResellerClient.typeTologinInputFieldParam("ani.kolpolok@gmail.com");// taking input from the login
		addNewResellerClient.typeAndClearPasswordInputFieldParam("");
		addNewResellerClient.typeToPasswordInputFieldParam("1111111111111111111");// taking input from the password
		addNewResellerClient.typeToCreditLimitInputFieldParam("1000");// taking input from the credit limit
		addNewResellerClient.searchandtypeelementDropDownIPBundleField();// select inputs data form the IP Bundle drop down field
		addNewResellerClient.searchandtypeelementDropDownIPBundle2Field();//select inputs data form the IP Bundle 2  drop down field
		addNewResellerClient.ratePlaneelementDropDownField();// select inputs data form the Rate Plan drop down field
		addNewResellerClient.pinResetOptioneelementDropDownField();// select inputs data form the PIN Reset Option drop down field 
		addNewResellerClient.resellerPanelTypeelementDropDownField();//  select inputs data form the Reseller Panel Type drop down field 
		addNewResellerClient.checkActiveInactiveCheckboxInputField();//click on active button
		addNewResellerClient.appPINLoginelementDropDownField();//select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeToBrandNameInputFieldParam("International brand");//  taking inputs from brand name input field
		addNewResellerClient.typeToBrandPINPrefixInputFieldParam("pr");//select inputs data form the Brand PIN Prefix Type drop down field 
		addNewResellerClient.typeToAllowAppsInputFieldElement();//select inputs data form the Allow Apps Type drop down field 
		addNewResellerClient.isCustomizePanelelementDropDownField();// select inputs data form the Is Customize Panel Type drop down field 
		//addNewResellerClient.typeToIsCustomizePanelPanelNameFieldParam("panel name of reseller");// taking input from the panel name
		addNewResellerClient.hasLimitofPINelementDropDownField();// select inputs data form the Has Limit of PIN??  Type drop down field 
		addNewResellerClient.typeToPinLimitInputFieldParam("2");// taking input from Pin Limit
		addNewResellerClient.onlyTypeelementDropDownField();// select inputs data form the Type Type drop down field 
		addNewResellerClient.mainResellerTypeelementDropDownField();// select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeTonumberOfDevicesInputFieldParam("5");// taking input from theNumber Of Devices
		addNewResellerClient.typeToresellerLimitInputFieldParam("10");// taking input from the Reseller Limit
		addNewResellerClient.typeTobalanceLimitInputFieldParam("2000");// taking input from the Balance Limit
		addNewResellerClient.typeToemailInputFieldFieldParam("abcd@gmail.com");// taking input from the Email
		addNewResellerClient.typeTophoneNoInputFieldEParam("1234567890987");// taking input from the phone no
		addNewResellerClient.typeTocityInputFieldEParam("Dubai");// taking input from the city
		addNewResellerClient.countryTypeelementDropDownField();// select inputs data form the country Type drop down field 
		addNewResellerClient.typeTostateInputFieldEParam("UAE");// taking input from the state name
		addNewResellerClient.typeToaddressInputFieldParam("1/E/A/Street");// taking input from the address
		//addNewResellerClient.isTVResellerelementDropDownField();// select inputs data form the Is TV Reseller Type drop down field 
		//addNewResellerClient.showAppBannerelementDropDownField();// select inputs data form the Show App Banner Type drop down field 
		//addNewResellerClient.showFullScreenelementDropDownField();// select inputs data form the Show Full Screen Type drop down field 
		//addNewResellerClient.lowBALNotifyEmailelementDropDownField();// select inputs data form the Low BAL Notify Email Type drop down field 
		//addNewResellerClient.assignPremiumLockedBundleelementDropDownField();// select inputs data form the Assign Premium Locked Bundle Type drop down field 
		//addNewResellerClient.submitButton();// click submit button
	}
	
	@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_reseller_name_input_field() throws IOException, InterruptedException{
		addNewResellerClient = loginPage.addNewResellerClientLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewResellerClient.openaddNewResellerForm();// open the Add New Reseller Client  Form Page.
		addNewResellerClient.typeToResellerNameInputFieldParam("khan VPN reseller");//taking input from the reseller Name
		addNewResellerClient.typeTologinInputFieldParam("ani.kolpolok@gmail.com");// taking input from the login
		addNewResellerClient.typeAndClearPasswordInputFieldParam("");
		addNewResellerClient.typeToPasswordInputFieldParam("1111111111111111111");// taking input from the password
		addNewResellerClient.typeToCreditLimitInputFieldParam("1000");// taking input from the credit limit
		addNewResellerClient.searchandtypeelementDropDownIPBundleField();// select inputs data form the IP Bundle drop down field
		addNewResellerClient.searchandtypeelementDropDownIPBundle2Field();//select inputs data form the IP Bundle 2  drop down field
		addNewResellerClient.ratePlaneelementDropDownField();// select inputs data form the Rate Plan drop down field
		addNewResellerClient.pinResetOptioneelementDropDownField();// select inputs data form the PIN Reset Option drop down field 
		addNewResellerClient.resellerPanelTypeelementDropDownField();//  select inputs data form the Reseller Panel Type drop down field 
		addNewResellerClient.checkActiveInactiveCheckboxInputField();//click on active button
		addNewResellerClient.appPINLoginelementDropDownField();//select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeToBrandNameInputFieldParam("International brand");//  taking inputs from brand name input field
		addNewResellerClient.typeToBrandPINPrefixInputFieldParam("pr");//select inputs data form the Brand PIN Prefix Type drop down field 
		addNewResellerClient.typeToAllowAppsInputFieldElement();//select inputs data form the Allow Apps Type drop down field 
		addNewResellerClient.isCustomizePanelelementDropDownField();// select inputs data form the Is Customize Panel Type drop down field 
		//addNewResellerClient.typeToIsCustomizePanelPanelNameFieldParam("panel name of reseller");// taking input from the panel name
		addNewResellerClient.hasLimitofPINelementDropDownField();// select inputs data form the Has Limit of PIN??  Type drop down field 
		addNewResellerClient.typeToPinLimitInputFieldParam("2");// taking input from Pin Limit
		addNewResellerClient.onlyTypeelementDropDownField();// select inputs data form the Type Type drop down field 
		addNewResellerClient.mainResellerTypeelementDropDownField();// select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeTonumberOfDevicesInputFieldParam("5");// taking input from theNumber Of Devices
		addNewResellerClient.typeToresellerLimitInputFieldParam("10");// taking input from the Reseller Limit
		addNewResellerClient.typeTobalanceLimitInputFieldParam("2000");// taking input from the Balance Limit
		addNewResellerClient.typeToemailInputFieldFieldParam("abcd@gmail.com");// taking input from the Email
		addNewResellerClient.typeTophoneNoInputFieldEParam("1234567890987");// taking input from the phone no
		addNewResellerClient.typeTocityInputFieldEParam("Dubai");// taking input from the city
		addNewResellerClient.countryTypeelementDropDownField();// select inputs data form the country Type drop down field 
		addNewResellerClient.typeTostateInputFieldEParam("UAE");// taking input from the state name
		addNewResellerClient.typeToaddressInputFieldParam("1/E/A/Street");// taking input from the address
		//addNewResellerClient.isTVResellerelementDropDownField();// select inputs data form the Is TV Reseller Type drop down field 
		//addNewResellerClient.showAppBannerelementDropDownField();// select inputs data form the Show App Banner Type drop down field 
		//addNewResellerClient.showFullScreenelementDropDownField();// select inputs data form the Show Full Screen Type drop down field 
		//addNewResellerClient.lowBALNotifyEmailelementDropDownField();// select inputs data form the Low BAL Notify Email Type drop down field 
		//addNewResellerClient.assignPremiumLockedBundleelementDropDownField();// select inputs data form the Assign Premium Locked Bundle Type drop down field 
		//addNewResellerClient.submitButton();// click submit button
	}
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_iOS_onclick_URL_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		addNewResellerClient = loginPage.addNewResellerClientLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewResellerClient.openaddNewResellerForm();// open the Add New Reseller Client  Form Page.
		addNewResellerClient.typeToResellerNameInputFieldParam("khan VPN reseller");//taking input from the reseller Name
		addNewResellerClient.typeTologinInputFieldParam("ani.kolpolok@gmail.com");// taking input from the login
		addNewResellerClient.typetoPasswordInputFieldtabKey();
		addNewResellerClient.typeToPasswordInputFieldParam("1111111111111111111");// taking input from the password
		addNewResellerClient.typeToCreditLimitInputFieldParam("1000");// taking input from the credit limit
		addNewResellerClient.searchandtypeelementDropDownIPBundleField();// select inputs data form the IP Bundle drop down field
		addNewResellerClient.searchandtypeelementDropDownIPBundle2Field();//select inputs data form the IP Bundle 2  drop down field
		addNewResellerClient.ratePlaneelementDropDownField();// select inputs data form the Rate Plan drop down field
		addNewResellerClient.pinResetOptioneelementDropDownField();// select inputs data form the PIN Reset Option drop down field 
		addNewResellerClient.resellerPanelTypeelementDropDownField();//  select inputs data form the Reseller Panel Type drop down field 
		addNewResellerClient.checkActiveInactiveCheckboxInputField();//click on active button
		addNewResellerClient.appPINLoginelementDropDownField();//select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeToBrandNameInputFieldParam("International brand");//  taking inputs from brand name input field
		addNewResellerClient.typeToBrandPINPrefixInputFieldParam("pr");//select inputs data form the Brand PIN Prefix Type drop down field 
		addNewResellerClient.typeToAllowAppsInputFieldElement();//select inputs data form the Allow Apps Type drop down field 
		addNewResellerClient.isCustomizePanelelementDropDownField();// select inputs data form the Is Customize Panel Type drop down field 
		//addNewResellerClient.typeToIsCustomizePanelPanelNameFieldParam("panel name of reseller");// taking input from the panel name
		addNewResellerClient.hasLimitofPINelementDropDownField();// select inputs data form the Has Limit of PIN??  Type drop down field 
		addNewResellerClient.typeToPinLimitInputFieldParam("2");// taking input from Pin Limit
		addNewResellerClient.onlyTypeelementDropDownField();// select inputs data form the Type Type drop down field 
		addNewResellerClient.mainResellerTypeelementDropDownField();// select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeTonumberOfDevicesInputFieldParam("5");// taking input from theNumber Of Devices
		addNewResellerClient.typeToresellerLimitInputFieldParam("10");// taking input from the Reseller Limit
		addNewResellerClient.typeTobalanceLimitInputFieldParam("2000");// taking input from the Balance Limit
		addNewResellerClient.typeToemailInputFieldFieldParam("abcd@gmail.com");// taking input from the Email
		addNewResellerClient.typeTophoneNoInputFieldEParam("1234567890987");// taking input from the phone no
		addNewResellerClient.typeTocityInputFieldEParam("Dubai");// taking input from the city
		addNewResellerClient.countryTypeelementDropDownField();// select inputs data form the country Type drop down field 
		addNewResellerClient.typeTostateInputFieldEParam("UAE");// taking input from the state name
		addNewResellerClient.typeToaddressInputFieldParam("1/E/A/Street");// taking input from the address
		//addNewResellerClient.isTVResellerelementDropDownField();// select inputs data form the Is TV Reseller Type drop down field 
		//addNewResellerClient.showAppBannerelementDropDownField();// select inputs data form the Show App Banner Type drop down field 
		//addNewResellerClient.showFullScreenelementDropDownField();// select inputs data form the Show Full Screen Type drop down field 
		//addNewResellerClient.lowBALNotifyEmailelementDropDownField();// select inputs data form the Low BAL Notify Email Type drop down field 
		//addNewResellerClient.assignPremiumLockedBundleelementDropDownField();// select inputs data form the Assign Premium Locked Bundle Type drop down field 
		//addNewResellerClient.submitButton();// click submit button
	}
	//@Test(priority=25)
	public void paste_the_text_into_iOS_onclick_URL_input_field_using_the_paste_action() throws IOException, InterruptedException{
		addNewResellerClient = loginPage.addNewResellerClientLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewResellerClient.openaddNewResellerForm();// open the Add New Reseller Client  Form Page.
		addNewResellerClient.typeToResellerNameInputFieldParam("khan VPN reseller");//taking input from the reseller Name
		addNewResellerClient.typeAndClearResellerNameInputFieldParam("");
		addNewResellerClient.typeTologinInputFieldParam("ani.kolpolok@gmail.com");// taking input from the login
		addNewResellerClient.typeToPasswordInputFieldParam("1111111111111111111");// taking input from the password
		addNewResellerClient.typeToCreditLimitInputFieldParam("1000");// taking input from the credit limit
		addNewResellerClient.searchandtypeelementDropDownIPBundleField();// select inputs data form the IP Bundle drop down field
		addNewResellerClient.searchandtypeelementDropDownIPBundle2Field();//select inputs data form the IP Bundle 2  drop down field
		addNewResellerClient.ratePlaneelementDropDownField();// select inputs data form the Rate Plan drop down field
		addNewResellerClient.pinResetOptioneelementDropDownField();// select inputs data form the PIN Reset Option drop down field 
		addNewResellerClient.resellerPanelTypeelementDropDownField();//  select inputs data form the Reseller Panel Type drop down field 
		addNewResellerClient.checkActiveInactiveCheckboxInputField();//click on active button
		addNewResellerClient.appPINLoginelementDropDownField();//select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeToBrandNameInputFieldParam("International brand");//  taking inputs from brand name input field
		addNewResellerClient.typeToBrandPINPrefixInputFieldParam("pr");//select inputs data form the Brand PIN Prefix Type drop down field 
		addNewResellerClient.typeToAllowAppsInputFieldElement();//select inputs data form the Allow Apps Type drop down field 
		addNewResellerClient.isCustomizePanelelementDropDownField();// select inputs data form the Is Customize Panel Type drop down field 
		//addNewResellerClient.typeToIsCustomizePanelPanelNameFieldParam("panel name of reseller");// taking input from the panel name
		addNewResellerClient.hasLimitofPINelementDropDownField();// select inputs data form the Has Limit of PIN??  Type drop down field 
		addNewResellerClient.typeToPinLimitInputFieldParam("2");// taking input from Pin Limit
		addNewResellerClient.onlyTypeelementDropDownField();// select inputs data form the Type Type drop down field 
		addNewResellerClient.mainResellerTypeelementDropDownField();// select inputs data form the App PIN Login* Type drop down field 
		addNewResellerClient.typeTonumberOfDevicesInputFieldParam("5");// taking input from theNumber Of Devices
		addNewResellerClient.typeToresellerLimitInputFieldParam("10");// taking input from the Reseller Limit
		addNewResellerClient.typeTobalanceLimitInputFieldParam("2000");// taking input from the Balance Limit
		addNewResellerClient.typeToemailInputFieldFieldParam("abcd@gmail.com");// taking input from the Email
		addNewResellerClient.typeTophoneNoInputFieldEParam("1234567890987");// taking input from the phone no
		addNewResellerClient.typeTocityInputFieldEParam("Dubai");// taking input from the city
		addNewResellerClient.countryTypeelementDropDownField();// select inputs data form the country Type drop down field 
		addNewResellerClient.typeTostateInputFieldEParam("UAE");// taking input from the state name
		addNewResellerClient.typeToaddressInputFieldParam("1/E/A/Street");// taking input from the address
		//addNewResellerClient.isTVResellerelementDropDownField();// select inputs data form the Is TV Reseller Type drop down field 
		//addNewResellerClient.showAppBannerelementDropDownField();// select inputs data form the Show App Banner Type drop down field 
		//addNewResellerClient.showFullScreenelementDropDownField();// select inputs data form the Show Full Screen Type drop down field 
		//addNewResellerClient.lowBALNotifyEmailelementDropDownField();// select inputs data form the Low BAL Notify Email Type drop down field 
		//addNewResellerClient.assignPremiumLockedBundleelementDropDownField();// select inputs data form the Assign Premium Locked Bundle Type drop down field 
		//addNewResellerClient.submitButton();// click submit button	
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}
