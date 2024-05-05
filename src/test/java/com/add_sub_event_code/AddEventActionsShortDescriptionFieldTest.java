/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_sub_event_code;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddSubEventCode;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AddEventActionsShortDescriptionFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddSubEventCode addSubEventCode;
	
	//Initializing PageFactory
	public AddEventActionsShortDescriptionFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void addSubEventCodeCommon(String Short_Descriptions) throws IOException, InterruptedException {
		addSubEventCode = loginPage.addSubEventCodeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addSubEventCode.openAddSubEventCodeForm();// open the Add Sub Event Code Page.
		addSubEventCode.typetoPaymentMethodSelectField();//select from the payment method
		addSubEventCode.typetoEventCodeSelectField();
		addSubEventCode.typeCodeFieldParam("card_expired");// taking input from the Code
		addSubEventCode.typeShortDescriptionsParam(Short_Descriptions);// taking inputs from the Short Descriptions
		addSubEventCode.clickTIsActiveCheckboxField(); //  check box for active status
		//addSubEventCode.clickONSubmitButton(); //click on submit button
			
	}
		
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Short_Descriptions_input_field() throws IOException, InterruptedException {addSubEventCodeCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_Short_Descriptions_input_field() throws IOException, InterruptedException {addSubEventCodeCommon("this code will expire soon");	}
	@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Short_Descriptions_input_field() throws IOException, InterruptedException{addSubEventCodeCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Short_Descriptions_input_field() throws IOException, InterruptedException{ 
			
	}
	@Test(priority=21)
	public void enter_then_clear_the_text_into_Short_Descriptions_input_field() throws IOException, InterruptedException{
		addSubEventCode = loginPage.addSubEventCodeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addSubEventCode.openAddSubEventCodeForm();// open the Add Sub Event Code Page.
		addSubEventCode.typetoPaymentMethodSelectField();//select from the payment method
		addSubEventCode.typetoEventCodeSelectField();// select code from the event code
		addSubEventCode.typeCodeFieldParam("code_expired");// taking input from the Code
		addSubEventCode.typeShortDescriptionsParam("this code will expire soon");// taking inputs from the Short Descriptions
		addSubEventCode.typeAndClearShortDescriptionsFieldParam("");//clear the text
		addSubEventCode.clickTIsActiveCheckboxField(); //  check box for active status
		//addSubEventCode.clickONSubmitButton(); //click on submit button
			
		
		
	}
	//@Test(priority=22)
	public void enter_then_undo_the_input_action_into_Short_Descriptions_input_field() throws IOException, InterruptedException{
		addSubEventCode = loginPage.addSubEventCodeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addSubEventCode.openAddSubEventCodeForm();// open the Add Sub Event Code Page.
		addSubEventCode.typetoPaymentMethodSelectField();//select from the payment method
		addSubEventCode.typetoEventCodeSelectField();// select code from the event code
		addSubEventCode.typeCodeFieldParam("code_expired");// taking input from the Code
		addSubEventCode.typeShortDescriptionsParam("this code will expire soon");// taking inputs from the Short Descriptions
		addSubEventCode.typeAndClearShortDescriptionsFieldParam("");//undo the text
		addSubEventCode.clickTIsActiveCheckboxField(); //  check box for active status
		//addSubEventCode.clickONSubmitButton(); //click on submit button
	}
	
	//@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_Short_Descriptions_input_field() throws IOException, InterruptedException{
		addSubEventCode = loginPage.addSubEventCodeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addSubEventCode.openAddSubEventCodeForm();// open the Add Sub Event Code Page.
		addSubEventCode.typetoPaymentMethodSelectField();//select from the payment method
		addSubEventCode.typetoEventCodeSelectField();// select code from the event code
		addSubEventCode.typeCodeFieldParam("code_expired");// taking input from the Code
		addSubEventCode.typeShortDescriptionsParam("this code will expire soon");// taking inputs from the Short Descriptions
		addSubEventCode.typeAndClearShortDescriptionsFieldParam("");//undo the text
		addSubEventCode.typeShortDescriptionsParam("this code will expire soon");// redo the text
		addSubEventCode.clickTIsActiveCheckboxField(); //  check box for active status
		//addSubEventCode.clickONSubmitButton(); //click on submit button
	}
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_Short_Descriptions_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		addSubEventCode = loginPage.addSubEventCodeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addSubEventCode.openAddSubEventCodeForm();// open the Add Sub Event Code Page.
		addSubEventCode.typetoPaymentMethodSelectField();//select from the payment method
		addSubEventCode.typetoEventCodeSelectField();//select code from the event code
		addSubEventCode.typeCodeFieldParam("code_expired");// taking input from the Code
		addSubEventCode.typeAndClearCodeFieldParam("this code will expire soon");//undo the text
		addSubEventCode.typeShortDescriptionsParam("this code will expire soon");// taking inputs from the Short Descriptions
		addSubEventCode.typetoShortDescriptionstabKey();//navigate to the tab key
		addSubEventCode.clickTIsActiveCheckboxField(); //  check box for active status
		//addSubEventCode.clickONSubmitButton(); //click on submit button
	}
	
	//@Test(priority=25)
	public void paste_the_text_into_Short_Descriptions_input_field_using_the_paste_action() throws IOException, InterruptedException{
		addSubEventCode = loginPage.addSubEventCodeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addSubEventCode.openAddSubEventCodeForm();// open the Add Sub Event Code Page.
		addSubEventCode.typetoPaymentMethodSelectField();//select from the payment method
		addSubEventCode.typetoEventCodeSelectField();// select code from the event code
		addSubEventCode.typeCodeFieldParam("code_expired");// taking input from the Code
		addSubEventCode.typeShortDescriptionsParam("this code will expire soon");// taking inputs from the Short Descriptions
		addSubEventCode.clickTIsActiveCheckboxField(); //  check box for active status
		//addSubEventCode.clickONSubmitButton(); //click on submit button
			
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}
