package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class AddNewIP extends TestBase{
	public AddNewIP(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewIP openAddNewIPForm() {
		driver.get(props.getProperty("url")+"/ip/create");
		return new AddNewIP();
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
	public AddNewIP typeToServerNameInputField() throws InterruptedException {
		serverNameElementInputFieldHighlight();
		serverNameElement.sendKeys("");
		return new AddNewIP();
	}
	
	//01.0.1 Type to the Server Name parameter
	public AddNewIP typeToServerNameFieldParam(String server_name) throws InterruptedException {
		serverNameElementInputFieldHighlight();
		serverNameElement.sendKeys(server_name);		
		Thread.sleep(2000);		
		return new AddNewIP();
	}
	
	//01.0.2. Type Server Name Input Field (enter text, then clear Server Name Input Field)
	public AddNewIP typeAndClearServerNameFieldParam(String server_name) throws InterruptedException {
		serverNameElementInputFieldHighlight();
		serverNameElement.sendKeys(server_name);
		Thread.sleep(100);
		serverNameElement.clear();
		return new AddNewIP();									    			
	}		
		
	//1.0.3. Type to Server Name Input Field
	public AddNewIP  typetoServerNameFieldtabKey() throws InterruptedException {
		serverNameElementInputFieldHighlight();
		serverNameElement.sendKeys(Keys.TAB);
		return new AddNewIP();
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
	
	//02. Type to the IP
	public AddNewIP typeToIPInputField() throws InterruptedException {
		ipElementInputFieldHighlight();
		IPElement.sendKeys("");
		return new AddNewIP();
	}
	
	//02.0.1 Type to the IP parameter
	public AddNewIP typeToIPInputFieldParam(String IP) throws InterruptedException {
		ipElementInputFieldHighlight();
		IPElement.sendKeys(IP);		
		Thread.sleep(2000);		
		return new AddNewIP();
	}
	
	//02.0.2. Type IP Input Field (enter text, then clear IP Input Field)
	public AddNewIP typeAndClearIPFieldParam(String IP) throws InterruptedException {
		ipElementInputFieldHighlight();
		IPElement.sendKeys(IP);
		Thread.sleep(100);
		IPElement.clear();
		return new AddNewIP();									    			
	}		
		
	//2.0.3. Type to IP Input Field
	public AddNewIP  typetoIPFieldtabKey() throws InterruptedException {
		ipElementInputFieldHighlight();
		IPElement.sendKeys(Keys.TAB);
		return new AddNewIP();
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
	public AddNewIP typeToNoteInputField() throws InterruptedException {
		noteElementInputFieldHighlight();
		noteElement.sendKeys("");
		return new AddNewIP();
	}
	
	//03.0.1 Type to the Note parameter
	public AddNewIP typeToNoteInputFieldParam(String note) throws InterruptedException {
		noteElementInputFieldHighlight();
		noteElement.sendKeys(note);		
		Thread.sleep(2000);		
		return new AddNewIP();
	}
	
	//03.0.2. Type Note Input Field (enter text, then clear Note Input Field)
	public AddNewIP typeAndClearNoteFieldParam(String note) throws InterruptedException {
		noteElementInputFieldHighlight();
		noteElement.sendKeys(note);
		Thread.sleep(100);
		noteElement.clear();
		return new AddNewIP();									    			
	}		
		
	//3.0.3. Type to Note Input Field tab key
	public AddNewIP  typetoNoteFieldtabKey() throws InterruptedException {
		noteElementInputFieldHighlight();
		noteElement.sendKeys(Keys.TAB);
		return new AddNewIP();
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
	public AddNewIP typeSelectField() throws InterruptedException {
		typeSelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/select")));
		drp.selectByIndex(2);
		return new AddNewIP();
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
	public AddNewIP transmissionprotocolSelectField() throws InterruptedException {
		transmissionprotocolFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[5]/div/select")));
		drp.selectByIndex(2);
		return new AddNewIP();
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
	public AddNewIP uaeNetworkSelectField() throws InterruptedException {
		uaeNetworkFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/select")));
		drp.selectByIndex(2);
		return new AddNewIP();
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
	public AddNewIP countrySelectField() throws InterruptedException {
		countrySelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[7]/div/select")));
		drp.selectByIndex(8);
		return new AddNewIP();
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
	public AddNewIP vpnServerSelectField() throws InterruptedException {
		vpnServerFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[8]/div/select")));
		drp.selectByIndex(8);
		return new AddNewIP();
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
	public AddNewIP typeToConfigInputField() throws InterruptedException {
		configElementInputFieldHighlight();
		configElement.sendKeys("");
		return new AddNewIP();
	}
	
	//09.0.1 Type to the Config parameter
	public AddNewIP typeToConfigInputFieldParam(String config) throws InterruptedException {
		configElementInputFieldHighlight();
		configElement.sendKeys(config);		
		Thread.sleep(2000);		
		return new AddNewIP();
	}
	
	//09.0.2. Type Config Input Field (enter text, then clear Note Config Field)
	public AddNewIP typeAndClearConfigInputFieldParam(String config) throws InterruptedException {
		configElementInputFieldHighlight();
		configElement.sendKeys(config);
		Thread.sleep(100);
		configElement.clear();
		return new AddNewIP();									    			
	}		
		
	//9.0.3. Type to Config Input Field
	public AddNewIP  typetoConfigInputFieldtabKey() throws InterruptedException {
		configElementInputFieldHighlight();
		configElement.sendKeys(Keys.TAB);
		return new AddNewIP();
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
	public AddNewIP connectionTypeSelectField() throws InterruptedException {
		connectionTypeElementHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[10]/div/select")));
		drp.selectByIndex(1);
		return new AddNewIP();
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
	public AddNewIP typeTosslIpElementInputField() throws InterruptedException {
		noteElementInputFieldHighlight();
		sslIpElement.sendKeys("");
		return new AddNewIP();
	}
	
	//11.0.1 Type to the SSL IP parameter
	public AddNewIP typeTosslIpElementInputFieldParam(String ssl_ip) throws InterruptedException {
		noteElementInputFieldHighlight();
		sslIpElement.sendKeys(ssl_ip);		
		Thread.sleep(2000);		
		return new AddNewIP();
	}
	
	//11.0.2. Type SSL IP Input Field (enter text, then clear SSL IP Input Field)
	public AddNewIP typeAndClearsslIpElementFieldParam(String ssl_ip) throws InterruptedException {
		noteElementInputFieldHighlight();
		sslIpElement.sendKeys(ssl_ip);
		Thread.sleep(100);
		sslIpElement.clear();
		return new AddNewIP();									    			
	}		
		
	//11.0.3. Type to SSL IP Input Field tab key
	public AddNewIP  typetosslIpElementFieldtabKey() throws InterruptedException {
		noteElementInputFieldHighlight();
		sslIpElement.sendKeys(Keys.TAB);
		return new AddNewIP();
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
	public AddNewIP typeToSiteInputField() throws InterruptedException {
		siteElementInputFieldHighlight();
		siteElement.sendKeys("");
		return new AddNewIP();
	}
	
	//12.0.1 Type to the site parameter
	public AddNewIP typeToSiteInputFieldParam(String site) throws InterruptedException {
		siteElementInputFieldHighlight();
		siteElement.sendKeys(site);		
		Thread.sleep(2000);		
		return new AddNewIP();
	}
	
	//12.0.2. Type site Input Field (enter text, then clear site Input Field)
	public AddNewIP typeAndClearSiteFieldParam(String site) throws InterruptedException {
		siteElementInputFieldHighlight();
		siteElement.sendKeys(site);
		Thread.sleep(100);
		siteElement.clear();
		return new AddNewIP();									    			
	}		
		
	//12.0.3. Type to site tab key
	public AddNewIP  typetoSiteFieldtabKey() throws InterruptedException {
		siteElementInputFieldHighlight();
		siteElement.sendKeys(Keys.TAB);
		return new AddNewIP();
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
	public AddNewIP platformTypeSelectField() throws InterruptedException {
		platformTypeElementHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[13]/div/select")));
		drp.selectByIndex(1);
		return new AddNewIP();
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
    public AddNewIP clickTIsActiveCheckboxField() throws InterruptedException {
        isActiveCheckboxFieldHighlight();
        isActiveCheckboxFieldElement.click();
        return new AddNewIP();
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
   public AddNewIP clickIsStreamingCheckboxField() throws InterruptedException {
	   isStreamingCheckboxFieldHighlight();
       Thread.sleep(1000);
       isStreamingCheckboxFieldElement.click();
       return new AddNewIP();
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
   public AddNewIP clickIsGamingCheckboxField() throws InterruptedException {
	   isGamingCheckboxFieldHighlight();
       Thread.sleep(1000);
       isGamingCheckboxFieldElement.click();
       return new AddNewIP();
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
   public AddNewIP clickIsFreeCheckboxField() throws InterruptedException {
	   isFreeCheckboxFieldHighlight();
       Thread.sleep(1000);
       isFreeCheckboxFieldElement.click();
       return new AddNewIP();
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
   public AddNewIP isAdsBlockerCheckboxField() throws InterruptedException {
	   isAdsBlockerCheckboxFieldHighlight();
       Thread.sleep(1000);
       isAdsBlockerCheckboxFieldElement.click();
       return new AddNewIP();
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
   public AddNewIP isFastServerCheckboxField() throws InterruptedException {
	   isFastServerCheckboxFieldHighlight();
       Thread.sleep(1000);
       isFastServerCheckboxFieldElement.click();
       return new AddNewIP();
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
   public AddNewIP isLoyalUserServerCheckboxField() throws InterruptedException {
	   isLoyalUserServerFieldHighlight();
       Thread.sleep(1000);
       isLoyalUserServerCheckboxFieldElement.click();
       return new AddNewIP();
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
	public AddNewIP clickONSubmitButton() throws InterruptedException {
		submitButtonInputFieldHighlight();
		submitButtonElement.click();
		return new AddNewIP();
	}
		
	   /*************************************************************
	 	* ****************************************************************************************************
	 	* ************************    End No.21 - Element of Is Submit Button Field   **********************
	 	* * **************************************************************************************************
	 							************************************************************************************************/
	  
	
}
