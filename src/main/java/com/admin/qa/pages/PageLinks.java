/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/
package com.admin.qa.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PageLinks extends TestBase{

	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement resellerListPageLink;

	public PageLinks(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public PageLinks clickOnResellerPINLink() {
		resellerListPageLink.click();
		return new PageLinks();
	}
	
}
