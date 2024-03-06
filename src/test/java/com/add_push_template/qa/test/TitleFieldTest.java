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

public class TitleFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddPushTemplate addPushTemplate;
	
	//Initializing PageFactory
	public TitleFieldTest() {
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
	//@Ignor
			 
	public void check_with_empty_text_in_the_title_field() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		addPushTemplate.typeTotemplateMessageInputFieldParam("");/*taking input into the message field.*/
		addPushTemplate.typeTotemplateSaveButtonField();/*for the save button*/
		
		
	  }
	
	
	//@Test(priority=2)
	//@Ignor
	public void enter_a_valid_and_unique_title()throws IOException, InterruptedException {
		
		
	}
	
	//@Test(priority=3)
	//@Ignore
    public void enter_the_maximum_allowed_characters_into_the_title_field()throws IOException, InterruptedException {
		
	}
	
	//@Test(priority=4)
	//@Ignore
	public void enter_the_minimum_allowed_characters_into_the_title_field()throws IOException, InterruptedException {
		
		
			
		
	}
	
	
	//@Test(priority=5)
	//@Ignor
	public void enter_the_only_alphabetic_characters_into_the_title_field()throws IOException, InterruptedException {
		
		
		
	}
	
	//@Test(priority=6)
	//@Ignore
	public void enter_the_numeric_characters_characters_into_the_title_field()throws IOException, InterruptedException {
		
	
	}
	
	
	//@Test(priority=7)
	//@Ignore
	public void enter_the_combination_of_alphabetic_and_numeric_into_the_title_field()throws IOException, InterruptedException {
		
	}
	
	
	//@Test(priority=8)
	//@Ignore
	public void enter_the_special_characters_into_the_title_field()throws IOException, InterruptedException {
		
	}
	
	
	//@Test(priority=9)
	//@Ignore
	public void enter_text_with_leading_whitespaces_into_the_title_field()throws IOException, InterruptedException {
		
	}
	
	
	//@Test(priority=10)
	//@Ignore
	public void enter_text_with_trailing_whitespaces_into_the_title_field()throws IOException, InterruptedException {
		
	}
	
	
	//@Test(priority=11)
	//@Ignore
	public void enter_text_with_spaces_within_the_content_field()throws IOException, InterruptedException {
		
	}
	
	
	
	//@Test(priority=12)
	//@Ignore
	public void enter_text_in_uppercase_letters_into_the_title_field()throws IOException, InterruptedException {
		
	}
	
	
	
	//@Test(priority=13)
	//@Ignore
	public void enter_text_in_lowercase_letters_into_the_title_field()throws IOException, InterruptedException {
		
		
		
	}
	
	//@Test(priority=14)
	//@Ignore
	public void enter_text_with_a_mix_of_uppercase_and_lowercase_letters_into_the_title_field ()throws IOException, InterruptedException {
		
	}
	
	
	
	//@Test(priority=15)
	//@Ignore
	public void enter_text_with_punctuationmarks_into_the_title_field()throws IOException, InterruptedException {
		
	}
	
	//@Test(priority=16)
	//@Ignore
	public void enter_text_with_line_breaks_or_newlines_into_the_title_field()throws IOException, InterruptedException {
		
	}
	
	
	//@Test(priority=17)
	//@Ignore
	public void enter_unicode_characters_into_the_title_field()throws IOException, InterruptedException {
		
		
	}
	
	//@Test(priority=18)
	//@Ignore
	public void enter_text_containing_emojis_into_the_title_field()throws IOException, InterruptedException {
		
		
	}
	
	
	//@Test(priority=19)
	//@Ignore
	public void enter_text_with_accented_characters_into_the_title_field()throws IOException, InterruptedException {
		
	}
	
	
	
	
	//@Test(priority=20)
	//@Ignore
	public void enter_the_default_placeholder_text_into_the_title_field()throws IOException, InterruptedException {
			
	}
	
	
	//@Test(priority=21)
	//@Ignore
	public void enter_text_then_clear_the_title_field()throws IOException, InterruptedException {
				
	}
	
	
	//@Test(priority=22)
	//@Ignore
	public void enter_text_undo_the_title_field()throws IOException, InterruptedException {
		
		
					
	}
	
	
	//@Test(priority=23)
	//@Ignore
	public void enter_text_then_undo_then_redo_the_text_into_title_field()throws IOException, InterruptedException {
			
			
						
	}
	
	
	
	//@Test(priority=24)
	//@Ignore
	public void enter_text_and_navigate_through_the_title_field_using_the_tab_key()throws IOException, InterruptedException {
				
				
							
	}
	
	
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
