/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.functional.qa.test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddPINValidity;
import com.admin.qa.function.OnlinePINActivation;
import com.admin.qa.function.OnlinePINMigration;
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
	OnlinePINActivation onlinePINActivation;
	OnlinePINMigration onlinePINMigration;
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
	@Ignore
	public void TestAddPINValidityForm() throws IOException, InterruptedException {
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password"));
		
		addPINValidity.openEmailListReport();
		addPINValidity.typeToNumberofDays();
		//addPINValidity.typeelementDropDownField();
		addPINValidity.typeToPINinCSVorNewLine();
		addPINValidity.clickOnSubmitButton();
		
	}
	
	/* 02. Test active a PIN by providing the payment Information. */
	@Ignore
	public void TestOnlinePINActivationForm() throws IOException, InterruptedException {
		onlinePINActivation = loginPage.onlinePINActivationLogin(props.getProperty("username"),props.getProperty("password"));
		onlinePINActivation.openOnlinePINActivationPage(); /*open the Online PIN Activation 2 Page.*/
		onlinePINActivation.typetothePaymentTNXID();/*Type in the Payment TNX ID Input Field.*/
		onlinePINActivation.typetothePriceUSD();/*Type in the Price USD Input Field.*/
		onlinePINActivation.typetotheUsernameandPIN();/*Type in the Username/PIN Input Field.*/
		onlinePINActivation.clickVerifyandActivateButton();/*Click on the Verify and Activate Button.*/
		//onlinePINActivation.clickPopUpYesButton();/*Click on the Pop Up Yes Button.*/
	}
	
	/* 03. Test Online PIN Migration from Old to New. */
	@Test(priority=1)
	public void TestOnlinePINMigrationForm() throws IOException, InterruptedException {
		onlinePINMigration = loginPage.onlinePINMigrationLogin(props.getProperty("username"),props.getProperty("password"));
		onlinePINMigration.openOnlinePINMigrationPage(); /*open the Online PIN Migration Page.*/
		onlinePINMigration.typeToNewPINandEmail(); /*Type in the New PIN / Email Input Field.*/
		onlinePINMigration.typeTopasswordforNewPINandEmail(); /*Type in the Password for New PIN / Email Input Field.*/
		onlinePINMigration.typeToOldPINandEmail(); /*Type in the Old PIN / Email Input Field.*/
		onlinePINMigration.typeTopasswordforOldPINandEmail(); /*Type in the Password for Old PIN / Email Input Field.*/
		onlinePINMigration.clickOnmigrationNowButton(); /*Click on the Migration Now Button.*/
		try {Thread.sleep(7000);} catch (InterruptedException ie) {}
		onlinePINMigration.clickOnpopUpYesButton(); /*Click on the Migration Now Button.*/
		
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
