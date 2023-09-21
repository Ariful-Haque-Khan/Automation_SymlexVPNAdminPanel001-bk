package com.admin.qa.CampaignForm;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ProfileInformation extends TestBase{
	public ProfileInformation(){
		PageFactory.initElements(driver, this);
	}
	
	public ProfileInformation openProfileInformationPage() {
		driver.get(props.getProperty("url")+"application/profileInfo");
		return new ProfileInformation();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Billing Name   $$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Billing Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement billingNameElement;
	
	//01. Highlight the Billing Name Input Field
	public void billingNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", billingNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", billingNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", billingNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", billingNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Billing Name
	public ProfileInformation typeToBillingName() throws InterruptedException {
		billingNameInputFieldHighlight();/* highlight the element of the tested. */
		billingNameElement.sendKeys("Test");/*type data on the Input text field */
		return new ProfileInformation();
	}
	
	/***********************************************************
	 								* *****************************************************************************************************
	 								* **************************    End No.01 - Element of Billing Name    ********************************
	 								* * ***************************************************************************************************
	 									******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Phone No   $$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of Phone No
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement phoneNoElement;
	
	//02. Highlight the Phone No Input Field
	public void phoneNoInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Phone No
	public ProfileInformation typeToPhoneNoDays() throws InterruptedException {
		phoneNoInputFieldHighlight();/* highlight the element of the tested. */
		phoneNoElement.sendKeys("000-123");/*type data on the Input text field */
		return new ProfileInformation();
	}
	
	/***********************************************************
									* *****************************************************************************************************
									* **************************    End No.02 - Element of Phone No Element    ****************************
									* * ***************************************************************************************************
																****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Email   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//03. Element of Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement emailElement;
	
	//03. Highlight the Phone No Input Field
	public void emailInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Email
	public ProfileInformation typeEmail() throws InterruptedException {
		emailInputFieldHighlight();/* highlight the element of the tested. */
		emailElement.sendKeys("000-123");/*type data on the Input text field */
		return new ProfileInformation();
	}
	
	/***********************************************************
						* *****************************************************************************************************
						* **************************    End No.03 - Element of Email    ***************************************
						* * ***************************************************************************************************
													****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Skype   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
														  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Skype
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/input")
	WebElement skypeElement;
	
	//04. Highlight the Skype Input Field
	public void skypeInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", skypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", skypeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", skypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", skypeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Skype
	public ProfileInformation typeinSkypeInputTextField() throws InterruptedException {
		skypeInputFieldHighlight();/* highlight the element of the tested. */
		skypeElement.sendKeys("Test Skype");/*type data on the Input text field */
		return new ProfileInformation();
	}
	
	/***********************************************************
									* *****************************************************************************************************
									* **************************    End No.04 - Element of Skype    ***************************************
									* * ***************************************************************************************************
																****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Viber/WhatsApp/Imo   $$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Viber/WhatsApp/Imo
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[5]/div/input")
	WebElement viberWhatsAppImoElement;
	
	//05. Highlight the Viber/WhatsApp/Imo Input Field
	public void viberWhatsAppImoElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", viberWhatsAppImoElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", viberWhatsAppImoElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", viberWhatsAppImoElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", viberWhatsAppImoElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Viber/WhatsApp/Imo
	public ProfileInformation typeinviberWhatsAppImoElementInputTextField() throws InterruptedException {
		viberWhatsAppImoElementInputFieldHighlight();/* highlight the element of the tested. */
		viberWhatsAppImoElement.sendKeys("000-123");/*type data on the Input text field */
		return new ProfileInformation();
	}
	
	/***********************************************************
						* *****************************************************************************************************
						* **************************    End No.05 - Element of Address    *************************************
						* * ***************************************************************************************************
													****************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Address   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of Address
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[6]/div/textarea")
	WebElement addressElement;
	
	//06. Highlight the Address Input Field
	public void addressElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", addressElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", addressElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", addressElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", addressElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the Address
	public ProfileInformation typeinAddressElementInputTextField() throws InterruptedException {
		addressElementInputFieldHighlight();/* highlight the element of the tested. */
		addressElement.sendKeys("Dhaka, Bangladesh");/*type data on the Input text field */
		return new ProfileInformation();
	}
	
	/***********************************************************
									* *****************************************************************************************************
									* **************************    End No.06 - Element of Address    *************************************
									* * ***************************************************************************************************
																***************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of Features Status   $$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Features Status
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[5]/div/input")
	WebElement featuresStatusElement;
	
	//07. Highlight the Features Status Checkbox Field
	public void featuresStatusElementElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", featuresStatusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", featuresStatusElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", featuresStatusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", featuresStatusElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the Features Status Element
	public ProfileInformation clickOnFeaturesStatusInputCheckboxField() throws InterruptedException {
		featuresStatusElementElementInputFieldHighlight();/* highlight the element of the tested. */
		featuresStatusElement.click();/*type data on the Input text field */
		return new ProfileInformation();
	}
	
	/***********************************************************
									* *****************************************************************************************************
									* **************************    End No.07 - Element of  Features Status    ****************************
									* * ***************************************************************************************************
																***************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of Logo   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//08. Element of Logo
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[3]/div/div[2]/div[2]/div/input")
	WebElement logoElement;
	
	//08. Highlight the Logo
	public void logoInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", logoElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", logoElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", logoElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", logoElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//08. Type to the Features Status Element
	public ProfileInformation typeOnLogoInputImageField() throws InterruptedException {
		logoInputFieldHighlight();/* highlight the element of the tested. */
		logoElement.sendKeys("C:\\Users\\rumyk\\Downloads\\image\\images.jpeg");/*type data on the Input text field */
		return new ProfileInformation();
	}
	
	/***********************************************************
									* *****************************************************************************************************
									* **************************    End No.08 - Element of  Image    **************************************
									* * ***************************************************************************************************
													***************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Save Profile Button   $$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//09. Element of Save Profile Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[4]/input[2]")
	WebElement saveProfileButtonElement;
	
	//09. Highlight the Save Profile Button
	public void saveProfileButtonFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveProfileButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveProfileButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveProfileButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveProfileButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Save Profile Button Element
	public ProfileInformation clickOnsaveProfileButtonField() throws InterruptedException {
		saveProfileButtonFieldHighlight();/* highlight the element of the tested. */
		saveProfileButtonElement.click();/*type data on the Input text field */
		return new ProfileInformation();
	}
	
	/***********************************************************
						* *****************************************************************************************************
						* **************************    End No.09 - Element of  Save Profile Button    ************************
						* * ***************************************************************************************************
										***************************************************************************************************/
	
	
}
