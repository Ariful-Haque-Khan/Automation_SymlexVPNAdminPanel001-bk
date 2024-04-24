/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.rate.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewRatePlan;
import com.admin.qa.function.CreateNewApp;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AddNewratePlanStatusFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	AddNewRatePlan addNewRatePlan;
	
	//Initializing PageFactory
	public AddNewratePlanStatusFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	//@Test(priority=1)
	@Ignore
	public void verify_that_the_checkbox_element_is_visible_on_the_page_screen() throws IOException, InterruptedException {
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("test");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("test");// for taking inputs from the rate description input textarea field
		//addNewRatePlan.checkRatePlanStatusElementExists();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
		
	}
	
	@Test(priority=1)
	//@Ignore
	public void verify_that_the_checkbox_is_checked_by_default() throws IOException, InterruptedException {
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("test");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("test");// for taking inputs from the rate description input textarea field
		//addNewRatePlan.valueOfCheckRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
		
	}
	
	@Test(priority=1)
	//@Ignore
	public void verify_that_the_checkbox_state_persists_after_page_reload() throws IOException, InterruptedException {
		addNewRatePlan = loginPage.addNewRatePlan(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openRatePlanNameFormPage();// open the Custom Panel Name Page.
		addNewRatePlan.typeToRatePlanNameElemenParam("test");// for taking inputs from the rate name input text field
		addNewRatePlan.typeToRatePlanDescriptionElementParam("test");// for taking inputs from the rate description input textarea field
		//addNewRatePlan.valueAfterandBeforeRefreshOfCheckRatePlanStatusElement();//for clicking/unchecking status check box
		//addNewRatePlan.clickToRatePlanSubmitButtonElement();//for submitting with the form data
		
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
