package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class OnlinePINActivation extends TestBase{
	public OnlinePINActivation(){
		PageFactory.initElements(driver, this);
	}
	
	public OnlinePINActivation openOnlinePINActivationPage() {
		driver.get(props.getProperty("url")+"client/onlinePinActivation2");
		return new OnlinePINActivation();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 - Element of Payment Gateway   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//1. Select from Payment Gateway Element
	@FindBy(name="payment_gate_way")
	WebElement paymentGateway;
	
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/span/span[1]/span/span[1]")
	WebElement paymentGatewaySelect;
	
	// 01. Element of Payment Gateway Drop Down Field expandable list
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/span")
	WebElement dropDownPaymentGatewayElementSelect;
	
	// 01. Element of Payment Gateway Drop Down Field Input
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInPaymentGatewayElement;
	
	// 01. Element of Payment Gateway Drop Down Field Search First Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearchInPaymentGatewayElement;
	
	//01. Highlight the Payment Gateway Element
	public void paymentGatewayElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", paymentGatewaySelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", paymentGatewaySelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", paymentGatewaySelect);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", paymentGatewaySelect);
			Thread.sleep(1000);
		}
	}
	
	//01. Select Payment Gateway
	public OnlinePINActivation selectPaymentGateway() throws InterruptedException {
		paymentGatewayElementHighlight();
		dropDownPaymentGatewayElementSelect.click(); /*click on the expandable list */
		try {Thread.sleep(6000);} catch (InterruptedException ie) {}
		searchInPaymentGatewayElement.sendKeys("off"); /* type on the search bar */
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		valueForSearchInPaymentGatewayElement.click();/* click on the Single value */
		return new OnlinePINActivation();
	}
	
	
	/***************************************************************************************************************
     						* *****************************************************************************************************
     						* **************************    End No.01 - Element of Payment Gateway    ************************************
     						* * ***************************************************************************************************
     									******************************************************************************************************************************/
	
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 - Element of Payment TNX ID   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Payment TNX ID
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement PaymentTNXIDElement;
	
	//02. Highlight the Payment TNX ID Input Field
	public void paymentTNXIDInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PaymentTNXIDElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", PaymentTNXIDElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PaymentTNXIDElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", PaymentTNXIDElement);
			Thread.sleep(1000);
		}
	}
	
	//02.  Type to the Payment TNX ID
	public OnlinePINActivation typetothePaymentTNXID() throws InterruptedException {
		paymentTNXIDInputFieldHighlight();
		PaymentTNXIDElement.sendKeys("xxx1234fookmmmm");
		return new OnlinePINActivation();
	}
	
	//02.1  Type to the Payment TNX ID
	public OnlinePINActivation typetothePaymentTNXIDParam(String payment_tnx_id) throws InterruptedException {
		paymentTNXIDInputFieldHighlight();
		PaymentTNXIDElement.sendKeys(payment_tnx_id);
		return new OnlinePINActivation();
	}
	
	/***************************************************************************************************************
						* *****************************************************************************************************
						* **************************    End No.02 - Element of Payment TNX ID    ************************************
						* * ***************************************************************************************************
									******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 - Element of Price USD   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Price USD
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/input")
	WebElement PriceUSDElement;
	
	//03. Highlight the Price USD Input Field
	public void priceUSDInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PriceUSDElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", PriceUSDElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PriceUSDElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", PriceUSDElement);
			Thread.sleep(1000);
		}
	}
	
	//03.  Type to the Price USD
	public OnlinePINActivation typetothePriceUSD() throws InterruptedException {
		priceUSDInputFieldHighlight();
		PriceUSDElement.sendKeys("20");
		return new OnlinePINActivation(); 
	}
	
	//03.1  Type to the Price USD
	public OnlinePINActivation typetothePriceUSDParam(String price_usd) throws InterruptedException {
		priceUSDInputFieldHighlight();
		PriceUSDElement.sendKeys(price_usd);
		return new OnlinePINActivation(); 
	}
	
	/***************************************************************************************************************
     					* *****************************************************************************************************
     					* **************************    End No.03 - Element of Price USD    ******************************************
     					* * *****************************************************************************************************
     									******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 - Element of Username or PIN   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Username/PIN
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[4]/div/input")
	WebElement UsernameandPINElement;
	
	
	//03. Highlight the Username OR PIN Input Field
	public void usernameAndPINInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", UsernameandPINElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", UsernameandPINElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", UsernameandPINElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", UsernameandPINElement);
			Thread.sleep(1000);
		}
	}
	
	//04.  Type to the Username/PIN
	public OnlinePINActivation typetotheUsernameandPIN() throws InterruptedException {
		usernameAndPINInputFieldHighlight();
		UsernameandPINElement.sendKeys("rumy1yr2ww");
		return new OnlinePINActivation(); 
	}
	
	//04.1  Type to the Username/PIN
	public OnlinePINActivation typetotheUsernameandPINParam(String username_0r_pin) throws InterruptedException {
		usernameAndPINInputFieldHighlight();
		UsernameandPINElement.sendKeys(username_0r_pin);
		return new OnlinePINActivation(); 
	}
	
	/***************************************************************************************************************
					* *****************************************************************************************************
					* **************************    End No.04 - Element of Username or PIN    ******************************************
					* * *****************************************************************************************************
									******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 - Element of Payment Via   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Payment Via Drop Down Field expandable list
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[5]/div[1]/div/span")
	WebElement dropDownPaymentViaElementSelect;
	
	//05. Element of Payment Gateway Drop Down Field Input
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInPaymentViaElement;
	
	//05. Element of Payment Via Drop Down Field Search First Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearchInPaymentViaElement;
	
	//05. Highlight the Payment Via Element
	public void paymentViaElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPaymentViaElementSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPaymentViaElementSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPaymentViaElementSelect);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPaymentViaElementSelect);
			Thread.sleep(1000);
		}
	}
	
	//05. Select Payment Via
	public OnlinePINActivation selectPaymentVia() throws InterruptedException {
		paymentViaElementHighlight();
		dropDownPaymentViaElementSelect.click(); /* click on the expandable list */
		try {Thread.sleep(6000);} catch (InterruptedException ie) {}
		searchInPaymentViaElement.sendKeys("bank"); /* type on the search bar */
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		valueForSearchInPaymentViaElement.click();/* click on the Single value */
		return new OnlinePINActivation();
	}
	
	
	/***************************************************************************************************************
						*****************************************************************************************************
						***************************    End No.05 - Element of Payment Via    ********************************
						*****************************************************************************************************
								******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 - Element of Rate Plan   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of Rate Plan Drop Down Field expandable list
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[5]/div[2]/div/span")
	WebElement dropDownRatePlanElementSelect;
	
	//06. Element of Rate Plan Drop Down Field Input
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInRatePlanElement;
	
	//06. Element of Rate Plan Drop Down Field Search First Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearchInRatePlanElement;
	
	//06. Highlight the Rate Plan Element
	public void ratePlanElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownRatePlanElementSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownRatePlanElementSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownRatePlanElementSelect);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownRatePlanElementSelect);
			Thread.sleep(1000);
		}
	}
	
	//06. Select Payment Via
	public OnlinePINActivation selectRatePlan() throws InterruptedException {
		ratePlanElementHighlight();
		dropDownRatePlanElementSelect.click(); /* click on the expandable list */
		try {Thread.sleep(3000);} catch (InterruptedException ie) {}
		searchInRatePlanElement.sendKeys("Life"); /* type on the search bar */
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		valueForSearchInRatePlanElement.click();/* click on the Single value */
		return new OnlinePINActivation();
	}
	
	
	/***************************************************************************************************************
						*****************************************************************************************************
						***************************    End No.06 - Element of Rate Plan   ********************************
						*****************************************************************************************************
								******************************************************************************************************************************/
	
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 - Element of Remarks   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Remarks
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[5]/div[3]/div/textarea")
	WebElement remarksElement;
	
	
	//07. Highlight the Remarks Input Field
	public void remarksInputFieldHighlight() throws InterruptedException {
	if (driver instanceof JavascriptExecutor) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", remarksElement);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', '');", remarksElement);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", remarksElement);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', '');", remarksElement);
		Thread.sleep(1000);
		}
	}
	
	//07.  Type to the Remarks
	public AddPINValidity typetotheRemarks() throws InterruptedException {
		remarksInputFieldHighlight();
		remarksElement.click();
		remarksElement.sendKeys("Test");
		return new AddPINValidity(); 
	}
	
	/***************************************************************************************************************
			* *******************************************************************************************************
			* **************************    End No.07 - Element of Remarks    ******************************************
			* * *****************************************************************************************************
							******************************************************************************************************************************/
	


	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 			   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 			   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 - Verify and Activate Button   $$$$$$$$$$$$$$$$$$$$$$$
	 			   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//08. Element of Verify and Activate Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement VerifyandActivateButtonElement;
	
	
	//08. Highlight the Remarks Input Field
	public void verifyandActivateButtonHighlight() throws InterruptedException {
	if (driver instanceof JavascriptExecutor) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", VerifyandActivateButtonElement);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', '');", VerifyandActivateButtonElement);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", VerifyandActivateButtonElement);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', '');", VerifyandActivateButtonElement);
		Thread.sleep(1000);
		}
	}
	
	//08.  Type to the Verify and Activate Button
	public AddPINValidity clickVerifyandActivateButton() throws InterruptedException {
		verifyandActivateButtonHighlight();
		VerifyandActivateButtonElement.click();
		return new AddPINValidity(); 
	}
	
	/***************************************************************************************************************
	 			* *******************************************************************************************************
	 			* **************************    End No.08 - Element of Verify and Activate Button    ******************************************
	 			* * *****************************************************************************************************
					******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 			* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 			* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 - Element of Pop Up Yes Button   $$$$$$$$$$$$$$$$$$$$$$$
	 			* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//09. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	WebElement PopUpYesButtonElement;
	
	//09. Highlight the Remarks Input Field
	public void popUpYesButtonHighlight() throws InterruptedException {
	if (driver instanceof JavascriptExecutor) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PopUpYesButtonElement);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', '');", PopUpYesButtonElement);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PopUpYesButtonElement);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', '');", PopUpYesButtonElement);
		Thread.sleep(1000);
		}
	}
	
	//09.  Type to the Verify and Activate Button
	public AddPINValidity clickPopUpYesButton() throws InterruptedException {
		popUpYesButtonHighlight();
		Thread.sleep(2000);
		//wait.Until(ExpectedConditions.elementToBeClickable (PopUpYesButtonElement));
		PopUpYesButtonElement.click();
		return new AddPINValidity(); 
	}
	
	/***************************************************************************************************************
					* *******************************************************************************************************
					* **************************    End No.09 - Element of Pop Up Yes Button    ********************
					* * *****************************************************************************************************
								******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.010 - Element of Pop Up No Button   $$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//010. Element of Pop Up No Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]")
	WebElement PopUpNoButtonElement;
	
	//010. Highlight the Pop Up No Button
	public void popUpNoButtonHighlight() throws InterruptedException {
	if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PopUpNoButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", PopUpNoButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PopUpNoButtonElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", PopUpNoButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//010.  Type to the Pop Up No Button
	public AddPINValidity clickPopUpNoButton() throws InterruptedException {
		Thread.sleep(5000);
		popUpNoButtonHighlight();
		PopUpNoButtonElement.click();
		return new AddPINValidity(); 
	}
	
	/***************************************************************************************************************
	 				* **********************************************************************************************
	 				* **************************    End No.010 - Element of Pop Up No Button    ********************
	 				* * ********************************************************************************************
										**************************************************************************************************************************/
}
