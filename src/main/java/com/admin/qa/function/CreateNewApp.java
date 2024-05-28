package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CreateNewApp extends TestBase{
	public CreateNewApp(){
		PageFactory.initElements(driver, this);
	}
	
	public CreateNewApp openCreateNewAppPage() {
		driver.get(props.getProperty("url")+"push/create");
		return new CreateNewApp();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of App Name   $$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of App Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement appNameElement;
	
	//01. Highlight the App Name Input Field
	public void appnameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", appNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", appNameElement);
			Thread.sleep(1000);
		}
	}
		
	//01. Type to the App Name
	public CreateNewApp typeToAppNameInputFieldParam(String App_Name) throws InterruptedException {
		appnameInputFieldHighlight();
		appNameElement.sendKeys(App_Name);
		Thread.sleep(2000);
		return new CreateNewApp();
		
	}
	
	//1.0.1. Type to the App name Input Field (enter text, then clear the app name field)
    public CreateNewApp typeAndClearAppNameInputField(String App_Name) throws InterruptedException {
    	appnameInputFieldHighlight();
    	appNameElement.sendKeys(App_Name);
    	Thread.sleep(500);
    	appNameElement.clear();
    	return new CreateNewApp();
    			
   	}
    
    //01.0.2. enter text and navigate through the title field using the tab key
    public CreateNewApp typeAndTabKeyAppNameInputFieldParam() throws InterruptedException {
  		appnameInputFieldHighlight();
  		appNameElement.sendKeys();
  		appNameElement.sendKeys(Keys.TAB); // Navigate to the next field
  		return new CreateNewApp();
  		
  	}
	
	
	/***************************************************
     						* *****************************************************************************************************
	 						* **************************    End No.01 - Element ofApp Name    *************************************
	 						* * ***************************************************************************************************
	 													******************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of APP ID (One Signal)   $$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of APP ID (One Signal)
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement appIDOneSignalElement;
		
	//02. Highlight the APP ID (One Signal) Input Field
	public void appIDOneSignalInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appIDOneSignalElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", appIDOneSignalElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appIDOneSignalElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", appIDOneSignalElement);
			Thread.sleep(1000);
		}
	}
			
	//02. Type to the APP ID (One Signal)
	public CreateNewApp typeToAPPIDOneSignalTestParam(String App_ID) throws InterruptedException {
		appIDOneSignalInputFieldHighlight();
		appIDOneSignalElement.sendKeys(App_ID);	
		Thread.sleep(2000);	
		return new CreateNewApp();
	}
	
	//02.0.1. Type to the APP ID (One Signal)
	public CreateNewApp typeAndTabKeyAppIDInputFieldParam() throws InterruptedException {
		appIDOneSignalInputFieldHighlight();
		appIDOneSignalElement.sendKeys(Keys.TAB); // Navigate to the next field				
		Thread.sleep(2000);			
		return new CreateNewApp();
	}
			
	//2.0.2. Type to the App id Input Field (enter text, then clear the app id field)
	 public CreateNewApp typeAndClearAppIDInputField(String App_ID) throws InterruptedException {
		appIDOneSignalInputFieldHighlight();
	    appIDOneSignalElement.sendKeys(App_ID);
	    Thread.sleep(500);
	    appIDOneSignalElement.clear();
	    return new CreateNewApp();
	    			
	}
	 
		/***************************************************
								* **********************************************************************************************
								* **************************    End No.02 - Element of APP ID (One Signal)   *******************
								* * ********************************************************************************************
															****************************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of APP Key (One Signal)   $$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
																	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	
	//03. Element of APP Key (One Signal)
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input")
	WebElement appKeyOneSignalElement;
		
	//03. Highlight the APP Key (One Signal) Input Field
	public void appKeyOneSignalInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appKeyOneSignalElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", appKeyOneSignalElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appKeyOneSignalElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", appKeyOneSignalElement);
			Thread.sleep(1000);
		}
	}

		
	//03. Type to the APP key (One Signal)
	public CreateNewApp typeToAPPKeyOneSignalTestParam(String App_key) throws InterruptedException {
		appKeyOneSignalInputFieldHighlight();
		appKeyOneSignalElement.sendKeys(App_key);			
		Thread.sleep(2000);		
		return new CreateNewApp();
	}
	
	
	//3.0.1. Type to the APP key Input Field (enter text, then clear the app id field)
	public CreateNewApp typeAndClearAppKeyInputField(String App_key) throws InterruptedException {
		appKeyOneSignalInputFieldHighlight();
		appKeyOneSignalElement.sendKeys(App_key);
		Thread.sleep(500);
		appKeyOneSignalElement.clear();
		return new CreateNewApp();
		    			
	}
	
	 //03.0.2. enter text and navigate through the APP key field using the tab key
    public CreateNewApp typeAndTabKeyAppKeyInputFieldParam() throws InterruptedException {
  		appnameInputFieldHighlight();
  		appNameElement.sendKeys();
  		appNameElement.sendKeys(Keys.TAB); // Navigate to the next field
  		return new CreateNewApp();
  		
  	}
		
	
		/***************************************************
						* **********************************************************************************************
						* **************************    End No.03 - Element of APP Key (One Signal)   ******************
						* * ********************************************************************************************
													****************************************************************************************************/
	
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Is UDID Check?   $$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
																					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Is UDID Check?
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/input")
	WebElement isUDIDCheckElement;
		
	//04. Highlight the APP Key (One Signal) Input Field
	public void isUDIDCheckChekboxInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isUDIDCheckElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isUDIDCheckElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isUDIDCheckElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isUDIDCheckElement);
			Thread.sleep(1000);
		}
	}
		
	//04. Type to the Is UDID Check?
	public CreateNewApp clickToIsUDIDCheckChekboxInputTest() throws InterruptedException {
		isUDIDCheckChekboxInputFieldHighlight();
		isUDIDCheckElement.click();
		return new CreateNewApp();
	}
		
		/***************************************************
								* **********************************************************************************************
								* **************************    End No.04 - Element of Is UDID Check?   ************************
								* * ********************************************************************************************
															****************************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Save Button   $$$$$$$$$$$$$$$$$$
							 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Save Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement saveButtonElement;
		
	//05. Highlight the Save Button
	public void saveButtonElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);
			Thread.sleep(1000);
		}
	}
		
	//05. click to the Save Button
	public CreateNewApp clickToSaveButtonTest() throws InterruptedException {
		saveButtonElementHighlight();
		saveButtonElement.click();
		return new CreateNewApp();
	}
		
		/***************************************************
					* **********************************************************************************************
					* **************************    End No.05 - Element of Save Button   ***************************
					* * ********************************************************************************************
												****************************************************************************************************/
	
	
}
