/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_payment_method;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewPaymentMethod;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class TitleFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewPaymentMethod addNewPaymentMethod;
	
	//Initializing PageFactory
	public TitleFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void newAdminCreationCommon(String title) throws IOException, InterruptedException {
		addNewPaymentMethod = loginPage.addNewPaymentMethodLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewPaymentMethod.openAddNewPaymentMethodForm();// open the Add New Payment Method Form Page.
		addNewPaymentMethod.typeToTitleFieldParam(title);//taking input from the Title
		addNewPaymentMethod.typeToKeyFieldParam("12345");// taking input from the Key
		addNewPaymentMethod.typeToSecretFieldParam("123456789");// taking inputs from the Secret
		addNewPaymentMethod.GatewaytypeSelectField(); //select Gateway Type drop down button
		addNewPaymentMethod.typePlatformField();// select platform drop down button
		addNewPaymentMethod.typeSubscriptionTypeField();// select Subscription Type drop down button
		addNewPaymentMethod.checkActiveInactiveCheckboxInputField();//taking input from the Phone No
		//addNewPaymentMethod.clickONSubmitButton();//click on submit button
			
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Title_input_field() throws IOException, InterruptedException {newAdminCreationCommon("");	}
	//@Test(priority=2)
	public void enter_a_valid_text_into_Title_input_field() throws IOException, InterruptedException {newAdminCreationCommon("offline payment");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Title_input_field() throws IOException, InterruptedException{newAdminCreationCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Title_input_field() throws IOException, InterruptedException{ 
			
	}
	
	//@Test(priority=21)
	public void enter_then_clear_the_text_into_user_name_input_field() throws IOException, InterruptedException{
		addNewPaymentMethod = loginPage.addNewPaymentMethodLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewPaymentMethod.openAddNewPaymentMethodForm();// open the Add New Payment Method Form Page.
		addNewPaymentMethod.typeToTitleFieldParam("offline payment");//taking input from the Title
		addNewPaymentMethod.typeAndClearTitleFieldParam("");//clear the text
		addNewPaymentMethod.typeToKeyFieldParam("12345");// taking input from the Key
		addNewPaymentMethod.typeToSecretFieldParam("123456789");// taking inputs from the Secret
		addNewPaymentMethod.GatewaytypeSelectField(); //select Gateway Type drop down button
		addNewPaymentMethod.typePlatformField();// select platform drop down button
		addNewPaymentMethod.typeSubscriptionTypeField();// select Subscription Type drop down button
		addNewPaymentMethod.checkActiveInactiveCheckboxInputField();//taking input from the Phone No
		addNewPaymentMethod.clickONSubmitButton();//click on submit button
		
	}
	@Test(priority=22)
	public void enter_then_undo_the_input_action_into_user_name_input_field() throws IOException, InterruptedException{
		addNewPaymentMethod = loginPage.addNewPaymentMethodLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewPaymentMethod.openAddNewPaymentMethodForm();// open the Add New Payment Method Form Page.
		addNewPaymentMethod.typeToTitleFieldParam("offline payment");//taking input from the Title
		addNewPaymentMethod.typeAndClearTitleFieldParam("");//undo the text
		addNewPaymentMethod.typeToKeyFieldParam("12345");// taking input from the Key
		addNewPaymentMethod.typeToSecretFieldParam("123456789");// taking inputs from the Secret
		addNewPaymentMethod.GatewaytypeSelectField(); //select Gateway Type drop down button
		addNewPaymentMethod.typePlatformField();// select platform drop down button
		addNewPaymentMethod.typeSubscriptionTypeField();// select Subscription Type drop down button
		addNewPaymentMethod.checkActiveInactiveCheckboxInputField();//taking input from the Phone No
		//addNewPaymentMethod.clickONSubmitButton();//click on submit button
		
	}
	
	//@Test(priority=23)
	public void enter_then_undo_and_redo_the_input_action_into_user_name_input_field() throws IOException, InterruptedException{
		addNewPaymentMethod = loginPage.addNewPaymentMethodLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewPaymentMethod.openAddNewPaymentMethodForm();// open the Add New Payment Method Form Page.
		addNewPaymentMethod.typeToTitleFieldParam("offline payment");//taking input from the Title
		addNewPaymentMethod.typeAndClearTitleFieldParam("");//undo the text
		addNewPaymentMethod.typeToTitleFieldParam("offline payment");//redo the text
		addNewPaymentMethod.typeToKeyFieldParam("12345");// taking input from the Key
		addNewPaymentMethod.typeToSecretFieldParam("123456789");// taking inputs from the Secret
		addNewPaymentMethod.GatewaytypeSelectField(); //select Gateway Type drop down button
		addNewPaymentMethod.typePlatformField();// select platform drop down button
		addNewPaymentMethod.typeSubscriptionTypeField();// select Subscription Type drop down button
		addNewPaymentMethod.checkActiveInactiveCheckboxInputField();//taking input from the Phone No
		addNewPaymentMethod.clickONSubmitButton();//click on submit button
	}
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_into_user_name_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		addNewPaymentMethod = loginPage.addNewPaymentMethodLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewPaymentMethod.openAddNewPaymentMethodForm();// open the Add New Payment Method Form Page.
		addNewPaymentMethod.typeToTitleFieldParam("offline payment");//taking input from the Title
		addNewPaymentMethod. typetoTitletabKey();
		addNewPaymentMethod.typeToKeyFieldParam("12345");// taking input from the Key
		addNewPaymentMethod.typeToSecretFieldParam("123456789");// taking inputs from the Secret
		addNewPaymentMethod.GatewaytypeSelectField(); //select Gateway Type drop down button
		addNewPaymentMethod.typePlatformField();// select platform drop down button
		addNewPaymentMethod.typeSubscriptionTypeField();// select Subscription Type drop down button
		addNewPaymentMethod.checkActiveInactiveCheckboxInputField();//taking input from the Phone No
		addNewPaymentMethod.clickONSubmitButton();//click on submit button
	}
	
	//@Test(priority=25)
	public void paste_the_text_into_user_name_input_field_using_the_paste_action() throws IOException, InterruptedException{
		addNewPaymentMethod = loginPage.addNewPaymentMethodLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewPaymentMethod.openAddNewPaymentMethodForm();// open the Add New Payment Method Form Page.
		addNewPaymentMethod.typeToTitleFieldParam("offline payment");//taking input from the Title
		addNewPaymentMethod.typeToKeyFieldParam("12345");// taking input from the Key
		addNewPaymentMethod.typeToSecretFieldParam("123456789");// taking inputs from the Secret
		addNewPaymentMethod.GatewaytypeSelectField(); //select Gateway Type drop down button
		addNewPaymentMethod.typePlatformField();// select platform drop down button
		addNewPaymentMethod.typeSubscriptionTypeField();// select Subscription Type drop down button
		addNewPaymentMethod.checkActiveInactiveCheckboxInputField();//taking input from the Phone No
		addNewPaymentMethod.clickONSubmitButton();//click on submit button
		
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}

