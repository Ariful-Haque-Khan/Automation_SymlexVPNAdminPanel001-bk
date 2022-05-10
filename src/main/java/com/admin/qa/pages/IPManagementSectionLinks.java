package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class IPManagementSectionLinks extends TestBase{
	
	
	//1. IP Management Drop Down
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement ratesSectionDropdown;
	
	//2. IP List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement addNewRatePlanPageLink;
	
	//3. IP Bundle
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement ratePlanPageLink;
	
	//4. Assign to Batch
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement assigntoBatchPageLink;
	
	//5. New Block Record
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement newBlockRecordPageLink;
	
	//6. IP Block History
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement ipBlockHistoryPageLink;
	
	//7. Server Lock Schedules
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement serverLockSchedulesPageLink;
	
	
	public IPManagementSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on IP Management Drop Down
	public IPManagementSectionLinks clickOnIPManagementDropDownLink() {
		ratesSectionDropdown.click();
		return new IPManagementSectionLinks();
	}
	//02. Click on IP List page Link
	public IPManagementSectionLinks clickOnIPListLink() {
		addNewRatePlanPageLink.click();
		return new IPManagementSectionLinks();
	}
	
	//03. Click on IP Bundle page Link
	public IPManagementSectionLinks clickOnIPBundleLink() {
		ratePlanPageLink.click();
		return new IPManagementSectionLinks();
	}
	
	//04. Click on Assign to Batch Drop Down
	public IPManagementSectionLinks clickOnAssigntoBatchLink() {
		assigntoBatchPageLink.click();
		return new IPManagementSectionLinks();
	}
	//05. Click on New Block Record page Link
	public IPManagementSectionLinks clickOnNewBlockRecordLink() {
		newBlockRecordPageLink.click();
		return new IPManagementSectionLinks();
	}
	
	//06. Click on IP Block History List page Link
	public IPManagementSectionLinks clickOnIPBlockHistoryLink() {
		ipBlockHistoryPageLink.click();
		return new IPManagementSectionLinks();
	}
	
	//07. Click on Server Lock Schedules List page Link
	public IPManagementSectionLinks clickOnServerLockSchedulesPlanLink() {
		serverLockSchedulesPageLink.click();
		return new IPManagementSectionLinks();
	}
	
	
}
