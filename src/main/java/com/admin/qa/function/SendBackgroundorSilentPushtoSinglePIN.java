package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class SendBackgroundorSilentPushtoSinglePIN extends TestBase{
	public SendBackgroundorSilentPushtoSinglePIN(){
		PageFactory.initElements(driver, this);
	}
	
	//Open Page Send Background/Silent Push to Single PIN
	public SendBackgroundorSilentPushtoSinglePIN openSendBackgroundorSilentPushtoSinglePINPage() {
		driver.get(props.getProperty("url")+"client/sendBackgroundPush");
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	// 01. App Name expandable list Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/span")
	WebElement dropDownIPBundlemainSelect;
	
	// 01. App Name Input of Drop down Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInDropDown;
	
	// 01. App Name Search First Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearch;
	
	/*
	public void todaysNowSaleHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", todayNowElement);
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', '');", todayNowElement);
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", todayNowElement);
	        Thread.sleep(2000);
	        js.executeScript("arguments[0].setAttribute('style', '');", todayNowElement);
	        Thread.sleep(1000);
	    }
	}
	*/
	//01. Select from App Name Element
	public SendBackgroundorSilentPushtoSinglePIN searchandtypeelementDropDownAppNameField() throws InterruptedException {
		dropDownIPBundlemainSelect.click(); /*click on the expandable list */
		searchInDropDown.sendKeys("RedCard"); /* type on the search bar */
		valueForSearch.click();/* click on the Single value */
		return new SendBackgroundorSilentPushtoSinglePIN(); 
	}
	
	// 02. Push Type Expandable List Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/span")
	WebElement dropDownPushTypeSelect;
	
	// 02. Push Type Input of Drop down Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchPushTypeInDropDown;
	
	// 02. Push Type Search First Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueofPushTypeForSearch;
	
	//02. Select from Push Type Element
	public SendBackgroundorSilentPushtoSinglePIN searchandtypeelementDropDownPushTypeField() throws InterruptedException {
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/select")));
		drp.selectByIndex(2);
		return new SendBackgroundorSilentPushtoSinglePIN(); 
	}
	
	//03. Element of PIN in CSV
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/textarea")
	WebElement pininCSVElement;
	
	//03. Type to the PIN in CSV
	public SendBackgroundorSilentPushtoSinglePIN typeInpininCSVInputField() {
		pininCSVElement.sendKeys("rumy1yr");
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	//04. Element of Save Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement saveButtonElement;
	
	//04. Click to the Save Button
	public SendBackgroundorSilentPushtoSinglePIN clickONSaveButton() {
		saveButtonElement.click();
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	//05. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	WebElement popUpYesButtonElement;
	
	//05. Click On the Pop Up Yes Button
	public SendBackgroundorSilentPushtoSinglePIN clickOnpopUpYesButton() {
		popUpYesButtonElement.click();
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	//06. Element of Pop Up No Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]")
	WebElement popUpNoButtonElement;
	
	//06. Click On the Pop Up No Button
	public SendBackgroundorSilentPushtoSinglePIN clickOnpopUpNoButton() {
		popUpNoButtonElement.click();
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
}
