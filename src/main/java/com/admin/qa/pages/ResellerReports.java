package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerReports extends TestBase{
	
	public ResellerReports(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Sales Graph Report Link
	public ResellerReports opeSalesGraphReportLink() {
		driver.get(props.getProperty("url")+"reportResellers/salesGraph");
		return new ResellerReports();
	}
	
	//XPath of Page Title of Sales Graph Report
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/div/strong")
	WebElement titleSalesGraphReport;
	
	//Get Text Title of Sales Graph Report
	public String getTextofTitleofSalesGraphReport() {
		String text = titleSalesGraphReport.getText();
		return text;
	}
	
}
