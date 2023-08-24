package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	//01. Element of Reseller Name
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
	
	//01. Type to the Reseller Name
	public AddNewResellerClient typeToPINinCSVorNewLine() throws InterruptedException {
		resellerNameHighlight();
		resellerNameElement.sendKeys("rumy1yr");
		return new AddNewResellerClient();
	}
	/***************************************************************************************************************
										 * **************************    End No.1 - Reseller Name    ***************
										******************************************************************************************************************************/
}
