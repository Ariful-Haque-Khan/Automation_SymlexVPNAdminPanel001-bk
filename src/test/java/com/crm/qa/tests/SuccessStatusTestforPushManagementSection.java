/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.crm.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.admin.qa.pages.PushManagementSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforPushManagementSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	PushManagementSectionLinks pushManagementSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforPushManagementSection() {
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
	public void TestRoleListLink() throws IOException {
		pushManagementSectionLinks = loginPage.loginPushManagementSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pushManagementSectionLinks.openPushListLink();
		
		String title;
		title = pushManagementSectionLinks.getTextfromMenuList();
	    Assert.assertEquals(title, "Applications List");
	}
	
	/* 02. Check Automated Push List is okay and return http status 200! */
	@Test(priority=2)
	public void TestMenusListLink() throws IOException {
		pushManagementSectionLinks = loginPage.loginPushManagementSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		pushManagementSectionLinks.openAutomatedPushListLinks();
		String title;
		title = pushManagementSectionLinks.getAutomatedPushList();
	    Assert.assertEquals(title, "Menu List");
	}
	
	/* 03. Check RoleMenuPermissions Links List is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestSendPushFormListLink() throws IOException {
		pushManagementSectionLinks = loginPage.loginPushManagementSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		pushManagementSectionLinks.openSendPushFormLinks();
		String title;
		title = pushManagementSectionLinks.getTextfromSendPushListList();
	    Assert.assertEquals(title, "Send Push to user");
	}
	
	/* 04. Check Pending Push List is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestPendingPushListLink() throws IOException {
		pushManagementSectionLinks = loginPage.loginPushManagementSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		pushManagementSectionLinks.openPendingPushListLinks();
		String title;
		title = pushManagementSectionLinks.getTextfromPendingPushList();
	    Assert.assertEquals(title, "Pending Push Request");
	}
	
	/* 05. Check Push Template List Links List is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestPushTemplateListLink() throws IOException {
		pushManagementSectionLinks = loginPage.loginPushManagementSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		pushManagementSectionLinks.openPushTemplateListLinks();
		String title;
		title = pushManagementSectionLinks.getTextfromTemplateListsLink();
	    Assert.assertEquals(title, "Push Template List");
	}
	
	/* 06. Check Latest News List Links List is okay and return http status 200! */
	@Ignore
	@Test(priority=2)
	public void TestLatestNewListLink() throws IOException {
		pushManagementSectionLinks = loginPage.loginPushManagementSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		pushManagementSectionLinks.openLatestNewsListLinks();
		String title;
		title = pushManagementSectionLinks.getTextfromLatestNewsList();
	    Assert.assertEquals(title, "News for Resellers");
	}
	
	/* 07. Check Notice For User Link List is okay and return http status 200! */
	
	@Test(priority=2)
	public void TestNoticeForUserListLink() throws IOException {
		pushManagementSectionLinks = loginPage.loginPushManagementSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		pushManagementSectionLinks.openNoticeForUserListLinks();
		String title;
		title = pushManagementSectionLinks.getTextfromNoticeForUserList();
	    Assert.assertEquals(title, "Notice List");
	}
	
	@AfterMethod
	public void tearDown() {
		super.tearDown();	
	}
	

}
