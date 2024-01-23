package com.admin.qa.CampaignForm;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Blank extends TestBase{
	public Blank(){
		PageFactory.initElements(driver, this);
	}
	
	public Blank openAddPINvalidityReport() {
		driver.get(props.getProperty("url")+"client/pinValidity");
		return new Blank();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Number of Days   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Number of Days
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement numberofDaysElement;
	
	//01. Highlight the Number of Days Input Field
	public void numberofDaysInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberofDaysElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberofDaysElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", numberofDaysElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", numberofDaysElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Number of Days
	public Blank typeToNumberofDays() throws InterruptedException {
		numberofDaysInputFieldHighlight();/* highlight the element of the tested. */
		numberofDaysElement.sendKeys("1");/*select data on the dropdown field */
		return new Blank();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Number of Days    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
	
	
}
