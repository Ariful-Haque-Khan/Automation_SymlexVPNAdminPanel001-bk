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
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", homeBanneriOSElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", homeBanneriOSElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", homeBanneriOSElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", homeBanneriOSElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the App Home Banner iOS Element
	public AddNewBanner typeToHomeBanneriOSElement() throws InterruptedException {
		homeBanneriOSElementFieldHighlight();
		homeBanneriOSElement.sendKeys("test");
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
								* ************************    End No.04 - App Home Banner iOS Element    *********************************
								* * **********************************************************************************************
														********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							   * $$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   iOS Element of Onclick URL   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of iOS Onclick URL Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div[2]/input")
	WebElement iOSonClickURLElement;
	
	//05. Highlight the App Home iOS Onclick URL Element
	public void iOSOnclickURLElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", iOSonClickURLElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", iOSonClickURLElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", iOSonClickURLElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", iOSonClickURLElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the App Home iOS Onclick URL Element
	public AddNewBanner typeToiOSOnclickURLElement() throws InterruptedException {
		iOSOnclickURLElementFieldHighlight();
		iOSonClickURLElement.sendKeys("test");
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
							    * ************************    End No.05 - iOS Onclick URL Element    *****************************
							    * * **********************************************************************************************
															********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Reseller Panel Banner   $$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Element of Reseller Panel Banner
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[4]/div[1]/input")
	WebElement resellerPanelBannerElement;
	
	//06. Highlight the Reseller Panel Banner Input Field
	public void resellerPanelBannerElementFieldHighlight() throws InterruptedException {
	if (driver instanceof JavascriptExecutor) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerPanelBannerElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", resellerPanelBannerElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", resellerPanelBannerElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", resellerPanelBannerElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//06. Type to the Reseller Panel Banner Element
	public AddNewBanner typeToResellerPanelBannerElement() throws InterruptedException {
		resellerPanelBannerElementFieldHighlight();
		resellerPanelBannerElement.sendKeys("test");
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
								* ************************    End No.06 - Reseller Panel Banner Element    ***********************
								* * **********************************************************************************************
															********************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	   							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	   							* $$$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of Reseller Onclick URL   $$$$$$$$$$$$$$$$$$$$$$$$$$$
	   							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	   													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Reseller Onclick URL Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[4]/div[2]/input")
	WebElement reselleronClickURLElement;
	
	//07. Highlight the App Home Reseller Onclick URL Element
	public void resellerOnclickURLElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", reselleronClickURLElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", reselleronClickURLElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", reselleronClickURLElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", reselleronClickURLElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. Type to the App Home Reseller Onclick URL Element
	public AddNewBanner typeToResellerOnclickURLElement() throws InterruptedException {
		resellerOnclickURLElementFieldHighlight();
		reselleronClickURLElement.sendKeys("test");
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
		    					* ************************    End No.07 - Reseller Onclick URL Element    ************************
		    					* * **********************************************************************************************
														********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 									* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$  Start No.08   Drop Down Element called Reseller   $$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	//08. Reseller Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[5]/div/span/span[1]/span/ul/li/input")
	WebElement dropDownresellerSelect;
	
	//08. Reseller Element for Search On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[5]/div/span/span[1]/span/ul/li/input")
	WebElement searchInCountryDropDown;
	
	//08. Reseller Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span/ul/li[1]")
	WebElement valueForCountrySearch;
	
	//08. Highlight the reseller Drop down Input Field
	public void resellerDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownresellerSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownresellerSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownresellerSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownresellerSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//08. Type to the Reseller Input Field
	public AddNewBanner selectDatafromCountryDropDownElement() throws InterruptedException {
		resellerDropDownElementdHighlight();/* highlight the element of the tested. */
		searchInCountryDropDown.click(); /*click on the element */
		searchInCountryDropDown.sendKeys("mahfuz4");/*type on the input field */
		valueForCountrySearch.click();/*click on the element from result of the first value. */
		return new AddNewBanner();
	}
	
	/************************************************************
										* **************************************************************************************************
										* ***********************   End No.08 - Drop Down Element Called Reseller   ************************
										* * ************************************************************************************************
																**************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Common Panel?   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//09. Element of Common Panel ? Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[6]/div/input")
	WebElement commonPanelElement;
	
	//09. Highlight the Common Panel ? Element
	public void commonPanelElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", commonPanelElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", commonPanelElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", commonPanelElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", commonPanelElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Common Panel Element
	public AddNewBanner clickOncommonPanelElement() throws InterruptedException {
		resellerOnclickURLElementFieldHighlight();
		commonPanelElement.click();
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
								* ************************    End No.09 - Common Panel Element    ********************************
								* * **********************************************************************************************
														 ********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Banner Remarks   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//10. Element of Banner Remarks Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[8]/div/textarea")
	WebElement bannerRemarksElement;
	
	//10. Highlight the Banner Remarks Element
	public void bannerRemarksElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", bannerRemarksElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", bannerRemarksElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", bannerRemarksElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", bannerRemarksElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//10. Type to the Banner Remarks Element
	public AddNewBanner typeToBannerRemarksElement() throws InterruptedException {
		bannerRemarksElementFieldHighlight();
		bannerRemarksElement.click();
		Thread.sleep(800);
		bannerRemarksElement.sendKeys("test");
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
								* ************************    End No.10 - Banner Remarks Element    ******************************
								* * **********************************************************************************************
														 ********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.11 -   Element of Login Type(App) All   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//11. Element of Login Type App All Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[9]/div[1]/input")
	WebElement loginTypeAppElement;
	
	//11. Highlight the Login Type App All Element
	public void loginTypeAppElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginTypeAppElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginTypeAppElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginTypeAppElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginTypeAppElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//11. Type to the Login Type App All Element
	public AddNewBanner clickOnLoginTypeAppElement() throws InterruptedException {
		loginTypeAppElementFieldHighlight();
		loginTypeAppElement.click();
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
							    * ************************    End No.11 - Login Type(App) Element    *****************************
							    * * **********************************************************************************************
								 							********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.12 -   Element of Login Type(App) Symlex  $$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//12. Element of Login Type App Symlex Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[9]/div[2]/input")
	WebElement loginTypeAppSymlexElement;
	
	//12. Highlight the Login Type App Symlex Element
	public void loginTypeAppSymlexElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginTypeAppSymlexElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginTypeAppSymlexElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginTypeAppSymlexElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginTypeAppSymlexElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//12. Type to the Login Type App Symlex Element
	public AddNewBanner clickOnloginTypeAppSymlexElement() throws InterruptedException {
		loginTypeAppSymlexElementFieldHighlight();
		loginTypeAppSymlexElement.click();
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
	    						* ************************    End No.12 - Element of Login Type(App) Symlex    *******************
	    						* * **********************************************************************************************
		 													********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							    * $$$$$$$$$$$$$$$$$$$$$$    Start No.13 -   Element of Login Type(App) platinum  $$$$$$$$$$$$$$$$$$$$$$$$
							    * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
							    						*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//13. Element of Login Type App Platinum Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[9]/div[3]/input")
	WebElement loginTypeAppplatinumElement;
	
	//13. Highlight the Login Type App Platinum Element
	public void loginTypeAppplatinumElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginTypeAppplatinumElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginTypeAppplatinumElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loginTypeAppplatinumElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", loginTypeAppplatinumElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//13. Type to the Login Type App Platinum Element
	public AddNewBanner clickOnloginTypeAppPlatinumElement() throws InterruptedException {
		loginTypeAppplatinumElementFieldHighlight();
		loginTypeAppplatinumElement.click();
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
								* ************************    End No.13 - Element of Login Type(App) Platinum    *****************
								* * **********************************************************************************************
														  ********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.14 -   Element of User Type(App) All  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//14. Element of User Type(App) All Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[10]/div[1]/input")
	WebElement userTypeAppAllElement;
	
	//14. Highlight the User Type(App) All Element
	public void userTypeAppAllElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppAllElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppAllElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppAllElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppAllElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//14. Type to the User Type(App) All Element
	public AddNewBanner clickOnUserTypeAppAllElement() throws InterruptedException {
		userTypeAppAllElementFieldHighlight();
		userTypeAppAllElement.click();
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
							    * ************************    End No.14 - Element of User Type(App) All    ***********************
							    * * **********************************************************************************************
								  						 ********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.15 -   Element of User Type(App) Free  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//15. Element of User Type(App) Free Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[10]/div[2]/input")
	WebElement userTypeAppFreeElement;
	
	//15. Highlight the User Type(App) Free Element
	public void userTypeAppFreeElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppFreeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppFreeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppFreeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppFreeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//15. Type to the User Type(App) Free Element
	public AddNewBanner clickOnUserTypeAppFreeElement() throws InterruptedException {
		userTypeAppFreeElementFieldHighlight();
		userTypeAppFreeElement.click();
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
	    						* ************************    End No.15 - Element of User Type(App) Free    ***********************
	    						* * **********************************************************************************************
		  						 						********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.16 -   Element of User Type(App) Expired  $$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//16. Element of User Type(App) Expired Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[10]/div[3]/input")
	WebElement userTypeAppExpiredElement;
	
	//16. Highlight the User Type(App) Free Element
	public void userTypeAppExpiredElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppExpiredElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppExpiredElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppExpiredElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppExpiredElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//16. Type to the User Type(App) Free Element
	public AddNewBanner clickOnUserTypeAppExpiredElement() throws InterruptedException {
		userTypeAppExpiredElementFieldHighlight();
		userTypeAppExpiredElement.click();
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
								* ************************    End No.16 - Element of User Type(App) Expired    ***********************
								* * **********************************************************************************************
			 											********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.17 -   Element of User Type(App) Paid  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//17. Element of User Type(App) Paid Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[10]/div[4]/input")
	WebElement userTypeAppPaidElement;
	
	//17. Highlight the User Type(App) Paid Element
	public void userTypeAppPaidElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppPaidElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppPaidElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppPaidElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppPaidElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//17. Type to the User Type(App) Paid Element
	public AddNewBanner clickOnUserTypeAppPaidElement() throws InterruptedException {
		userTypeAppPaidElementFieldHighlight();
		userTypeAppPaidElement.click();
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
								* ************************    End No.17 - Element of User Type(App) paid    ***********************
								* * **********************************************************************************************
															********************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$    Start No.18 -   Element of User Type(App) Premium  $$$$$$$$$$$$$$$$$$$$$$$$$$
								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//18. Element of User Type(App) Premium Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[10]/div[5]/input")
	WebElement userTypeAppPremiumElement;
	
	//18. Highlight the User Type(App) Premium Element
	public void userTypeAppPremiumElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppPremiumElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppPremiumElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeAppPremiumElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeAppPremiumElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//18. Type to the User Type(App) Premium Element
	public AddNewBanner clickOnUserTypeAppPremiumElement() throws InterruptedException {
		userTypeAppPremiumElementFieldHighlight();
		userTypeAppPremiumElement.click();
		return new AddNewBanner();
	}
	
	/*****************************************************
								* ************************************************************************************************
								* ************************    End No.18 - Element of User Type(App) Premium    *******************
								* * **********************************************************************************************
															********************************************************************************************************/
	
	
}
