package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class AddNewCampaign extends TestBase{
	public AddNewCampaign(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewCampaign openAddNewCampaignForm() {
		driver.get(props.getProperty("url")+"/campaign/addCampaign");
		return new AddNewCampaign();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of Campaign Name  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Campaign Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement campaignNameElement;
	
	//01. Highlight the Campaign Name Input Field
	public void campaignNameElementInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignNameElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignNameElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignNameElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Campaign Name
	public AddNewCampaign  typeToServerNameInputField() throws InterruptedException {
		campaignNameElementInputFieldHighlight();
		campaignNameElement.sendKeys("");
		return new AddNewCampaign();
	}
	
	//01.0.1 Type to the Campaign Name parameter
	public AddNewCampaign typeToCampaignNameFieldParam(String campaign_name) throws InterruptedException {
		campaignNameElementInputFieldHighlight();
		campaignNameElement.sendKeys(campaign_name);		
		Thread.sleep(2000);		
		return new AddNewCampaign();
	}
	
	//01.0.2. Type Campaign Name Input Field (enter text, then clear Server Name Input Field)
	public AddNewCampaign typeAndClearCampaignNameFieldParam(String campaign_name) throws InterruptedException {
		campaignNameElementInputFieldHighlight();
		campaignNameElement.sendKeys(campaign_name);
		Thread.sleep(100);
		campaignNameElement.clear();
		return new AddNewCampaign();									    			
	}		
		
	//1.0.3. Type to Campaign Name tab key
	public AddNewCampaign  typetoCampaignNameFieldtabKey() throws InterruptedException {
		campaignNameElementInputFieldHighlight();
		campaignNameElement.sendKeys(Keys.TAB);
		return new AddNewCampaign();
	}	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.01 - Element of Campaign Name******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of Show As Name (On Website)$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//02. Element of Show As Name (On Website)
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/input")
	WebElement showAsNameOnWebsiteElement;
	
	//02. Highlight the Show As Name (On Website) Input Field
	public void showAsNameOnWebsiteInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", showAsNameOnWebsiteElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", showAsNameOnWebsiteElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", showAsNameOnWebsiteElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", showAsNameOnWebsiteElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the Show As Name (On Website)
	public AddNewCampaign typeToshowAsNameOnWebsiteInputField() throws InterruptedException {
		showAsNameOnWebsiteInputFieldHighlight();
		showAsNameOnWebsiteElement.sendKeys("");
		return new AddNewCampaign();
	}
	
	//02.0.1 Type to the Show As Name (On Website) parameter
	public AddNewCampaign typeToshowAsNameOnWebsiteFieldParam(String show_name) throws InterruptedException {
		showAsNameOnWebsiteInputFieldHighlight();
		showAsNameOnWebsiteElement.sendKeys(show_name);		
		Thread.sleep(2000);		
		return new AddNewCampaign();
	}
	
	//02.0.2. Type Show As Name (On Website) Input Field (enter text, then clear Show As Name (On Website) Input Field)
	public AddNewCampaign typeAndClearshowAsNameOnWebsiteFieldParam(String show_name) throws InterruptedException {
		showAsNameOnWebsiteInputFieldHighlight();
		showAsNameOnWebsiteElement.sendKeys(show_name);
		Thread.sleep(100);
		showAsNameOnWebsiteElement.clear();
		return new AddNewCampaign();									    			
	}		
		
	//2.0.3. Type to Show As Name (On Website) tab key
	public AddNewCampaign typetoshowAsNameOnWebsiteFieldtabKey() throws InterruptedException {
		showAsNameOnWebsiteInputFieldHighlight();
		showAsNameOnWebsiteElement.sendKeys(Keys.TAB);
		return new AddNewCampaign();
	}	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.02 - Element of Show As Name (On Website)******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of Website Header Img(External URL)$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//03. Element of Website Header Img (External URL)
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[4]/div/input")
	WebElement websiteHeaderImageElement;
	
	//03. Highlight the Website Header Img (External URL) Input Field
	public void websiteHeaderImageInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", websiteHeaderImageElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", websiteHeaderImageElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", websiteHeaderImageElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", websiteHeaderImageElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the Website Header Img (External URL)
	public AddNewCampaign typeTowebsiteHeaderImageInputField() throws InterruptedException {
		websiteHeaderImageInputFieldHighlight();
		websiteHeaderImageElement.sendKeys("");
		return new AddNewCampaign();
	}
	
	//03.0.1 Type to the Website Header Img (External URL)parameter
	public AddNewCampaign typeTowebsiteHeaderImageFieldParam(String Website_Header) throws InterruptedException {
		websiteHeaderImageInputFieldHighlight();
		websiteHeaderImageElement.sendKeys(Website_Header);		
		Thread.sleep(2000);		
		return new AddNewCampaign();
	}
	
	//03.0.2. Type Website Header Img (External URL) Input Field (enter text, then clear Website Header Img(External URL Input Field)
	public AddNewCampaign typeAndClearwebsiteHeaderImageFieldParam(String Website_Header) throws InterruptedException {
		websiteHeaderImageInputFieldHighlight();
		websiteHeaderImageElement.sendKeys(Website_Header);
		Thread.sleep(100);
		websiteHeaderImageElement.clear();
		return new AddNewCampaign();									    			
	}		
		
	//3.0.3. Type to Website Header Img (External URL)tab key
	public AddNewCampaign  typetowebsiteHeaderImageFieldtabKey() throws InterruptedException {
		websiteHeaderImageInputFieldHighlight();
		websiteHeaderImageElement.sendKeys(Keys.TAB);
		return new AddNewCampaign();
	}	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.03 - Element of Website Header Img(External URL)******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/

	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of Coupon Code $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//04. Element of Coupon Code
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[5]/div/input")
	WebElement couponCodeElement;
	
	//04. Highlight the Coupon Code) Input Field
	public void couponCodeInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", couponCodeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", couponCodeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", couponCodeElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", couponCodeElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the Coupon Code
	public AddNewCampaign typeToCouponCodeInputField() throws InterruptedException {
		couponCodeInputFieldHighlight();
		couponCodeElement.sendKeys("");
		return new AddNewCampaign();
	}
	
	//04.0.1 Type to the Coupon Code parameter
	public AddNewCampaign typeToCouponCodeFieldParam(String coupon_code) throws InterruptedException {
		couponCodeInputFieldHighlight();
		couponCodeElement.sendKeys(coupon_code);		
		Thread.sleep(2000);		
		return new AddNewCampaign();
	}
	
	//04.0.2. Type Coupon Code Input Field (enter text, then clear Coupon Code Input Field)
	public AddNewCampaign typeAndClearCouponCodeFieldParam(String coupon_code) throws InterruptedException {
		couponCodeInputFieldHighlight();
		couponCodeElement.sendKeys(coupon_code);
		Thread.sleep(100);
		couponCodeElement.clear();
		return new AddNewCampaign();									    			
	}		
		
	//4.0.3. Type to Coupon Code tab key
	public AddNewCampaign  typetoCouponCodetabKey() throws InterruptedException {
		couponCodeInputFieldHighlight();
		couponCodeElement.sendKeys(Keys.TAB);
		return new AddNewCampaign();
	}	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.04 - Element of Coupon Code  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Affiliate Share (%) $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//05. Element of Affiliate Share
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[6]/div/input")
	WebElement affiliateShareElement;
	
	//05. Highlight the Affiliate Share) Input Field
	public void affiliateShareInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", affiliateShareElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", affiliateShareElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", affiliateShareElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", affiliateShareElement);
			Thread.sleep(1000);
		}
	}
	
	//05. Type to the Affiliate Share
	public AddNewCampaign typeToAffiliateShareInputField() throws InterruptedException {
		affiliateShareInputFieldHighlight();
		affiliateShareElement.sendKeys("");
		return new AddNewCampaign();
	}
	
	//05.0.1 Type to the Affiliate Share parameter
	public AddNewCampaign typeToAffiliateShareFieldParam(String Affiliate_Share) throws InterruptedException {
		affiliateShareInputFieldHighlight();
		affiliateShareElement.sendKeys(Affiliate_Share);		
		Thread.sleep(2000);		
		return new AddNewCampaign();
	}
	
	//05.0.2. Type Affiliate Share Input Field (enter text, then clear Affiliate Share Input Field)
	public AddNewCampaign typeAndClearAffiliateShareFieldParam(String Affiliate_Share) throws InterruptedException {
		affiliateShareInputFieldHighlight();
		affiliateShareElement.sendKeys(Affiliate_Share);
		Thread.sleep(100);
		affiliateShareElement.clear();
		return new AddNewCampaign();									    			
	}		
		
	//5.0.3. Type to Affiliate Share tab key
	public AddNewCampaign  typetoAffiliateSharetabKey() throws InterruptedException {
		affiliateShareInputFieldHighlight();
		affiliateShareElement.sendKeys(Keys.TAB);
		return new AddNewCampaign();
	}	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.05 - Element of Affiliate Share (%)  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06-  Element of Campaign Period start From   $$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//06. Element of Campaign Period start from
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[7]/div[1]/input")
	WebElement campaignPeriodStartFromElement;
	

	//06. Highlight the Campaign Period start from Input Field
	public void campaignPeriodStartFromHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignPeriodStartFromElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignPeriodStartFromElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignPeriodStartFromElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignPeriodStartFromElement);
			Thread.sleep(1000);
		}
	}
	
	//6.0.3. Type to Campaign Period start from
	public AddNewCampaign campaignPeriodStartFromField() throws InterruptedException {
		campaignPeriodStartFromHighlight();
		campaignPeriodStartFromElement.sendKeys("2023-09-13 15:00:54"); /*type to the element. */
		return new AddNewCampaign();
	}	


     /***************************************************
			*********************************************************************************************
			****************************    End No.06 - Element of Time Period **************************
			*********************************************************************************************
											*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07-  Element of Campaign Period end time   $$$$$$$$$$$$$$$$$$$
  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//07. Element of Campaign Period end time
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[7]/div[3]/input")
	WebElement campaignPeriodEndTimeElement;
	

	//07. Highlight the Campaign Period end time Input Field
	public void campaignPeriodEndTimeHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignPeriodEndTimeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignPeriodEndTimeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignPeriodEndTimeElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignPeriodEndTimeElement);
			Thread.sleep(1000);
		}
	}
	
	//07. Type to Campaign Period end time
	public AddNewCampaign campaignPeriodEndTimeField() throws InterruptedException {
		campaignPeriodEndTimeHighlight();
		campaignPeriodEndTimeElement.sendKeys("2023-09-17 15:70:54"); /*type to the element. */
		return new AddNewCampaign();
	}	


      /***************************************************
		*********************************************************************************************
		****************************    End No.07 - Element of Campaign Period end time    **************************
		*********************************************************************************************
										*****************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of status drop down field $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	//08. Element of status drop down field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[8]/div/select")
	WebElement statusSelectFieldElement;
	
	//08. Highlight the status drop down field
	public void statusSelectFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", statusSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", statusSelectFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", statusSelectFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", statusSelectFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//08. Type to the status drop down field
	public AddNewCampaign typeSelectField() throws InterruptedException {
		statusSelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[8]/div/select")));
		drp.selectByIndex(1);
		return new AddNewCampaign();
	}

    /***************************************************
		*********************************************************************************************
		****************************    End No.08 -  Element of status drop down field    **************************
		*********************************************************************************************
										*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Remarks  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//09. Element of Remarks
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[9]/div/textarea")
	WebElement remarkElement;
	
	//09. Highlight the Remarks Input Field
	public void remarkInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", remarkElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", remarkElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",remarkElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", remarkElement);
			Thread.sleep(1000);
		}
	}
	
	//09. Type to the Remarks
	public AddNewCampaign typeToRemarksInputField() throws InterruptedException {
		remarkInputFieldHighlight();
		remarkElement.sendKeys("");
		return new AddNewCampaign();
	}
	
	//09.0.1 Type to the Remarks parameter
	public AddNewCampaign typeToRemarksFieldParam(String remarks) throws InterruptedException {
		remarkInputFieldHighlight();
		remarkElement.sendKeys(remarks);		
		Thread.sleep(2000);		
		return new AddNewCampaign();
	}
	
	//09.0.2. Type Remarks Input Field (enter text, then clear Remarks Input Field)
	public AddNewCampaign typeAndClearRemarksFieldParam(String remarks) throws InterruptedException {
		remarkInputFieldHighlight();
		remarkElement.sendKeys(remarks);
		Thread.sleep(100);
		remarkElement.clear();
		return new AddNewCampaign();									    			
	}		
		
	//9.0.3. Type to Remarks tab key
	public AddNewCampaign  typetoRemarkstabKey() throws InterruptedException {
		remarkInputFieldHighlight();
		remarkElement.sendKeys(Keys.TAB);
		return new AddNewCampaign();
	}	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.09 - Element of Remarks  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Save now Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//10. Element of Save now Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement saveNowButtonElement;
	
	//10. Highlight the Save now Button
	public void saveNowButtonInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", saveNowButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveNowButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",saveNowButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", saveNowButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//10. Click to the Save now Button
	public AddNewCampaign clickONSaveNowButton() throws InterruptedException {
		saveNowButtonInputFieldHighlight();
		saveNowButtonElement.click();
		return new AddNewCampaign();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.10 - Element of Save now Button ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	
}



