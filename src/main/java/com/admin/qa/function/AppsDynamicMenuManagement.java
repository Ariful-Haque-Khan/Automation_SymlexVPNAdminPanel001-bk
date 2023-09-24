package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AppsDynamicMenuManagement extends TestBase{
	public AppsDynamicMenuManagement(){
		PageFactory.initElements(driver, this);
	}
	
	public AppsDynamicMenuManagement openAppsDynamicMenuManagementFormPage() {
		driver.get(props.getProperty("url")+"push/apps_dynamic_menus");
		return new AppsDynamicMenuManagement();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						    * $$$$$$$$$$$$$$$$$$$$$$  Start No.01   Drop Down Element called Include Resellers   $$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//01. Include Resellers Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/span")
	WebElement dropDownIncludeResellersSelect;
	
	//01. Apps Dynamic Menu Management Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/span/span[1]/span/ul/li[2]/input")
	WebElement searchInIncludeResellersDropDown;
	
	//01. Apps Dynamic Menu Management Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li")
	WebElement valueForIncludeResellersSearch;
	
	//01. Highlight the Apps Dynamic Menu Management Drop down Input Field
	public void includeResellersDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIncludeResellersSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIncludeResellersSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIncludeResellersSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIncludeResellersSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Include Resellers
	public AppsDynamicMenuManagement selectDatafromIncludeResellersDropDownElement() throws InterruptedException {
		includeResellersDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownIncludeResellersSelect.click(); /*click on the element */
		searchInIncludeResellersDropDown.sendKeys("mahfuz4");/*type on the input field */
		valueForIncludeResellersSearch.click();/*click on the element from result of the first value. */
		return new AppsDynamicMenuManagement();
	}
	
	/**************************************
			* **********************************************************************************************************************
								* *********   End No.01 - Drop Down Element called Include Resellers   *****************************
								* * ************************************************************************************************
															**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						  * $$$$$$$$$$$$$$$$$$$$$$  Start No.02   Drop Down Element called Exclude Resellers   $$$$$$$$$$$$$$$$$
						  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//02. Exclude Resellers Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/span")
	WebElement dropDownExcludeResellersSelect;
	
	//02. Exclude Resellers Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/span/span[1]/span/ul/li/input")
	WebElement searchInExcludeResellersDropDown;
	
	//02. Exclude Resellers Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li")
	WebElement valueForExcludeResellersSearch;
	
	//02. Highlight the Exclude Resellers Drop down Input Field
	public void appsExcludeResellersDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownExcludeResellersSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownExcludeResellersSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownExcludeResellersSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownExcludeResellersSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//02. Multiple Select from Exclude Resellers
	public AppsDynamicMenuManagement selectDatafromExcludeResellersDropDownElement() throws InterruptedException {
		appsExcludeResellersDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownExcludeResellersSelect.click(); /*click on the element */
		searchInExcludeResellersDropDown.sendKeys("mahfuz4");/*type on the input field */
		valueForExcludeResellersSearch.click();/*click on the element from result of the first value. */
		return new AppsDynamicMenuManagement();
	}
	
	/**************************************
	 							* ******************************************************************************************
								* *********   End No.02 - Drop Down Element called Exclude Resellers   *********************
								* * ****************************************************************************************
														**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -  Element of Start Date   $$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//03. Element of Start Date
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement startDateInputElement;
	
	//03. Highlight the Start Date Field
	public void startDateInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", startDateInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", startDateInputElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", startDateInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", startDateInputElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Type To Start Date Input Field
	public AppsDynamicMenuManagement startDateInputField() throws InterruptedException {
		startDateInputFieldHighlight();/* highlight the element of the tested. */
		startDateInputElement.sendKeys("2023-09-12"); /*type to the element. */
		return new AppsDynamicMenuManagement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.03 - Element of Element of Start Date    *************
							*********************************************************************************************
	  													*****************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -  Element of End Date   $$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									 				 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of End Date
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/input")
	WebElement endDateInputElement;
	
	//04. Highlight the Start Date Field
	public void endDateInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", endDateInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", endDateInputElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", endDateInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", endDateInputElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//04. Type To Start Date Input Field
	public AppsDynamicMenuManagement endDateInputField() throws InterruptedException {
		endDateInputFieldHighlight();/* highlight the element of the tested. */
		endDateInputElement.sendKeys("2023-09-12"); /*type to the element. */
		return new AppsDynamicMenuManagement(); 
	}
	
	
	/***************************************************
				*********************************************************************************************
				****************************    End No.04 - Element of Element of End Date    ***************
				*********************************************************************************************
												*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -  Element of Menu 1 Text   $$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					 				 				  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Menu 1 Text
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[3]/div[1]/div/div/div/input[1]")
	WebElement menu1TextInputElement;
	
	//05. Highlight the Menu 1 Text Input Field
	public void menu1TextInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", menu1TextInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", menu1TextInputElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", menu1TextInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", menu1TextInputElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Type To Menu 1 Text Input Field
	public AppsDynamicMenuManagement menu1TextInputField() throws InterruptedException {
		menu1TextInputFieldHighlight();/* highlight the element of the tested. */
		menu1TextInputElement.clear(); /*clear text to the element. */
		menu1TextInputElement.sendKeys("International Call"); /*type to the element. */
		return new AppsDynamicMenuManagement(); 
	}
	
	
	/***************************************************
	 						*********************************************************************************************
						    ****************************    End No.05 - Element of Menu 1 Text    ***********************
						    *********************************************************************************************
														 *****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -  Element of Menu 2 Text   $$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				 				  				*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of Menu 2 Text
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[3]/div[1]/div/div/div/input[2]")
	WebElement menu2TextInputElement;
	
	//06. Highlight the Menu 2 Text Input Field
	public void menu2TextInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", menu2TextInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", menu2TextInputElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", menu2TextInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", menu2TextInputElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//06. Type To Menu 1 Text Input Field
	public AppsDynamicMenuManagement menu2TextInputField() throws InterruptedException {
		menu2TextInputFieldHighlight();/* highlight the element of the tested. */
		menu2TextInputElement.clear(); /*clear text to the element. */
		menu2TextInputElement.sendKeys("https://symlexvpn.com/"); /*type to the element. */
		return new AppsDynamicMenuManagement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.06 - Element of Menu 2 Text    ***********************
							*********************************************************************************************
											 			*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -  Element of Menu 3 Text   $$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 				  								*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Menu 3 Text
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[3]/div[1]/div/div/div/input[3]")
	WebElement menu3TextInputElement;
	
	//07. Highlight the Menu 3 Text Input Field
	public void menu3TextInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", menu3TextInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", menu3TextInputElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", menu3TextInputElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", menu3TextInputElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Type To Menu 1 Text Input Field
	public AppsDynamicMenuManagement menu3TextInputField() throws InterruptedException {
		menu3TextInputFieldHighlight();/* highlight the element of the tested. */
		menu3TextInputElement.clear(); /*clear text to the element. */
		menu3TextInputElement.sendKeys("1"); /*type to the element. */
		return new AppsDynamicMenuManagement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.07 - Element of Menu 3 Text    ***********************
							*********************************************************************************************
								 						*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -  Element of Cross Button   $$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			  										  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//08. Element of Cross Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[3]/div[1]/div/div/button")
	WebElement crossButtonElement;
	
	//08. Highlight the Cross Button Input Field
	public void crossButtonButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", crossButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", crossButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", crossButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", crossButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//08. Click To Cross Button Input Field
	public AppsDynamicMenuManagement crossButtonInputField() throws InterruptedException {
		crossButtonButtonInputFieldHighlight();/* highlight the element of the tested. */
		crossButtonElement.click(); /*type to the element. */
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		return new AppsDynamicMenuManagement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.08 - Element of Cross Button   ***********************
							*********************************************************************************************
					 									*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.09 -  Element of Add New Menu Button  $$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										  				*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//09. Element of Add New Menu Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[3]/div[2]/div/button")
	WebElement addNewMenuButtonElement;
	
	//09. Highlight the Cross Button Input Field
	public void addNewMenuButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", addNewMenuButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", addNewMenuButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", addNewMenuButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", addNewMenuButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//09. Click To Add New Menu Button Input Field
	public AppsDynamicMenuManagement addNewMenuButtonInputField() throws InterruptedException {
		addNewMenuButtonInputFieldHighlight();/* highlight the element of the tested. */
		addNewMenuButtonElement.click(); /*type to the element. */
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		return new AppsDynamicMenuManagement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.09 - Element of Cross Button   ***********************
							*********************************************************************************************
		 												*****************************************************************************************************/

	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.10 -  Element of Refresh App Button  $$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						  							  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//10. Element of Add New Menu Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/a")
	WebElement refreshAppButtonElement;
	
	//10. Highlight the Cross Button Input Field
	public void refreshAppButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", refreshAppButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", addNewMenuButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", refreshAppButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", refreshAppButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//10. Click To Add New Menu Button Input Field
	public AppsDynamicMenuManagement refreshAppButtonInputField() throws InterruptedException {
		refreshAppButtonInputFieldHighlight();/* highlight the element of the tested. */
		//refreshAppButtonElement.click(); /*type to the element. */
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		return new AppsDynamicMenuManagement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.10 - Element of Refresh App Button   *****************
							*********************************************************************************************
														*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.11 -  Element of Save Button  $$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  							  					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//11. Element of Save Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/input[2]")
	WebElement saveButtonElement;
	
	//11. Highlight the Save Button Input Field
	public void saveButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//11. Click To Add New Menu Button Input Field
	public AppsDynamicMenuManagement saveButtonInputField() throws InterruptedException {
		saveButtonInputFieldHighlight();/* highlight the element of the tested. */
		saveButtonElement.click(); /*type to the element. */
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		return new AppsDynamicMenuManagement(); 
	}
	
	
	/***************************************************
				*********************************************************************************************
				****************************    End No.10 - Element of Refresh App Button   *****************
				*********************************************************************************************
											*****************************************************************************************************/
	
}
