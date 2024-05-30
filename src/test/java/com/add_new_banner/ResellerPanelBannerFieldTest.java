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

import com.admin.qa.function.AddNewBanner;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class ResellerPanelBannerFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewBanner addNewBanner;
	
	//Initializing PageFactory
	public ResellerPanelBannerFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	public void AddNewBannerCommon(String reseller_banner) throws IOException, InterruptedException {
		addNewBanner = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewBanner.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		addNewBanner.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		addNewBanner.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		addNewBanner.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		addNewBanner.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		addNewBanner.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		addNewBanner.typeToResellerPanelBannerFieldParam(reseller_banner);//taking input from the Reseller Panel Banner
		addNewBanner.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		addNewBanner.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		addNewBanner.clickOncommonPanelElement();//  check box for the common panel
		addNewBanner.typeToBannerRemarksFieldParam("only for symlex user");// taking input from the remarks
		addNewBanner.clickOnLoginTypeAppElement();//check box for the login type (all)
		addNewBanner.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		addNewBanner.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		addNewBanner.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		addNewBanner.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		addNewBanner.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		addNewBanner.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		addNewBanner.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//addNewBanner.();/
		//addNewBanner.();// 
	}
	
	//@Ignore
	//@Test(priority=1)
	public void enter_empty_text_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException {AddNewBannerCommon("");	}
	@Test(priority=2)
	public void enter_a_valid_text_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException {AddNewBannerCommon("banner for reseller panel");	}
	//@Test(priority=3)
	public void enter_the_above_maximum_allowed_length_of_characters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaniy1yr");}
	//@Test(priority=4)
	public void enter_the_below_minimum_allowed_length_of_characters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("a");}
	//@Test(priority=5)
	public void enter_only_alphabetic_characters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("abcdefgh");}
	//@Test(priority=6)
	public void enter_numeric_characters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("123456789123456789");}
	//@Test(priority=7)
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("abc1234567abc");}
	//@Test(priority=8)
	public void enter_special_characters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("!@#$%^&*!@#$%^&*@!@#$%^&"); }
	//@Test(priority=9)
	public void enter_text_with_leading_whitespaces_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("           ani1yr"); }
	//@Test(priority=10)
	public void enter_text_with_trailing_whitespaces_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("abc1yr                   ");}
	//@Test(priority=11)
	public void enter_text_in_uppercase_letters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("asdfghjkzxcvbnm");}
	//@Test(priority=12)
	public void enter_text_in_lowercases_letters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("anianiani");}
	//@Test(priority=13)
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letter_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("ABCdefasASD"); }
	//@Test(priority=14)
	public void enter_text_with_punctuation_marks_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon(",./;?.,;/.,./?><:;,./;.,"); }
	//@Test(priority=15)
	public void enter_text_with_line_breaks_or_newlines_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("\\\\\"ANI1yr\\\\\\\\n\\\\\\\" +\\\\r\\\\n\\\"\\r\\n\"\r\n"
				+ "				+ \"				+ \\\"                                  \\\\\\\"ani1yr\\\\\\\""); }
	//@Test(priority=16)
	public void enter_text_with_unicode_characters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("こんにちは"); }
	//@Test(priority=17)
	public void enter_text_containing_emojis_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("😊, 🐱, 🍕, 🎉"); }
	//@Test(priority=18)
	public void enter_text_with_accented_characters_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{AddNewBannerCommon("á, ç, ō,  á, ç, ō");}
	//@Test(priority=19)
	public void enter_default_placeholder_text_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{ 
			
	}
	
	//@Test(priority=20)
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException{
		addNewBanner = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewBanner.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		addNewBanner.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		addNewBanner.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		addNewBanner.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		addNewBanner.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		addNewBanner.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		addNewBanner.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		addNewBanner.typeAndClearResellerPanelBannerFieldParam("");//clear the text
		addNewBanner.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		addNewBanner.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		addNewBanner.clickOncommonPanelElement();//  check box for the common panel
		addNewBanner.typeToBannerRemarksFieldParam("only for symlex user");// taking input from the remarks
		addNewBanner.clickOnLoginTypeAppElement();//check box for the login type (all)
		addNewBanner.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		addNewBanner.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		addNewBanner.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		addNewBanner.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		addNewBanner.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		addNewBanner.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		addNewBanner.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//addNewBanner.();/
		//addNewBanner.();// 
	}
	//@Test(priority=21)
	public void enter_then_undo_the_input_action_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{
		addNewBanner = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewBanner.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		addNewBanner.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		addNewBanner.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		addNewBanner.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		addNewBanner.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		addNewBanner.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		addNewBanner.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		addNewBanner.typeAndClearResellerPanelBannerFieldParam("");//undo the text
		addNewBanner.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		addNewBanner.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		addNewBanner.clickOncommonPanelElement();//  check box for the common panel
		addNewBanner.typeToBannerRemarksFieldParam("only for symlex user");// taking input from the remarks
		addNewBanner.clickOnLoginTypeAppElement();//check box for the login type (all)
		addNewBanner.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		addNewBanner.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		addNewBanner.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		addNewBanner.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		addNewBanner.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		addNewBanner.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		addNewBanner.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//addNewBanner.();/
		//addNewBanner.()
	}
	//@Test(priority=22)
	public void enter_then_undo_then_redo_the_input_action_into_Reseller_Panel_Banner_iOS_input_field() throws IOException, InterruptedException{
		addNewBanner = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewBanner.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		addNewBanner.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		addNewBanner.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		addNewBanner.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		addNewBanner.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		addNewBanner.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		addNewBanner.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		addNewBanner.typeAndClearResellerPanelBannerFieldParam("");//undo the text
		addNewBanner.typeToResellerPanelBannerFieldParam("banner for reseller panel");//redo the text
		addNewBanner.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		addNewBanner.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		addNewBanner.clickOncommonPanelElement();//  check box for the common panel
		addNewBanner.typeToBannerRemarksFieldParam("only for symlex user");// taking input from the remarks
		addNewBanner.clickOnLoginTypeAppElement();//check box for the login type (all)
		addNewBanner.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		addNewBanner.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		addNewBanner.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		addNewBanner.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		addNewBanner.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		addNewBanner.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		addNewBanner.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//addNewBanner.();/
		//addNewBanner.()
	}
	//@Test(priority=23)
	//@Ignore
	public void enter_text_and_navigate_through_into_Reseller_Panel_Banner_iOS_input_field_using_the_tab_key() throws IOException, InterruptedException{ 
		addNewBanner = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewBanner.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		addNewBanner.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		addNewBanner.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		addNewBanner.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		addNewBanner.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		addNewBanner.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		addNewBanner.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		addNewBanner. typetotheResellerPanelBannerFieldtabKey();//clear the text
		addNewBanner.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		addNewBanner.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		addNewBanner.clickOncommonPanelElement();//  check box for the common panel
		addNewBanner.typeToBannerRemarksFieldParam("only for symlex user");// taking input from the remarks
		addNewBanner.clickOnLoginTypeAppElement();//check box for the login type (all)
		addNewBanner.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		addNewBanner.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		addNewBanner.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		addNewBanner.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		addNewBanner.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		addNewBanner.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		addNewBanner.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//addNewBanner.();/
		//addNewBanner.()
	}
	//@Test(priority=24)
	public void paste_the_text_into_Reseller_Panel_Banner_iOS_input_field_using_the_paste_action() throws IOException, InterruptedException{
		addNewBanner = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewBanner.openAddNewBannerFormPage();// open the Add New Banner Form Page.
		addNewBanner.typeToBannerNameInputFieldParam("1 year offer banner");//taking input from the Banner Name
		addNewBanner.typeToAppHomeBannerAndroidFieldParam("banner for andorid");// taking input from the App Home Banner Android
		addNewBanner.typeToAndroidOnclickURLElementFieldParam("url for android");// taking input from the Android Onclick URL
		addNewBanner.typeToHomeBanneriOSElementFieldParam("banner for ios");// taking input from the App Home Banner iOS
		addNewBanner.typeToiOSOnclickURLElementFieldParam("url for ios");// taking input from the iOS Onclick URL
		addNewBanner.typeToResellerPanelBannerFieldParam("banner for reseller panel");//taking input from the Reseller Panel Banner
		addNewBanner.typeToResellerOnclickFieldParam("url for reseller");// taking input from the Reseller panel Onclick URL
		addNewBanner.selectDatafromCountryDropDownElement();// select inputs data form the Reseller drop down field
		addNewBanner.clickOncommonPanelElement();//  check box for the common panel
		addNewBanner.typeToBannerRemarksFieldParam("only for symlex user");// taking input from the remarks
		addNewBanner.clickOnLoginTypeAppElement();//check box for the login type (all)
		addNewBanner.clickOnloginTypeAppSymlexElement();//  check box for the login type (Symlex)
		addNewBanner.clickOnloginTypeAppPlatinumElement();//check box for the login type (Platinum) 
		addNewBanner.clickOnUserTypeAppAllElement();//check box for the User Type (App)
		addNewBanner.clickOnUserTypeAppFreeElement();// check box for the User Type (free)
		addNewBanner.clickOnUserTypeAppExpiredElement();// check box for the User Type (expired)
		addNewBanner.clickOnUserTypeAppPaidElement();// check box for the User Type (paid)
		addNewBanner.clickOnUserTypeAppPremiumElement();// check box for the User Type (premium)
		//addNewBanner.();/
		//addNewBanner.()
	}
	
/*
@AfterMethod
public void tearDown() {
	super.tearDown();
	}*/

				
}
