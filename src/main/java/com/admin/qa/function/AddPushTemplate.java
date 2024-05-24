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
	   
      public AddPushTemplate typeTotemplateNameInputField(String textToPaste) throws InterruptedException {
    	  
		  templateNameInputFieldHighlight();
		  templateNameElement.sendKeys("1");
		 
		 /*
		    Actions actions = new Actions(driver);
		    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); // Select all
		    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform(); // Copy
		    templateNameElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));               // Select all
		    templateNameElement.sendKeys(Keys.chord(Keys.CONTROL, "v"));               // Paste  
		    
		    */
		 
		   Thread.sleep(1000);
		 
		 /* 
		   //Undo the input
		 
		     Actions actions = new Actions(driver); 
		     actions.keyDown(Keys.CONTROL).sendKeys("z").keyUp(Keys.CONTROL).perform();
		     Thread.sleep(1000);      // Add a delay to allow the undo action to complete

		   //Redo the input
		    
		     actions.keyDown(Keys.CONTROL).sendKeys("y").keyUp(Keys.CONTROL).perform();
		     Thread.sleep(1000);    // Add a delay to allow the redo action to complete
		    
		    */
		   return new AddPushTemplate();
         
         }
      
    //01. Type to the Template name Input Field
    public AddPushTemplate typeTotemplatenameInputFieldParam(String $name) throws InterruptedException {
			templateNameInputFieldHighlight();
			templateNameElement.sendKeys($name);
			
	        Thread.sleep(2000);
	        
			return new AddPushTemplate();
		}
      
    //1.0.1. Type to the Template name Input Field (enter text, then clear the title field)
    public AddPushTemplate typeAndClearTemplateNameInputField(String $name) throws InterruptedException {
    		templateNameInputFieldHighlight();
    		templateNameElement.sendKeys($name);
    		Thread.sleep(500);
    		templateNameElement.clear();
    			
    		return new AddPushTemplate();
    			
    	}
    
  //1.0.2. enter text and navigate through the Template Name field using the tab key
  		public AddPushTemplate typeAndTabKeyTemplateTemplateNameInputFieldParam(String $Name) throws InterruptedException {
  		    templateNameInputFieldHighlight();
  		    templateNameElement.sendKeys($Name);
  		    templateNameElement.sendKeys(Keys.TAB); // Navigate to the next field

  		    return new AddPushTemplate();
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
	
	//03. Type to the Template Title Input Field
	public AddPushTemplate typeTotemplateTitleInputField() throws InterruptedException {
		templateTitleInputFieldHighlight();
		templateTitleElement.sendKeys("");
		
		/*
		 
	    Actions actions = new Actions(driver);
	    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();  // Select all
	    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();  // Copy
	    templateTitleElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));               // Select all
	    templateTitleElement.sendKeys(Keys.chord(Keys.CONTROL, "v"));               // Paste  
	    
	    */
	    
	    
		//Thread.sleep(2000);
		
		//templateTitleElement.clear();  //clear the text
		
		//templateTitleElement.sendKeys("title of the push", Keys.TAB);  // input field using the tab key.
		
		  
		/*	  
		   //Undo the input
		 
		     Actions actions = new Actions(driver); 
		     actions.keyDown(Keys.CONTROL).sendKeys("z").keyUp(Keys.CONTROL).perform();
		     Thread.sleep(1000);      // Add a delay to allow the undo action to complete

		   //Redo the input
		    
		     actions.keyDown(Keys.CONTROL).sendKeys("y").keyUp(Keys.CONTROL).perform();
		     Thread.sleep(1000);    // Add a delay to allow the redo action to complete
		     
		     */
		    
		    
		
		return new AddPushTemplate();
	}

	//03. Type to the Template Title Input Field
	public AddPushTemplate typeTotemplateTitleInputFieldParam(String $title) throws InterruptedException {
		//templateTitleInputFieldHighlight();
		templateTitleElement.sendKeys($title);
		
		/*
		 
	    Actions actions = new Actions(driver);
	    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();  // Select all
	    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();  // Copy
	    templateTitleElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));               // Select all
	    templateTitleElement.sendKeys(Keys.chord(Keys.CONTROL, "v"));               // Paste  
	    
	    */
	    
	    
		//Thread.sleep(2000);
		
		//templateTitleElement.clear();  //clear the text
		
		//templateTitleElement.sendKeys("title of the push", Keys.TAB);  // input field using the tab key.
		
		  
		/*	  
		   //Undo the input
		 
		     Actions actions = new Actions(driver); 
		     actions.keyDown(Keys.CONTROL).sendKeys("z").keyUp(Keys.CONTROL).perform();
		     Thread.sleep(1000);      // Add a delay to allow the undo action to complete

		   //Redo the input
		    
		     actions.keyDown(Keys.CONTROL).sendKeys("y").keyUp(Keys.CONTROL).perform();
		     Thread.sleep(1000);    // Add a delay to allow the redo action to complete
		     
		     */
		    
		    
		
		return new AddPushTemplate();
	}
	//03.0.1. Type to the Template Title Input Field (enter text, then clear the title field)
		public AddPushTemplate typeAndClearTemplateTitleInputField(String $title) throws InterruptedException {
			templateTitleInputFieldHighlight();
			templateTitleElement.sendKeys($title);
			Thread.sleep(500);
			templateTitleElement.clear();
			
			return new AddPushTemplate();
			
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
		public AddPushTemplate typeAndTabKeyTemplateTitleInputFieldParam(String $title) throws InterruptedException {
		    templateTitleInputFieldHighlight();
		    templateTitleElement.sendKeys($title);
		    templateTitleElement.sendKeys(Keys.TAB); // Navigate to the next field

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
	
	//04. Type to the Template Message Input Field
	public AddPushTemplate typeTotemplateMessageInputField() throws InterruptedException {
		templateMessageInputFieldHighlight();
		templateMessageElement.sendKeys("hbhbjhbhjjjjjjjjjjjjjj");
		/*
		 
		 
	    Actions actions = new Actions(driver);
	    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();   // Select all
	    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();   // Copy
	    templateMessageElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));              // Select all
	    templateMessageElement.sendKeys(Keys.chord(Keys.CONTROL, "v"));              // Paste  
	    
	    */
	    
	    
		
          Thread.sleep(2000);
		
         //templateMessageElement.clear();  //clear the text
		
		 //templateMessageElement.sendKeys("title of the push", Keys.TAB);  // input field using the tab key.
          
          
          /*
           	  
		    //Undo the input
		 
		     Actions actions = new Actions(driver); 
		     actions.keyDown(Keys.CONTROL).sendKeys("z").keyUp(Keys.CONTROL).perform();
		     Thread.sleep(1000);      // Add a delay to allow the undo action to complete

		    //Redo the input
		    
		     actions.keyDown(Keys.CONTROL).sendKeys("y").keyUp(Keys.CONTROL).perform();
		     Thread.sleep(1000);    // Add a delay to allow the redo action to complete
		     
		     */
		
		
		return new AddPushTemplate();
	}
	
	//04. Type to the Template Message Input Field
		public AddPushTemplate typeTotemplateMessageInputFieldParam(String $message) throws InterruptedException {
			templateMessageInputFieldHighlight();
			templateMessageElement.sendKeys($message);
			/*
			 
			 
		    Actions actions = new Actions(driver);
		    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();   // Select all
		    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();   // Copy
		    templateMessageElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));              // Select all
		    templateMessageElement.sendKeys(Keys.chord(Keys.CONTROL, "v"));              // Paste  
		    
		    */
		    
		    
			
	          Thread.sleep(2000);
			
	         //templateMessageElement.clear();  //clear the text
			
			 //templateMessageElement.sendKeys("title of the push", Keys.TAB);  // input field using the tab key.
	          
	          
	          /*
	           	  
			    //Undo the input
			 
			     Actions actions = new Actions(driver); 
			     actions.keyDown(Keys.CONTROL).sendKeys("z").keyUp(Keys.CONTROL).perform();
			     Thread.sleep(1000);      // Add a delay to allow the undo action to complete

			    //Redo the input
			    
			     actions.keyDown(Keys.CONTROL).sendKeys("y").keyUp(Keys.CONTROL).perform();
			     Thread.sleep(1000);    // Add a delay to allow the redo action to complete
			     
			     */
			
			
			return new AddPushTemplate();
		}
		
	//04.0.1. Type to the Template Message Input Field (enter text, then clear the message field)
				public AddPushTemplate typeAndClearTemplateMessageInputField(String $message) throws InterruptedException {
					templateMessageInputFieldHighlight();
					templateMessageElement.sendKeys($message);
					Thread.sleep(500);
					templateMessageElement.clear();
					
					return new AddPushTemplate();
				}
				
	//04.0.2. enter text and navigate through the message field using the tab key
				public AddPushTemplate typeAndTabKeyTemplateMessageInputFieldParam(String $message) throws InterruptedException {
					templateMessageInputFieldHighlight();
					templateMessageElement.sendKeys($message);
					templateMessageElement.sendKeys(Keys.TAB); // Navigate to the next field

				    return new AddPushTemplate();
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
	
	//05. Type to the Template Image URL Input Field
	public AddPushTemplate typeTotemplateImageURLInputField() throws InterruptedException {
		templateImageURLInputFieldHighlight();
		templateImageURLElement.sendKeys("");
		return new AddPushTemplate();
	}
	
	//05. Type to the Image URL Input Field
	public AddPushTemplate typeToImageURLFieldParam(String $image) throws InterruptedException {
		templateImageURLInputFieldHighlight();
		templateImageURLElement.sendKeys($image);
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
	
	//06. Type to the Template URL for Android Input Field
	public AddPushTemplate typeTotemplateURLforAndroidInputField() throws InterruptedException {
		templateURLforAndroidInputFieldHighlight();
		templateURLforAndroidElement.sendKeys("");
		return new AddPushTemplate();
	}
	
	//06. Type to theURL for Android Input Field
	public AddPushTemplate typeToURLForAndroidFieldParam(String $android) throws InterruptedException {
		templateURLforAndroidInputFieldHighlight();
		templateURLforAndroidElement.sendKeys($android);
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
	
	//07. Type to the Template URL for iOS Input Field
	public AddPushTemplate typeTotemplateURLforiOSInputField() throws InterruptedException {
		templateURLforiOSInputFieldHighlight();
		templateURLforiOSElement.sendKeys("");
		return new AddPushTemplate();
	}
	
	
	//07. Type to the URL for iOS Input Field
		public AddPushTemplate typeToURLForiOSFieldParam(String $iOS) throws InterruptedException {
			templateURLforiOSInputFieldHighlight();
			templateURLforiOSElement.sendKeys($iOS);
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
	
	//08. Type to the Template Page Control Input Field
	public AddPushTemplate typeTotemplatePageControlInputField() throws InterruptedException {
		templatePageControlInputFieldHighlight();
		templatePageControlElement.sendKeys("");
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
	
	//10. Click to the Save Button
	public AddPushTemplate typeTotemplateSaveButtonField() throws InterruptedException {
		templateSaveButtonFieldHighlight();
		templateSaveButtonElement.click();
		return new AddPushTemplate();
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
	public AddPushTemplate typeTotemplateBoxTitleforCopyPasteField() throws InterruptedException {
		templateBoxTitleforCopyPasteFieldTitleHighlight();
		String myOrderText = templateBoxTitleforCopyPasteElement.getText();
		templateMessageElement.sendKeys(myOrderText);
		return new AddPushTemplate();
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
	public AddPushTemplate typeTotemplateBoxTitleforCopyPasteTitleField() throws InterruptedException {
		templateBoxTitleforCopyPasteFieldTitleHighlight();
		String myOrderText = templateBoxTitleforCopyPasteTittleElement.getText();
		templateTitleElement.sendKeys(myOrderText);
		return new AddPushTemplate();
		
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
	public AddPushTemplate typeTotemplateBoxTitleforCopyPasteTemplateNameField() throws InterruptedException {
		templateBoxTitleforCopyPasteFieldTemplateNameHighlight();
		String myOrderText = templateBoxTitleforCopyPasteTemplateNameElement.getText();
		templateNameElement.sendKeys(myOrderText);
		return new AddPushTemplate();
			
	}
		
	/***************************************************
				* ****************************************************************************************
				* ******************    End No.11 - Element of Template Box Title for Copy/Paste   *******************
				******************************************************************************************
									****************************************************************************************************/


}
	
	
	
	

