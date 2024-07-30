/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_banner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AdBannerListElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class ResellerOnclickURLFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AdBannerListElement adBannerListElement;
	
	//Initializing PageFactory
	public ResellerOnclickURLFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void AddNewBannerCommon(String reseller_onclick_url) throws IOException, InterruptedException {
	adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
	adBannerListElement.openAddNewBannerFormPage();// open the Add New Banner Form Page.
	adBannerListElement.typeToBannerNameInputFieldParam("1 year offer");//taking input from the Banner Name
	adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for android user");// taking input from the App Home Banner Android
	adBannerListElement.typeToAndroidOnclickURLElementFieldParam("URL for android");// taking input from the Android Onclick URL
	adBannerListElement.typeToHomeBanneriOSElementFieldParam("");// taking input from the App Home Banner iOS
	adBannerListElement.typeToiOSOnclickURLElementFieldParam(reseller_onclick_url);// taking input from the iOS Onclick URL
	adBannerListElement.typeToResellerPanelBannerFieldParam("banner for reseller");//taking input from the Reseller Panel Banner
	adBannerListElement.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
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
	//adBannerListElement.();/
	//adBannerListElement.();// 
	}
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException {AddNewBannerCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException {AddNewBannerCommon("url for reseller panel");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{AddNewBannerCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_reseller_onclick_URL_input_field() throws IOException, InterruptedException{ 
			
	}

	//@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		adBannerListElement.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		adBannerListElement.typeAndClearResellerOnclickFieldParam("");//clear the text
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
		//adBannerListElement.();/
		//adBannerListElement.();// 
	}
	@Test(priority=21)
	public void enter_then_undo_the_input_action_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		adBannerListElement.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		adBannerListElement.typeAndClearResellerOnclickFieldParam("");//undo the text
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
		//adBannerListElement.();/
		//adBannerListElement.();// 
	}
	//@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		adBannerListElement.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		adBannerListElement.typeAndClearResellerOnclickFieldParam("");//undo the text
		adBannerListElement.typeToResellerOnclickFieldParam("url for reseller");//redo the text
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
		//adBannerListElement.();/
		//adBannerListElement.();// 
	}
	//@Test(priority=23)
	//@Ignore
	public void enter_text_and_navigate_through_into_Reseller_Panel_Banner_iOS_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		adBannerListElement.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		adBannerListElement.typetotheResellerOnclickFieldtabKey();
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
		//adBannerListElement.();/
		//adBannerListElement.();// 
	}
	//@Test(priority=24)
	public void paste_the_text_into_Reseller_Panel_Banner_iOS_input_field_using_the_paste_action() throws IOException, InterruptedException{
		adBannerListElement = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		adBannerListElement.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		adBannerListElement.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		adBannerListElement.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		adBannerListElement.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		adBannerListElement.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		adBannerListElement.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		adBannerListElement.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		adBannerListElement.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
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
		//adBannerListElement.();/
		//adBannerListElement.();// 
	}
	
  /*
  @AfterMethod
  public void tearDown() {
	super.tearDown();
	}*/
				
}
