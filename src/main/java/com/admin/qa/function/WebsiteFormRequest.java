package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class WebsiteFormRequest extends TestBase{
	public WebsiteFormRequest(){
		PageFactory.initElements(driver, this);
	}
	
	public WebsiteFormRequest openWebsiteFormRequestReport() {
		driver.get(props.getProperty("url")+"campaign/website_offer_registered_data#");
		return new WebsiteFormRequest();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -  Element of Name input field   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Name input field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/div[1]/input")
	WebElement NameSearchElement;
	
	//01. Highlight the Name input field Input Field
	public void nameSearchFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", NameSearchElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", NameSearchElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", NameSearchElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", NameSearchElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Name input field
	public WebsiteFormRequest typeToNameFieldParam(String Name) throws InterruptedException {
		nameSearchFieldHighlight();
		NameSearchElement.sendKeys(Name);
		Thread.sleep(2000);	
		return new WebsiteFormRequest();
	}
	
	//27.0.2. Type Name input field (enter text, then clear Name input field)
	public WebsiteFormRequest typeAndClearAffNamelAddressField() throws InterruptedException {
		nameSearchFieldHighlight();
		NameSearchElement.sendKeys();
		Thread.sleep(1000);
		NameSearchElement.clear();
		return new WebsiteFormRequest();									    			
	}
	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Name input field   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -  Element of Email input field   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Email input field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/div[1]/input")
	WebElement emailSearchElement;
	
	//02. Highlight the Email input field Input Field
	public void emailSearchFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailSearchElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailSearchElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailSearchElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailSearchElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Email input field
	public WebsiteFormRequest typeToEmailFieldParam(String Name) throws InterruptedException {
		emailSearchFieldHighlight();
		emailSearchElement.sendKeys(Name);
		Thread.sleep(2000);	
		return new WebsiteFormRequest();
	}
	
	//02.0.01 Type Email input field (enter text, then clear Email input field)
	public WebsiteFormRequest typeAndClearEmailField() throws InterruptedException {
		emailSearchFieldHighlight();
		emailSearchElement.sendKeys();
		Thread.sleep(1000);
		emailSearchElement.clear();
		return new WebsiteFormRequest();									    			
	}
		
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Email input field   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -  Element of Search Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element ofSearch Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[9]/a")
	WebElement SearchButtonElement;
	
	//03. Highlight the Search Button
	public void SearchButtonElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", SearchButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", SearchButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", SearchButtonElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", SearchButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Search Button
	public WebsiteFormRequest clickOnSearchButton() throws InterruptedException {
		SearchButtonElementHighlight();
		SearchButtonElement.click();
		Thread.sleep(2000);	
		return new WebsiteFormRequest();
	}
		
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.03 -  Element of Search Button  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	

	
	
	
	
}
