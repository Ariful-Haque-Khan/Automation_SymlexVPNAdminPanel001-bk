/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.campaignfunctional.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.AdminRolePermission.AddNewIP;
import com.admin.qa.AdminRolePermission.AddNewMenuPermission;
import com.admin.qa.AdminRolePermission.AddNewRole;
import com.admin.qa.AdminRolePermission.NewAdminCreation;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class AdminRolePermission extends TestBase{
	
	
	LoginPage loginPage;
	NewAdminCreation newAdminCreation;
	AddNewRole addNewRole;
	AddNewMenuPermission addNewMenuPermission;
	AddNewIP addNewIP;

	TestUtils testUtils;
	
	//Initializing PageFactory
	public AdminRolePermission() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	/* ***** Test New Admin Creation!!! */
	//@Test(priority=1)
	@Ignore
	public void TestNewAdminCreationForm() throws IOException, InterruptedException {
		newAdminCreation = loginPage.newAdminCreationLogin(props.getProperty("username"),props.getProperty("password"));
		newAdminCreation.openNewAdminCreationpage();/*open the New Admin Creation Page. */
		//newAdminCreation.typeToUserName();/* 1.. type to User Name Input Text Element */
		//newAdminCreation.typeTofullName();/* 2.. type to Full Name Input Text Element */
		//newAdminCreation.typeTopasswordElement();/* 3.. type to Password Input Text Element */
		//newAdminCreation.typeToConfirmPassword();/* 4.. type to Confirm Password Input Text Element */
		//newAdminCreation.clickToactiveInactiveStatus();/* 5.. click to Active/Inactive Status Input Text Element */
		//newAdminCreation.typeToemailInputField();/* 6.. type to Email Input Text Element */
		//newAdminCreation.typeToPhoneNoDays();/* 7.. type to Phone No Input Text Element */
		//newAdminCreation.selectDatafromIsRechargeableFilterDropDownElement();/* 8.. select from Is Rechargeable Dropdown Field Element */
		//newAdminCreation.selectDatafromAdminTypeFilterDropDownElement();/* 9.. select from Admin Type Dropdown Field Element */
		//newAdminCreation.selectDatafromRoleTypeFilterDropDownElement();/* 9.. select from Role Type Dropdown Field Element */
		//newAdminCreation.clickToSubmitButton();/* 11.. click to Submit Button Input Element */
	}
	
	/* Test Add New Role Creation */
	//@Ignore
	public void TestAddNewRoleForm() throws IOException, InterruptedException {
		addNewRole = loginPage.addNewRoleLogin(props.getProperty("username"),props.getProperty("password"));
		addNewRole.openAddNewRolePage();/*open the Add New Role Page. */
		//addNewRole.typeToName();/* 1.. type to Name Input Element */
		//addNewRole.typeToDisplayName();/* 2.. type to Display Name Input Element */
		//addNewRole.typeToDescription();/* 3.. type to Description Input Element */
		addNewRole.clickOnSubmitButton();/* 4.. click on Submit Button Input Element */
	}
	
	/* ***** Test Add New Menu Permission Form page!!! */
	@Ignore
	public void TestAddNewMenuPermissionForm() throws IOException, InterruptedException {
		addNewMenuPermission = loginPage.addNewMenuPermissionLogin(props.getProperty("username"),props.getProperty("password"));
		addNewMenuPermission.openAddNewMenuPermissionPage();/*open the Add New Menu Permission Page. */
		addNewMenuPermission.selectDatafromRoleFilterDropDownElement();/* 1.. select from Role Dropdown Field Element */
		addNewMenuPermission.selectDatafromMenuFilterDropDownElement();/* 2.. select from Menu Dropdown Field Element */
		addNewMenuPermission.clickToPermissionView();/* 3.. check to Permission View Input Element */
		addNewMenuPermission.clickToPermissionCreate();/* 4.. check to Permission Create Input Element */
		addNewMenuPermission.clickOnPermissionEdit();/* 5.. check to Permission View Edit Element */
		addNewMenuPermission.clickOnPermissionDownload();/* 6.. check to Permission Download Input Element */
		addNewMenuPermission.clickOnPermissionDelete();/* 7.. check to Permission Delete Input Element */
		addNewMenuPermission.clickOnSubmitButton();/* 8.. click to Submit Button Input Element */
	}
	
	/* Test Add New IP Form Page */
	@Test(priority=1)
	public void TestAddNewServerBlankForm() throws IOException, InterruptedException {
		addNewIP = loginPage.addNewIPLogin(props.getProperty("username"),props.getProperty("password"));
		addNewIP.openAddNewIPPage();/*open the Add New IP Form Page */
		//addNewIP.typeToServerName();/* 1.. type to Server Name Input Element */
		//addNewIP.typeToIP();/* 2.. type to Server IP Element */
		//addNewIP.typeToServerNote();/* 3.. type to Server Note Element */
		addNewIP.serverTypeDropdownField();/* 4.. select from Server Type Dropdown Field Element */
		addNewIP.uaeNetworkDropdownField();/* 5.. select from UAE Network Dropdown Field Element */
		addNewIP.selectDatafromCountryDropDownElement();/* 6.. select from Country Dropdown Field Element */
		addNewIP.selectDatafromVPNServerDropDownElement();/* 7.. select from VPN Server Field Element */
		addNewIP.connectionTypeDropdownField();/* 8.. select from Connection Type Dropdown Field Element */
		addNewIP.typeToSSLIP();/* 9.. type to SSL IP Element */
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
