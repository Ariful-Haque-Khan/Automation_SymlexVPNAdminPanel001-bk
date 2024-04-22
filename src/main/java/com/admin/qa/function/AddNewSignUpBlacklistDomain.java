package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddNewSignUpBlacklistDomain extends TestBase{
	public AddNewSignUpBlacklistDomain(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewSignUpBlacklistDomain openAddNewSignUpBlacklistDomainForm() {
		driver.get(props.getProperty("url")+"Application/addToBlockList");
		return new AddNewSignUpBlacklistDomain();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Domain Name   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Domain Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div/div/textarea")
	WebElement domainNameElement;
	
	//01. Highlight the Domain Name Input Field
	public void domainNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", domainNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", domainNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", domainNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", domainNameElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Domain Name
	public AddNewSignUpBlacklistDomain typeToDomainName() throws InterruptedException {
		domainNameInputFieldHighlight();
		domainNameElement.sendKeys();
		return new AddNewSignUpBlacklistDomain();
	}
	
	
	//01.0.1 Type to Domain Name parameter
	public AddNewSignUpBlacklistDomain typeDomainNameFieldParam(String Domain_Name) throws InterruptedException {
		domainNameInputFieldHighlight();
		domainNameElement.sendKeys(Domain_Name);		
		Thread.sleep(2000);		
		return new AddNewSignUpBlacklistDomain();
	}
	
	//01.0.2. Type Domain Name Input Field (enter text, then clear Domain Name Input Field)
	public AddNewSignUpBlacklistDomain typeAndClearDomainNameFieldParam(String Domain_Name) throws InterruptedException {
		domainNameInputFieldHighlight();
		domainNameElement.sendKeys(Domain_Name);
		Thread.sleep(100);
		domainNameElement.clear();
		return new AddNewSignUpBlacklistDomain();									    			
	}		
		
	//1.0.3. Type to Domain Name tab key
	public AddNewSignUpBlacklistDomain  typetoDomainNametabKey() throws InterruptedException {
		domainNameInputFieldHighlight();
		domainNameElement.sendKeys(Keys.TAB);
		return new AddNewSignUpBlacklistDomain();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Domain Name    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Save button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//2. Element of Save button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement saveElement;
	
	//2. Highlight the Save button
	public void saveButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveElement);
			Thread.sleep(1000);
		}
	}
	
	//2. Click to the Save button
	public AddNewSignUpBlacklistDomain clickONSubmitButton() throws InterruptedException {
		saveButtonInputFieldHighlight();
		saveElement.click();
		return new AddNewSignUpBlacklistDomain();
	}
	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Save button   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	
	
	
}
