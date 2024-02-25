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

public class ImageURL extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddPushTemplate addPushTemplate; 
	
	//Initializing PageFactory
	public ImageURL() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	// ***** Test _Blank!!! 
	//@Test(priority=1)
	//@Ignore
	public void input_a_valid_image_URL_in_the_image_URL_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the image URL field.*/
		//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
			
	}
	
	//@Test(priority=2)
	//@Ignore
	public void input_a_invalid_image_URL_in_the_image_URL_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the image URL field.*/
		addPushTemplate.typeToImageURLFieldParam("htps://www.file"); /*taking input into the message field.*/
		//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
				
	}
	
	
	//@Test(priority=3)
	//@Ignore
	public void input_a_empty_image_URL_in_the_image_URL_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the image URL field.*/
		addPushTemplate.typeToImageURLFieldParam(""); /*taking input into the message field.*/
		//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
		
		
	}
	
	
	//@Test(priority=4)
	//@Ignore
	public void input_a_very_long_image_URL_in_the_image_URL_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeToImageURLFieldParam("image/jpeg;base64,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"); /*taking input into the image URL field.*/
		//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
						
		
	}
	
	
	//@Test(priority=5)
	//@Ignore
	public void input_URL_with_spaces_into_the_image_URL_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the image URL field.*/
		addPushTemplate.typeToImageURLFieldParam("https://www.    filepicker.io   /api/file/FBrys    v8XTuqjv42J23Qi?f   ilename=name.jpg"); /*taking input into the message field.*/
		//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
		
		
	}
	
	
	//@Test(priority=6)
	//@Ignore
	public void input_image_URL_with_HTTPS_into_the_image_URL_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the image URL field.*/
		addPushTemplate.typeToImageURLFieldParam("https://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the message field.*/
		//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
			
			
	}
	
	@Test(priority=7)
	//@Ignore
	public void input_image_URL_with_HTTP_into_the_image_URL_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only"); /*taking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the image URL field.*/
		addPushTemplate.typeToImageURLFieldParam("http://www.filepicker.io/api/file/FBrysv8XTuqjv42J23Qi?filename=name.jpg"); /*taking input into the message field.*/
		//addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
				
				
	}
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
