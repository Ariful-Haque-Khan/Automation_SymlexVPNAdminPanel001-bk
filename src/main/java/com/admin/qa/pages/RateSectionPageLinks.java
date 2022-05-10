package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class RateSectionPageLinks extends TestBase{
	
	
	//1. Rates Section
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	
	WebElement ratesSectionDropdown;
	
	//2. Add New Rate Plan
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	
	WebElement addNewRatePlanPageLink;
	
	//3. Rate Plan
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement ratePlanPageLink;
	
	
	
	public RateSectionPageLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Rates Section Drop Down
	public RateSectionPageLinks clickOnResellerDropDownLink() {
		ratesSectionDropdown.click();
		return new RateSectionPageLinks();
	}
	//02. Click on Add New Rate Plan page Link
	public RateSectionPageLinks clickOnAddNewRatePlanLink() {
		addNewRatePlanPageLink.click();
		return new RateSectionPageLinks();
	}
	
	//03. Click on Rate Plan List page Link
	public RateSectionPageLinks clickOnRatePlanLink() {
		ratePlanPageLink.click();
		return new RateSectionPageLinks();
	}
	
	
}
