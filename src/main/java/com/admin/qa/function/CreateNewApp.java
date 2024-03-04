package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
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
	public CreateNewApp typeToAppNameTest() throws InterruptedException {
		appnameInputFieldHighlight();
		appNameElement.sendKeys("test");
		return new CreateNewApp();
	}
	
	//01. Type to the App Name
	public CreateNewApp typeToAppNameInputFieldParam(String $name) throws InterruptedException {
		appnameInputFieldHighlight();
		appNameElement.sendKeys($name);
		
		Thread.sleep(2000);
		
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
		public CreateNewApp typeToAPPIDOneSignalTest() throws InterruptedException {
			appIDOneSignalInputFieldHighlight();
			appIDOneSignalElement.sendKeys("test");
			return new CreateNewApp();
		}
		
		
		
		//02. Type to the APP ID (One Signal)
		public CreateNewApp typeToAPPIDOneSignalTestParam(String $id) throws InterruptedException {
			appIDOneSignalInputFieldHighlight();
			appIDOneSignalElement.sendKeys($id);
			
			Thread.sleep(2000);
			
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
		public CreateNewApp typeToAPPKeyOneSignalTest() throws InterruptedException {
			appKeyOneSignalInputFieldHighlight();
			appKeyOneSignalElement.sendKeys("test");
			return new CreateNewApp();
		}
		
		
		
		//03. Type to the APP key (One Signal)
		public CreateNewApp typeToAPPKeyOneSignalTestParam(String $key) throws InterruptedException {
			appKeyOneSignalInputFieldHighlight();
			appKeyOneSignalElement.sendKeys($key);
					
			Thread.sleep(2000);
					
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
