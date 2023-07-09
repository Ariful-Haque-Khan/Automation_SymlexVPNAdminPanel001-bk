package com.admin.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ReportLog extends TestBase{
	
	public ReportLog(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of User Log Report Link
	public ReportLog openUserLog() {
		driver.get(props.getProperty("url")+"logReports/user_log");
		return new ReportLog();
	}
	
	//02. Open URL of API Payment Log Report Link
	public ReportLog openAPIPaymentLogReport() {
		driver.get(props.getProperty("url")+"logReports/api_payment_log");
		return new ReportLog();
	}
}
