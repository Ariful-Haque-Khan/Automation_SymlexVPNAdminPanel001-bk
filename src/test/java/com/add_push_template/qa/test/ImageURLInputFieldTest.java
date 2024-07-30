/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_push_template.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.PushTemplateListElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class ImageURLInputFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	PushTemplateListElement pushTemplateListElement; 
	
	//Initializing PageFactory
	public ImageURLInputFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void AddPushTemplateFormCommon(String $image) throws IOException, InterruptedException {
		pushTemplateListElement = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		pushTemplateListElement.openAddPushTemplatePage();// open the Add Push template Page.
		pushTemplateListElement.typeTotemplatenameInputFieldParam("oh!You are Missing Out Premium VPN offer");//taking inputs form the Template Name field
		pushTemplateListElement.selectDatafromAppNameDropDownElement();// select inputs data form the APP Name drop down field
		pushTemplateListElement.typeToTemplateTitleInputFieldParam("Offer Push");// taking inputs data form the Title input field
		pushTemplateListElement.typeToTemplateMessageInputFieldParam("this offer is for testing");//taking inputs data form the Title Message field
		pushTemplateListElement.typeToImageURLFieldParam($image);// taking inputs data form the Image URL field
		pushTemplateListElement.typeToURLForAndroidFieldParam("https://play.google.com/store/apps/details?id=app.kismyo.vpn&hl=en&gl=US");// taking inputs data form the URL for Android field
		pushTemplateListElement.typeToURLForiOSFieldParam("https://apps.apple.com/il/app/symlex-vpn/id1476025535");//taking inputs from the URL for iOS input text field
		pushTemplateListElement.typeToPageControlFieldParam("Connection Page");//taking inputs from the Page Control input text field
		pushTemplateListElement.typeTotemplateActiveDeactiveStatusInputField();// enable/disable to active button
		//pushTemplateListElement.typeTotemplateSaveButtonField();// for submit button	
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Image_URL_input_field() throws IOException, InterruptedException {AddPushTemplateFormCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_iinto_Image_URL_input_field() throws IOException, InterruptedException {AddPushTemplateFormCommon("https://i.postimg.cc/PJGykwbH/Symlex-VPN-Refer.png");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("              https://i.postimg.cc/PJGykwbH/Symlex-VPN-Refer.png"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("https://i.postimg.cc/PJGykwbH/Symlex-VPN-Refer.png                  ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Image_URL_input_field() throws IOException, InterruptedException{AddPushTemplateFormCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Image_URL_input_field() throws IOException, InterruptedException{
			
	}
	//@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		pushTemplateListElement = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		pushTemplateListElement.openAddPushTemplatePage();// open the Add Push template Page.
		pushTemplateListElement.typeTotemplatenameInputFieldParam("oh!You are Missing Out Premium VPN offer");//taking inputs form the Template Name field
		pushTemplateListElement.selectDatafromAppNameDropDownElement();// select inputs data form the APP Name drop down field
		pushTemplateListElement.typeToTemplateTitleInputFieldParam("Offer Push");// taking inputs data form the Title input field
		pushTemplateListElement.typeToTemplateMessageInputFieldParam("this push is for testing ");//taking inputs data form the Title Message field
		pushTemplateListElement.typeToImageURLFieldParam("https://i.postimg.cc/PJGykwbH/Symlex-VPN-Refer.png");// taking inputs data form the Image URL field
		pushTemplateListElement.typeAndClearImageURLInputField("");//clear the text
		pushTemplateListElement.typeToURLForAndroidFieldParam("https://play.google.com/store/apps/details?id=app.kismyo.vpn&hl=en&gl=US");// taking inputs data form the URL for Android field
		pushTemplateListElement.typeToURLForiOSFieldParam("https://apps.apple.com/il/app/symlex-vpn/id1476025535");//taking inputs from the URL for iOS input text field
		pushTemplateListElement.typeToPageControlFieldParam("Connection Page");//taking inputs from the Page Control input text field
		pushTemplateListElement.typeTotemplateActiveDeactiveStatusInputField();// enable/disable to active button
		//pushTemplateListElement.typeTotemplateSaveButtonField();// for submit button	
		
	} 
	
	//@Test(priority=21)
	public void enter_then_undo_the_input_action_into_Image_URL_input_field() throws IOException, InterruptedException{
		pushTemplateListElement = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		pushTemplateListElement.openAddPushTemplatePage();// open the Add Push template Page.
		pushTemplateListElement.typeTotemplatenameInputFieldParam("oh!You are Missing Out Premium VPN offer");//taking inputs form the Template Name field
		pushTemplateListElement.selectDatafromAppNameDropDownElement();// select inputs data form the APP Name drop down field
		pushTemplateListElement.typeToTemplateTitleInputFieldParam("Offer Push");// taking inputs data form the Title input field
		pushTemplateListElement.typeToTemplateMessageInputFieldParam("this push is for testing ");//taking inputs data form the Title Message field
		pushTemplateListElement.typeToImageURLFieldParam("https://i.postimg.cc/PJGykwbH/Symlex-VPN-Refer.png");// taking inputs data form the Image URL field
		pushTemplateListElement.typeAndClearImageURLInputField("");//undo the text
		pushTemplateListElement.typeToURLForAndroidFieldParam("https://play.google.com/store/apps/details?id=app.kismyo.vpn&hl=en&gl=US");// taking inputs data form the URL for Android field
		pushTemplateListElement.typeToURLForiOSFieldParam("https://apps.apple.com/il/app/symlex-vpn/id1476025535");//taking inputs from the URL for iOS input text field
		pushTemplateListElement.typeToPageControlFieldParam("Connection Page");//taking inputs from the Page Control input text field
		pushTemplateListElement.typeTotemplateActiveDeactiveStatusInputField();// enable/disable to active button
		//pushTemplateListElement.typeTotemplateSaveButtonField();// for submit button		
	
	}
	
	//@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_Image_URL_input_field() throws IOException, InterruptedException{
		pushTemplateListElement = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		pushTemplateListElement.openAddPushTemplatePage();// open the Add Push template Page.
		pushTemplateListElement.typeTotemplatenameInputFieldParam("oh!You are Missing Out Premium VPN offer");//taking inputs form the Template Name field
		pushTemplateListElement.selectDatafromAppNameDropDownElement();// select inputs data form the APP Name drop down field
		pushTemplateListElement.typeToTemplateTitleInputFieldParam("Offer Push");// taking inputs data form the Title input field
		pushTemplateListElement.typeToTemplateMessageInputFieldParam("this push is for testing ");//taking inputs data form the Title Message field
		pushTemplateListElement.typeToImageURLFieldParam("https://i.postimg.cc/PJGykwbH/Symlex-VPN-Refer.png");// taking inputs data form the Image URL field
		pushTemplateListElement.typeAndClearImageURLInputField("");//undo the text
		pushTemplateListElement.typeToImageURLFieldParam("https://i.postimg.cc/PJGykwbH/Symlex-VPN-Refer.png");//redo the text
		pushTemplateListElement.typeToURLForAndroidFieldParam("https://play.google.com/store/apps/details?id=app.kismyo.vpn&hl=en&gl=US");// taking inputs data form the URL for Android field
		pushTemplateListElement.typeToURLForiOSFieldParam("https://apps.apple.com/il/app/symlex-vpn/id1476025535");//taking inputs from the URL for iOS input text field
		pushTemplateListElement.typeToPageControlFieldParam("Connection Page");//taking inputs from the Page Control input text field
		pushTemplateListElement.typeTotemplateActiveDeactiveStatusInputField();// enable/disable to active button
		//pushTemplateListElement.typeTotemplateSaveButtonField();// for submit button	
	}
	
	//@Test(priority=23)
	//@Ignore
	public void enter_text_and_navigate_through_into_Image_URL_input_field_using_the_tab_key() throws IOException, InterruptedException{
		pushTemplateListElement = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		pushTemplateListElement.openAddPushTemplatePage();// open the Add Push template Page.
		pushTemplateListElement.typeTotemplatenameInputFieldParam("oh!You are Missing Out Premium VPN offer");//taking inputs form the Template Name field
		pushTemplateListElement.selectDatafromAppNameDropDownElement();// select inputs data form the APP Name drop down field
		pushTemplateListElement.typeToTemplateTitleInputFieldParam("Offer Push");// taking inputs data form the Title input field
		pushTemplateListElement.typeToTemplateMessageInputFieldParam("this push is for testing ");//taking inputs data form the Title Message field
		pushTemplateListElement.typeToImageURLFieldParam("https://i.postimg.cc/PJGykwbH/Symlex-VPN-Refer.png");// taking inputs data form the Image URL field
		pushTemplateListElement.typeAndTabKeyImageURLInputFieldParam("");//navigate tab key
		pushTemplateListElement.typeToURLForAndroidFieldParam("https://play.google.com/store/apps/details?id=app.kismyo.vpn&hl=en&gl=US");// taking inputs data form the URL for Android field
		pushTemplateListElement.typeToURLForiOSFieldParam("https://apps.apple.com/il/app/symlex-vpn/id1476025535");//taking inputs from the URL for iOS input text field
		pushTemplateListElement.typeToPageControlFieldParam("Connection Page");//taking inputs from the Page Control input text field
		pushTemplateListElement.typeTotemplateActiveDeactiveStatusInputField();// enable/disable to active button
		//pushTemplateListElement.typeTotemplateSaveButtonField();// for submit button	
	}
	
	//@Test(priority=24)
	public void paste_the_text_into_Image_URL_input_field_using_the_paste_action() throws IOException, InterruptedException{
		pushTemplateListElement = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		pushTemplateListElement.openAddPushTemplatePage();// open the Add Push template Page.
		pushTemplateListElement.typeTotemplatenameInputFieldParam("oh!You are Missing Out Premium VPN offer");//taking inputs form the Template Name field
		pushTemplateListElement.selectDatafromAppNameDropDownElement();// select inputs data form the APP Name drop down field
		pushTemplateListElement.typeToTemplateTitleInputFieldParam("Offer Push");// taking inputs data form the Title input field
		pushTemplateListElement.typeToTemplateMessageInputFieldParam("this push is for testing ");//taking inputs data form the Title Message field
		pushTemplateListElement.typeToImageURLFieldParam("https://i.postimg.cc/PJGykwbH/Symlex-VPN-Refer.png");// taking inputs data form the Image URL field
		pushTemplateListElement.typeToURLForAndroidFieldParam("https://play.google.com/store/apps/details?id=app.kismyo.vpn&hl=en&gl=US");// taking inputs data form the URL for Android field
		pushTemplateListElement.typeToURLForiOSFieldParam("https://apps.apple.com/il/app/symlex-vpn/id1476025535");//taking inputs from the URL for iOS input text field
		pushTemplateListElement.typeToPageControlFieldParam("Connection Page");//taking inputs from the Page Control input text field
		pushTemplateListElement.typeTotemplateActiveDeactiveStatusInputField();// enable/disable to active button
		//pushTemplateListElement.typeTotemplateSaveButtonField();// for submit button	 
		
	}
		
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
	
