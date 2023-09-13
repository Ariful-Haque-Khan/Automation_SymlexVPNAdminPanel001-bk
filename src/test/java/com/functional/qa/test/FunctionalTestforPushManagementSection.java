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

import com.admin.qa.function.AddNewBanner;
import com.admin.qa.function.AddNewNotice;
import com.admin.qa.function.AddPushTemplate;
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
	AddPushTemplate addPushTemplate;
	AddNewNotice addNewNotice;
	AddNewBanner addNewBanner;
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
	//@Test(priority=1)
	@Ignore
	public void TestSendPushtoUserForm() throws IOException, InterruptedException {
		sendPushtoUser = loginPage.sendPushtoUserLogin(props.getProperty("username"),props.getProperty("password"));
		sendPushtoUser.openSendPushtoUserPage();/*0.. open the Send Push to User Page. */
		sendPushtoUser.selectDatafromAppNameDropDownElement();/*1.. select data from App name Field */
		//sendPushtoUser.sendToDropdownField();/*2.. select data from App name Field */
		//sendPushtoUser.datafromWithChildDropDownElement();/*3.. check from With Child checkbox Field */
		sendPushtoUser.datafromPINWithCommaSeparatedInputboxElement();/*4.. type data to PIN with comma separated Input Box Field */
		//sendPushtoUser.selectDatafromSelectResellerDropDownElement();/*5.. select data from Select reseller Field */
		//sendPushtoUser.datafromPINStatusCheckboxElement();/*6.. check data from Active Checkbox Field */
		//sendPushtoUser.datafromPINStatusInactiveCheckboxElement();/*7.. check data from InActive Checkbox Field */
		//sendPushtoUser.datafromPINStatusExpiredCheckboxElement();/*8.. check data from Expired Checkbox Field */
		//sendPushtoUser.selectDatafromPaymentMethodDropDownElement();/*9.. select data from Payment Method Field */
		//sendPushtoUser.selectDatafromCountryFilterDropDownElement();/*10.. select data from Country Filter Drop Down Field */
		//sendPushtoUser.selectDatafromCountryDropDownElement();/*11. Select data from Country eviceDrop Down Field */
		//sendPushtoUser.selectDatafromTargetDeviceDropDownElement();/*12. Select data from Target Device Drop Down Field */
		//sendPushtoUser.dateFilterColumnDropdownField();/*13.. select data from Filter Column element. */
		//sendPushtoUser.dateFilterConditionDropdownField();/*14.. select data from date Filter Condition element. */
		//sendPushtoUser.dateFilterConditionStartDropdownField();/*15.. type to the date Filter Conditionar Start element */
		//sendPushtoUser.dateFilterConditionEndDropdownField();/*16.. type to the date Filter Conditionar End element */
		//sendPushtoUser.selectDatafromCopyTemplateDropDownElement();/*17.. select data from Copy Template Drop down Input Field */
		sendPushtoUser.titleInputFieldField();/*18.. type to the Push Title element */
		sendPushtoUser.messageInputFieldField();/*19.. type to the Push Message element */
		//sendPushtoUser.imageURLInputFieldField();/*20.. type to the Push Image URL element */
		//sendPushtoUser.urlforAndroidInputFieldField();/*21.. type to the Push url for Android element */
		//sendPushtoUser.urlforiOSInputFieldField();/*22.. type to the Push URL for iOS element */
		//sendPushtoUser.pageControInputFieldField();/*23.. type to the Push Page Control element */
		//sendPushtoUser.saveasTemplateInputFieldField();/*24.. click to the Save as Template element */
		//sendPushtoUser.clickOnclearButtonField();/*25.. click to the Clear Button */
		//sendPushtoUser.clickOndisplayTotalUserButtonField();/*26.. click to the Display Total User Button */
		sendPushtoUser.clickOnSendNowButtonField();/*27.. click to the Send Now Button */
		sendPushtoUser.clickOnPopUpYesButtonField();/*28.. click to the Pop Up Yes Button */
		sendPushtoUser.clickOnPopUpNoButtonField();/*29.. click to the Pop Up No Button */
	}
	
	/****** Test Add Push Template Form  *****/
	//@Test(priority=1)
	@Ignore
	public void TestAddPushTemplateForm() throws IOException, InterruptedException {
		addPushTemplate = loginPage.addPushTemplateLogin(props.getProperty("username"),props.getProperty("password"));
		addPushTemplate.openAddPushTemplatePage();/*open the Custom Panel Name Page. */
		//addPushTemplate.typeTotemplateNameInputField();/*1.. type data to Template Name Input Box Field */
		//addPushTemplate.selectDatafromAppNameDropDownElement();/*2.. select data from APP Name element. */
		//addPushTemplate.typeTotemplateTitleInputField();/*3.. type data to Push Title Input Box Field */
		//addPushTemplate.typeTotemplateMessageInputField();/*4.. type data to Push Message Input Box Field */
		//addPushTemplate.typeTotemplateImageURLInputField();/*5.. type data to Push Image URL Input Box Field */
		//addPushTemplate.typeTotemplateURLforAndroidInputField();/*6.. type data to Push URL for Android Input Box Field */
		//addPushTemplate.typeTotemplateURLforiOSInputField();/*7.. type data to Push URL for iOS Input Box Field */
		addPushTemplate.typeTotemplatePageControlInputField();/*8.. type data to Push URL for Page Control Input Box Field */
		addPushTemplate.typeTotemplateActiveDeactiveStatusInputField();/*9.. click to the Active/Deactive Status */
		addPushTemplate.typeTotemplateSaveButtonField();/*10.. click to the Active/Deactive Status */
	}
	
	/****** Test Add New Notice Form  *****/ 
	//@Test(priority=1)
	@Ignore
	public void TestAddNewServerBlankForm() throws IOException, InterruptedException {
		addNewNotice = loginPage.addNewNoticeLogin(props.getProperty("username"),props.getProperty("password"));
		addNewNotice.openAddNewNoticePage();/* open the Add New Notice Page. */
		//addNewNotice.selectDatafromNoticeTypeDropDownElement();/*1.. select data from Notice Type element. */
		//addNewNotice.selectDataFromsuserTypeDropdownField();/*2.. select data from Notice Type element. */
		addNewNotice.selectDataFromsOperationTypeDropdownField();/*3.. select data from Operation Type element. */
		//addNewNotice.timePeriodFromInputField();/*4.. type data Time Period From element. */
		//addNewNotice.timePeriodToInputField();/*5.. type data Time Period To element. */
		//addNewNotice.selectDatafromPageControlDropDownElement();/*6.. select data from Page Control element. */
		//addNewNotice.noticeMessageInputField();/*7.. type data to Notice Message Input Box Field */
		//addNewNotice.pushMessageInputField();/*8.. type data to push Message Input Box Field */
		//addNewNotice.pushRemarksInputField();/*9.. type data to push remarks Input Box Field */
		addNewNotice.activeInactiveStatusInputField();/*10.. Click on data to Active/Inactive Status  Chaeck box Input Box Field */
		addNewNotice.submitButtonInputField();/*10.. Click on data to Submit Button */
	}
	
	/****** Test Add New Banner   !!! */ 
	@Test(priority=1)
	//@Ignore
	public void TestAddNewBannerForm() throws IOException, InterruptedException {
		addNewBanner = loginPage.addNewBannerLogin(props.getProperty("username"),props.getProperty("password"));
		addNewBanner.openAddNewBannerFormPage();/*open the Add New Banner Page. */
		addNewBanner.typeToBannerName();/*1.. type data to banner name element. */
		addNewBanner.typeToAppHomeBannerAndroidElement();/*2.. type data to App Home Banner Android Element. */
		addNewBanner.typeToOnclickURLElement();/*2.. type data to Onclick URL Element. */
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
