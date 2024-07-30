package com.IP_detect;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.CampaignModuleElement;
import com.admin.qa.function.IPListElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;
import com.lowagie.text.List;

import java.util.concurrent.TimeUnit;

public class IPSelectProtocolDetect extends TestBase {

	LoginPage loginPage;

	TestUtils testUtils;

	IPListElement iPListElement;

	// Initializing PageFactory
	public IPSelectProtocolDetect() {
		super(); // Call the Constructor of the Super class - TestBase
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	// @Test(priority=1)
	// @Ignore
	public void search_ip_list_from_admin_panel() throws IOException, InterruptedException {
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"), props.getProperty("password")); // login To the system
																												
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/ipList"); // navigate to the Campaign List page.																				
		Thread.sleep(4000);

		iPListElement.selectProtocolFromDropDownElement();
		Thread.sleep(2000);
		iPListElement.selectStatusFromDropDownElement();
		Thread.sleep(2000);
		iPListElement.clickONEditIPButton();
		Thread.sleep(2000);

		String ipAddress = iPListElement.copyDataFromIPField();

		// Navigate to the new URL using the copied IP address
		String url = "https://" + ipAddress;
		driver.get(url);

		iPListElement.advanceClicked();
		iPListElement.advanceClickedConti();
		Thread.sleep(4000);

		// Wait for the page to load and verify the response

		/*
		  // Verify that the page loads successfully by checking the title or any other
		  element String pageTitle = driver.getTitle();
		  System.out.println("Page title is: " + pageTitle);
		  Assert.assertTrue(pageTitle.contains("Expected Page Title"),"Page did not load successfully");
		  driver.get(iPListElement.copyDataFromIPField());
		  
		  //driver.get("https://194.49.53.20:9439"); //Thread.sleep(3000);
		  
		  //iPListElement.advanceClicked(); //iPListElement.advanceClickedConti();
		  //Thread.sleep(4000); 
		  /* String strUrl = driver.getCurrentUrl();
		  HttpURLConnection cn = (HttpURLConnection)new URL(strUrl).openConnection();
		  cn.setRequestMethod("HEAD"); cn.connect(); int res = cn.getResponseCode();
		  Assert.assertEquals(res, 200);
		 */

	}

	// @Test(priority=1)
	public void select_protocol_draft() throws IOException, InterruptedException {
		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"), props.getProperty("password")); // login To the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/ipList"); // navigate to the Campaign List page
																					
		Thread.sleep(4000);
		iPListElement.advanceClickedConti();// taking input from the Campaign Name

		Thread.sleep(4000);
		iPListElement.copyDataFromIPField();

		driver.get("https://6" + iPListElement.copyDataFromIPField());

		/*
		 String xpath = "/html/body/div[2]/div/section[2]/div[2]/div/div/div[2]/div/table/tbody/tr[2]/td[3]";
		 WebElement cellElement = driver.findElement(By.xpath(xpath)); String cellText = cellElement.getText();
		  
		 // Perform a search with the extracted data
		 driver.get("https://www.google.com"); WebElement searchBox = driver.findElement(By.name("q")); searchBox.sendKeys(cellText);
		 searchBox.submit();
		 */

		// Optional: wait for a few seconds to see the search results
		Thread.sleep(4000);

	}

	@Test(priority = 1)
	public void detect_protocol_by_searching_IP() throws IOException, InterruptedException {

		iPListElement = loginPage.addNewIPLogin(props.getProperty("username"), props.getProperty("password")); // login To the system
		driver.get("https://adminportal.symlexvpn.com/vpnadmin/index.php/ip/ipList"); // navigate to the Campaign List page
																						

		Thread.sleep(4000); // Wait for the page to load

		iPListElement.selectProtocolFromDropDownElement();// Select protocol and status from dropdown elements
		Thread.sleep(2000);
		iPListElement.selectStatusFromDropDownElement();
		Thread.sleep(2000);

		// Loop through the first 10 rows of the IP table and perform a search for each IP
		for (int i = 4; i <= 7; i++) {

			try {
				System.out.println(i);
				Thread.sleep(7000);
				WebElement searchBox = driver.findElement(
				By.xpath("/html/body/div[2]/div/section[2]/div[2]/div/div/div[2]/div/table/tbody/tr[" + i + "]/td[15]/a[1]"));

				WebElement e = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/a"));
				System.out.println(e.getText());

				Thread.sleep(6000);
				searchBox.click();

				String ipAddress = iPListElement.copyDataFromIPField();

				// Navigate to the new URL using the copied IP address
				String url = "https://" + ipAddress;
				driver.get(url);

				if (i == 4) {
					iPListElement.advanceClicked();
					iPListElement.advanceClickedConti();
				} else {
					System.out.println("Advance click elements not found, continuing with the next iteration.");
				}

				Thread.sleep(4000);

			} catch (Exception e) {
				System.out.println("An error occurred, continuing with the next iteration: " + e.getMessage());
			} finally {
				// Navigate back and refresh
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().refresh();
				iPListElement.selectProtocolFromDropDownElement();
				Thread.sleep(5000);
				iPListElement.selectStatusFromDropDownElement();
				Thread.sleep(5000);
			}
		}
	}

}
