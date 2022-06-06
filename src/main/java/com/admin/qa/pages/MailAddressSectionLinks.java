package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MailAddressSectionLinks extends TestBase{
	
	
	//1. Mail Address Drop Down
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement mailAddressDropdown;
	
	//2. Mail List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement mailListPageLink;
	
	//3. Resellers Mail List
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement resellersMailListPageLink;
	
	
	public MailAddressSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Mail List page Link
	public MailAddressSectionLinks clickOnMailAddressDropDown() {
		mailAddressDropdown.click();
		return new MailAddressSectionLinks();
	}
	
	//02. Click on Mail List page Link
	public MailAddressSectionLinks clickOnIPListLink() {
		mailListPageLink.click();
		return new MailAddressSectionLinks();
	}
	
	//03. Click on Resellers mail List page Link
	public MailAddressSectionLinks clickOnResellersMailListLink() {
		resellersMailListPageLink.click();
		return new MailAddressSectionLinks();
	}
}
