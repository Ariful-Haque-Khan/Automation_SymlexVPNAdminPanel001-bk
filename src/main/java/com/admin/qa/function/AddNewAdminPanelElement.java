package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddNewAdminPanelElement extends TestBase{
	public AddNewAdminPanelElement(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewAdminPanelElement openAddNewAdminPanelForm() {
		driver.get(props.getProperty("url")+"application/addNewAdminPanel");
		return new AddNewAdminPanelElement();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Client Name   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Client Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement clientNameElement;
	
	//01. Highlight the Client Name Input Field
	public void clientNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", clientNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", clientNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", clientNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", clientNameElement);
			Thread.sleep(1000);
			
		}
	}
	
	//1.0.1  Type to the Client Name
	public AddNewAdminPanelElement  typeToClientNameInputFieldParam(String client_name) throws InterruptedException {
		clientNameInputFieldHighlight();
		clientNameElement.sendKeys(client_name);
		return new AddNewAdminPanelElement();
	}
	
	//1.0.2. Type Client Name Input Field (enter text, then clear Client Name Input Field)
	public AddNewAdminPanelElement  typeAndClearClientNameInputFieldParam(String client_name) throws InterruptedException {
		clientNameInputFieldHighlight();
		clientNameElement.sendKeys(client_name);
		Thread.sleep(500);
		clientNameElement.clear();
		return new AddNewAdminPanelElement();									    			
	}		
		
	//1.0.3. Type to Client Name Input Field
	public AddNewAdminPanelElement  typetoClientNameInputFieldtabKey() throws InterruptedException {
		clientNameInputFieldHighlight();
		clientNameElement.sendKeys(Keys.TAB);
		return new AddNewAdminPanelElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Client Name    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of brand Name   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Brand Name Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement brandNameElement;
	
	//02. Highlight the Brand Name Input Field
	public void brandNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", brandNameElement);/* make a yellow border outside edge of the element */
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', '');", brandNameElement);/* make a yellow border off outside edge of the element */
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", brandNameElement);/* make a yellow border outside edge of the element */
	        Thread.sleep(2000);
	        js.executeScript("arguments[0].setAttribute('style', '');", brandNameElement);/* make a yellow border off outside edge of the element */
	        Thread.sleep(1000);
	    }
	}
	
	//2.0.1  Type to the Brand Name
	public AddNewAdminPanelElement  typeToBrandNameInputFieldParam(String brand_name) throws InterruptedException {
		brandNameInputFieldHighlight();
		brandNameElement.sendKeys(brand_name);
		return new AddNewAdminPanelElement();
	}
	
	//2.0.2. Type Brand Name Input Field (enter text, then clear Brand Name Input Field)
	public AddNewAdminPanelElement  typeAndClearBrandNameInputFieldParam(String brand_name) throws InterruptedException {
		brandNameInputFieldHighlight();
		brandNameElement.sendKeys(brand_name);
		Thread.sleep(500);
		brandNameElement.clear();
		return new AddNewAdminPanelElement();									    			
	}		
		
	//2.0.3. Type to Brand Name Input Field
	public AddNewAdminPanelElement   typetoBrandNameInputFieldtabKey() throws InterruptedException {
		brandNameInputFieldHighlight();
		brandNameElement.sendKeys(Keys.TAB);
		return new AddNewAdminPanelElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of brand Name  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of brand Name   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Panel Name Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement panelNameElement;
	
	//03. Highlight the Panel Name Input Field
	public void panelNameHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", panelNameElement);/* make a yellow border outside edge of the element */
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', '');", panelNameElement);/* make a yellow border off outside edge of the element */
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", panelNameElement);/* make a yellow border outside edge of the element */
	        Thread.sleep(2000);
	        js.executeScript("arguments[0].setAttribute('style', '');", panelNameElement);/* make a yellow border off outside edge of the element */
	        Thread.sleep(1000);
	    }
	}
	
	//3.0.1  Type to the Panel Name
	public AddNewAdminPanelElement typeToPanelNameInputFieldParam(String panel_name) throws InterruptedException {
		panelNameHighlight();
		panelNameElement.sendKeys(panel_name);
		return new AddNewAdminPanelElement();
	}
	
	//3.0.2. Type Panel Name Input Field (enter text, then clear Panel Name Input Field)
	public AddNewAdminPanelElement typeAndClearPanelNameInputFieldParam(String panel_name) throws InterruptedException {
		panelNameHighlight();
		panelNameElement.sendKeys(panel_name);
		Thread.sleep(500);
		panelNameElement.clear();
		return new AddNewAdminPanelElement();									    			
	}		
		
	//3.0.3. Type to Panel Name Input Field
	public AddNewAdminPanelElement typetoPanelNameInputFieldtabKey() throws InterruptedException {
		panelNameHighlight();
		panelNameElement.sendKeys(Keys.TAB);
		return new AddNewAdminPanelElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of brand Name  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Panel Path   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Panel Path Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/input")
	WebElement panelPathElement;
	
	//04. Highlight the Panel Path Input Field
	public void panelPathInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", panelPathElement);/* make a yellow border outside edge of the element */
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', '');", panelPathElement);/* make a yellow border off outside edge of the element */
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", panelPathElement);/* make a yellow border outside edge of the element */
	        Thread.sleep(2000);
	        js.executeScript("arguments[0].setAttribute('style', '');", panelPathElement);/* make a yellow border off outside edge of the element */
	        Thread.sleep(1000);
	    }
	}
	
	//4.0.1  Type to the Panel Path
	public AddNewAdminPanelElement  typeToPanelPathInputFieldParam(String panel_path) throws InterruptedException {
		panelPathInputFieldHighlight();
		panelPathElement.sendKeys(panel_path);
		return new AddNewAdminPanelElement();
	}
	
	//4.0.2. Type Panel Path Input Field (enter text, then clear Panel Path Input Field)
	public AddNewAdminPanelElement  typeAndClearPanelPathInputFieldParam(String panel_path) throws InterruptedException {
		panelPathInputFieldHighlight();
		panelPathElement.sendKeys(panel_path);
		Thread.sleep(500);
		panelPathElement.clear();
		return new AddNewAdminPanelElement();									    			
	}		
		
	//4.0.3. Type to Panel Path Input Field
	public AddNewAdminPanelElement   typetoPanelPathInputFieldtabKey() throws InterruptedException {
		panelPathInputFieldHighlight();
		panelPathElement.sendKeys(Keys.TAB);
		return new AddNewAdminPanelElement();
	}

	/***************************************************************************************************************
	 * *****************************************************************************************************
	 * **************************    End No.04 - Element of Panel Path  ******************************************
	 * * *****************************************************************************************************
	 ******************************************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Login Name  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Login Name Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[5]/div/input")
	WebElement loginNameElement;

	//01. Highlight the Login Name Input Field
	public void loginNameHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginNameElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginNameElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}

	//5.0.1  Type to the Login Name
	public AddNewAdminPanelElement  typeToLoginNameInputFieldParam(String login_name) throws InterruptedException {
		loginNameHighlight();
		loginNameElement.sendKeys(login_name);
		return new AddNewAdminPanelElement();
	}

	//5.0.2. Type Login Name Input Field (enter text, then clear Login Name Input Field)
	public AddNewAdminPanelElement typeAndClearLoginNameInputFieldParam(String login_name) throws InterruptedException {
		loginNameHighlight();
		loginNameElement.sendKeys(login_name);
		Thread.sleep(500);
		loginNameElement.clear();
		return new AddNewAdminPanelElement();									    			
	}		

	//5.0.3. Type to Login Name Input Field
	public AddNewAdminPanelElement  typetoLoginNameInputFieldtabKey() throws InterruptedException {
		loginNameHighlight();
		loginNameElement.sendKeys(Keys.TAB);
		return new AddNewAdminPanelElement();
	}	

	/***************************************************************************************************************
	 * *****************************************************************************************************
	 * **************************    End No.05 - Element of Login Name  ******************************************
	 * * *****************************************************************************************************
	 ******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Login Password  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of Login Password Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[6]/div/input")
	WebElement loginPasswordElement;
	
	//06. Highlight the Login Password Input Field
	public void loginPasswordHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginPasswordElement);/* make a yellow border outside edge of the element */
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', '');", loginPasswordElement);/* make a yellow border off outside edge of the element */
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginPasswordElement);/* make a yellow border outside edge of the element */
	        Thread.sleep(2000);
	        js.executeScript("arguments[0].setAttribute('style', '');", loginPasswordElement);/* make a yellow border off outside edge of the element */
	        Thread.sleep(1000);
	    }
	}
	
	//6.0.1  Type to the Login Password
	public AddNewAdminPanelElement  typeToLoginPasswordInputFieldParam(String login_Password) throws InterruptedException {
		loginPasswordHighlight();
		loginPasswordElement.sendKeys(login_Password);
		return new AddNewAdminPanelElement();
	}
	
	//6.0.2. Type Login Password Input Field (enter text, then clear Login Password Input Field)
	public AddNewAdminPanelElement typeAndClearLoginPasswordInputFieldParam(String login_Password) throws InterruptedException {
		loginPasswordHighlight();
		loginPasswordElement.sendKeys(login_Password);
		Thread.sleep(500);
		loginPasswordElement.clear();
		return new AddNewAdminPanelElement();									    			
	}		
		
	//6.0.3. Type to Login Password Input Field
	public AddNewAdminPanelElement typetoLoginPasswordInputFieldtabKey() throws InterruptedException {
		loginPasswordHighlight();
		loginPasswordElement.sendKeys(Keys.TAB);
		return new AddNewAdminPanelElement();
	}

	/***************************************************************************************************************
	 * *****************************************************************************************************
	 * **************************    End No.06 - Element of Login Name  ******************************************
	 * * *****************************************************************************************************
	 ******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.7 -  Is Single Pin Check Box Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 07. Element of Is Single Pin  Check box Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[7]/div/input")
	WebElement isSinglePinCheckboxElement;
	
	//07. Highlight the Is Single Pin  Check box Input Field
	public void isSinglePinCheckboxElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isSinglePinCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isSinglePinCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isSinglePinCheckboxElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isSinglePinCheckboxElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Select from Is Single Pin  Check box Input Field
	public AddNewAdminPanelElement checkisSinglePinCheckboxElement() throws InterruptedException {
		isSinglePinCheckboxElementHighlight();
		isSinglePinCheckboxElement.click();
		return new AddNewAdminPanelElement(); 
	}
	
	/***************************************************************************************************************
			 * **************************    End No.07 - Is Single Pin Check Box Field    ***************
			******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.8 -   Element of save button    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	// 08. Element of save button Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/input[3]")
	WebElement saveButtonElement;
	
	//08. Highlight the save button Input Field
	public void saveButtonElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//08. Select from save button Input Field
	public AddNewAdminPanelElement clickOnSaveButton() throws InterruptedException {
		saveButtonElementHighlight();
		saveButtonElement.click();
		return new AddNewAdminPanelElement(); 
	}
	
	/***************************************************************************************************************
			 * **************************    End No.08 - Element of save button   ***************
			******************************************************************************************************************************/


	
	
	
	
}
