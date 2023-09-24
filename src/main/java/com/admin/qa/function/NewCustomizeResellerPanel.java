package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class NewCustomizeResellerPanel extends TestBase{
	public NewCustomizeResellerPanel(){
		PageFactory.initElements(driver, this);
	}
	
	public NewCustomizeResellerPanel openNewCustomizeResellerPanelPage() {
		driver.get(props.getProperty("url")+"reseller_panels/create");
		return new NewCustomizeResellerPanel();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Custom Panel Name  $$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		  						  						  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Custom Panel Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement customPanelNameElement;
	
	//01. Highlight Custom Panel Name
	public void customPanelNameHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", customPanelNameElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", customPanelNameElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", customPanelNameElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", customPanelNameElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Custom Panel Name
	public NewCustomizeResellerPanel typeToCustomPanelName() throws InterruptedException {
		customPanelNameHighlight();/* highlight the element of the tested. */
		customPanelNameElement.sendKeys("1");/*type on the element */
		return new NewCustomizeResellerPanel();
	}
	
	/***************************************************
							* *****************************************************************************************************
							* **************************    End No.01 - Element of Custom Panel Name    ****************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Reseller with Level  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
			  						  						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//02. PIN Type Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/span")
	WebElement dropDownIPBundlemainSelect;
	
	//02.PIN Type Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInDropDown;
	
	//02. PIN Type Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearch;
	
	//02. Highlight of Reseller with Level Element for First click On the Element 
	public void resellerwithLevelHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIPBundlemainSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIPBundlemainSelect);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIPBundlemainSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIPBundlemainSelect);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//2. Select from Reseller with Level Element
	public NewCustomizeResellerPanel searchandtypeelementDropDownField() throws InterruptedException {
		resellerwithLevelHighlight();/* highlight the element of the tested. */
		dropDownIPBundlemainSelect.click(); /*click on the element */
		searchInDropDown.sendKeys("abcvp");/*type on the input field */
		valueForSearch.click();/*click on the element from result of the first value. */
		return new NewCustomizeResellerPanel();
	}
	
	/***************************************************
	 						* *****************************************************************************************************
							* **************************    End No.02 - Element of Reseller with Level    ************************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Host Server  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
				  										  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Host Server
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input")
	WebElement hostServerInputFieldElement;
	
	//03. Highlight of PIN Host Server for First click On the Element 
	public void saveButtonelementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", hostServerInputFieldElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", hostServerInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", hostServerInputFieldElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", hostServerInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Host Server
	public NewCustomizeResellerPanel typeONHostServer() throws InterruptedException {
		saveButtonelementHighlight();/* highlight the element of the tested. */
		hostServerInputFieldElement.sendKeys("127.0.0.1");/*type on the element */
		return new NewCustomizeResellerPanel();
	}
	
	/***************************************************
							* *****************************************************************************************************
							* **************************    End No.03 - Element of Host Server    *********************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Brand Name  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
									  						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Brand Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/input")
	WebElement brandNameInputFieldElement;
	
	//04. Highlight of Brand Name for First click On the Element 
	public void brandNameelementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", brandNameInputFieldElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", brandNameInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", brandNameInputFieldElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", brandNameInputFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Brand Name
	public NewCustomizeResellerPanel typeONBrandName() throws InterruptedException {
		brandNameelementHighlight();/* highlight the element of the tested. */
		brandNameInputFieldElement.sendKeys("Local Brand");/*type on the element */
		return new NewCustomizeResellerPanel();
	}
	
	/***************************************************
							* *****************************************************************************************************
							* **************************    End No.05 - Element of Submit Button    *******************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
	
	//05. Element of Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[4]")
	WebElement submitButtonElement;
	
	//05. Highlight of Brand Name for First click On the Element 
	public void submitButtonelementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Brand Name
	public NewCustomizeResellerPanel clickONSubmitButton() throws InterruptedException {
		submitButtonelementHighlight();/* highlight the element of the tested. */
		submitButtonElement.click();/*type on the element */
		return new NewCustomizeResellerPanel();
	}
	
	/***************************************************
							* *****************************************************************************************************
							* **************************    End No.05 - Element of Submit Button    *********************************
							* * ***************************************************************************************************
														***********************************************************************************************************/
}
