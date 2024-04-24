package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewAdminCreation extends TestBase{
	public NewAdminCreation(){
		PageFactory.initElements(driver, this);
	}
	
	public NewAdminCreation openNewAdminCreation() {
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
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Password $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Password
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement passwordElement;
	
	//03. Highlight the Password Input Field
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
	
	//03. Type to the Password
	public NewAdminCreation typeToPasswordInputField() throws InterruptedException {
		PasswordInputFieldHighlight();
		passwordElement.sendKeys("");
		return new NewAdminCreation();
	}
	
	//03.0.1 Type to the Password parameter
	public NewAdminCreation typeToPasswordFieldParam(String Password) throws InterruptedException {
		PasswordInputFieldHighlight();
		passwordElement.sendKeys(Password);		
		Thread.sleep(2000);		
		return new NewAdminCreation();
	}
	
	//03.0.2. Type Password Input Field (enter text, then clear Password Input Field)
	public NewAdminCreation typeAndClearPasswordFieldParam(String Password) throws InterruptedException {
		PasswordInputFieldHighlight();
		passwordElement.sendKeys(Password);
		Thread.sleep(100);
		passwordElement.clear();
		return new NewAdminCreation();									    			
	}		
		
	//3.0.3. Type to Password tab key
	public NewAdminCreation  typetoPasswordtabKey() throws InterruptedException {
		PasswordInputFieldHighlight();
		passwordElement.sendKeys(Keys.TAB);
		return new NewAdminCreation();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.03- Element of Password  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Confirm Password $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Confirm Password
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/input")
	WebElement confirmPasswordElement;
	
	//04. Highlight the Confirm Password Input Field
	public void confirmPasswordInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", confirmPasswordElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", confirmPasswordElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", confirmPasswordElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", confirmPasswordElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Confirm Password
	public NewAdminCreation typeToConfirmPasswordInputField() throws InterruptedException {
		confirmPasswordInputFieldHighlight();
		confirmPasswordElement.sendKeys("");
		return new NewAdminCreation();
	}
	
	//04.0.1 Type to the Confirm Password parameter
	public NewAdminCreation typeToConfirmPasswordFieldParam(String Confirm_Password) throws InterruptedException {
		confirmPasswordInputFieldHighlight();
		confirmPasswordElement.sendKeys(Confirm_Password);		
		Thread.sleep(2000);		
		return new NewAdminCreation();
	}
	
	//04.0.2. Type Confirm Password Input Field (enter text, then clear Confirm Password Input Field)
	public NewAdminCreation typeAndClearConfirmPasswordFieldParam(String Confirm_Password) throws InterruptedException {
		confirmPasswordInputFieldHighlight();
		confirmPasswordElement.sendKeys(Confirm_Password);
		Thread.sleep(100);
		confirmPasswordElement.clear();
		return new NewAdminCreation();									    			
	}		
		
	//4.0.3. Type to Confirm Password tab key
	public NewAdminCreation  typetoConfirmPasswordtabKey() throws InterruptedException {
		confirmPasswordInputFieldHighlight();
		confirmPasswordElement.sendKeys(Keys.TAB);
		return new NewAdminCreation();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.04- Element of Confirm Password  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Active Check box $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
    //5. Element of Is Active Check box Field
    @FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[5]/div/input")
    WebElement isActiveCheckboxFieldElement;

    //5. Highlight the Active Check box Field
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

    //5. Type to the Is Active Check box Field
    public NewAdminCreation clickTIsActiveCheckboxField() throws InterruptedException {
        isActiveCheckboxFieldHighlight();
        isActiveCheckboxFieldElement.click();
        return new NewAdminCreation();
     }
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.05- Element of Active Check box  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Email $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//06. Element of Email
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[1]/div/input")
	WebElement emailElement;
	
	//06. Highlight the Email Input Field
	public void emailInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailElement);
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the Email
	public NewAdminCreation typeToEmailInputField() throws InterruptedException {
		emailInputFieldHighlight();
		emailElement.sendKeys("");
		return new NewAdminCreation();
	}
	
	//06.0.1 Type to the Email parameter
	public NewAdminCreation typeToEmailFieldParam(String Email) throws InterruptedException {
		emailInputFieldHighlight();
		emailElement.sendKeys(Email);		
		Thread.sleep(2000);		
		return new NewAdminCreation();
	}
	
	//06.0.2. Type Email Input Field (enter text, then clear Email Input Field)
	public NewAdminCreation typeAndClearEmailFieldParam(String Email) throws InterruptedException {
		emailInputFieldHighlight();
		emailElement.sendKeys(Email);
		Thread.sleep(100);
		emailElement.clear();
		return new NewAdminCreation();									    			
	}		
		
	//6.0.3. Type to Email tab key
	public NewAdminCreation  typetoEmailtabKey() throws InterruptedException {
		emailInputFieldHighlight();
		emailElement.sendKeys(Keys.TAB);
		return new NewAdminCreation();
	}
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.06- Element of Email  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	

	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of Phone No $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//07. Element of Phone No
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[2]/div/input")
	WebElement phoneNoElement;
	
	//07. Highlight the Phone No Input Field
	public void phoneNoInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoElement);
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the Phone No
	public NewAdminCreation typeToPhoneNoInputField() throws InterruptedException {
		phoneNoInputFieldHighlight();
		phoneNoElement.sendKeys("");
		return new NewAdminCreation();
	}
	
	//07.0.1 Type to the Phone No parameter
	public NewAdminCreation typeToPhoneNoFieldParam(String phone_No) throws InterruptedException {
		phoneNoInputFieldHighlight();
		phoneNoElement.sendKeys(phone_No);		
		Thread.sleep(2000);		
		return new NewAdminCreation();
	}
	
	//07.0.2. Type Phone No Input Field (enter text, then clear Phone No Input Field)
	public NewAdminCreation typeAndClearPhoneNoFieldParam(String phone_No) throws InterruptedException {
		phoneNoInputFieldHighlight();
		phoneNoElement.sendKeys(phone_No);
		Thread.sleep(100);
		phoneNoElement.clear();
		return new NewAdminCreation();									    			
	}		
		
	//7.0.3. Type to Phone No tab key
	public NewAdminCreation  typetoPhoneNotabKey() throws InterruptedException {
		phoneNoInputFieldHighlight();
		phoneNoElement.sendKeys(Keys.TAB);
		return new NewAdminCreation();
	}
	
	

	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.07- Element of Active Phone No  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of Is Rechargeable $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//08. Element of Is Rechargeable
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[3]/div/select")
	WebElement isRechargeableSelectElement;
	
	//08. Highlight the Is Rechargeable
	public void isRechargeableSelectElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isRechargeableSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isRechargeableSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",isRechargeableSelectElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isRechargeableSelectElement);
			Thread.sleep(1000);
		}
	}
	
	//08. Type to the Is Rechargeable
	public NewAdminCreation isRechargeableSelectField() throws InterruptedException {
		isRechargeableSelectElementHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[3]/div/select")));
		drp.selectByIndex(1);
		return new NewAdminCreation();
	}


	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.08- Element of Is Rechargeable  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Admin Type $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//09. Element of Admin Type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[4]/div/select")
	WebElement adminTypeSelectElement;
	
	//09. Highlight the Admin Type
	public void adminTypeSelectElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", adminTypeSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", adminTypeSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",adminTypeSelectElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", adminTypeSelectElement);
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Admin Type
	public NewAdminCreation adminTypeSelectField() throws InterruptedException {
		adminTypeSelectElementHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[4]/div/select")));
		drp.selectByIndex(1);
		return new NewAdminCreation();
	}


	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.09- Element of Admin Type ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Role Type $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//09. Element of Role Type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[5]/div/select")
	WebElement roleTypeSelectElement;
	
	//09. Highlight the Role Type
	public void roleTypeSelectElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", roleTypeSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", roleTypeSelectElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",roleTypeSelectElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", roleTypeSelectElement);
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Role Type
	public NewAdminCreation roleTypeSelectField() throws InterruptedException {
		roleTypeSelectElementHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[5]/div/select")));
		drp.selectByIndex(1);
		return new NewAdminCreation();
	}


	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.10- Element of Role Type ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Save now Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//10. Element of Submit button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[3]/input[2]")
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
	public NewAdminCreation clickONSubmitButton() throws InterruptedException {
		submitButtonInputFieldHighlight();
		submitElement.click();
		return new NewAdminCreation();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.10 - Element of Save now Button ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
}
