package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerPanelSectionLinks extends TestBase{
	
	public ResellerPanelSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Reseller Panel List Link
	public ResellerPanelSectionLinks openindexLink() {
		driver.get(props.getProperty("url")+"reseller_panels/index");
		return new ResellerPanelSectionLinks();
	}
	
	//02. Open URL of Add New Reseller Panel Link
	public ResellerPanelSectionLinks openAddFormLinks() {
		driver.get(props.getProperty("url")+"reseller_panels/create");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Reseller Panel List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleResellerPanelList;
	
	//Get Text Title of Reseller Panel List
	public String getTextfromResellerPanelList() {
		String text = titleResellerPanelList.getText();
		return text;
	}
	
	//XPath of Page Title of Add New Reseller Panel
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleAddNewResellerPanel;
	
	//Get Text Title of Add New Reseller Panel
	public String getTextfromAddNewResellerPanel() {
		String text = titleAddNewResellerPanel.getText();
		return text;
	}
}
