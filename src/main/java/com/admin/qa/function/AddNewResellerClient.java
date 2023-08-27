package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class AddNewResellerClient extends TestBase{
	public AddNewResellerClient(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewResellerClient openaddNewResellerForm() {
		driver.get(props.getProperty("url")+"reseller/addFormReseller4");
		return new AddNewResellerClient();
	}
	
	/***************************************************************************************************************
	                                  * **************************    Start No.1 - Reseller Name    ****************
	                                  ******************************************************************************************************************************/
	//01. Element of Reseller Name Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement resellerNameElement;
	
	//01. Highlight the Reseller Name Input Field
	public void resellerNameHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerNameElement);
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', '');", resellerNameElement);
	        Thread.sleep(1000);
	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerNameElement);
	        Thread.sleep(2000);
	        js.executeScript("arguments[0].setAttribute('style', '');", resellerNameElement);
	        Thread.sleep(1000);
	    }
	}
	
	//01. Type to the Reseller Name Input Field
	public AddNewResellerClient typeToResellerNameInputField() throws InterruptedException {
		resellerNameHighlight();
		resellerNameElement.sendKeys("rumy1yr");
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
										 * **************************    End No.1 - Reseller Name    ***************
										******************************************************************************************************************************/
	
	
	
	/***************************************************************************************************************
     * **************************    Start No.2 - Login Field    ****************
     ******************************************************************************************************************************/
	//02. Element of Login Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement loginInputFieldElement;
	
	//02. Highlight the Login Input Field
	public void resellerLoginInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Login
	public AddNewResellerClient typeTologinInputFieldElement() throws InterruptedException {
		resellerLoginInputFieldHighlight();
		loginInputFieldElement.sendKeys("rumy1yr");
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
			 * **************************    End No.2 - Login Field    ***************
			******************************************************************************************************************************/
	
	
	
	/***************************************************************************************************************
     * **************************    Start No.3 - Password Field    ****************
     ******************************************************************************************************************************/
	//03. Element of Password Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement passwordInputFieldElement;
	
	//03. Highlight the Password Input Field
	public void resellerPasswordInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwordInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", passwordInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Password Input Field
	public AddNewResellerClient typeToPasswordInputFieldElement() throws InterruptedException {
		resellerPasswordInputFieldHighlight();
		passwordInputFieldElement.sendKeys("rumy1yr");
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
			 * **************************    End No.3 - Password Field    ***************
			******************************************************************************************************************************/
	
	
	/***************************************************************************************************************
     * **************************    Start No.4 - Credit Limit Field    ****************
     ******************************************************************************************************************************/
	//04. Element of Credit Limit Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/input")
	WebElement creditLimitInputFieldElement;
	
	//04. Highlight the Credit Limit Input Field
	public void resellerCreditLimitInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", creditLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", creditLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", creditLimitInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", creditLimitInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the IP Bundle Drop Down Field
	public AddNewResellerClient typeToCreditLimitInputFieldElement() throws InterruptedException {
		resellerCreditLimitInputFieldHighlight();
		creditLimitInputFieldElement.sendKeys("rumy1yr");
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
			 * **************************    End No.4 - Credit Limit Field    ***************
			******************************************************************************************************************************/
	
	
	
	
	/****************************########$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$***********************************************************************************
     * $$$$$$$$$$$$$$**************************    Start No.5 -  IP Bundle Field    $$$$$$$$$$$$****************
     ********************************$$$$$$$$$$$$$$$$$$$$**********************************************************************************************/
	
	// 05. Element of IP Bundle Drop Down Field expandable list
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[5]/div/span")
	WebElement dropDownIPBundleElementSelect;
	
	// 05. Element of IP Bundle Drop Down Field Input
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInIPBundleElement;
	
	// 05. Element of IP Bundle Drop Down Field Search First Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearchInIPBundleElement;
	
	//05. Highlight the IP Bundle Drop Down Field
	public void resellerIPBundleDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIPBundleElementSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIPBundleElementSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIPBundleElementSelect);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIPBundleElementSelect);
			Thread.sleep(1000);
		}
	}
	
	//05. Select from IP Bundle Drop Down Field
	public AddNewResellerClient searchandtypeelementDropDownIPBundleField() throws InterruptedException {
		resellerIPBundleDropDownFieldHighlight();
		dropDownIPBundleElementSelect.click(); /*click on the expandable list */
		try {Thread.sleep(42000);} catch (InterruptedException ie) {}
		searchInIPBundleElement.sendKeys("Back"); /* type on the search bar */
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		valueForSearchInIPBundleElement.click();/* click on the Single value */
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.5 - IP Bundle Field    ***************
			******************************************************************************************************************************/
	
	
	/****************************########$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$***********************************************************************************
     * $$$$$$$$$$$$$$**************************    Start No.6 -  IP Bundle 2 Field    $$$$$$$$$$$$****************
     ********************************$$$$$$$$$$$$$$$$$$$$**********************************************************************************************/
	
	// 06. Element of IP Bundle 2 Drop Down Field expandable list
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[6]/div/span")
	WebElement dropDownIPBundle2ElementSelect;
	
	// 06. Element of IP Bundle 2 Drop Down Field Input
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInIPBundle2Element;
	
	// 06. Element of IP Bundle 2 Drop Down Field Search First Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearchInIPBundle2Element;
	
	//06. Highlight the IP Bundle Drop Down Field
	public void resellerIPBundle2DropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIPBundle2ElementSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIPBundle2ElementSelect);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownIPBundle2ElementSelect);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownIPBundle2ElementSelect);
			Thread.sleep(1000);
		}
	}
	
	//06. Select from IP Bundle 2 Drop Down Field
	public AddNewResellerClient searchandtypeelementDropDownIPBundle2Field() throws InterruptedException {
		resellerIPBundle2DropDownFieldHighlight();
		dropDownIPBundle2ElementSelect.click(); /*click on the expandable list */
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		searchInIPBundle2Element.sendKeys("Back"); /* type on the search bar */
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		valueForSearchInIPBundle2Element.click();/* click on the Single value */
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.6 - IP Bundle 2 Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.7 -  Rate Plan Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 07. Element of Rate Plan Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[7]/div/select")
	WebElement ratePlanDropDownFieldInputElement;
	
	//07. Highlight the Rate Plan Drop Down Field
	public void resellerRatePlanDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", ratePlanDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ratePlanDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", ratePlanDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//07. Select from Rate Plan Drop Down Field
	public AddNewResellerClient ratePlaneelementDropDownField() throws InterruptedException {
		resellerRatePlanDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[7]/div/select")));
		drp.selectByIndex(15);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.7 - Rate Plan Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.8 -  PIN Reset Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 07. Element of PIN Reset Option Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[8]/div/select")
	WebElement pinResetOptionDropDownFieldInputElement;
	
	//07. Highlight the PIN Reset Option Drop Down Field
	public void resellerPINResetOptionDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinResetOptionDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinResetOptionDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinResetOptionDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinResetOptionDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//07. Select from PIN Reset Option Field
	public AddNewResellerClient pinResetOptioneelementDropDownField() throws InterruptedException {
		resellerPINResetOptionDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[8]/div/select")));
		drp.selectByIndex(0);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.8 - PIN Reset Option Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.9 -  Reseller Panel Type Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 07. Element of PIN Reset Option Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[8]/div/select")
	WebElement pinResetOptionDropDownFieldInputElement;
	
	//07. Highlight the PIN Reset Option Drop Down Field
	public void resellerPINResetOptionDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinResetOptionDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinResetOptionDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinResetOptionDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinResetOptionDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//07. Select from PIN Reset Option Field
	public AddNewResellerClient pinResetOptioneelementDropDownField() throws InterruptedException {
		resellerPINResetOptionDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[8]/div/select")));
		drp.selectByIndex(0);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.9 - PIN Reset Option Field    ***************
			******************************************************************************************************************************/
	
	
	
}
