package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CampaignModuleElement extends TestBase{
	public CampaignModuleElement(){
		PageFactory.initElements(driver, this);
	}
	
	public CampaignModuleElement openAddNewCampaignForm() {
		driver.get(props.getProperty("url")+"/campaign/addCampaign");
		return new CampaignModuleElement();
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
	public CampaignModuleElement  typeToServerNameInputField() throws InterruptedException {
		campaignNameElementInputFieldHighlight();
		campaignNameElement.sendKeys("");
		return new CampaignModuleElement();
	}
	
	//01.0.1 Type to the Campaign Name parameter
	public CampaignModuleElement typeToCampaignNameFieldParam(String campaign_name) throws InterruptedException {
		campaignNameElementInputFieldHighlight();
		campaignNameElement.sendKeys(campaign_name);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//01.0.2. Type Campaign Name Input Field (enter text, then clear Server Name Input Field)
	public CampaignModuleElement typeAndClearCampaignNameFieldParam(String campaign_name) throws InterruptedException {
		campaignNameElementInputFieldHighlight();
		campaignNameElement.sendKeys(campaign_name);
		Thread.sleep(100);
		campaignNameElement.clear();
		return new CampaignModuleElement();									    			
	}		
		
	//1.0.3. Type to Campaign Name tab key
	public CampaignModuleElement  typetoCampaignNameFieldtabKey() throws InterruptedException {
		campaignNameElementInputFieldHighlight();
		campaignNameElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
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
	public CampaignModuleElement typeToshowAsNameOnWebsiteInputField() throws InterruptedException {
		showAsNameOnWebsiteInputFieldHighlight();
		showAsNameOnWebsiteElement.sendKeys("");
		return new CampaignModuleElement();
	}
	
	//02.0.1 Type to the Show As Name (On Website) parameter
	public CampaignModuleElement typeToshowAsNameOnWebsiteFieldParam(String show_name) throws InterruptedException {
		showAsNameOnWebsiteInputFieldHighlight();
		showAsNameOnWebsiteElement.sendKeys(show_name);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//02.0.2. Type Show As Name (On Website) Input Field (enter text, then clear Show As Name (On Website) Input Field)
	public CampaignModuleElement typeAndClearshowAsNameOnWebsiteFieldParam(String show_name) throws InterruptedException {
		showAsNameOnWebsiteInputFieldHighlight();
		showAsNameOnWebsiteElement.sendKeys(show_name);
		Thread.sleep(100);
		showAsNameOnWebsiteElement.clear();
		return new CampaignModuleElement();									    			
	}		
		
	//2.0.3. Type to Show As Name (On Website) tab key
	public CampaignModuleElement typetoshowAsNameOnWebsiteFieldtabKey() throws InterruptedException {
		showAsNameOnWebsiteInputFieldHighlight();
		showAsNameOnWebsiteElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
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
	public CampaignModuleElement typeTowebsiteHeaderImageInputField() throws InterruptedException {
		websiteHeaderImageInputFieldHighlight();
		websiteHeaderImageElement.sendKeys("");
		return new CampaignModuleElement();
	}
	
	//03.0.1 Type to the Website Header Img (External URL)parameter
	public CampaignModuleElement typeTowebsiteHeaderImageFieldParam(String Website_Header) throws InterruptedException {
		websiteHeaderImageInputFieldHighlight();
		websiteHeaderImageElement.sendKeys(Website_Header);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//03.0.2. Type Website Header Img (External URL) Input Field (enter text, then clear Website Header Img(External URL Input Field)
	public CampaignModuleElement typeAndClearwebsiteHeaderImageFieldParam(String Website_Header) throws InterruptedException {
		websiteHeaderImageInputFieldHighlight();
		websiteHeaderImageElement.sendKeys(Website_Header);
		Thread.sleep(100);
		websiteHeaderImageElement.clear();
		return new CampaignModuleElement();									    			
	}		
		
	//3.0.3. Type to Website Header Img (External URL)tab key
	public CampaignModuleElement  typetowebsiteHeaderImageFieldtabKey() throws InterruptedException {
		websiteHeaderImageInputFieldHighlight();
		websiteHeaderImageElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
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
	public CampaignModuleElement typeToCouponCodeInputField() throws InterruptedException {
		couponCodeInputFieldHighlight();
		couponCodeElement.sendKeys("");
		return new CampaignModuleElement();
	}
	
	//04.0.1 Type to the Coupon Code parameter
	public CampaignModuleElement typeToCouponCodeFieldParam(String coupon_code) throws InterruptedException {
		couponCodeInputFieldHighlight();
		couponCodeElement.sendKeys(coupon_code);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//04.0.2. Type Coupon Code Input Field (enter text, then clear Coupon Code Input Field)
	public CampaignModuleElement typeAndClearCouponCodeFieldParam(String coupon_code) throws InterruptedException {
		couponCodeInputFieldHighlight();
		couponCodeElement.sendKeys(coupon_code);
		Thread.sleep(100);
		couponCodeElement.clear();
		return new CampaignModuleElement();									    			
	}		
		
	//4.0.3. Type to Coupon Code tab key
	public CampaignModuleElement  typetoCouponCodetabKey() throws InterruptedException {
		couponCodeInputFieldHighlight();
		couponCodeElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
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
	public CampaignModuleElement typeToAffiliateShareInputField() throws InterruptedException {
		affiliateShareInputFieldHighlight();
		affiliateShareElement.sendKeys("");
		return new CampaignModuleElement();
	}
	
	//05.0.1 Type to the Affiliate Share parameter
	public CampaignModuleElement typeToAffiliateShareFieldParam(String Affiliate_Share) throws InterruptedException {
		affiliateShareInputFieldHighlight();
		affiliateShareElement.sendKeys(Affiliate_Share);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//05.0.2. Type Affiliate Share Input Field (enter text, then clear Affiliate Share Input Field)
	public CampaignModuleElement typeAndClearAffiliateShareFieldParam(String Affiliate_Share) throws InterruptedException {
		affiliateShareInputFieldHighlight();
		affiliateShareElement.sendKeys(Affiliate_Share);
		Thread.sleep(100);
		affiliateShareElement.clear();
		return new CampaignModuleElement();									    			
	}		
		
	//5.0.3. Type to Affiliate Share tab key
	public CampaignModuleElement  typetoAffiliateSharetabKey() throws InterruptedException {
		affiliateShareInputFieldHighlight();
		affiliateShareElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
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
	public CampaignModuleElement campaignPeriodStartFromField() throws InterruptedException {
		campaignPeriodStartFromHighlight();
		campaignPeriodStartFromElement.sendKeys("2024-05-08 11:00:54"); /*type to the element. */
		return new CampaignModuleElement();
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
	public CampaignModuleElement campaignPeriodEndTimeField() throws InterruptedException {
		campaignPeriodEndTimeHighlight();
		campaignPeriodEndTimeElement.sendKeys("2024-05-13 15:00:54"); /*type to the element. */
		return new CampaignModuleElement();
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
	public CampaignModuleElement typeSelectField() throws InterruptedException {
		statusSelectFieldHighlight();
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[8]/div/select")));
		drp.selectByIndex(0);
		return new CampaignModuleElement();
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
	public CampaignModuleElement typeToRemarksInputField() throws InterruptedException {
		remarkInputFieldHighlight();
		remarkElement.sendKeys("");
		return new CampaignModuleElement();
	}
	
	//09.0.1 Type to the Remarks parameter
	public CampaignModuleElement typeToRemarksFieldParam(String remarks) throws InterruptedException {
		remarkInputFieldHighlight();
		remarkElement.sendKeys(remarks);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//09.0.2. Type Remarks Input Field (enter text, then clear Remarks Input Field)
	public CampaignModuleElement typeAndClearRemarksFieldParam(String remarks) throws InterruptedException {
		remarkInputFieldHighlight();
		remarkElement.sendKeys(remarks);
		Thread.sleep(100);
		remarkElement.clear();
		return new CampaignModuleElement();									    			
	}		
		
	//9.0.3. Type to Remarks tab key
	public CampaignModuleElement  typetoRemarkstabKey() throws InterruptedException {
		remarkInputFieldHighlight();
		remarkElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
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
	public CampaignModuleElement clickONSaveNowButton() throws InterruptedException {
		saveNowButtonInputFieldHighlight();
		saveNowButtonElement.click();
		return new CampaignModuleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.10 - Element of Save now Button ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.11 -   Element of Campaign name / coupon Code  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
		
	//11. Element of Campaign name / coupon Code 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[2]/input")
	WebElement campaignCouponCodeElement;
	
	//11. Highlight the Campaign name / coupon Code  Input Field
	public void campaignCouponCodeHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", campaignCouponCodeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignCouponCodeElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",campaignCouponCodeElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", campaignCouponCodeElement);
			Thread.sleep(1000);
		}
	}
	
	//11.0.1 Type to the Campaign name / coupon Code  parameter
	public CampaignModuleElement typeToCampaignCouponCodeFieldParam(String coupon_Code ) throws InterruptedException {
		campaignCouponCodeHighlight();
		campaignCouponCodeElement.sendKeys(coupon_Code);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//11.0.2. Type Campaign name / coupon Code  Input Field (enter text, then clear Campaign name / coupon Code  Input Field)
	public CampaignModuleElement typeAndClearCampaignCouponCodeFieldParam(String coupon_Code) throws InterruptedException {
		campaignCouponCodeHighlight();
		campaignCouponCodeElement.sendKeys(coupon_Code);
		Thread.sleep(100);
		campaignCouponCodeElement.clear();
		return new CampaignModuleElement();									    			
	}		
			
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.11 - Element ofCampaign name / coupon Code ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.12 -   Element of  coupon code Search Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//12. Element of  Element of coupon code Search Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[4]/div[2]/a")
	WebElement couponCodeSearchElement;
	
	//12. Highlight the  Element of coupon code Search Button
	public void  couponCodeSearchHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",  couponCodeSearchElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",  couponCodeSearchElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", couponCodeSearchElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');",  couponCodeSearchElement);
			Thread.sleep(1000);
		}
	}
	
	//12. Click to the  Element of coupon code Search Button
	public CampaignModuleElement clickOnCouponCodeSearchbutton() throws InterruptedException {
		couponCodeSearchHighlight();
		couponCodeSearchElement.click();
		return new CampaignModuleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.12 -Element of  coupon code Search Button ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.13 -   Element of  set discount plan button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//13. Element of  Element of set discount plan button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/div/div/div[2]/div/table/tbody/tr/td[12]/a/span")
	WebElement setDiscountElement;
	
	//13. Highlight the  Element of set discount plan button
	public void  SetDiscountButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",  setDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",  setDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", setDiscountElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');",  setDiscountElement);
			Thread.sleep(1000);
		}
	}
	
	//13. Click to the  Element of set discount plan button
	public CampaignModuleElement clickOnSetDiscountbutton() throws InterruptedException {
		SetDiscountButtonHighlight();
		setDiscountElement.click();
		return new CampaignModuleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.13 - Element of set discount plan button ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.14 -   Element of Edit(6 Months) ACTION Click $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//14. Element of  Element of Edit(6 Months) ACTION Click
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/div/div[1]/form/div[2]/div/table/tbody/tr[4]/td[9]/a/i")
	WebElement editActionElement;
	
	//14. Highlight the  Element of Edit(6 Months) ACTION Click
	public void  editActionElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",  editActionElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",  editActionElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", editActionElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');",  editActionElement);
			Thread.sleep(1000);
		}
	}
	
	//14. Click to the  Element of Edit(6 Months) ACTION Click
	public CampaignModuleElement clickOnEditActionButton() throws InterruptedException {
		editActionElementHighlight();
		editActionElement.click();
		return new CampaignModuleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.14 - Element of Edit(6 Months) ACTION Click  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.15 - Element of Discount Amount-(Edit Discount for Campaign-Apply Discount)  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	
	//15. Element of Discount Amount 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[1]/div/input")
	WebElement discountAmountElement;
	
	//15. Highlight the Discount Amount  Input Field
	public void discountAmountHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", discountAmountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", discountAmountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",discountAmountElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", discountAmountElement);
			Thread.sleep(1000);
		}
	}
	
	//15.0.1 Type to the Discount Amount  parameter
	public CampaignModuleElement typeToDiscountAmountFieldParam(String discount_Amount) throws InterruptedException {
		discountAmountHighlight();
		discountAmountElement.sendKeys(discount_Amount);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//15.0.2. Type Discount Amount  Input Field (enter text, then clear Discount Amount  Input Field)
	public CampaignModuleElement typeAndClearDiscountAmountFieldParam(String discount_Amount) throws InterruptedException {
		discountAmountHighlight();
		discountAmountElement.sendKeys(discount_Amount);
		Thread.sleep(100);
		discountAmountElement.clear();
		return new CampaignModuleElement();									    			
	}	
	
	//15.0.3. Type to Discount Amount tab key
	public CampaignModuleElement  typetoEditDiscountAmounttabKey() throws InterruptedException {
		discountAmountHighlight();
		discountAmountElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
	}	
			
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.15 - Element of Discount Amount-(Edit Discount for Campaign-Apply Discount)  ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.16 - Element of Extra Bonus Validity in days-(Edit Discount for Campaign-Apply Discount)  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
		
	//16. Element of Extra Bonus Validity in days 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[2]/div/div[2]/div[3]/div/input")
	WebElement extraBonusElement;
	
	//16. Highlight the Extra Bonus Validity in days  Input Field
	public void ExtraBonusHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", extraBonusElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", extraBonusElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",extraBonusElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", extraBonusElement);
			Thread.sleep(1000);
		}
	}
	
	//16.0.1 Type to the Extra Bonus Validity in days  parameter
	public CampaignModuleElement typeToExtraBonusFieldParam(String extra_Bonus ) throws InterruptedException {
		ExtraBonusHighlight();
		extraBonusElement.sendKeys(extra_Bonus);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//16.0.2. Type Extra Bonus Validity in days Input Field (enter text, then clear Extra Bonus Validity in days  Input Field)
	public CampaignModuleElement typeAndClearExtraBonusFieldParam(String extra_Bonus) throws InterruptedException {
		ExtraBonusHighlight();
		extraBonusElement.sendKeys(extra_Bonus);
		Thread.sleep(100);
		extraBonusElement.clear();
		return new CampaignModuleElement();									    			
	}		
			
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.16 - Element of Extra Bonus Validity in days-(Edit Discount for Campaign-Apply Discount)******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.17 -   Element of Update Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//17. Element of  Element of Update Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[3]/div/input[4]")
	WebElement UpdateButtonElement;
	
	//17. Highlight the  Element of Update Button
	public void UpdateButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", UpdateButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",UpdateButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",  UpdateButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", UpdateButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//17. Click to the  Element of Update Button
	public CampaignModuleElement clickONUpdateButton() throws InterruptedException {
		UpdateButtonHighlight();
		UpdateButtonElement.click();
		return new CampaignModuleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.17 - Element of Update Button ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.18 -   Element of Assign Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//18. Element of  Element of Assign Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/div/div/div[2]/div/table/tbody/tr/td[2]/a")
	WebElement AssignButtonElement;
	
	//18. Highlight the  Element of Assign Button
	public void AssignButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", AssignButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",AssignButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",  AssignButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", AssignButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//18. Click to the  Element of Assign Button
	public CampaignModuleElement clickOnAssignButton() throws InterruptedException {
		AssignButtonHighlight();
		AssignButtonElement.click();
		return new CampaignModuleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.18 - Element of Assign Button******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
   * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.19-  Element of Select Reseller (Assign Campaign)  $$$$$$$$$$$$$$$$$$$
  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//19. Select Reseller for First click On the Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/span/span[1]/span/span[1]")
	WebElement assignResellerSelect;
		
	//19.Select Reseller for Search On the Element
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement assignResellerDropDown;
	
	//19. PIN Type Element for Last click of first element On the Element
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement assignResellerSearch;
	
	//19. Highlight the Select Reseller Input Field
	public void assignResellerSearchdHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", assignResellerSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",assignResellerSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", assignResellerSelect);/* make a yellow border outside edge of the element */
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", assignResellerSelect);/* make a yellow border off outside edge of the element */
			Thread.sleep(1000);
		}
	}
	
	//19. Type to the Select Reseller
	public CampaignModuleElement selectDatafromAssignResDropDownElement() throws InterruptedException {
		assignResellerSearchdHighlight();/* highlight the element of the tested. */
		assignResellerSelect.click(); /*click on the element */
		assignResellerDropDown.sendKeys("rumyqa");/*type on the input field */
		assignResellerSearch.click();/*click on the element from result of the first value. */
		return new CampaignModuleElement();
	}

      /***************************************************
		*********************************************************************************************
		****************************    End No.19 -  Element of Select Reseller (Assign Campaign)   **************************
		*********************************************************************************************
										*****************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.20 -   Element of Assign Campaign Update Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//20. Element of  Element of Assign Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement AssignCampaignUpdateNowElement;
	
	//20. Highlight the  Element of Assign Button
	public void AssignCampaignUpdateNowHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", AssignCampaignUpdateNowElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",AssignCampaignUpdateNowElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",  AssignCampaignUpdateNowElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", AssignCampaignUpdateNowElement);
			Thread.sleep(1000);
		}
	}
	
	//20. Click to the  Element of Assign Button
	public CampaignModuleElement clickOnAssignCampaignUpdateNowButton() throws InterruptedException {
		AssignCampaignUpdateNowHighlight();
		AssignCampaignUpdateNowElement.click();
		return new CampaignModuleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.20 - Element of Assign Campaign Update Button   ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.21 -   Element of Update Now assign campaign Button $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//21. Element of  Element of Update Now assign campaign Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement UpdateNowAssignCampaignButtonElement;
	
	//21. Highlight the  Element of Assign Button
	public void UpdateNowAssignCampaignButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", UpdateNowAssignCampaignButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",UpdateNowAssignCampaignButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",  UpdateNowAssignCampaignButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", UpdateNowAssignCampaignButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//21. Click to the  Element of Assign Button
	public CampaignModuleElement clickOnUpdateNowAssignCampaignButtonButton() throws InterruptedException {
		UpdateNowAssignCampaignButtonHighlight();
		UpdateNowAssignCampaignButtonElement.click();
		return new CampaignModuleElement();
	}
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.21 - Element of Assign Button******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.22 - Element of Coupon Code-(Edit Discount for Campaign-Apply Discount)  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
		
	//22. Element of Coupon Code in Edit Discount for Campaign 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement couponCodeDiscountElement;
	
	//22. Highlight the Coupon Code in Edit Discount for Campaign Input Field
	public void CouponCodeDiscountHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", couponCodeDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", couponCodeDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",couponCodeDiscountElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", couponCodeDiscountElement);
			Thread.sleep(1000);
		}
	}
	
	//22.0.1 Type to the Coupon Code in Edit Discount for Campaign parameter
	public CampaignModuleElement typeToCouponCodeDiscountFieldParam(String Coupon_Code) throws InterruptedException {
		CouponCodeDiscountHighlight();
		couponCodeDiscountElement.sendKeys(Coupon_Code);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//22.0.2. Type Coupon Code in Edit Discount for Campaign Input Field (enter text, then clear Coupon Code in Edit Discount for Campaign Input Field)
	public CampaignModuleElement typeAndClearCouponCodeDiscountFieldParam(String Coupon_Code) throws InterruptedException {
		CouponCodeDiscountHighlight();
		couponCodeDiscountElement.sendKeys(Coupon_Code);
		Thread.sleep(100);
		couponCodeDiscountElement.clear();
		return new CampaignModuleElement();									    			
	}
	
	//22.0.3. Type to Coupon Code tab key
	public CampaignModuleElement  typetoCouponCodeDiscounttabKey() throws InterruptedException {
		CouponCodeDiscountHighlight();
		couponCodeDiscountElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
	}	
			
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.22 - Element of Coupon Code-(Edit Discount for Campaign-Apply Discount)******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.23 - Element of Package Name-(Edit Discount for Campaign-Apply Discount)  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
		
	//23. Element of Package Name in Edit Discount for Campaign 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement packageNameDiscountElement;
	
	//23. Highlight the Package Name in Edit Discount for Campaign Input Field
	public void PackageNameHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", packageNameDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", packageNameDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",packageNameDiscountElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", packageNameDiscountElement);
			Thread.sleep(1000);
		}
	}
	
	//23.0.1 Type to the Package Name in Edit Discount for Campaign parameter
	public CampaignModuleElement typeToPackageNameFieldParam(String Package_Name) throws InterruptedException {
		PackageNameHighlight();
		packageNameDiscountElement.sendKeys(Package_Name);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//23.0.2. Type Package Name in Edit Discount for Campaign Input Field (enter text, then clear Package Name in Edit Discount for Campaign Input Field)
	public CampaignModuleElement typeAndClearPackageNameFieldParam(String Package_Name) throws InterruptedException {
		PackageNameHighlight();
		packageNameDiscountElement.sendKeys(Package_Name);
		Thread.sleep(100);
		packageNameDiscountElement.clear();
		return new CampaignModuleElement();									    			
	}
	
	//23.0.3. Type to Package Name tab key
	public CampaignModuleElement  typetoPackageNametabKey() throws InterruptedException {
		PackageNameHighlight();
		packageNameDiscountElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
	}	
			
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.23 - Element of Package Name -(Edit Discount for Campaign-Apply Discount)******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.24 - Element of Number Of Days*-(Edit Discount for Campaign-Apply Discount)  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
		
	//24. Element of Number Of Days* in Edit Discount for Campaign 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement NumberOfDaysDiscountElement;
	
	//24. Highlight the Number Of Days* in Edit Discount for Campaign Input Field
	public void NumberOfDaysHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", NumberOfDaysDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", NumberOfDaysDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",NumberOfDaysDiscountElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", NumberOfDaysDiscountElement);
			Thread.sleep(1000);
		}
	}
	
	//24.0.1 Type to the Number Of Days in Edit Discount for Campaign parameter
	public CampaignModuleElement typeToNumberOfDaysFieldParam(String Number_Of_Days) throws InterruptedException {
		NumberOfDaysHighlight();
		NumberOfDaysDiscountElement.sendKeys(Number_Of_Days);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//24.0.2. Type Number Of Days in Edit Discount for Campaign Input Field (enter text, then clear Number Of Days in Edit Discount for Campaign Input Field)
	public CampaignModuleElement typeAndClearNumberOfDaysFieldParam(String Number_Of_Days) throws InterruptedException {
		NumberOfDaysHighlight();
		NumberOfDaysDiscountElement.sendKeys(Number_Of_Days);
		Thread.sleep(100);
		NumberOfDaysDiscountElement.clear();
		return new CampaignModuleElement();									    			
	}
	
	//24.0.3. Type to Number Of Days tab key
	public CampaignModuleElement  typetoNumberOfDaystabKey() throws InterruptedException {
		NumberOfDaysHighlight();
		NumberOfDaysDiscountElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
	}	
			
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.24 - Element of  Number Of Days* -(Edit Discount for Campaign-Apply Discount)******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.25 - Element of Package Price-(Edit Discount for Campaign- Apply Discount)  $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
		
	//25. Element of Package Price in Edit Discount for Campaign 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement packagePriceDiscountElement;
	
	//25. Highlight the Package Price in Edit Discount for Campaign Input Field
	public void PackagePriceHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", packagePriceDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", packagePriceDiscountElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",packagePriceDiscountElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", packagePriceDiscountElement);
			Thread.sleep(1000);
		}
	}
	
	//25.0.1 Type to the Package Price in Edit Discount for Campaign parameter
	public CampaignModuleElement typeToPackagePriceFieldParam(String Package_Price) throws InterruptedException {
		PackagePriceHighlight();
		packagePriceDiscountElement.sendKeys(Package_Price);		
		Thread.sleep(2000);		
		return new CampaignModuleElement();
	}
	
	//25.0.2. Type Package Price in Edit Discount for Campaign Input Field (enter text, then clear Package Name in Edit Discount for Campaign Input Field)
	public CampaignModuleElement typeAndClearPackagePriceFieldParam(String Package_Price) throws InterruptedException {
		PackagePriceHighlight();
		packagePriceDiscountElement.sendKeys(Package_Price);
		Thread.sleep(100);
		packagePriceDiscountElement.clear();
		return new CampaignModuleElement();									    			
	}
	
	//25.0.3. Type to Package Price tab key
	public CampaignModuleElement  typetoPackagePricetabKey() throws InterruptedException {
		PackagePriceHighlight();
		packagePriceDiscountElement.sendKeys(Keys.TAB);
		return new CampaignModuleElement();
	}	
			
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.25 - Element of Package Price -(Edit Discount for Campaign-Apply Discount) ******************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.26 -   Element of update Button- Edit Discount for Campaign $$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//26. Element of update Button in Edit Discount for Campaign
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[3]/div/input[4]")
	WebElement updateEditDiscountButtonElement;
	
	//26. Highlight the update Button in Edit Discount for Campaign 
	public void updateEditDiscountButtonHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", updateEditDiscountButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');",updateEditDiscountButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",  updateEditDiscountButtonElement);/*make a yellow border outside edge of the element*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", updateEditDiscountButtonElement);
			Thread.sleep(1000);
		}
	}
	
	//26. Click to the update Button in Edit Discount for Campaign
	public CampaignModuleElement clickOnUpdateEditDiscountButton() throws InterruptedException {
		updateEditDiscountButtonHighlight();
		updateEditDiscountButtonElement.click();
		return new CampaignModuleElement();
	} 
	
	/***************************************************************************************************************
     * *****************************************************************************************************
	 * **************************    End No.26 - Element of update Button- Edit Discount for Campaign *****************************************
	 * * *****************************************************************************************************
	******************************************************************************************************************************/
	

}



