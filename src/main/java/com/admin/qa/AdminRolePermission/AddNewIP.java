package com.admin.qa.AdminRolePermission;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.admin.qa.CampaignForm.AddNewPaymentGateway;
import com.admin.qa.function.SendPushtoUser;
import com.crm.qa.base.TestBase;

public class AddNewIP extends TestBase{
	public AddNewIP(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewIP openAddNewIPPage() {
		driver.get(props.getProperty("url")+"ip/create");
		return new AddNewIP();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	    			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  				  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Server Name   $$$$$$$$$$$$$$$$$$$$$$$$$$
	  				  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  											 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//01. Element of Server Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement serverNameElement;
	
	//01. Highlight the Server Name Input Field
	public void serverNameElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Server Name
	public AddNewIP typeToServerName() throws InterruptedException {
		serverNameElementInputFieldHighlight();/* highlight the element of the tested. */
		serverNameElement.sendKeys("Test....");/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.01 - Element of Server Name    *********************************
						* * ***************************************************************************************************
													******************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  				  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Server IP   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									            *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of IP
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement ipElement;
	
	//02. Highlight the IP Input Field
	public void ipElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ipElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ipElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Server Name
	public AddNewIP typeToIP() throws InterruptedException {
		ipElementInputFieldHighlight();/* highlight the element of the tested. */
		ipElement.sendKeys("Test....");/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.02 - Element of IP    ******************************************
						* * ***************************************************************************************************
													******************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Server Note   $$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					            				 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//03. Element of Server Note
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/textarea")
	WebElement serverNoteElement;
	
	//03. Highlight the Server Note Input Field
	public void serverNoteInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverNoteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNoteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverNoteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNoteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Server Note
	public AddNewIP typeToServerNote() throws InterruptedException {
		serverNoteInputFieldHighlight();/* highlight the element of the tested. */
		serverNoteElement.sendKeys("Test....");/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.03 - Element of Server Note    *********************************
						* * ***************************************************************************************************
													******************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -  Element of Server Type   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Server Type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/select")
	WebElement serverTypeeElement;
	
	//04. Highlight the Server Type Dropdown Field
	public void serverTypeFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverTypeeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverTypeeElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverTypeeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverTypeeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//04. Select from Server Type Dropdown Field
	public AddNewIP sendToDropdownField() throws InterruptedException {
		serverTypeFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/select")));
		drp.selectByIndex(1);
		return new AddNewIP(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.04 - Element of Send To    ***************************
							*********************************************************************************************
										  				*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -  Element of UAE Network   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of UAE Network
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[5]/div/select")
	WebElement uaeNetworkElement;
	
	//05. Highlight the UAE Network Dropdown Field
	public void uaeNetworkFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", uaeNetworkElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", uaeNetworkElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", uaeNetworkElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", uaeNetworkElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Select from UAE Network Dropdown Field
	public AddNewIP uaeNetworkDropdownField() throws InterruptedException {
		serverTypeFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[5]/div/select")));
		drp.selectByIndex(1);
		return new AddNewIP(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.05 - Element of UAE Network    ***********************
							*********************************************************************************************
							  							*****************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Country   $$$$$$$$$$$$$$$$$$$$$$$$
					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Country Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/span")
	WebElement dropDownCountryinSelect;
	
	//06. Country Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInCountryDropDown;
	
	//06. Country Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForCountrySearch;
	
	//06. Highlight the Country Input Field
	public void countryDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCountryinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCountryinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCountryinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCountryinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//06. Select From the Country
	public AddNewIP selectDatafromCountryDropDownElement() throws InterruptedException {
		countryDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownCountryinSelect.click(); /*click on the element */
		searchInCountryDropDown.sendKeys("Bangladesh");/*type on the input field */
		valueForCountrySearch.click();/*click on the element from result of the first value. */
		return new AddNewIP();
	}
	
	/*******************************************************************
											 **************************************************************************************************
											 ***************************    End No.06 - Element of Country    *********************************
											 **************************************************************************************************
																   ********************************************************************************************/
	
	
	
	
}
