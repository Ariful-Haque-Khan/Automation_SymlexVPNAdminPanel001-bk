package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SSLCommerzTnxSectionLinks extends TestBase{
	
	
	//1. SSL Commerz Tnx Drop Down
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement sslCommerzTnxDropdown;
	
	//2. Success Tnx
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement successTnxPageLink;
	
	//3. All Success TNX
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement allSuccessTNXPageLink;
	
	
	public SSLCommerzTnxSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on SSL Commerz Tnx Drop Down
	public SSLCommerzTnxSectionLinks clickOnSSLCommerzTnxDropDownLink() {
		sslCommerzTnxDropdown.click();
		return new SSLCommerzTnxSectionLinks();
	}
	
	//01. Click on Success Tnx Drop Down
	public SSLCommerzTnxSectionLinks clickOnSuccessTnxDropDownLink() {
		successTnxPageLink.click();
		return new SSLCommerzTnxSectionLinks();
	}
	//02. Click on All Success TNX page Link
	public SSLCommerzTnxSectionLinks clickOnSSLCommerzTnxLink() {
		allSuccessTNXPageLink.click();
		return new SSLCommerzTnxSectionLinks();
	}
	
	
}
