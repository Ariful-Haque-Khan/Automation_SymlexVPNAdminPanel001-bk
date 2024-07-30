package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class PushAutomationForm extends TestBase{
	public PushAutomationForm(){
		PageFactory.initElements(driver, this);
	}
	
	public PushAutomationForm openPushAutomationFormPage() {
		driver.get(props.getProperty("url")+"push/automatedPushForm");
		return new PushAutomationForm();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.01 -   Drop Down Element called App Name   $$$$$$$$$$$$
									* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//01. App Name Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[1]/div/span")
	WebElement dropDownAppNameinSelect;
		
	//01.PIN Type Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInAppNameDropDown;
	
	//01. PIN Type Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForAppNameSearch;
	
	//01. Highlight the Number of Days Input Field
	public void appNameDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAppNameinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAppNameinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAppNameinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAppNameinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Number of Days
	public PushAutomationForm selectDatafromAppNameDropDownElement() throws InterruptedException {
		appNameDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownAppNameinSelect.click(); /*click on the element */
		searchInAppNameDropDown.sendKeys("Symlex");/*type on the input field */
		valueForAppNameSearch.click();/*click on the element from result of the first value. */
		return new PushAutomationForm();
	}
	
	/*******************************************************
     							* **************************************************************************************************
	 							* **************************    End No.01 - Drop Down Element called App Name     ******************
	 							* * ************************************************************************************************
	 														**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.02 -   Drop Down Element called Push Template   $$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//02. Push Template Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[2]/div/span")
	WebElement dropDownPushTemplateinSelect;
	
	//02.Push Templat Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInPushTemplateDropDown;
	
	//02. Push Templat Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[1]")
	WebElement valueForPushTemplateSearch;
	
	//02. Highlight the Number of Push Templat Field
	public void pushTemplateDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPushTemplateinSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPushTemplateinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPushTemplateinSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPushTemplateinSelect);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Push Template
	public PushAutomationForm selectDatafromPushTemplateDropDownElement() throws InterruptedException {
		pushTemplateDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownPushTemplateinSelect.click(); /*click on the element */
		searchInPushTemplateDropDown.sendKeys("Ad Blo");/*type on the input field */
		valueForPushTemplateSearch.click();/*click on the element from result of the first value. */
		return new PushAutomationForm();
	}
	
	/*******************************************************
								* **************************************************************************************************
								* **************************    End No.02 - Drop Down Element called Push Template     *************
								* * ************************************************************************************************
															**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -  Element of Auto Push To   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Auto Push To
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[3]/div/select")
	WebElement autoPushToElement;
	
	//03. Highlight the Auto Push Dropdown Field
	public void pinAutoPushFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", autoPushToElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", autoPushToElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", autoPushToElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", autoPushToElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Select from Auto Push Dropdown Field
	public PushAutomationForm autoPushDropdownField() throws InterruptedException {
		pinAutoPushFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[3]/div/select")));
		drp.selectByIndex(1);
		return new PushAutomationForm(); 
	}
	
	
	/***************************************************
     						* *********************************************************************************************
	 						* **************************    End No.03 - Element of Auto Push To    ****************************
	 						* * *******************************************************************************************
	 						******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -  Element of Reseller Type   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Reseller Type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[4]/div[1]/select")
	WebElement resellerTypeDropDOwnElement;
	
	//04. Highlight the Reseller Type Dropdown Field
	public void resellerTypeDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerTypeDropDOwnElement);/* make a yellow border outside edge of the element */
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', '');", autoPushToElement);/* make a yellow border off outside edge of the element */
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerTypeDropDOwnElement);/* make a yellow border outside edge of the element */
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', '');", resellerTypeDropDOwnElement);/* make a yellow border off outside edge of the element */
		Thread.sleep(1000);
		}
	}
	
	//04. Select from Reseller Type Dropdown Field
	public PushAutomationForm ResellerTypehDropdownField() throws InterruptedException {
		resellerTypeDropDownFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[4]/div[1]/select")));
		drp.selectByIndex(1);
		return new PushAutomationForm(); 
	}
	
	/***************************************************
					* *********************************************************************************************
					* **************************    End No.04 - Element of Reseller Type    ***********************
					* * *******************************************************************************************
					******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.05 -  Checkbox Element called With Child   $$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																		*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//05. With Child, Checkbox Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[4]/div[2]/input")
	WebElement withChildCheckboxElement;
	
	//05. Highlight the Number of With Child Field
	public void withchildCheckboxElementdHighlight() throws InterruptedException {
	if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", withChildCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", withChildCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", withChildCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", withChildCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the With Child
	public PushAutomationForm datafromWithChildDropDownElement() throws InterruptedException {
		withchildCheckboxElementdHighlight();/* highlight the element of the tested. */
		withChildCheckboxElement.click(); /*click on the element */
		return new PushAutomationForm();
	}
	
	/*******************************************************
								* **************************************************************************************************
								* **************************    End No.05 - Checkbox Element called With Child     *****************
								* * ************************************************************************************************
																**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -  Element of Select reseller*   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of Select reseller
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[5]/div/select")
	WebElement selectResellerDropDOwnElement;
	
	//06. Highlight the Reseller Type Dropdown Field
	public void selectResellerDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", selectResellerDropDOwnElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", selectResellerDropDOwnElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", selectResellerDropDOwnElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", selectResellerDropDOwnElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//06. Select from Select reseller Dropdown Field
	public PushAutomationForm selectResellerFromDropdownField() throws InterruptedException {
		selectResellerDropDownFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[5]/div/select")));
		drp.selectByIndex(1);
		return new PushAutomationForm(); 
	}
	
	/***************************************************
	 						* *********************************************************************************************
							* **************************    End No.06 - Element of Select reseller*    ********************
							* * *******************************************************************************************
							******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.07 -  Checkbox Element called PIN Status Active   $$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																				*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//07. PIN Status, Checkbox Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[6]/div/div/div[1]/input")
	WebElement pinStatusCheckboxElement;
	
	//07. Highlight the Number of With Child Field
	public void pinStatusCheckboxElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinStatusCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinStatusCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinStatusCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinStatusCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the With Child
	public PushAutomationForm datafromPINStatusCheckboxElement() throws InterruptedException {
		pinStatusCheckboxElementdHighlight();
		pinStatusCheckboxElement.click(); /*click on the element */
		return new PushAutomationForm();
	}
	
	/*******************************************************
								* **************************************************************************************************
								* **************************    End No.07 - Checkbox Element called PIN Status Active      *****************
								* * ************************************************************************************************
															**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.08 -  Checkbox Element called PIN Status Inactive   $$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																		*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//08. PIN Status Inactive, Checkbox Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[6]/div/div/div[2]/input")
	WebElement pinStatusInactiveCheckboxElement;
	
	//08. Highlight the Number of With Child Field
	public void pinStatusInactiveCheckboxElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinStatusInactiveCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinStatusInactiveCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinStatusInactiveCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinStatusInactiveCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//08. Click to the PIN Status Inactive
	public PushAutomationForm datafromPINStatusInactiveCheckboxElement() throws InterruptedException {
		pinStatusInactiveCheckboxElementdHighlight();/* highlight the element of the tested. */
		pinStatusInactiveCheckboxElement.click(); /*click on the element */
		return new PushAutomationForm();
	}
	
	/*******************************************************
	 							* **************************************************************************************************
	 							* **************************    End No.08 - Checkbox Element called PIN Status Inactive     ********
	 							* * ************************************************************************************************
	 														**************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.09 -  Checkbox Element called PIN Status Expired   $$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//09. PIN Status Expired, Checkbox Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[6]/div/div/div[3]/input")
	WebElement pinStatusExpiredCheckboxElement;
	
	//09. Highlight the Number of With Child Field
	public void pinStatusExpiredCheckboxElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinStatusExpiredCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinStatusExpiredCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinStatusExpiredCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinStatusExpiredCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//09. Click to the PIN Status Expired
	public PushAutomationForm datafromPINStatusExpiredCheckboxElement() throws InterruptedException {
		pinStatusExpiredCheckboxElementdHighlight();/* highlight the element of the tested. */
		pinStatusExpiredCheckboxElement.click(); /*click on the element */
		return new PushAutomationForm();
	}
	
	/*******************************************************
								* **************************************************************************************************
								* **************************    End No.09 - Checkbox Element called PIN Status Expired     *********
								* * ************************************************************************************************
															**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									* $$$$$$$$$$$$$$$$$$$$$$$$  Start No.10 -  Input Box Element called PIN with comma separated   $$$$$$$$$$$$
									* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//10. PIN with comma separated, Input  Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[7]/div/textarea")
	WebElement pinWithCommaSeparatedInputboxElement;
	
	//10. Highlight the PIN with comma separated Field
	public void pinWithCommaSeparatedInputboxElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinWithCommaSeparatedInputboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinWithCommaSeparatedInputboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinWithCommaSeparatedInputboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinWithCommaSeparatedInputboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01.1. Type to the PIN with comma separated
	public PushAutomationForm typeToPinWithCommaParam(String pin_with_comma) throws InterruptedException {
		pinWithCommaSeparatedInputboxElementHighlight();
		pinWithCommaSeparatedInputboxElement.sendKeys(pin_with_comma);
		return new PushAutomationForm();
	}
	
	//01.2. Type to the PIN with comma separated
	public PushAutomationForm typeToPinWithCommaTabKey() throws InterruptedException {
		pinWithCommaSeparatedInputboxElementHighlight();
		pinWithCommaSeparatedInputboxElement.sendKeys(Keys.TAB);
		return new PushAutomationForm();
	}
	
	
	//1.0.3. Type to PIN with comma separated input field Input Field (enter text, then clear new PIN with comma separated Input Field)
	public PushAutomationForm typeAndClearPinWithCommaParam(String pin_with_comma) throws InterruptedException {
		pinWithCommaSeparatedInputboxElementHighlight();
		pinWithCommaSeparatedInputboxElement.sendKeys(pin_with_comma);
		Thread.sleep(100);
		pinWithCommaSeparatedInputboxElement.clear();
		return new PushAutomationForm();
								    			
	}	
	
	/*******************************************************
	 									* **************************************************************************************************
										* *******************    End No.10 - Input Box Element called PIN with comma separated     *********
										* * ************************************************************************************************
															**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.011   Drop Down Element called Country   $$$$$$$$$$$$$$
									* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																		*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//011. Country Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[9]/div/span")
	WebElement dropDownCountryinSelect;
	
	//011.PIN Type Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInCountryDropDown;
	
	//011. PIN Type Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li") 
	WebElement valueForCountrySearch;
	
	//011. Highlight the Number of Days Input Field
	public void countryDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCountryinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCountryinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCountryinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCountryinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//011. Type to the Number of Days
	public PushAutomationForm selectDatafromCountryDropDownElement() throws InterruptedException {
		countryDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownCountryinSelect.click(); /*click on the element */
		searchInCountryDropDown.sendKeys("Bangl");/*type on the input field */
		valueForCountrySearch.click();/*click on the element from result of the first value. */
		return new PushAutomationForm();
	}
	
	/*******************************************************
								* **************************************************************************************************
								* **************************    End No.11 - Drop Down Element called Country     ******************
								* * ************************************************************************************************
																**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.12 -  Element of Automation type   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//12. Element of Automation type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[10]/div/select")
	WebElement automationTypeDropDOwnElement;
	
	//12. Highlight the Automation Type Dropdown Field
	public void selectAutomationTyperDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", automationTypeDropDOwnElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", automationTypeDropDOwnElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", automationTypeDropDOwnElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", automationTypeDropDOwnElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//12. Select from Automation type Dropdown Field
	public PushAutomationForm selectAutomationTypeFromDropdownField() throws InterruptedException {
		selectAutomationTyperDropDownFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[10]/div/select")));
		drp.selectByIndex(0);
		return new PushAutomationForm(); 
	}
	
	/***************************************************
							* *********************************************************************************************
							* **************************    End No.12 - Element of Automation type    *********************
							* * *******************************************************************************************
														*********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 									* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$  Start No.13   Drop Down Element called Days at after login   $$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//013. Days at after login Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[11]/div[1]/div/span/span[1]/span/ul/li/input")
	WebElement dropDownDaysatAfterLogininSelect;
	
	//013. Days at After Login Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[11]/div[1]/div/span/span[1]/span/ul/li/input")
	WebElement searchInDaysatAfterLoginDropDown;
	
	//013. Days at after login Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li[1]")
	WebElement valueForDaysatAfterLoginSearch;
	
	//013. Highlight the Number of Days at After Login Input Field
	public void daysatAfterLoginDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDaysatAfterLogininSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDaysatAfterLogininSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDaysatAfterLogininSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDaysatAfterLogininSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//013. Type to the Number of Days
	public PushAutomationForm selectDatafromDaysatAfterLoginDropDownElement() throws InterruptedException {
		daysatAfterLoginDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownDaysatAfterLogininSelect.click(); /*click on the element */
		searchInDaysatAfterLoginDropDown.sendKeys("1st");/*type on the input field */
		valueForDaysatAfterLoginSearch.click();/*click on the element from result of the first value. */
		return new PushAutomationForm();
	}
	
	/************************************************************
	 							* ***************************************************************************************************
	 							* *****************    End No.13. - Drop Down Element Called Days at After Login   ******************
								* * ************************************************************************************************
																**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$  Start No.14   Drop Down Element called  Days at Before Expired   $$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						   											$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//014. Days at Before Expired Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[11]/div[2]/div/span/span[1]/span/ul/li/input")
	WebElement dropDownDaysatBeforeExpiredinSelect;
	
	//014. Days at Before Expired Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[11]/div[1]/div/span/span[1]/span/ul/li/input")
	WebElement searchInDaysatBeforeExpiredDropDown;
	
	//014. Days at Before Expired Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li[1]")
	WebElement valueForDaysatBeforeExpiredSearch;
	
	//014. Highlight the Number of Days at Before Expired Dropdown Field
	public void daysatDaysatBeforeExpiredDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDaysatBeforeExpiredinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDaysatBeforeExpiredinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDaysatBeforeExpiredinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDaysatBeforeExpiredinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//014. Select from Days at Before Expired
	public PushAutomationForm selectDaysatBeforeExpiredDropDownElement() throws InterruptedException {
		daysatDaysatBeforeExpiredDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownDaysatBeforeExpiredinSelect.click(); /*click on the element */
		searchInDaysatAfterLoginDropDown.sendKeys("1st");/*type on the input field */
		valueForDaysatAfterLoginSearch.click();/*click on the element from result of the first value. */
		return new PushAutomationForm();
	}
	
	/************************************************************
	 				* ***************************************************************************************************
					* **************    End No.14. - Drop Down Element Called Days at Before Expired    ******************
					* ****************************************************************************************************
																	**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$  Start No.15   Drop Down Element called  Days at After Expired   $$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//015. Days at After Expired Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[11]/div[3]/div/span/span[1]/span/ul/li/input")
	WebElement dropDownDaysatAfterExpiredinSelect;
	
	//015. Days at After Expired Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[11]/div[3]/div/span/span[1]/span/ul/li/input")
	WebElement searchInDaysatAfterExpiredDropDown;
	
	//015. Days at After Expired Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li[1]")
	WebElement valueForDaysatAfterExpiredSearch;
	
	//015. Highlight the Number of Days at After Expired Dropdown Field
	public void daysatDaysatAfterExpiredDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDaysatBeforeExpiredinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDaysatBeforeExpiredinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDaysatBeforeExpiredinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDaysatBeforeExpiredinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//015. Select from Days at After Expired
	public PushAutomationForm selectDaysatAfterExpiredDropDownElement() throws InterruptedException {
		daysatDaysatAfterExpiredDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownDaysatAfterExpiredinSelect.click(); /*click on the element */
		dropDownDaysatAfterExpiredinSelect.sendKeys("1st");/*type on the input field */
		valueForDaysatAfterExpiredSearch.click();/*click on the element from result of the first value. */
		return new PushAutomationForm();
	}
	
	/************************************************************
	 											 * ***************************************************************************************************
												 * **************    End No.15 - Drop Down Element Called Days at After Expired   ********************
												 * * *************************************************************************************************
												 					**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$  Start No.16   Drop Down Element called  Days of Week   $$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//016. Days of Week for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[1]/div/span/span[1]/span/ul/li/input")
	WebElement dropDownDaysofWeekinSelect;
	
	//016. Days of Week Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[1]/div/span/span[1]/span/ul/li/input")
	WebElement searchInDaysofWeekDropDown;
	
	//016. Days of Week Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li")
	WebElement valueForDaysofWeekSearch;
	
	//016. Highlight the Number of Days at After Expired Dropdown Field
	public void daysofWeekDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDaysofWeekinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDaysofWeekinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDaysofWeekinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDaysofWeekinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//016. Select from Days of Week
	public PushAutomationForm selectDaysofWeekDropDownElement() throws InterruptedException {
		daysofWeekDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownDaysofWeekinSelect.click(); /*click on the element */
		searchInDaysofWeekDropDown.sendKeys("1");/*type on the input field */
		valueForDaysofWeekSearch.click();/*click on the element from result of the first value. */
		return new PushAutomationForm();
	}
	
	/************************************************************
				 								  ****************************************************************************************************
				 								  ***************    End No.16 - Drop Down Element Called Days of Week   *****************************
				 								  ****************************************************************************************************
				 								  					**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$  Start No.17   Drop Down Element called  Days of Month   $$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//017. Date of Month for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[2]/div/span/span[1]/span/ul/li/input")
	WebElement dropDownDateofMonthinSelect;
	
	//017. Date of Month Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[2]/div/span/span[1]/span/ul/li/input")
	WebElement searchInDateofMonthDropDown;
	
	//017. Date of Month Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li[1]")
	WebElement valueForDateofMonthSearch;
	
	//017. Highlight the Number of Days at After Expired Dropdown Field
	public void dateofMonthDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDateofMonthinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDateofMonthinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownDateofMonthinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownDateofMonthinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//017. Select from Days of Month
	public PushAutomationForm selectDaysofMonthDropDownElement() throws InterruptedException {
		dateofMonthDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownDateofMonthinSelect.click(); /*click on the element */
		searchInDateofMonthDropDown.sendKeys("1");/*type on the input field */
		valueForDateofMonthSearch.click();/*click on the element from result of the first value. */
		return new PushAutomationForm();
	}
	
	/************************************************************
				  ****************************************************************************************************
				  ***************    End No.17 - Drop Down Element Called Days of Month   *****************************
				  ****************************************************************************************************
				  					**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$  Start No.18   Drop Down Element called  Month   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//18. Month for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[3]/div/span/span[1]/span/ul/li/input")
	WebElement dropDownMonthinSelect;
	
	//18. Date of Month Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[3]/div/span/span[1]/span/ul/li/input")
	WebElement searchInMonthDropDown;
	
	//18. Date of Month Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li[1]")
	WebElement valueForMonthSearch;
	
	//18. Highlight the Number of Days at After Expired Dropdown Field
	public void monthDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownMonthinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownMonthinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownMonthinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownMonthinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//18. Select from Days of Month
	public PushAutomationForm selectMonthDropDownElement() throws InterruptedException {
		monthDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownMonthinSelect.click(); /*click on the element */
		searchInMonthDropDown.sendKeys("1");/*type on the input field */
		valueForMonthSearch.click();/*click on the element from result of the first value. */
		return new PushAutomationForm();
	}
	
	/************************************************************
	 											  ****************************************************************************************************
												  ***************    End No.18 - Drop Down Element Called Month   ************************************
												  ****************************************************************************************************
												  					**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										 * $$$$$$$$$$$$$$$$$$$$$$$$  Start No.19 -  Input Box Element called Specific Time   $$$$$$$$$$$$$$$$$$$$$$$
										 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//19. Specific Time, Input  Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[14]/div/input")
	WebElement specificTimeInputboxElement;
	
	//19. Specific Time, Drop DownElement
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[14]/label")
	WebElement specificTimeDropDownElement;
	
	//19. Highlight the Specific Time Input Field
	public void specificTimeInputboxElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,250)");
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", specificTimeInputboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", specificTimeInputboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", specificTimeInputboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", specificTimeInputboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//19. Click to the Specific Time
	public PushAutomationForm datafromSpecificTimeInputboxElement() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		specificTimeInputboxElementHighlight();/* highlight the element of the tested. */
		specificTimeInputboxElement.click(); /*click on the element */
		js.executeScript("window.scrollBy(0,250)");
		specificTimeInputboxElement.sendKeys("12:00:00"); /*type on the element */
		js.executeScript("window.scrollBy(0,250)");
		specificTimeInputboxElement.sendKeys(Keys.ENTER);/*key enter on the element */
		specificTimeInputboxElement.click();
		specificTimeDropDownElement.click();
		return new PushAutomationForm();
	}
	
	/*******************************************************
										* **************************************************************************************************
										********************    End No.19 - Input Box Element called Specific Time   *********************
										****************************************************************************************************
																**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 										  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 										  * $$$$$$$$$$$$$$$$$  Start No.20 -  Input Box Element called Active/Inactive Status $$$$$$$$$$$$$$$$$$$$$$$
	 										  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 										  							*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//20. Active/Inactive Status, Checkbox Input  Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[15]/div/input")
	WebElement activeInactiveStatusCheckboxInputboxElement;
	
	//20. Highlight the Active/Inactive Status, Checkbox Input  Element
	public void activeInactiveStatusCheckboxInputboxElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,250)");
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveStatusCheckboxInputboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveStatusCheckboxInputboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveStatusCheckboxInputboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveStatusCheckboxInputboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//20. Click to Active/Inactive Status, Checkbox Input  Element
	public PushAutomationForm activeInactiveStatusCheckboxInputboxElement() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		activeInactiveStatusCheckboxInputboxElementHighlight();/* highlight the element of the tested. */
		js.executeScript("window.scrollBy(0,250)");
		activeInactiveStatusCheckboxInputboxElement.click(); /*click on the element */
		js.executeScript("window.scrollBy(0,250)");
		return new PushAutomationForm();
	}
	
	/*******************************************************
										***************************************************************************************************
										***********    End No.20 - Input Box Element called Active/Inactive Status     ********************
										***************************************************************************************************
															**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.21 -  Element of Device Type   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//21. Element of Device Type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div[2]/div[2]/div/div[1]/div/select")
	WebElement deviceTypeElement;
	
	//21. Highlight the Device Type Dropdown Field
	public void deviceTypeFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", deviceTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", deviceTypeElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", deviceTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", deviceTypeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//21. Select from Device Type Dropdown Field
	public PushAutomationForm deviceTypeDropdownField() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		deviceTypeFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div[2]/div[2]/div/div[1]/div/select")));
		drp.selectByIndex(1);
		return new PushAutomationForm(); 
	}
	
	
	/***************************************************
					* *********************************************************************************************
					* **************************    End No.21 - Element of Device Type    *************************
					* * *******************************************************************************************
									******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.22 -  Element of Purchase Type   $$$$$$$$$$$$$$$$$$$$$$$$$
				    * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//22. Element of Purchase Type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div[2]/div[2]/div/div[2]/div/select")
	WebElement purchaseTypeElement;
	
	//22. Highlight the Purchase Type Dropdown Field
	public void purchaseTypeFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", purchaseTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", purchaseTypeElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", purchaseTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", purchaseTypeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//22. Select from Purchase Type Dropdown Field
	public PushAutomationForm purchaseTypeDropdownField() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");/* scrolling the screen */
		purchaseTypeFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div[2]/div[2]/div/div[2]/div/select")));
		drp.selectByIndex(1);/* select the second value */
		return new PushAutomationForm(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							***************************    End No.22 - Element of Purchase Type    ************************
							*********************************************************************************************
														******************************************************************************************************************************/
}
