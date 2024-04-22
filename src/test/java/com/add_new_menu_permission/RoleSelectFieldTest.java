/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.add_new_menu_permission;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewMenuPermission;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class RoleSelectFieldTest extends TestBase{
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	
	AddNewMenuPermission addNewMenuPermission;
	
	//Initializing PageFactory
	public RoleSelectFieldTest() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	public void addNewPaymentMethodCommon(String title) throws IOException, InterruptedException {
		addNewMenuPermission = loginPage.addNewMenuPermissionLogin(props.getProperty("username"),props.getProperty("password")); //login to the system
		addNewMenuPermission.openAddNewMenuPermissionForm();// open the Add New Menu Permission Page.
		addNewMenuPermission.RoleSelectField();//select from role drop down button
		addNewMenuPermission.typeToMenuSelectField();// select from menu drop down button
		addNewMenuPermission.typeToViewCheckboxElement();// select View Check box
		addNewMenuPermission.typeToCreateCheckboxElement(); //select Create Check box button
		addNewMenuPermission.typeToEditCheckboxElement();// select Edit Check box button
		addNewMenuPermission.typeToDeleteCheckboxElement();// select Delete Check box button
		//addNewMenuPermission.clickONSubmitButton();//click on submit button
		
			
	}

}
