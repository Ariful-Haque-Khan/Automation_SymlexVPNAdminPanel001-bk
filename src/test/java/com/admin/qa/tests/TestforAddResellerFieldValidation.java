/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.admin.qa.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import com.admin.qa.pages.PageLinks;
import com.admin.qa.pages.RateSectionPageLinks;
import com.admin.qa.pages.ResellerAddFormValidationElement;
import com.admin.qa.pages.ResellerandPINPageLinks;
import com.admin.qa.pages.SearchandFilterSectionInResellerPage;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class TestforAddResellerFieldValidation extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PageLinks pageLinks;
	SearchandFilterSectionInResellerPage searchandFilterSectionInResellerPageElement;
	ResellerAddFormValidationElement resellerAddFormValidationElement;
	RateSectionPageLinks rateSectionPageLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public TestforAddResellerFieldValidation() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	@Test(priority=3)
	public void AddResellerFormTest() throws IOException {
		resellerAddFormValidationElement = loginPage.resellerAddFormValidationElement(props.getProperty("username"),props.getProperty("password"));
		resellerAddFormValidationElement.resellerSectionDropdown();
		resellerAddFormValidationElement.resellerListPageLink();
		resellerAddFormValidationElement.clickonResellerAddButtonintheResellerTableListPage();
		
		resellerAddFormValidationElement.typeonResellerName();
		resellerAddFormValidationElement.typeonLoginUsername();
		resellerAddFormValidationElement.typeonPassword();
		
		//testUtils.takeScreenshotAtEndOfTest();
		
		
		resellerAddFormValidationElement.typeonInitialBalance();
		resellerAddFormValidationElement.typeonCreditLimit();
		resellerAddFormValidationElement.selectRatePlan();
		resellerAddFormValidationElement.selectPINResetOption();
		resellerAddFormValidationElement.selectResellerPanelType();
		resellerAddFormValidationElement.typeonAppPINLogin();
		resellerAddFormValidationElement.typeonIsCustomizePanel();
		
		resellerAddFormValidationElement.selectHasLimitofPIN();
		resellerAddFormValidationElement.typeonType();
		resellerAddFormValidationElement.formSubmiton();
		
		String url = "jdbc:mysql://localhost:3306/vpn_db";
		String username = "root";
		String password = "";
		//String QUERY = "SELECT id, login FROM resellers4 where login='jack_affiliator'";
		String QUERY = "SELECT id, login FROM resellers4 where login='test'";

		//System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    //System.out.println("Database connected!");
		    Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery(QUERY);
	        boolean val = rs.next();
	        System.out.print(val);
	        
	        if(val==false) {
	        	System.out.print("debud............*******");
	        	Assert.fail("Data Not Inserted");
//		        while(rs.next()){
//		            //Display values
//		        	
//		            System.out.print("Login: " + rs.getString("login"));
//		            
//		         }
	        }else {
	        	Assert.assertTrue(true);
	        	return;
	        }
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
		Assert.assertTrue(true);
	}
	
	@Ignore
	@Test(priority=3)
	public void EditResellerFormTest() throws IOException {
		resellerAddFormValidationElement = loginPage.resellerAddFormValidationElement(props.getProperty("username"),props.getProperty("password"));
		resellerAddFormValidationElement.resellerSectionDropdown();
		resellerAddFormValidationElement.resellerListPageLink();
		resellerAddFormValidationElement.clickonResellerAddButtonintheResellerTableListPage();
		
		
	}
	
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
