package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerSectionLinks extends TestBase{
	
	//1. Campaign Drop Down For Previously Used
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[11]/a")
	WebElement campaignDropDownLink;
	
	public ResellerSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Reseller List Link
	public PINsSectionLinks openindexLink() {
		driver.get(props.getProperty("url")+"reseller/index");
		return new PINsSectionLinks();
	}
	
	//02. Open URL of Add New Reseller Link
	public PINsSectionLinks openaddFormReseller4Links() {
		driver.get(props.getProperty("url")+"reseller/addFormReseller4");
		return new PINsSectionLinks();
	}
	
	//03. Open URL of All Level of Reseller List List page Link
	public PINsSectionLinks openallResellerListLink() {
		driver.get(props.getProperty("url")+"reseller/allResellerList");
		return new PINsSectionLinks();
	}
}
