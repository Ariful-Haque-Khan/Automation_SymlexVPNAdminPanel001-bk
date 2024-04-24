/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.new_customize_reseller_panel;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.NewCustomizeResellerPanel;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class BrandNameFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	NewCustomizeResellerPanel newCustomizeResellerPanel;
	
	//Initializing PageFactory
	public BrandNameFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void NewCustomizeResellerPanelCommon(String brand_name) throws IOException, InterruptedException {
		newCustomizeResellerPanel = loginPage.customPanelNameLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		newCustomizeResellerPanel.openNewCustomizeResellerPanelPage();// open the New Customize Reseller Panel Form Page.
		newCustomizeResellerPanel.typeToCustomPanelNameParam("customized");//select inputs data from the Custom Panel Name input text field
		newCustomizeResellerPanel.searchandtypeelementDropDownField();// select from the Reseller with Level input text field
		newCustomizeResellerPanel.typeToHostServerParam("100.2.1.3.100");// for taking inputs from the Host Server input text field
		newCustomizeResellerPanel.typeONBrandNameParam(brand_name);// for taking inputs from the Brand Name input text field
		//newCustomizeResellerPanel.clickONSubmitButton();//for create button
		
	}	
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Brand_Name_input_field() throws IOException, InterruptedException {NewCustomizeResellerPanelCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_Brand_Name_input_field() throws IOException, InterruptedException {NewCustomizeResellerPanelCommon("International brand");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("           International brand"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("International brand                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Brand_Name_input_field() throws IOException, InterruptedException{NewCustomizeResellerPanelCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Brand_Name_input_field() throws IOException, InterruptedException{
	}
	@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		newCustomizeResellerPanel = loginPage.customPanelNameLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		newCustomizeResellerPanel.openNewCustomizeResellerPanelPage();// open the New Customize Reseller Panel Form Page.
		newCustomizeResellerPanel.typeToCustomPanelNameParam("customizedpanel");//select inputs data from the Custom Panel Name input text field
		newCustomizeResellerPanel.searchandtypeelementDropDownField();// select from the Reseller with Level input text field
		newCustomizeResellerPanel.typeToHostServerParam("100.0.0.1");// for taking inputs from the Host Server input text field
		newCustomizeResellerPanel.typeONBrandNameParam("International");// for taking inputs from the Brand Name input text field
		newCustomizeResellerPanel.typeAndCleartheHostServerParam("");//clear the text
		//newCustomizeResellerPanel.clickONSubmitButton();//for create button
		
	}
	//@Test(priority=21)
	public void enter_then_undo_the_input_action_into_Brand_Name_input_field() throws IOException, InterruptedException{
		newCustomizeResellerPanel = loginPage.customPanelNameLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		newCustomizeResellerPanel.openNewCustomizeResellerPanelPage();// open the New Customize Reseller Panel Form Page.
		newCustomizeResellerPanel.typeToCustomPanelNameParam("customizedpanel");//select inputs data from the Custom Panel Name input text field
		newCustomizeResellerPanel.searchandtypeelementDropDownField();// for taking inputs from the Payment TNX ID input text field
		newCustomizeResellerPanel.typeToHostServerParam("100.0.0.1");// for taking inputs from the Price USD input text field
		newCustomizeResellerPanel.typeONBrandNameParam("International");// for taking inputs from the Username/PIN input text field
		newCustomizeResellerPanel.typeAndCleartheHostServerParam("");//undo the text
		//newCustomizeResellerPanel.clickONSubmitButton();//for create button
		
	}
	//@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_Brand_Name_input_field() throws IOException, InterruptedException{
		newCustomizeResellerPanel = loginPage.customPanelNameLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		newCustomizeResellerPanel.openNewCustomizeResellerPanelPage();// open the New Customize Reseller Panel Form Page.
		newCustomizeResellerPanel.typeToCustomPanelNameParam("customizedpanel");//select inputs data from the Custom Panel Name input text field
		newCustomizeResellerPanel.searchandtypeelementDropDownField();// select from the Reseller with Level input text field
		newCustomizeResellerPanel.typeToHostServerParam("100.0.0.1");// for taking inputs from the Host Server input text field
		newCustomizeResellerPanel.typeONBrandNameParam("International");// for taking inputs from the Brand Name input text field
		newCustomizeResellerPanel.typeAndCleartheHostServerParam("");//undo the text 
		newCustomizeResellerPanel.typeONBrandNameParam("International");//redo the text
		//newCustomizeResellerPanel.clickONSubmitButton();//for create button
	}
	//@Test(priority=23)
	@Ignore
	public void enter_text_and_navigate_through_into_Brand_Name_input_field_using_the_tab_key() throws IOException, InterruptedException{
		newCustomizeResellerPanel = loginPage.customPanelNameLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		newCustomizeResellerPanel.openNewCustomizeResellerPanelPage();// open the New Customize Reseller Panel Form Page.
		newCustomizeResellerPanel.typeToCustomPanelNameParam("customizedpanel");//select inputs data from the Custom Panel Name input text field
		newCustomizeResellerPanel.searchandtypeelementDropDownField();// select from the Reseller with Level input text field
		newCustomizeResellerPanel.typeToHostServerParam("100.0.0.1");// for taking inputs from the Host Server input text field
		newCustomizeResellerPanel.typetotheBrandNameParamTabKey();//navigate the tab key
		newCustomizeResellerPanel.typeONBrandNameParam("International");// for taking inputs from the Brand Name input text field
		//newCustomizeResellerPanel.clickONSubmitButton();//for create button
	}
	//@Test(priority=24)
	public void paste_the_text_into_Brand_Name_input_field_using_the_paste_action() throws IOException, InterruptedException{
		newCustomizeResellerPanel = loginPage.customPanelNameLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		newCustomizeResellerPanel.openNewCustomizeResellerPanelPage();// open the New Customize Reseller Panel Form Page.
		newCustomizeResellerPanel.typeToCustomPanelNameParam("");//select inputs data from the Custom Panel Name input text field
		newCustomizeResellerPanel.searchandtypeelementDropDownField();// select from the Reseller with Level input text field
		newCustomizeResellerPanel.typeToHostServerParam("100.0.0.1");// for taking inputs from the Host Server input text field
		newCustomizeResellerPanel.typeONBrandNameParam("International");// for taking inputs from the Brand Name input text field
		//newCustomizeResellerPanel.clickONSubmitButton();//for create button
		
	}
		
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
	
