/*
 * @author: Naveen Kumar Rajashekar
 */
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.admin.qa.pages.IPManagementSectionLinks;
import com.admin.qa.pages.PageLinks;
import com.admin.qa.pages.RateSectionPageLinks;
import com.admin.qa.pages.ResellerAddFormValidationElement;
import com.admin.qa.pages.ResellerandPINPageLinks;
import com.admin.qa.pages.SearchandFilterSectionInResellerPage;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Load PageFactory(OR - Object Repository)
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="userPassword")
	WebElement password;
	
	//@FindBy(xpath="//input[@id='submit']")
	@FindBy(name="commit")
	//[@id="login_form"]/form/button
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement freeCRMLogo;
	
	//Initializing PageFactory
	public LoginPage() {
		PageFactory.initElements(driver, this); //this --> points to current class object.
	}
	
	public String validateLoginPageTitle() {
		//System.out.print(driver.getTitle());
		return driver.getTitle();
	}
	
	public Boolean validateCRMImage() {
		return freeCRMLogo.isEnabled();
	}
	
	public HomePage login(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage(); //HomePage is the landing page for LoginPage
	}
	
	public PageLinks loginPagelink(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new PageLinks(); //HomePage is the landing page for LoginPage
	}
	
	public ResellerandPINPageLinks loginPagelinkinResellerandPIN(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ResellerandPINPageLinks(); //HomePage is the landing page for LoginPage
	}
	
	public RateSectionPageLinks loginPagelinkinRateSetion(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new RateSectionPageLinks(); //HomePage is the landing page for LoginPage
	}
	
	public IPManagementSectionLinks loginPagelinkinIPManagement(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new IPManagementSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public SearchandFilterSectionInResellerPage searchandFilterSectionInResellerPageElement(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new SearchandFilterSectionInResellerPage(); //HomePage is the landing page for LoginPage
	}
	
	public ResellerAddFormValidationElement resellerAddFormValidationElement(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ResellerAddFormValidationElement(); //HomePage is the landing page for LoginPage
	}
	
}
