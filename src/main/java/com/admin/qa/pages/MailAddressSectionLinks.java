package com.admin.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MailAddressSectionLinks extends TestBase{
	
	public MailAddressSectionLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Mail List page Link
	public MailAddressSectionLinks opennMailAddress() {
		driver.get(props.getProperty("url")+"CopyEmail/getEmailList");
		return new MailAddressSectionLinks();
	}
	
	//02. Open URL of Reseller Mails page Link
	public MailAddressSectionLinks openResellerMailsListLink() {
		driver.get(props.getProperty("url")+"CopyEmail/resellers_email_total");
		return new MailAddressSectionLinks();
	}
	
	//03. Open URL of  Promotional Email List page Link
	public MailAddressSectionLinks openPromotionalEmailListLink() {
		driver.get(props.getProperty("url")+"CopyEmail/promotionalEmails");
		return new MailAddressSectionLinks();
	}
}
