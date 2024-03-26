/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.send_push_to_user;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.SendPushtoUser;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class PageControlFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	SendPushtoUser sendPushtoUser;
	
	//Initializing PageFactory
	public PageControlFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	public void SendPushtoUserCommon(String page_control) throws IOException, InterruptedException {
		sendPushtoUser = loginPage.sendPushtoUserLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendPushtoUser.openSendPushtoUserPage();// open the send push to user Form Page.
		sendPushtoUser.selectDatafromAppNameDropDownElement();//select inputs data form the app name drop down field
		sendPushtoUser.datafromWithChildDropDownElement();// for with child check box
		sendPushtoUser.typetoPINWithCommaSeparatedInputParam("ani1yr, anika@kolpolok.com");// taking input from the pin with comma separated
		sendPushtoUser.datafromPINStatusCheckboxElement();// for active status check box
		sendPushtoUser.datafromPINStatusInactiveCheckboxElement();// for inactive status check box
		sendPushtoUser.datafromPINStatusExpiredCheckboxElement();//for expired status check box
		sendPushtoUser.selectDatafromPaymentMethodDropDownElement();//select inputs data form the payment method drop down field
		sendPushtoUser.selectDatafromCountryFilterDropDownElement();//  select inputs data form the country filter drop down field
		sendPushtoUser.selectDatafromCountryDropDownElement();// select inputs data form the app country drop down field
		sendPushtoUser.selectDatafromTargetDeviceDropDownElement();//select inputs data form the target devices drop down field
		sendPushtoUser.dateFilterColumnDropdownField();//  select inputs data form the date filter column (first login to) drop down field
		sendPushtoUser.dateFilterConditionDropdownField();//select inputs data form the date filter column (is equal to) drop down field
		sendPushtoUser.dateFilterConditionStartDropdownField();//select inputs data form the date(start) drop down field
		sendPushtoUser.dateFilterConditionEndDropdownField();// select inputs data form the date(end) drop down field  
		sendPushtoUser.selectDatafromCopyTemplateDropDownElement();//  select inputs data form the copy template drop down field 
		sendPushtoUser.typetotitleInputFieldParam("title for the push");// taking input from the title input field  
		sendPushtoUser.typetomessageInputFieldFieldParam("message for the push");// taking inputs from the message input text field 
		sendPushtoUser.imageURLInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\\\");// taking inputs from the image url input text field 
		sendPushtoUser.urlforAndroidInputFieldFieldParam("");// taking inputs from the url for android input text field  
		sendPushtoUser.urlforiOSInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");//taking inputs from the url for ios input text field  
		sendPushtoUser.pageControInputFieldFieldParam(page_control);// taking inputs from the page control input text field 
		//sendPushtoUser.saveasTemplateInputFieldField();// for save as template check box
		//sendPushtoUser.clickOnclearButtonField();// clear the info button
		sendPushtoUser.clickOndisplayTotalUserButtonField();// display total user button 
		//sendPushtoUser.clickOnSendNowButtonField();// for send now button
		//sendPushtoUser.clickOnPopUpYesButtonField(); // for clicking on pop-up yes button
		//sendPushtoUser.clickOnPopUpNoButtonField(); // for clicking on pop-up no button 
	}	
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Page_Control_input_field() throws IOException, InterruptedException {SendPushtoUserCommon("");	}
	//@Test(priority=2)
	public void enter_a_valid_text_into_Page_Control_input_field() throws IOException, InterruptedException {SendPushtoUserCommon("home page");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Page_Control_input_field() throws IOException, InterruptedException{SendPushtoUserCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Page_Control_input_field() throws IOException, InterruptedException{ 
			
	}

	//@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		sendPushtoUser = loginPage.sendPushtoUserLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendPushtoUser.openSendPushtoUserPage();// open the send push to user Form Page.
		sendPushtoUser.selectDatafromAppNameDropDownElement();//select inputs data form the app name drop down field
		sendPushtoUser.datafromWithChildDropDownElement();// for with child check box
		sendPushtoUser.typetoPINWithCommaSeparatedInputParam("ani1yr, anika@kolpolok.com,");// taking input from the pin with comma separated
		sendPushtoUser.datafromPINStatusCheckboxElement();// for active status check box
		sendPushtoUser.datafromPINStatusInactiveCheckboxElement();// for inactive status check box
		sendPushtoUser.datafromPINStatusExpiredCheckboxElement();//for expired status check box
		sendPushtoUser.selectDatafromPaymentMethodDropDownElement();//select inputs data form the payment method drop down field
		sendPushtoUser.selectDatafromCountryFilterDropDownElement();//  select inputs data form the country filter drop down field
		sendPushtoUser.selectDatafromCountryDropDownElement();// select inputs data form the app country drop down field
		sendPushtoUser.selectDatafromTargetDeviceDropDownElement();//select inputs data form the target devices drop down field
		sendPushtoUser.dateFilterColumnDropdownField();//  select inputs data form the date filter column (first login to) drop down field
		sendPushtoUser.dateFilterConditionDropdownField();//select inputs data form the date filter column (is equal to) drop down field
		sendPushtoUser.dateFilterConditionStartDropdownField();//select inputs data form the date(start) drop down field
		sendPushtoUser.dateFilterConditionEndDropdownField();// select inputs data form the date(end) drop down field  
		sendPushtoUser.selectDatafromCopyTemplateDropDownElement();//  select inputs data form the copy template drop down field 
		sendPushtoUser.typetotitleInputFieldParam("title for the push");// taking input from the title input field 
		sendPushtoUser.typetomessageInputFieldFieldParam("message of the push");// taking inputs from the message input text field 
		sendPushtoUser.imageURLInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.urlforAndroidInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");// taking inputs from the url for android input text field
		sendPushtoUser.urlforiOSInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.pageControInputFieldFieldParam("home page");// taking inputs from the page control input text field 
		sendPushtoUser.typeAndClearpageControInputFieldParam(""); //clear the text
		//sendPushtoUser.saveasTemplateInputFieldField();// for save as template check box
		//sendPushtoUser.clickOnclearButtonField();// clear the info button
		sendPushtoUser.clickOndisplayTotalUserButtonField();// display total user button 
		//sendPushtoUser.clickOnSendNowButtonField();// for send now button
		//sendPushtoUser.clickOnPopUpYesButtonField(); // for clicking on pop-up yes button 
		//sendPushtoUser.clickOnPopUpNoButtonField(); // for clicking on pop-up no button 
	}
	//@Test(priority=21)
	public void enter_then_undo_the_input_action_into_Page_Control_input_field() throws IOException, InterruptedException{
		sendPushtoUser = loginPage.sendPushtoUserLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendPushtoUser.openSendPushtoUserPage();// open the send push to user Form Page.
		sendPushtoUser.selectDatafromAppNameDropDownElement();//select inputs data form the app name drop down field
		sendPushtoUser.datafromWithChildDropDownElement();// for with child check box
		sendPushtoUser.typetoPINWithCommaSeparatedInputParam("ani1yr, anika@kolpolok.com,");// taking input from the pin with comma separated
		sendPushtoUser.datafromPINStatusCheckboxElement();// for active status check box
		sendPushtoUser.datafromPINStatusInactiveCheckboxElement();// for inactive status check box
		sendPushtoUser.datafromPINStatusExpiredCheckboxElement();//for expired status check box
		sendPushtoUser.selectDatafromPaymentMethodDropDownElement();//select inputs data form the payment method drop down field
		sendPushtoUser.selectDatafromCountryFilterDropDownElement();//  select inputs data form the country filter drop down field
		sendPushtoUser.selectDatafromCountryDropDownElement();// select inputs data form the app country drop down field
		sendPushtoUser.selectDatafromTargetDeviceDropDownElement();//select inputs data form the target devices drop down field
		sendPushtoUser.dateFilterColumnDropdownField();//  select inputs data form the date filter column (first login to) drop down field
		sendPushtoUser.dateFilterConditionDropdownField();//select inputs data form the date filter column (is equal to) drop down field
		sendPushtoUser.dateFilterConditionStartDropdownField();//select inputs data form the date(start) drop down field
		sendPushtoUser.dateFilterConditionEndDropdownField();// select inputs data form the date(end) drop down field  
		sendPushtoUser.selectDatafromCopyTemplateDropDownElement();//  select inputs data form the copy template drop down field 
		sendPushtoUser.typetotitleInputFieldParam("title for the push");// taking input from the title input field 
		sendPushtoUser.typetomessageInputFieldFieldParam("message of the push");// taking inputs from the message input text field 
		sendPushtoUser.imageURLInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.urlforAndroidInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");// taking inputs from the url for android input text field
		sendPushtoUser.urlforiOSInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.pageControInputFieldFieldParam("home page");// taking inputs from the page control input text field 
		sendPushtoUser.typeAndClearpageControInputFieldParam(""); //clear the text
		//sendPushtoUser.saveasTemplateInputFieldField();// for save as template check box
		//sendPushtoUser.clickOnclearButtonField();// clear the info button
		sendPushtoUser.clickOndisplayTotalUserButtonField();// display total user button 
		//sendPushtoUser.clickOnSendNowButtonField();// for send now button
		//sendPushtoUser.clickOnPopUpYesButtonField(); // for clicking on pop-up yes button 
		//sendPushtoUser.clickOnPopUpNoButtonField(); // for clicking on pop-up no button
	}
	@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_Page_Control_input_field() throws IOException, InterruptedException{
		sendPushtoUser = loginPage.sendPushtoUserLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendPushtoUser.openSendPushtoUserPage();// open the send push to user Form Page.
		sendPushtoUser.selectDatafromAppNameDropDownElement();//select inputs data form the app name drop down field
		sendPushtoUser.datafromWithChildDropDownElement();// for with child check box
		sendPushtoUser.typetoPINWithCommaSeparatedInputParam("ani1yr, anika@kolpolok.com,");// taking input from the pin with comma separated
		sendPushtoUser.datafromPINStatusCheckboxElement();// for active status check box
		sendPushtoUser.datafromPINStatusInactiveCheckboxElement();// for inactive status check box
		sendPushtoUser.datafromPINStatusExpiredCheckboxElement();//for expired status check box
		sendPushtoUser.selectDatafromPaymentMethodDropDownElement();//select inputs data form the payment method drop down field
		sendPushtoUser.selectDatafromCountryFilterDropDownElement();//  select inputs data form the country filter drop down field
		sendPushtoUser.selectDatafromCountryDropDownElement();// select inputs data form the app country drop down field
		sendPushtoUser.selectDatafromTargetDeviceDropDownElement();//select inputs data form the target devices drop down field
		sendPushtoUser.dateFilterColumnDropdownField();//  select inputs data form the date filter column (first login to) drop down field
		sendPushtoUser.dateFilterConditionDropdownField();//select inputs data form the date filter column (is equal to) drop down field
		sendPushtoUser.dateFilterConditionStartDropdownField();//select inputs data form the date(start) drop down field
		sendPushtoUser.dateFilterConditionEndDropdownField();// select inputs data form the date(end) drop down field  
		sendPushtoUser.selectDatafromCopyTemplateDropDownElement();//  select inputs data form the copy template drop down field 
		sendPushtoUser.typetotitleInputFieldParam("title for the push");// taking input from the title input field 
		sendPushtoUser.typetomessageInputFieldFieldParam("message of the push");// taking inputs from the message input text field 
		sendPushtoUser.imageURLInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.urlforAndroidInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");// taking inputs from the url for android input text field
		sendPushtoUser.urlforiOSInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.pageControInputFieldFieldParam("home page");// taking inputs from the page control input text field 
		sendPushtoUser.typeAndClearpageControInputFieldParam(""); //clear the text
		sendPushtoUser.pageControInputFieldFieldParam("home page");
		//sendPushtoUser.saveasTemplateInputFieldField();// for save as template check box
		//sendPushtoUser.clickOnclearButtonField();// clear the info button
		sendPushtoUser.clickOndisplayTotalUserButtonField();// display total user button 
		//sendPushtoUser.clickOnSendNowButtonField();// for send now button
		//sendPushtoUser.clickOnPopUpYesButtonField(); // for clicking on pop-up yes button 
		//sendPushtoUser.clickOnPopUpNoButtonField(); // for clicking on pop-up no button
	}
	//@Test(priority=23)
	//@Ignore
	public void enter_text_and_navigate_through_into_Page_Control_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		sendPushtoUser = loginPage.sendPushtoUserLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendPushtoUser.openSendPushtoUserPage();// open the send push to user Form Page.
		sendPushtoUser.selectDatafromAppNameDropDownElement();//select inputs data form the app name drop down field
		sendPushtoUser.datafromWithChildDropDownElement();// for with child check box
		sendPushtoUser.typetoPINWithCommaSeparatedInputParam("ani1yr, anika@kolpolok.com,");// taking input from the pin with comma separated
		sendPushtoUser.datafromPINStatusCheckboxElement();// for active status check box
		sendPushtoUser.datafromPINStatusInactiveCheckboxElement();// for inactive status check box
		sendPushtoUser.datafromPINStatusExpiredCheckboxElement();//for expired status check box
		sendPushtoUser.selectDatafromPaymentMethodDropDownElement();//select inputs data form the payment method drop down field
		sendPushtoUser.selectDatafromCountryFilterDropDownElement();//  select inputs data form the country filter drop down field
		sendPushtoUser.selectDatafromCountryDropDownElement();// select inputs data form the app country drop down field
		sendPushtoUser.selectDatafromTargetDeviceDropDownElement();//select inputs data form the target devices drop down field
		sendPushtoUser.dateFilterColumnDropdownField();//  select inputs data form the date filter column (first login to) drop down field
		sendPushtoUser.dateFilterConditionDropdownField();//select inputs data form the date filter column (is equal to) drop down field
		sendPushtoUser.dateFilterConditionStartDropdownField();//select inputs data form the date(start) drop down field
		sendPushtoUser.dateFilterConditionEndDropdownField();// select inputs data form the date(end) drop down field  
		sendPushtoUser.selectDatafromCopyTemplateDropDownElement();//  select inputs data form the copy template drop down field 
		sendPushtoUser.typetotitleInputFieldParam("title for the push");// taking input from the title input field 
		sendPushtoUser.typetomessageInputFieldFieldParam("message of the push");// taking inputs from the message input text field 
		sendPushtoUser.imageURLInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.urlforAndroidInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");// taking inputs from the url for android input text field
		sendPushtoUser.urlforiOSInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.pageControInputFieldFieldParam("home page");// taking inputs from the page control input text field 
		sendPushtoUser.typetotheurlforpageControInputFieldtabKey(); //navigate to tab key
		//sendPushtoUser.saveasTemplateInputFieldField();// for save as template check box
		//sendPushtoUser.clickOnclearButtonField();// clear the info button
		sendPushtoUser.clickOndisplayTotalUserButtonField();// display total user button 
		//sendPushtoUser.clickOnSendNowButtonField();// for send now button
		//sendPushtoUser.clickOnPopUpYesButtonField(); // for clicking on pop-up yes button 
		//sendPushtoUser.clickOnPopUpNoButtonField(); // for clicking on pop-up no button
	}
	//@Test(priority=24)
	public void paste_the_text_into_Page_Control_input_field_using_the_paste_action() throws IOException, InterruptedException{
		sendPushtoUser = loginPage.sendPushtoUserLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		sendPushtoUser.openSendPushtoUserPage();// open the send push to user Form Page.
		sendPushtoUser.selectDatafromAppNameDropDownElement();//select inputs data form the app name drop down field
		sendPushtoUser.datafromWithChildDropDownElement();// for with child check box
		sendPushtoUser.typetoPINWithCommaSeparatedInputParam("ani1yr, anika@kolpolok.com,");// taking input from the pin with comma separated
		sendPushtoUser.datafromPINStatusCheckboxElement();// for active status check box
		sendPushtoUser.datafromPINStatusInactiveCheckboxElement();// for inactive status check box
		sendPushtoUser.datafromPINStatusExpiredCheckboxElement();//for expired status check box
		sendPushtoUser.selectDatafromPaymentMethodDropDownElement();//select inputs data form the payment method drop down field
		sendPushtoUser.selectDatafromCountryFilterDropDownElement();//  select inputs data form the country filter drop down field
		sendPushtoUser.selectDatafromCountryDropDownElement();// select inputs data form the app country drop down field
		sendPushtoUser.selectDatafromTargetDeviceDropDownElement();//select inputs data form the target devices drop down field
		sendPushtoUser.dateFilterColumnDropdownField();//  select inputs data form the date filter column (first login to) drop down field
		sendPushtoUser.dateFilterConditionDropdownField();//select inputs data form the date filter column (is equal to) drop down field
		sendPushtoUser.dateFilterConditionStartDropdownField();//select inputs data form the date(start) drop down field
		sendPushtoUser.dateFilterConditionEndDropdownField();// select inputs data form the date(end) drop down field  
		sendPushtoUser.selectDatafromCopyTemplateDropDownElement();//  select inputs data form the copy template drop down field 
		sendPushtoUser.typetotitleInputFieldParam("title for the push");// taking input from the title input field 
		sendPushtoUser.typetomessageInputFieldFieldParam("message of the push");// taking inputs from the message input text field 
		sendPushtoUser.imageURLInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.urlforAndroidInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");// taking inputs from the url for android input text field
		sendPushtoUser.urlforiOSInputFieldFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg\\");
		sendPushtoUser.pageControInputFieldFieldParam("home page");// taking inputs from the page control input text field 
		//sendPushtoUser.saveasTemplateInputFieldField();// for save as template check box
		//sendPushtoUser.clickOnclearButtonField();// clear the info button
		sendPushtoUser.clickOndisplayTotalUserButtonField();// display total user button 
		//sendPushtoUser.clickOnSendNowButtonField();// for send now button
		//sendPushtoUser.clickOnPopUpYesButtonField(); // for clicking on pop-up yes button 
		//sendPushtoUser.clickOnPopUpNoButtonField(); // for clicking on pop-up no button
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}
