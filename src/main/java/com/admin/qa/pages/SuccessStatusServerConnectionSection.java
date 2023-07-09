package com.admin.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SuccessStatusServerConnectionSection extends TestBase{
	
	public SuccessStatusServerConnectionSection(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Hourly Server Connection Report Link
	public SuccessStatusServerConnectionSection openHourlyServerConnectionReport() {
		driver.get(props.getProperty("url")+"ServerReports/hourly_server_connection_report");
		return new SuccessStatusServerConnectionSection();
	}
	
	//02. Open URL of Hourly Max Connection Report Link
	public SuccessStatusServerConnectionSection openHourlyMaxConnectionLink() {
		driver.get(props.getProperty("url")+"ServerReports/hourly_max_server_connections");
		return new SuccessStatusServerConnectionSection();
	}
	
	//03. Open URL of Server Wise Connection Report Link
	public SuccessStatusServerConnectionSection openServerWiseConnection() {
		driver.get(props.getProperty("url")+"ServerReports/server_wise_hourly_connection_report");
		return new SuccessStatusServerConnectionSection();
	}
	
	//04. Open URL of User Session Report Link
	public SuccessStatusServerConnectionSection openUserSessionReport() {
		driver.get(props.getProperty("url")+"ServerReports/user_session_report");
		return new SuccessStatusServerConnectionSection();
	}
	
	//05. Open URL of User Session Details Report Link
	public SuccessStatusServerConnectionSection openSessionDetailsReport() {
		driver.get(props.getProperty("url")+"ServerReports/user_session_details_report");
		return new SuccessStatusServerConnectionSection();
	}
}
