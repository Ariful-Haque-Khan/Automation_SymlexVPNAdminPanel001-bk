package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddNewBanner extends TestBase{
	public AddNewBanner(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewBanner openAddNewBannerFormPage() {
		driver.get(props.getProperty("url")+"push/addNewBanner");
		return new AddNewBanner();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Banner Name   $$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Banner Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement bannerNameElement;
	
	//01. Highlight the Banner Name Input Field
	public void bannerNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", bannerNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", bannerNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", bannerNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", bannerNameElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Banner Name
	public AddNewBanner typeToBannerName() throws InterruptedException {
		bannerNameInputFieldHighlight();
		bannerNameElement.sendKeys("tset");
		return new AddNewBanner();
	}
	
	/*****************************************************
     						  * **************************************************************************************************
	 						  * **************************    End No.01 - Element of Banner Name    ******************************
	 						  * * ************************************************************************************************
	 						  								********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of App Home Banner Android   $$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of App Home Banner Android
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div[1]/input")
	WebElement appHomeBannerAndroidElement;
	
	//02. Highlight the Banner Name Input Field
	public void appHomeBannerAndroidElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appHomeBannerAndroidElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", appHomeBannerAndroidElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", appHomeBannerAndroidElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", appHomeBannerAndroidElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the App Home Banner Android Element
	public AddNewBanner typeToAppHomeBannerAndroidElement() throws InterruptedException {
		appHomeBannerAndroidElementFieldHighlight();
		appHomeBannerAndroidElement.sendKeys("test");
		return new AddNewBanner();
	}
	
	/*****************************************************
		  					  * **************************************************************************************************
		  					  * **************************    End No.02 - App Home Banner Android Element    *********************
		  					  * * ************************************************************************************************
		  												********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Onclick URL   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//03. Element of Onclick URL
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div[2]/input")
	WebElement onclickURLElement;
	
	//03. Highlight the Banner Name Input Field
	public void onclickURLElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", onclickURLElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", onclickURLElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", onclickURLElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", onclickURLElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the App Home Onclick URL Element
	public AddNewBanner typeToOnclickURLElement() throws InterruptedException {
		onclickURLElementFieldHighlight();
		onclickURLElement.sendKeys("test");
		return new AddNewBanner();
	}
	
	/*****************************************************
		  						* ************************************************************************************************
		  						* ************************    End No.03 - Onclick URL Element    *********************************
		  						* * **********************************************************************************************
														********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of App Home Banner iOS   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Onclick URL
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div[1]/input")
	WebElement homeBanneriOSElement;
	
	//04. Highlight the App Home Banner iOS Input Field
	public void homeBanneriOSElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", onclickURLElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", onclickURLElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", onclickURLElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", onclickURLElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the App Home Banner iOS Element
	public AddNewBanner typeToHomeBanneriOSElement() throws InterruptedException {
		onclickURLElementFieldHighlight();
		onclickURLElement.sendKeys("test");
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
								* ************************    End No.04 - App Home Banner iOS Element    *********************************
								* * **********************************************************************************************
														********************************************************************************************************/
	
}
