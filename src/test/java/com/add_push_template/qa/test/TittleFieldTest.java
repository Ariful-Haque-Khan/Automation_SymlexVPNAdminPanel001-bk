/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_push_template.qa.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.admin.qa.function.AddPushTemplate;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;


public class TittleFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddPushTemplate addPushTemplate;
	
	//Initializing PageFactory
	public TittleFieldTest() {
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
	 
	  public void check_with_empty_text_in_the_title_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateTitleInputField();/*taking input into the title field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		//assertTrue(true);
	   }
	 
	  //@Test(priority=2)
		//@Ignore
		public void enter_a_valid_and_unique_tittle() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("Exclusive Flash Sale: Limited Time Only!");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		}
		
	
	  //@Test(priority=3)
		//@Ignore
		 
		  public void enter_the_maximum_allowed_characters_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");/*taking input in the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=4)
		//@Ignore
		 
		  public void enter_the_minimum_allowed_characters_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("mini");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=5)
		//@Ignore
		 
		  public void enter_only_alphabetic_characters_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("abcdefghijkl");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  
	  //@Test(priority=6)
		//@Ignore
		 
		  public void enter_numeric_characters_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("123456789");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=7)
		//@Ignore
		 
		  public void enter_combination_alphabetic_numeric_characters_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("a1b2c3d4");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=8)
		//@Ignore
		 
		  public void enter_special_characters_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("!@#$%^&*!@#$%^");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=9)
		//@Ignore
		 
		  public void enter_text_with_leading_whitespaces_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("    abcdsdsedede");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=10)
		//@Ignore
		 
		  public void enter_text_with_trailing_whitespaces_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("abcdsdsedede        ");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=11)
		//@Ignore
		 
		  public void enter_text_with_spaces_within_the_content_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("abc abc abc ");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=12)
		//@Ignore
		 
		  public void enter_text_in_uppercase_letters_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("GIVE  A TITLE");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=13)
		//@Ignore
		 
		  public void enter_text_in_lowercase_letters_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("give a title in small letters");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  //@Test(priority=14)
		//@Ignore
		 
		  public void enter_text_with_a_mix_of_uppercase_and_lowercase_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("GIVE  a title");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=15)
		//@Ignore
		 
		  public void enter_text_with_punctuation_marks_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("a,b.s/d?f:");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=16)
		//@Ignore
		 
		  public void enter_text_with_line_breaks_or_newlines_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("Twinkle, twinkle, little star,\r\n"
					+ "How I wonder what you are!\r\n"
					+ "Up above the world so high,\r\n"
					+ "Like a diamond in the sky.\r\n"
					+ "");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			
		}
	  
	  //@Test(priority=17)
		//@Ignore
		 
		  public void attempt_to_inject_HTML_or_script_tags_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=18)
		//@Ignore
		 
		  public void enter_text_containing_emojis_into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam("😊 🌟 🌺 🤔 🍕 🎶 🌈 🚀");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	  
	  //@Test(priority=19)
		//@Ignore
		 
		  public void enter_text_with_accented_characters__into_the_title_field() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
			addPushTemplate.typeTotemplateTitleInputFieldParam(" é ü  é ü  é ü");/*taking input into the title field. */
			addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
			//assertTrue(true);
		}
	 
	  //@Test(priority=20)
		//@Ignore
	  
	      public void enter_Default_Placeholder_Text_Into_Title_Field() throws IOException, InterruptedException {
		    addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
		    addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
		    //String defaultPlaceholderText = "Enter Push Title"; // Enter default placeholder text into the title field.
		    addPushTemplate.typeTotemplateTitleInputFieldParam("");
		    addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button.
		}
	  
	//@Test(priority=21)
	//@Ignore
	  
	     public void enter_text_then_clear_the_title_field() throws IOException, InterruptedException {
		    addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
		    addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
		    addPushTemplate.typeTotemplateTitleInputFieldParam("Your Text Here");// Enter text into the title field
		    addPushTemplate.typeAndClearTemplateTitleInputField(""); // Clear the title field
		    Thread.sleep(1000); // Optionally, you may want to add a delay for visibility or interaction purposes
		    addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button.
		}
	     
	  //@Test(priority=22)
	  //@Ignore
	  
	      public void enter_text_then_undo_the_title_field() throws IOException, InterruptedException {
		    addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
		    addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
		    addPushTemplate.typeTotemplateTitleInputFieldParam("buy one get one free");// Enter text into the title field
		    addPushTemplate.typeAndClearTemplateTitleInputField(""); // Clear the title field
		    Thread.sleep(1000); // Optionally, you may want to add a delay for visibility or interaction purposes
		    addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button.
		}
	  
	  //@Test(priority=23)
	  //@Ignore
	  
	  public void enter_text_undo_the_redo_the_title_field() throws IOException, InterruptedException {
		    addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
		    addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
		    addPushTemplate.typeTotemplateTitleInputFieldParam("buy lifetime get 2 months"); // Enter text into the title field, undo, and redo
		    addPushTemplate.typeAndClearTemplateTitleInputField(""); // Clear the title field
		    addPushTemplate.typeTotemplateTitleInputFieldParam("buy lifetime get 2 months");
		    Thread.sleep(1000); // Optionally, you may want to add a delay for visibility or interaction purpose
		    addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button.
		}
	  
	  //@Test(priority=24)
	  //@Ignore
	  
	  public void enter_text_and_navigate_through_the_title_field_using_the_tab_key() throws IOException, InterruptedException {
		    addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
		    addPushTemplate.openAddPushTemplatePage(); // Open the Add Push Template Page.
		    addPushTemplate.typeTotemplateTitleInputFieldParam("a big offer of get 2 months"); // Enter text into the title field
		    addPushTemplate.typeAndTabKeyTemplateTitleInputFieldParam("");
		    addPushTemplate.typeTotemplateSaveButtonField(); // Click the save button.
		}
	  
	  @Test(priority=25)  
	  //@Ignore
	  
	  public void paste_the_text_into_the_tittle_field_using_the_paste_action() throws IOException, InterruptedException {
			addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"), props.getProperty("password"));
			addPushTemplate.openAddPushTemplatePage(); /*open the Custom Panel Name Page.*/
			addPushTemplate.typeTotemplateBoxTitleforCopyPasteTitleField(); /*paste the text into the title field.*/
			addPushTemplate.typeTotemplateSaveButtonField(); /*for the save button*/
			 
			 
		}


	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
