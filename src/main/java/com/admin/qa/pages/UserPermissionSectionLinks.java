package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class UserPermissionSectionLinks extends TestBase{
	
	public UserPermissionSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Reseller Panel List Link
	public UserPermissionSectionLinks openRolesLink() {
		driver.get(props.getProperty("url")+"MenuPermission/roles");
		return new UserPermissionSectionLinks();
	}
	
	//02. Open URL of Add New Reseller Panel Link
	public UserPermissionSectionLinks openMenusLinks() {
		driver.get(props.getProperty("url")+"MenuPermission/menus");
		return new UserPermissionSectionLinks();
	}
	
	//XPath of Page Title of Menu List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleResellerPanelList;
	
	//Get Text Title of Menu List
	public String getTextfromMenuList() {
		String text = titleResellerPanelList.getText();
		return text;
	}
	
	//XPath of Page Title of Roles List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleAddNewResellerPanel;
	
	//Get Text Title of Roles List
	public String getTextfromRolesList() {
		String text = titleAddNewResellerPanel.getText();
		return text;
	}
	
	//03. Open URL of RoleMenuPermissions Link
	public UserPermissionSectionLinks openRoleMenuPermissionsLinks() {
		driver.get(props.getProperty("url")+"MenuPermission/RoleMenuPermissions");
		return new UserPermissionSectionLinks();
	}
	
	//XPath of Page Title of RoleMenuPermissions List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleRoleMenuPermissionsList;
	
	//Get Text Title of RoleMenuPermissions List
	public String getTextfromRoleMenuPermissionsList() {
		String text = titleRoleMenuPermissionsList.getText();
		return text;
	}
	
	//04. Open URL of User List Link
	public UserPermissionSectionLinks openRoleUserListLinks() {
		driver.get(props.getProperty("url")+"MenuPermission/userList");
		return new UserPermissionSectionLinks();
	}
	
	//XPath of Page Title of User List List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleRoleUserList;
	
	//Get Text Title of User List List
	public String getTextfromUserList() {
		String text = titleRoleUserList.getText();
		return text;
	}
	
	//05. Open URL of User Menu Permissions List Link
	public UserPermissionSectionLinks openUserMenuPermissionsListLinks() {
		driver.get(props.getProperty("url")+"MenuPermission/UserMenuPermissions");
		return new UserPermissionSectionLinks();
	}
	
	//XPath of Page Title of User Menu Permissions List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleRoleUserMenuPermissionsList;
	
	//Get Text Title of User Menu Permissions List
	public String getTextfromUserMenuPermissionsList() {
		String text = titleRoleUserMenuPermissionsList.getText();
		return text;
	}
	
	//06. Open URL of role users List Link
	public UserPermissionSectionLinks openRoleUsersListLinks() {
		driver.get(props.getProperty("url")+"MenuPermission/role_users");
		return new UserPermissionSectionLinks();
	}
	
	//XPath of Page Title of Role Users List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleRoleUsersList;
	
	//Get Text Title of Role Users List
	public String getTextfromRoleUsersList() {
		String text = titleRoleUsersList.getText();
		return text;
	}
}
