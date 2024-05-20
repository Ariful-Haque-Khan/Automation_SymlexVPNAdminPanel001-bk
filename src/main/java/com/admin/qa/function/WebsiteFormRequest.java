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
		driver.get(props.getProperty("url")+"campaign/website_offer_registered_data");
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
	public WebsiteFormRequest typeAndClearAffNamelField() throws InterruptedException {
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
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[1]/input")
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
	
	//03. Element of Search Button
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
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -  Element of edit Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of edit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/div/div/div[2]/div[1]/div/table/tbody/tr/td[11]/a/i")
	WebElement EditButtonElement;
	
	//04. Highlight the edit Button
	public void EditButtonElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", EditButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", EditButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", EditButtonElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", EditButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the edit Button
	public WebsiteFormRequest clickOnEditButton() throws InterruptedException {
		EditButtonElementHighlight();
		EditButtonElement.click();
		Thread.sleep(2000);	
		return new WebsiteFormRequest();
	}
		
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.04 -  Element of edit Button  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -  Element of Name Edit Request input field   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//05. Element of Name Edit input field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement NameEditElement;
	
	//05. Highlight the Name Edit input field Input Field
	public void nameEditFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", NameEditElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", NameEditElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", NameEditElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", NameEditElement);
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Name Edit input field
	public WebsiteFormRequest typeToNameEditFieldParam(String Name_Edit) throws InterruptedException {
		nameEditFieldHighlight();
		NameEditElement.sendKeys(Name_Edit);
		Thread.sleep(2000);	
		return new WebsiteFormRequest();
	}
	
	//05.0.2. Type Name Edit input field (enter text, then clear Name input field)
	public WebsiteFormRequest typeAndClearAffNameEditField(String Name_Edit) throws InterruptedException {
		nameEditFieldHighlight();
		NameEditElement.sendKeys(Name_Edit);
		Thread.sleep(1000);
		NameEditElement.clear();
		return new WebsiteFormRequest();									    			
	}
	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.05 - Element of Name Edit Request input field ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -  Element of email Edit Request input field   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//06. Element of Email Edit input field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement EmailEditElement;
	
	//06. Highlight the Name Edit input field Input Field
	public void emailEditFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", EmailEditElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", EmailEditElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", EmailEditElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", EmailEditElement);
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the Name Edit input field
	public WebsiteFormRequest typeToEmailEditFieldParam(String Name_Edit) throws InterruptedException {
		emailEditFieldHighlight();
		EmailEditElement.sendKeys(Name_Edit);
		Thread.sleep(2000);	
		return new WebsiteFormRequest();
	}
	
	//06.0.2. Type Name Edit input field (enter text, then clear Name input field)
	public WebsiteFormRequest typeAndClearAffEmailEditField() throws InterruptedException {
		emailEditFieldHighlight();
		EmailEditElement.sendKeys();
		Thread.sleep(1000);
		EmailEditElement.clear();
		return new WebsiteFormRequest();									    			
	}
	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.06 - Element of Name input field   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 - Element of Remark Edit Request input field   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//07. Element of Remarks Edit input field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/textarea")
	WebElement remarksEditElement;
	
	//07. Highlight the Remark Edit input field Input Field
	public void remarksEditFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", remarksEditElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", remarksEditElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", remarksEditElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", remarksEditElement);
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the Remark Edit input field
	public WebsiteFormRequest typeToRemarksEditFieldParam(String Remarks) throws InterruptedException {
		remarksEditFieldHighlight();
		remarksEditElement.sendKeys(Remarks);
		Thread.sleep(2000);	
		return new WebsiteFormRequest();
	}
	
	//07.0.2. Type Remark Edit input field (enter text, then clear Name input field)
	public WebsiteFormRequest typeAndClearAffRemarksEditField() throws InterruptedException {
		remarksEditFieldHighlight();
		remarksEditElement.sendKeys();
		Thread.sleep(1000);
		remarksEditElement.clear();
		return new WebsiteFormRequest();									    			
	}
	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.07 - Element of Name input field   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -  Element of Update Request Button (Edit request) $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Update Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement UpdateButtonElement;
	
	//04. Highlight the Update Button
	public void UpdateButtonElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", UpdateButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", UpdateButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", UpdateButtonElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');",UpdateButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Update Button
	public WebsiteFormRequest clickOnUpdateButton() throws InterruptedException {
		UpdateButtonElementHighlight();
		UpdateButtonElement.click();
		Thread.sleep(2000);	
		return new WebsiteFormRequest();
	}
		
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.No.08 -  Element of Update Request Button (Edit request)  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	

	
	
	
	
}
