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

public class UdidCheckBoxTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	CreateNewApp createNewApp;
	
	//Initializing PageFactory
	public UdidCheckBoxTest() {
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
	public void verify_that_the_checkbox_element_is_visible_on_the_page() throws IOException, InterruptedException {
	    createNewApp = loginPage.createNewAppLogin(props.getProperty("username"), props.getProperty("password"));
	    createNewApp.openCreateNewAppPage(); //open the Custom Panel Name Page.
	    createNewApp.clickToIsUDIDCheckChekboxInputTest();
	    
	    if (isCheckboxVisible()) {
	        System.out.println("Checkbox is visible on the page.");
	    } else {
	        System.out.println("Checkbox is not visible on the page.");
	        // You may throw an exception here or handle it according to your test scenario
	    }
	    createNewApp.clickToIsUDIDCheckChekboxInputTest();
	}
		


	

	private boolean isCheckboxVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	//@Test(priority=2)
	//@Ignore
    public void verify_that_the_checkbox_is_checked_by_default() throws IOException, InterruptedException {
		
	}



    //@Test(priority=3)
  	//@Ignore
    public void verify_that_clicking_on_the_checkbox_label_does_not_toggle_the_checkbox_state_twice() throws IOException, InterruptedException {
	
    }
    
    
    //@Test(priority=4)
  	//@Ignore
    public void verify_that_the_checkbox_state_persists_after_page_reload() throws IOException, InterruptedException {
    	
    }
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
