package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerandPINPageLinks extends TestBase{
	
	
	//1. Reseller & PIN
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement resellerPINDropdown;
	
	//2. Reseller
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[1]/a")
	WebElement resellerListPageLink;
	
	//3. Single PIN Element
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement singlePINListPageLink;
	
	//4. PIN Batch Element
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement pinBatchListPageLink;
	
	public ResellerandPINPageLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Reseller & PIN's Drop Down
	public PageLinks clickOnResellerDropDownLink() {
		resellerPINDropdown.click();
		return new PageLinks();
	}
	//02. Click on Reseller List page Link
	public PageLinks clickOnResellerLink() {
		resellerListPageLink.click();
		return new PageLinks();
	}
	
	//03. Click on Reseller List page Link
	public PageLinks clickOnSInglePINLink() {
		singlePINListPageLink.click();
		return new PageLinks();
	}
	
	//04. Click on Reseller List page Link
	public PageLinks clickOnPINBatchLink() {
		singlePINListPageLink.click();
		return new PageLinks();
	}
}
