package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class IPManagementSectionLinks extends TestBase{
	
	
	//1. IP Management Drop Down For Previously Used
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/a")
	WebElement ratesSectionDropdown;

	
	public IPManagementSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Management Drop Down For Previously Used
	public IPManagementSectionLinks clickOnIPManagementDropDownLink() {
		driver.get(props.getProperty("url")+"ip/ipList");
		return new IPManagementSectionLinks();
	}
	//02. Open URL of IP List
	public IPManagementSectionLinks clickOnIPListLink() {
		driver.get(props.getProperty("url")+"ip/ipList");
		return new IPManagementSectionLinks();
	}
	
	//03. Open URL of IP Bundle List
	public IPManagementSectionLinks clickOnIPBundleLink() {
		driver.get(props.getProperty("url")+"ip/ipBundleList");
		return new IPManagementSectionLinks();
	}
	
	//04. Open URL of lots Name With IP Bundle List
	public IPManagementSectionLinks clickOnLotsNameWithIpBundleList() {
		driver.get(props.getProperty("url")+"ip/lotsNameWithIpBundleList");
		return new IPManagementSectionLinks();
	}
	//05. Open URL of Server Lock Schedule List
	public IPManagementSectionLinks clickOnServerLockScheduleList() {
		driver.get(props.getProperty("url")+"ip/serverLockScheduleList");
		return new IPManagementSectionLinks();
	}
	
	//06. Open URL of Countries With IP Bundle
	public IPManagementSectionLinks openCountriesWithBundleList() {
		driver.get(props.getProperty("url")+"ip/countriesWithBundle");
		return new IPManagementSectionLinks();
	}
	
}
