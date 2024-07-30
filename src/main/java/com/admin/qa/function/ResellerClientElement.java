package com.admin.qa.function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerClientElement extends TestBase{
	public ResellerClientElement(){
		PageFactory.initElements(driver, this);
	}
	
	public ResellerClientElement openResellerClientReport() {
		driver.get(props.getProperty("url")+"reseller/index");
		return new ResellerClientElement();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Search by Login (Search Reseller Client)   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Search by Login (Search Reseller Client)
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[1]/input")
	WebElement searchByLoginElement;
	
	//01. Highlight the Search by Login (Search Reseller Client) Input Field
	public void searchByLoginInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchByLoginElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", searchByLoginElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchByLoginElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", searchByLoginElement);
			Thread.sleep(1000);
		}
	}
	//11.0.1 Type to the Search by Login (Search Reseller Client)parameter
	public ResellerClientElement typeToSearchByLoginFieldParam(String Login_Search ) throws InterruptedException {
		searchByLoginInputFieldHighlight();
		searchByLoginElement.sendKeys(Login_Search);		
		Thread.sleep(2000);		
		return new ResellerClientElement();
	}
	
	//11.0.2. Type Search by Login (Search Reseller Client) Input Field (enter text, then clear Search by Login (Search Reseller Client) Input Field)
	public ResellerClientElement typeAndClearSearchByNameFieldParam(String Login_Search) throws InterruptedException {
		searchByLoginInputFieldHighlight();
		searchByNameElement.sendKeys(Login_Search);
		Thread.sleep(1000);
		searchByLoginElement.clear();
		return new ResellerClientElement();									    			
	}	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Search by Name (Search Reseller Client)    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Search by Name (Search Reseller Client)   $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Search by Name (Search Reseller Client)
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[2]/input")
	WebElement searchByNameElement;
	
	//02. Highlight the Search by Name (Search Reseller Client) Input Field
	public void searchByNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchByNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", searchByNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchByNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", searchByNameElement);
			Thread.sleep(1000);
		}
	}
	//02.0.1 Type to the Search by Name (Search Reseller Client)parameter
	public ResellerClientElement typeToCampaignCouponCodeFieldParam(String Name_Search ) throws InterruptedException {
		searchByNameInputFieldHighlight();
		searchByNameElement.sendKeys(Name_Search);		
		Thread.sleep(2000);		
		return new ResellerClientElement();
	}
	
	//02.0.2. Type Search by Name(Search Reseller Client) Input Field (enter text, then clear Search by Name (Search Reseller Client) Input Field)
	public ResellerClientElement typeAndClearCampaignCouponCodeFieldParam(String Name_Search) throws InterruptedException {
		searchByNameInputFieldHighlight();
		searchByNameElement.sendKeys(Name_Search);
		Thread.sleep(1000);
		searchByNameElement.clear();
		return new ResellerClientElement();									    			
	}	
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Search by Name (Search Reseller Client)    ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03-  Element of Search by Rate plan (Search Reseller Client)  $$$$$$$$$$$$$$$$$$$
  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//03. Select Search by Rate plan (Search Reseller Client)) for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[3]/span/span[1]/span/span[1]")
	WebElement searchByRatePlanSelect;
		
	//03.Select Search by Rate plan (Search Reseller Client)) for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchRatePlanDropDown;
	
	//03. Rate plan Type Element (Search Reseller Client) for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement searchRatePlanSearch;
	
	//03. Highlight the Select Rate plan Input Field (Search Reseller Client)
	public void searchRatePlanDropdowndHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchByRatePlanSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",searchByRatePlanSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchByRatePlanSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", searchByRatePlanSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Select Search by Rate plan (Search Reseller Client)
	public ResellerClientElement selectRegularPlanDropDownElement() throws InterruptedException {
		searchRatePlanDropdowndHighlight();/* highlight the element of the tested. */
		searchByRatePlanSelect.click(); /*click on the element */
		searchRatePlanDropDown.sendKeys("Regular plan");/*type on the input field */
		searchRatePlanSearch.click();/*click on the element from result of the first value. */
		return new ResellerClientElement();
	}
	
	//03. Type to the Select Search by Rate plan (Search Reseller Client)
	public ResellerClientElement selectBaseTestPlanDropDownElement() throws InterruptedException {
		searchRatePlanDropdowndHighlight();/* highlight the element of the tested. */
		searchByRatePlanSelect.click(); /*click on the element */
		searchRatePlanDropDown.sendKeys("BaseTestPlan");/*type on the input field */
		searchRatePlanSearch.click();/*click on the element from result of the first value. */
		return new ResellerClientElement();
	}
	
	//03. Type to the Select Search by Rate plan (Search Reseller Client)
	public ResellerClientElement selectBaseTestPlan2DropDownElement() throws InterruptedException {
		searchRatePlanDropdowndHighlight();/* highlight the element of the tested. */
		searchByRatePlanSelect.click(); /*click on the element */
		searchRatePlanDropDown.sendKeys("BaseTestPlan2");/*type on the input field */
		searchRatePlanSearch.click();/*click on the element from result of the first value. */
		return new ResellerClientElement();
	}


      /***************************************************
		*********************************************************************************************
		****************************    End No.03 -  Element of Select Search by Rate plan (Search Reseller Client)   **************************
		*********************************************************************************************
										*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04-  Element of Search by Reseller Status (Search Reseller Client)  $$$$$$$$$$$$$$$$$$$
  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Select by Reseller Status (Search Reseller Client) for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[4]/span/span[1]/span/span[1]")
	WebElement searchByResellerStatusSelect;
		
	//04.Select by Reseller Status (Search Reseller Client) for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchResellerStatusDropDown;
	
	//04. Reseller Status (Search Reseller Client) for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement searchResellerStatusSearch;
	
	//04. Highlight the Select Reseller Status Input Field (Search Reseller Client)
	public void searchResellerStatusdowndHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchByResellerStatusSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",searchByResellerStatusSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", searchByResellerStatusSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", searchByResellerStatusSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Select ALL Reseller Status(Search Reseller Client)
	public ResellerClientElement selectAllResellerStatusElement() throws InterruptedException {
		searchResellerStatusdowndHighlight();/* highlight the element of the tested. */
		searchByResellerStatusSelect.click(); /*click on the element */
		searchResellerStatusDropDown.sendKeys("All");/*type on the input field */
		searchResellerStatusSearch.click();/*click on the element from result of the first value. */
		return new ResellerClientElement();
	}
	
	//04. Type to the Select Active Reseller Status (Search Reseller Client)
	public ResellerClientElement selectActiveResellerStatusElement() throws InterruptedException {
		searchResellerStatusdowndHighlight();/* highlight the element of the tested. */
		searchByResellerStatusSelect.click(); /*click on the element */
		searchResellerStatusDropDown.sendKeys("Active Reseller");/*type on the input field */
		searchResellerStatusSearch.click();/*click on the element from result of the first value. */
		return new ResellerClientElement();
	}
	
	//04. Type to the Select InActive Reseller Status (Search Reseller Client)
	public ResellerClientElement selectInactiveResellerStatusElement() throws InterruptedException {
		searchResellerStatusdowndHighlight();/* highlight the element of the tested. */
		searchByResellerStatusSelect.click(); /*click on the element */
		searchResellerStatusDropDown.sendKeys("Inactive Reseller");/*type on the input field */
		searchResellerStatusSearch.click();/*click on the element from result of the first value. */
		return new ResellerClientElement();
	}


      /***************************************************
		*********************************************************************************************
		****************************    End No.04 -  Element of Select Search by Reseller Status (Search Reseller Client)   **************************
		*********************************************************************************************
										*****************************************************************************************************/
	
	
}
