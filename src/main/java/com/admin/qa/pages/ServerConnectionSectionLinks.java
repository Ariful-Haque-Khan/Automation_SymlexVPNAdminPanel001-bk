package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ServerConnectionSectionLinks extends TestBase{
	
	
	//1. Server Connection Drop Down
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement serverConnectionDropdown;
	
	//2. Hourly Server Connection
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement hourlyServerConnectionPageLink;
	
	//3. Hourly Max Connetions
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement hourlyMaxConnetionsPageLink;
	
	//4. Server Connection
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement serverConnectionPageLink;
	
	//5. User Session Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement userSessionReportPageLink;
	
	//6. User Session Dtls Report
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement userSessionDtlsReportPageLink;
	
	
	public ServerConnectionSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Server Connection Drop Down
	public ServerConnectionSectionLinks clickOnIPManagementDropDownLink() {
		serverConnectionDropdown.click();
		return new ServerConnectionSectionLinks();
	}
	//02. Click on Hourly Server Connection page Link
	public ServerConnectionSectionLinks clickOnIPListLink() {
		hourlyServerConnectionPageLink.click();
		return new ServerConnectionSectionLinks();
	}
	
	//03. Click on Hourly Max Connetions page Link
	public ServerConnectionSectionLinks clickOnIPBundleLink() {
		hourlyMaxConnetionsPageLink.click();
		return new ServerConnectionSectionLinks();
	}
	
	//04. Click on Server Connection page Link
	public ServerConnectionSectionLinks clickOnAssigntoBatchLink() {
		serverConnectionPageLink.click();
		return new ServerConnectionSectionLinks();
	}
	//05. Click on User Session Report page Link
	public ServerConnectionSectionLinks clickOnNewBlockRecordLink() {
		userSessionReportPageLink.click();
		return new ServerConnectionSectionLinks();
	}
	
	//06. Click on User Session Dtls Report page Link
	public ServerConnectionSectionLinks clickOnIPBlockHistoryLink() {
		userSessionDtlsReportPageLink.click();
		return new ServerConnectionSectionLinks();
	}
	
	
}
