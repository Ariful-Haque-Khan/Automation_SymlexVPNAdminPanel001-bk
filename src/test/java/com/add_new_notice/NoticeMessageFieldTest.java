/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_notice;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewNotice;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class NoticeMessageFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewNotice addNewNotice;
	
	//Initializing PageFactory
	public NoticeMessageFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void AddNewNoticeFormCommon(String notice) throws IOException, InterruptedException {
		addNewNotice = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewNotice.openAddNewNoticePage();// open the Add New Notice Form Page.
		addNewNotice.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		addNewNotice.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		addNewNotice.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		addNewNotice.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		addNewNotice.timePeriodToInputField();// select inputs data form the time to Type drop down field
		addNewNotice.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		addNewNotice.typetonoticeMessageInputParam(notice);//taking inputs from the Notice Message input text field
		addNewNotice.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		addNewNotice.typetopushRemarksParam("the notice is only for UAE user");//  taking inputs from the Remarks input text field
		addNewNotice.activeInactiveStatusInputField();// enable/disable to active button
		//addNewNotice.submitButtonInputField ();// for submit button	
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Notice_Message_input_field() throws IOException, InterruptedException {AddNewNoticeFormCommon("");	}
	//@Test(priority=2)
	public void enter_a_valid_text_iinto_Notice_Message_input_field() throws IOException, InterruptedException {AddNewNoticeFormCommon("test notice for automation");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("abc1234567abc");}
	@Test(priority=8)
	public void enter_special_characters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Notice_Message_input_field() throws IOException, InterruptedException{AddNewNoticeFormCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Notice_Message_input_field() throws IOException, InterruptedException{
			
	}
	//@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		addNewNotice = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewNotice.openAddNewNoticePage();// open the Add New Notice Form Page.
		addNewNotice.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		addNewNotice.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		addNewNotice.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		addNewNotice.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		addNewNotice.timePeriodToInputField();// select inputs data form the time to Type drop down field
		addNewNotice.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		addNewNotice.typetonoticeMessageInputParam("test notice for automation");//taking inputs from the Notice Message input text field
		addNewNotice.typeAndClearthenoticeMessageParam("");//clear the text
		addNewNotice.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		addNewNotice.typetopushRemarksParam("the notice is only for UAE user");//  taking inputs from the Remarks input text field
		addNewNotice.activeInactiveStatusInputField();// enable/disable to active button
		//addNewNotice.submitButtonInputField ();// for submit button
	}
	//@Test(priority=21)
	public void enter_then_undo_the_input_action_into_Notice_Message_input_field() throws IOException, InterruptedException{
		addNewNotice = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewNotice.openAddNewNoticePage();// open the Add New Notice Form Page.
		addNewNotice.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		addNewNotice.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		addNewNotice.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		addNewNotice.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		addNewNotice.timePeriodToInputField();// select inputs data form the time to Type drop down field
		addNewNotice.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		addNewNotice.typetonoticeMessageInputParam("test notice for automation");//taking inputs from the Notice Message input text field
		addNewNotice.typeAndClearthenoticeMessageParam("");//undo the text
		addNewNotice.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		addNewNotice.typetopushRemarksParam("the notice is only for UAE user");//  taking inputs from the Remarks input text field
		addNewNotice.activeInactiveStatusInputField();// enable/disable to active button
		//addNewNotice.submitButtonInputField ();// for submit button
	
	}
	//@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_Notice_Message_input_field() throws IOException, InterruptedException{
		addNewNotice = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewNotice.openAddNewNoticePage();// open the Add New Notice Form Page.
		addNewNotice.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		addNewNotice.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		addNewNotice.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		addNewNotice.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		addNewNotice.timePeriodToInputField();// select inputs data form the time to Type drop down field
		addNewNotice.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		addNewNotice.typetonoticeMessageInputParam("test notice for automation");//taking inputs from the Notice Message input text field
		addNewNotice.typeAndClearthenoticeMessageParam("");//clear the text
		addNewNotice.typetonoticeMessageInputParam("test notice for automation"); //redo the text
		addNewNotice.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		addNewNotice.typetopushRemarksParam("the notice is only for UAE user");//  taking inputs from the Remarks input text field
		addNewNotice.activeInactiveStatusInputField();// enable/disable to active button
		//addNewNotice.submitButtonInputField ();// for submit button
	}
	//@Test(priority=23)
	//@Ignore
	public void enter_text_and_navigate_through_into_Notice_Message_input_field_using_the_tab_key() throws IOException, InterruptedException{
		addNewNotice = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewNotice.openAddNewNoticePage();// open the Add New Notice Form Page.
		addNewNotice.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		addNewNotice.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		addNewNotice.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		addNewNotice.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		addNewNotice.timePeriodToInputField();// select inputs data form the time to Type drop down field
		addNewNotice.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		addNewNotice.typetonoticeMessageInputParam("");//taking inputs from the Notice Message input text field
		addNewNotice.typetothenoticeMessageTabKey();
		addNewNotice.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		addNewNotice.typetopushRemarksParam("the notice is only for UAE user");//  taking inputs from the Remarks input text field
		addNewNotice.activeInactiveStatusInputField();// enable/disable to active button
		//addNewNotice.submitButtonInputField ();// for submit button
	}
	//@Test(priority=24)
	public void paste_the_text_into_Notice_Message_input_field_using_the_paste_action() throws IOException, InterruptedException{
		addNewNotice = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewNotice.openAddNewNoticePage();// open the Add New Notice Form Page.
		addNewNotice.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		addNewNotice.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		addNewNotice.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		addNewNotice.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		addNewNotice.timePeriodToInputField();// select inputs data form the time to Type drop down field
		addNewNotice.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		addNewNotice.typetonoticeMessageInputParam("the notice is for autmation purpose");//taking inputs from the Notice Message input text field
		addNewNotice.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		addNewNotice.typetopushRemarksParam("the notice is only for UAE user");//  taking inputs from the Remarks input text field
		addNewNotice.activeInactiveStatusInputField();// enable/disable to active button
		//addNewNotice.submitButtonInputField ();// for submit button

	}
		
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
	
