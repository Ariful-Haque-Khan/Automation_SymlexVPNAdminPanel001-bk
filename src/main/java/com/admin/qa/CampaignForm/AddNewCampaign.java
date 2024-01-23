package com.admin.qa.CampaignForm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.admin.qa.function.SendPushtoUser;
import com.crm.qa.base.TestBase;

public class AddNewCampaign extends TestBase{
	public AddNewCampaign(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewCampaign openAddNewCampaignPage() {
		driver.get(props.getProperty("url")+"campaign/addCampaign");
		return new AddNewCampaign();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Campaign Name Input Text Field   $$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Campaign Name Input Text Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement campaignNameInputTextFieldElement;
	
	//01. Highlight the Campaign Name Input Text Field
	public void campaignNameInputTextFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignNameInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignNameInputTextFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignNameInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignNameInputTextFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Campaign Name Input Text Field
	public AddNewCampaign typeToCampaignNameInputTextField() throws InterruptedException {
		campaignNameInputTextFieldHighlight();
		campaignNameInputTextFieldElement.sendKeys("Test");
		return new AddNewCampaign();
	}
	
	/***************************************************
     								* ************************************************************************************************
     								* **************************    End No.01 - Element of Campaign Name Input Text Field    *********
     								* * **********************************************************************************************
     													****************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Coupon Code Input Text Field   $$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of Coupon Code Input Text Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/input")
	WebElement couponCodeInputTextFieldElement;
	
	//02. Highlight the Coupon Code Input Text Field
	public void couponCodeInputTextFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", couponCodeInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", couponCodeInputTextFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", couponCodeInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", couponCodeInputTextFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Coupon Code Input Text Field
	public AddNewCampaign typeToCouponCodeInputTextField() throws InterruptedException {
		couponCodeInputTextFieldHighlight();
		couponCodeInputTextFieldElement.sendKeys("Test");
		return new AddNewCampaign();
	}
	
	/***************************************************
							* ************************************************************************************************
							* **************************    End No.02 - Element of Coupon Code Input Text Field    ***********
							* * **********************************************************************************************
														****************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Affiliate Share (%) Input Text Field   $$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Affiliate Share (%) Input Text Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[4]/div/input")
	WebElement affiliateShareInputTextFieldElement;
	
	//03. Highlight the Affiliate Share (%) Input Text Field
	public void affiliateShareInputTextFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", affiliateShareInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", affiliateShareInputTextFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", affiliateShareInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", affiliateShareInputTextFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Affiliate Share (%) Input Text Field
	public AddNewCampaign affiliateShareShareInputTextField() throws InterruptedException {
		affiliateShareInputTextFieldHighlight();
		affiliateShareInputTextFieldElement.sendKeys("Test");
		return new AddNewCampaign();
	}
	
	/*************************************
				* ************************************************************************************************
				* ************************   End No.03 - Element of Affiliate Share (%) Input Text Field    ******
				* * **********************************************************************************************
									****************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Campaign Period From Input Text Field   $$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Campaign Period From Input Text Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[5]/div[1]/input")
	WebElement campaignPeriodFromInputTextFieldElement;
	
	//04. Highlight the Campaign Period To Input Text Field
	public void campaignPeriodFromInputTextFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignPeriodFromInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignPeriodFromInputTextFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignPeriodFromInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignPeriodFromInputTextFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Campaign Period From Input Text Field
	public AddNewCampaign typeFromCampaignPeriodFromInputTextField() throws InterruptedException {
		campaignPeriodFromInputTextFieldHighlight();
		campaignPeriodFromInputTextFieldElement.sendKeys("2023-09-12");
		return new AddNewCampaign();
	}
	
	/***************************************************
							* *******************************************************************************************************
							* **************************    End No.04 - Element of Campaign Period From Input Text Field    *********
							* * *****************************************************************************************************
														****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Campaign Period To Input Text Field   $$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Campaign Period To Input Text Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[5]/div[3]/input")
	WebElement campaignPeriodToInputTextFieldElement;
	
	//05. Highlight the Campaign Period To Input Text Field
	public void campaignPeriodToInputTextFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignPeriodToInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignPeriodToInputTextFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignPeriodToInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignPeriodToInputTextFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Campaign Period From Input Text Field
	public AddNewCampaign typeFromCampaignPeriodToInputTextField() throws InterruptedException {
		campaignPeriodToInputTextFieldHighlight();
		campaignPeriodToInputTextFieldElement.sendKeys("2023-09-12");
		return new AddNewCampaign();
	}
	
	/***************************************************
							* *******************************************************************************************************
							* **************************    End No.05 - Element of Campaign Period To Input Text Field    *********
							* * *****************************************************************************************************
														****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -  Element of Status   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of Status
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[6]/div/select")
	WebElement statusElement;
	
	//06. Highlight the Status Field
	public void statusFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", statusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", statusElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", statusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", statusElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//06. Select from Auto Status Dropdown Field
	public AddNewCampaign statusDropdownField() throws InterruptedException {
		statusFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[6]/div/select")));
		drp.selectByIndex(1);
		return new AddNewCampaign(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.06 - Element of Status   *****************************
							*********************************************************************************************
										  				*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of Remarks Input Text Field   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Remarks Input Text Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[7]/div/textarea")
	WebElement remarksInputTextFieldElement;
	
	//07. Highlight the Remarks Input Text Field
	public void remarksInputTextFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", remarksInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", remarksInputTextFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", remarksInputTextFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", remarksInputTextFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the Remarks Input Text Field
	public AddNewCampaign typeToRemarksInputTextField() throws InterruptedException {
		remarksInputTextFieldHighlight();
		remarksInputTextFieldElement.sendKeys("Test");
		return new AddNewCampaign();
	}
	
	/***************************************************
							* *******************************************************************************************************
							* **************************    End No.07 - Element of Remarks Input Text Field    **********************
							* * *****************************************************************************************************
														****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 						* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of Save Now Button   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//08. Element of Save Now Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement saveNowButtonFieldElement;
	
	//08. Highlight the Save Now Button Field
	public void saveNowButtonFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveNowButtonFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveNowButtonFieldElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveNowButtonFieldElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveNowButtonFieldElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//08. Click On the Save Now Button Field
	public AddNewCampaign clickOnSaveNowButtonField() throws InterruptedException {
		saveNowButtonFieldHighlight();
		saveNowButtonFieldElement.click();
		return new AddNewCampaign();
	}
	
	/***************************************************
							* *******************************************************************************************************
							* **************************    End No.08 - Element of Save Now Button Field    *************************
							* * *****************************************************************************************************
														****************************************************************************************************/
}
