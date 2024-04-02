/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_server;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class ServerNameFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	//Initializing PageFactory
	public ServerNameFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	/* ***** Test _Blank!!! 
	//@Test(priority=1)
	//@Ignore
	public void TestAddNewServerBlankForm() throws IOException, InterruptedException {
		newCustomizeResellerPanel = loginPage.customPanelNameLogin(props.getProperty("username"),props.getProperty("password"));
		newCustomizeResellerPanel.openNewCustomizeResellerPanelPage();/*open the Custom Panel Name Page.
		
	}*/
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
