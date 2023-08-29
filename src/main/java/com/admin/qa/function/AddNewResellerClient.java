package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	
	// 08. Element of PIN Reset Option Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[8]/div/select")
	WebElement pinResetOptionDropDownFieldInputElement;
	
	//08. Highlight the PIN Reset Option Drop Down Field
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
	
	//08. Select from PIN Reset Option Field
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
	
	// 09. Element of Reseller Panel Type Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[9]/div[1]/select")
	WebElement resellerPanelTypeDropDownFieldInputElement;
	
	//09. Highlight the Reseller Panel Type Drop Down Field
	public void resellerResellerPanelTypeDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerPanelTypeDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", resellerPanelTypeDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerPanelTypeDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", resellerPanelTypeDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//09. Select from Reseller Panel Type Field
	public AddNewResellerClient resellerPanelTypeelementDropDownField() throws InterruptedException {
		resellerResellerPanelTypeDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[9]/div[1]/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.9 - Reseller Panel Type Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -  Active / Inactive Check Box Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 010. Element of Active / Inactive  Check box Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[9]/div[2]/input")
	WebElement activeInactiveCheckboxInputField;
	
	//010. Highlight the Active / Inactive  Check box Input Field
	public void activeInactiveCheckboxInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveCheckboxInputField);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveCheckboxInputField);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveCheckboxInputField);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveCheckboxInputField);
			Thread.sleep(1000);
		}
	}
	
	//010. Select from Active / Inactive  Check box Input Field
	public AddNewResellerClient checkActiveInactiveCheckboxInputField() throws InterruptedException {
		activeInactiveCheckboxInputFieldHighlight();
		activeInactiveCheckboxInputField.click();
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.10 - Active / Inactive Check Box Field    ***************
			******************************************************************************************************************************/
	
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.11 -  App PIN Login Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 011. Element of App PIN Login Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[10]/div/select")
	WebElement appPINLoginDropDownFieldInputElement;
	
	//011. Highlight the App PIN Login Drop Down Field
	public void appPINLoginDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appPINLoginDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", appPINLoginDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appPINLoginDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", appPINLoginDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//011. Select from Reseller Panel Type Field
	public AddNewResellerClient appPINLoginelementDropDownField() throws InterruptedException {
		appPINLoginDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[10]/div/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.11 - App PIN Login Option Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.12 -  Brand Name Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//012. Element of Brand Name Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[12]/div/input")
	WebElement brandNameInputFieldElement;
	
	//012. Highlight the Brand Name Input Field
	public void resellerBrandNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", brandNameInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", brandNameInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", brandNameInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", brandNameInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//012. Type to the Brand Name Input Field
	public AddNewResellerClient typeToBrandNameInputFieldElement() throws InterruptedException {
		resellerBrandNameInputFieldHighlight();
		brandNameInputFieldElement.sendKeys("rumy1yr");
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
			 * **************************    End No.12 - Brand Name Input Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.13 -  Brand PIN Prefix Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//013. Element of Brand PIN Prefix Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[13]/div/input")
	WebElement brandPINPrefixInputFieldElement;
	
	//013. Highlight the Brand PIN Prefix Input Field
	public void resellerBrandPINPrefixInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", brandPINPrefixInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", brandPINPrefixInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", brandPINPrefixInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", brandPINPrefixInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//013. Type to the Brand PIN Prefix Input Field
	public AddNewResellerClient typeToBrandPINPrefixInputFieldElement() throws InterruptedException {
		resellerBrandPINPrefixInputFieldHighlight();
		brandPINPrefixInputFieldElement.sendKeys("12");
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
			 * **************************    End No.13 - Brand Name Input Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.14 -  Allow Apps Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//014. Element of Allow Apps Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[14]/div/span[1]/span[1]/span/ul/li/input")
	WebElement allowAppsInputFieldElement;
	
	@FindBy(xpath="/html/body/span/span/span/ul/li")
	WebElement allowAppsInputFieldFirstElement;
	
	
	//014. Highlight the Allow Apps Input Field
	public void resellerAllowAppsInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", allowAppsInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", allowAppsInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", allowAppsInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", allowAppsInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//014. Type to the Allow Apps Input Field
	public AddNewResellerClient typeToAllowAppsInputFieldElement() throws InterruptedException {
		resellerAllowAppsInputFieldHighlight();
		allowAppsInputFieldElement.sendKeys("Symlex");
		Thread.sleep(1000);
		allowAppsInputFieldFirstElement.click();
		
		Thread.sleep(1000);
		allowAppsInputFieldElement.sendKeys("Redcard");
		Thread.sleep(1000);
		allowAppsInputFieldFirstElement.click();
		
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
			 * **************************    End No.14 -  Allow Apps Input Field    ***************
			******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.15 -  Is Customize Panel Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 015. Element of Is Customize Panel Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[15]/div/select")
	WebElement isCustomizePanelDropDownFieldInputElement;
	
	//015. Highlight the Is Customize Panel Drop Down Field
	public void isCustomizePanelDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isCustomizePanelDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isCustomizePanelDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isCustomizePanelDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isCustomizePanelDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//015. Select from Is Customize Panel Type Field
	public AddNewResellerClient isCustomizePanelelementDropDownField() throws InterruptedException {
		isCustomizePanelDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[15]/div/select")));
		drp.selectByIndex(2);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.15 - App PIN Login Option Field    ***************
			******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.16 -   Is Customize Panel - Panel Name Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//016. Element of Is Customize Panel - Panel Name Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[16]/div/input")
	WebElement isCustomizePanelPanelNameInputFieldElement;
	
	//016. Highlight the Is Customize Panel - Panel Name Input Field
	public void isCustomizePanelPanelNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isCustomizePanelPanelNameInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isCustomizePanelPanelNameInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isCustomizePanelPanelNameInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isCustomizePanelPanelNameInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//016. Type to the Is Customize Panel - Panel Name Input Field
	public AddNewResellerClient typeToIsCustomizePanelPanelNameFieldElement() throws InterruptedException {
		isCustomizePanelPanelNameInputFieldHighlight();
		isCustomizePanelPanelNameInputFieldElement.sendKeys("test");
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
			 * **************************    End No.16 - Is Customize Panel - Panel Name Input Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.17 -  Has Limit of PIN? Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 017. Element of Has Limit of PIN? Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[17]/div/select")
	WebElement hasLimitofPINDropDownFieldInputElement;
	
	//017. Highlight the Has Limit of PIN? Drop Down Field
	public void hasLimitofPINDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", hasLimitofPINDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", hasLimitofPINDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", hasLimitofPINDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", hasLimitofPINDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//017. Select from Has Limit of PIN? Drop Down Field
	public AddNewResellerClient hasLimitofPINelementDropDownField() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		hasLimitofPINDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[17]/div/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.17 - Has Limit of PIN? Option Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.18 -  Pin Limit Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//018. Element of Pin Limit Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[18]/div/input")
	WebElement pinLimitInputFieldElement;
	
	//018. Highlight the Pin Limit Input Field
	public void resellerpinLimitInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pinLimitInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pinLimitInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//018. Type to the Pin Limit Input Field
	public AddNewResellerClient typeToPinLimitInputFieldElement() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		resellerpinLimitInputFieldHighlight();
		pinLimitInputFieldElement.sendKeys("100");
		String s = Keys.chord(Keys.CONTROL, "a");
		pinLimitInputFieldElement.sendKeys(s);
		pinLimitInputFieldElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		pinLimitInputFieldElement.sendKeys("100");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
			 * **************************    End No.18 -  Pin Limit Input Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.19 -  Only Type Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 019. Element of Only Type Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[19]/div[1]/select")
	WebElement onlyTypeDropDownFieldInputElement;
	
	//019. Highlight the Only Type Drop Down Field
	public void onlyTypeDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", onlyTypeDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", onlyTypeDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", onlyTypeDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", onlyTypeDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//019. Select from Only Type Drop Down Field
	public AddNewResellerClient onlyTypeelementDropDownField() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		onlyTypeDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[19]/div[1]/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.19 - Only Type Option Field    ***************
			******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.20 -   Main Reseller Type Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 020. Element of Main Reseller Type Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[19]/div[2]/select")
	WebElement  mainResellerTypeDropDownFieldInputElement;
	
	//020. Highlight the Only Type Drop Down Field
	public void mainResellerTypeDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", mainResellerTypeDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", mainResellerTypeDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", mainResellerTypeDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", mainResellerTypeDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//020. Select from Only Type Drop Down Field
	public AddNewResellerClient mainResellerTypeelementDropDownField() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		mainResellerTypeDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[19]/div[2]/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.20 - Main Reseller Type Option Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.21 -  Number Of Devices Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//021. Element of Number Of Devices Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[20]/div/input")
	WebElement numberOfDevicesInputFieldElement;
	
	//021. Highlight the Number Of Devices Input Field
	public void numberOfDevicesInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberOfDevicesInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberOfDevicesInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberOfDevicesInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberOfDevicesInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//021. Type to the Number Of Devices Input Field
	public AddNewResellerClient numberOfDevicesInputFieldElement() throws InterruptedException {
		//numberOfDevicesInputFieldHighlight();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[20]/div/input"))).sendKeys("1");
		numberOfDevicesInputFieldHighlight();
		numberOfDevicesInputFieldElement.sendKeys("1");
		String s = Keys.chord(Keys.CONTROL, "a");
		numberOfDevicesInputFieldElement.sendKeys(s);
		numberOfDevicesInputFieldElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		numberOfDevicesInputFieldElement.sendKeys("100");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
	         *******************************************************************************************************
			 ******************************* End No.21 -  Number Of Devices Input Field ****************************
			 *******************************************************************************************************
			 *****************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.22 -  Reseller Limit Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//022. Element of Reseller Limit Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[1]/div/input")
	WebElement resellerLimitInputFieldElement;
	
	//022. Highlight the Reseller Limit Input Field
	public void resellerLimitInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", resellerLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerLimitInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", resellerLimitInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//022. Type to the Reseller Limit Input Field
	public AddNewResellerClient resellerLimitInputFieldElement() throws InterruptedException {
		//numberOfDevicesInputFieldHighlight();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[20]/div/input"))).sendKeys("1");
		resellerLimitInputFieldHighlight();
		resellerLimitInputFieldElement.sendKeys("1");
		String s = Keys.chord(Keys.CONTROL, "a");
		resellerLimitInputFieldElement.sendKeys(s);
		resellerLimitInputFieldElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		resellerLimitInputFieldElement.sendKeys("100");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
	         *******************************************************************************************************
			 ******************************* End No.22 -  Reseller Limit Input Field ****************************
			 *******************************************************************************************************
			 *****************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.23 -  Balance Limit Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//023. Element of Balance Limit Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[2]/div/input")
	WebElement balanceLimitInputFieldElement;
	
	//023. Highlight the Balance Limit Input Field
	public void balanceLimitInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", balanceLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", balanceLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", balanceLimitInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", balanceLimitInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//023. Type to the Balance Limit Input Field
	public AddNewResellerClient balanceLimitInputFieldElement() throws InterruptedException {
		//numberOfDevicesInputFieldHighlight();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[20]/div/input"))).sendKeys("1");
		balanceLimitInputFieldHighlight();
		balanceLimitInputFieldElement.sendKeys("1");
		String s = Keys.chord(Keys.CONTROL, "a");
		balanceLimitInputFieldElement.sendKeys(s);
		balanceLimitInputFieldElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		balanceLimitInputFieldElement.sendKeys("700");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
	         *******************************************************************************************************
			 ******************************* End No.23 -  Balance Limit Input Field ****************************
			 *******************************************************************************************************
			 *****************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.24 -  Email Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//024. Element of Email Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[3]/div/input")
	WebElement emailInputFieldElement;
	
	//024. Highlight the Email Input Field
	public void emailInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", emailInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", emailInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//024. Type to the email Input Field
	public AddNewResellerClient emailInputFieldElement() throws InterruptedException {
		//numberOfDevicesInputFieldHighlight();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[20]/div/input"))).sendKeys("1");
		emailInputFieldHighlight();
		emailInputFieldElement.sendKeys("1");
		String s = Keys.chord(Keys.CONTROL, "a");
		emailInputFieldElement.sendKeys(s);
		emailInputFieldElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		emailInputFieldElement.sendKeys("test@qa.com");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
	         *******************************************************************************************************
			 ******************************* End No.24 -  Email Input Field ****************************
			 *******************************************************************************************************
			 *****************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.25 -  Phone No Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//025. Element of Phone No Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[4]/div/input")
	WebElement phoneNoInputFieldElement;
	
	//025. Highlight the Email Input Field
	public void phoneNoInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", phoneNoInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", phoneNoInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//025. Type to the email Input Field
	public AddNewResellerClient phoneNoInputFieldElement() throws InterruptedException {
		//numberOfDevicesInputFieldHighlight();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[20]/div/input"))).sendKeys("1");
		phoneNoInputFieldHighlight();
		phoneNoInputFieldElement.sendKeys("1");
		String s = Keys.chord(Keys.CONTROL, "a");
		phoneNoInputFieldElement.sendKeys(s);
		phoneNoInputFieldElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		phoneNoInputFieldElement.sendKeys("01795381162");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
	         *******************************************************************************************************
			 ******************************* End No.25 -  Phone No Input Field ****************************
			 *******************************************************************************************************
			 *****************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.26 -  City Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//026. Element of City Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[5]/div/input")
	WebElement cityInputFieldElement;
	
	//026. Highlight the City Input Field
	public void cityInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", cityInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", cityInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", cityInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", cityInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//026. Type to the City Input Field
	public AddNewResellerClient cityInputFieldElement() throws InterruptedException {
		//numberOfDevicesInputFieldHighlight();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[20]/div/input"))).sendKeys("1");
		cityInputFieldHighlight();
		cityInputFieldElement.sendKeys("1");
		String s = Keys.chord(Keys.CONTROL, "a");
		cityInputFieldElement.sendKeys(s);
		cityInputFieldElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		cityInputFieldElement.sendKeys("Dhaka");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
	         *******************************************************************************************************
			 ******************************* End No.26 -  City Input Field ****************************
			 *******************************************************************************************************
			 *****************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.27 -   Country Type Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 027. Element of Country Type Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[6]/div/select")
	WebElement  countryTypeDropDownFieldInputElement;
	
	//027. Highlight the Country Drop Down Field
	public void countryTypeDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", countryTypeDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", countryTypeDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", countryTypeDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", countryTypeDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//027. Select from Country Drop Down Field
	public AddNewResellerClient countryTypeelementDropDownField() throws InterruptedException {
		countryTypeDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[6]/div/select")));
		drp.selectByIndex(10);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
	 		 ********************************************************************************************************
			 ***************************    End No.27 - City Type Option Field    **************************
			 ********************************************************************************************************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.28 -  State Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//028. Element of State Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[7]/div/input")
	WebElement stateInputFieldElement;
	
	//028. Highlight the State Input Field
	public void stateInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", stateInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", stateInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", stateInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", stateInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//028. Type to the State Input Field
	public AddNewResellerClient stateInputFieldElement() throws InterruptedException {
		//numberOfDevicesInputFieldHighlight();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[20]/div/input"))).sendKeys("1");
		stateInputFieldHighlight();
		stateInputFieldElement.sendKeys("1");
		String s = Keys.chord(Keys.CONTROL, "a");
		stateInputFieldElement.sendKeys(s);
		stateInputFieldElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		stateInputFieldElement.sendKeys("Dhaka");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
	         *******************************************************************************************************
			 ******************************* End No.28 -  State Input Field ****************************
			 *******************************************************************************************************
			 *****************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.29 -  Address Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//029. Element of Address Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[8]/div/textarea")
	WebElement addressInputFieldElement;
	
	//028. Highlight the Address Input Field
	public void addressInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", addressInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", addressInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", addressInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", addressInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//028. Type to the Address Input Field
	public AddNewResellerClient addressInputFieldElement() throws InterruptedException {
		addressInputFieldHighlight();
		//addressInputFieldElement.sendKeys("1");
		//String s = Keys.chord(Keys.CONTROL, "a");
		//addressInputFieldElement.sendKeys(s);
		//addressInputFieldElement.sendKeys(Keys.DELETE);
		//Thread.sleep(2000);
		addressInputFieldElement.click();
		addressInputFieldElement.sendKeys("DhakaBangladesh");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
	         *******************************************************************************************************
			 ******************************* End No.29 -  Address Input Field ****************************
			 *******************************************************************************************************
			 *****************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.30 -   Is TV Reseller Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 030. Expand / Hide Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[4]/div/div[1]/h3/span")
	WebElement  expandHideButton;
	
	// 030. Element of Is TV Reseller Type Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[4]/div/div[2]/div[1]/div/select")
	WebElement  isTVResellerDropDownFieldInputElement;
	
	//030. Highlight the Is TV Reseller Drop Down Field
	public void isTVResellerDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isTVResellerDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isTVResellerDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isTVResellerDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isTVResellerDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//030. Select from Is TV Reseller Drop Down Field
	public AddNewResellerClient isTVResellerelementDropDownField() throws InterruptedException {
		expandHideButton.click();
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		isTVResellerDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[4]/div/div[2]/div[1]/div/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.30 - Is TV Reseller Option Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.31 -  TV Credit Limit Input Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//031. Element of Credit Limit Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[4]/div/div[2]/div[2]/div/input")
	WebElement tvcreditLimitInputFieldElement;
	
	// 031. Expand / Hide Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[4]/div/div[1]/h3/span")
	WebElement  tvcrCreditLimitexpandHideButton;
	
	//031. Highlight the Credit Limit Input Field
	public void creditLimitInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", tvcreditLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", tvcreditLimitInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", tvcreditLimitInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", tvcreditLimitInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//031. Type to the TV Credit Limit Input Field
	public AddNewResellerClient creditLimitInputFieldElement() throws InterruptedException {
		tvcrCreditLimitexpandHideButton.click();
		Thread.sleep(2000);
		creditLimitInputFieldHighlight();
		tvcreditLimitInputFieldElement.sendKeys("1");
		String s = Keys.chord(Keys.CONTROL, "a");
		tvcreditLimitInputFieldElement.sendKeys(s);
		tvcreditLimitInputFieldElement.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		tvcreditLimitInputFieldElement.sendKeys("50");	
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
	         *******************************************************************************************************
			 ******************************* End No.31 -  TV Credit Limit Input Field ****************************
			 *******************************************************************************************************
			 *****************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.32 -   Show App Banner Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 032. Expand / Hide Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[1]/h3/span")
	WebElement  expandHideButtoninOtherInfo;
	
	// 032. Element of Show App Banner Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[2]/div[1]/div/select")
	WebElement  showAppBannerDropDownFieldInputElement;
	
	//032. Highlight the Show App Banner Drop Down Field
	public void showAppBannerDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", showAppBannerDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", showAppBannerDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", showAppBannerDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", showAppBannerDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//032. Select from Show App Banner Drop Down Field
	public AddNewResellerClient showAppBannerelementDropDownField() throws InterruptedException {
		expandHideButtoninOtherInfo.click();
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		showAppBannerDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[2]/div[1]/div/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
			 * **************************    End No.32 - Show App Banner Option Field    ***************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.33 -   Show Full Screen Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 033. Expand / Hide Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[1]/h3/span")
	WebElement  showFullScreenexpandHideButtoninOtherInfo;
	
	// 033. Element of Show Full Screen Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[2]/div[2]/div/select")
	WebElement  showFullScreenDropDownFieldInputElement;
	
	//033. Highlight the Show Full Screen Drop Down Field
	public void showFullScreenDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", showFullScreenDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", showFullScreenDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", showFullScreenDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", showFullScreenDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//033. Select from Show Full Screen Drop Down Field
	public AddNewResellerClient showFullScreenelementDropDownField() throws InterruptedException {
		showFullScreenexpandHideButtoninOtherInfo.click();
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		showFullScreenDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[2]/div[2]/div/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
	         * *****************************************************************************************************
			 * **************************    End No.33 - Show Full Screen Option Field    ***************
			 * * *****************************************************************************************************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.34 -   Low BAL Notify Email Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 034. Expand / Hide Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[1]/h3/span")
	WebElement  lowBALNotifyEmailexpandHideButtoninOtherInfo;
	
	// 034. Element of Low BAL Notify Email Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[2]/div[3]/div/select")
	WebElement  lowBALNotifyEmailDropDownFieldInputElement;
	
	//034. Highlight the Low BAL Notify Email Drop Down Field
	public void lowBALNotifyEmailDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", lowBALNotifyEmailDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", lowBALNotifyEmailDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", lowBALNotifyEmailDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", lowBALNotifyEmailDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//034. Select from Low BAL Notify Email Drop Down Field
	public AddNewResellerClient lowBALNotifyEmailelementDropDownField() throws InterruptedException {
		lowBALNotifyEmailexpandHideButtoninOtherInfo.click();
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		lowBALNotifyEmailDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[2]/div[3]/div/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
	         * *****************************************************************************************************
			 * **************************    End No.34 - Low BAL Notify Email Option Field    ***************
			 * * *****************************************************************************************************
			******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.35 -   Assign Premium Locked Bundle Option Field    $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 035. Expand / Hide Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[1]/h3/span")
	WebElement  assignPremiumLockedBundleexpandHideButtoninOtherInfo;
	
	// 035. Element of Assign Premium Locked Bundle Drop Down Field Input
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[2]/div[4]/div/select")
	WebElement  assignPremiumLockedBundleDropDownFieldInputElement;
	
	//035. Highlight the Assign Premium Locked Bundle Drop Down Field
	public void assignPremiumLockedBundleDropDownFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", assignPremiumLockedBundleDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", assignPremiumLockedBundleDropDownFieldInputElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", assignPremiumLockedBundleDropDownFieldInputElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", assignPremiumLockedBundleDropDownFieldInputElement);
			Thread.sleep(1000);
		}
	}
	
	//035. Select from Assign Premium Locked Bundle Drop Down Field
	public AddNewResellerClient assignPremiumLockedBundleelementDropDownField() throws InterruptedException {
		assignPremiumLockedBundleexpandHideButtoninOtherInfo.click();
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		assignPremiumLockedBundleDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div[5]/div/div[2]/div[4]/div/select")));
		drp.selectByIndex(1);
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
	         * *****************************************************************************************************
			 * **************************    End No.34 - Assign Premium Locked Bundle Option Field    ***************
			 * * *****************************************************************************************************
			******************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.36 -   Submit Button   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	// 036. Element Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[6]/input[3]")
	WebElement  submitButton;
	
	//036. Highlight the Assign Premium Locked Bundle Drop Down Field
	public void submitButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButton);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButton);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButton);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButton);
			Thread.sleep(1000);
		}
	}
	
	//036. Select from Submit Button
	public AddNewResellerClient submitButton() throws InterruptedException {
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		assignPremiumLockedBundleDropDownFieldHighlight();
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		submitButton.click();
		return new AddNewResellerClient(); 
	}
	/***************************************************************************************************************
	         * *****************************************************************************************************
			 * **************************    End No.36 - Submit Button    ******************************************
			 * * *****************************************************************************************************
			******************************************************************************************************************************/
}
