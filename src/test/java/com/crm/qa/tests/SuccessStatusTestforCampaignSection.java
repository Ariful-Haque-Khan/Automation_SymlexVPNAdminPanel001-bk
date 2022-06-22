/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.crm.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.pages.CampaignsSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SuccessStatusTestforCampaignSection extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CampaignsSectionLinks campaignsSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public SuccessStatusTestforCampaignSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Campaign List is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void CampaignListLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginCampaignsSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnCampaignListLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
//	 // change below lines accordingly 
// 		String to = "rumy103040@gmail.com"; 
// 		String from = "rumy.kolpolok@gmail.com"; 
// 		String host = "localhost"; // or IP address 
//
// 		// Get the session object 
// 		// Get system properties 
// 		Properties properties = System.getProperties(); 
//
// 		// Setup mail server 
// 		properties.setProperty("mail.smtp.host", host); 
//
// 		// Get the default Session object 
// 		Session session = Session.getDefaultInstance(properties); 
//
// 		// compose the message 
// 		try { 
//
// 			// javax.mail.internet.MimeMessage class 
// 			// is mostly used for abstraction. 
// 			MimeMessage message = new MimeMessage(session); 
//
// 			// header field of the header. 
// 			message.setFrom(new InternetAddress(from)); 
// 			message.addRecipient(Message.RecipientType.TO, 
// 								new InternetAddress(to)); 
// 			message.setSubject("subject"); 
// 			message.setText("Hello, aas is sending email "); 
//
// 			// Send message 
// 			Transport.send(message); 
// 			System.out.println("Yo it has been sent.."); 
// 		} 
// 		catch (MessagingException mex) {
// 			System.out.println("Yo it has been sent..");
// 			mex.printStackTrace(); 
// 		}
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check New Campaign Page is okay and return http status 200! */
	
	@Test(priority=2)
	public void NewCampaignLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginCampaignsSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnNewCampaignLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	   
	 		int res = cn.getResponseCode();
		    Assert.assertEquals(res, 200);
	}
	@Ignore
	/* 03. Check Affiliator List is okay and return http status 200! */
	
	@Test(priority=3)
	public void AffiliatorListLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginCampaignsSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnAffiliatorListpageLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 04. Check Affiliator Withdraw Transaction Page is okay and return http status 200! */
	@Ignore
	@Test(priority=4)
	public void AffiliatorWithdrawTnxLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginCampaignsSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnAffiliatorWithdrawTnxLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 05. Check Affiliator Payment Gateways Page is okay and return http status 200! */
	@Ignore
	@Test(priority=5)
	public void AffiliatorPaymentGatewaysLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginCampaignsSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnAffiliatorPaymentGatewaysLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 06. Check Affiliator Requests Page is okay and return http status 200! */
	@Ignore
	@Test(priority=6)
	public void AffiliatorRequestsLinkTest() throws IOException {
		campaignsSectionLinks = loginPage.loginCampaignsSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		
		campaignsSectionLinks.clickOnAfiliatorRequestsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
