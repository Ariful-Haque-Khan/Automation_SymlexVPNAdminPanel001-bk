package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class OnlinePINActivation extends TestBase{
	public OnlinePINActivation(){
		PageFactory.initElements(driver, this);
	}
	
	
	public OnlinePINActivation openOnlinePINActivationPage() {
		driver.get(props.getProperty("url")+"client/onlinePinActivation2");
		return new OnlinePINActivation();
	}
	
	@FindBy(name="payment_gate_way")
	WebElement xxxx;
	
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/span/span[1]/span/span[1]")
	WebElement xyz;
	//01. Select Payment Gateway
	public OnlinePINActivation selectPaymentGateway() {
		Select drp = new Select(driver.findElement(By.name("payment_gate_way")));
		//drp.selectByIndex();
		xxxx.click();
		try {Thread.sleep(6000);} catch (InterruptedException ie) {}
		//xyz.click();
		drp.selectByVisibleText("Offline Payment");
		//xxxx.click();
		return new OnlinePINActivation();
	}
	
	//02. Element of Payment TNX ID
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement PaymentTNXIDElement;
	
	//02.  Type to the Payment TNX ID
	public AddPINValidity typetothePaymentTNXID() throws InterruptedException {
		PaymentTNXIDElement.sendKeys("xxx1234fookmmmm");
		return new AddPINValidity();
	}
	
	//03. Element of Price USD
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/input")
	WebElement PriceUSDElement;
	
	//03.  Type to the Price USD
	public AddPINValidity typetothePriceUSD() throws InterruptedException {
		PriceUSDElement.sendKeys("20");
		return new AddPINValidity(); 
	}
	
	//04. Element of Username/PIN
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[4]/div/input")
	WebElement UsernameandPINElement;
	
	//04.  Type to the Username/PIN
	public AddPINValidity typetotheUsernameandPIN() throws InterruptedException {
		UsernameandPINElement.sendKeys("rumy1yr");
		return new AddPINValidity(); 
	}
	
	//05. Element of Verify and Activate Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement VerifyandActivateButtonElement;
	
	//05.  Type to the Verify and Activate Button
	public AddPINValidity clickVerifyandActivateButton() throws InterruptedException {
		VerifyandActivateButtonElement.click();
		return new AddPINValidity(); 
	}
	
	//06. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	WebElement PopUpYesButtonElement;
	
	//06.  Type to the Verify and Activate Button
	public AddPINValidity clickPopUpYesButton() throws InterruptedException {
		Thread.sleep(5000);
		//wait.Until(ExpectedConditions.elementToBeClickable (PopUpYesButtonElement));
		PopUpYesButtonElement.click();
		return new AddPINValidity(); 
	}
	
	//07. Element of Pop Up No Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]")
	WebElement PopUpNoButtonElement;
	
	//07.  Type to the Verify and Activate Button
	public AddPINValidity clickPopUpNoButton() throws InterruptedException {
		Thread.sleep(5000);
		//wait.Until(ExpectedConditions.elementToBeClickable (PopUpYesButtonElement));
		PopUpNoButtonElement.click();
		return new AddPINValidity(); 
	}
}
