package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class OnlinePINMigration extends TestBase{
	public OnlinePINMigration(){
		PageFactory.initElements(driver, this);
	}
	
	public OnlinePINMigration openOnlinePINMigrationPage() {
		driver.get(props.getProperty("url")+"client/pinMigration");
		return new OnlinePINMigration();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of New PIN / Email  $$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	//01. Element of New PIN / Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement newPINandEmailElement;
	
	//01. Highlight the New PIN / Email Input Field
	public void newPINandEmailInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", newPINandEmailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", newPINandEmailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", newPINandEmailElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", newPINandEmailElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the New PIN / Email
	public OnlinePINMigration typeToNewPINandEmail() throws InterruptedException {
		newPINandEmailInputFieldHighlight();
		newPINandEmailElement.sendKeys("rumy1yrfff");
		return new OnlinePINMigration();
	}
	
	/***************************************************************************************************************
     							* *****************************************************************************************************
     							* **************************    End No.01 - Element of New PIN / Email    *****************************
     							* * ***************************************************************************************************
     									      ***************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Password for New PIN / Email  $$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
											*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Password for New PIN / Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement passwordforNewPINandEmailElement;
	
	//02. Highlight the Password for New PIN / Email Input Field
	public void passwordforNewPINandEmailInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordforNewPINandEmailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordforNewPINandEmailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordforNewPINandEmailElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordforNewPINandEmailElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the New PIN / Email
	public OnlinePINMigration typeTopasswordforNewPINandEmail() throws InterruptedException {
		passwordforNewPINandEmailInputFieldHighlight();
		passwordforNewPINandEmailElement.sendKeys("12121234");
		return new OnlinePINMigration();
	}
	
	
	/***************************************************************************************************************
						* *****************************************************************************************************
						* **************************    End No.02 - Element of Password for New PIN / Email    ****************
						* * ***************************************************************************************************
											***************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of old PIN / Email  $$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of old PIN / Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/input")
	WebElement oldPINandEmailElement;
	
	//03. Highlight the Password for New PIN / Email Input Field
	public void oldPINorEmailInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", oldPINandEmailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", oldPINandEmailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", oldPINandEmailElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", oldPINandEmailElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the New PIN / Email
	public OnlinePINMigration typeToOldPINandEmail() throws InterruptedException {
		oldPINorEmailInputFieldHighlight();
		oldPINandEmailElement.sendKeys("rumy1yr24");
		return new OnlinePINMigration();
	}
	
	
	/*************************************************************************************************
	 						* *****************************************************************************************************
	 						* **************************    End No.03 - Element of New PIN / Email    ****************
	 						* * ***************************************************************************************************
	 															***************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Password for Old PIN / Email  $$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
																	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Password for Old PIN / Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/div/div[2]/div[2]/div/input")
	WebElement passwordforOldPINandEmailElement;
	
	//04. Highlight the Password for New PIN / Email Input Field
	public void passwordforOldPINandEmailInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordforOldPINandEmailElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordforOldPINandEmailElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordforOldPINandEmailElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordforOldPINandEmailElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Password for old PIN / Email
	public OnlinePINMigration typeTopasswordforOldPINandEmail() throws InterruptedException {
		passwordforOldPINandEmailInputFieldHighlight();/* highlight the element of the tested. */
		passwordforOldPINandEmailElement.sendKeys("12121234");/*type on the element */
		return new OnlinePINMigration();
	}
	
	/*************************************************************************************************
					* *****************************************************************************************************
					* **************************    End No.04 - Element of Password for old PIN / Email    ****************
					* * ***************************************************************************************************
														***************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Migration Now Button  $$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
																	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//05. Element of Migration Now Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[3]/input")
	WebElement migrationNowButtonElement;
	
	
	//05. Highlight the Migration Now Button
	public void migrationNowButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", migrationNowButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", migrationNowButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", migrationNowButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", migrationNowButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Migration Now Button
	public OnlinePINMigration clickOnmigrationNowButton() throws InterruptedException {
		migrationNowButtonHighlight();
		migrationNowButtonElement.click();
		return new OnlinePINMigration();
	}
	
	/********************************************************
	 							* *****************************************************************************************************
	 							* **************************    End No.05 - Element of Password for old PIN / Email    ****************
	 							* * ***************************************************************************************************
															***************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Pop Up Yes Button  $$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//06. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	WebElement popUpYesButtonElement;
	
	//06. HighlightPop Up Yes Button
	public void popUpYesButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpYesButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpYesButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpYesButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpYesButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the Migration Now Button
	public OnlinePINMigration clickOnpopUpYesButton() throws InterruptedException {
		//Thread.sleep(2000);
		popUpYesButtonHighlight();
		//Thread.sleep(2000);
		popUpYesButtonElement.click();
		return new OnlinePINMigration();
	}
	
	/********************************************************
								* *****************************************************************************************************
								* **************************    End No.06 - Element of Pop Up Yes Button    ***************************
								* * ***************************************************************************************************
															***************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of Pop Up No Button  $$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
								  						  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//07. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]")
	WebElement popUpNoButtonElement;
	
	//07. HighlightPop Up Yes Button
	public void popUpNoButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpNoButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpNoButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", popUpNoButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", popUpNoButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the Migration Now Button
	public OnlinePINMigration clickPopUpNoButton() throws InterruptedException {
		popUpNoButtonHighlight();
		popUpNoButtonElement.click();
		return new OnlinePINMigration();
	}
	
	/********************************************************
	 							* *****************************************************************************************************
	 							* ***************************    End No.07 - Element of Pop Up No Button    ***************************
	 							* * ***************************************************************************************************
	 														***************************************************************************************************/
	
}
