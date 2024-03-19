package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of App Name  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
									  					  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 01. App Name expandable list Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/span")
	WebElement dropDownAppNameSelect;
	
	// 01. App Name Input of Drop down Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInDropDown;
	
	// 01. App Name Search First Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearch;
	
	
	//01. Highlight the App Name Drop Down Field
	public void appNameDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAppNameSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAppNameSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAppNameSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAppNameSelect);
			Thread.sleep(1000);
		}
	}
	
	//01. Select from App Name Element
	public SendBackgroundorSilentPushtoSinglePIN searchandtypeelementDropDownAppNameField() throws InterruptedException {
		appNameDropDownFieldHighlight(); /* highlight the element of the tested. */
		dropDownAppNameSelect.click(); /*click on the expandable list */
		searchInDropDown.sendKeys("RedCard"); /* type on the search bar */
		valueForSearch.click();/* click on the Single value */
		return new SendBackgroundorSilentPushtoSinglePIN(); 
	}
	
	/***************************************************
							* *****************************************************************************************************
							* **************************    End No.01 - Element of App Name    ************************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Push Type  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
			  					  						  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 02. Push Type Expandable List Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/select")
	WebElement dropDownPushTypeSelect;
	
	
	//02. Highlight the Push Type Drop Down Field
	public void pushTypeDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPushTypeSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPushTypeSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPushTypeSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPushTypeSelect);
			Thread.sleep(1000);
		}
	}
	
	//02. Select from Push Type Element
	public SendBackgroundorSilentPushtoSinglePIN searchandtypeelementDropDownPushTypeField() throws InterruptedException {
		pushTypeDropDownFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/select")));
		drp.selectByIndex(2);
		return new SendBackgroundorSilentPushtoSinglePIN(); 
	}
	
	/***************************************************
	 						* *****************************************************************************************************
							* **************************    End No.02 - Element of Push Type    ***********************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of PIN in CSV  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
			  						  					  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of PIN in CSV
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/textarea")
	WebElement pininCSVElement;
	
	//03. Highlight the PIN in CSV Drop Down Field
	public void PINinCSVDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pininCSVElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pininCSVElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pininCSVElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pininCSVElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the PIN in CSV
	public SendBackgroundorSilentPushtoSinglePIN typeInpininCSVInputField() throws InterruptedException {
		PINinCSVDropDownFieldHighlight();
		pininCSVElement.sendKeys("rumy1yr");
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	
	//02.1  Type to the PIN in CSV
	public SendBackgroundorSilentPushtoSinglePIN typetothePINinCSVParam(String pin_in_csv) throws InterruptedException {
		PINinCSVDropDownFieldHighlight();
		pininCSVElement.sendKeys(pin_in_csv);
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	
	//02.0.2. Type PIN in CSV Input Field (enter text, then clear PPIN in CSV Input Field)
	public SendBackgroundorSilentPushtoSinglePIN typeAndClearthePINinCSVParam(String $payment_tnx_id) throws InterruptedException {
		PINinCSVDropDownFieldHighlight();
		pininCSVElement.sendKeys($payment_tnx_id);
		Thread.sleep(100);
		pininCSVElement.clear();
		return new SendBackgroundorSilentPushtoSinglePIN();
										    			
	}	
	
		
	//02.0.3. Type to PIN in CSV
	public SendBackgroundorSilentPushtoSinglePIN typetothePINinCSVParamTabKey() throws InterruptedException {
		PINinCSVDropDownFieldHighlight();
		pininCSVElement.sendKeys(Keys.TAB);
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	/***************************************************
							* *****************************************************************************************************
							* **************************    End No.03 - Element of PIN in CSV    **********************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Save Button  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
				  					  					  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Save Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement saveButtonElement;
	
	//04. Highlight the PIN in CSV Drop Down Field
	public void saveButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Click to the Save Button
	public SendBackgroundorSilentPushtoSinglePIN clickONSaveButton() throws InterruptedException {
		saveButtonInputFieldHighlight();
		saveButtonElement.click();
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	/***************************************************
	 						* *****************************************************************************************************
							* **************************    End No.04 - Element of Save Button    *********************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Pop Up Yes Button  $$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
				  					  					  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//05. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	WebElement popUpYesButtonElement;
	
	//05. Highlight the PIN in Pop Up Yes Button
	public void popUpYesButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//05. Click On the Pop Up Yes Button
	public SendBackgroundorSilentPushtoSinglePIN clickOnpopUpYesButton() {
		popUpYesButtonElement.click();
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	/***************************************************
							* *****************************************************************************************************
							* **************************    End No.05 - Element of Pop Up Yes Button    ***************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Pop Up No Button  $$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
				  					  					   *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//06. Element of Pop Up No Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]")
	WebElement popUpNoButtonElement;
	
	//06. Highlight the PIN in Pop Up Yes Button
	public void popUpNoButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpNoButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpNoButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpNoButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpNoButtonElement);
			Thread.sleep(1000);
		}
	}
	
	
	//06. Click On the Pop Up No Button
	public SendBackgroundorSilentPushtoSinglePIN clickOnpopUpNoButton() throws InterruptedException {
		popUpNoButtonInputFieldHighlight();/* highlight the element of the tested. */
		popUpNoButtonElement.click();/*click on the element */
		return new SendBackgroundorSilentPushtoSinglePIN();
	}
	
	/***************************************************
	 						* *****************************************************************************************************
							* **************************    End No.06 - Element of Pop Up No Button    ****************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
}
