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
	
	/* 05. Test Add New Reseller Client!!! */
	@Test(priority=1)
	//@Ignore
	public void TestAddNewResellerClientForm() throws IOException, InterruptedException {
		addNewResellerClient = loginPage.addNewResellerClientLogin(props.getProperty("username"),props.getProperty("password"));
		addNewResellerClient.openaddNewResellerForm();/*Open the Online PIN Migration Page.*/
		//addNewResellerClient.typeToResellerNameInputField();/* 1.Highlight and Type in the Reseller Name Input Field.*/
		
		//addNewResellerClient.typeTologinInputFieldElement();/* 2.Highlight and Type in the Reseller Login Input Field.*/
		
		//addNewResellerClient.typeToPasswordInputFieldElement();/* 3.Highlight and Type in the Reseller Password Input Field.*/
		
		//addNewResellerClient.typeToCreditLimitInputFieldElement();/* 4.Highlight and Type in the Reseller Credit Limit Input Field.*/
		
		//addNewResellerClient.searchandtypeelementDropDownIPBundleField();/* 5.Highlight and Select IP Bundle in the Reseller IP Bundle Drop down Field.*/
		
		//addNewResellerClient.searchandtypeelementDropDownIPBundle2Field();/* 6.Highlight and Select IP Bundle 2 in the Reseller IP Bundle Drop down Field.*/
		
		//addNewResellerClient.ratePlaneelementDropDownField();/* 7.Highlight and Select Rate plan in the Reseller Rate plan Drop down Field.*/
		
		//addNewResellerClient.pinResetOptioneelementDropDownField();/* 8.Highlight and Select PIN Reset Option in the Reseller PIN Reset Option Drop down Field.*/
		
		//addNewResellerClient.resellerPanelTypeelementDropDownField();/* 9.Highlight and Select Reseller Panel Type Option in the Reseller Panel Type Drop down Field.*/
		
		//addNewResellerClient.checkActiveInactiveCheckboxInputField();/* 10.Highlight and check un check Active / Inactive  Check box Input Field in the Active / Inactive  Check box Input Field.*/
		
		//addNewResellerClient.appPINLoginelementDropDownField();/* 11.Highlight and Select  App PIN Login in the  App PIN Login Drop down Field.*/
		
		//addNewResellerClient.typeToBrandNameInputFieldElement();/* 12.Highlight and Type in the Brand Name Input Field.*/
		
		//addNewResellerClient.typeToBrandPINPrefixInputFieldElement();/* 13.Highlight and Type in the Brand PIN Prefix Input Field.*/
		
		//addNewResellerClient.typeToAllowAppsInputFieldElement();/* 14.Highlight and Type in the Allow Apps Input Field.*/
		
		//addNewResellerClient.isCustomizePanelelementDropDownField();/* 15.Highlight and Select  App PIN Login in the  Is Customize Panel Drop down Field.*/
		
		//addNewResellerClient.typeToIsCustomizePanelPanelNameFieldElement();/* 16.Highlight and Type in the Brand Name Input Field.*/
		
		//addNewResellerClient.hasLimitofPINelementDropDownField();/* 17.Highlight and Select  Has Limit of PIN? in the  Has Limit of PIN? Drop down Field.*/
		
		//addNewResellerClient.typeToPinLimitInputFieldElement();/* 18.Highlight and Type in the Pin Limit Input Field.*/
		
		//addNewResellerClient.onlyTypeelementDropDownField();/* 19.Highlight and Select  Only Type in the Only Type Drop down Field.*/
		
		//addNewResellerClient.mainResellerTypeelementDropDownField();/* 20.Highlight and Select   Main Reseller Type in the Only Type Drop down Field.*/
		Thread.sleep(2000);
		//addNewResellerClient.numberOfDevicesInputFieldElement();/* 21.Highlight and Type in the Number Of Devices Input Field.*/
		
		//addNewResellerClient.resellerLimitInputFieldElement();/* 22.Highlight and Type in the Reseller Limit Input Field.*/
		
		//addNewResellerClient.balanceLimitInputFieldElement();/* 23.Highlight and Type in the Balance Limit Input Field.*/
		
		//addNewResellerClient.emailInputFieldElement();/* 24.Highlight and Type in the Email Input Field.*/
		
		//addNewResellerClient.phoneNoInputFieldElement();/* 25.Highlight and Type in the Phone No. Input Field.*/
		
		//addNewResellerClient.cityInputFieldElement();/* 26.Highlight and Type in the City Input Field.*/
		
		//addNewResellerClient.countryTypeDropDownFieldHighlight();/* 27.Highlight and Select Country Type in the Country Drop down Field.*/
		
		//addNewResellerClient.stateInputFieldElement();/* 28.Highlight and Type in the State Input Field.*/
		
		//addNewResellerClient.addressInputFieldElement();/* 29.Highlight and Type in the Address Input Field.*/
		
		//addNewResellerClient.isTVResellerelementDropDownField();/* 30.Highlight and Select Is TV Reseller in the Is TV Reseller Drop down Field.*/
		
		//addNewResellerClient.creditLimitInputFieldElement();/* 31.Highlight and Type in the TV Credit Limit Input Field.*/
		
		//addNewResellerClient.showAppBannerelementDropDownField();/* 32.Highlight and Select Show App Banner in the Show App Banner Drop down Field.*/
		
		//addNewResellerClient.showFullScreenelementDropDownField();/* 33.Highlight and Select Show Full Screen in the Show Full Screen Drop down Field.*/
		
		//addNewResellerClient.lowBALNotifyEmailelementDropDownField();/* 34.Highlight and Select Low BAL Notify Email in the Low BAL Notify Email Drop down Field.*/
		
		//addNewResellerClient.assignPremiumLockedBundleelementDropDownField();/* 35.Highlight and Select Assign Premium Locked Bundle in the Assign Premium Locked Bundle Drop down Field.*/
		
		addNewResellerClient.submitButton();/* 35.Highlight and Click on the Submit */
		
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
