package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class PushTemplateListElement extends TestBase{
	public PushTemplateListElement(){
		PageFactory.initElements(driver, this);
	}
	
	public PushTemplateListElement openAddPushTemplatePage() {
		driver.get(props.getProperty("url")+"push/pushTemplateForm");
		return new PushTemplateListElement();
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
      
    //01. Type to the Template name Input Field
    public PushTemplateListElement typeTotemplatenameInputFieldParam(String template_name) throws InterruptedException {
			templateNameInputFieldHighlight();
			templateNameElement.sendKeys(template_name);
	        Thread.sleep(2000);
			return new PushTemplateListElement();
		}
      
    //1.0.1. Type to the Template name Input Field (enter text, then clear the title field)
    public PushTemplateListElement typeAndClearTemplateNameInputField(String template_name) throws InterruptedException {
    		templateNameInputFieldHighlight();
    		templateNameElement.sendKeys(template_name);
    		Thread.sleep(500);
    		templateNameElement.clear();	
    		return new PushTemplateListElement();
    			
    	}
    
  //1.0.2. enter text and navigate through the Template Name field using the tab key
  		public PushTemplateListElement typeAndTabKeyTemplateNameInputField(String template_name) throws InterruptedException {
  		    templateNameInputFieldHighlight();
  		    templateNameElement.sendKeys(template_name);
  		    templateNameElement.sendKeys(Keys.TAB); // Navigate to the next field
  		    return new PushTemplateListElement();
  		}
	
	/***********************************************************
     								* ****************************************************************************************
     								* **************************    End No.01 - Element of Template Name    *****************
     								******************************************************************************************
     																**********************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
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
	
	//02. Highlight the App Name Drop down Field
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
	
	//02. Type to the App Name Drop down Field
	public SendPushtoUser selectDatafromAppNameDropDownElement() throws InterruptedException {
		appNameDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownAppNameinSelect.click(); /*click on the element */
		searchInAppNameDropDown.sendKeys("symlex");/*type on the input field */
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

	//03. Highlight the Template Title Input Field
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

	//03. Type to the Template title Input Field
	public PushTemplateListElement typeToTemplateTitleInputFieldParam(String $title) throws InterruptedException {
		templateTitleInputFieldHighlight();
		templateTitleElement.sendKeys($title);
		Thread.sleep(2000);
		return new PushTemplateListElement();
	}
	
	//03.0.1. Type to the Template Title Input Field (enter text, then clear the title field)
	public PushTemplateListElement typeAndClearTemplateTitleInputField(String $title) throws InterruptedException {
		templateTitleInputFieldHighlight();
		templateTitleElement.sendKeys($title);
		Thread.sleep(500);
		templateTitleElement.clear();
		return new PushTemplateListElement();

	}
	
	//03.02 Type to the Template Title Input Field (paste the text into the title field using the paste action.)
	public void pasteTextIntoElement(WebElement element, String text) {
		Actions actions = new Actions(driver); // Assuming you have instantiated WebDriver as 'driver'
		actions.moveToElement(element)
		.click()
		.sendKeys(text)
		.perform();
	}

	//03.0.3. enter text and navigate through the title field using the tab key
	public PushTemplateListElement typeAndTabKeyTemplateTitleInputFieldParam(String $title) throws InterruptedException {
		templateTitleInputFieldHighlight();
		templateTitleElement.sendKeys($title);
		templateTitleElement.sendKeys(Keys.TAB); // Navigate to the next field
		return new PushTemplateListElement();
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

	//04. Highlight the Template Message Input Field
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

	//04. Type to the Template title Input Field
	public PushTemplateListElement typeToTemplateMessageInputFieldParam(String $message) throws InterruptedException {
		templateMessageInputFieldHighlight();
		templateMessageElement.sendKeys($message);
		Thread.sleep(2000);
		return new PushTemplateListElement();
	}


	//04.0.1. Type to the Template Message Input Field (enter text, then clear the message field)
	public PushTemplateListElement typeAndClearTemplateMessageInputField(String $message) throws InterruptedException {
		templateMessageInputFieldHighlight();
		templateMessageElement.sendKeys($message);
		Thread.sleep(500);
		templateMessageElement.clear();
		return new PushTemplateListElement();
	}

	//04.0.2. enter text and navigate through the message field using the tab key
	public PushTemplateListElement typeAndTabKeyTemplateMessageInputFieldParam(String $message) throws InterruptedException {
		templateMessageInputFieldHighlight();
		templateMessageElement.sendKeys($message);
		templateMessageElement.sendKeys(Keys.TAB); // Navigate to the next field
		return new PushTemplateListElement();
	}


	//04.02 Type to the Template Message Input Field (paste the text into the message field using the paste action.)
	public void pasteMessagetIntoElement(WebElement element, String text) {
		Actions actions = new Actions(driver); // Assuming you have instantiated WebDriver as 'driver'
		actions.moveToElement(element)
		.click()
		.sendKeys(text)
		.perform();
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
	
	//05. Highlight the Template Image URL Input Field
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

	//05. Type to the Image URL Input Field
	public PushTemplateListElement typeToImageURLFieldParam(String $image) throws InterruptedException {
		templateImageURLInputFieldHighlight();
		templateImageURLElement.sendKeys($image);
		return new PushTemplateListElement();
		
	}
	
	//05.0.1. Type to the Image URL Input Field (enter text, then clear the Image URL field)
	public PushTemplateListElement typeAndClearImageURLInputField(String $image) throws InterruptedException {
		templateImageURLInputFieldHighlight();
		templateImageURLElement.sendKeys($image);
		Thread.sleep(500);
		templateImageURLElement.clear();
		return new PushTemplateListElement();
	}

	//05.0.2. enter text and navigate through the Image URL using the tab key
	public PushTemplateListElement typeAndTabKeyImageURLInputFieldParam(String $image) throws InterruptedException {
		templateImageURLInputFieldHighlight();
		templateImageURLElement.sendKeys($image);
		templateImageURLElement.sendKeys(Keys.TAB); // Navigate to the next field
		return new PushTemplateListElement();
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
	
	//06. Highlight the Template URL for Android Input Field
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
	
	//06. Type to the URL for Android Input Field
	public PushTemplateListElement typeToURLForAndroidFieldParam(String Url_android) throws InterruptedException {
		templateURLforAndroidInputFieldHighlight();
		templateURLforAndroidElement.sendKeys(Url_android);
		return new PushTemplateListElement();
			
	}
	
	//06.0.1. Type to the URL for Android Input Field (enter text, then clear the URL for Android field)
	public PushTemplateListElement typeAndClearURLForAndroidInputField(String Url_android) throws InterruptedException {
		templateURLforAndroidInputFieldHighlight();
		templateURLforAndroidElement.sendKeys(Url_android);
		Thread.sleep(500);
		templateURLforAndroidElement.clear();
		return new PushTemplateListElement();
	}

	//06.0.2. enter text and navigate through the URL for Android using the tab key
	public PushTemplateListElement typeAndTabKeyURLForAndroidInputFieldParam(String Url_android) throws InterruptedException {
		templateURLforAndroidInputFieldHighlight();
		templateURLforAndroidElement.sendKeys(Url_android);
		Thread.sleep(200);
		templateURLforAndroidElement.sendKeys(Keys.TAB); // Navigate to the next field
		return new PushTemplateListElement();
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

	//07. Type to the URL for iOS Input Field
	public PushTemplateListElement typeToURLForiOSFieldParam(String Url_iOS) throws InterruptedException {
		templateURLforiOSInputFieldHighlight();
		templateURLforiOSElement.sendKeys(Url_iOS);
		return new PushTemplateListElement();

	}

	//07.0.1. Type to the URL for iOS Input Field (enter text, then clear the URL for iOS field)
	public PushTemplateListElement typeAndClearURLForiOSInputField(String Url_iOS) throws InterruptedException {
		templateURLforiOSInputFieldHighlight();
		templateURLforiOSElement.sendKeys(Url_iOS);
		Thread.sleep(500);
		templateURLforiOSElement.clear();
		return new PushTemplateListElement();
	}

	//07.0.2. enter text and navigate through the URL for iOS using the tab key
	public PushTemplateListElement typeAndTabKeyURLForiOSInputFieldParam(String Url_iOS) throws InterruptedException {
		templateURLforiOSInputFieldHighlight();
		templateURLforiOSElement.sendKeys(Url_iOS);
		Thread.sleep(200);
		templateURLforiOSElement.sendKeys(Keys.TAB); // Navigate to the next field
		return new PushTemplateListElement();
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
	
	//08. Highlight the Template Page Control Input Field
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
	
	//08. Type to the Page Control Input Field
	public PushTemplateListElement typeToPageControlFieldParam(String Page_control) throws InterruptedException {
		templateURLforiOSInputFieldHighlight();
		templatePageControlElement.sendKeys(Page_control);
		return new PushTemplateListElement();

	}

	//08.0.1. Type to the Page Control Input Field (enter text, then clear the Page Control)
	public PushTemplateListElement typeAndClearPageControlField(String Page_control) throws InterruptedException {
		templateURLforiOSInputFieldHighlight();
		templatePageControlElement.sendKeys(Page_control);
		Thread.sleep(500);
		templatePageControlElement.clear();
		return new PushTemplateListElement();
	}

	//08.0.2. enter text and navigate through the Page Control using the tab key
	public PushTemplateListElement typeAndTabKeyPageControlFieldParam(String Page_control) throws InterruptedException {
		templateURLforiOSInputFieldHighlight();
		templatePageControlElement.sendKeys(Page_control);
		Thread.sleep(200);
		templatePageControlElement.sendKeys(Keys.TAB); // Navigate to the next field
		return new PushTemplateListElement();
		
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
	
	//09. Highlight the Template Active/Deactive Status Input Field
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
	
	//09. Type to the Template Active/Deactive Status Input Field
	public PushTemplateListElement typeTotemplateActiveDeactiveStatusInputField() throws InterruptedException {
		templateActiveDeactiveStatusInputFieldHighlight();
		templateActiveDeactiveStatusElement.click();
		return new PushTemplateListElement();
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
	
	//10. Click to the Save Button
	public PushTemplateListElement typeTotemplateSaveButtonField() throws InterruptedException {
		templateSaveButtonFieldHighlight();
		templateSaveButtonElement.click();
		return new PushTemplateListElement();
	}

	/***************************************************
									* ****************************************************************************************
									* ******************    End No.11 - Element of Template save Button    *******************
									******************************************************************************************
														****************************************************************************************************/


	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		   * $$$$$$$$$$$  Start No.10 -   Element of Template Box Title for Copy/Paste   $$$$$$$$$$$$$
		   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//11. Element of copy paste for message field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[1]/h3")
	WebElement templateBoxTitleforCopyPasteElement;
	
	//11. Highlight the Template copy paste for message field
	public void templateBoxTitleforCopyPasteFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateBoxTitleforCopyPasteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateBoxTitleforCopyPasteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateBoxTitleforCopyPasteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateBoxTitleforCopyPasteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);	
		}
	}
	
	//11. Click to the copy paste for message field
	public PushTemplateListElement typeTotemplateBoxTitleforCopyPasteField() throws InterruptedException {
		templateBoxTitleforCopyPasteFieldTitleHighlight();
		String myOrderText = templateBoxTitleforCopyPasteElement.getText();
		templateMessageElement.sendKeys(myOrderText);
		return new PushTemplateListElement();
	}
	
	
	//11.0.1 Element of copy paste for title field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[1]/h3")
	WebElement templateBoxTitleforCopyPasteTittleElement;
		
	//11.0.1 Highlight the Template copy paste for title field
	public void templateBoxTitleforCopyPasteFieldTitleHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateBoxTitleforCopyPasteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateBoxTitleforCopyPasteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateBoxTitleforCopyPasteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateBoxTitleforCopyPasteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);	
		}
	}
		
	//11.0.1 Click to the copy paste for title field
	public PushTemplateListElement typeTotemplateBoxTitleforCopyPasteTitleField() throws InterruptedException {
		templateBoxTitleforCopyPasteFieldTitleHighlight();
		String myOrderText = templateBoxTitleforCopyPasteTittleElement.getText();
		templateTitleElement.sendKeys(myOrderText);
		return new PushTemplateListElement();
		
	}

	//11.0.2 Element of copy paste for template name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div[1]/div/div[1]/h3")
	WebElement templateBoxTitleforCopyPasteTemplateNameElement;
			
	//11.0.2 Highlight the Template copy paste for template name
	public void templateBoxTitleforCopyPasteFieldTemplateNameHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateBoxTitleforCopyPasteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateBoxTitleforCopyPasteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", templateBoxTitleforCopyPasteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", templateBoxTitleforCopyPasteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);	
			}
		}
			
	//11.0.2 Click to the copy paste for template name
	public PushTemplateListElement typeTotemplateBoxTitleforCopyPasteTemplateNameField() throws InterruptedException {
		templateBoxTitleforCopyPasteFieldTemplateNameHighlight();
		String myOrderText = templateBoxTitleforCopyPasteTemplateNameElement.getText();
		templateNameElement.sendKeys(myOrderText);
		return new PushTemplateListElement();
			
	}
		
	/***************************************************
				* ****************************************************************************************
				* ******************    End No.11 - Element of Template Box Title for Copy/Paste   *******************
				******************************************************************************************
									****************************************************************************************************/


}
	
	
	
	

