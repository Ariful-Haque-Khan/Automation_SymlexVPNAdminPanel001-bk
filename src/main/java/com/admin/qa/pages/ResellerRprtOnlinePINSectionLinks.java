package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerRprtOnlinePINSectionLinks extends TestBase{
	
	public ResellerRprtOnlinePINSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Web Transaction Report of Redcard Link
	public ResellerPanelSectionLinks openWebTransactionReportofRedcardLink() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/web_transaction_report_redcard");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Web Transaction Report of Redcard
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleWebTransactionReportofRedcard;
	
	//Get Text Title of Web Transaction Report of Redcard
	public String getTextfromWebTransactionReportofRedcard() {
		String text = titleWebTransactionReportofRedcard.getText();
		return text;
	}
	
	//02. Open URL of Online Pins Report of Redcard
	public ResellerPanelSectionLinks openOnlinePinsReportofRedcardLinks() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/online_pins_redcard");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Online Pins Report of Redcard
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleOnlinePinsReportofRedcard;
	
	//Get Text Title of Online Pins Report of Redcard
	public String getTextfromtitleOnlinePinsReportofRedcard() {
		String text = titleOnlinePinsReportofRedcard.getText();
		return text;
	}
	
	//03. Open URL of Web Transaction Report BDplus
	public ResellerPanelSectionLinks openWebTransactionReportBDplusLinks() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/web_transaction_report_bdplus");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Web Transaction Report BDplus
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleWebTransactionReportBDplus;
	
	//Get Text Title of  Web Transaction Report BDplus
	public String getTextfromtitleWebTransactionReportBDplus() {
		String text = titleWebTransactionReportBDplus.getText();
		return text;
	}
	
	//04. Open URL of Online Pins BDplus
	public ResellerPanelSectionLinks openOnlinePinsBDplusLink() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/online_pins_bdplus");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Online Pins BDplus
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleOnlinePinsBDplus;
	
	//Get Text Title of Online Pins BDplus
	public String getTextfromOnlinePinsBDplus() {
		String text = titleOnlinePinsBDplus.getText();
		return text;
	}
	
	//05. Open URL of Web Transaction Report Keymax
	public ResellerPanelSectionLinks openWebTransactionReportKeymax() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/web_transaction_report_keymax");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Profile Info
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleWebTransactionReportKeymax;
	
	//Get Text Title of Add New Reseller Panel
	public String getTextfromWebTransactionReportKeymax() {
		String text = titleWebTransactionReportKeymax.getText();
		return text;
	}
	
	//06. Open URL of Online Pins Keymax
	public ResellerPanelSectionLinks openOnlinePinsKeymaxLinks() {
		driver.get(props.getProperty("url")+"ResellerOnlinePinReports/online_pins_keymax");
		return new ResellerPanelSectionLinks();
	}
	
	//XPath of Page Title of Online Pins Keymax
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[1]/h1")
	WebElement titleOnlinePinsKeymax;
	
	//Get Text Title of  Online Pins Keymax
	public String getTextfromOnlinePinsKeymax() {
		String text = titleOnlinePinsKeymax.getText();
		return text;
	}
}
