package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class AddPINValidity extends TestBase{
	public AddPINValidity(){
		PageFactory.initElements(driver, this);
	}
	
	public AddPINValidity openAddPINvalidityReport() {
		driver.get(props.getProperty("url")+"client/pinValidity");
		return new AddPINValidity();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Number of Days   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Number of Days
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement numberofDaysElement;
	
	//01. Highlight the Number of Days Input Field
	public void numberofDaysInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberofDaysElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberofDaysElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberofDaysElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberofDaysElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Number of Days
	public AddPINValidity typeToNumberofDays() throws InterruptedException {
		numberofDaysInputFieldHighlight();
		numberofDaysElement.sendKeys("1");
		return new AddPINValidity();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Number of Days    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of PIN Type   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of PIN Type
	@FindBy(xpath="/html/body/div[2]/div/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/select")
	WebElement pinTypeElement;
	
	//02. Highlight the PIN Type Input Field
	public void pinTypeInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberofDaysElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberofDaysElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberofDaysElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberofDaysElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Select from PIN Type Element
	public AddPINValidity typeelementDropDownField() throws InterruptedException {
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/select")));
		drp.selectByIndex(1);
		return new AddPINValidity(); 
	}
	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of PIN Type    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of PIN in CSV or New Line   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	//03. Element of PIN in CSV or New Line
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/textarea")
	WebElement pininCSVorNewLineElement;
	
	//03. Highlight the PIN in CSV or New Line Input Field
	public void pininCSVorNewLineInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pininCSVorNewLineElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pininCSVorNewLineElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pininCSVorNewLineElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pininCSVorNewLineElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the PIN in CSV or New Line
	public AddPINValidity typeToPINinCSVorNewLine() throws InterruptedException {
		pininCSVorNewLineInputFieldHighlight();
		pininCSVorNewLineElement.sendKeys("rumy1yr");
		return new AddPINValidity();
	}
	
	
	/*****************************************************************************
     				******************************************************************************************************
     				***************************    End No.03 - Element of PIN in CSV or New Line    **********************
     				******************************************************************************************************
														***********************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Form Submit Button   $$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Form Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement submitButtonElement;
	
	//04. Highlight the PIN in CSV or New Line Input Field
	public void submitButtonInputButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//04. click on the Form Submit Button
	public AddPINValidity clickOnSubmitButton() throws InterruptedException {
		submitButtonInputButtonHighlight();
		submitButtonElement.click();
		return new AddPINValidity();
	}
	
	/*****************************************************************************
					******************************************************************************************************
					***************************    End No.04 - Element of Form Submit Button    **********************
					******************************************************************************************************
															***********************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 - Element of Pop Up Yes Button   $$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//05. Element of Pop Up Yes Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	WebElement PopUpYesButtonElement;
	
	//05. Highlight the Pop Up Yes Button
	public void popUpYesButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PopUpYesButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", PopUpYesButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PopUpYesButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", PopUpYesButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//05.  Type to the Verify and Activate Button
	public AddPINValidity clickPopUpYesButton() throws InterruptedException {
		Thread.sleep(2000);
		popUpYesButtonHighlight();
		Thread.sleep(2000);
		//wait.Until(ExpectedConditions.elementToBeClickable (PopUpYesButtonElement));
		PopUpYesButtonElement.click();
		return new AddPINValidity(); 
	}
	
	/*****************************************************************************
	 				******************************************************************************************************
	 				***************************    End No.05 - Element of Pop Up Yes Button    ***************************
	 				******************************************************************************************************
																		***********************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 - Element of Pop Up No Button   $$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 											*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of Pop Up No Button
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]")
	WebElement PopUpNoButtonElement;
	
	//06. Highlight the Pop Up No Button
	public void popUpNoButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PopUpNoButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", PopUpNoButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", PopUpNoButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", PopUpNoButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//06.  Type to the Verify and Activate Button
	public AddPINValidity clickPopUpNoButton() throws InterruptedException {
		Thread.sleep(2000);
		popUpNoButtonHighlight();
		Thread.sleep(2000);
		//wait.Until(ExpectedConditions.elementToBeClickable (PopUpYesButtonElement));
		PopUpNoButtonElement.click();
		return new AddPINValidity(); 
	}
	
	/*****************************************************************************
	 					******************************************************************************************************
	 					***************************    End No.06 - Element of Pop Up No Button    ***************************
	 					******************************************************************************************************
																		***********************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 - Element of Number of days - Validation Text  $$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																		*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Number of days - Validation Text
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/label")
	WebElement numberofdaysValidationTextElement;
	
	//07. Highlight the Pop Up No Button
	public void numberofDaysValidationTextHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberofdaysValidationTextElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberofdaysValidationTextElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberofdaysValidationTextElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberofdaysValidationTextElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//07.  get Text from the Number of days - Validation Text
	public String getTextofNumberofDaysValidationText() throws InterruptedException {
		Thread.sleep(2000);
		numberofDaysValidationTextHighlight();
		Thread.sleep(2000);
		//wait.Until(ExpectedConditions.elementToBeClickable (PopUpYesButtonElement));
		String text = numberofdaysValidationTextElement.getText();
		return text;
		//System.out.println(numberofdaysValidationTextElement.getText());
	}
	
	/**********************************************************
	 								***************************************************************************************************
	 								***************************    End No.07 - Element of Number of days - Validation Text    *********
	 								***************************************************************************************************
																	***********************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 - Element of PIN in CSV or New Line - Validation Text  $$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//08. Element of PIN in CSV or New Line - Validation Text
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/label")
	WebElement pininCSVorNewLineValidationTextElement;
	
	//08. Highlight the PIN in CSV or New Line
	public void pininCSVorNewLineValidationTextHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pininCSVorNewLineValidationTextElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pininCSVorNewLineValidationTextElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pininCSVorNewLineValidationTextElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pininCSVorNewLineValidationTextElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//08.  get Text from the PIN in CSV or New Line - Validation Text
	public String getTextofPINinCSVorNewLineValidationText() throws InterruptedException {
		Thread.sleep(2000);
		pininCSVorNewLineValidationTextHighlight();
		Thread.sleep(2000);
		String text = pininCSVorNewLineValidationTextElement.getText();
		return text;
	}
	
	/**************************************************
									***************************************************************************************************
									*******************    End No.08 - Element of PIN in CSV or New Line - Validation Text    *********
									***************************************************************************************************
													  ********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 - Element of Message after Successfully add pin validity  $$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								  								*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//09. Element of Message after Successfully add pin validity
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]")
	WebElement messageAfterSuccessfullyaddpinvalidityTextElement;
	
	
	//09.  get Text from the Message after Successfully add pin validity
	public String getTextofMessageafterSuccessfullyaddpinValidity() throws InterruptedException {
		String text = messageAfterSuccessfullyaddpinvalidityTextElement.getText();
		return text;
	}
	
	/************************
			***************************************************************************************************
			****************    End No.09 - Element of Message after Successfully add pin validity    *********
			***************************************************************************************************
							  ********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$   Start No.10 - Element of Frontend Number of Days for not number in add pin validity  $$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  										  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//10. Element of Frontend Number of Days for not number in add pin validity
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/label")
	WebElement  frontendNumberofDaysfornotnumberTextElement;
	
	
	//10.  get Text from the Message after Successfully add pin validity
	public String getFrontendNumberofDaysfornotnumberinaddpinvalidity() throws InterruptedException {
		String text = frontendNumberofDaysfornotnumberTextElement.getText();
		return text;
	}
	
	/*********************************
	 		 		  ***************************************************************************************************
	 		 		  ****************    End No.10 - Element of Message after Successfully add pin validity    *********
	 		 		  ***************************************************************************************************
			 						 ****************************************************************************************************************/
	
	//Type to the Number of Days with Parameter
	public AddPINValidity typeToNumberofDaysWithParam(String days) throws InterruptedException {
		numberofDaysInputFieldHighlight();
		numberofDaysElement.sendKeys(days);
		return new AddPINValidity();
	}
}
