package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class SubscriptionCodesElement extends TestBase{
	public SubscriptionCodesElement(){
		PageFactory.initElements(driver, this);
	}

	public SubscriptionCodesElement openAddNewPinBatchForm() {
		driver.get(props.getProperty("url")+"subscription/addFormLotsName");
		return new SubscriptionCodesElement();
	}

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Name $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//01. Element of Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement nameElement;

	//01. Highlight the Name Input Field
	public void NameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", nameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", nameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", nameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", nameElement);
			Thread.sleep(1000);
		}
	}

	//1.0.1  Type to the Name
	public SubscriptionCodesElement  typeToNameInputFieldParam(String name) throws InterruptedException {
		NameInputFieldHighlight();
		nameElement.sendKeys(name);
		return new SubscriptionCodesElement();
	}

	//1.0.2. Type Name Input Field (enter text, then clear Name Input Field)
	public SubscriptionCodesElement  typeAndClearNameInputFieldParam(String name) throws InterruptedException {
		NameInputFieldHighlight();
		nameElement.sendKeys(name);
		Thread.sleep(500);
		nameElement.clear();
		return new SubscriptionCodesElement();									    			
	}		

	//1.0.3. Type to Name Input Field
	public SubscriptionCodesElement  typetoNameInputFieldtabKey() throws InterruptedException {
		NameInputFieldHighlight();
		nameElement.sendKeys(Keys.TAB);
		return new SubscriptionCodesElement();
	}

	/***************************************************************************************************************
	 * *****************************************************************************************************
	 * **************************    End No.01 - Element of Name    ******************************************
	 * * *****************************************************************************************************
	 ******************************************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02-  Element of Expire Date From   $$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of Expire Date from
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement expireDateElement;


	//02. Highlight the Expire Date from Input Field
	public void expireDateHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", expireDateElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", expireDateElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", expireDateElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", expireDateElement);
			Thread.sleep(1000);
		}
	}

	//02. Type to Expire Date from
	public SubscriptionCodesElement SelectexpireDateField() throws InterruptedException {
		expireDateHighlight();
		expireDateElement.sendKeys("2024-09-08"); /*type to the element. */
		return new SubscriptionCodesElement();
	}	


	/***************************************************
	 *********************************************************************************************
	 ****************************    End No.02 - Element of Time Period **************************
	 *********************************************************************************************
	 *****************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.03 -   Drop Down Element of Agent   $$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	//03. Agent Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/span/span[1]/span/span[1]") 
	WebElement dropDownAgentSelect;

	//03.Agent Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchAgentDropDown;

	//03. Agent Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[1]")
	WebElement valueForAgentSearch;

	//03. Highlight the Agent Field
	public void AgentDropDownHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAgentSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAgentSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownAgentSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownAgentSelect);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}

	//03. Type to the Agent
	public SubscriptionCodesElement selectDatafromAgentDropDownElement() throws InterruptedException {
		AgentDropDownHighlight();/* highlight the element of the tested. */
		dropDownAgentSelect.click(); /*click on the element */
		searchAgentDropDown.sendKeys("onlinepayment");
		valueForAgentSearch.click();/*click on the element from result of the first value. */
		return new SubscriptionCodesElement();
	}

	/*******************************************************
	 * **************************************************************************************************
	 * **************************    End No.03 - Drop Down Element of Agent     *************
	 * * ************************************************************************************************
	 **************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$  Start No.04   Drop Down Element of Subscribe To   $$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Subscribe To for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/span/span[1]/span/span[1]")
	WebElement dropDownSubscribeToSelect;

	//04. Subscribe To for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchSubscribeToDropDown;

	//04. Subscribe To for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li[1]")
	WebElement valueForSubscribeToSearch;

	//04. Highlight the Subscribe To Input Field
	public void subscribeToDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownSubscribeToSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownSubscribeToSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownSubscribeToSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownSubscribeToSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}

	//04. Type to the Subscribe To
	public SubscriptionCodesElement selectDatafromSubscribeToDropDownElement() throws InterruptedException {
		subscribeToDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownSubscribeToSelect.click(); /*click on the element */
		searchSubscribeToDropDown.sendKeys("rumyqa");/*type on the input field */
		valueForSubscribeToSearch.click();/*click on the element from result of the first value. */
		return new SubscriptionCodesElement();
	}

	/************************************************************
	 * ***************************************************************************************************
	 * *****************    End No.04. - Drop Down Element of Subscribe To   ******************
     * * ************************************************************************************************
							**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$  Start No.05   Drop Down Element of Rate Plan   $$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//05. Element of Rate Plan
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[5]/div/select")
	WebElement rateplanDropDownElement;
	
	//05. Highlight the Rate Plan Dropdown Field
	public void selectRateplanDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", rateplanDropDownElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", rateplanDropDownElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", rateplanDropDownElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", rateplanDropDownElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Select from Rate Plan Drop down Field
	public SubscriptionCodesElement selectRateplanFromDropdownField() throws InterruptedException {
		selectRateplanDropDownFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[5]/div/select")));
		drp.selectByIndex(1);
		return new SubscriptionCodesElement(); 
	}

	/************************************************************
	 * ***************************************************************************************************
	 * *****************    End No.05. - Drop Down Element of Rate plan  ******************
     * * ************************************************************************************************
							**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Total Number of code (%) $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//06. Element of Total Number of code
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[1]/div/input")
	WebElement numberOfCodeElement;
	
	//06. Highlight the Total Number of code Input Field
	public void CodeNumberInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberOfCodeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberOfCodeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberOfCodeElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberOfCodeElement);
			Thread.sleep(1000);
		}
	}
	
	
	//06.0.1 Type to the Total Number of code parameter
	public SubscriptionCodesElement typeToCodeNumberFieldParam(String Code_Number) throws InterruptedException {
		CodeNumberInputFieldHighlight();
		numberOfCodeElement.sendKeys(Code_Number);		
		Thread.sleep(2000);		
		return new SubscriptionCodesElement();
	}
	
	//06.0.2. Type Total Number of code Input Field (enter text, then clear Total Number of code Input Field)
	public SubscriptionCodesElement typeAndClearCodeNumberFieldParam(String Code_Number) throws InterruptedException {
		CodeNumberInputFieldHighlight();
		numberOfCodeElement.sendKeys(Code_Number);
		Thread.sleep(100);
		numberOfCodeElement.clear();
		return new SubscriptionCodesElement();									    			
	}		
		
	//6.0.3. Type to Total Number of code tab key
	public SubscriptionCodesElement  typetoCodeNumbertabKey() throws InterruptedException {
		CodeNumberInputFieldHighlight();
		numberOfCodeElement.sendKeys(Keys.TAB);
		return new SubscriptionCodesElement();
	}	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.06 - Element of Total Number of code  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$  Start No.07   Drop Down Element of Code Length  $$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//07. Code Length for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[2]/div/span/span[1]/span/span[1]")
	WebElement dropDownCodeLengthSelect;

	//07. Code Length for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchCodeLengthDropDown;

	//07. Code Length for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li[1]") 
	WebElement valueForSCodeLengthSearch;

	//07. Highlight the Code Length Input Field
	public void CodeLengthDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCodeLengthSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCodeLengthSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownCodeLengthSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownCodeLengthSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}

	//07. Type to the Code Length
	public SubscriptionCodesElement selectDatafromCodeLengthDropDownElement() throws InterruptedException {
		CodeLengthDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownCodeLengthSelect.click(); /*click on the element */
		searchCodeLengthDropDown.sendKeys("8");/*type on the input field */
		valueForSCodeLengthSearch.click();/*click on the element from result of the first value. */
		return new SubscriptionCodesElement();
	}

	/************************************************************
	 * ***************************************************************************************************
	 * *****************    End No.07. - Drop Down Element of Code Length   ******************
     * * ************************************************************************************************
							**************************************************************************************************/


	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of Code Prefix $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//08. Element of Code Prefix
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[3]/div/input")
	WebElement codePrefixElement;
	
	//08. Highlight the Code Prefix Input Field
	public void codePrefixnputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", codePrefixElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", codePrefixElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", codePrefixElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", codePrefixElement);
			Thread.sleep(1000);
		}
	}

	
	//08.0.1 Type to the Code Prefix parameter
	public SubscriptionCodesElement typeToCodePrefixFieldParam(String code_Prefix) throws InterruptedException {
		codePrefixnputFieldHighlight();
		codePrefixElement.sendKeys(code_Prefix);		
		Thread.sleep(2000);		
		return new SubscriptionCodesElement();
	}
	
	//08.0.2. Type Code Prefix Input Field (enter text, then clear Code Prefix Input Field)
	public SubscriptionCodesElement typeAndClearCodePrefixFieldParam(String code_Prefix) throws InterruptedException {
		codePrefixnputFieldHighlight();
		codePrefixElement.sendKeys(code_Prefix);
		Thread.sleep(100);
		codePrefixElement.clear();
		return new SubscriptionCodesElement();									    			
	}		
		
	//8.0.3. Type to Code Prefix tab key
	public SubscriptionCodesElement  typetoCodePrefixtabKey() throws InterruptedException {
		codePrefixnputFieldHighlight();
		codePrefixElement.sendKeys(Keys.TAB);
		return new SubscriptionCodesElement();
		
	}	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.08 - Element of Code Prefix    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Generate Code Button     $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//09. Element of Generate Code Button 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[3]/input[3]")
	WebElement codeGenerateButtonElement;
	
	//09. Highlight the Generate Code Button in 
	public void codeGenerateButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", codeGenerateButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",codeGenerateButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",  codeGenerateButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", codeGenerateButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//09. Click to the Generate Code Button 
	public SubscriptionCodesElement clickOnGenerateButtonButton() throws InterruptedException {
		codeGenerateButtonHighlight();
		codeGenerateButtonElement.click();
		return new SubscriptionCodesElement();
	} 
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.09 - Element of Generate Code Button *****************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  Start No.03 -   Drop Down Element of search reseller  $$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	//03. Agent Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/span/span[1]/span/span[1]") 
	WebElement dropDownSearchResellerSelect;

	//03.Agent Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchSearchResellerDropDown;

	//03. Agent Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[1]")
	WebElement valueForSearchResellerSearch;

	//03. Highlight the Agent Field
	public void SearchResellerDropDownHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownSearchResellerSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownSearchResellerSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownSearchResellerSelect);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownSearchResellerSelect);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
		}
	}

	//03. Type to the Agent
	public SubscriptionCodesElement selectDatafromSearchResellerDropDownElement() throws InterruptedException {
		SearchResellerDropDownHighlight();/* highlight the element of the tested. */
		dropDownSearchResellerSelect.click(); /*click on the element */
		searchSearchResellerDropDown.sendKeys("onlinepayment");
		valueForSearchResellerSearch.click();/*click on the element from result of the first value. */
		return new SubscriptionCodesElement();
	}

	/*******************************************************
	 * **************************************************************************************************
	 * **************************    End No.03 - Drop Down Element of Agent     *************
	 * * ************************************************************************************************
	 **************************************************************************************************/
	

	

}
