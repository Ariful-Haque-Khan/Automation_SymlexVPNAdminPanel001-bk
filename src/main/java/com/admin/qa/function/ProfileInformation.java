package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ProfileInformation extends TestBase{
	public ProfileInformation(){
		PageFactory.initElements(driver, this);
	}
	
	public ProfileInformation openProfileInformationForm() {
		driver.get(props.getProperty("url")+"application/profileInfo");
		return new ProfileInformation();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Billing Name  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Billing Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement billingNameElement;
	
	//01. Highlight the Billing Name Input Field
	public void billingNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", billingNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", billingNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", billingNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", billingNameElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Billing Name
	public ProfileInformation typeToBillingName() throws InterruptedException {
		billingNameInputFieldHighlight();
		billingNameElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//01.0.1 Type to Billing Name parameter
	public ProfileInformation typeBillingNameFieldParam(String Billing_Name) throws InterruptedException {
		billingNameInputFieldHighlight();
		billingNameElement.sendKeys(Billing_Name);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	
	//01.0.2. Type Billing Name Input Field (enter text, then clear Billing Name Input Field)
	public ProfileInformation typeAndClearBillingNameFieldParam(String Billing_Name) throws InterruptedException {
		billingNameInputFieldHighlight();
		billingNameElement.sendKeys(Billing_Name);
		Thread.sleep(100);
		billingNameElement.clear();
		return new ProfileInformation();									    			
	}		
		
	//1.0.3. Type to Billing Name tab key
	public ProfileInformation  typetoBillingNametabKey() throws InterruptedException {
		billingNameInputFieldHighlight();
		billingNameElement.sendKeys(Keys.TAB);
		return new ProfileInformation();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Billing Name   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Phone No  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Phone No
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement phoneNoElement;
	
	//02. Highlight the Phone No Input Field
	public void phoneNoInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Phone No
	public ProfileInformation typeToPhoneNo() throws InterruptedException {
		phoneNoInputFieldHighlight();
		phoneNoElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//02.0.1 Type to Phone No parameter
	public ProfileInformation typePhoneNoFieldParam(String Phone_No) throws InterruptedException {
		phoneNoInputFieldHighlight();
		phoneNoElement.sendKeys(Phone_No);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	
	//02.0.2. Type Phone No Input Field (enter text, then clear Phone No Input Field)
	public ProfileInformation typeAndClearPhoneNoFieldParam(String Phone_No) throws InterruptedException {
		phoneNoInputFieldHighlight();
		phoneNoElement.sendKeys(Phone_No);
		Thread.sleep(100);
		phoneNoElement.clear();
		return new ProfileInformation();									    			
	}		
		
	//2.0.3. Type to Phone No tab key
	public ProfileInformation  typetoPhoneNotabKey() throws InterruptedException {
		phoneNoInputFieldHighlight();
		phoneNoElement.sendKeys(Keys.TAB);
		return new ProfileInformation();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Phone No   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Email  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement emailElement;
	
	//03. Highlight the Email Input Field
	public void emailInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Email
	public ProfileInformation typeToEmail() throws InterruptedException {
		emailInputFieldHighlight();
		emailElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//03.0.1 Type to Email parameter
	public ProfileInformation typeEmailFieldParam(String Email) throws InterruptedException {
		emailInputFieldHighlight();
		emailElement.sendKeys(Email);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	
	//03.0.2. Type Email Input Field (enter text, then clear Email Input Field)
	public ProfileInformation typeAndClearEmailFieldParam(String Email) throws InterruptedException {
		emailInputFieldHighlight();
		emailElement.sendKeys(Email);
		Thread.sleep(100);
		emailElement.clear();
		return new ProfileInformation();									    			
	}		
		
	//3.0.3. Type to Email tab key
	public ProfileInformation  typetoEmailtabKey() throws InterruptedException {
		emailInputFieldHighlight();
		emailElement.sendKeys(Keys.TAB);
		return new ProfileInformation();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.03 - Element of Email   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Skype  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Skype
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/input")
	WebElement skypeElement;
	
	//04. Highlight the Skype Input Field
	public void skypeInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", skypeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", skypeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", skypeElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", skypeElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Skype
	public ProfileInformation typeToSkype() throws InterruptedException {
		skypeInputFieldHighlight();
		skypeElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//04.0.1 Type to Skype parameter
	public ProfileInformation typeSkypeFieldParam(String Skype) throws InterruptedException {
		skypeInputFieldHighlight();
		skypeElement.sendKeys(Skype);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	
	//04.0.2. Type Skype Input Field (enter text, then clear Skype Input Field)
	public ProfileInformation typeAndClearSkypeFieldParam(String Skype) throws InterruptedException {
		skypeInputFieldHighlight();
		skypeElement.sendKeys(Skype);
		Thread.sleep(100);
		skypeElement.clear();
		return new ProfileInformation();									    			
	}		
		
	//4.0.3. Type to Skype tab key
	public ProfileInformation  typetoSkypetabKey() throws InterruptedException {
		skypeInputFieldHighlight();
		skypeElement.sendKeys(Keys.TAB);
		return new ProfileInformation();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.04 - Element of Skype  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Viber/WhatsApp/Imo  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//05. Element of Viber/WhatsApp/Imo
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[5]/div/input")
	WebElement viberWhatsAppImoElement;
	
	//05. Highlight the Viber/WhatsApp/Imo Input Field
	public void viberWhatsAppImoInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", viberWhatsAppImoElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", viberWhatsAppImoElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", viberWhatsAppImoElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", viberWhatsAppImoElement);
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Viber/WhatsApp/Imo
	public ProfileInformation typeToViberWhatsAppImo() throws InterruptedException {
		viberWhatsAppImoInputFieldHighlight();
		viberWhatsAppImoElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//05.0.1 Type to Viber/WhatsApp/Imo parameter
	public ProfileInformation typeViberWhatsAppImoFieldParam(String Skype) throws InterruptedException {
		viberWhatsAppImoInputFieldHighlight();
		viberWhatsAppImoElement.sendKeys(Skype);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	
	//05.0.2. Type Viber/WhatsApp/Imo Input Field (enter text, then clear Viber/WhatsApp/Imo Input Field)
	public ProfileInformation typeAndClearViberWhatsAppImoFieldParam(String Skype) throws InterruptedException {
		viberWhatsAppImoInputFieldHighlight();
		viberWhatsAppImoElement.sendKeys(Skype);
		Thread.sleep(100);
		viberWhatsAppImoElement.clear();
		return new ProfileInformation();									    			
	}		
		
	//5.0.3. Type to Viber/WhatsApp/Imo tab key
	public ProfileInformation  typetoViberWhatsAppImotabKey() throws InterruptedException {
		viberWhatsAppImoInputFieldHighlight();
		viberWhatsAppImoElement.sendKeys(Keys.TAB);
		return new ProfileInformation();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.05 - Element of Viber/WhatsApp/Imo  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Address  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//06. Element of Address
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[6]/div/textarea")
	WebElement addressElement;
	
	//06. Highlight the Address Input Field
	public void addressElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", addressElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", addressElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", addressElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", addressElement);
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the Address
	public ProfileInformation typeToAddress() throws InterruptedException {
		addressElementInputFieldHighlight();
		addressElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//06.0.1 Type to Address parameter
	public ProfileInformation typeAddressFieldParam(String Skype) throws InterruptedException {
		addressElementInputFieldHighlight();
		addressElement.sendKeys(Skype);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	
	//06.0.2. Type Address Input Field (enter text, then clear Address Input Field)
	public ProfileInformation typeAndClearAddressFieldParam(String Skype) throws InterruptedException {
		addressElementInputFieldHighlight();
		addressElement.sendKeys(Skype);
		Thread.sleep(100);
		addressElement.clear();
		return new ProfileInformation();									    			
	}		
		
	//6.0.3. Type to Address tab key
	public ProfileInformation  typetoAddresstabKey() throws InterruptedException {
		addressElementInputFieldHighlight();
		addressElement.sendKeys(Keys.TAB);
		return new ProfileInformation();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.06 - Element of Address  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of Billing Name Color  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//07. Element of Billing Name Color
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[1]/div/input")
	WebElement billingNameColorElement;
	
	//07. Highlight the Billing Name Color Input Field
	public void billingNameColorInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", billingNameColorElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", billingNameColorElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", billingNameColorElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", billingNameColorElement);
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the Billing Name Color
	public ProfileInformation typeToBillingNameColor() throws InterruptedException {
		billingNameColorInputFieldHighlight();
		billingNameColorElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//07.0.1 Type to Billing Name Color parameter
	public ProfileInformation typeBillingNameColorFieldParam(String Skype) throws InterruptedException {
		billingNameColorInputFieldHighlight();
		billingNameColorElement.sendKeys(Skype);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	

	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.07 - Element of Billing Name Color  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of Login Background Color  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//08. Element of Login Background Color
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[2]/div/input")
	WebElement loginBackgroundColorElement;
	
	//08. Highlight the Login Background Color Input Field
	public void loginBackgroundColorInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginBackgroundColorElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginBackgroundColorElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginBackgroundColorElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginBackgroundColorElement);
			Thread.sleep(1000);
		}
	}
	
	//08. Type to the Login Background Color
	public ProfileInformation typeToLoginBackgroundColor() throws InterruptedException {
		billingNameColorInputFieldHighlight();
		billingNameColorElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//08.0.1 Type to Login Background Color parameter
	public ProfileInformation typeLoginBackgroundColorFieldParam(String Billing_Name_Color) throws InterruptedException {
		billingNameColorInputFieldHighlight();
		billingNameColorElement.sendKeys(Billing_Name_Color);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	

	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.08 - Element of Login Background Color  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Login Header Color  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//09. Element of Login Header Color 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[3]/div/input")
	WebElement loginHeaderColorElement;
	
	//09. Highlight the Login Header Color  Input Field
	public void loginHeaderColorInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginHeaderColorElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginHeaderColorElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginHeaderColorElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginHeaderColorElement);
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Login Header Color 
	public ProfileInformation typeToLoginHeaderColor() throws InterruptedException {
		loginHeaderColorInputFieldHighlight();
		loginHeaderColorElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//09.0.1 Type to Login Header Color  parameter
	public ProfileInformation typeLoginHeaderColorFieldParam(String Login_Header_Color) throws InterruptedException {
		loginHeaderColorInputFieldHighlight();
		loginHeaderColorElement.sendKeys(Login_Header_Color);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	

	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.09 - Element of Login Header Color  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Switch Header Color  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//09. Element of Switch Header Color 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[4]/div/input")
	WebElement switchHeaderColorElement;
	
	//09. Highlight the Switch Header Color  Input Field
	public void switchHeaderColorInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", switchHeaderColorElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", switchHeaderColorElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", switchHeaderColorElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", switchHeaderColorElement);
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Switch Header Color
	public ProfileInformation typeToSwitchHeaderColor() throws InterruptedException {
		switchHeaderColorInputFieldHighlight();
		switchHeaderColorElement.sendKeys("");
		return new ProfileInformation();
	}
	
	//09.0.1 Type to Switch Header Color  parameter
	public ProfileInformation typeSwitchHeaderColorFieldParam(String Switch_Header_Color) throws InterruptedException {
		switchHeaderColorInputFieldHighlight();
		switchHeaderColorElement.sendKeys(Switch_Header_Color);		
		Thread.sleep(2000);		
		return new ProfileInformation();
	}
	

	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.10 - Element of Switch Header Color  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.11 -   Element of Save profile button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//11. Element of Save button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[4]/input[2]")
	WebElement saveProfileElement;
	
	//11. Highlight the Save button
	public void saveButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveProfileElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveProfileElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveProfileElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveProfileElement);
			Thread.sleep(1000);
		}
	}
	
	//11. Click to the Save button
	public ProfileInformation clickOnSaveProfileButton() throws InterruptedException {
		saveButtonInputFieldHighlight();
		saveProfileElement.click();
		return new ProfileInformation();
	}
	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.11 - Element of Save profile button  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	
	
}
