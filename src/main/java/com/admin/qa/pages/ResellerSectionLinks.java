package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerSectionLinks extends TestBase{
	
	
	public ResellerSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Reseller List Link
	public ResellerSectionLinks openindexLink() {
		driver.get(props.getProperty("url")+"reseller/index");
		return new ResellerSectionLinks();
	}
	
	//02. Open URL of Add New Reseller Link
	public ResellerSectionLinks openaddFormReseller4Links() {
		driver.get(props.getProperty("url")+"reseller/addFormReseller4");
		return new ResellerSectionLinks();
	}
	
	//03. Open URL of All Level of Reseller List List page Link
	public ResellerSectionLinks openallResellerListLink() {
		driver.get(props.getProperty("url")+"reseller/allResellerList");
		return new ResellerSectionLinks();
	}
}
