/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.edit_notice;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.NoticeForUsersElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class PushRemarksEditFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	NoticeForUsersElement noticeForUsersElement;
	
	//Initializing PageFactory
	public PushRemarksEditFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void EditNoticeCommon(String remarks) throws IOException, InterruptedException {
		noticeForUsersElement = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editNotice/12"); //open the Add New Notice Form Page.
		noticeForUsersElement.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		noticeForUsersElement.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		noticeForUsersElement.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		noticeForUsersElement.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		noticeForUsersElement.timePeriodToInputField();// select inputs data form the time to Type drop down field
		noticeForUsersElement.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		noticeForUsersElement.typetonoticeMessageInputParam("");//taking inputs from the Notice Message input text field
		noticeForUsersElement.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		noticeForUsersElement.typeAndClearthepushRemarksParam("");//clear the text
		noticeForUsersElement.typetopushRemarksParam(remarks);//  taking inputs from the Remarks input text field
		noticeForUsersElement.activeInactiveStatusInputField();// enable/disable to active button
		//noticeForUsersElement.submitButtonInputField ();// for submit button	
	}

	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Push_Remarks_input_field() throws IOException, InterruptedException {EditNoticeCommon("");	}
	//@Test(priority=2)
	public void enter_a_valid_text_iinto_Push_Remarks_input_field() throws IOException, InterruptedException {EditNoticeCommon("test push remarks for automation");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Push_Remarks_input_field() throws IOException, InterruptedException{EditNoticeCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Push_Remarks_input_field() throws IOException, InterruptedException{
	}
	@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		noticeForUsersElement = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editNotice/12"); //open the Add New Notice Form Page.
		noticeForUsersElement.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		noticeForUsersElement.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		noticeForUsersElement.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		noticeForUsersElement.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		noticeForUsersElement.timePeriodToInputField();// select inputs data form the time to Type drop down field
		noticeForUsersElement.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		noticeForUsersElement.typetonoticeMessageInputParam("");//taking inputs from the Notice Message input text field
		noticeForUsersElement.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		noticeForUsersElement.typeAndClearthepushRemarksParam("");//clear the text
		noticeForUsersElement.activeInactiveStatusInputField();// enable/disable to active button
		//noticeForUsersElement.submitButtonInputField ();// for submit button	
	}
	//@Test(priority=21)
	public void enter_then_undo_the_input_action_into_Push_Remarks_input_field() throws IOException, InterruptedException{
		noticeForUsersElement = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editNotice/12"); //open the Add New Notice Form Page.
		noticeForUsersElement.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		noticeForUsersElement.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		noticeForUsersElement.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		noticeForUsersElement.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		noticeForUsersElement.timePeriodToInputField();// select inputs data form the time to Type drop down field
		noticeForUsersElement.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		noticeForUsersElement.typetonoticeMessageInputParam("");//taking inputs from the Notice Message input text field
		noticeForUsersElement.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		noticeForUsersElement.typeAndClearthepushRemarksParam("");//clear the text
		noticeForUsersElement.activeInactiveStatusInputField();// enable/disable to active button
		//noticeForUsersElement.submitButtonInputField ();// for submit button	
	}
	@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_Push_Remarks_input_field() throws IOException, InterruptedException{
		noticeForUsersElement = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editNotice/12"); //open the Add New Notice Form Page.
		noticeForUsersElement.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		noticeForUsersElement.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		noticeForUsersElement.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		noticeForUsersElement.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		noticeForUsersElement.timePeriodToInputField();// select inputs data form the time to Type drop down field
		noticeForUsersElement.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		noticeForUsersElement.typetonoticeMessageInputParam("");//taking inputs from the Notice Message input text field
		noticeForUsersElement.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		noticeForUsersElement.typeAndClearthepushRemarksParam("");//clear the text
		noticeForUsersElement.typetopushRemarksParam("the notice is only for UAE user");
		noticeForUsersElement.activeInactiveStatusInputField();// enable/disable to active button
		//noticeForUsersElement.submitButtonInputField ();// for submit button	
	}
	//@Test(priority=23)
	//@Ignore
	public void enter_text_and_navigate_through_into_Push_Remarks_input_field_using_the_tab_key() throws IOException, InterruptedException{
		noticeForUsersElement = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		noticeForUsersElement.openAddNewNoticePage();// open the Add New Notice Form Page.
		noticeForUsersElement.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		noticeForUsersElement.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		noticeForUsersElement.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		noticeForUsersElement.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		noticeForUsersElement.timePeriodToInputField();// select inputs data form the time to Type drop down field
		noticeForUsersElement.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		noticeForUsersElement.typetonoticeMessageInputParam("");//taking inputs from the Notice Message input text field
		noticeForUsersElement.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		noticeForUsersElement.typetopushRemarksParam("");//  taking inputs from the Remarks input text field
		noticeForUsersElement.typetothepushRemarksTabKey();//navigate to the tab key
		noticeForUsersElement.activeInactiveStatusInputField();// enable/disable to active button
		//noticeForUsersElement.submitButtonInputField ();// for submit button
	}
	//@Test(priority=24)
	public void paste_the_text_into_Push_Remarks_input_field_using_the_paste_action() throws IOException, InterruptedException{
		noticeForUsersElement = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		noticeForUsersElement.openAddNewNoticePage();// open the Add New Notice Form Page.
		noticeForUsersElement.selectDatafromNoticeTypeDropDownElement();//select inputs data form the Notice Type drop down field
		noticeForUsersElement.selectDataFromsuserTypeDropdownField();// select inputs data form the User Type drop down field
		noticeForUsersElement.selectDataFromsOperationTypeDropdownField();// select inputs data form the Operation Type drop down field
		noticeForUsersElement.timePeriodFromInputField();// select inputs data form the Time Period Type drop down field
		noticeForUsersElement.timePeriodToInputField();// select inputs data form the time to Type drop down field
		noticeForUsersElement.selectDatafromPageControlDropDownElement();// select inputs data form the Page Control drop down field
		noticeForUsersElement.typetonoticeMessageInputParam("");//taking inputs from the Notice Message input text field
		noticeForUsersElement.typetopushMessageParam("push message for automation");//taking inputs from the Push Message input text field
		noticeForUsersElement.typetopushRemarksParam("");//  taking inputs from the Remarks input text field
		noticeForUsersElement.activeInactiveStatusInputField();// enable/disable to active button
		//noticeForUsersElement.submitButtonInputField ();// for submit button
	
	}
		
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
	
