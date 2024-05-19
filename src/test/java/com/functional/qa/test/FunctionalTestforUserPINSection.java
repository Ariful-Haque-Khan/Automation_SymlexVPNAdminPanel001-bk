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

import com.admin.qa.function.AddNewResellerClient;
import com.admin.qa.function.ServerModuleElement;
import com.admin.qa.function.AddPINJail;
import com.admin.qa.function.AddPINValidity;
import com.admin.qa.function.NewCustomizeResellerPanel;
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
	NewCustomizeResellerPanel newCustomizeResellerPanel;
	AddPINJail addPINJail;
	ServerModuleElement serverModuleElement;
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
		
		addPINValidity.openAddPINvalidityReport();/*open the Add PIN Validity Page.*/
		addPINValidity.typeToNumberofDays();/*Type in the PIN Type Input Field.*/
		//addPINValidity.typeelementDropDownField();/*Type in the PIN Type Drop Down Field.*/
		addPINValidity.typeToPINinCSVorNewLine();/*Type in the PIN in CSV or New Line Input Field.*/
		addPINValidity.clickOnSubmitButton();/* click on Submit Button */
		//addPINValidity.clickPopUpYesButton();/* click on the Pop Up Yes Button */
		addPINValidity.clickPopUpNoButton();/* click on the Pop Up No Button */
		
	}
	
	/* 02. Test active a PIN by providing the payment Information. */
	//@Test(priority=1)
	@Ignore
	public void TestOnlinePINActivationForm() throws IOException, InterruptedException {
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password"));
		onlinePINActivation.openOnlinePINActivationPage(); /*open the Online PIN Activation 2 Page.*/
		try {Thread.sleep(3000);} catch (InterruptedException ie) {} /* make wait the script for 3s. */
		//onlinePINActivation.selectPaymentGateway(); /* Select Payment Gateway from the Drop Down in Payment Gateway Field */
		//onlinePINActivation.typetothePaymentTNXID();/*Type in the Payment TNX ID Input Field.*/
		//onlinePINActivation.typetothePriceUSD();/*Type in the Price USD Input Field.*/
		//onlinePINActivation.typetotheUsernameandPIN();/*Type in the Username/PIN Input Field.*/
		//onlinePINActivation.selectPaymentVia();/* Select Payment Via from the Drop Down in Payment Via Field */
		//onlinePINActivation.selectRatePlan();/* Select Rate Plan from the Drop Down in Rate Plan Field */
		//onlinePINActivation.typetotheRemarks();/*Type in the Remarks Input Field.*/
		//onlinePINActivation.clickVerifyandActivateButton();/*Click on the Verify and Activate Button.*/
		//try {Thread.sleep(4000);} catch (InterruptedException ie) {}
		//onlinePINActivation.clickPopUpYesButton();/*Click on the Pop Up Yes Button.*/
		//onlinePINActivation.clickPopUpNoButton();/*Click on the Pop Up No Button.*/
	}
	
	/* 03. Test Online PIN Migration from Old to New. */
	//@Test(priority=1)
	@Ignore
	public void TestOnlinePINMigrationForm() throws IOException, InterruptedException {
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password"));
		onlinePINMigration.openOnlinePINMigrationPage(); /*open the Online PIN Migration Page.*/
		onlinePINMigration.typeToNewPINandEmail(); /*1. Type in the New PIN / Email Input Field.*/
		onlinePINMigration.typeTopasswordforNewPINandEmail(); /*2. Type in the Password input Field for New PIN / Email Input Field.*/
		onlinePINMigration.typeToOldPINandEmail(); /*3. Type in the Old PIN / Email Input Field.*/
		onlinePINMigration.typeTopasswordforOldPINandEmail(); /*4. Type in the Password input Field for Old PIN / Email Input Field.*/
		onlinePINMigration.clickOnmigrationNowButton(); /*5. Click on the Migration Now Button.*/
		try {Thread.sleep(3000);} catch (InterruptedException ie) {}
		//onlinePINMigration.clickOnpopUpYesButton(); /*6. click on the Yes Button in the pop up alert form. */
		onlinePINMigration.clickPopUpNoButton();/*7. click on the Pop Up No Button.*/
	}
	
	/* 04. Test Add PIN Jail Bundle!!! */
	//@Test(priority=1)
	//@Ignore
	public void TestAddPINJailForm() throws IOException, InterruptedException {
		addPINJail = loginPage.addPINJailLogin(props.getProperty("username"),props.getProperty("password"));
		
		addPINJail.openAddPINJail();/*open the PIN Jail Bundle Page.*/
		//addPINJail.typeToPINorUsernames();/* 1.Highlight and Type in the PIN or Username Input Field.*/
		addPINJail.searchandtypeelementDropDownField();/* 2.Highlight and PIN Type in the PIN Type Drop down Field.*/
		//addPINJail.clickONSaveButton(); /*3. click on the save Button.*/
	}
	
	/* 05. Test Send Background/Silent Push to Single PIN!!! */
	//@Test(priority=1)
	@Ignore
	public void TestSendBackgroundorSilentPushtoSinglePINForm() throws IOException, InterruptedException {
		sendBackgroundorSilentPushtoSinglePIN = loginPage.sendBackgroundorSilentPushtoSinglePINLogin(props.getProperty("username"),props.getProperty("password"));
		
		sendBackgroundorSilentPushtoSinglePIN.openSendBackgroundorSilentPushtoSinglePINPage();
		//sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownAppNameField();/* Select App Name from the Drop Down in App Name Field */
		//sendBackgroundorSilentPushtoSinglePIN.searchandtypeelementDropDownPushTypeField();/* Select Push Type from the Drop Down in Push Type Field */
		sendBackgroundorSilentPushtoSinglePIN.typeInpininCSVInputField();/*Type in the PIN in CSV Input Field.*/
		sendBackgroundorSilentPushtoSinglePIN.clickONSaveButton();/*click on the save button.*/
		//try {Thread.sleep(4000);} catch (InterruptedException ie) {}
		//sendBackgroundorSilentPushtoSinglePIN.clickOnpopUpYesButton(); /* click on the Yes Button in the pop up alert form. */
		sendBackgroundorSilentPushtoSinglePIN.clickOnpopUpNoButton();/*click on the Pop Up No Button.*/
	}
	
	/* 06. Test Add New Reseller Client!!! */
	//@Test(priority=1)
	@Ignore
	public void TestAddNewResellerClientForm() throws IOException, InterruptedException {
		addNewResellerClient = loginPage.addNewResellerClientLogin(props.getProperty("username"),props.getProperty("password"));
		addNewResellerClient.openaddNewResellerForm();/*Open the Online PIN Migration Page.*/
		addNewResellerClient.typeToResellerNameInputField();/* 1.Highlight and Type in the Reseller Name Input Field.*/
		
		addNewResellerClient.typeTologinInputFieldElement();/* 2.Highlight and Type in the Reseller Login Input Field.*/
		
		addNewResellerClient.typeToPasswordInputFieldElement();/* 3.Highlight and Type in the Reseller Password Input Field.*/
		
		addNewResellerClient.typeToCreditLimitInputFieldElement();/* 4.Highlight and Type in the Reseller Credit Limit Input Field.*/
		
		addNewResellerClient.searchandtypeelementDropDownIPBundleField();/* 5.Highlight and Select IP Bundle in the Reseller IP Bundle Drop down Field.*/
		
		addNewResellerClient.searchandtypeelementDropDownIPBundle2Field();/* 6.Highlight and Select IP Bundle 2 in the Reseller IP Bundle Drop down Field.*/
		
		addNewResellerClient.ratePlaneelementDropDownField();/* 7.Highlight and Select Rate plan in the Reseller Rate plan Drop down Field.*/
		
		addNewResellerClient.pinResetOptioneelementDropDownField();/* 8.Highlight and Select PIN Reset Option in the Reseller PIN Reset Option Drop down Field.*/
		
		addNewResellerClient.resellerPanelTypeelementDropDownField();/* 9.Highlight and Select Reseller Panel Type Option in the Reseller Panel Type Drop down Field.*/
		
		addNewResellerClient.checkActiveInactiveCheckboxInputField();/* 10.Highlight and check un check Active / Inactive  Check box Input Field in the Active / Inactive  Check box Input Field.*/
		
		addNewResellerClient.appPINLoginelementDropDownField();/* 11.Highlight and Select  App PIN Login in the  App PIN Login Drop down Field.*/
		
		addNewResellerClient.typeToBrandNameInputFieldElement();/* 12.Highlight and Type in the Brand Name Input Field.*/
		
		addNewResellerClient.typeToBrandPINPrefixInputFieldElement();/* 13.Highlight and Type in the Brand PIN Prefix Input Field.*/
		
		addNewResellerClient.typeToAllowAppsInputFieldElement();/* 14.Highlight and Type in the Allow Apps Input Field.*/
		
		addNewResellerClient.isCustomizePanelelementDropDownField();/* 15.Highlight and Select  App PIN Login in the  Is Customize Panel Drop down Field.*/
		
		addNewResellerClient.typeToIsCustomizePanelPanelNameFieldElement();/* 16.Highlight and Type in the Brand Name Input Field.*/
		
		addNewResellerClient.hasLimitofPINelementDropDownField();/* 17.Highlight and Select  Has Limit of PIN? in the  Has Limit of PIN? Drop down Field.*/
		
		addNewResellerClient.typeToPinLimitInputFieldElement();/* 18.Highlight and Type in the Pin Limit Input Field.*/
		
		addNewResellerClient.onlyTypeelementDropDownField();/* 19.Highlight and Select  Only Type in the Only Type Drop down Field.*/
		
		addNewResellerClient.mainResellerTypeelementDropDownField();/* 20.Highlight and Select   Main Reseller Type in the Only Type Drop down Field.*/
		Thread.sleep(2000);
		addNewResellerClient.numberOfDevicesInputFieldElement();/* 21.Highlight and Type in the Number Of Devices Input Field.*/
		
		addNewResellerClient.resellerLimitInputFieldElement();/* 22.Highlight and Type in the Reseller Limit Input Field.*/
		
		addNewResellerClient.balanceLimitInputFieldElement();/* 23.Highlight and Type in the Balance Limit Input Field.*/
		
		addNewResellerClient.emailInputFieldElement();/* 24.Highlight and Type in the Email Input Field.*/
		
		addNewResellerClient.phoneNoInputFieldElement();/* 25.Highlight and Type in the Phone No. Input Field.*/
		
		addNewResellerClient.cityInputFieldElement();/* 26.Highlight and Type in the City Input Field.*/
		
		addNewResellerClient.countryTypeDropDownFieldHighlight();/* 27.Highlight and Select Country Type in the Country Drop down Field.*/
		
		addNewResellerClient.stateInputFieldElement();/* 28.Highlight and Type in the State Input Field.*/
		
		addNewResellerClient.addressInputFieldElement();/* 29.Highlight and Type in the Address Input Field.*/
		
		addNewResellerClient.isTVResellerelementDropDownField();/* 30.Highlight and Select Is TV Reseller in the Is TV Reseller Drop down Field.*/
		
		addNewResellerClient.creditLimitInputFieldElement();/* 31.Highlight and Type in the TV Credit Limit Input Field.*/
		
		addNewResellerClient.showAppBannerelementDropDownField();/* 32.Highlight and Select Show App Banner in the Show App Banner Drop down Field.*/
		
		addNewResellerClient.showFullScreenelementDropDownField();/* 33.Highlight and Select Show Full Screen in the Show Full Screen Drop down Field.*/
		
		addNewResellerClient.lowBALNotifyEmailelementDropDownField();/* 34.Highlight and Select Low BAL Notify Email in the Low BAL Notify Email Drop down Field.*/
		
		addNewResellerClient.assignPremiumLockedBundleelementDropDownField();/* 35.Highlight and Select Assign Premium Locked Bundle in the Assign Premium Locked Bundle Drop down Field.*/
		
		//addNewResellerClient.submitButton();/* 36.Highlight and Click on the Submit */
	}
	
	/* 07. Test Custom Panel Name!!! */
	//@Test(priority=1)
	@Ignore
	public void TestCustoPanelNameForm() throws IOException, InterruptedException {
		newCustomizeResellerPanel = loginPage.customPanelNameLogin(props.getProperty("username"),props.getProperty("password"));
		
		newCustomizeResellerPanel.openNewCustomizeResellerPanelPage();/*open the Custom Panel Name Page.*/
		//newCustomizeResellerPanel.typeToCustomPanelName();/*Type in the Custom Panel Name Input Field.*/
		//newCustomizeResellerPanel.searchandtypeelementDropDownField();/*Type in the PIN Type Drop Down Field.*/
		//newCustomizeResellerPanel.typeONHostServer();/*Type in the Host Server Input Field.*/
		//newCustomizeResellerPanel.typeONBrandName();/* click on Submit Button */
		newCustomizeResellerPanel.clickONSubmitButton();/* click on the Submit Button */
		
	}
	
	/* ***** Test _Blank!!! 
	//@Test(priority=1)
	//@Ignore
	public void TestAddNewServerBlankForm() throws IOException, InterruptedException {
		newCustomizeResellerPanel = loginPage.customPanelNameLogin(props.getProperty("username"),props.getProperty("password"));
		newCustomizeResellerPanel.openNewCustomizeResellerPanelPage();/*open the Custom Panel Name Page.
		
	}*/
	
	/****** Test Add New Server!!! */
	//@Test(priority=1)
	@Ignore
	public void TestAddNewServerForm() throws IOException, InterruptedException {
		serverModuleElement = loginPage.addNewServerLogin(props.getProperty("username"),props.getProperty("password"));
		serverModuleElement.openAddNewServerPage();/*open the Add New Server Page.*/
		//serverModuleElement.typeToserverNameInputField();/*1. Type to the Server Name Input Field.*/
		//serverModuleElement.typeToipInputField();/*2. Type to the IP Input Field.*/
		//serverModuleElement.typeToipRangeInputField();/*3. Type to the IP Range Input Field.*/
		//serverModuleElement.typeTopathInputField();/*4. Type to the Path Input Field.*/
		//serverModuleElement.capacityTopathInputField();/*5. Type to the Capacity Input Field.*/
		//serverModuleElement.countrySelectField();/*6. Select Country to the Country Select Drop Down Field.*/
		//serverModuleElement.typeToCityInputField();/*7. Type to the City Input Field.*/
		//serverModuleElement.typeToOrderPriorityInputField();/*8. Type to the Order Priority Input Field.*/
		//serverModuleElement.typeToServerPriceInputFieldElementInputField();/*9. Type to the Server Price Input Field.*/
		serverModuleElement.clickToUploadWireGuardConfigCheckboxField();/*Click to the Upload WireGuard Config? Checkbox Field.*/
		//serverModuleElement.wireGurdFilePriorityInputField();/*Input File Location to the Wireguard File Input Field.*/
		//serverModuleElement.clickTIsActiveCheckboxField();/*click to theIs Active Checkbox Field.*/
		//serverModuleElement.clickTOpenVPNCheckboxField();/*click to the OpenVPN Checkbox Field.*/
		//serverModuleElement.anyconnectInputField();/*click to the AnyConnect Checkbox Field.*/
		//serverModuleElement.shadowsockInputField();/*click to the AnyConnect Checkbox Field.*/
		//serverModuleElement.SSHInputField();/*click to the SSH Checkbox Field.*/
		//serverModuleElement.typeToWireGuardInputField();/*click to the WireGuard Checkbox Field.*/
		serverModuleElement.clickToIsFreeCheckboxInputField();/*click to the Is Free Checkbox Input Field.*/
	}

	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
