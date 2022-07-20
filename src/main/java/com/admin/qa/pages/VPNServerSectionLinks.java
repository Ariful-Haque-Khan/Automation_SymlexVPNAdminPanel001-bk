package com.admin.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtils;

public class VPNServerSectionLinks extends TestBase{
	
	public VPNServerSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Reseller Panel List Link
	public ResellerPanelSectionLinks openindexLink() {
		driver.get(props.getProperty("url")+"VpnServer/index");
		return new ResellerPanelSectionLinks();
	}
	
	//02. Open URL of Add New Reseller Panel Link
	public ResellerPanelSectionLinks openAddFormLinks() {
		driver.get(props.getProperty("url")+"VpnServer/create");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of  VPN Server List
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleVPNServerList;
	
	//Get Text Title of  VPN Server List
	public String getTextfromVPNServerList() {
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", titleAddNewVPNServer);
		String text = titleVPNServerList.getText();
		return text;
	}
	
	//XPath of Page Title of Add New VPN Server
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleAddNewVPNServer;
	
	//Get Text Title of Add New Reseller Panel
	public String getTextfromtitleAddNewVPNServer() {
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", titleAddNewVPNServer);
		String text = titleAddNewVPNServer.getText();
		return text;
	}
}
