/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.functional.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.CreateNewApp;
import com.admin.qa.function.PushAutomationForm;
import com.admin.qa.function.SendPushtoUser;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class FunctionalTestforPushManagementSection extends TestBase{
	
	
	LoginPage loginPage;
	CreateNewApp createNewApp;
	PushAutomationForm pushAutomationForm;
	SendPushtoUser sendPushtoUser;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public FunctionalTestforPushManagementSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	/****** Test Create New App!!! *****/
	//@Test(priority=1)
	@Ignore
	public void TestCreateNewAppForm() throws IOException, InterruptedException {
		createNewApp = loginPage.createNewAppLogin(props.getProperty("username"),props.getProperty("password"));
		createNewApp.openCreateNewAppPage();/*open the Create New App Page */
		//createNewApp.typeToAppNameTest();/*1. Type in the App Name Input Field.*/
		//createNewApp.typeToAPPIDOneSignalTest();/*2. Type in the APP ID (One Signal) Input Field.*/
		//createNewApp.typeToAPPKeyOneSignalTest();/*3. Type in the APP Key (One Signal) Input Field.*/
		//createNewApp.clickToIsUDIDCheckChekboxInputTest();/*4. click in the Is UDID Check, Checkbox Input Field.*/
		createNewApp.clickToSaveButtonTest();/*4. click in the Is Save Button.*/
		
	}
	
	/****** Test Push Automation Form!!! *****/
	//@Test(priority=1)
	@Ignore
	public void TestPushAutomationForm() throws IOException, InterruptedException {
		pushAutomationForm = loginPage.pushAutomationLogin(props.getProperty("username"),props.getProperty("password"));
		pushAutomationForm.openPushAutomationFormPage();/*open the Push Automation Form Page */
		pushAutomationForm.selectDatafromAppNameDropDownElement();/*1.. select data from App name Field */
		pushAutomationForm.selectDatafromPushTemplateDropDownElement();/*2.. select data from Push Template Field */
		pushAutomationForm.autoPushDropdownField();/*3.. select data from Auto Push Field */
		pushAutomationForm.ResellerTypehDropdownField();/*4.. select data from Reseller Type Field */
		pushAutomationForm.datafromWithChildDropDownElement();/*5.. check from With Child checkbox Field */
		pushAutomationForm.selectResellerFromDropdownField();/*6.. select data from Select reseller Field */
		pushAutomationForm.datafromPINStatusCheckboxElement();/*7.. check data from Active Checkbox Field */
		pushAutomationForm.datafromPINStatusInactiveCheckboxElement();/*8.. check data from InActive Checkbox Field */
		pushAutomationForm.datafromPINStatusExpiredCheckboxElement();/*9.. check data from Expired Checkbox Field */
		pushAutomationForm.datafromPINWithCommaSeparatedInputboxElement();/*10.. type data to PIN with comma separated Input Box Field */
		pushAutomationForm.selectDatafromCountryDropDownElement();/*11.. Select data from Country Field */
		pushAutomationForm.selectAutomationTypeFromDropdownField();/*12.. Select data from Automation Type Field */
		//pushAutomationForm.selectDatafromDaysatAfterLoginDropDownElement();/*13.. Select data from Days at After Login Drop Down Field */
		//pushAutomationForm.selectDaysatBeforeExpiredDropDownElement();/*14.. Select data from Days at Days at Before Expired */
		//pushAutomationForm.selectDaysatAfterExpiredDropDownElement();/*15.. Select data from Days at Days at After Expired */
		pushAutomationForm.selectDaysofWeekDropDownElement();/*16.. Select data from Days of Week */
		pushAutomationForm.selectDaysofMonthDropDownElement();/*17.. Select data from Days of Month */
		pushAutomationForm.selectMonthDropDownElement();/*18.. Select data from Month */
		pushAutomationForm.datafromSpecificTimeInputboxElement();/*19.. Type data in Specific Time, Input  Element */
		pushAutomationForm.activeInactiveStatusCheckboxInputboxElement();/*20.. Click Active/Inactive Status, Checkbox Input  Element */
		pushAutomationForm.deviceTypeDropdownField();/*21.. select data from Device Type Dropdown Field */
		pushAutomationForm.purchaseTypeDropdownField();/*22.. select data from Purchase Type Dropdown Field */
	}
	
	/* ***** Test Send Push to user Form */
	@Test(priority=1)
	//@Ignore
	public void TestSendPushtoUserForm() throws IOException, InterruptedException {
		sendPushtoUser = loginPage.sendPushtoUserLogin(props.getProperty("username"),props.getProperty("password"));
		sendPushtoUser.openSendPushtoUserPage();/*0.. open the Send Push to User Page. */
		//sendPushtoUser.selectDatafromAppNameDropDownElement();/*1.. select data from App name Field */
		//sendPushtoUser.sendToDropdownField();/*2.. select data from App name Field */
		//sendPushtoUser.datafromWithChildDropDownElement();/*3.. check from With Child checkbox Field */
		sendPushtoUser.datafromPINWithCommaSeparatedInputboxElement();/*4.. type data to PIN with comma separated Input Box Field */
	}
	
	
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
