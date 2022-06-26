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
import com.admin.qa.pages.PINsSectionLinks;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.ExtentReportListener;
import com.crm.qa.util.TestUtils;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SuccessStatusTestforPINsSection extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PINsSectionLinks pinSSectionLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	ExtentReportListener testExtentReportListener;
	
	//Initializing PageFactory
	public SuccessStatusTestforPINsSection() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
		testExtentReportListener = new ExtentReportListener();
		
	}
	
	
	/* 01. Check Campaign List is okay and return http status 200! */
	
	@Test(priority=1)
	public void TestPinListLinks() throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		//campaignsSectionLinks.clickOnCampaignDropDownLink(); // depend on mail address(82) parent drop down.
		//TestUtils.takeScreenshotAtEndOfTest();
		TestUtils.takeScreenshotAtEndOfTest();
		//ExtentReportListener.generateReport("testng-results.xml", "", "rep");
		pinSSectionLinks.pinListLinks();
		
		// Create object of Property file
	    Properties props = new Properties();
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.socketFactory.port", "465");
	    props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "465");
	    Session session = Session.getDefaultInstance(props,
	    new javax.mail.Authenticator() {
	    	protected PasswordAuthentication getPasswordAuthentication() {
	    		return new PasswordAuthentication("rumy.kolpolok@gmail.com", "fzpvslkmqmwlmvme");
	    	}
	    });
	
	    try {
		     Message message = new MimeMessage(session);
		     message.setFrom(new InternetAddress("rumy.kolpolok@gmail.com"));
		     message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("md.abdullah@kolpolok.com"));
		     message.setSubject("Testing Subject");
		     BodyPart messageBodyPart1 = new MimeBodyPart();
		     messageBodyPart1.setText("This is message body");
		     MimeBodyPart messageBodyPart2 = new MimeBodyPart();
		     String filename = "C:\\project\\eclipse\\SymlexAdminPanel001\\test-output\\Extent.html";
		     DataSource source = new FileDataSource(filename);
		     messageBodyPart2.setDataHandler(new DataHandler(source));
		     messageBodyPart2.setFileName(filename);
		     Multipart multipart = new MimeMultipart();
		     multipart.addBodyPart(messageBodyPart2);
		     multipart.addBodyPart(messageBodyPart1);
		     message.setContent(multipart);
		     Transport.send(message);
		     System.out.println("=====Email Sent=====");
	     } catch (MessagingException e) {
	    	 throw new RuntimeException(e);
	     }
		
	    String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 02. Check Lots Name List is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestLotsNameListLink() throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pinSSectionLinks.clickOnLotsNameListLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 03. Check Pin Validity List is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestLotsPinValidityLink() throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pinSSectionLinks.clickOnpinValidityLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 04. Check Online PinActivation2 List is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestonlinePinActivation2Link () throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pinSSectionLinks.clickOnonlinePinActivation2Link();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 05. Check Test Pin Migration Online List is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestPinMigrationLink() throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pinSSectionLinks.clickOnPinMigrationLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 06. Check RadCheck Pins Link is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestRadCheckPinsLink() throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pinSSectionLinks.clickOnRadCheckPinsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 07. Check Test Reseller Connected Users Link is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestResellerConnectedUsersLink() throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pinSSectionLinks.clickOnResellerConnectedUsersLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 08. Check Test Device Wise Reseller Pins Link is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestDeviceWiseResellerPinsLink() throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pinSSectionLinks.clickOnDeviceWiseResellerPinsLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 09. Check Suspicious Block Pin List Link is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestSuspiciousBlockPinListLink() throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pinSSectionLinks.clickOnSuspiciousBlockPinListLink();
		
		String strUrl = driver.getCurrentUrl();
		HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
	    cn.setRequestMethod("HEAD");
	    cn.connect();
	    
	    int res = cn.getResponseCode();
	    Assert.assertEquals(res, 200);
	}
	
	/* 10. Check Test Return Pin Request List Link is okay and return http status 200! */
	@Ignore
	@Test(priority=1)
	public void TestReturnPinRequestListLink() throws IOException {
		pinSSectionLinks = loginPage.loginPINsSectionLinksSuccessStatusSectionLinks(props.getProperty("username"),props.getProperty("password"));
		
		pinSSectionLinks.clickOnReturnPinRequestListLink();
		
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
