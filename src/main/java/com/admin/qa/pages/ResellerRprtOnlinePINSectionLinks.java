package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerRprtOnlinePINSectionLinks extends TestBase{
	
	public ResellerRprtOnlinePINSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of All Online Transaction Report Link
	public ReportLog openAllOnlineTransactionReport() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/online_transaction");
		return new ReportLog();
	}
	
	//02. Open URL of Redcard Online Active Subscription Report Link
	public ReportLog openRedcardOnlineActiveSubscriptionReport() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/online_pins_redcard");
		return new ReportLog();
	}
	
	//03. Open URL of BDPlus Online Active Subscription Report Link
	public ReportLog openBDPlusOnlineActiveSubscriptionReport() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/online_pins_redcard");
		return new ReportLog();
	}
	
	//04. Open URL of BDPlus Online Active Subscription Report Link
	public ReportLog openKeymaxOnlineActiveSubscriptionReport() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/online_pins_keymax");
		return new ReportLog();
	}
}
