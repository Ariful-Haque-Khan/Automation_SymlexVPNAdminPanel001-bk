package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class AddNewPaymentMethod extends TestBase{
	public AddNewPaymentMethod(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewPaymentMethod openAddNewPaymentMethodForm() {
		driver.get(props.getProperty("url")+"/paymentMethods/create");
		return new AddNewPaymentMethod();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Title   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Title
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement titleElement;
	
	//01. Highlight the Title Input Field
	public void titleInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", titleElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", titleElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", titleElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", titleElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Title
	public AddNewPaymentMethod typeToTitle() throws InterruptedException {
		titleInputFieldHighlight();
		titleElement.sendKeys("");
		return new AddNewPaymentMethod();
	}
	
	
	//01.0.1 Type to the Title parameter
	public AddNewPaymentMethod typeToTitleFieldParam(String title) throws InterruptedException {
		titleInputFieldHighlight();
		titleElement.sendKeys(title);		
		Thread.sleep(2000);		
		return new AddNewPaymentMethod();
	}
	
	//01.0.2. Type Title Input Field (enter text, then clear Title Input Field)
	public AddNewPaymentMethod typeAndClearTitleFieldParam(String title) throws InterruptedException {
		titleInputFieldHighlight();
		titleElement.sendKeys(title);
		Thread.sleep(100);
		titleElement.clear();
		return new AddNewPaymentMethod();									    			
	}		
		
	//1.0.3. Type to Title tab key
	public AddNewPaymentMethod  typetoTitletabKey() throws InterruptedException {
		titleInputFieldHighlight();
		titleElement.sendKeys(Keys.TAB);
		return new AddNewPaymentMethod();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Title    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Key    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Key
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement keyElement;
	
	//02. Highlight the Key Input Field
	public void keyInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", keyElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", keyElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", keyElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", keyElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Key
	public AddNewPaymentMethod typeToKey() throws InterruptedException {
		keyInputFieldHighlight();
		keyElement.sendKeys("");
		return new AddNewPaymentMethod();
	}
	
	
	//02.0.1 Type to the Key parameter
	public AddNewPaymentMethod typeToKeyFieldParam(String Key) throws InterruptedException {
		keyInputFieldHighlight();
		keyElement.sendKeys(Key);		
		Thread.sleep(2000);		
		return new AddNewPaymentMethod();
	}
	
	//02.0.2. Type Key Input Field (enter text, then clear Key Input Field)
	public AddNewPaymentMethod typeAndClearKeyFieldParam(String Key) throws InterruptedException {
		keyInputFieldHighlight();
		keyElement.sendKeys(Key);
		Thread.sleep(100);
		keyElement.clear();
		return new AddNewPaymentMethod();									    			
	}		
		
	//2.0.3. Type to Key tab key
	public AddNewPaymentMethod  typetoKeytabKey() throws InterruptedException {
		keyInputFieldHighlight();
		keyElement.sendKeys(Keys.TAB);
		return new AddNewPaymentMethod();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Key   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Secret    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Secret
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input")
	WebElement secretElement;
	
	//03. Highlight the Secret Input Field
	public void secretInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", secretElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", secretElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", secretElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", secretElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Secret
	public AddNewPaymentMethod typeToSecret() throws InterruptedException {
		secretInputFieldHighlight();
		secretElement.sendKeys("");
		return new AddNewPaymentMethod();
	}
	
	
	//03.0.1 Type to the Secret parameter
	public AddNewPaymentMethod typeToSecretFieldParam(String Secret) throws InterruptedException {
		secretInputFieldHighlight();
		secretElement.sendKeys(Secret);		
		Thread.sleep(2000);		
		return new AddNewPaymentMethod();
	}
	
	//03.0.2. Type Secret Input Field (enter text, then clear Secret Input Field)
	public AddNewPaymentMethod typeAndClearSecretFieldParam(String Secret) throws InterruptedException {
		secretInputFieldHighlight();
		secretElement.sendKeys(Secret);
		Thread.sleep(100);
		secretElement.clear();
		return new AddNewPaymentMethod();									    			
	}		
		
	//3.0.3. Type to Secret tab key
	public AddNewPaymentMethod  typetoSecrettabKey() throws InterruptedException {
		secretInputFieldHighlight();
		secretElement.sendKeys(Keys.TAB);
		return new AddNewPaymentMethod();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.03 - Element of Secret  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Gateway Type drop down field $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	//04. Element of Gateway Type drop down field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/select")
	WebElement gatewayTypeSelectFieldElement;
	
	//04. Highlight the Gateway Type drop down field
	public void gatewayTypeSelectFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", gatewayTypeSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", gatewayTypeSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", gatewayTypeSelectFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", gatewayTypeSelectFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Gateway Type drop down field
	public AddNewPaymentMethod GatewaytypeSelectField() throws InterruptedException {
		gatewayTypeSelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/select")));
		drp.selectByIndex(1);
		return new AddNewPaymentMethod();
	}

    /***************************************************
		*********************************************************************************************
		****************************    End No.04 -  Element of Gateway Type drop down field    **************************
		*********************************************************************************************
										*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of platform drop down field $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	//05. Element of platform drop down field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[5]/div/select")
	WebElement platformSelectFieldElement;
	
	//05. Highlight the platform drop down field
	public void platformSelectFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", platformSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", platformSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", platformSelectFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", platformSelectFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the platform drop down field
	public AddNewPaymentMethod typePlatformField() throws InterruptedException {
		platformSelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[5]/div/select")));
		drp.selectByIndex(1);
		return new AddNewPaymentMethod();
	}

    /***************************************************
		*********************************************************************************************
		****************************    End No.05 -  Element of platform drop down field    **************************
		*********************************************************************************************
										*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Subscription Type drop down field $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	//06. Element of Subscription Type drop down field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/select")
	WebElement subscriptionTypeSelectFieldElement;
	
	//06. Highlight the Subscription Type drop down field
	public void subscriptionTypeSelectFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", subscriptionTypeSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", subscriptionTypeSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", subscriptionTypeSelectFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');",subscriptionTypeSelectFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the Subscription Type drop down field
	public AddNewPaymentMethod typeSubscriptionTypeField() throws InterruptedException {
		subscriptionTypeSelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/select")));
		drp.selectByIndex(1);
		return new AddNewPaymentMethod();
	}

    /***************************************************
		*********************************************************************************************
		****************************    End No.06 -  Element of Subscription Type drop down field    **************************
		*********************************************************************************************
										*****************************************************************************************************/
		
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.7 -  Active / Inactive Check Box Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 07. Element of Active / Inactive  Check box Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[7]/div/input")
	WebElement activeInactiveCheckboxInputField;
	
	//07. Highlight the Active / Inactive  Check box Input Field
	public void activeInactiveCheckboxInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveCheckboxInputField);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveCheckboxInputField);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveCheckboxInputField);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveCheckboxInputField);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Select from Active / Inactive  Check box Input Field
	public AddNewPaymentMethod checkActiveInactiveCheckboxInputField() throws InterruptedException {
		activeInactiveCheckboxInputFieldHighlight();
		activeInactiveCheckboxInputField.click();
		return new AddNewPaymentMethod(); 
	}
	
	/***************************************************************************************************************
			 * **************************    End No.7 - Active / Inactive Check Box Field    ***************
			******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of Submit Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//8. Element of Submit button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement submitElement;
	
	//8. Highlight the Submit button
	public void submitButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",submitElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitElement);
			Thread.sleep(1000);
		}
	}
	
	//8. Click to the Submit button
	public AddNewPaymentMethod clickONSubmitButton() throws InterruptedException {
		submitButtonInputFieldHighlight();
		submitElement.click();
		return new AddNewPaymentMethod();
	}
	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.03 - Element of Submit Button   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	
	
}
