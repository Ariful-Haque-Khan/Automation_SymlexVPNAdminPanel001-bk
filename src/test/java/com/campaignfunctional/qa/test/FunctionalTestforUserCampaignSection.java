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

import com.admin.qa.CampaignForm.AddNewAdminPanel;
import com.admin.qa.CampaignForm.AddNewCampaign;
import com.admin.qa.CampaignForm.AddNewPaymentGateway;
import com.admin.qa.CampaignForm.AddNewRatePlan;
import com.admin.qa.CampaignForm.ProfileInformation;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class FunctionalTestforUserCampaignSection extends TestBase{
	
	
	LoginPage loginPage;
	AddNewCampaign addNewCampaign;
	AddNewPaymentGateway addNewPaymentGateway;
	AddNewRatePlan addNewRatePlan;
	ProfileInformation profileInformation;
	AddNewAdminPanel addNewAdminPanel;

	TestUtils testUtils;
	
	//Initializing PageFactory
	public FunctionalTestforUserCampaignSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	
	/* Test Apps Dynamic Menu Management   !!! */ 
	//@Test(priority=1)
	//@Ignore
	public void TestAddNewServerBlankForm() throws IOException, InterruptedException {
		addNewCampaign = loginPage.addNewCampaignLogin(props.getProperty("username"),props.getProperty("password"));
		addNewCampaign.openAddNewCampaignPage();/*open the Tested Page. */
		//addNewCampaign.typeToCampaignNameInputTextField();/* 1.. type to Campaign Name Input Text Element */
		//addNewCampaign.typeToCouponCodeInputTextField();/* 2.. type to Coupon Code Input Text Element */
		//addNewCampaign.affiliateShareShareInputTextField();/* 3.. type to Affiliate Share Input Text Element */
		//addNewCampaign.typeFromCampaignPeriodFromInputTextField();/* 4.. type to Campaign Period From Input Text Element */
		//addNewCampaign.typeFromCampaignPeriodToInputTextField();/* 5.. type to Campaign Period To Input Text Element */
		//addNewCampaign.statusDropdownField();/* 6.. select from Status Dropdown Field Element */
		addNewCampaign.typeToRemarksInputTextField();/* 7.. type to Remarks Input Text Element */
		addNewCampaign.clickOnSaveNowButtonField();/* 8.. click on Remarks Save Now Button Element */
	}
	
	/* Test Add New Payment Gateway form page */ 
	//@Test(priority=1)
	@Ignore
	public void TestAddNewPaymentGatewayForm() throws IOException, InterruptedException {
		addNewPaymentGateway = loginPage.addNewPaymentGatewayLogin(props.getProperty("username"),props.getProperty("password"));
		addNewPaymentGateway.openAddNewPaymentGatewayPage();/*open the Add New Payment Gateway Page. */
		//addNewPaymentGateway.selectDatafromAppNameDropDownElement();/* 1.. select from Gateway Type Field Element */
		//addNewPaymentGateway.typeToGatewayORBankInputTextField();/* 2.. type to Gateway/Bank Input Text Element */
		//addNewPaymentGateway.checkStatusInputCheckBoxField();/* 3.. click on Status Input CheckBoxs Element */
		addNewPaymentGateway.clickOnSubmitButtonField();/* 4.. click on Remarks Save Now Button Element */
	}
	
	/* Test Add New Rate Plan form page */ 
	//@Test(priority=1)
	@Ignore
	public void TestAddNewRatePlanForm() throws IOException, InterruptedException {
		addNewRatePlan = loginPage.addNewRatePlanLogin(props.getProperty("username"),props.getProperty("password"));
		addNewRatePlan.openAddNewRatePlanPage();/*open the Add New Payment Gateway Page. */
		addNewRatePlan.selectDatafromAppNameDropDownElement();/* 1.. select from Gateway Type Field Element */
		addNewRatePlan.typeToDescriptionInputTextField();/* 2.. type to description Input Text Element */
		addNewRatePlan.checkStatusInputCheckBoxField();/* 3.. click on Status Input CheckBoxs Element */
		addNewRatePlan.clickOnSubmitButtonField();/* 4.. click on Remarks Save Now Button Element */
	}
	
	/* ***** Test Profile Information form Page!!! */
	//@Test(priority=1)
	@Ignore
	public void TestProfileInformationForm() throws IOException, InterruptedException {
		profileInformation = loginPage.profileInformationLogin(props.getProperty("username"),props.getProperty("password"));
		profileInformation.openProfileInformationPage();/*open the Custom Panel Name Page.*/
		//profileInformation.typeToBillingName();/* 1.. type to Billing Name Input Text Element */
		//profileInformation.typeToPhoneNoDays();/* 2.. type to Phone No Input Text Element */
		//profileInformation.typeEmail();/* 3.. type to Email Input Text Element */
		//profileInformation.typeinSkypeInputTextField();/* 4.. type to Skype Input Text Element */
		//profileInformation.typeinviberWhatsAppImoElementInputTextField();/* 5.. type to Viber/WhatsApp/Imo Input Text Element */
		//profileInformation.typeinAddressElementInputTextField();/* 6.. type to Address Input Text Element */
		//profileInformation.clickOnFeaturesStatusInputCheckboxField();/* 7.. type to Billing Name Color Input Text Element */
		//profileInformation.typeOnLogoInputImageField();/* 8.. type to Email Input Text Element */
		profileInformation.clickOnsaveProfileButtonField();/* 9.. type to Email Input Text Element */
	}
	
	/* ***** Test New Admin Creation form Page!!! */
	@Test(priority=1)
	//@Ignore
	public void TestNewAdminCreationkForm() throws IOException, InterruptedException {
		addNewAdminPanel = loginPage.addNewAdminPanelLogin(props.getProperty("username"),props.getProperty("password"));
		addNewAdminPanel.openAddNewAdminPanelPage();/*open the New Admin Creation Page. */
		//addNewAdminPanel.typeToClientNameInputTextField();/* 1.. type to Client Name Input Text Element */
		//addNewAdminPanel.typeToBrandNameInputTextField();/* 2.. type to Brand Name Input Text Element */
		//addNewAdminPanel.typeToPanelNameInputTextField();/* 3.. type to Panel Name Input Text Element */
		//addNewAdminPanel.typeToPanelPathInputTextField();/* 4.. type to Panel Path Input Text Element */
		//addNewAdminPanel.typeToLoginNameInputTextField();/* 5.. type to Login Name Input Text Element */
		//addNewAdminPanel.typeToLoginPasswordInputTextField();/* 6.. type to Login Password Input Text Element */
		//addNewAdminPanel.checkToIsSinglePinInputCheckboxField();/* 7.. check to Is Single Pin Input checkbox Element */
		addNewAdminPanel.checkToSaveButtonField();/* 8.. click to Save Button Input Element */
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
