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
	public AddNewIP serverTypeDropdownField() throws InterruptedException {
		serverTypeFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/select")));
		drp.selectByIndex(1);
		return new AddNewIP(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.04 - Element of Server Type    ***********************
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
		uaeNetworkFieldHighlight();/* highlight the element of the tested. */
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
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of VPN Server   $$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. VPN Server Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[7]/div/span")
	WebElement dropDownVPNServerinSelect;
	
	//07. VPN Server Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInVPNServerDropDown;
	
	//07. VPN Server Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForVPNServerSearch;
	
	//07. Highlight the VPN Server Input Field
	public void vpnServerDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownVPNServerinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownVPNServerinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownVPNServerinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownVPNServerinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Select From the VPN Server
	public AddNewIP selectDatafromVPNServerDropDownElement() throws InterruptedException {
		countryDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownVPNServerinSelect.click(); /*click on the element */
		searchInVPNServerDropDown.sendKeys("Dhaka-5");/*type on the input field */
		valueForVPNServerSearch.click();/*click on the element from result of the first value. */
		return new AddNewIP();
	}
	
	/*******************************************************************
								 			 **************************************************************************************************
								 			 ***************************    End No.07 - Element of VPN Server    ******************************
								 			 **************************************************************************************************
													                  ********************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -  Element of Connection Type   $$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//08. Element of Connection Type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[9]/div/select")
	WebElement connectionTypeElement;
	
	//08. Highlight the Connection Type Dropdown Field
	public void connectionTypeFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", connectionTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", connectionTypeElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", connectionTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", connectionTypeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//08. Select from Connection Type Dropdown Field
	public AddNewIP connectionTypeDropdownField() throws InterruptedException {
		connectionTypeFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[9]/div/select")));
		drp.selectByIndex(1);
		return new AddNewIP(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
						    ****************************    End No.08 - Element of Connection Type    *******************
						    *********************************************************************************************
				  										*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  				  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of SSL IP   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									 			  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//09. Element of SSL IP
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[10]/div/input")
	WebElement sslIPElement;
	
	//09. Highlight the SSL IP Input Field
	public void sslIPElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", sslIPElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", sslIPElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", sslIPElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", sslIPElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the SSL IP
	public AddNewIP typeToSSLIP() throws InterruptedException {
		sslIPElementInputFieldHighlight();/* highlight the element of the tested. */
		sslIPElement.sendKeys("11.22.0.99");/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.09 - Element of Server Name    *********************************
						* * ***************************************************************************************************
												   ******************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Site   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					 			  				  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//10. Element of Site
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[11]/div/input")
	WebElement siteElement;
	
	//10. Highlight the Site Input Field
	public void siteElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", siteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", siteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", siteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", siteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//10. Type to the Site
	public AddNewIP typeToSite() throws InterruptedException {
		siteElementInputFieldHighlight();/* highlight the element of the tested. */
		siteElement.sendKeys("Test...");/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.10 - Element of Site    ****************************************
						* * ***************************************************************************************************
									   				******************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.11 -  Element of Platform   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//11. Element of Platform
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[12]/div/select")
	WebElement platformElement;
	
	//11. Highlight the Platform Dropdown Field
	public void platformFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", platformElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", platformElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", platformElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", platformElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//11. Select from Platform Dropdown Field
	public AddNewIP platformDropdownField() throws InterruptedException {
		platformFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[12]/div/select")));
		drp.selectByIndex(1);
		return new AddNewIP(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
			    			****************************    End No.11 - Element of Platform    **************************
			    			*********************************************************************************************
	  													*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.12 -   Element of Active / Inactive   $$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 			  				  				*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//12. Element of Active / Inactive
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[13]/div/div/input")
	WebElement activeInactiveElement;
	
	//12. Highlight the Active / Inactive Input Field
	public void activeInactiveElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//12. Type to the Active / Inactive
	public AddNewIP clickToActiveInactive() throws InterruptedException {
		activeInactiveElementInputFieldHighlight();/* highlight the element of the tested. */
		activeInactiveElement.click();/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.12 - Element of Active / Inactive    ****************************************
						* * ***************************************************************************************************
						   							******************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.13 -   Element of Is Streaming   $$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				  				  					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//10. Element of Is Streaming
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[14]/div/div/input")
	WebElement isStreamingElement;
	
	//10. Highlight the Is Streaming Input Field
	public void isStreamingElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isStreamingElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isStreamingElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isStreamingElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isStreamingElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//10. Type to the Is Streaming
	public AddNewIP clickToIsStreaming() throws InterruptedException {
		isStreamingElementInputFieldHighlight();/* highlight the element of the tested. */
		isStreamingElement.click();/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.13 - Element of Is Streaming    ********************************
						* * ***************************************************************************************************
					   								******************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.14 -   Element of Gaming   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				  				  				 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//14. Element of Gaming
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[15]/div/div/input")
	WebElement isGamingElement;
	
	//14. Highlight the Site Input Field
	public void isGamingElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isGamingElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isGamingElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isGamingElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isGamingElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//14. Type to the is Gaming
	public AddNewIP clickToisGaming() throws InterruptedException {
		isGamingElementInputFieldHighlight();/* highlight the element of the tested. */
		isGamingElement.click();/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.14 - Element of is Gaming    ***********************************
						* * ***************************************************************************************************
					   								******************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.15 -   Element of Is Free   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				  				  					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//15. Element of Is Free
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[16]/div/div/input")
	WebElement isFreeElement;
	
	//15. Highlight the Is Free Input Field
	public void isFreeElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isFreeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isFreeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isFreeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isFreeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//15. Type to the Is Free
	public AddNewIP clickToIsFree() throws InterruptedException {
		isFreeElementInputFieldHighlight();/* highlight the element of the tested. */
		isFreeElement.click();/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.15 - Element of Is FreeElement    ******************************
						* * ***************************************************************************************************
					   								******************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.16 -   Element of Is Ads Blocker   $$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				  				  					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//16. Element of Is Ads Blocker
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[17]/div/div/input")
	WebElement isAdsBlockerElement;
	
	//16. Highlight the Is Ads Blocker Input Field
	public void isAdsBlockerElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isAdsBlockerElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isAdsBlockerElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isAdsBlockerElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isAdsBlockerElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//16. Type to the Is Ads Blocker
	public AddNewIP clickToIsAdsBlocker() throws InterruptedException {
		isAdsBlockerElementInputFieldHighlight();/* highlight the element of the tested. */
		isAdsBlockerElement.click();/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.16 - Element of Is Ads Blocker    ******************************
						* * ***************************************************************************************************
					   								******************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.17 -   Element of Is Fast Server   $$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				  				  					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//17. Element of Is Fast Server
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[18]/div/div/input")
	WebElement isFastServerElement;
	
	//17. Highlight the Is Fast Server Input Field
	public void isFastServerElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isFastServerElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isFastServerElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isFastServerElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isFastServerElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//17. Type to the Is Fast Server
	public AddNewIP clickToIsFastServer() throws InterruptedException {
		isFastServerElementInputFieldHighlight();/* highlight the element of the tested. */
		isFastServerElement.click();/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
					 	* **************************    End No.17 - Element of Site    ****************************************
					 	* * ***************************************************************************************************
					   									******************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.18 -   Element of Loyal User Server   $$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				  				                *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//18. Element of Loyal User Server
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[19]/div/div/input")
	WebElement loyalUserServerElement;
	
	//18. Highlight the Loyal User Server Input Field
	public void loyalUserServerElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loyalUserServerElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", loyalUserServerElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loyalUserServerElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", loyalUserServerElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//18. Type to the Loyal User Server
	public AddNewIP clickToLoyalUserServer() throws InterruptedException {
		loyalUserServerElementInputFieldHighlight();/* highlight the element of the tested. */
		loyalUserServerElement.click();/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.18 - Element of Site    ****************************************
						* * ***************************************************************************************************
					   								******************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.19 -   Element of Submit Button   $$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 				                					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//19. Element of Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement submitButtonElement;
	
	//19. Highlight the Submit Button Input Field
	public void submitButtonElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//19. Type to the Loyal User Server
	public AddNewIP clickToLoyalUseSubmitButton() throws InterruptedException {
		submitButtonElementInputFieldHighlight();/* highlight the element of the tested. */
		submitButtonElement.click();/*select data on the dropdown field */
		return new AddNewIP();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.19 - Element of Site    ****************************************
						* * ***************************************************************************************************
		   											******************************************************************************************************/
	
}
