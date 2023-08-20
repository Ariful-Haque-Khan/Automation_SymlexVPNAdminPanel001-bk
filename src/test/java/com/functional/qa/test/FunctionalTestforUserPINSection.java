/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.functional.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddPINValidity;
import com.admin.qa.pages.UserPermissionSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class FunctionalTestforUserPINSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	AddPINValidity addPINValidity;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public FunctionalTestforUserPINSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Roles List is okay and return http status 200! */
	@Test(priority=1)
	public void TestRoleListLink() throws IOException, InterruptedException {
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password"));
		
		addPINValidity.openEmailListReport();
		addPINValidity.typeToNumberofDays();
		//addPINValidity.typeelementDropDownField();
		addPINValidity.typeToPINinCSVorNewLine();
		
	}
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
