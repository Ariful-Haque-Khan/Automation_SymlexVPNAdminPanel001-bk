package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SSLCommerzTransaction extends TestBase{
	
	public SSLCommerzTransaction(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Success TNX(Last 30) Report Link
	public SSLCommerzTransaction openSuccessTNXLast30Report() {
		driver.get(props.getProperty("url")+"sslcommerz_report/latest_tnx");
		return new SSLCommerzTransaction();
	}
	
	//XPath of Page Title of TNX(Last 30) Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div/h1")
	WebElement titleTNXLast30Report;
	
	//Get Text Title of Reseller Panel List
	public String getTextofTitleofTNXLas30eport() {
		String text = titleTNXLast30Report.getText();
		return text;
	}
	
	//02. Open URL of All Success TNX Report Link
	public SSLCommerzTransaction openAllSuccessTNXReport() {
		driver.get(props.getProperty("url")+"sslcommerz_report/ssl_success_tnx");
		return new SSLCommerzTransaction();
	}
	
	//XPath of Page Title of All Success TNX Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div/h1")
	WebElement titleAllSuccessTNXReport;
	
	//Get Text Title of All Success TNX Report Link
	public String getTextofTitleofAllSuccessTNXReport() {
		String text = titleAllSuccessTNXReport.getText();
		return text;
	}
	
}
