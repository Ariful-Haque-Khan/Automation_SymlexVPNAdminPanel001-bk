package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PushManagementSectionLinks extends TestBase{
	
	public PushManagementSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Push List Link
	public PushManagementSectionLinks openPushListLink() {
		driver.get(props.getProperty("url")+"push/index");
		return new PushManagementSectionLinks();
	}
	
	//XPath of Push List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleResellerPanelList;
	
	//Get Text Title of Menu List
	public String getTextfromMenuList() {
		String text = titleResellerPanelList.getText();
		return text;
	}
	
	//02. Open URL of Automated Push List Panel Link
	public PushManagementSectionLinks openAutomatedPushListLinks() {
		driver.get(props.getProperty("url")+"push/automatedPushList");
		return new PushManagementSectionLinks();
	}
	
	//XPath of Page Automated Push List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleAutomatedPush;
	
	//Get Text Title of Roles List
	public String getAutomatedPushList() {
		String text = titleAutomatedPush.getText();
		return text;
	}

	
	//03. Open URL of Send Push Form Link
	public PushManagementSectionLinks openSendPushFormLinks() {
		driver.get(props.getProperty("url")+"push/sendPushForm");
		return new PushManagementSectionLinks();
	}
	
	//XPath of Page Title of RoleMenuPermissions List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleSendPushList;
	
	//Get Text Title of RoleMenuPermissions List
	public String getTextfromSendPushListList() {
		String text = titleSendPushList.getText();
		return text;
	}
	
	//04. Open URL of Pending Push List Link
	public PushManagementSectionLinks openPendingPushListLinks() {
		driver.get(props.getProperty("url")+"push/pendingPushList");
		return new PushManagementSectionLinks();
	}
	
	//XPath of Page Title of Pending Push List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titlePendingPushList;
	
	//Get Text Title of Pending Push List
	public String getTextfromPendingPushList() {
		String text = titlePendingPushList.getText();
		return text;
	}
	
	//05. Open URL of Push Template Lists Link
	public PushManagementSectionLinks openPushTemplateListLinks() {
		driver.get(props.getProperty("url")+"push/pushTemplateList");
		return new PushManagementSectionLinks();
	}
	
	//XPath of Page Title of User Menu Permissions List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleTemplateListsLinksList;
	
	//Get Text Title of User Menu Permissions List
	public String getTextfromTemplateListsLink() {
		String text = titleTemplateListsLinksList.getText();
		return text;
	}
	
	//06. Open URL of Latest News List Link
	public PushManagementSectionLinks openLatestNewsListLinks() {
		driver.get(props.getProperty("url")+"push/latest_news");
		return new PushManagementSectionLinks();
	}
	
	//XPath of Page Title of Latest News List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div/h1")
	WebElement titleLatestNewsList;
	
	//Get Text Title of Role Users List
	public String getTextfromLatestNewsList() {
		String text = titleLatestNewsList.getText();
		return text;
	}
	
	//07. Open URL of Notice For User List Link
	public PushManagementSectionLinks openNoticeForUserListLinks() {
		driver.get(props.getProperty("url")+"push/noticeForUserList");
		return new PushManagementSectionLinks();
	}
	
	//XPath of Page Title of Notice For User List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleNoticeForUserList;
	
	//Get Text Title of Notice For User List
	public String getTextfromNoticeForUserList() {
		String text = titleNoticeForUserList.getText();
		return text;
	}
}
