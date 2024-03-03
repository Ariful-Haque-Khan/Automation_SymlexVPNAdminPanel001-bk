/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_app.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.CreateNewApp;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AppNameFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	CreateNewApp createNewApp;
	
	//Initializing PageFactory
	public AppNameFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	// Test _Blank!!! 
	@Test(priority=1)
	//@Ignore
	public void enter_empty_text_into_the_app_key_field() throws IOException, InterruptedException {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
		createNewApp.typeToAppNameInputFieldParam(""); // for taking inputs into the app name field
		createNewApp.clickToSaveButtonTest(); // for the save button
		
		
	}
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
