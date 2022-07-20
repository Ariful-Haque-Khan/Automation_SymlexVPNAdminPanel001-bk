package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ApplicationSectionLinks extends TestBase{
	
	public ApplicationSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Application Settings Link
	public ResellerPanelSectionLinks openApplicationSettingsLink() {
		driver.get(props.getProperty("url")+"application/application_settings");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Reseller Panel List
	@FindBy(xpath="/html/body/div[2]/section/section[1]/div/div[1]/h1")
	WebElement titleApplicationSetting;
	
	//Get Text Title of Reseller Panel List
	public String getTextfromApplicationSetting() {
		String text = titleApplicationSetting.getText();
		return text;
	}
	
	//02. Open URL of Profile Info Panel Link
	public ResellerPanelSectionLinks openProfileInfoLinks() {
		driver.get(props.getProperty("url")+"application/profileInfo");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Profile Info
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleProfileInfo;
	
	//Get Text Title of Add New Reseller Panel
	public String getTextfromProfileInfo() {
		String text = titleProfileInfo.getText();
		return text;
	}
	
	//03. Open URL of Other Admin Panel List Link
	public ResellerPanelSectionLinks openOtherAdminPanelListLinks() {
		driver.get(props.getProperty("url")+"application/otherAdminPanelList");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Other Admin Panel
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleOtherAdminPanel;
	
	//Get Text Title of  Other Admin Panel
	public String getTextfromOtherAdminPanel() {
		String text = titleOtherAdminPanel.getText();
		return text;
	}
}
