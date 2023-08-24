/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.functional.qa.test;

import java.io.IOException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddNewResellerClient;
import com.admin.qa.function.AddPINJail;
import com.admin.qa.function.AddPINValidity;
import com.admin.qa.function.OnlinePINActivation;
import com.admin.qa.function.OnlinePINMigration;
import com.admin.qa.function.SendBackgroundorSilentPushtoSinglePIN;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class FunctionalTestforUserPINSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	AddPINValidity addPINValidity;
	OnlinePINActivation onlinePINActivation;
	OnlinePINMigration onlinePINMigration;
	SendBackgroundorSilentPushtoSinglePIN sendBackgroundorSilentPushtoSinglePIN;
	AddNewResellerClient addNewResellerClient;
	AddPINJail addPINJail;
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
	
	
	/* 01. Test add validity in any PIN!!! */
	//@Test(priority=1)
	//@Ignore
	public void TestAddPINValidityForm() throws IOException, InterruptedException {
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password"));
		
		addPINValidity.openEmailListReport();
		addPINValidity.typeToNumberofDays();
		addPINValidity.typeelementDropDownField();
		addPINValidity.typeToPINinCSVorNewLine();
		addPINValidity.clickOnSubmitButton();
		
	}
	
	/* 02. Test active a PIN by providing the payment Information. */
	//@Test(priority=1)
	//@Ignore
	public void TestOnlinePINActivationForm() throws IOException, InterruptedException {
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password"));
		onlinePINActivation.openOnlinePINActivationPage(); /*open the Online PIN Activation 2 Page.*/
		//try {Thread.sleep(6000);} catch (InterruptedException ie) {}
		//onlinePINActivation.selectPaymentGateway(); /*open the Online PIN Activation 2 Page.*/
		onlinePINActivation.typetothePaymentTNXID();/*Type in the Payment TNX ID Input Field.*/
		onlinePINActivation.typetothePriceUSD();/*Type in the Price USD Input Field.*/
		onlinePINActivation.typetotheUsernameandPIN();/*Type in the Username/PIN Input Field.*/
		onlinePINActivation.clickVerifyandActivateButton();/*Click on the Verify and Activate Button.*/
		try {Thread.sleep(4000);} catch (InterruptedException ie) {}
		//onlinePINActivation.clickPopUpYesButton();/*Click on the Pop Up Yes Button.*/
		onlinePINActivation.clickPopUpNoButton();/*Click on the Pop Up No Button.*/
	}
	
	/* 03. Test Online PIN Migration from Old to New. */
	//@Test(priority=1)
	@Ignore
	public void TestOnlinePINMigrationForm() throws IOException, InterruptedException {
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password"));
		onlinePINMigration.openOnlinePINMigrationPage(); /*open the Online PIN Migration Page.*/
		onlinePINMigration.typeToNewPINandEmail(); /*Type in the New PIN / Email Input Field.*/
		onlinePINMigration.typeTopasswordforNewPINandEmail(); /*Type in the Password input Field for New PIN / Email Input Field.*/
		onlinePINMigration.typeToOldPINandEmail(); /*Type in the Old PIN / Email Input Field.*/
		onlinePINMigration.typeTopasswordforOldPINandEmail(); /*Type in the Password input Field for Old PIN / Email Input Field.*/
		onlinePINMigration.clickOnmigrationNowButton(); /*Click on the Migration Now Button.*/
		try {Thread.sleep(7000);} catch (InterruptedException ie) {}
		onlinePINMigration.clickOnpopUpYesButton(); /* click on the Yes Button in the pop up alert form. */
		//onlinePINMigration.clickPopUpNoButton();/*click on the Pop Up No Button.*/
	}
	
	/* 04. Test Add PIN Jail Bundle!!! */
	//@Test(priority=1)
	@Ignore
	public void TestAddPINJailForm() throws IOException, InterruptedException {
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password"));
		
		addPINJail.openAddPINJail();/*open the PIN Jail Bundle Page.*/
		addPINJail.typeToPINorUsernames();
		addPINJail.searchandtypeelementDropDownField();
		addPINJail.clickONSaveButton();
	}
	
	/* 05. Test Send Background/Silent Push to Single PIN!!! */
	//@Test(priority=1)
	@Ignore
	public void TestSendBackgroundorSilentPushtoSinglePINForm() throws IOException, InterruptedException {
		sendBackgroundorSilentPushtoSinglePIN = loginPage.sendBackgroundorSilentPushtoSinglePINLogin(props.getProperty("username"),props.getProperty("password"));
		
		sendBackgroundorSilentPushtoSinglePIN.openSendBackgroundorSilentPushtoSinglePINPage();
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownAppNameField();/* Select Push Type from the Drop Down in App Name Field */
		sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownPushTypeField();/* Select Push Type from the Drop Down in Push Type Field */
		sendBackgroundorSilentPushtoSinglePIN.typeInpininCSVInputField();/*Type in the PIN in CSV Input Field.*/
		sendBackgroundorSilentPushtoSinglePIN.clickONSaveButton();/*click on the save button.*/
		try {Thread.sleep(4000);} catch (InterruptedException ie) {}
		sendBackgroundorSilentPushtoSinglePIN.clickOnpopUpYesButton(); /* click on the Yes Button in the pop up alert form. */
		//sendBackgroundorSilentPushtoSinglePIN.clickOnpopUpNoButton();/*click on the Pop Up No Button.*/
	}
	
	/* 05. Test Send Background/Silent Push to Single PIN!!! */
	@Test(priority=1)
	//@Ignore
	public void TestAddNewResellerClientForm() throws IOException, InterruptedException {
		addNewResellerClient = loginPage.addNewResellerClientLogin(props.getProperty("username"),props.getProperty("password"));
		addNewResellerClient.openaddNewResellerForm();
		addNewResellerClient.typeToPINinCSVorNewLine();
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
