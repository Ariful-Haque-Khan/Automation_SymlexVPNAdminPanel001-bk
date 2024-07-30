package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AppCrcBlockListElement extends TestBase{
	public AppCrcBlockListElement(){
		PageFactory.initElements(driver, this);
	}
	
	public AppCrcBlockListElement openAddNewBlockAppCRCForm() {
		driver.get(props.getProperty("url")+"Application/add_block_crc");
		return new AppCrcBlockListElement();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of APP CRC  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of APP CRC
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div/div/input")
	WebElement appCRCElement;
	
	//01. Highlight the APP CRC Input Field
	public void appCRCElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appCRCElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", appCRCElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appCRCElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", appCRCElement);
			Thread.sleep(1000);
		}
	}
	
	
	//01.0.1 Type to APP CRC parameter
	public AppCrcBlockListElement typeAppCRCFieldParam(String App_CRC) throws InterruptedException {
		appCRCElementInputFieldHighlight();
		appCRCElement.sendKeys(App_CRC);		
		Thread.sleep(2000);		
		return new AppCrcBlockListElement();
	}
	
	//01.0.2. Type APP CRC Input Field (enter text, then clear APP CRC Input Field)
	public AppCrcBlockListElement typeAndClearAppCRCFieldParam(String App_CRC) throws InterruptedException {
		appCRCElementInputFieldHighlight();
		appCRCElement.sendKeys(App_CRC);
		Thread.sleep(500);
		appCRCElement.clear();
		return new AppCrcBlockListElement();									    			
	}		
		
	//1.0.3. Type to APP CRC tab key
	public AppCrcBlockListElement  typetoAppCRCtabKey() throws InterruptedException {
		appCRCElementInputFieldHighlight();
		appCRCElement.sendKeys(Keys.TAB);
		return new AppCrcBlockListElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of APP CRC   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Save button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//2. Element of Save button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement saveElement;
	
	//2. Highlight the Save button
	public void saveButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveElement);
			Thread.sleep(1000);
		}
	}
	
	//2. Click to the Save button
	public AppCrcBlockListElement clickONSubmitButton() throws InterruptedException {
		saveButtonInputFieldHighlight();
		saveElement.click();
		return new AppCrcBlockListElement();
	}
	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Save button   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	
	
	
}
