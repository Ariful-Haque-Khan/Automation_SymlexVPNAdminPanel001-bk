/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_push_template.qa.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddPushTemplate;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class MessageFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddPushTemplate addPushTemplate;
	
	//Initializing PageFactory
	public MessageFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() { 
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	// Test _Blank!!! 
	//@Test(priority=1)
	//@Ignore
		 
	public void check_with_empty_text_in_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		//assertTrue(true);
	  }
		  
	//@Test(priority=2)
	//@Ignore
	public void enter_a_valid_and_unique_message() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam(" Don't miss out! Exclusive discounts inside. Tap to unlock savings now! ");
		addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		//assertTrue(false);
	}
	
	//@Test(priority=3)
	//@Ignore
	public void enter_the_maximum_allowed_characters_into_the_input_text_field_more_than_250_characters() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("testnnn.....n2222433333333333333nnnnnnnnnnnnnnnnnnnnnnnnmmmmmmmmmmmnnnnnnnnnnnnnnnnnnnnnnnnmmmmmmmmmmmnnnnnnnnnnnnnnnnnnnnnnnnmmmmmmmmmmmttttttttttttttttttttttttttjjjjjjjjjjjjjjjjj");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=4)
	//@Ignore
		 
	 public void enter_the_minimum_number_of_allowed_characters_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("111hhh");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
				
	}
	
	
	//@Test(priority=5)
	//@Ignore
	 
	public void enter_only_alphabetic_characters_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("abcdefghijkl");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=6)
	//@Ignore
	 
	public void enter_numeric_characters_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("1234567891234567");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=7)
	//@Ignore
	 
	public void enter_a_combination_of_alphabetic_and_numeric_characters_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("message12345message1234");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=8)
	//@Ignore
	 
    public void enter_special_characters_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("!@#$%^&*()!@#$%^&*((");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	
	//@Test(priority=9)
	//@Ignore
	 
	public void enter_text_with_leading_whitespaces_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("       write the message");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	
	//@Test(priority=10)
	//@Ignore
	 
	public void enter_text_with_trailing_whitespaces_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("write the message                     ");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=11)
	//@Ignore
	 
	public void enter_text_with_spaces_within_the_content_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("write     the      message");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=12)
	//@Ignore
	 
	public void enter_text_in_uppercase_letters_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("WRITE THE MESSAGE WITH OFFER");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=13)
	//@Ignore
	 
	public void enter_text_in_lowercase_letters_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("write the message with offer");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=14)
	//@Ignore
	 
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letters_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("WRITE the MessaGE with oFFEr");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=15)
	//@Ignore
	 
	public void enter_text_with_punctuation_marks_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam(",.?:;',./?;:' !");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=16)
	//@Ignore
	 
	public void enter_text_with_line_breaks_or_newlines_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("Twinkle, twinkle, little star,\r\n"
				+ "How I wonder what you are!\r\n"
				+ "Up above the world so high,\r\n"
				+ "Like a diamond in the sky.\r\n"
				+ "");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
	}
	
	//@Test(priority=17)
	//@Ignore
			 
	public void attempt_to_inject_HTML_or_script_tags_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		//assertTrue(true);
	}
			  
			  
	@Test(priority=18)
	//@Ignore
				 
	public void enter_text_containing_emojis_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("😊 🌟 🌺 🤔 🍕 🎶 🌈 🚀");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
					
	}		  
		  
	//@Test(priority=19)
	//@Ignore
				 
	public void enter_text_with_accented_characters_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam(" é ü  é ü  é ü");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
					
				
	}
			 
			 
			 
	//@Test(priority=20)
	//@Ignore
		  
	public void enter_default_placeholder_into_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
	    addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
		//String defaultPlaceholderText = "Enter Push Message"; // Enter default placeholder text into the title field.
		addPushTemplate.typeTotemplateMessageInputFieldParam("");
		addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button.
				 
	}
		  
	//@Test(priority=21)
	//@Ignore
			  
	 public void enter_text_then_clear_the_message_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
		addPushTemplate.typeTotemplateMessageInputFieldParam("Write a proper message Here");// Enter text into the message field
		addPushTemplate.typeAndClearTemplateMessageInputField(""); // Clear the message field
		Thread.sleep(1000); // Optionally, you may want to add a delay for visibility or interaction purposes
		addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button.
			
	 }
			  
			     
	//@Test(priority=22)
	//@Ignore
			  
	 public void enter_text_then_undo_the_message_field() throws IOException, InterruptedException {
			 addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
			 addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
			 addPushTemplate.typeTotemplateMessageInputFieldParam("buy one get one free");// Enter text into the message field
			 addPushTemplate.typeAndClearTemplateMessageInputField(""); // Clear the message field			   
			 Thread.sleep(1000); // Optionally, you may want to add a delay for visibility or interaction purposes
			 addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button
				   
	}
			  
	//@Test(priority=23)
	//@Ignore
			  
	 public void enter_text_undo_the_redo_the_message_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
			addPushTemplate.typeTotemplateMessageInputFieldParam("buy lifetime get 2 months"); // Enter text into the message field, undo, and redo
			addPushTemplate.typeAndClearTemplateMessageInputField(""); // Clear the message field
			addPushTemplate.typeTotemplateMessageInputFieldParam("buy lifetime get 2 months");
			Thread.sleep(1000); // Optionally, you may want to add a delay for visibility or interaction purpose
			addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button.
				 
	}
			  
			  
			  
	//@Test(priority=24)
	//@Ignore
			  
	 public void enter_text_and_navigate_through_the_message_field_using_the_tab_key() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
		addPushTemplate.typeTotemplateMessageInputFieldParam("a big offer of get 2 months"); // taking input into message field
		addPushTemplate.typeAndTabKeyTemplateMessageInputFieldParam(""); // navigate to the tab key
		addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button.
	    
	}

  
			  
	//@Test(priority=25) 
	//@Ignore
			  
	 public void paste_the_text_into_the_message_field_using_the_paste_action() throws IOException, InterruptedException {
		 addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
		 addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page.*/
		 addPushTemplate.typeTotemplateBoxTitleforCopyPasteField(); /*paste the text into the title field.*/
		 addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
		 
		 
	}
 
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
