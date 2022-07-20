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

import com.admin.qa.pages.MailAddressSectionLinks;
import com.admin.qa.pages.RateSectionLinks;
import com.admin.qa.pages.ResellerPanelSectionLinks;
import com.admin.qa.pages.ResellerSectionLinks;
import com.admin.qa.pages.UserPermissionSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class SuccessStatusTestforUserPermissionSection extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	UserPermissionSectionLinks userPermissionSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforUserPermissionSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Roles List is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestRoleListLink() throws IOException {
		userPermissionSectionLinks = loginPage.loginUserPermissionSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		userPermissionSectionLinks.openRolesLink();
		
		String title;
		title = userPermissionSectionLinks.getTextfromRolesList();
	    Assert.assertEquals(title, "Role List");
	}
	
	/* 02. Check Menu List is okay and return http status 200! */
	@Ignore
	@Test(priority=2)
	public void TestMenusListLink() throws IOException {
		userPermissionSectionLinks = loginPage.loginUserPermissionSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		userPermissionSectionLinks.openMenusLinks();
		String title;
		title = userPermissionSectionLinks.getTextfromMenuList();
	    Assert.assertEquals(title, "Menu List");
	}
	
	/* 03. Check RoleMenuPermissions Links List is okay and return http status 200! */
	@Ignore
	@Test(priority=2)
	public void TestRoleMenuPermissionsListLink() throws IOException {
		userPermissionSectionLinks = loginPage.loginUserPermissionSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		userPermissionSectionLinks.openRoleMenuPermissionsLinks();
		String title;
		title = userPermissionSectionLinks.getTextfromRoleMenuPermissionsList();
	    Assert.assertEquals(title, "Role Menu Permission List");
	}
	
	/* 04. Check User Menu Permissions List is okay and return http status 200! */
	@Ignore
	@Test(priority=2)
	public void TestUserMenuPermissionsListLink() throws IOException {
		userPermissionSectionLinks = loginPage.loginUserPermissionSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		userPermissionSectionLinks.openRoleUserListLinks();
		String title;
		title = userPermissionSectionLinks.getTextfromUserList();
	    Assert.assertEquals(title, "Admin Users");
	}
	
	/* 05. Check User List Links List is okay and return http status 200! */
	@Ignore
	@Test(priority=2)
	public void TestUserListLink() throws IOException {
		userPermissionSectionLinks = loginPage.loginUserPermissionSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		userPermissionSectionLinks.openUserMenuPermissionsListLinks();
		String title;
		title = userPermissionSectionLinks.getTextfromUserMenuPermissionsList();
	    Assert.assertEquals(title, "User Menu Permission List");
	}
	
	/* 06. Check User List Links List is okay and return http status 200! */
	@Ignore
	@Test(priority=2)
	public void TestRoleUsersListLink() throws IOException {
		userPermissionSectionLinks = loginPage.loginUserPermissionSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		userPermissionSectionLinks.openRoleUsersListLinks();
		String title;
		title = userPermissionSectionLinks.getTextfromRoleUsersList();
	    Assert.assertEquals(title, "Role Users List");
	}
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
