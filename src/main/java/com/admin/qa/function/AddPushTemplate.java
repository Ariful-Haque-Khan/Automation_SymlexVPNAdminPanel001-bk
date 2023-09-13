package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddPushTemplate extends TestBase{
	public AddPushTemplate(){
		PageFactory.initElements(driver, this);
	}
	
	public AddPushTemplate openAddPushTemplatePage() {
		driver.get(props.getProperty("url")+"push/pushTemplateForm");
		return new AddPushTemplate();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Template Name   $$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
								*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Template Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement templateNameElement;
	
	//01. Highlight the Template Name Input Field
	public void templateNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateNameElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Template Name Input Field
	public AddPushTemplate typeTotemplateNameInputField() throws InterruptedException {
		templateNameInputFieldHighlight();
		templateNameElement.sendKeys("Test Template");
		return new AddPushTemplate();
	}
	
	/***********************************************************
     								* ****************************************************************************************
     								* **************************    End No.01 - Element of Template Name    *****************
     								******************************************************************************************
     																**********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of App Name   $$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. App Name Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[2]/div/span")
	WebElement dropDownAppNameinSelect;
	
	//02.App Name Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInAppNameDropDown;
	
	//02. App Name Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForAppNameSearch;
	
	//02. Highlight the Number of Days Input Field
	public void appNameDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAppNameinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAppNameinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAppNameinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAppNameinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Number of Days
	public SendPushtoUser selectDatafromAppNameDropDownElement() throws InterruptedException {
		appNameDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownAppNameinSelect.click(); /*click on the element */
		searchInAppNameDropDown.sendKeys("Symlex");/*type on the input field */
		valueForAppNameSearch.click();/*click on the element from result of the first value. */
		return new SendPushtoUser();
	}
	
	/*******************************************************************
											**************************************************************************************************
											***************************    End No.02 - Element of App Name    ********************************
											**************************************************************************************************
																****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								 * $$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Template Title   $$$$$$$$$$$$$$$$$
								 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
								 							*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//03. Element of Template Title
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement templateTitleElement;
	
	//03. Highlight the Template Name Input Field
	public void templateTitleInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateTitleElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateTitleElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateTitleElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateTitleElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Template Title Input Field
	public AddPushTemplate typeTotemplateTitleInputField() throws InterruptedException {
		templateTitleInputFieldHighlight();
		templateTitleElement.sendKeys("Test Title");
		return new AddPushTemplate();
	}
	
	/***********************************************************
									* ****************************************************************************************
									* **************************    End No.03 - Element of Template Title    *****************
									******************************************************************************************
																**********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							 * $$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Template Message   $$$$$$$$$$$$$$
	 							 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 							 						 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Template Message
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[4]/div/textarea")
	WebElement templateMessageElement;
	
	//04. Highlight the Template Name Input Field
	public void templateMessageInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateMessageElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateMessageElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateMessageElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateMessageElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);	
		}
	}
	
	//04. Type to the Template Message Input Field
	public AddPushTemplate typeTotemplateMessageInputField() throws InterruptedException {
		templateMessageInputFieldHighlight();
		templateMessageElement.sendKeys("Test Message....");
		return new AddPushTemplate();
	}

	/***********************************************************
								* ****************************************************************************************
								* **************************    End No.04 - Element of Template Message    ***************
								******************************************************************************************
															**********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 						 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 						 * $$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Template Image URL   $$$$$$$$$$$$$$
		 						 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		 						 						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Template Image URL
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[5]/div/input")
	WebElement templateImageURLElement;
	
	//05. Highlight the Template Name Input Field
	public void templateImageURLInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateImageURLElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateImageURLElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateImageURLElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateImageURLElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);	
		}
	}
	
	//05. Type to the Template Message Input Field
	public AddPushTemplate typeTotemplateImageURLInputField() throws InterruptedException {
		templateImageURLInputFieldHighlight();
		templateImageURLElement.sendKeys("google.com");
		return new AddPushTemplate();
	}
	
	/***********************************************************
									* ****************************************************************************************
									* **************************    End No.05 - Element of Template Image URL  ***************
									******************************************************************************************
																**********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 				   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 				   * $$$$$$$$$$$$$$$$$$$$$  Start No.06 -   Element of Template URL for Android   $$$$$$$$$$
		 				   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		 						 				 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of URL for Android
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[6]/div/input")
	WebElement templateURLforAndroidElement;
	
	//06. Highlight the Template Name Input Field
	public void templateURLforAndroidInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateURLforAndroidElement);/* make a yellow border outside edge of the element */
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", templateURLforAndroidElement);/* make a yellow border off outside edge of the element */
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateURLforAndroidElement);/* make a yellow border outside edge of the element */
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", templateURLforAndroidElement);/* make a yellow border off outside edge of the element */
				Thread.sleep(1000);	
			}
	}
	
	//06. Type to the Template URL for Android Input Field
	public AddPushTemplate typeTotemplateURLforAndroidInputField() throws InterruptedException {
		templateURLforAndroidInputFieldHighlight();
		templateURLforAndroidElement.sendKeys("google.com");
		return new AddPushTemplate();
	}
	
	/***************************************************
									* ****************************************************************************************
									* ******************    End No.06 - Element of Template URL for Android    ***************
									******************************************************************************************
																**********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	   					   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	   					   * $$$$$$$$$$$$$$$$$$$$$  Start No.07 -   Element of Template URL for iOS   $$$$$$$$$$$$$$
	   					   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
			 				 						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of URL for iOS
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[7]/div/input")
	WebElement templateURLforiOSElement;
	
	//07. Highlight the Template URL for iOS Input Field
	public void templateURLforiOSInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateURLforiOSElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateURLforiOSElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateURLforiOSElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateURLforiOSElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);	
		}
	}
	
	//07. Type to the Template URL for Android Input Field
	public AddPushTemplate typeTotemplateURLforiOSInputField() throws InterruptedException {
		templateURLforiOSInputFieldHighlight();
		templateImageURLElement.sendKeys("google.com");
		return new AddPushTemplate();
	}
	
	/***************************************************
									* ****************************************************************************************
									* ******************    End No.07 - Element of Template URL for iOS    *******************
									******************************************************************************************
														**********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		   				   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		   				   * $$$$$$$$$$$$$$$$$$$$$  Start No.08 -   Element of Template Page Control   $$$$$$$$$$$$$
		   				   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		 										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//08. Element of Page Control
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[8]/div/input")
	WebElement templatePageControlElement;
	
	//08. Highlight the Template URL for iOS Input Field
	public void templatePageControlInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templatePageControlElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templatePageControlElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templatePageControlElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templatePageControlElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);	
		}
	}
	
	//08. Type to the Template URL for Android Input Field
	public AddPushTemplate typeTotemplatePageControlInputField() throws InterruptedException {
		templatePageControlInputFieldHighlight();
		templatePageControlElement.sendKeys("google.com");
		return new AddPushTemplate();
	}
	
	/***************************************************
									* ****************************************************************************************
									* ******************    End No.08 - Element of Template Page Control    *******************
									******************************************************************************************
														**********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		   				   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		   				   * $$$$$$$$$$$  Start No.09 -   Element of Template Active/Deactive Status   $$$$$$$$$$$$$
		   				   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		   				   						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//09. Element of Active/Deactive Status
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[2]/div[9]/div/input")
	WebElement templateActiveDeactiveStatusElement;
	
	//09. Highlight the Template URL for iOS Input Field
	public void templateActiveDeactiveStatusInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateActiveDeactiveStatusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateActiveDeactiveStatusElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateActiveDeactiveStatusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateActiveDeactiveStatusElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);	
		}
	}
	
	//09. Type to the Template URL for Android Input Field
	public AddPushTemplate typeTotemplateActiveDeactiveStatusInputField() throws InterruptedException {
		templateActiveDeactiveStatusInputFieldHighlight();
		templateActiveDeactiveStatusElement.click();
		return new AddPushTemplate();
	}
	
	/***************************************************
									* **************************************************************************************************************
									* ******************    End No.09 - Element of Element of Template Active/Deactive Status    *******************
									****************************************************************************************************************
															****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		   				   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		   				   * $$$$$$$$$$$  Start No.10 -   Element of Template save Button   $$$$$$$$$$$$$
		   				   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		   								*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//10. Element of save Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[2]/input[3]")
	WebElement templateSaveButtonElement;
	
	//10. Highlight the Template Save Button
	public void templateSaveButtonFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateSaveButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateSaveButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateSaveButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateSaveButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);	
		}
	}
	
	//010. Click to the Save Button
	public AddPushTemplate typeTotemplateSaveButtonField() throws InterruptedException {
		templateSaveButtonFieldHighlight();
		templateSaveButtonElement.click();
		return new AddPushTemplate();
	}
	
	/***************************************************
									* ****************************************************************************************
									* ******************    End No.10 - Element of Template save Button    *******************
									******************************************************************************************
														****************************************************************************************************/
	
	
	
	
}
