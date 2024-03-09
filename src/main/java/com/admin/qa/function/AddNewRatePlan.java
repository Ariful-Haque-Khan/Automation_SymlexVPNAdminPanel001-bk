package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddNewRatePlan extends TestBase{
	public AddNewRatePlan(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewRatePlan openRatePlanNameFormPage() {
		driver.get(props.getProperty("url")+"rate/addForm");
		return new AddNewRatePlan();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Rate Plan Name   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Rate Plan Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement ratePlanNameElement;
	
	//01. Highlight the Rate Plan Name Input Field
	public void ratePlanNameElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", ratePlanNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", ratePlanNameElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Rate Plan Name
	public AddNewRatePlan typeToRatePlanNameElement() throws InterruptedException {
		ratePlanNameElementInputFieldHighlight();
		ratePlanNameElement.sendKeys("12ccccc");
		return new AddNewRatePlan();
	}
	
	//02. Type to the APP ID (One Signal)
	public AddNewRatePlan typeToRatePlanNameElemenParam(String $id) throws InterruptedException {
		ratePlanNameElementInputFieldHighlight();
		ratePlanNameElement.sendKeys($id);
			
		Thread.sleep(2000);
			
		return new AddNewRatePlan();
	}
	
	/*******************************************************************************************************************
     			* ******************************************************************************************************
     			* **************************    End No.01 - Element of Rate Plan Name    *******************************
     			* * ****************************************************************************************************
     			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Rate Plan Description   $$$$$$$$$$$$$$$$$$$$$$
	 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 				 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Rate Plan Description
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/textarea")
	WebElement ratePlanDescriptionElement;
	
	//02. Highlight the Rate Plan Description Input Field
	public void ratePlanDescriptionElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanDescriptionElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", ratePlanDescriptionElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanDescriptionElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", ratePlanDescriptionElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Rate Plan Description
	public AddNewRatePlan typeToRatePlanDescriptionElement() throws InterruptedException {
		ratePlanDescriptionElementInputFieldHighlight();
		ratePlanDescriptionElement.sendKeys("12ccccc");
		return new AddNewRatePlan();
	}
	
	//02. Type to the Rate Plan Description
	public AddNewRatePlan typeToRatePlanDescriptionElementParam(String $id) throws InterruptedException {
		ratePlanDescriptionElementInputFieldHighlight();
		ratePlanDescriptionElement.sendKeys($id);
			
		Thread.sleep(2000);
			
		return new AddNewRatePlan();
	}
	
	/*******************************************************************************************************************
     			* ******************************************************************************************************
     			* **************************    End No.02 - Element of Rate Plan Description    ************************
     			* * ****************************************************************************************************
     			******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Rate Plan Status   $$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		 			 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//03. Element of Rate Plan Status
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input")
		WebElement ratePlanStatusElement;
		
		//03. Highlight the Rate Plan Status Input Field
		public void ratePlanStatusElementInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanStatusElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", ratePlanStatusElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanStatusElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", ratePlanStatusElement);
				Thread.sleep(1000);
			}
		}
		
		//03. Type to the Rate Plan Name
		public AddNewRatePlan clickToRatePlanStatusElement() throws InterruptedException {
			ratePlanStatusElementInputFieldHighlight();
			ratePlanNameElement.click();
			return new AddNewRatePlan();
		}
		
		/*******************************************************************************************************************
					* ******************************************************************************************************
					* **************************    End No.03 - Element of Rate Plan Status    *****************************
					* * ****************************************************************************************************
					******************************************************************************************************************************/
		
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Rate Plan Submit Button   $$$$$$$$$$$$$$$$$$$$$$
			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
			 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//04. Element of Rate Plan Submit Button
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
		WebElement ratePlanSubmitButtonElement;
		
		//04. Highlight the Rate Plan Status Input Field
		public void ratePlanSubmitButtonElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanSubmitButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", ratePlanSubmitButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanSubmitButtonElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", ratePlanSubmitButtonElement);
			Thread.sleep(1000);
		}
		}
		
		//04. Type to the Rate Plan Name
		public AddNewRatePlan clickToRatePlanSubmitButtonElement() throws InterruptedException {
			ratePlanSubmitButtonElementInputFieldHighlight();
			ratePlanSubmitButtonElement.click();
			return new AddNewRatePlan();
		}
		
		/*******************************************************************************************************************
				* ******************************************************************************************************
				* **************************    End No.04 - Element of Rate Plan Status    *****************************
				* * ****************************************************************************************************
				******************************************************************************************************************************/
	
	
	
	
}
