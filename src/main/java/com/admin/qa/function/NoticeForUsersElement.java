package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NoticeForUsersElement extends TestBase{
	public NoticeForUsersElement(){
		PageFactory.initElements(driver, this);
	}
	
	public NoticeForUsersElement openAddNewNoticePage() {
		driver.get(props.getProperty("url")+"push/noticeForUsersElement");
		return new NoticeForUsersElement();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Notice Type   $$$$$$$$$$$$$$$$$$$$
					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//01. Notice Type Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/span")
	WebElement dropDownNoticeTypeinSelect;
	
	//01. Notice Type Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInNoticeTypeDropDown;
	
	//01. Notice Type Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForNoticeTypeSearch;
	
	//01. Highlight the Number of Notice Type Input Field
	public void noticeTypeDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownNoticeTypeinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownNoticeTypeinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownNoticeTypeinSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownNoticeTypeinSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//01. Select From the Notice Type
	public NoticeForUsersElement selectDatafromNoticeTypeDropDownElement() throws InterruptedException {
		noticeTypeDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownNoticeTypeinSelect.click(); /*click on the element */
		searchInNoticeTypeDropDown.sendKeys("Gene");/*type on the input field */
		valueForNoticeTypeSearch.click();/*click on the element from result of the first value. */
		return new NoticeForUsersElement();
	}
	
	/*******************************************************************
											 **************************************************************************************************
											 ***************************    End No.01 - Element of Notice Type    *****************************
											 **************************************************************************************************
											 					****************************************************************************************************/
	
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -  Element of User Type   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of User Type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/select")
	WebElement userTypeElement;
	
	//02. Highlight the User Type Dropdown Field
	public void userTypeFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", userTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", userTypeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//02. Select from User Type Dropdown Field
	public NoticeForUsersElement selectDataFromsuserTypeDropdownField() throws InterruptedException {
		userTypeFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/select")));
		drp.selectByIndex(1);/* select nth Index of data */
		return new NoticeForUsersElement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.02 - Element of User Type    *************************
							*********************************************************************************************
										  				*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				    * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -  Element of Operation Type   $$$$$$$$$$$$$$$$$$$$$$$$$
				    * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
															 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//03. Element of Operation Type
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/select")
	WebElement operationTypeElement;
	
	//03. Highlight the Operation Type Dropdown Field
	public void operationTypeElementFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", operationTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", operationTypeElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", operationTypeElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", operationTypeElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//03. Select from Operation Type Drop down Field
	public NoticeForUsersElement selectDataFromsOperationTypeDropdownField() throws InterruptedException {
		operationTypeElementFieldHighlight();/* highlight the element of the tested. */
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/select")));
		drp.selectByIndex(1);/* select nth Index of data */
		return new NoticeForUsersElement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.03 - Element of Operation Type    ********************
							*********************************************************************************************
							  							*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -  Element of Time Period From   $$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Time Period From
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[4]/div[1]/input")
	WebElement timePeriodFromElement;
	
	//04. Highlight the Time Period -  Date Input Field
	public void timePeriodFromFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", timePeriodFromElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", timePeriodFromElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", timePeriodFromElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", timePeriodFromElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//04. type To Time Period From Input Field
	public NoticeForUsersElement timePeriodFromInputField() throws InterruptedException {
		timePeriodFromFieldHighlight();/* highlight the element of the tested. */
		timePeriodFromElement.sendKeys("2023-09-13 15:00:54"); /*type to the element. */
		return new NoticeForUsersElement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.04 - Element of Time Period **************************
							*********************************************************************************************
	  													*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -  Element of Time Period To   $$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Time Period To
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[4]/div[3]/input")
	WebElement timePeriodToElement;
	
	//05. Highlight the Time Period To -  Date Input Field
	public void timePeriodToFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", timePeriodToElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", timePeriodToElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", timePeriodToElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", timePeriodToElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//05. type To Time Period To Input Field
	public NoticeForUsersElement timePeriodToInputField() throws InterruptedException {
		timePeriodToFieldHighlight();/* highlight the element of the tested. */
		timePeriodToElement.sendKeys("2023-09-17 15:70:54"); /*type to the element. */
		return new NoticeForUsersElement(); 
	}
	
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.05 - Element of Time Period To ***********************
							*********************************************************************************************
														*****************************************************************************************************/

	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Page Control   $$$$$$$$$$$$$$$$$$$
	 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											 				*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//06. Page Control Element for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[5]/div/span")
	WebElement dropDownPageControlSelect;
	
	//06. Page Control Element for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInPageControlDropDown;
	
	//06. Page Control Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForPageControlSearch;
	
	//06. Highlight the Page Control Input Field
	public void pageControlDropDownElementdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPageControlSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPageControlSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", dropDownPageControlSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", dropDownPageControlSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//06. Select From the Page Control
	public NoticeForUsersElement selectDatafromPageControlDropDownElement() throws InterruptedException {
		pageControlDropDownElementdHighlight();/* highlight the element of the tested. */
		dropDownPageControlSelect.click(); /*click on the element */
		searchInPageControlDropDown.sendKeys("Buy");/*type on the input field */
		valueForPageControlSearch.click();/*click on the element from result of the first value. */
		return new NoticeForUsersElement();
	}
	
	/*******************************************************************
								 **************************************************************************************************
								 ***************************    End No.06 - Element of Page Control    ****************************
								 **************************************************************************************************
								 					****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -  Element of Notice Message   $$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Notice Message
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[6]/div/textarea")
	WebElement noticeMessageElement;
	
	//07. Highlight the Notice Message Input Field
	public void noticeMessageFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", noticeMessageElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", noticeMessageElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", noticeMessageElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", noticeMessageElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//07. type To Notice Message Input Field
	public NoticeForUsersElement noticeMessageInputField() throws InterruptedException {
		noticeMessageFieldHighlight();/* highlight the element of the tested. */
		noticeMessageElement.click(); /*type to the element. */
		noticeMessageElement.sendKeys("Testttt...."); /*type to the element. */
		return new NoticeForUsersElement(); 
	}
	
	//7.0.1  Type to the Notice Message
	public NoticeForUsersElement  typetonoticeMessageInputParam(String notice) throws InterruptedException {
		noticeMessageFieldHighlight();
		noticeMessageElement.sendKeys(notice);
		return new NoticeForUsersElement ();
	}

	//7.0.2. Type Notice Message Input Field (enter text, then clear PPIN in CSV Input Field)
	public NoticeForUsersElement typeAndClearthenoticeMessageParam(String notice) throws InterruptedException {
		noticeMessageFieldHighlight();
		noticeMessageElement.sendKeys(notice);
		Thread.sleep(100);
		noticeMessageElement.clear();
		return new NoticeForUsersElement ();
										    			
	}		
		
	//7.0.3. Type to Notice Message
	public NoticeForUsersElement  typetothenoticeMessageTabKey() throws InterruptedException {
		noticeMessageFieldHighlight();
		noticeMessageElement.sendKeys(Keys.TAB);
		return new NoticeForUsersElement ();
	}
	
	
	/***************************************************
				*********************************************************************************************
				****************************    End No.07 - Element of Notice Message ***********************
				*********************************************************************************************
												*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -  Element of Push  Message   $$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
													  *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//08. Element of Push  Message
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[7]/div/textarea")
	WebElement pushMessageElement;
	
	//08. Highlight the Push  Message Input Field
	public void pushMessageFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pushMessageElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pushMessageElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pushMessageElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pushMessageElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//08. type To Push  Message Input Field
	public NoticeForUsersElement pushMessageInputField() throws InterruptedException {
		pushMessageFieldHighlight();/* highlight the element of the tested. */
		pushMessageElement.click(); /*type to the element. */
		pushMessageElement.sendKeys("Testttt...."); /*type to the element. */
		return new NoticeForUsersElement(); 
	}
	
	//8.0.1  Type to the Push message
	public NoticeForUsersElement  typetopushMessageParam(String push_message) throws InterruptedException {
		pushMessageFieldHighlight();
		pushMessageElement.sendKeys(push_message);
		return new NoticeForUsersElement ();
	}
	
	//8.0.2. Type Push Message Input Field (enter text, then clear Push Message Input Field)
	public NoticeForUsersElement typeAndClearthepushMessageParam(String push_message) throws InterruptedException {
		pushMessageFieldHighlight();
		pushMessageElement.sendKeys(push_message);
		Thread.sleep(100);
		pushMessageElement.clear();
		return new NoticeForUsersElement ();
										    			
	}		
		
	//8.0.3. Type to Push Message
	public NoticeForUsersElement  typetothepushMessageTabKey() throws InterruptedException {
		pushMessageFieldHighlight();
		pushMessageElement.sendKeys(Keys.TAB);
		return new NoticeForUsersElement ();
	}

	
	
	/***************************************************
	 						*********************************************************************************************
							****************************    End No.08 - Element of Push  Message ***********************
							*********************************************************************************************
														*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -  Element of Push  Remarks   $$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									  				*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//09. Element of Push  Remarks
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[8]/div/textarea")
	WebElement pushRemarksElement;
	
	//09. Highlight the Push  Remarks Input Field
	public void pushRemarksFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pushRemarksElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pushRemarksElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pushRemarksElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pushRemarksElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//9.0.1  Type to the Push Remarks
	public NoticeForUsersElement  typetopushRemarksParam(String remarks) throws InterruptedException {
		pushRemarksFieldHighlight();
		pushRemarksElement.sendKeys(remarks);
		return new NoticeForUsersElement ();
	}
	
	//9.0.2. Type Push Remarks Input Field (enter text, then clear Push Message Input Field)
	public NoticeForUsersElement typeAndClearthepushRemarksParam(String remarks) throws InterruptedException {
		pushRemarksFieldHighlight();
		pushRemarksElement.sendKeys(remarks);
		Thread.sleep(100);
		pushRemarksElement.clear();
		return new NoticeForUsersElement ();
										    			
	}		
		
	//9.0.3. Type to Push Remarks
	public NoticeForUsersElement  typetothepushRemarksTabKey() throws InterruptedException {
		pushRemarksFieldHighlight();
		pushRemarksElement.sendKeys(Keys.TAB);
		return new NoticeForUsersElement ();
	}
	
	/***************************************************
							*********************************************************************************************
							****************************    End No.09 - Element of Push  Remarks ***********************
							*********************************************************************************************
														*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -  Element of Active/Inactive Status   $$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					  								*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//10. Element of Active/Inactive Status
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[9]/div/input")
	WebElement activeInactiveStatusElement;
	
	//10. Highlight the Push  Remarks Input Field
	public void activeInactiveStatusFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveStatusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveStatusElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", activeInactiveStatusElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", activeInactiveStatusElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//10. type To Push  Active/Inactive Status
	public NoticeForUsersElement activeInactiveStatusInputField() throws InterruptedException {
		activeInactiveStatusFieldHighlight();/* highlight the element of the tested. */
		activeInactiveStatusElement.click(); /*type to the element. */
	
		return new NoticeForUsersElement(); 
	}
	
	
	/***************************************************
				*********************************************************************************************
				****************************    End No.10 - Element of Active/Inactive Status ***************
				*********************************************************************************************
											*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.11 -  Element of Submit Button   $$$$$$$$$$$$$$$$$$$$$$
					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	  												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//11. Element of Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement submitButtonElement;
	
	//11. Highlight the Submit Button
	public void submitButtonFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);/*make a yellow border off outside edge of the element*/
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//11. type To Push  Active/Inactive Status
	public NoticeForUsersElement submitButtonInputField() throws InterruptedException {
	    submitButtonFieldHighlight();/* highlight the element of the tested. */
	    submitButtonElement.click(); /*type to the element. */
	    return new NoticeForUsersElement(); 
	}
	
	
	/***************************************************
	 						*********************************************************************************************
							****************************    End No.11 - Element of Submit Button ************************
							*********************************************************************************************
														*****************************************************************************************************/
}
