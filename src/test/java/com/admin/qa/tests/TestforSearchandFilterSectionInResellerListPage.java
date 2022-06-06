/*
 * @author: Md. Abdullah Al Rumy, Kolpolok Limited.
*/

package com.admin.qa.tests;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.admin.qa.pages.PageLinks;
import com.admin.qa.pages.RateSectionPageLinks;
import com.admin.qa.pages.SearchandFilterSectionInResellerPage;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtils;

public class TestforSearchandFilterSectionInResellerListPage extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PageLinks pageLinks;
	SearchandFilterSectionInResellerPage searchandFilterSectionInResellerPageElement;
	RateSectionPageLinks rateSectionPageLinks;
	ContactsPage conPage;
	TestUtils testUtils;
	
	//Initializing PageFactory
	public TestforSearchandFilterSectionInResellerListPage() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}
	
	
	/* 01. Check Reseller Page is okay and return http status 200! */
	
	@Test(priority=1)
	public void LoginSearchTextwithTestTest() throws IOException {
		searchandFilterSectionInResellerPageElement = loginPage.searchandFilterSectionInResellerPageElement(props.getProperty("username"),props.getProperty("password"));
		searchandFilterSectionInResellerPageElement.resellerSectionDropdown();
		searchandFilterSectionInResellerPageElement.resellerListPageLink();
		searchandFilterSectionInResellerPageElement.loginSearchFieldElement(); // depend on mail address(82) parent drop down.
		searchandFilterSectionInResellerPageElement.searchButtonElement();
		
		
		String url = "jdbc:mysql://localhost:3306/vpn_db";
		String username = "root";
		String password = "";
		//String QUERY = "SELECT id, login FROM resellers4 where login='jack_affiliator'";
		String QUERY = "SELECT id, login FROM resellers4 where login='mahfuz4'";

		//System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    //System.out.println("Database connected!");
		    Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery(QUERY);
	        boolean val = rs.next();
	        System.out.println(val);
	        
	        if(val==false) {
	        	System.out.print("debud............*******");
	        	Assert.fail("Write your custom error message");
//		        while(rs.next()){
//		            //Display values
//		        	
//		            System.out.print("Login: " + rs.getString("login"));
//		            
//		         }
	        }else {
	        	System.out.println("debug  from **** ELSE............*******");
	        	Assert.assertTrue(true);
	        	return;
	        }
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
		
		//searchandFilterSectionInResellerPageElement.loginColumnofResellerTableList();
		
		
	    Assert.assertEquals(true, true);
	}
	
	
//	@AfterMethod
//	public void tearDown() {
//		pageLinks.Logout();
//		super.tearDown();
//	}

}
