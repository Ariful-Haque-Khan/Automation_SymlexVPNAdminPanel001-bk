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

import com.admin.qa.function.AddPushTemplate;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class URLForiOS extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddPushTemplate addPushTemplate; 
	
	//Initializing PageFactory
	public URLForiOS() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	// ***** Test _Blank!!! 
		@Test(priority=1)
		//@Ignore
		public void  enter_a_valid_URL_in_the_URL_for_the_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://symlexvpn.net/price/");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
					
		}
		
		
		
		//@Test(priority=2)
		//@Ignore
		public void enter_an_invalid_URL_in_the_URL_for_the_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("htt  ://symlexvpn.net/price/");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
						
		}
		
		
		//@Test(priority=3)
		//@Ignore
		public void attempt_to_proceed_without_entering_any_URL_in_the_URL_for_the_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image url field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
							
		}
		
		
		
		
		//@Test(priority=4)
		//@Ignore
		public void input_a_very_long_image_URL_in_the_URL_for_the_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/			
			addPushTemplate.typeToURLForiOSFieldParam("https://www.example.com/abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789\r\n");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
								
		}
		
		
		//@Test(priority=5)
		//@Ignore
		public void input_URL_with_spaces_in_the_URL_for_the_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("htt  ://symlexvpn.net/price/");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
										
		}
		
		//@Test(priority=6)
		//@Ignore
		public void  input_URL_with_HTTPS_in_the_URL_for_the_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://symlexvpn.net/price/");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
					
		}
		
		
		//@Test(priority=7)
		//@Ignore
		public void  input_URL_with_HTTP_in_the_URL_for_the_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
	    	addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("http://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("http://symlexvpn.net/price/");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
						
		}
		
		
		//@Test(priority=8)
		//@Ignore
		public void  input_URL_with_query_parameters_in_the_URL_for_the_android_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
						
		}
		
		
		//@Test(priority=9)
		//@Ignore
		public void  input_URL_with_fragment_identifier_in_the_URL_for_the_android_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw#comments"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://symlexvpn.net/price#comments");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
							
		}
		
		
		//@Test(priority=10)
		//@Ignore
		public void  input_URL_with_special_characters_in_the_URL_for_the_android_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
								
		}
		
		
		//@Test(priority=11)
		//@Ignore
		public void  input_URL_with_international_characters_in_the_URL_for_the_android_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvwРる"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvwРる");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
									
		}
		
		
		//@Test(priority=12)
		//@Ignore
		public void  input_URL_that_redirects_to_another_URL_in_the_URL_for_android_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvwРる");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
										
		}
		
		//@Test(priority=13)
		//@Ignore
		public void  entering_the_same_image_URL_twice_in_the_URL_for_android_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvwРるhttps://www.youtube.com/watch?v=dzv8EIegkvwРる"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://www.youtube.com/watch?v=dzv8EIegkvwРるhttps://www.youtube.com/watch?v=dzv8EIegkvwРる");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
											
		}
		
		
		//@Test(priority=14)
		//@Ignore
		public void   Enter_URLs_with_different_protocols_in_the_URL_for_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("ftp://www.youtube.com/watch?v=dzv8EIegkvw"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForiOSFieldParam("ftp://www.youtube.com/watch?v=dzv8EIegkvw");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
												
		}
		
		
		//@Test(priority=15)
		//@Ignore
		public void   enter_a_URL_that_points_to_a_downloadable_file_in_the_URL_for_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://example.com/downloads/video.mp4\r\n"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://example.com/downloads/video.mp4\\r\\n");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
													
		}
		
		
		//@Test(priority=16)
		//@Ignore
		public void   enter_URL_with_a_non_existing_domain_in_the_URL_for_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://nonexistingdomain123456789.com/page"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://nonexistingdomain123456789.com/page");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
														
		}
		
		
		//@Test(priority=17)
		//@Ignore
		public void  enter_URLs_with_different_cases_in_the_URL_for_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("https://www.youtube.com/watch?v=dzv8EIeGKVW"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForiOSFieldParam("https://www.youtube.com/watch?v=dzv8EIeGKVW");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
															
		}
	   
		//@Test(priority=18)
		//@Ignore
		public void  enter_a_URL_that_includes_deep_linking_parameters_in_the_URL_for_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("myapp://video?id=dzv8EIegkvw&autoplay=true"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForiOSFieldParam("myapp://video?id=dzv8EIegkvw&autoplay=true");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
																
		}
		
		//@Test(priority=19)
		//@Ignore
		public void  enter_URL_that_was_valid_but_has_expired_in_the_URL_for_iOS_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("myapp://expiredContent?contentId=12345"); /*taking input into the image URL field.*/
			addPushTemplate.typeToURLForiOSFieldParam("myapp://video?id=dzv8EIegkvw&autoplay=true");/*taking input into the URL for iOS field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
																	
		}
		
		//@Test(priority=20)
		//@Ignore
		public void  copy_a_URL_from_another_source_and_paste_it_into_the_application() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
			addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
			addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
			addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the URL for android field.*/
			addPushTemplate.typeToURLForAndroidFieldParam("myapp://expiredContent?contentId=12345"); /*taking input into the image URL field.*/
			//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
																		
		}


		
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
