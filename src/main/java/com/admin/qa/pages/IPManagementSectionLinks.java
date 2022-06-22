package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class IPManagementSectionLinks extends TestBase{
	
	
	//1. IP Management Drop Down
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/a")
	WebElement ratesSectionDropdown;
	
	//2. IP List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/ul/li[1]/a")
	WebElement addNewRatePlanPageLink;
	
	//3. IP Bundle
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/ul/li[2]/a")
	WebElement ipBundlePageLink;
	
	//4. Assign to Batch
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/a/span[3]/a")
	WebElement assigntoBatchPageLink;
	
	//5. New Block Record
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[5]/ul/li[4]/a")
	WebElement newBlockRecordPageLink;
	WebElement serverLockSchedulesPageLink;
	
	
	public IPManagementSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on IP Management Drop Down
	public IPManagementSectionLinks clickOnIPManagementDropDownLink() {
		driver.get(props.getProperty("url")+"ip/ipList");
		//ratesSectionDropdown.click();
		return new IPManagementSectionLinks();
	}
	//02. Click on IP List
	public IPManagementSectionLinks clickOnIPListLink() {
		driver.get(props.getProperty("url")+"ip/ipList");
		//addNewRatePlanPageLink.click();
		return new IPManagementSectionLinks();
	}
	
	//03. Click on IP Bundle List
	public IPManagementSectionLinks clickOnIPBundleLink() {
		driver.get(props.getProperty("url")+"ip/ipBundleList");
		//ipBundlePageLink.click();
		return new IPManagementSectionLinks();
	}
	
	//04. Click on lots Name With IP Bundle List
	public IPManagementSectionLinks clickOnLotsNameWithIpBundleList() {
		driver.get(props.getProperty("url")+"ip/lotsNameWithIpBundleList");
		//assigntoBatchPageLink.click();
		return new IPManagementSectionLinks();
	}
	//05. Click on Server Lock Schedule List
	public IPManagementSectionLinks clickOnServerLockScheduleList() {
		driver.get(props.getProperty("url")+"ip/serverLockScheduleList");
		//newBlockRecordPageLink.click();
		return new IPManagementSectionLinks();
	}
	
}
