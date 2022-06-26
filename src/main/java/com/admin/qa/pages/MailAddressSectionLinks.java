package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MailAddressSectionLinks extends TestBase{
	
	
	//1. Mail Address Drop Down For Previously Used
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement mailAddressDropdown;
	
	public MailAddressSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Mail List page Link For Previously Used
	public MailAddressSectionLinks clickOnMailAddressDropDown() {
		driver.get(props.getProperty("url")+"ip/ipBundleList");
		return new MailAddressSectionLinks();
	}
	
	//02. Open URL of Mail List page Link
	public MailAddressSectionLinks clickOnMailListLink() {
		driver.get(props.getProperty("url")+"CopyEmail/getEmailList");
		return new MailAddressSectionLinks();
	}
	
	//03. Open URL of Resellers mail List page Link
	public MailAddressSectionLinks clickOnResellersMailListLink() {
		driver.get(props.getProperty("url")+"CopyEmail/resellers_email_total");
		return new MailAddressSectionLinks();
	}
}
