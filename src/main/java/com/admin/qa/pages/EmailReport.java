package com.admin.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class EmailReport extends TestBase{
	
	public EmailReport(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Email List Report Link
	public EmailReport openEmailListReport() {
		driver.get(props.getProperty("url")+"CopyEmail/getEmailList");
		return new EmailReport();
	}
	
	//02. Open URL of Reseller Email's Report Link
	public EmailReport openResellerEmailsReport() {
		driver.get(props.getProperty("url")+"CopyEmail/resellers_email_total");
		return new EmailReport();
	}
	
	//03. Open URL of Promotional Email's Report Link
	public EmailReport openPromotionalEmailsReport() {
		driver.get(props.getProperty("url")+"CopyEmail/promotionalEmails");
		return new EmailReport();
	}
	
}
