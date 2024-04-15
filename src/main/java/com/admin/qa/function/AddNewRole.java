package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddNewRole extends TestBase{
	public AddNewRole(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewRole openAddNewRoleForm() {
		driver.get(props.getProperty("url")+"MenuPermission/createRole");
		return new AddNewRole();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Role Name $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Role name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement roleNameElement;
	
	//01. Highlight the Role name Input Field
	public void roleNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", roleNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", roleNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", roleNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", roleNameElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Role name
	public AddNewRole typeToRoleName() throws InterruptedException {
		roleNameInputFieldHighlight();
		roleNameElement.sendKeys("");
		return new AddNewRole();
	}
	
	//01.0.1 Type to the Role name parameter
	public AddNewRole typeToRoleNameFieldParam(String Role_Name) throws InterruptedException {
		roleNameInputFieldHighlight();
		roleNameElement.sendKeys(Role_Name);		
		Thread.sleep(2000);		
		return new AddNewRole();
	}
	
	//01.0.2. Type Role name Input Field (enter text, then clear Role name Input Field)
	public AddNewRole typeAndClearRoleNameFieldParam(String Role_Name) throws InterruptedException {
		roleNameInputFieldHighlight();
		roleNameElement.sendKeys(Role_Name);
		Thread.sleep(100);
		roleNameElement.clear();
		return new AddNewRole();									    			
	}		
		
	//1.0.3. Type to Role name tab key
	public AddNewRole  typetoRoleNametabKey() throws InterruptedException {
		roleNameInputFieldHighlight();
		roleNameElement.sendKeys(Keys.TAB);
		return new AddNewRole();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Number of Role Name   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Display Name $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Display Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement displayNameElement;
	
	//02. Highlight the Display Name Input Field
	public void displayNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", displayNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", displayNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", displayNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", displayNameElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Display Name
	public AddNewRole typeToDisplayName() throws InterruptedException {
		displayNameInputFieldHighlight();
		displayNameElement.sendKeys("");
		return new AddNewRole();
	}
	
	//02.0.1 Type to the Display Name parameter
	public AddNewRole typeToDisplayNameFieldParam(String Display_Name) throws InterruptedException {
		displayNameInputFieldHighlight();
		displayNameElement.sendKeys(Display_Name);		
		Thread.sleep(2000);		
		return new AddNewRole();
	}
	
	//02.0.2. Type Display Name Input Field (enter text, then clear Display Name Input Field)
	public AddNewRole typeAndClearDisplayNameFieldParam(String Display_Name) throws InterruptedException {
		displayNameInputFieldHighlight();
		displayNameElement.sendKeys(Display_Name);
		Thread.sleep(100);
		displayNameElement.clear();
		return new AddNewRole();									    			
	}		
		
	//02.0.3. Type to Display Name tab key
	public AddNewRole  typetoDisplayNametabKey() throws InterruptedException {
		displayNameInputFieldHighlight();
		displayNameElement.sendKeys(Keys.TAB);
		return new AddNewRole();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Number of Display Name   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Description $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Description
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/textarea")
	WebElement descriptionElement;
	

	//03. Highlight the Description Input Field
		public void descriptionNameInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", descriptionElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", descriptionElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", descriptionElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", descriptionElement);
				Thread.sleep(1000);
			}
		}
	
	//03. Type to the Description
	public AddNewRole typeToDescription() throws InterruptedException {
		descriptionNameInputFieldHighlight();
		descriptionElement.sendKeys("");
		return new AddNewRole();
	}
	
	//03.0.1 Type to the Description parameter
	public AddNewRole typeToDescriptionFieldParam(String Description) throws InterruptedException {
		descriptionNameInputFieldHighlight();
		descriptionElement.sendKeys(Description);		
		Thread.sleep(2000);		
		return new AddNewRole();
	}
	
	//03.0.2. Type Description Input Field (enter text, then clear Description Input Field)
	public AddNewRole typeAndClearDescriptionFieldParam(String Description) throws InterruptedException {
		descriptionNameInputFieldHighlight();
		descriptionElement.sendKeys(Description);
		Thread.sleep(100);
		descriptionElement.clear();
		return new AddNewRole();									    			
	}		
		
	//03.0.3. Type to Description tab key
	public AddNewRole  typetoDescriptiontabKey() throws InterruptedException {
		descriptionNameInputFieldHighlight();
		descriptionElement.sendKeys(Keys.TAB);
		return new AddNewRole();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.03 - Element of Number of Description  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Submit Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//4. Element of Submit button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement submitElement;
	
	//10. Highlight the Submit button
	public void submitButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",submitElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitElement);
			Thread.sleep(1000);
		}
	}
	
	//10. Click to the Submit button
	public AddNewRole clickONSubmitButton() throws InterruptedException {
		submitButtonInputFieldHighlight();
		submitElement.click();
		return new AddNewRole();
	}
	
	
}
