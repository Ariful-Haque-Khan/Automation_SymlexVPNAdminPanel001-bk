package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class SendPushtoUser extends TestBase{
	public SendPushtoUser(){
		PageFactory.initElements(driver, this);
	}
	
	public SendPushtoUser openSendPushtoUserPage() {
		driver.get(props.getProperty("url")+"push/sendPushForm");
		return new SendPushtoUser();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of App Name   $$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. App Name Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[1]/div/span")
	WebElement dropDownAppNameinSelect;
		
	//01.App Name Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInAppNameDropDown;
	
	//01. App Name Element for Last click of first element On the Element
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
	public SendPushtoUser selectDatafromAppNameDropDownElement() throws InterruptedException {
		appNameDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownAppNameinSelect.click(); /*click on the element */
		searchInAppNameDropDown.sendKeys("Symlex");/*type on the input field */
		valueForAppNameSearch.click();/*click on the element from result of the first value. */
		return new SendPushtoUser();
	}
	
	/*******************************************************************
     						**************************************************************************************************
     						***************************    End No.01 - Element of App Name    ********************************
     						**************************************************************************************************
     															****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -  Element of Send To   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of Send To
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[2]/div[1]/select")
	WebElement sendToElement;
	
	//02. Highlight the Auto Push Dropdown Field
	public void sendToFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", sendToElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", sendToElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", sendToElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", sendToElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//02. Select from Auto Push Dropdown Field
	public SendPushtoUser sendToDropdownField() throws InterruptedException {
		sendToFieldHighlight
		();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[2]/div[1]/select")));
		drp.selectByIndex(1);
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.02 - Element of Send To    ***************************
							*********************************************************************************************
													  *****************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								    *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.03 -  Checkbox Element called With Child   $$$$$$$$$$
									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											   								$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//03. With Child, Checkbox Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[2]/div[2]/input")
	WebElement withChildCheckboxElement;
	
	//03. Highlight the Number of With Child Field
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
	
	//03. Type to the With Child
	public SendPushtoUser datafromWithChildDropDownElement() throws InterruptedException {
		withchildCheckboxElementdHighlight();/* highlight the element of the tested. */
		withChildCheckboxElement.click(); /*click on the element */
		return new SendPushtoUser();
	}
	
	/*******************************************************
								***************************************************************************************************
								***************************    End No.03 - Checkbox Element called With Child     *****************
								***************************************************************************************************
														   ***************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$  Start No.04 -  Input Box Element called PIN with comma separated   $$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//04. PIN with comma separated, Input  Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[3]/div/textarea")
	WebElement pinWithCommaSeparatedInputboxElement;
	
	//04. Highlight the Number of With Child Field
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
	
	//04. Type to the PIN with comma separated, Input  Element
	public SendPushtoUser datafromPINWithCommaSeparatedInputboxElement() throws InterruptedException {
		pinWithCommaSeparatedInputboxElementHighlight();/* highlight the element of the tested. */
		pinWithCommaSeparatedInputboxElement.click(); /*click on the element */
		pinWithCommaSeparatedInputboxElement.sendKeys("rumy1yr"); /*type on the element */
		return new SendPushtoUser();
	}
	
	/*******************************************************
										***************************************************************************************************
										********************    End No.04 - Input Box Element called PIN with comma separated     *********
										***************************************************************************************************
															**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Select Reseller   $$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Select Reseller Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[4]/div/span")
	WebElement dropDownSelectResellerinSelect;
	
	//05. Select Reseller Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInSelectResellerDropDown;
	
	//05. Select Reseller Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[1]")
	WebElement valueForSelectResellerSearch;
	
	//05. Highlight the Select Reseller Input Field
	public void selectResellerDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchInSelectResellerDropDown);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", searchInSelectResellerDropDown);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchInSelectResellerDropDown);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", searchInSelectResellerDropDown);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Select Reseller
	public SendPushtoUser selectDatafromSelectResellerDropDownElement() throws InterruptedException {
		selectResellerDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownSelectResellerinSelect.click(); /*click on the element */
		searchInSelectResellerDropDown.sendKeys("Symlex");/*type on the input field */
		valueForSelectResellerSearch.click();/*click on the element from result of the first value. */
		return new SendPushtoUser();
	}
	
	/*******************************************************************
								**************************************************************************************************
								***************************    End No.05 - Element of Select Reseller    *************************
								**************************************************************************************************
																****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.06 -  Checkbox Element called PIN Status Active   $$$$$$$$$$$$$$$
	 										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 																		*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//06. PIN Status, Checkbox Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[6]/div/div/div[1]/input")
	WebElement pinStatusCheckboxElement;
	
	//06. Highlight the Number of With Child Field
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
	
	//06. Type to the With Child
	public SendPushtoUser datafromPINStatusCheckboxElement() throws InterruptedException {
		pinStatusCheckboxElementdHighlight();
		pinStatusCheckboxElement.click(); /*click on the element */
		return new SendPushtoUser();
	}
	
	/*******************************************************
	 							 **************************************************************************************************
								 ***************************    End No.06 - Checkbox Element called PIN Status Active      ********
								 **************************************************************************************************
								 								**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.07 -  Checkbox Element called PIN Status Inactive   $$$$$$$$$$$$
											*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//07. PIN Status Inactive, Checkbox Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[6]/div/div/div[2]/input")
	WebElement pinStatusInactiveCheckboxElement;
	
	//07. Highlight the Number of With Child Field
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
	
	//07. Click to the PIN Status Inactive
	public SendPushtoUser datafromPINStatusInactiveCheckboxElement() throws InterruptedException {
		pinStatusInactiveCheckboxElementdHighlight();/* highlight the element of the tested. */
		pinStatusInactiveCheckboxElement.click(); /*click on the element */
		return new SendPushtoUser();
	}
	
	/*******************************************************
								***************************************************************************************************
								***************************    End No.07 - Checkbox Element called PIN Status Inactive     ********
								**************************************************************************************************
															**************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.08 -  Checkbox Element called PIN Status Expired   $$$$$$$$$$$$$$
											* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//08. PIN Status Expired, Checkbox Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[6]/div/div/div[3]/input")
	WebElement pinStatusExpiredCheckboxElement;
	
	//08. Highlight the Number of With Child Field
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
	
	//08. Click to the PIN Status Expired
	public SendPushtoUser datafromPINStatusExpiredCheckboxElement() throws InterruptedException {
		pinStatusExpiredCheckboxElementdHighlight();/* highlight the element of the tested. */
		pinStatusExpiredCheckboxElement.click(); /*click on the element */
		return new SendPushtoUser();
	}
	
	/*******************************************************
	 							* **************************************************************************************************
								* **************************    End No.08 - Checkbox Element called PIN Status Expired     *********
								* * ************************************************************************************************
															**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Payment Method   $$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//09. Payment Method Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[8]/div/span")
	WebElement dropDownPaymentMethodinSelect;
	
	//09. Payment Method Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInPaymentMethodDropDown;
	
	//09. Payment Method Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForPaymentMethodSearch;
	
	//09. Highlight the Payment Method Dropdown Field
	public void paymentMethodDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPaymentMethodinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPaymentMethodinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPaymentMethodinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPaymentMethodinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Payment Method
	public SendPushtoUser selectDatafromPaymentMethodDropDownElement() throws InterruptedException {
		paymentMethodDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownPaymentMethodinSelect.click(); /*click on the element */
		searchInPaymentMethodDropDown.sendKeys("ssl");/*type on the input field */
		valueForPaymentMethodSearch.click();/*click on the element from result of the first value. */
		return new SendPushtoUser();
	}
	
	/***********************************************************
									**************************************************************************************************
									***************************    End No.09 - Element of Payment Method    **************************
									**************************************************************************************************
															  ****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Country Filter   $$$$$$$$$$$$$$$$$
					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//10. Country Filter Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[9]/div/span")
	WebElement dropDownCountryFilterinSelect;
	
	//10. Country Filter Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInCountryFilterDropDown;
	
	//10. Country Filter Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForCountryFilterSearch;
	
	//10. Highlight the Payment Method Dropdown Field
	public void countryFilterDropDownElementdHighlight() throws InterruptedException {
	if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCountryFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCountryFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCountryFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCountryFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//10. Type to the Country Filter
	public SendPushtoUser selectDatafromCountryFilterDropDownElement() throws InterruptedException {
		countryFilterDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownCountryFilterinSelect.click(); /*click on the element */
		searchInCountryFilterDropDown.sendKeys("exc");/*type on the input field */
		valueForCountryFilterSearch.click();/*click on the element from result of the first value. */
		return new SendPushtoUser();
	}
	
	/***********************************************************
						**************************************************************************************************
						***************************    End No.10 - Element of Country Filter    **************************
						**************************************************************************************************
												  ****************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$  Start No.11   Drop Down Element called Country   $$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						   											$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//011. Country Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[10]/div/span/span[1]/span/ul/li/input")
	WebElement dropDownCountrySelect;
	
	//011. Country Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[10]/div/span/span[1]/span/ul/li/input")
	WebElement searchInCountryDropDown;
	
	//011. Country Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li[1]")
	WebElement valueForCountrySearch;
	
	//011. Highlight the Country Drop down Input Field
	public void countryDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCountrySelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCountrySelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCountrySelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCountrySelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//011. Type to the Number of Days
	public SendPushtoUser selectDatafromCountryDropDownElement() throws InterruptedException {
		countryDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownCountrySelect.click(); /*click on the element */
		searchInCountryDropDown.sendKeys("afgh");/*type on the input field */
		valueForCountrySearch.click();/*click on the element from result of the first value. */
		return new SendPushtoUser();
	}
	
	/************************************************************
	 									* **************************************************************************************************
	 									* ***********************   End No.11. - Drop Down Element Called Country   ************************
	 									* * ************************************************************************************************
	 															**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.12 -   Element of Target Device   $$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//12. Target Device Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[11]/div/span")
	WebElement dropDownTargetDeviceSelect;
	
	//12.Target Device Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInTargetDeviceDropDown;
	
	//12. Target Device Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForTargetDeviceSearch;
	
	//12. Highlight theTarget Device Drop down Input Field
	public void targetDeviceDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownTargetDeviceSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownTargetDeviceSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownTargetDeviceSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownTargetDeviceSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//12. Select from the Target Device
	public SendPushtoUser selectDatafromTargetDeviceDropDownElement() throws InterruptedException {
		targetDeviceDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownTargetDeviceSelect.click(); /*click on the element */
		searchInTargetDeviceDropDown.sendKeys("iOS");/*type on the input field */
		valueForTargetDeviceSearch.click();/*click on the element from result of the first value. */
		return new SendPushtoUser();
	}
	
	/*******************************************************************
											**************************************************************************************************
											***************************    End No.12 - Element of Target Device    ***************************
											**************************************************************************************************
																****************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.13 -  Element of Date Filter Column   $$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//13. Element of Date Filter Column
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[1]/select")
	WebElement dateFilterColumnElement;
	
	//13. Highlight the Date Filter Dropdown Field
	public void dateFilterColumnFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dateFilterColumnElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dateFilterColumnElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dateFilterColumnElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dateFilterColumnElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//13. Select from Date Filter Column Dropdown Field
	public SendPushtoUser dateFilterColumnDropdownField() throws InterruptedException {
		dateFilterColumnFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[1]/select")));
		drp.selectByIndex(1);
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
				*********************************************************************************************
				****************************    End No.13 - Element of Date Filter Column    ****************
				*********************************************************************************************
										  *****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.14 -  Element of Date Filter Condition   $$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//14. Element of Date Filter Condition
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[2]/select")
	WebElement dateFilterConditionDropDownElement;
	
	//14. Highlight the Date Filter Condition Dropdown Field
	public void dateFilterConditionFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dateFilterConditionDropDownElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dateFilterConditionDropDownElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dateFilterConditionDropDownElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dateFilterConditionDropDownElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//14. Select from Date Filter Column Dropdown Field
	public SendPushtoUser dateFilterConditionDropdownField() throws InterruptedException {
		dateFilterConditionFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[12]/div[2]/select")));
		drp.selectByIndex(1);
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
	 						*********************************************************************************************
							****************************    End No.14 - Element of Date Filter Column    ****************
							*********************************************************************************************
							  							*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.15 -  Element of Date Filter Condition Start   $$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//15. Element of Date Filter Condition Start
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[13]/div/div[1]/input")
	WebElement dateFilterConditionStartDropDownElement;
	
	//15. Highlight the Date Filter Condition Start Dropdown Field
	public void dateFilterConditionStartFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dateFilterConditionStartDropDownElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dateFilterConditionStartDropDownElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dateFilterConditionStartDropDownElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dateFilterConditionStartDropDownElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//15. Select from Date Filter Condition Start Dropdown Field
	public SendPushtoUser dateFilterConditionStartDropdownField() throws InterruptedException {
		dateFilterConditionStartFieldHighlight();/* highlight the element of the tested. */
		dateFilterConditionStartDropDownElement.sendKeys("2023-09-12"); /*type to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.15 - Element of Date Filter Column Start *************
							*********************************************************************************************
				  										*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.16 -  Element of Date Filter Condition End   $$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//16. Element of Date Filter Condition Start
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[13]/div/div[2]/input")
	WebElement dateFilterConditionEndDropDownElement;
	
	//16. Highlight the Date Filter Condition Start Dropdown Field
	public void dateFilterConditionEndFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dateFilterConditionStartDropDownElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dateFilterConditionStartDropDownElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dateFilterConditionStartDropDownElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dateFilterConditionStartDropDownElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//16. Select from Date Filter Condition Start Dropdown Field
	public SendPushtoUser dateFilterConditionEndDropdownField() throws InterruptedException {
		dateFilterConditionEndFieldHighlight();/* highlight the element of the tested. */
		dateFilterConditionEndDropDownElement.sendKeys("2023-09-15"); /*type to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.16 - Element of Date Filter Column End ***************
							*********************************************************************************************
	  													*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.017 -   Element of Copy Template   $$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//17. Copy Template Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/span")
	WebElement dropDownCopyTemplateinSelect;
	
	//17.Copy Template for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInCopyTemplateDropDown;
	
	//17. App Name Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForCopyTemplateSearch;
	
	//01. Highlight the Copy Template Drop Down Input Field
	public void copyTemplateDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCopyTemplateinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCopyTemplateinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCopyTemplateinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCopyTemplateinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//17. Type to the Copy Template Drop Down Input Field
	public SendPushtoUser selectDatafromCopyTemplateDropDownElement() throws InterruptedException {
		copyTemplateDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownCopyTemplateinSelect.click(); /*click on the element */
		searchInCopyTemplateDropDown.sendKeys("1 in");/*type on the input field */
		valueForCopyTemplateSearch.click();/*click on the element from result of the first value. */
		return new SendPushtoUser();
	}
	
	/*******************************************************************
											**************************************************************************************************
											***************************    End No.17 - Element of Copy Template    ***************************
											**************************************************************************************************
																****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.18 -  Element of Title Input Field   $$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//18. Element of Title Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div[1]/div/input")
	WebElement titleInputFieldElement;
	
	//16. Highlight the Title Input Field
	public void titleInputFieldFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", titleInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", titleInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", titleInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", titleInputFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//16. Select from Title Input Field
	public SendPushtoUser titleInputFieldField() throws InterruptedException {
		titleInputFieldFieldHighlight();/* highlight the element of the tested. */
		titleInputFieldElement.sendKeys("Test Title"); /*type to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
				*********************************************************************************************
				****************************    End No.18 - Element of Title Input Field ********************
				*********************************************************************************************
												*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.19 -  Element of Message Input Field   $$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//19. Element of Message Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div[2]/div/textarea")
	WebElement messageInputFieldElement;
	
	//19. Highlight the Message Input Field
	public void messageInputFieldFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", messageInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", messageInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", messageInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", messageInputFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//19. Select from Message Input Field
	public SendPushtoUser messageInputFieldField() throws InterruptedException {
		messageInputFieldFieldHighlight();/* highlight the element of the tested. */
		messageInputFieldElement.sendKeys("Test Title"); /*type to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
	 						*********************************************************************************************
							****************************    End No.19 - Element of Message Input Field ******************
							*********************************************************************************************
														*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.20 -  Element of Image URL Input Field   $$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//20. Element of Image URL Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div[3]/div/input")
	WebElement imageURLInputFieldElement;
	
	//20. Highlight the Image URL Input Field
	public void imageURLInputFieldFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", imageURLInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", imageURLInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", imageURLInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", imageURLInputFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//20. Select from Image URL Input Field
	public SendPushtoUser imageURLInputFieldField() throws InterruptedException {
		imageURLInputFieldFieldHighlight();/* highlight the element of the tested. */
		imageURLInputFieldElement.sendKeys("google.com"); /*type to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.20 - Element of Image URL Input Field ****************
							*********************************************************************************************
														*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.21 -  Element of URL for Android Input Field $$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//21. Element of Image URL Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div[4]/div/input")
	WebElement urlforAndroidInputFieldElement;
	
	//21. Highlight the Image URL Input Field
	public void urlforAndroidInputFieldFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", urlforAndroidInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", urlforAndroidInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", urlforAndroidInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", urlforAndroidInputFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//21. Select from Image URL Input Field
	public SendPushtoUser urlforAndroidInputFieldField() throws InterruptedException {
		urlforAndroidInputFieldFieldHighlight();/* highlight the element of the tested. */
		urlforAndroidInputFieldElement.sendKeys("google.com"); /*type to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.21 - Element of URL for Android Input Field **********
							*********************************************************************************************
														*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.22 -  Element of URL for iOS Input Field $$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//22. Element of URL for iOS Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div[5]/div/input")
	WebElement urlforiOSInputFieldElement;
	
	//22. Highlight the URL for iOS Input Field
	public void urlforiOSInputFieldFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", urlforiOSInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", urlforiOSInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", urlforiOSInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", urlforiOSInputFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//22. Select from URL for iOS Input Field
	public SendPushtoUser urlforiOSInputFieldField() throws InterruptedException {
		urlforiOSInputFieldFieldHighlight();/* highlight the element of the tested. */
		urlforiOSInputFieldElement.sendKeys("google.com"); /*type to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.22 - Element of URL for iOS Input Field **************
							*********************************************************************************************
														*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.23 -  Element of Page Control Input Field $$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//23. Element of Page Control Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div[6]/div/input")
	WebElement pageControlInputFieldElement;
	
	//23. Highlight the URL for iOS Input Field
	public void pageControInputFieldFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pageControlInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pageControlInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pageControlInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pageControlInputFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//23. Select from Page Control Input Field
	public SendPushtoUser pageControInputFieldField() throws InterruptedException {
		pageControInputFieldFieldHighlight();/* highlight the element of the tested. */
		pageControlInputFieldElement.sendKeys("google.com"); /*type to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/***************************************************
				*********************************************************************************************
				****************************    End No.23 - Element of Page Control Input Field *************
				*********************************************************************************************
											*****************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.24 -  Element of Save as Template Input Field $$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//24. Element of Save as Template Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div[7]/div[1]/div/div/input")
	WebElement saveasTemplateInputFieldElement;
	
	//24. Highlight the Save as Template Input Field
	public void saveasTemplateInputFieldFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveasTemplateInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveasTemplateInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveasTemplateInputFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveasTemplateInputFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//24. Select from Save as Template Input Field
	public SendPushtoUser saveasTemplateInputFieldField() throws InterruptedException {
		pageControInputFieldFieldHighlight();/* highlight the element of the tested. */
		saveasTemplateInputFieldElement.click(); /*click to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/*******************************************
	 					*************************************************************************************
	 					***********************  End No.24 - Element of Save as Template Input Field ********
	 					*************************************************************************************
												*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.25 -  Element of Clear Button $$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//25. Element of Clear Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div[7]/div[2]/a")
	WebElement clearButtonElement;
	
	//25. Highlight the Clear Button
	public void clearButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", clearButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", clearButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", clearButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", clearButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//25. Click On the from Clear Button
	public SendPushtoUser clickOnclearButtonField() throws InterruptedException {
		clearButtonHighlight();/* highlight the element of the tested. */
		clearButtonElement.click(); /*click to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/*******************************************
						*************************************************************************************
						***********************  End No.25 - Element of Clear Button ************************
						*************************************************************************************
												*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.26 -  Element of Display Total User Button $$$$$$$$$$$$$$$$$
					 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//26. Element of Display Total User Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[4]/button")
	WebElement displayTotalUserButtonElement;
	
	//26. Highlight the Display Total User Button
	public void displayTotalUserButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", displayTotalUserButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", displayTotalUserButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", displayTotalUserButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", displayTotalUserButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//26. Click On the from Display Total User Button
	public SendPushtoUser clickOndisplayTotalUserButtonField() throws InterruptedException {
		displayTotalUserButtonHighlight();/* highlight the element of the tested. */
		displayTotalUserButtonElement.click(); /*click to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/*******************************************
						*************************************************************************************************
						***********************  End No.26 - Element of Display Total User Button ***********************
			*************************************************************************************************************
												*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 		    *$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.27 -  Element of Send Now Button $$$$$$$$$$$$$$$$$
		 		    *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								 				*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//27. Element of Send Now Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[4]/input")
	WebElement sendNowButtonElement;
	
	//27. Highlight the Send Now Button
	public void sendNowButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", sendNowButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", sendNowButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", sendNowButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", sendNowButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//27. Click On the from Send Now Button
	public SendPushtoUser clickOnSendNowButtonField() throws InterruptedException {
		sendNowButtonHighlight();/* highlight the element of the tested. */
		sendNowButtonElement.click(); /*click to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/*******************************************
					 *************************************************************************************************
					 ***********************  End No.27 - Element of Send Now Button **********************************
					 **************************************************************************************************
												*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	    			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.28 -  Element of Pop Up Yes Button   $$$$$$$$$$$$$$$$$
	    			*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				 								*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//28. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[6]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	WebElement popUpYesButtonElement;
	
	//28. Highlight the Pop Up Yes Button
	public void popUpYesButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpYesButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpYesButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpYesButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpYesButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//28. Click On the from Pop Up Yes Button
	public SendPushtoUser clickOnPopUpYesButtonField() throws InterruptedException {
		popUpYesButtonHighlight();/* highlight the element of the tested. */
		popUpYesButtonElement.click(); /*click to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/*******************************************
		 				**************************************************************************************************
		 				***********************  End No.28 - Element of Pop Up Yes Button ********************************
		 				**************************************************************************************************
												*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.29 -  Element of Pop Up No Button   $$$$$$$$$$$$$$$$$
					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//29. Element of Pop Up No Button
	@FindBy(xpath="/html/body/div[6]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]")
	WebElement popUpNoButtonElement;
	
	//29. Highlight the Pop Up No Button
	public void popUpNoButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpNoButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpNoButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpNoButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpNoButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//29. Click On the from Pop Up Yes Button
	public SendPushtoUser clickOnPopUpNoButtonField() throws InterruptedException {
		popUpNoButtonHighlight();/* highlight the element of the tested. */
		popUpNoButtonElement.click(); /*click to the element. */
		return new SendPushtoUser(); 
	}
	
	
	/*******************************************
						 **************************************************************************************************
						 ***********************  End No.29 - Element of Pop Up Yes Button ********************************
						 **************************************************************************************************
												*****************************************************************************************************/
	
}
