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

public class TemplateName extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddPushTemplate addPushTemplate; 
	
	//Initializing PageFactory
	public TemplateName() {
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
	public void check_with_empty_text_in_the_template_name_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam(""); /*taking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
		
	}
	
	
	//@Test(priority=2)
	//@Ignore
	public void enter_a_valid_and_unique_template_name() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam(" Limited Time Only ");/*taking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			
	}
	
	
	//@Test(priority=3)
	//@Ignore
	public void enter_the_maximum_number_of_allowed_characters_into_the_template_name_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only. Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only,Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only,Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only .Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only,Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only .Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only,Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only.Limited Time Only  ");/*tLimited Time ..aking input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
				
	}
	
	
	//@Test(priority=4)
	//@Ignore
	public void enter_the_minimum_number_of_allowed_characters_into_the_template_name_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limi");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
				
	}
	
	
	//@Test(priority=5)
	//@Ignore
	public void enter_only_alphabetic_characters_into_the_template_name_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("aaaaabbbbbbbbcccccccdddddeeeeeeffffff");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		//addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
					
	}
	
	
	//@Test(priority=6)
	//@Ignore
	public void enter_only_numeric_characters_into_the_template_name_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("123456789987654321123456666789");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
						
	}
	
	
	//@Test(priority=7)
	//@Ignore
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_template_name_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("1234 get on the dance floor");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
							
	}
	
	
	//@Test(priority=8)
	//@Ignore
	public void enter_special_characters_into_the_template_name_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("!@#$%^&*!@#$%^&*!@#$%^&!@#$%^&");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
								
	}
	
	
	//@Test(priority=9)
	//@Ignore
	public void enter_text_with_leading_whitespaces() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("                 Limited Time Only.Limited Time Only.");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
									
	}
	
	
	//@Test(priority=10)
	//@Ignore
	public void enter_text_with_trailing_whitespaces() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited Time Only.Limited Time Only.                                                 ");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
										
		}
	
	
	//@Test(priority=11)
	//@Ignore
	public void enter_text_with_spaces_within_the_content() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited    Time     Only   .Limited    Time     Only.");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
												
	}
	
	
	//@Test(priority=12)
	//@Ignore
	public void enter_text_in_uppercase_letters() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("LIMITED TIME ONLY");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
													
		}
	
	
	//@Test(priority=13)
	//@Ignore
	public void enter_text_in_lowercase_letters() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("limited time only");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
														
	}
	
	
	//@Test(priority=14)
	//@Ignore
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letters() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("LIMITED time OnLy");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
															
	}
	
	
	//@Test(priority=15)
	//@Ignore
	public void enter_text_with_punctuation_marks() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam(",.;':,./?;',.?;'/.,;");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
															
	}
	
	
	//@Test(priority=16)
	//@Ignore
	public void enter_text_with_line_breaks_or_newlines() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("\"Twinkle, twinkle, little star,\\r\\n\"\r\n"
				+ "				+ \"How I wonder what you are!\\r\\n\"\r\n"
				+ "				+ \"Up above the world so high,\\r\\n\"\r\n"
				+ "				+ \"Like a diamond in the sky.\\r\\n\"\r\n"
				+ "				+ \"\"");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
																	
	}
	
	//@Test(priority=17)
	//@Ignore
	public void attempt_to_inject_HTML_or_script_tags_into_the_input_text_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
																
		}
	
	

	//@Test(priority=18)
	//@Ignore
	public void enter_text_containing_emojis() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("😊 🌟 🌺 🤔 🍕 🎶 🌈 🚀");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
																		
			
	}
	
	
	//@Test(priority=19)
	//@Ignore
	public void enter_text_with_accented_characters() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("é, üé, üé, üvé, üé, üé, üé, üé, üé, üé, üé, üé, üvé, ü");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
																			
				
	}
	
	
	//@Test(priority=20)
	//@Ignore
	public void enter_the_default_placeholder_text_into_the_input_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("");/*input into the template name input field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
																				
					
	}
		
		
	//@Test(priority=21)
	//@Ignore
		  
	public void enter_text_then_clear_the_input_text_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited the offer");/*input into the template name input field.*/
	    addPushTemplate.typeAndClearTemplateNameInputField(""); // Clear the template name field			   
	    Thread.sleep(1000); // Optionally, you may want to add a delay for visibility or interaction purposes
	    addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		//addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			
	  }
	
	//@Test(priority=22)
	//@Ignore
		  
	public void enter_text_then_undo_the_input_text_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited the offer");/*input into the template name input field.*/
	    addPushTemplate.typeAndClearTemplateNameInputField(""); // Undo the template name field			   
	    Thread.sleep(1000); // Optionally, you may want to add a delay for visibility or interaction purposes
	    addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			
	  }
	
	//@Test(priority=23)
	//@Ignore
			  
	public void enter_text_then_undo_and_redo_gain_the_input_text_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited the offer");/*input into the template name input field.*/
		addPushTemplate.typeAndClearTemplateNameInputField(""); // Undo the template name field			   
		Thread.sleep(1000); // Optionally, you may want to add a delay for visibility or interaction purposes
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited the offer");/*redo the the text again */
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
				
	 }
	
	
	@Test(priority=24)
	//@Ignore
				  
	 public void enter_text_and_navigate_through_the_template_name_field_using_the_tab_key() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
		addPushTemplate.typeTotemplatenameInputFieldParam("Limited the offer");/*input into the template name input field.*/
		addPushTemplate.typeAndTabKeyTemplateTemplateNameInputFieldParam("");
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam("Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		//addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		    
	}
	
	
	//@Test(priority=25) 
	//@Ignore
			  
	 public void paste_the_text_into_the_template_name_field_using_the_paste_action() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateBoxTitleforCopyPasteTemplateNameField(); /*paste the text into the title field.*/
		addPushTemplate.selectDatafromAppNameDropDownElement(); /*taking input into the app name drop down field.*/			
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field.*/
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! "); /*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		 
		 
	}
	
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}