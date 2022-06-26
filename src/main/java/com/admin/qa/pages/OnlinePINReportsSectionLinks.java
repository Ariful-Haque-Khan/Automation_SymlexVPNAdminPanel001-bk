package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class OnlinePINReportsSectionLinks extends TestBase{
	
	
	//1. IP Management Drop Down For Previously Used
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[1]")
	WebElement ratesSectionDropdown;
	
	public OnlinePINReportsSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of IP Management Drop Down For Previously Used
	public OnlinePINReportsSectionLinks clickOnIPManagementDropDownLink() {
		ratesSectionDropdown.click();
		return new OnlinePINReportsSectionLinks();
	}
	//02. Open URL of Web Transaction Report V2 Page Link
	public OnlinePINReportsSectionLinks clickOnWebTransactionReportV2Link() {
		driver.get(props.getProperty("url")+"OnlinePinReports/web_transaction_report_v2");
		//addNewRatePlanPageLink.click();
		return new OnlinePINReportsSectionLinks();
	}
	
	//03. Open URL of Online Pins Symlex Report Page Link
	public OnlinePINReportsSectionLinks clickOnOnlinePinsSymlexLink() {
		driver.get(props.getProperty("url")+"OnlinePinReports/online_pins_symlex");
		//ratePlanPageLink.click();
		return new OnlinePINReportsSectionLinks();
	}
	
	//04. Click on Online Pins Yallavpn Report Page Link
	public OnlinePINReportsSectionLinks clickOnOnlinePinsYallavpnLink() {
		driver.get(props.getProperty("url")+"OnlinePinReports/online_pins_yallavpn");
		//assigntoBatchPageLink.click();
		return new OnlinePINReportsSectionLinks();
	}
	//05. Open URL of Free Signup Pin Report Page Link
	public OnlinePINReportsSectionLinks clickOnFreeSignupPinReportLink() {
		driver.get(props.getProperty("url")+"OnlinePinReports/free_signup_pin_report");
		return new OnlinePINReportsSectionLinks();
	}
	
	//06. Open URL of Online Sign UP Pins 2 Report page Link
	public OnlinePINReportsSectionLinks clickOnOnlineSignUpPins_2Link() {
		driver.get(props.getProperty("url")+"OnlinePinReports/online_sign_up_pins_2");
		return new OnlinePINReportsSectionLinks();
	}
	
	
}
