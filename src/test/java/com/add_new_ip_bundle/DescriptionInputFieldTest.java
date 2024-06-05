/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_ip_bundle;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.IpBundleElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class DescriptionInputFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	IpBundleElement ipBundleElement;
	
	//Initializing PageFactory
	public DescriptionInputFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void ipBundleElementCommon(String description) throws IOException, InterruptedException {
		ipBundleElement = loginPage.ipBundleElementLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		ipBundleElement.openIpBundleElementForm();// open the Add New server Form Page.
		ipBundleElement.typeToBundleNameFieldParam("Automation TEST Bundle");//taking input from Server Name
		ipBundleElement.typeToDescriptionFieldParam(description);// taking input from the IP
		ipBundleElement.clickActiveCheckboxField();//click on is active checkbox
		//ipBundleElement.clickToSubmitButton();// click on Submit button
		
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_description_input_field() throws IOException, InterruptedException {ipBundleElementCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_description_input_field() throws IOException, InterruptedException {ipBundleElementCommon("this ip bundle is only for testing purpose");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("               this ip bundle is only for testing purpose"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("this ip bundle is only for testing purpose                    ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("TEST SERVER");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_description_input_field() throws IOException, InterruptedException{ipBundleElementCommon("á, ç, ō,  á, ç, ō");}

	
	//@Test(priority=21)
	public void enter_then_clear_the_text_into_description_input_field() throws IOException, InterruptedException{
		ipBundleElement = loginPage.ipBundleElementLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		ipBundleElement.openIpBundleElementForm();// open the Add New server Form Page.
		ipBundleElement.typeToBundleNameFieldParam("Automation Test Bundle");//taking input from Bundle Name
		ipBundleElement.typeToDescriptionFieldParam("this ip bundle is only for testing purpose");// taking input from the Description
		ipBundleElement.typeAndClearDescriptionFieldParam("");// clear the text
		ipBundleElement.clickActiveCheckboxField();//click on is active checkbox
		//ipBundleElement.clickToSubmitButton();// click on Submit button
		
	}
	//@Test(priority=22)
	public void enter_then_undo_the_input_action_into_description_input_field() throws IOException, InterruptedException{
		ipBundleElement = loginPage.ipBundleElementLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		ipBundleElement.openIpBundleElementForm();// open the Add New server Form Page.
		ipBundleElement.typeToBundleNameFieldParam("Automation Test Bundle");//taking input from Bundle Name
		ipBundleElement.typeToDescriptionFieldParam("this ip bundle is only for testing purpose");// taking input from the Description
		ipBundleElement.typeAndClearDescriptionFieldParam("");// undo the text
		ipBundleElement.clickActiveCheckboxField();//click on is active checkbox
		//ipBundleElement.clickToSubmitButton();// click on Submit button
		
	}
	
	@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_description_input_field() throws IOException, InterruptedException{
		ipBundleElement = loginPage.ipBundleElementLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		ipBundleElement.openIpBundleElementForm();// open the Add New server Form Page.
		ipBundleElement.typeToBundleNameFieldParam("Automation Test Bundle");//taking input from Bundle Name
		ipBundleElement.typeToDescriptionFieldParam("this ip bundle is only for testing purpose");// taking input from the Description
		ipBundleElement.typeAndClearDescriptionFieldParam("");// undo the text
		ipBundleElement.typeToDescriptionFieldParam("this ip bundle is only for testing purpose");//redo the text
		ipBundleElement.clickActiveCheckboxField();//click on is active checkbox
		//ipBundleElement.clickToSubmitButton();// click on Submit button
		
	}
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_description_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		ipBundleElement = loginPage.ipBundleElementLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		ipBundleElement.openIpBundleElementForm();// open the Add New server Form Page.
		ipBundleElement.typeToBundleNameFieldParam("Automation Test Bundle");//taking input from Server Name
		ipBundleElement.typetoDescriptiontabKey();
		ipBundleElement.typeToDescriptionFieldParam("this ip bundle is only for testing purpose");// taking input from the IP
		ipBundleElement.clickActiveCheckboxField();//click on is active checkbox
		//ipBundleElement.clickToSubmitButton();// click on Submit button
		
	}
	//@Test(priority=25)
	public void paste_the_text_into_description_input_field_using_the_paste_action() throws IOException, InterruptedException{
		ipBundleElement = loginPage.ipBundleElementLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		ipBundleElement.openIpBundleElementForm();// open the Add New server Form Page.
		ipBundleElement.typeToBundleNameFieldParam("Automation Test Bundle");//taking input from Server Name
		ipBundleElement.typetoDescriptiontabKey();
		ipBundleElement.typeToDescriptionFieldParam("this ip bundle is only for testing purpose");// taking input from the IP
		ipBundleElement.clickActiveCheckboxField();//click on is active checkbox
		//ipBundleElement.clickToSubmitButton();// click on Submit button
		
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

}

