package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class RateSectionPageLinks extends TestBase{
	
	
	//1. Reseller & PIN
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement resellerPINDropdown;
	
	//2. Reseller
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[1]/a")
	WebElement resellerListPageLink;
	
	
	
	public RateSectionPageLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Reseller & PIN's Drop Down
	public RateSectionPageLinks clickOnResellerDropDownLink() {
		resellerPINDropdown.click();
		return new RateSectionPageLinks();
	}
	//02. Click on Reseller List page Link
	public RateSectionPageLinks clickOnResellerLink() {
		resellerListPageLink.click();
		return new RateSectionPageLinks();
	}
	
	
}
