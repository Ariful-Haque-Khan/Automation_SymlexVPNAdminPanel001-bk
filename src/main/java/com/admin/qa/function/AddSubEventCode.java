package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class AddSubEventCode extends TestBase{
	public AddSubEventCode(){
		PageFactory.initElements(driver, this);
	}
	
	public AddSubEventCode openAddSubEventCodeForm() {
		driver.get(props.getProperty("url")+"paymentMethods/createSubEventCode");
		return new AddSubEventCode();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Payment Method  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Payment Method select Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/select")
	WebElement paymentMethodSelectElement;
	
	//01. Highlight the Payment Method select Field
	public void paymentMethodSelectFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", paymentMethodSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", paymentMethodSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", paymentMethodSelectElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", paymentMethodSelectElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Payment Method select Field
	public AddSubEventCode typetoPaymentMethodSelectField() throws InterruptedException {
		paymentMethodSelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/select")));
		drp.selectByIndex(2);
		return new AddSubEventCode();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Payment Method   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Event Code  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Event Code select Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/select")
	WebElement eventCodeSelectElement;
	
	//01. Highlight the Event Code select Field
	public void eventCodeSelectFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", eventCodeSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", eventCodeSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", eventCodeSelectElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", eventCodeSelectElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Event Code select Field
	public AddSubEventCode typetoEventCodeSelectField() throws InterruptedException {
		eventCodeSelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/select")));
		drp.selectByIndex(2);
		return new AddSubEventCode();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Event Code  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Code $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Code
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input")
	WebElement codeInputFieldElement;
	
	//03. Highlight the Code Input Field
	public void codeInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", codeInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", codeInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", codeInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", codeInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Code 
	public AddSubEventCode typeToCode () throws InterruptedException {
		codeInputFieldHighlight();
		codeInputFieldElement.sendKeys("");
		return new AddSubEventCode();
	}
	
	//03.0.1 Type to Code  parameter
	public AddSubEventCode typeCodeFieldParam(String Code) throws InterruptedException {
		codeInputFieldHighlight();
		codeInputFieldElement.sendKeys(Code);		
		Thread.sleep(2000);		
		return new AddSubEventCode();
	}
	
	//03.0.2. Type Code Input Field (enter text, then clear Code Input Field)
	public AddSubEventCode typeAndClearCodeFieldParam(String Code) throws InterruptedException {
		codeInputFieldHighlight();
		codeInputFieldElement.sendKeys(Code);
		Thread.sleep(100);
		codeInputFieldElement.clear();
		return new AddSubEventCode();									    			
	}		
		
	//03.0.3. Type to Code tab key
	public AddSubEventCode  typetoCodetabKey() throws InterruptedException {
		codeInputFieldHighlight();
		codeInputFieldElement.sendKeys(Keys.TAB);
		return new AddSubEventCode();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.03 - Element of Code   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Short Descriptions $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Short Descriptions
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/textarea")
	WebElement shortDescriptionsFieldElement;
	
	//04. Highlight the Short Descriptions Input Field
	public void shortDescriptionsFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", shortDescriptionsFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", shortDescriptionsFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", shortDescriptionsFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", shortDescriptionsFieldElement);
			Thread.sleep(1000);
		}
	}
	
	
	//04.0.1 Type to Short Descriptions parameter
	public AddSubEventCode typeShortDescriptionsParam(String Short_Descriptions) throws InterruptedException {
		shortDescriptionsFieldHighlight();
		shortDescriptionsFieldElement.sendKeys(Short_Descriptions);		
		Thread.sleep(2000);		
		return new AddSubEventCode();
	}
	
	//04.0.2. Type Short Descriptions Input Field (enter text, then clear Short Descriptions Input Field)
	public AddSubEventCode typeAndClearShortDescriptionsFieldParam(String Short_Descriptions) throws InterruptedException {
		shortDescriptionsFieldHighlight();
		shortDescriptionsFieldElement.sendKeys(Short_Descriptions);
		Thread.sleep(100);
		shortDescriptionsFieldElement.clear();
		return new AddSubEventCode();									    			
	}		
		
	//04.0.3. Type to Short Descriptions tab key
	public AddSubEventCode  typetoShortDescriptionstabKey() throws InterruptedException {
		shortDescriptionsFieldHighlight();
		shortDescriptionsFieldElement.sendKeys(Keys.TAB);
		return new AddSubEventCode();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.04 - Element of Short Descriptions   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Active Check box $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	

    //5. Element of Is Active Check box Field
    @FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[5]/div/input")
    WebElement isActiveCheckboxFieldElement;

    //5. Highlight the Active Check box Field
    public void isActiveCheckboxFieldHighlight() throws InterruptedException {
        if (driver instanceof JavascriptExecutor) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isActiveCheckboxFieldElement);
            Thread.sleep(1000);
            js.executeScript("arguments[0].setAttribute('style', '');", isActiveCheckboxFieldElement);
            Thread.sleep(1000);
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isActiveCheckboxFieldElement);
            Thread.sleep(2000);
            js.executeScript("arguments[0].setAttribute('style', '');", isActiveCheckboxFieldElement);
            Thread.sleep(1000);
         }
     }

    //5. Type to the Is Active Check box Field
    public AddNewEventCode clickTIsActiveCheckboxField() throws InterruptedException {
        isActiveCheckboxFieldHighlight();
        isActiveCheckboxFieldElement.click();
        return new AddNewEventCode();
     }
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.05 - Element of Active Check box  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
    
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Submit Button Field  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//6. Element of Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement submitButtonElement;
	
	//6. Highlight the Submit Button
	public void submitButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",submitButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//6. Click to the Submit Button
	public AddSubEventCode clickONSubmitButton() throws InterruptedException {
		submitButtonInputFieldHighlight();
		submitButtonElement.click();
		return new AddSubEventCode();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.6 - Element of Submit Button Field   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
}

