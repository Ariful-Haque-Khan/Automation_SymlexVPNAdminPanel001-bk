/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.edit_banner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AdBannerListElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class RemarksEditFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AdBannerListElement adBannerListElement;
	
	//Initializing PageFactory
	public RemarksEditFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	public void EditBannerCommon(String remarks) throws IOException, InterruptedException {
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editBanner/52"); //open the Edit Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for andorid ");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("");// taking input from the Reseller panel Onclick URL
		adBannerListElement.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		adBannerListElement.clickOncommonPanelElement();//  check box for the common panel
		adBannerListElement.typeToBannerRemarksFieldParam(remarks);// taking input from the remarks
		adBannerListElement.clickOnLoginTypeAppElement();//check box for the login type (all)
		adBannerListElement.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		adBannerListElement.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		adBannerListElement.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		adBannerListElement.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		adBannerListElement.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		adBannerListElement.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		adBannerListElement.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//adBannerListElement.clickOnUpdateNowButton();
	}
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_remarks_Edit_input_field() throws IOException, InterruptedException {EditBannerCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_remarks_Edit_input_field() throws IOException, InterruptedException {EditBannerCommon("url for reseller panel");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_remarks_Edit_input_field() throws IOException, InterruptedException{EditBannerCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_remarks_Edit_input_field() throws IOException, InterruptedException{ 
			
	}

	//@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editBanner/52"); //open the Edit Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for andorid ");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("");// taking input from the Reseller panel Onclick URL
		adBannerListElement.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		adBannerListElement.clickOncommonPanelElement();//  check box for the common panel
		adBannerListElement.typeToBannerRemarksFieldParam("only for testing purpose");// taking input from the remarks
		adBannerListElement.typeAndClearBannerRemarksFieldParam("");//clear the text
		adBannerListElement.clickOnLoginTypeAppElement();//check box for the login type (all)
		adBannerListElement.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		adBannerListElement.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		adBannerListElement.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		adBannerListElement.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		adBannerListElement.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		adBannerListElement.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		adBannerListElement.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//adBannerListElement.clickOnUpdateNowButton();
	}
	
	//@Test(priority=21)
	public void enter_then_undo_the_input_action_into_remarks_input_field() throws IOException, InterruptedException{
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editBanner/52"); //open the Edit Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for andorid ");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("");// taking input from the Reseller panel Onclick URL
		adBannerListElement.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		adBannerListElement.clickOncommonPanelElement();//  check box for the common panel
		adBannerListElement.typeToBannerRemarksFieldParam("only for testing purpose");// taking input from the remarks
		adBannerListElement.typeAndClearBannerRemarksFieldParam("");//clear the text
		adBannerListElement.clickOnLoginTypeAppElement();//check box for the login type (all)
		adBannerListElement.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		adBannerListElement.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		adBannerListElement.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		adBannerListElement.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		adBannerListElement.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		adBannerListElement.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		adBannerListElement.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//adBannerListElement.clickOnUpdateNowButton();
	}
	
	//@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_remarks_input_field() throws IOException, InterruptedException{
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editBanner/52"); //open the Edit Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for andorid ");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("");// taking input from the Reseller panel Onclick URL
		adBannerListElement.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		adBannerListElement.clickOncommonPanelElement();//  check box for the common panel
		adBannerListElement.typeToBannerRemarksFieldParam("only for testing purpose");// undo the text
		adBannerListElement.typeAndClearBannerRemarksFieldParam("");//clear the text
		adBannerListElement.typeToBannerRemarksFieldParam("only for testing purpose");//redo the text
		adBannerListElement.clickOnLoginTypeAppElement();//check box for the login type (all)
		adBannerListElement.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		adBannerListElement.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		adBannerListElement.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		adBannerListElement.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		adBannerListElement.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		adBannerListElement.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		adBannerListElement.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//adBannerListElement.clickOnUpdateNowButton();
	}
	
	//@Test(priority=23)
	//@Ignore
	public void enter_text_and_navigate_through_into_remarks_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editBanner/52"); //open the Edit Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("");// taking input from the Reseller panel Onclick URL
		adBannerListElement.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		adBannerListElement.clickOncommonPanelElement();//  check box for the common panel
		adBannerListElement.typeToBannerRemarksFieldParam("only for symlex user");// taking input from the remarks
		adBannerListElement.typetotheBannerRemarksFieldtabKey();
		adBannerListElement.clickOnLoginTypeAppElement();//check box for the login type (all)
		adBannerListElement.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		adBannerListElement.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		adBannerListElement.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		adBannerListElement.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		adBannerListElement.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		adBannerListElement.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		adBannerListElement.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//adBannerListElement.clickOnUpdateNowButton();
	}
	//@Test(priority=24)
	public void paste_the_text_into_remarks_input_field_using_the_paste_action() throws IOException, InterruptedException{
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/push/editBanner/52"); //open the Edit Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("");// taking input from the Reseller panel Onclick URL
		adBannerListElement.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		adBannerListElement.clickOncommonPanelElement();//  check box for the common panel
		adBannerListElement.typeToBannerRemarksFieldParam("only for symlex user");// taking input from the remarks
		adBannerListElement.clickOnLoginTypeAppElement();//check box for the login type (all)
		adBannerListElement.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		adBannerListElement.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		adBannerListElement.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		adBannerListElement.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		adBannerListElement.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		adBannerListElement.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		adBannerListElement.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//adBannerListElement.clickOnUpdateNowButton();
	}
	
  /*
  @AfterMethod
  public void tearDown() {
	super.tearDown();
	}*/
				
}
