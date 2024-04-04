package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class NewAdminCreation extends TestBase{
	public NewAdminCreation(){
		PageFactory.initElements(driver, this);
	}
	
	public NewAdminCreation openAddPINvalidityReport() {
		driver.get(props.getProperty("url")+"/MenuPermission/addNewAdmin");
		return new NewAdminCreation();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of User Name   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of User Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement UserNameElement;
	
	//01. Highlight the User Name Input Field
	public void UserNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", UserNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", UserNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", UserNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", UserNameElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the User Name
	public NewAdminCreation typeToUserNameInputField() throws InterruptedException {
		UserNameInputFieldHighlight();
		UserNameElement.sendKeys("");
		return new NewAdminCreation();
	}
	
	//01.0.1 Type to the User Name parameter
	public NewAdminCreation typeToUserNameFieldParam(String User_Name) throws InterruptedException {
		UserNameInputFieldHighlight();
		UserNameElement.sendKeys(User_Name);		
		Thread.sleep(2000);		
		return new NewAdminCreation();
	}
	
	//01.0.2. Type User Name Input Field (enter text, then clear User Name Input Field)
	public NewAdminCreation typeAndClearUserNameFieldParam(String User_Name) throws InterruptedException {
		UserNameInputFieldHighlight();
		UserNameElement.sendKeys(User_Name);
		Thread.sleep(100);
		UserNameElement.clear();
		return new NewAdminCreation();									    			
	}		
		
	//1.0.3. Type to User Name tab key
	public NewAdminCreation  typetoUserNametabKey() throws InterruptedException {
		UserNameInputFieldHighlight();
		UserNameElement.sendKeys(Keys.TAB);
		return new NewAdminCreation();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of User Name   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Full Name $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Full Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement fullNameElement;
	
	//02. Highlight the Full Name Input Field
	public void fullNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", fullNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", fullNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", fullNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", fullNameElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Full Name
	public NewAdminCreation typeToFullNameInputField() throws InterruptedException {
		fullNameInputFieldHighlight();
		fullNameElement.sendKeys("");
		return new NewAdminCreation();
	}
	
	//02.0.1 Type to the Full Name parameter
	public NewAdminCreation typeToFullNameFieldParam(String Full_Name) throws InterruptedException {
		fullNameInputFieldHighlight();
		fullNameElement.sendKeys(Full_Name);		
		Thread.sleep(2000);		
		return new NewAdminCreation();
	}
	
	//02.0.2. Type Full Name Input Field (enter text, then clear Full Name Input Field)
	public NewAdminCreation typeAndClearFullNameFieldParam(String Full_Name) throws InterruptedException {
		fullNameInputFieldHighlight();
		fullNameElement.sendKeys(Full_Name);
		Thread.sleep(100);
		fullNameElement.clear();
		return new NewAdminCreation();									    			
	}		
		
	//2.0.3. Type to Full Name tab key
	public NewAdminCreation  typetoFullNametabKey() throws InterruptedException {
		fullNameInputFieldHighlight();
		fullNameElement.sendKeys(Keys.TAB);
		return new NewAdminCreation();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02- Element of Full Name  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Password $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Password
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement passwordElement;
	
	//02. Highlight the Password Input Field
	public void PasswordInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Password
	public NewAdminCreation typeToPasswordInputField() throws InterruptedException {
		PasswordInputFieldHighlight();
		passwordElement.sendKeys("");
		return new NewAdminCreation();
	}
	
	//02.0.1 Type to the Password parameter
	public NewAdminCreation typeToPasswordFieldParam(String Password) throws InterruptedException {
		PasswordInputFieldHighlight();
		passwordElement.sendKeys(Password);		
		Thread.sleep(2000);		
		return new NewAdminCreation();
	}
	
	//02.0.2. Type Password Input Field (enter text, then clear Password Input Field)
	public NewAdminCreation typeAndClearPasswordFieldParam(String Password) throws InterruptedException {
		PasswordInputFieldHighlight();
		passwordElement.sendKeys(Password);
		Thread.sleep(100);
		passwordElement.clear();
		return new NewAdminCreation();									    			
	}		
		
	//2.0.3. Type to Password tab key
	public NewAdminCreation  typetoPasswordtabKey() throws InterruptedException {
		PasswordInputFieldHighlight();
		passwordElement.sendKeys(Keys.TAB);
		return new NewAdminCreation();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02- Element of Password  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	
	
}
