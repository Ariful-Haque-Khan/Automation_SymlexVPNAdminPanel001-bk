package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class IpBundleElement extends TestBase{
	public IpBundleElement(){
		PageFactory.initElements(driver, this);
	}
	
	public IpBundleElement openIpBundleElementForm() {
		driver.get(props.getProperty("url")+"ip/create_ip_bundle");
		return new IpBundleElement();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Bundle Name   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Bundle Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement bundleNameElement;
	
	//01. Highlight the Bundle Name Input Field
	public void bundleNameFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", bundleNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", bundleNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", bundleNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", bundleNameElement);
			Thread.sleep(1000);
		}
	}
	// 01.0.1 Type to the Bundle Name parameter
	public IpBundleElement typeToBundleNameFieldParam(String Bundle_Name) throws InterruptedException {
		bundleNameFieldHighlight();
		bundleNameElement.sendKeys(Bundle_Name);
		Thread.sleep(2000);
		return new IpBundleElement();
	}

	// 01.0.2. Type Bundle Name Input Field (enter text, then clear Bundle NameInput Field)
	public IpBundleElement typeAndClearBundleNameFieldParam(String Bundle_Name) throws InterruptedException {
		bundleNameFieldHighlight();
		bundleNameElement.sendKeys(Bundle_Name);
		Thread.sleep(500);
		bundleNameElement.clear();
		return new IpBundleElement();
	}

	// 1.0.3. Type to Bundle Name tab key
	public IpBundleElement typetoBundleNametabKey() throws InterruptedException {
		bundleNameFieldHighlight();
		bundleNameElement.sendKeys(Keys.TAB);
		return new IpBundleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Bundle Name    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Description   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Description
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/textarea")
	WebElement descriptionElement;
	
	//02. Highlight the Description Input Field
	public void descriptionFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",descriptionElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", descriptionElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", descriptionElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", descriptionElement);
			Thread.sleep(1000);
		}
	}
	// 02.0.1 Type to the Description parameter
	public IpBundleElement typeToDescriptionFieldParam(String description) throws InterruptedException {
		descriptionFieldHighlight();
		descriptionElement.sendKeys(description);
		Thread.sleep(2000);
		return new IpBundleElement();
	}

	// 02.0.2. Type Description Input Field (enter text, then clear DescriptionInput Field)
	public IpBundleElement typeAndClearDescriptionFieldParam(String description) throws InterruptedException {
		descriptionFieldHighlight();
		descriptionElement.sendKeys(description);
		Thread.sleep(500);
		descriptionElement.clear();
		return new IpBundleElement();
	}

	// 02.0.3. Type to Description tab key
	public IpBundleElement typetoDescriptiontabKey() throws InterruptedException {
		descriptionFieldHighlight();
		descriptionElement.sendKeys(Keys.TAB);
		return new IpBundleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Bundle Name    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$ Start No.03 - Element of Server Upload WireGuard Config?  Checkbox Field $$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 03. Element of active Checkbox Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input")
	WebElement activeCheckboxElement;

	// 03. Highlight the active Checkbox Field
	public void activeCheckboxFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",activeCheckboxElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeCheckboxElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",activeCheckboxElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeCheckboxElement);
			Thread.sleep(1000);
		}
	}

	// 03. Type to the active Checkbox
	public IpBundleElement clickActiveCheckboxField() throws InterruptedException {
		activeCheckboxFieldHighlight();
		activeCheckboxElement.click();
		return new IpBundleElement();
	}

	/*************************************************************
	 * *********************************************************************************************************
	 * ************************ End No.03 - Element of active Checkbox Field *********** *
	 * *******************************************************************************************************
	 ************************************************************************************************/
	
	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$ Start No.04 -  Element of Submit Button Input Field  $$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */
	

	// 04. Element of Submit Button Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement submitButtonElement;

	// 04. Highlight the Submit Button Input Field
	public void submitButtonElementHighlight() throws InterruptedException {
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

	// 04. Type to the Submit Button Input Field
	public IpBundleElement clickToSubmitButton() throws InterruptedException {
		submitButtonElementHighlight();
		Thread.sleep(1000);
		submitButtonElement.click();
		return new IpBundleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.04 - Element of Submit Button Input Field ******* *
	 * ***************************************************************************************
	 ******************************************************************************************/
	
	
	
	
}
