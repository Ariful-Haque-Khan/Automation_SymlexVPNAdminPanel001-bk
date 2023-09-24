package com.admin.qa.AdminRolePermission;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class  AddNewMenuPermission extends TestBase{
	public AddNewMenuPermission(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewMenuPermission openAddNewMenuPermissionPage() {
		driver.get(props.getProperty("url")+"MenuPermission/createRoleMenuPermissions");
		return new AddNewMenuPermission();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Role   $$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//01. Role Filter Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/span")
	WebElement dropDownRoleFilterinSelect;
	
	//01. Role Filter Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInRoleFilterDropDown;
	
	//01. Role Filter Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForRoleFilterSearch;
	
	//01. Highlight the Payment Method Dropdown Field
	public void roleeFilterDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownRoleFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownRoleFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownRoleFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownRoleFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Role Filter
	public AddNewMenuPermission selectDatafromRoleFilterDropDownElement() throws InterruptedException {
		roleeFilterDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownRoleFilterinSelect.click(); /*click on the element */
		searchInRoleFilterDropDown.sendKeys("Super L");/*type on the input field */
		valueForRoleFilterSearch.click();/*click on the element from result of the first value. */
		return new AddNewMenuPermission();
	}
	
	/***********************************************************
						 			 **************************************************************************************************
						 			 ***************************    End No.01 - Element of Role    ************************************
						 			 **************************************************************************************************
						  										****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Menu   $$$$$$$$$$$$$$$$$$$$$$$$$$$
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Menu Filter Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/span")
	WebElement dropDownMenuFilterinSelect;
	
	//02. Menu Filter Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInMenuFilterDropDown;
	
	//02. Is Rechargeable Filter Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForMenuFilterSearch;
	
	//02. Highlight the Menu Dropdown Field
	public void menuFilterDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownMenuFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownMenuFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownMenuFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownMenuFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Menu Filter
	public AddNewMenuPermission selectDatafromMenuFilterDropDownElement() throws InterruptedException {
		menuFilterDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownMenuFilterinSelect.click(); /*click on the element */
		searchInMenuFilterDropDown.sendKeys("Application S");/*type on the input field */
		valueForMenuFilterSearch.click();/*click on the element from result of the first value. */
		return new AddNewMenuPermission();
	}
	
	/***********************************************************
						 			 **************************************************************************************************
						 			 ***************************    End No.02 - Element of Menu Filter    *****************************
						 			 **************************************************************************************************
						  										****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Permission View   $$$$$$$$$$$$$$$$$$$$$$$$$$$
					  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					  							*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Permission View
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input[1]")
	WebElement permissionViewElement;
	
	//03. Highlight the Permission View Input Field
	public void permissionViewInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionViewElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionViewElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionViewElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionViewElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Permission View
	public AddNewMenuPermission clickToPermissionView() throws InterruptedException {
		permissionViewInputFieldHighlight();/* highlight the element of the tested. */
		permissionViewElement.click();/*select data on the dropdown field */
		return new AddNewMenuPermission();
	}
	
	/***********************************************
     					* *****************************************************************************************************
     					* **************************    End No.03 - Element of Permission View    *****************************
     					* * ***************************************************************************************************
     												******************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  				  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Permission Create   $$$$$$$$$$$$$$$$$$$$$$$$
	  				  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  											*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Permission Create
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input[2]")
	WebElement permissionCreateElement;
	
	//04. Highlight the Permission Create Input Field
	public void permissionCreateInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionCreateElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionCreateElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionCreateElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionCreateElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Permission Create
	public AddNewMenuPermission clickToPermissionCreate() throws InterruptedException {
		permissionCreateInputFieldHighlight();/* highlight the element of the tested. */
		permissionCreateElement.click();/*select data on the dropdown field */
		return new AddNewMenuPermission();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.04 - Element of Permission Create    ***************************
						* * ***************************************************************************************************
													******************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Permission Edit   $$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Permission Edit
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input[3]")
	WebElement permissionEditElement;
	
	//05. Highlight the Permission Edit Input Field
	public void permissionEditInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionEditElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionEditElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionEditElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionEditElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Permission Edit
	public AddNewMenuPermission clickOnPermissionEdit() throws InterruptedException {
		permissionEditInputFieldHighlight();/* highlight the element of the tested. */
		permissionEditElement.click();/*select data on the dropdown field */
		return new AddNewMenuPermission();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.05 - Element of Permission Edit    *****************************
						* * ***************************************************************************************************
														******************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Permission Download   $$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//06. Element of Permission Download
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input[4]")
	WebElement permissionDownloadElement;
	
	//06. Highlight the Permission Download Input Field
	public void permissionDownloadInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionDownloadElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionDownloadElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionDownloadElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionDownloadElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the Permission Download
	public AddNewMenuPermission clickOnPermissionDownload() throws InterruptedException {
		permissionDownloadInputFieldHighlight();/* highlight the element of the tested. */
		permissionDownloadElement.click();/*select data on the dropdown field */
		return new AddNewMenuPermission();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.06 - Element of Permission Download    *************************
						* * ***************************************************************************************************
														******************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			 * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of Permission Delete   $$$$$$$$$$$$$$$$$$$$$$$$
		  			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Permission Delete
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input[5]")
	WebElement permissionDeleteElement;
	
	//07. Highlight the Permission Delete Input Field
	public void permissionDeleteInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionDeleteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionDeleteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", permissionDeleteElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", permissionDeleteElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the Permission Delete
	public AddNewMenuPermission clickOnPermissionDelete() throws InterruptedException {
		permissionDeleteInputFieldHighlight();/* highlight the element of the tested. */
		permissionDeleteElement.click();/*select data on the dropdown field */
		return new AddNewMenuPermission();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.07 - Element of Permission Delete    ***************************
						* * ***************************************************************************************************
													******************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  				  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of Submit Button   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  			  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//08. Element of Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[3]/input[2]")
	WebElement submitButtonElement;
	
	//08. Highlight the Submit Button Input Field
	public void submitButtonInputFieldHighlight() throws InterruptedException {
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
	
	//08. Type to the Submit Button
	public AddNewMenuPermission clickOnSubmitButton() throws InterruptedException {
		submitButtonInputFieldHighlight();/* highlight the element of the tested. */
		submitButtonElement.click();/*select data on the dropdown field */
		return new AddNewMenuPermission();
	}
	
	/***********************************************
						* *****************************************************************************************************
						* **************************    End No.08 - Element of Submit Button    *******************************
						* * ***************************************************************************************************
													******************************************************************************************************/

	
	
	
	
}
