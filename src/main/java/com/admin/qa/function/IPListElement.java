package com.admin.qa.function;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class IPListElement extends TestBase{
	public IPListElement(){
		PageFactory.initElements(driver, this);
	}
	
	public IPListElement openAddNewIPForm() {
		driver.get(props.getProperty("url")+"/ip/create");
		return new IPListElement();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Server Name   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Server Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement serverNameElement;
	
	//01. Highlight the Server Name Input Field
	public void serverNameElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNameElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Server Name
	public IPListElement typeToServerNameInputField() throws InterruptedException {
		serverNameElementInputFieldHighlight();
		serverNameElement.sendKeys("");
		return new IPListElement();
	}
	
	//01.0.1 Type to the Server Name parameter
	public IPListElement typeToServerNameFieldParam(String server_name) throws InterruptedException {
		serverNameElementInputFieldHighlight();
		serverNameElement.sendKeys(server_name);		
		Thread.sleep(2000);		
		return new IPListElement();
	}
	
	//01.0.2. Type Server Name Input Field (enter text, then clear Server Name Input Field)
	public IPListElement typeAndClearServerNameFieldParam(String server_name) throws InterruptedException {
		serverNameElementInputFieldHighlight();
		serverNameElement.sendKeys(server_name);
		Thread.sleep(100);
		serverNameElement.clear();
		return new IPListElement();									    			
	}		
		
	//1.0.3. Type to Server Name Input Field
	public IPListElement  typetoServerNameFieldtabKey() throws InterruptedException {
		serverNameElementInputFieldHighlight();
		serverNameElement.sendKeys(Keys.TAB);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Server Name ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of IP   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of IP
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement IPElement;
	
	//02. Highlight the IP Input Field
	public void ipElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", IPElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", IPElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", IPElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", IPElement);
			Thread.sleep(1000);
		}
	}
	
	
	//02.0.1 Type to the IP parameter
	public IPListElement typeToIPInputFieldParam(String IP) throws InterruptedException {
		ipElementInputFieldHighlight();
		IPElement.sendKeys(IP);		
		Thread.sleep(2000);		
		return new IPListElement();
	}
	
	//02.0.2. Type IP Input Field (enter text, then clear IP Input Field)
	public IPListElement typeAndClearIPFieldParam(String IP) throws InterruptedException {
		ipElementInputFieldHighlight();
		IPElement.sendKeys(IP);
		Thread.sleep(100);
		IPElement.clear();
		return new IPListElement();									    			
	}		
		
	//2.0.3. Type to IP Input Field
	public IPListElement  typetoIPFieldtabKey() throws InterruptedException {
		ipElementInputFieldHighlight();
		IPElement.sendKeys(Keys.TAB);
		return new IPListElement();
	}
	
    // Method to copy data from the IP input field
    public String copyDataFromIPField() throws InterruptedException {
        ipElementInputFieldHighlight();
        String dataToCopy = IPElement.getAttribute("value");
        //webelement time = driver.findElement(By.id("input_name")).getAttribute("value");
        System.out.println(dataToCopy);

        //StringSelection stringSelection = new StringSelection(dataToCopy); // Copy the data to the clipboard
        //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        
        //IPElement.sendKeys(Keys.c);
        return dataToCopy;
    }
    
    //02. Element of IP
  	@FindBy(xpath="/html/body/div/div[3]/p[2]/a")
  	WebElement advanced_continue;
    
  	public IPListElement  advanceClickedConti() throws InterruptedException {
  		advanced_continue.click();
		return new IPListElement();
	}
    
   //02. Element of IP
  	@FindBy(xpath="/html/body/div/div[2]/button[3]")
  	WebElement advanced;
    
  	public IPListElement  advanceClicked() throws InterruptedException {
		advanced.click();
		return new IPListElement();
	}
  	
    //02. Element of IP2
  	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[3]")
  	WebElement IP_advanced_continue;
  	
  	public IPListElement  advance2ClickedConti() throws InterruptedException {
  		IP_advanced_continue.click();
		return new IPListElement();
	}
    // Method to copy data from the IP input field
    public String copy2DataFromIPField() throws InterruptedException {
        //ipElementInputFieldHighlight();
        String dataToCopy = IP_advanced_continue.getAttribute("value");
        //String time = driver.findElement(By.id("input_name")).getAttribute("value");
        System.out.println(dataToCopy);

        //StringSelection stringSelection = new StringSelection(dataToCopy); // Copy the data to the clipboard
        //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        
        //IPElement.sendKeys(Keys.c);
        return dataToCopy;
    }

	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of IP ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/

	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of note  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Note
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/textarea")
	WebElement noteElement;
	
	//03. Highlight the Note Input Field
	public void noteElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", noteElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", noteElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", noteElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", noteElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Note
	public IPListElement typeToNoteInputField() throws InterruptedException {
		noteElementInputFieldHighlight();
		noteElement.sendKeys("");
		return new IPListElement();
	}
	
	//03.0.1 Type to the Note parameter
	public IPListElement typeToNoteInputFieldParam(String note) throws InterruptedException {
		noteElementInputFieldHighlight();
		noteElement.sendKeys(note);		
		Thread.sleep(2000);		
		return new IPListElement();
	}
	
	//03.0.2. Type Note Input Field (enter text, then clear Note Input Field)
	public IPListElement typeAndClearNoteFieldParam(String note) throws InterruptedException {
		noteElementInputFieldHighlight();
		noteElement.sendKeys(note);
		Thread.sleep(100);
		noteElement.clear();
		return new IPListElement();									    			
	}		
		
	//3.0.3. Type to Note Input Field tab key
	public IPListElement  typetoNoteFieldtabKey() throws InterruptedException {
		noteElementInputFieldHighlight();
		noteElement.sendKeys(Keys.TAB);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.03 - Element of Note ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of type  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Type select Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/select")
	WebElement typeSelectFieldElement;
	
	//04. Highlight the Type select Field
	public void typeSelectFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", typeSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", typeSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", typeSelectFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", typeSelectFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Type select Field
	public IPListElement typeSelectField() throws InterruptedException {
		typeSelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/select")));
		drp.selectByIndex(2);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.04 - Element of type ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Transmission Protocol  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//05. Element of Transmission Protocol select Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[5]/div/select")
	WebElement transmissionprotocolFieldElement;
	
	//05. Highlight the Transmission Protocol select Field
	public void transmissionprotocolFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", transmissionprotocolFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", transmissionprotocolFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", transmissionprotocolFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", transmissionprotocolFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Transmission Protocol select Field
	public IPListElement transmissionprotocolSelectField() throws InterruptedException {
		transmissionprotocolFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[5]/div/select")));
		drp.selectByIndex(2);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.05 - Element of Transmission Protocol ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of UAE Network  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//06. Element of UAE Network select Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/select")
	WebElement uaeNetworkFieldElement;
	
	//06. Highlight the UAE Network select Field
	public void uaeNetworkFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", uaeNetworkFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", uaeNetworkFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", uaeNetworkFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", uaeNetworkFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the UAE Network select Field
	public IPListElement uaeNetworkSelectField() throws InterruptedException {
		uaeNetworkFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/select")));
		drp.selectByIndex(2);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.06 - Element of UAE Network ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/					
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of Country  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//07. Element of Country Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[7]/div/select")
	WebElement countryInputFieldElement;
	
	//07. Highlight the Country Input Field
	public void countrySelectFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", countryInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", countryInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", countryInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", countryInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the Country Input Field
	public IPListElement countrySelectField() throws InterruptedException {
		countrySelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[7]/div/select")));
		drp.selectByIndex(8);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.07 - Element of Country  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/		
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of VPN Server  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//08. Element of VPN Server select Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[8]/div/select")
	WebElement vpnServerFieldElement;
	
	//08. Highlight the VPN Server select Field
	public void vpnServerFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", vpnServerFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", vpnServerFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", vpnServerFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", vpnServerFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//08. Type to the VPN Server select Field
	public IPListElement vpnServerSelectField() throws InterruptedException {
		vpnServerFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[8]/div/select")));
		drp.selectByIndex(8);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.08 - Element of VPN Server  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/		
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Config $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//09. Element of Config
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[9]/div/textarea")
	WebElement configElement;
	
	//09. Highlight the Config Input Field
	public void configElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", configElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", configElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", configElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", configElement);
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Config
	public IPListElement typeToConfigInputField() throws InterruptedException {
		configElementInputFieldHighlight();
		configElement.sendKeys("");
		return new IPListElement();
	}
	
	//09.0.1 Type to the Config parameter
	public IPListElement typeToConfigInputFieldParam(String config) throws InterruptedException {
		configElementInputFieldHighlight();
		configElement.sendKeys(config);		
		Thread.sleep(2000);		
		return new IPListElement();
	}
	
	//09.0.2. Type Config Input Field (enter text, then clear Note Config Field)
	public IPListElement typeAndClearConfigInputFieldParam(String config) throws InterruptedException {
		configElementInputFieldHighlight();
		configElement.sendKeys(config);
		Thread.sleep(100);
		configElement.clear();
		return new IPListElement();									    			
	}		
		
	//9.0.3. Type to Config Input Field
	public IPListElement  typetoConfigInputFieldtabKey() throws InterruptedException {
		configElementInputFieldHighlight();
		configElement.sendKeys(Keys.TAB);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.09 - Element of Config ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/		
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Connection Type $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//10. Element of Connection Type input  Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[10]/div/select")
	WebElement connectionTypeElement;
	
	//10. Highlight the Connection Type input Field
	public void connectionTypeElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", connectionTypeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", connectionTypeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",connectionTypeElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", connectionTypeElement);
			Thread.sleep(1000);
		}
	}
	
	//10. Type to the Connection Type input Field
	public IPListElement connectionTypeSelectField() throws InterruptedException {
		connectionTypeElementHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[10]/div/select")));
		drp.selectByIndex(1);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.10 - Element of connection type  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/		
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.11 -   Element of SSL IP$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//11. Element of SSL IP
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[11]/div/input")
	WebElement sslIpElement;
	
	//11. Highlight the SSL IP Input Field
	public void sslIpElementElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", sslIpElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", sslIpElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", sslIpElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", sslIpElement);
			Thread.sleep(1000);
		}
	}
	
	//11. Type to the SSL IP
	public IPListElement typeTosslIpElementInputField() throws InterruptedException {
		noteElementInputFieldHighlight();
		sslIpElement.sendKeys("");
		return new IPListElement();
	}
	
	//11.0.1 Type to the SSL IP parameter
	public IPListElement typeTosslIpElementInputFieldParam(String ssl_ip) throws InterruptedException {
		noteElementInputFieldHighlight();
		sslIpElement.sendKeys(ssl_ip);		
		Thread.sleep(2000);		
		return new IPListElement();
	}
	
	//11.0.2. Type SSL IP Input Field (enter text, then clear SSL IP Input Field)
	public IPListElement typeAndClearsslIpElementFieldParam(String ssl_ip) throws InterruptedException {
		noteElementInputFieldHighlight();
		sslIpElement.sendKeys(ssl_ip);
		Thread.sleep(100);
		sslIpElement.clear();
		return new IPListElement();									    			
	}		
		
	//11.0.3. Type to SSL IP Input Field tab key
	public IPListElement  typetosslIpElementFieldtabKey() throws InterruptedException {
		noteElementInputFieldHighlight();
		sslIpElement.sendKeys(Keys.TAB);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.11 - Element of SSL IP ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/		
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.12 - Element of Site $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//12. Element of site
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[12]/div/input")
	WebElement siteElement;
	
	//12. Highlight the site Input Field
	public void siteElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", siteElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", siteElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", siteElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", siteElement);
			Thread.sleep(1000);
		}
	}
	
	//12. Type to the site
	public IPListElement typeToSiteInputField() throws InterruptedException {
		siteElementInputFieldHighlight();
		siteElement.sendKeys("");
		return new IPListElement();
	}
	
	//12.0.1 Type to the site parameter
	public IPListElement typeToSiteInputFieldParam(String site) throws InterruptedException {
		siteElementInputFieldHighlight();
		siteElement.sendKeys(site);		
		Thread.sleep(2000);		
		return new IPListElement();
	}
	
	//12.0.2. Type site Input Field (enter text, then clear site Input Field)
	public IPListElement typeAndClearSiteFieldParam(String site) throws InterruptedException {
		siteElementInputFieldHighlight();
		siteElement.sendKeys(site);
		Thread.sleep(100);
		siteElement.clear();
		return new IPListElement();									    			
	}		
		
	//12.0.3. Type to site tab key
	public IPListElement  typetoSiteFieldtabKey() throws InterruptedException {
		siteElementInputFieldHighlight();
		siteElement.sendKeys(Keys.TAB);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.12 -Element of Site ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/		
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.13 -   Element of Platform $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//13. Element of Platform input  Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[13]/div/select")
	WebElement platformTypeElement;
	
	//13. Highlight the Platform input Field
	public void platformTypeElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", platformTypeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", platformTypeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",platformTypeElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", platformTypeElement);
			Thread.sleep(1000);
		}
	}
	
	//13. Type to the Platform input Field
	public IPListElement platformTypeSelectField() throws InterruptedException {
		platformTypeElementHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[13]/div/select")));
		drp.selectByIndex(1);
		return new IPListElement();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.13 - Element of Platform  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.14 -   Element of Is Active Check box Field   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

    //14. Element of Is Active Check box Field
    @FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[14]/div/div/input")
    WebElement isActiveCheckboxFieldElement;

    //14. Highlight the Active Check box Field
    public void isActiveCheckboxFieldHighlight() throws InterruptedException {
        if (driver instanceof JavascriptExecutor) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isActiveCheckboxFieldElement);
            Thread.sleep(1000);
            js.executeScript("arguments[0].setAttribute('style', '');", isActiveCheckboxFieldElement);
            Thread.sleep(1000);
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isActiveCheckboxFieldElement);
            Thread.sleep(2000);
            js.executeScript("arguments[0].setAttribute('style', '');", isActiveCheckboxFieldElement);
            Thread.sleep(1000);
         }
     }

    //14. Type to the Is Active Check box Field
    public IPListElement clickTIsActiveCheckboxField() throws InterruptedException {
        isActiveCheckboxFieldHighlight();
        isActiveCheckboxFieldElement.click();
        return new IPListElement();
     }

    /*************************************************************
	* ****************************************************************************************************
	* ************************    End No.14 - Element of Is Active Check box Field   **********************
	* * **************************************************************************************************
							************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.15 -   Element of Is Streaming Check box Field   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

   //14. Element of Is Streaming Check box Field
   @FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[15]/div/div/input")
   WebElement isStreamingCheckboxFieldElement;

   //14. Highlight the Is Streaming Check box Field
   public void isStreamingCheckboxFieldHighlight() throws InterruptedException {
       if (driver instanceof JavascriptExecutor) {
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isStreamingCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', '');", isStreamingCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isStreamingCheckboxFieldElement);
           Thread.sleep(2000);
           js.executeScript("arguments[0].setAttribute('style', '');", isStreamingCheckboxFieldElement);
           Thread.sleep(1000);
        }
    }

   //14. Type to the Is Streaming Check box Field
   public IPListElement clickIsStreamingCheckboxField() throws InterruptedException {
	   isStreamingCheckboxFieldHighlight();
       Thread.sleep(1000);
       isStreamingCheckboxFieldElement.click();
       return new IPListElement();
    }

   /*************************************************************
	* ****************************************************************************************************
	* ************************    End No.15 - Element of Is Streaming Check box Field   **********************
	* * **************************************************************************************************
							************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.16 -   Element of Is Gaming Check box Field   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

   //16. Element of Is GamingCheck box Field
   @FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[16]/div/div/input")
   WebElement isGamingCheckboxFieldElement;

   //16. Highlight the Is Gaming Check box Field
   public void isGamingCheckboxFieldHighlight() throws InterruptedException {
       if (driver instanceof JavascriptExecutor) {
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isGamingCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', '');", isGamingCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isGamingCheckboxFieldElement);
           Thread.sleep(2000);
           js.executeScript("arguments[0].setAttribute('style', '');", isGamingCheckboxFieldElement);
           Thread.sleep(1000);
        }
    }

   //16. Type to the Is Gaming Check box Field
   public IPListElement clickIsGamingCheckboxField() throws InterruptedException {
	   isGamingCheckboxFieldHighlight();
       Thread.sleep(1000);
       isGamingCheckboxFieldElement.click();
       return new IPListElement();
    }

   /*************************************************************
	* ****************************************************************************************************
	* ************************    End No.15 - Element of Is Gaming Check box Field   **********************
	* * **************************************************************************************************
							************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.16 -   Element of Is free Check box Field   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
   
   //16. Element of Is Free Check box Field
   @FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[17]/div/div/input")
   WebElement isFreeCheckboxFieldElement;

   //16. Highlight the Is Free Check box Field
   public void isFreeCheckboxFieldHighlight() throws InterruptedException {
       if (driver instanceof JavascriptExecutor) {
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isFreeCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', '');", isFreeCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isFreeCheckboxFieldElement);
           Thread.sleep(2000);
           js.executeScript("arguments[0].setAttribute('style', '');", isFreeCheckboxFieldElement);
           Thread.sleep(1000);
        }
    }

   //16. Type to the Is Free Check box Field
   public IPListElement clickIsFreeCheckboxField() throws InterruptedException {
	   isFreeCheckboxFieldHighlight();
       Thread.sleep(1000);
       isFreeCheckboxFieldElement.click();
       return new IPListElement();
    }
   /*************************************************************
 	* ****************************************************************************************************
 	* ************************    End No.17 - Element of Is free Check box Field   **********************
 	* * **************************************************************************************************
 							************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.18 -   Element of Is ads blocker box Field   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
 

   //18. Element of Is Ads Blocker Check box Field
   @FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[18]/div/div/input")
   WebElement isAdsBlockerCheckboxFieldElement;

   //18. Highlight the Is Ads Blocker Check box Field
   public void isAdsBlockerCheckboxFieldHighlight() throws InterruptedException {
       if (driver instanceof JavascriptExecutor) {
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",isAdsBlockerCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', '');", isAdsBlockerCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isAdsBlockerCheckboxFieldElement);
           Thread.sleep(2000);
           js.executeScript("arguments[0].setAttribute('style', '');", isAdsBlockerCheckboxFieldElement);
           Thread.sleep(1000);
        }
    }

   //18. Type to the Is Ads Blocker Check box Field
   public IPListElement isAdsBlockerCheckboxField() throws InterruptedException {
	   isAdsBlockerCheckboxFieldHighlight();
       Thread.sleep(1000);
       isAdsBlockerCheckboxFieldElement.click();
       return new IPListElement();
    }
   
   /*************************************************************
 	* ****************************************************************************************************
 	* ************************    End No.18 - Element of Is Ads Blocker Check box Field   **********************
 	* * **************************************************************************************************
 							************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.19 -   Element of Is Fast Server box Field   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

   //19. Element of Is Fast Server Check box Field
   @FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[19]/div/div/input")
   WebElement isFastServerCheckboxFieldElement;

   //19. Highlight the Is Fast Server Check box Field
   public void isFastServerCheckboxFieldHighlight() throws InterruptedException {
       if (driver instanceof JavascriptExecutor) {
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",isFastServerCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', '');", isFastServerCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isFastServerCheckboxFieldElement);
           Thread.sleep(2000);
           js.executeScript("arguments[0].setAttribute('style', '');", isFastServerCheckboxFieldElement);
           Thread.sleep(1000);
        }
    }

   //19. Type to the Is Fast Server Check box Field
   public IPListElement isFastServerCheckboxField() throws InterruptedException {
	   isFastServerCheckboxFieldHighlight();
       Thread.sleep(1000);
       isFastServerCheckboxFieldElement.click();
       return new IPListElement();
    }
   
   /*************************************************************
  	* ****************************************************************************************************
  	* ************************    End No.19 - Element of Is Fast Server Check box Field   **********************
  	* * **************************************************************************************************
  							************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.19 -   Element of Is Loyal User Server box Field   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
   
   //20. Element of Is Loyal User Server Check box Field
   @FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[20]/div/div/input")
   WebElement isLoyalUserServerCheckboxFieldElement;

   //20. Highlight the Is Loyal User Server Check box Field
   public void isLoyalUserServerFieldHighlight() throws InterruptedException {
       if (driver instanceof JavascriptExecutor) {
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",isLoyalUserServerCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', '');", isLoyalUserServerCheckboxFieldElement);
           Thread.sleep(1000);
           js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isLoyalUserServerCheckboxFieldElement);
           Thread.sleep(2000);
           js.executeScript("arguments[0].setAttribute('style', '');", isLoyalUserServerCheckboxFieldElement);
           Thread.sleep(1000);
        }
    }

   //20. Type to the Is Loyal User Server Check box Field
   public IPListElement isLoyalUserServerCheckboxField() throws InterruptedException {
	   isLoyalUserServerFieldHighlight();
       Thread.sleep(1000);
       isLoyalUserServerCheckboxFieldElement.click();
       return new IPListElement();
    }
  
   /*************************************************************
 	* ****************************************************************************************************
 	* ************************    End No.19 - Element of Is Loyal User Server Check box Field   **********************
 	* * **************************************************************************************************
 							************************************************************************************************/
   
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.21 -   Element of Is Submit Button Field   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//21. Element of Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement submitButtonElement;
	
	//21. Highlight the Submit Button
	public void submitButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",submitButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//21. Click to the Submit Button
	public IPListElement clickONSubmitButton() throws InterruptedException {
		submitButtonInputFieldHighlight();
		submitButtonElement.click();
		return new IPListElement();
	}
		
	   /*************************************************************
	 	* ****************************************************************************************************
	 	* ************************    End No.21 - Element of Is Submit Button Field   **********************
	 	* * **************************************************************************************************
	 							************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.12 - Element of (NAME - search IP list) $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//12. Element of Name Search
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[1]/input")
	WebElement NameSearchElement;
	
	//12. Highlight the site Input Field
	public void NameSearchElementInputFieldHighlight() throws InterruptedException {
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
	
	//12.0.1 Type to the Name Search parameter
	public IPListElement typeToNameSearchInputFieldParam(String Name_Search) throws InterruptedException {
		NameSearchElementInputFieldHighlight();
		NameSearchElement.sendKeys(Name_Search);		
		Thread.sleep(2000);		
		return new IPListElement();
	}
	
	//12.0.2. Type Name Search Input Field (enter text, then clear Name Search Input Field)
	public IPListElement typeAndClearNameSearchFieldParam(String Name_Search) throws InterruptedException {
		NameSearchElementInputFieldHighlight();
		NameSearchElement.sendKeys(Name_Search);
		Thread.sleep(100);
		NameSearchElement.clear();
		return new IPListElement();									    			
	}		
		
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.12 - Element of (NAME - search IP list) ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/		
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.21 -   Element of Is (Search button- search IP list)   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//21. Element of Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[6]/div[2]/a")
	WebElement SearchIPButtonElement;
	
	//21. Highlight the Submit Button
	public void SearchIPButtondHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", SearchIPButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", SearchIPButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",SearchIPButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", SearchIPButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//21. Click to the Submit Button
	public IPListElement clickONSearchIPButton() throws InterruptedException {
		SearchIPButtondHighlight();
		SearchIPButtonElement.click();
		return new IPListElement();
	}
		
	   /*************************************************************
	 	* ****************************************************************************************************
	 	* ************************    End No.21 - Element of Is (Search button- search IP list)  **********************
	 	* * **************************************************************************************************
	 							************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.12 - Element of (NAME - search IP list) $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//12. Element of IP Search
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[2]/input")
	WebElement IPSearchElement;
	
	//12. Highlight the IP Search Input Field
	public void IPSearchElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", IPSearchElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", IPSearchElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", IPSearchElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", IPSearchElement);
			Thread.sleep(1000);
		}
	}
	
	
	//12.0.1 Type to the IP Search parameter
	public IPListElement typeToIPSearchInputFieldParam(String IP_Search) throws InterruptedException {
		IPSearchElementInputFieldHighlight();
		IPSearchElement.sendKeys(IP_Search);		
		Thread.sleep(2000);		
		return new IPListElement();
	}
	
	//12.0.2. Type ip Search Input Field (enter text, then clear IP Search Input Field)
	public IPListElement typeAndClearIPSearchFieldParam(String IP_Search) throws InterruptedException {
		IPSearchElementInputFieldHighlight();
		IPSearchElement.sendKeys(IP_Search);
		Thread.sleep(100);
		IPSearchElement.clear();
		return new IPListElement();									    			
	}		
		

	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.12 - Element of (NAME - search IP list) ******************************************
	* * **************************************************************************************************
	 							************************************************************************************************/
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.12 - Element of (NAME - search IP list) ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/		
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$ Start No.21 -   Element of Is (edit button IP list)   $$$$$$$$$$$$$$$$$$$$$$
	  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//21. Element of IP edit button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[15]/a[1]/i")
	WebElement editIPButtonElement;
	
	//21. Highlight the IP edit button
	public void editIPButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", editIPButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", editIPButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",editIPButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", editIPButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//21. Click to the IP edit button
	public IPListElement clickONEditIPButton() throws InterruptedException {
		editIPButtonHighlight();
		editIPButtonElement.click();
		return new IPListElement();
	}
		
	   /*************************************************************
	 	* ****************************************************************************************************
	 	* ************************    End No.21 - Element of Is (Search button- search IP list)  **********************
	 	* * **************************************************************************************************
	 							************************************************************************************************/
}
