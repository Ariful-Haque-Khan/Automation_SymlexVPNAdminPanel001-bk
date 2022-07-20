package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class RateSectionLinks extends TestBase{
	
	public RateSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of rateList List Link
	public RateSectionLinks openindexLink() {
		driver.get(props.getProperty("url")+"rate/rateList");
		return new RateSectionLinks();
	}
	
	//02. Open URL of Add New Rate Link
	public RateSectionLinks openAddFormLinks() {
		driver.get(props.getProperty("url")+"rate/addForm");
		return new RateSectionLinks();
	}
}
