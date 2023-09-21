package com.admin.qa.AdminRolePermission;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.admin.qa.function.SendPushtoUser;
import com.crm.qa.base.TestBase;

public class NewAdminCreation extends TestBase{
	public NewAdminCreation(){
		PageFactory.initElements(driver, this);
	}
	
	public NewAdminCreation openNewAdminCreationpage() {
		driver.get(props.getProperty("url")+"MenuPermission/addNewAdmin");
		return new NewAdminCreation();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of User Name   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 					  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of User Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement userNameElement;
	
	//01. Highlight the Number of User Name Input Field
	public void userNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", userNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", userNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the User Name
	public NewAdminCreation typeToUserName() throws InterruptedException {
		userNameInputFieldHighlight();/* highlight the element of the tested. */
		userNameElement.sendKeys("test...");/*select data on the dropdown field */
		return new NewAdminCreation();
	}
	
	/************************************************************
     								* *****************************************************************************************************
	 								* **************************    End No.01 - Element of User Name    ***********************************
	 								* * ***************************************************************************************************
	 															*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.02 -   Element of Full Name   $$$$$$$$$$$$$$$$$$$$$$$$$
	  					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  														* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of Full Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement fullNameElement;
	
	//02. Highlight the Number of User Name Input Field
	public void fullNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", fullNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", fullNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", fullNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", fullNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Number of Days
	public NewAdminCreation typeTofullName() throws InterruptedException {
		fullNameInputFieldHighlight();/* highlight the element of the tested. */
		fullNameElement.sendKeys("testttt");/*select data on the dropdown field */
		return new NewAdminCreation();
	}
	
