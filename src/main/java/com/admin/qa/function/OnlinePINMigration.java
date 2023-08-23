package com.admin.qa.function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.admin.qa.pages.EmailReport;
import com.crm.qa.base.TestBase;

public class OnlinePINMigration extends TestBase{
	public OnlinePINMigration(){
		PageFactory.initElements(driver, this);
	}
	
	public EmailReport openOnlinePINMigrationPage() {
		driver.get(props.getProperty("url")+"client/pinMigration");
		return new EmailReport();
	}
	
	
	//01. Element of New PIN / Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement newPINandEmailElement;
	
	//01. Type to the New PIN / Email
	public OnlinePINMigration typeToNewPINandEmail() {
		newPINandEmailElement.sendKeys("rumy1yr");
		return new OnlinePINMigration();
	}
	
	//02. Element of Password for New PIN / Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement passwordforNewPINandEmailElement;
	
	//02. Type to the New PIN / Email
	public OnlinePINMigration typeTopasswordforNewPINandEmail() {
		passwordforNewPINandEmailElement.sendKeys("12121234");
		return new OnlinePINMigration();
	}
	
	//03. Element of old PIN / Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/input")
	WebElement oldPINandEmailElement;
	
	//03. Type to the New PIN / Email
	public OnlinePINMigration typeToOldPINandEmail() {
		oldPINandEmailElement.sendKeys("rumy1yr2");
		return new OnlinePINMigration();
	}
	
	//04. Element of Password for Old PIN / Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div/input")
	WebElement passwordforOldPINandEmailElement;
	
	//04. Type to the Password for old PIN / Email
	public OnlinePINMigration typeTopasswordforOldPINandEmail() {
		passwordforOldPINandEmailElement.sendKeys("12121234");
		return new OnlinePINMigration();
	}
	
	//05. Element of Migration Now Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[3]/input")
	WebElement migrationNowButtonElement;
	
	//05. Type to the Migration Now Button
	public OnlinePINMigration clickOnmigrationNowButton() {
		migrationNowButtonElement.click();
		return new OnlinePINMigration();
	}
	
	//06. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	WebElement popUpYesButtonElement;
	
	//06. Type to the Migration Now Button
	public OnlinePINMigration clickOnpopUpYesButton() {
		popUpYesButtonElement.click();
		return new OnlinePINMigration();
	}
	
	//07. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]")
	WebElement popUpNoButtonElement;
	
	//07. Type to the Migration Now Button
	public OnlinePINMigration clickOnpopUpNoButton() {
		popUpNoButtonElement.click();
		return new OnlinePINMigration();
	}
	
}
