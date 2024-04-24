package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddPINJail extends TestBase{
	public AddPINJail(){
		PageFactory.initElements(driver, this);
	}
	
	public AddPINJail openAddPINJail() {
		driver.get(props.getProperty("url")+"client/addPinToSuspiciousBlockList");
		return new AddPINJail();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of PIN or Username  $$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		  						  						  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of PIN or Username
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/textarea")
	WebElement pinorUsernameElement;
	
	//01. HighlightPop PIN or Username
	public void PINorUsernameHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinorUsernameElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinorUsernameElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinorUsernameElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinorUsernameElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the PIN or Username
	public AddPINJail typeToPINorUsernames() throws InterruptedException {
		PINorUsernameHighlight();/* highlight the element of the tested. */
		pinorUsernameElement.sendKeys("1");/*type on the element */
		return new AddPINJail();
	}
	
	//1.0.1 Type to the New PIN / Email
	public AddPINJail typeToPINorUsernamesParam(String $text) throws InterruptedException {
		PINorUsernameHighlight();
		pinorUsernameElement.sendKeys($text);
		Thread.sleep(2000);
		return new AddPINJail();
	}
	
	//1.0.2 Type to the New PIN / Email
	public AddPINJail typeToPINorUsernamesTabKey() throws InterruptedException {
		PINorUsernameHighlight();
		pinorUsernameElement.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		return new AddPINJail();
	}
	
	
	//1.0.3. Type to new password Input Field (enter text, then clear new password Input Field)
	public AddPINJail typeAndClearPINorUsernamesParam(String $text) throws InterruptedException {
		PINorUsernameHighlight();
		pinorUsernameElement.sendKeys($text);
		Thread.sleep(100);
		pinorUsernameElement.clear();
		return new AddPINJail();
							    			
	}	
				
	
	/***************************************************
							* *****************************************************************************************************
							* **************************    End No.01 - Element of PIN or Username    ****************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of PIN Type  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
			  						  						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//02. PIN Type Element for First click On the Element 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/span")
	WebElement dropDownIPBundlemainSelect;
	
	//02.PIN Type Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInDropDown;
	
	//02. PIN Type Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearch;
	
	//02. Highlight of PIN Type Element for First click On the Element 
	public void PINTypeeHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIPBundlemainSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIPBundlemainSelect);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIPBundlemainSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIPBundlemainSelect);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//2. Select from PIN Type Element
	public AddPINJail searchandtypeelementDropDownField() throws InterruptedException {
		PINTypeeHighlight();
		dropDownIPBundlemainSelect.click(); /*click on the element */
		searchInDropDown.sendKeys("back");/*type on the input field */
		valueForSearch.click();/*click on the element from result of the first value. */
		return new AddPINJail();
	}
	
	/***************************************************
	 						* *****************************************************************************************************
							* **************************    End No.02 - Element of PIN Type    ************************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Save Button  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
				  										  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Save Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement saveButtonElement;
	
	//03. Highlight of PIN Type Element for First click On the Element 
	public void saveButtonelementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Save Button
	public AddPINJail clickONSaveButton() throws InterruptedException {
		saveButtonelementHighlight();/* highlight the element of the tested. */
		saveButtonElement.click();/*click on the element */
		return new AddPINJail();
	}
	
	/***************************************************
							* *****************************************************************************************************
							* **************************    End No.03 - Element of Save Button    *********************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
}
