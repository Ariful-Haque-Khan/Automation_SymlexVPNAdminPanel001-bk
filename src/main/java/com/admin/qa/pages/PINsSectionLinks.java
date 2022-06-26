package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PINsSectionLinks extends TestBase{
	
	
	//1. Campaign Drop Down For Previously Used
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/a")
	WebElement campaignDropDownLink;
	
	public PINsSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Campaign Drop Down For Previously Used
	public PINsSectionLinks clickOnCampaignDropDownLink() {
		campaignDropDownLink.click();
		return new PINsSectionLinks();
	}
	
	//02. Open URL of PIN List Link For Previously Used
	public PINsSectionLinks pinListLinks() {
		driver.get(props.getProperty("url")+"client/sipClientList");
		return new PINsSectionLinks();
	}
	
	//03. Open URL of PIN Batch Name List page Link
	public PINsSectionLinks clickOnLotsNameListLink() {
		driver.get(props.getProperty("url")+"client/lotsNameList");
		return new PINsSectionLinks();
	}
	
	//04. Open URL of PIN Validity page Link
	public PINsSectionLinks clickOnpinValidityLink() {
		driver.get(props.getProperty("url")+"client/pinValidity");
		return new PINsSectionLinks();
	}
	//05. Open URL of Online Pin Activation2 page Link
	public CampaignsSectionLinks clickOnonlinePinActivation2Link() {
		driver.get(props.getProperty("url")+"client/onlinePinActivation2");
		return new CampaignsSectionLinks();
	}
	
	//06. Open URL of PIN Migration page Link
	public PINsSectionLinks clickOnPinMigrationLink() {
		driver.get(props.getProperty("url")+"client/pinMigration");
		return new PINsSectionLinks();
	}
	
	//07. Open URL of RADCheck page Link
	public PINsSectionLinks clickOnRadCheckPinsLink() {
		driver.get(props.getProperty("url")+"client/radCheckPins");
		return new PINsSectionLinks();
	}
	
	//08. Open URL of Reseller Connected Users page Link
	public PINsSectionLinks clickOnResellerConnectedUsersLink() {
		driver.get(props.getProperty("url")+"client/resellerConnectedUsers");
		return new PINsSectionLinks();
	}
	
	//09. Open URL of Device Wise Reseller Pins page Link
	public PINsSectionLinks clickOnDeviceWiseResellerPinsLink() {
		driver.get(props.getProperty("url")+"client/deviceWiseResellerPins");
		return new PINsSectionLinks();
	}
	
	//10. Open URL of Suspicious Block Pin List page Link
	public PINsSectionLinks clickOnSuspiciousBlockPinListLink() {
		driver.get(props.getProperty("url")+"client/suspiciousBlockPinList");
		return new PINsSectionLinks();
	}
	
	//11. Open URL of Return Pin Request List page Link
	public PINsSectionLinks clickOnReturnPinRequestListLink() {
		driver.get(props.getProperty("url")+"client/returnPinRequestList");
		return new PINsSectionLinks();
	}
}