	/************************************************************
									* *****************************************************************************************************
									* **************************    End No.02 - Element of Full Name    ***********************************
									* * ***************************************************************************************************
																*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.03 -   Element of Password   $$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//03. Element of Password
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement passwordElement;
	
	//03. Highlight the Number of User Name Input Field
	public void passwordInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Password
	public NewAdminCreation typeTopasswordElement() throws InterruptedException {
		passwordInputFieldHighlight();/* highlight the element of the tested. */
		passwordElement.sendKeys("12222");/*select data on the dropdown field */
		return new NewAdminCreation();
	}
	
	/************************************************************
	 								* *****************************************************************************************************
									* **************************    End No.03 - Element of Password    ************************************
									* * ***************************************************************************************************
																*****************************************************************************************************/
	

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.04 -   Element of Confirm Password   $$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Confirm Password
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/input")
	WebElement confirmPasswordElement;
	
	//04. Highlight the Number of User Name Input Field
	public void confirmPasswordInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", confirmPasswordElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", confirmPasswordElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", confirmPasswordElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", confirmPasswordElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Confirm Password
	public NewAdminCreation typeToConfirmPassword() throws InterruptedException {
		confirmPasswordInputFieldHighlight();/* highlight the element of the tested. */
		confirmPasswordElement.sendKeys("Test...");/*select data on the dropdown field */
		return new NewAdminCreation();
	}
	
	/************************************************************
									* *****************************************************************************************************
									* **************************    End No.04 - Element of Confirm Password    ****************************
									* * ***************************************************************************************************
																*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.05 -   Element of Active/Inactive Status   $$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Active/Inactive Status
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[5]/div/input")
	WebElement activeInactiveStatusElement;
	
	//05. Highlight the Active Inactive Status Input Field
	public void activeInactiveStatusInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveStatusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveStatusElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveStatusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveStatusElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Number of Days
	public NewAdminCreation clickToactiveInactiveStatus() throws InterruptedException {
		activeInactiveStatusInputFieldHighlight();/* highlight the element of the tested. */
		activeInactiveStatusElement.click();/*select data on the dropdown field */
		return new NewAdminCreation();
	}
	
	/************************************************************
									 * *****************************************************************************************************
									 * **************************    End No.05 - Element of Active/Inactive Status    **********************
									 * * ***************************************************************************************************
																*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.06 -   Element of Email   $$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[1]/div/input")
	WebElement emailElement;
	
	//06. Highlight the Email Input Field
	public void emailInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the Number of Days
	public NewAdminCreation typeToemailInputField() throws InterruptedException {
		emailInputFieldHighlight();/* highlight the element of the tested. */
		emailElement.sendKeys("Test");/*select data on the dropdown field */
		return new NewAdminCreation();
	}
	
	/************************************************************
					 				* *****************************************************************************************************
					 				* **************************    End No.06 - Element of Email    ***************************************
					 				* * ***************************************************************************************************
																*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.07 -   Element of Phone No   $$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Phone No
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[2]/div/input")
	WebElement phoneNoDaysElement;
	
	//07. Highlight the Number of Phone No Element Input Field
	public void phoneNoInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoDaysElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoDaysElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoDaysElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoDaysElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the Phone No
	public NewAdminCreation typeToPhoneNoDays() throws InterruptedException {
		phoneNoInputFieldHighlight();/* highlight the element of the tested. */
		phoneNoDaysElement.sendKeys("Test");/*select data on the dropdown field */
		return new NewAdminCreation();
	}
	
	/************************************************************
	 								 * *****************************************************************************************************
	 								 * **************************    End No.07 - Element of Phone No    ************************************
	 								 * * ***************************************************************************************************
																*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of Is Rechargeable   $$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//08. Is Rechargeable Filter Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[3]/div/span")
	WebElement dropDownIsRechargeableFilterinSelect;
	
	//08. Is Rechargeable Filter Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInIsRechargeableFilterDropDown;
	
	//08. Is Rechargeable Filter Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForIsRechargeableFilterSearch;
	
	//08. Highlight the Payment Method Dropdown Field
	public void isRechargeableFilterDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIsRechargeableFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIsRechargeableFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIsRechargeableFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIsRechargeableFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//08. Type to the Is Rechargeable Filter
	public NewAdminCreation selectDatafromIsRechargeableFilterDropDownElement() throws InterruptedException {
		isRechargeableFilterDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownIsRechargeableFilterinSelect.click(); /*click on the element */
		searchInIsRechargeableFilterDropDown.sendKeys("Yes");/*type on the input field */
		valueForIsRechargeableFilterSearch.click();/*click on the element from result of the first value. */
		return new NewAdminCreation();
	}
	
	/***********************************************************
									 **************************************************************************************************
									 ***************************    End No.08 - Element of Is Rechargeable Filter    ******************
									 **************************************************************************************************
									  							****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Admin Type Filter   $$$$$$$$$$$$$$
		 			 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//09. Admin Type Filter Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[4]/div/span")
	WebElement dropDownAdminTypeFilterinSelect;
	
	//09. Admin Type Filter Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInAdminTypeFilterDropDown;
	
	//09. Admin Type Filter Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForAdminTypeFilterSearch;
	
	//09. Highlight the Admin Type Dropdown Field
	public void adminTypeFilterDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAdminTypeFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAdminTypeFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAdminTypeFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAdminTypeFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Admin Type Filter
	public NewAdminCreation selectDatafromAdminTypeFilterDropDownElement() throws InterruptedException {
		adminTypeFilterDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownAdminTypeFilterinSelect.click(); /*click on the element */
		searchInAdminTypeFilterDropDown.sendKeys("sales");/*type on the input field */
		valueForAdminTypeFilterSearch.click();/*click on the element from result of the first value. */
		return new NewAdminCreation();
	}
	
	/***********************************************************
						 			 **************************************************************************************************
						 			 ***************************    End No.09 - Element of Admin Type Filter    **************************
						 			 **************************************************************************************************
						  											*************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 			* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Role Type Filter   $$$$$$$$$$$$$$$
		 			* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//10. Role Type Filter Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[5]/div/span")
	WebElement dropDownRoleTypeFilterinSelect;
	
	//10. Role Type Filter Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInRoleTypeFilterDropDown;
	
	//10. Role Type Filter Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForRoleTypeFilterSearch;
	
	//10. Highlight the Role Type Dropdown Field
	public void roleTypeFilterDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownRoleTypeFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownRoleTypeFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownRoleTypeFilterinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownRoleTypeFilterinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//10. Type to the Role Type Filter
	public NewAdminCreation selectDatafromRoleTypeFilterDropDownElement() throws InterruptedException {
		roleTypeFilterDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownRoleTypeFilterinSelect.click(); /*click on the element */
		searchInRoleTypeFilterDropDown.sendKeys("Super");/*type on the input field */
		valueForRoleTypeFilterSearch.click();/*click on the element from result of the first value. */
		return new NewAdminCreation();
	}
	
	/***********************************************************
			 			 			 **************************************************************************************************
			 			 			 ***************************    End No.10 - Element of Role Type Filter    **************************
			 			 			 **************************************************************************************************
			  													*************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   Start No.11 -   Element of Submit Button   $$$$$$$$$$$$$$$$$$$$$
						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//11. Element of Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[3]/input[2]")
	WebElement submitButtonElement;
	
	//11. Highlight the Submit Button Input Field
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
	
	//11. Type to the Submit Button
	public NewAdminCreation clickToSubmitButton() throws InterruptedException {
		submitButtonInputFieldHighlight();/* highlight the element of the tested. */
		submitButtonElement.click();/*select data on the dropdown field */
		return new NewAdminCreation();
	}
	
	/************************************************************
						 			 * *****************************************************************************************************
						 			 * **************************    End No.11 - Element of Submit Button    *******************************
						 			 * * ***************************************************************************************************
																*****************************************************************************************************/
}
