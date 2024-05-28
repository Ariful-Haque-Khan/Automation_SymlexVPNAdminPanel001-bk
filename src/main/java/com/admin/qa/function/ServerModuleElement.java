package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ServerModuleElement extends TestBase {
	public ServerModuleElement() {
		PageFactory.initElements(driver, this);
	}

	public ServerModuleElement openAddNewServerPage() {
		driver.get(props.getProperty("url") + "VpnServer/create");
		return new ServerModuleElement();
	}

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.01 - Element of Server Name
	 * $$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 01. Element of Server Name
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement serverNameDaysElement;

	// 01. Highlight the Server Name Input Field
	public void serverNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",serverNameDaysElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNameDaysElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",serverNameDaysElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNameDaysElement);
			Thread.sleep(1000);
		}
	}

	// 01.0.1 Type to the Server Name parameter
	public ServerModuleElement typeToServerNameFieldParam(String Server_Name) throws InterruptedException {
		serverNameInputFieldHighlight();
		serverNameDaysElement.sendKeys(Server_Name);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 01.0.2. Type Server Name Input Field (enter text, then clear Server Name
	// Input Field)
	public ServerModuleElement typeAndClearServerNameFieldParam(String Server_Name) throws InterruptedException {
		serverNameInputFieldHighlight();
		serverNameDaysElement.sendKeys(Server_Name);
		Thread.sleep(100);
		serverNameDaysElement.clear();
		return new ServerModuleElement();
	}

	// 1.0.3. Type to Server Name tab key
	public ServerModuleElement typetoServerNametabKey() throws InterruptedException {
		serverNameInputFieldHighlight();
		serverNameDaysElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.02 - Element of Server Name
	 * *********************** *
	 * ***************************************************************************************
	 ************************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.02 - Element of IP
	 * $$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 02. Element of IP
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement ipInputFieldElement;

	// 02. Highlight the IP Input Field
	public void ipInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",ipInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",ipInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 01.0.1 Type to the IP parameter
	public ServerModuleElement typeToIPFieldParam(String IP) throws InterruptedException {
		ipInputFieldHighlight();
		ipInputFieldElement.sendKeys(IP);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 01.0.2. Type IP Input Field (enter text, then clear IP Input Field)
	public ServerModuleElement typeAndClearIPFieldParam(String IP) throws InterruptedException {
		ipInputFieldHighlight();
		ipInputFieldElement.sendKeys(IP);
		Thread.sleep(100);
		ipInputFieldElement.clear();
		return new ServerModuleElement();
	}

	// 1.0.3. Type to IP tab key
	public ServerModuleElement typetoIPtabKey() throws InterruptedException {
		ipInputFieldHighlight();
		ipInputFieldElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.01 - Element of IP Input Field
	 * ********************* *
	 * ***************************************************************************************
	 ************************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.03 - Element of IP Range
	 * Input Field $$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 03. Element of IP Range
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input[2]")
	WebElement ipRangeInputFieldElement;

	// 03. Highlight the IP Range Input Field
	public void ipRangeInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",ipRangeInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipRangeInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",ipRangeInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipRangeInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 03.0.1 Type to the IP Range parameter
	public ServerModuleElement typeToIPRangeFieldParam(String IP_Range) throws InterruptedException {
		ipRangeInputFieldHighlight();
		ipRangeInputFieldElement.sendKeys(IP_Range);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 03.0.2. Type IP Range Input Field (enter text, then clear IP Range Input
	// Field)
	public ServerModuleElement typeAndClearIPRangeFieldParam(String IP_Range) throws InterruptedException {
		ipRangeInputFieldHighlight();
		ipRangeInputFieldElement.sendKeys(IP_Range);
		Thread.sleep(100);
		ipRangeInputFieldElement.clear();
		return new ServerModuleElement();
	}

	// 3.0.3. Type to IP Range tab key
	public ServerModuleElement typetoIPRangetabKey() throws InterruptedException {
		ipRangeInputFieldHighlight();
		ipRangeInputFieldElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.03 - Element of IP Range Input Field
	 * ********************* *
	 * ***************************************************************************************
	 ************************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.04 - Element of Path Input
	 * Field $$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 04. Element of Path Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/input")
	WebElement pathInputFieldElement;

	// 04. Highlight the Path Input Field
	public void pathInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",pathInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pathInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",pathInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pathInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 04.0.1 Type to the Path  parameter
	public ServerModuleElement typeToPathFieldParam(String Path) throws InterruptedException {
		pathInputFieldHighlight();
		pathInputFieldElement.sendKeys(Path);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 04.0.2. Type Path  Input Field (enter text, then clear Path  Input)
	// Field)
	public ServerModuleElement typeAndClearPathFieldParam(String Path) throws InterruptedException {
		pathInputFieldHighlight();
		pathInputFieldElement.sendKeys(Path);
		Thread.sleep(100);
		pathInputFieldElement.clear();
		return new ServerModuleElement();
	}

	// 4.0.3. Type to Path  tab key
	public ServerModuleElement typetoPathtabKey() throws InterruptedException {
		pathInputFieldHighlight();
		pathInputFieldElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.04 - Element of Path Input Field ******************* *
	 * ***************************************************************************************
	 ************************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.05 - Element of Capacity Input Field $$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 05. Element of Capacity Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[5]/div/input")
	WebElement capacityInputFieldElement;

	// 05. Highlight the Capacity Input Field
	public void capacityInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",capacityInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", capacityInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",capacityInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", capacityInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 05.0.1 Type to the Capacity parameter
	public ServerModuleElement typeToCapacityFieldParam(String Capacity) throws InterruptedException {
		capacityInputFieldHighlight();
		capacityInputFieldElement.sendKeys(Capacity);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 05.0.2. Type Capacity Field (enter text, then clear User Name Input Field)
	public ServerModuleElement typeAndClearCapacityFieldParam(String Capacity) throws InterruptedException {
		capacityInputFieldHighlight();
		capacityInputFieldElement.sendKeys(Capacity);
		Thread.sleep(100);
		capacityInputFieldElement.clear();
		return new ServerModuleElement();
	}

	// 5.0.3. Type to Capacity tab key
	public ServerModuleElement typetoCapacitytabKey() throws InterruptedException {
		capacityInputFieldHighlight();
		capacityInputFieldElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.05 - Element of Capacity Input Field
	 * *************** *
	 * ***************************************************************************************
	 ************************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.06 - Element of Country
	 * Input Field $$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 06. Element of Country Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/select")
	WebElement countryInputFieldElement;

	// 06. Highlight the Country Input Field
	public void countrySelectFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",countryInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", countryInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",countryInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", countryInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 06. Type to the Country Input Field
	public ServerModuleElement countrySelectField() throws InterruptedException {
		countrySelectFieldHighlight();
		Select drp = new Select(driver.findElement(
		By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/select")));
		drp.selectByIndex(8);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.06 - Element of Country Select Field
	 * *************** *
	 * ***************************************************************************************
	 ************************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.07 - Element of City Input* Field $$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 07. Element of City Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[7]/div/input")
	WebElement cityInputFieldElement;

	// 07. Highlight the City Input Field
	public void cityInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",cityInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", cityInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",cityInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", cityInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 07.0.1 Type to the City parameter
	public ServerModuleElement typeToCityFieldParam(String City) throws InterruptedException {
		cityInputFieldHighlight();
		cityInputFieldElement.sendKeys(City);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 07.0.2. Type User City Field (enter text, then clear City Input Field)
	public ServerModuleElement typeAndClearCityFieldParam(String City) throws InterruptedException {
		cityInputFieldHighlight();
		cityInputFieldElement.sendKeys(City);
		Thread.sleep(100);
		cityInputFieldElement.clear();
		return new ServerModuleElement();
	}

	// 7.0.3. Type to City tab key
	public ServerModuleElement typetoCitytabKey() throws InterruptedException {
		cityInputFieldHighlight();
		cityInputFieldElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.07 - Element of City Input Field ******************* *
	 * ***************************************************************************************
	 ************************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.08 - Element of Location Input Field $$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 08. Element of Location Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[8]/div/input[1]")
	WebElement locationInputFieldElement;

	// 08. Highlight the Location Input Field
	public void locationInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",locationInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", locationInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",locationInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", locationInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 08.0.1 Type to the Location parameter
	public ServerModuleElement typeToLocationFieldParam(String Location) throws InterruptedException {
		locationInputFieldHighlight();
		locationInputFieldElement.sendKeys(Location);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 08.0.2. Type Location Input Field (enter text, then clear Location Input Field)
	public ServerModuleElement typeAndClearLocationFieldParam(String Location) throws InterruptedException {
		locationInputFieldHighlight();
		locationInputFieldElement.sendKeys(Location);
		Thread.sleep(100);
		locationInputFieldElement.clear();
		return new ServerModuleElement();
	}

	// 8.0.3. Type to Location tab key
	public ServerModuleElement typetoLocationtabKey() throws InterruptedException {
		locationInputFieldHighlight();
		locationInputFieldElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.08 - Element of Location Input Field *************** *
	 * ***************************************************************************************
	 ************************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.09 - Element of Order Priority Input Field $$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 09. Element of Order Priority Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[9]/div/input")
	WebElement orderPriorityInputFieldElement;

	// 09. Highlight the Order Priority Input Field
	public void orderPriorityInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",orderPriorityInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", orderPriorityInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",orderPriorityInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", orderPriorityInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 09.0.1 Type to the Order Priority  parameter
	public ServerModuleElement typeToOrderPriorityFieldParam(String Order_Priority) throws InterruptedException {
		orderPriorityInputFieldHighlight();
		orderPriorityInputFieldElement.sendKeys(Order_Priority);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 09.0.2. Type Order Priority  Input Field (enter text, then clear Order Priority Input
	// Field)
	public ServerModuleElement typeAndClearOrderPriorityFieldParam(String Order_Priority) throws InterruptedException {
		orderPriorityInputFieldHighlight();
		orderPriorityInputFieldElement.sendKeys(Order_Priority);
		Thread.sleep(100);
		orderPriorityInputFieldElement.clear();
		return new ServerModuleElement();
	}

	// 9.0.3. Type to Order Priority tab key
	public ServerModuleElement typetoOrderPrioritytabKey() throws InterruptedException {
		orderPriorityInputFieldHighlight();
		orderPriorityInputFieldElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.09 - Element of Order Priority Input Field
	 * ********* *
	 * ***************************************************************************************
	 *************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.10 - Element of Server Price Input Field $$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 10. Element of Server Price Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[10]/div/input")
	WebElement serverPriceInputFieldElement;

	// 10. Highlight the Location Input Field
	public void serverPriceInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",serverPriceInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverPriceInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",serverPriceInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverPriceInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 10.0.1 Type to the Server Price parameter
	public ServerModuleElement typeToServerPriceFieldParam(String Server_Price) throws InterruptedException {
		serverPriceInputFieldHighlight();
		serverPriceInputFieldElement.sendKeys(Server_Price);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 10.0.2. Type Server Price Input Field (enter text, then clear Server Price Input Field)
	public ServerModuleElement typeAndClearServerPriceFieldParam(String Server_Price) throws InterruptedException {
		serverPriceInputFieldHighlight();
		serverPriceInputFieldElement.sendKeys(Server_Price);
		Thread.sleep(100);
		serverPriceInputFieldElement.clear();
		return new ServerModuleElement();
	}

	// 10.0.3. Type to Server Price tab key
	public ServerModuleElement typetoServerPricetabKey() throws InterruptedException {
		serverPriceInputFieldHighlight();
		serverPriceInputFieldElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.10 - Element of Server Price Input Field *********** *
	 * ***************************************************************************************
	 *************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Start No.11 - Element of Domain Input Field $$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 11. Element of Domain Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[11]/div/input")
	WebElement domainInputFieldElement;

	// 11. Highlight the Domain Input Field
	public void domainInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",domainInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", domainInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",domainInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", domainInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 11.0.1 Type to the Domain parameter
	public ServerModuleElement typeToDomainFieldParam(String Domain) throws InterruptedException {
		domainInputFieldHighlight();
		domainInputFieldElement.sendKeys(Domain);
		Thread.sleep(2000);
		return new ServerModuleElement();
	}

	// 11.0.2. Type Domain Input Field (enter text, then clear Domain Input Field)
	public ServerModuleElement typeAndClearDomainFieldParam(String Domain) throws InterruptedException {
		domainInputFieldHighlight();
		domainInputFieldElement.sendKeys(Domain);
		Thread.sleep(100);
		domainInputFieldElement.clear();
		return new ServerModuleElement();
	}

	// 11.0.3. Type to Domain tab key
	public ServerModuleElement typetoDomaintabKey() throws InterruptedException {
		domainInputFieldHighlight();
		domainInputFieldElement.sendKeys(Keys.TAB);
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.11 - Element of Domain Input Field *********** *
	 * ***************************************************************************************
	 *************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$ Start No.11 - Element of Server Upload WireGuard Config?  Checkbox Field $$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 11. Element of Upload WireGuard Config? Checkbox Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[12]/div/input")
	WebElement uploadWireGuardConfigCheckboxFieldElement;

	// 11. Highlight the Upload WireGuard Config Input Field
	public void uploadWireGuardConfigCheckboxFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",uploadWireGuardConfigCheckboxFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", uploadWireGuardConfigCheckboxFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",uploadWireGuardConfigCheckboxFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", uploadWireGuardConfigCheckboxFieldElement);
			Thread.sleep(1000);
		}
	}

	// 13. Type to the Is Upload WireGuard Config?
	public ServerModuleElement clickWireGuardConfigCheckboxField() throws InterruptedException {
		uploadWireGuardConfigCheckboxFieldHighlight();
		uploadWireGuardConfigCheckboxFieldElement.click();
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *********************************************************************************************************
	 * ************************ End No.11 - Element of Upload WireGuard Config?( Checkbox Field) Checkbox Field *********** *
	 * *******************************************************************************************************
	 ************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$ Start No.12 - Element of Wireguard File Input Field $$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 12. Element of Wireguard File Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[13]/div/input")
	WebElement wireGurdFileInputFieldElement;

	// 12. Highlight the Wireguard File Input Field
	public void wireGurdFileInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",wireGurdFileInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", wireGurdFileInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",wireGurdFileInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", wireGurdFileInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 12. Type to the Wireguard File Input Field
	public ServerModuleElement wireGurdFilePriorityInputField() throws InterruptedException {
		wireGurdFileInputFieldHighlight();
		wireGurdFileInputFieldElement.sendKeys("C:\\Users\\rumyk\\Downloads\\SideStore.conf");
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.12 - Element of Wireguard File Input Field ********* *
	 * ***************************************************************************************
	 *************************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$ Start No.13 - Element of Is Active Checkbox Field $$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 13. Element of Is Active Checkbox Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[14]/div/div/input")
	WebElement isActiveCheckboxFieldElement;

	// 13. Highlight the Is Active Checkbox Input Field
	public void isActiveCheckboxFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",isActiveCheckboxFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isActiveCheckboxFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",isActiveCheckboxFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isActiveCheckboxFieldElement);
			Thread.sleep(1000);
		}
	}


	// 19. Type to the Is Fast Server Check box Field
	public ServerModuleElement clickTIsActiveCheckboxField() throws InterruptedException {
		isActiveCheckboxFieldHighlight();
		Thread.sleep(1000);
		isActiveCheckboxFieldElement.click();
		return new ServerModuleElement();
	}

	/*************************************************************
	 * ****************************************************************************************************
	 * ************************ End No.13 - Element of Is Active Checkbox Field ********************** *
	 * **************************************************************************************************
	 ************************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$ Start No.14 - Element of OpenVPN Checkbox Field $$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 14. Element of OpenVPN Checkbox Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[15]/div/div/input")
	WebElement openVPNCheckboxFieldElement;

	// 14. Highlight the Location Input Field
	public void openVPNCheckboxFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",openVPNCheckboxFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", openVPNCheckboxFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",openVPNCheckboxFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", openVPNCheckboxFieldElement);
			Thread.sleep(1000);
		}
	}

	// 14. Type to the OpenVPN Checkbox Field
	public ServerModuleElement clickTOpenVPNCheckboxField() throws InterruptedException {
		openVPNCheckboxFieldHighlight();
		Thread.sleep(1000);
		openVPNCheckboxFieldElement.click();
		return new ServerModuleElement();
	}

	/*************************************************************
	 * ****************************************************************************************************
	 * ************************ End No.14 - Element of OpenVPN Checkbox Field ********************** *
	 * **************************************************************************************************
	 ********************************************************************************************/

	/*
	 * * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$ $$$$$$$$$$$$$$ Start No.15 - Element of Anyconnect Input Field $$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 15. Element of Anyconnect Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[16]/div/div/input")
	WebElement anyconnectInputFieldElement;

	// 15. Highlight the Wireguard File Input Field
	public void anyconnectInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",anyconnectInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", anyconnectInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",anyconnectInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", anyconnectInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 15. Type to the Anyconnect Input Field
	public ServerModuleElement anyconnectInputField() throws InterruptedException {
		anyconnectInputFieldHighlight();
		Thread.sleep(1000);
		anyconnectInputFieldElement.click();
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.15 - Element of Anyconnect Input Field ************* *
	 * ***************************************************************************************
	 ******************************************************************************************/

	/*
	 * * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$ Start No.16 - Element of Shadowsock Input Field  $$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 16. Element of Shadowsock Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[17]/div/div/input")
	WebElement shadowsockInputFieldElement;

	// 16. Highlight the Shadowsock File Input Field
	public void shadowshockInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",shadowsockInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", shadowsockInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",shadowsockInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", shadowsockInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 16. Type to the Shadowsock Input Field
	public ServerModuleElement shadowsockInputField() throws InterruptedException {
		shadowshockInputFieldHighlight();
		Thread.sleep(1000);
		shadowsockInputFieldElement.click();
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.16 - Element of Shadowsock Input Field ************* *
	 * ***************************************************************************************
	 ******************************************************************************************/

	/*
	 * * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$ Start No.17 - Element of SSH Input Field $$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 17. Element of SSH Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[18]/div/div/input")
	WebElement SSHkInputFieldElement;

	// 17. Highlight the SSH Input Field
	public void SSHInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",SSHkInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", SSHkInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",SSHkInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", SSHkInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 17. Type to the SSH Input Field
	public ServerModuleElement SSHInputField() throws InterruptedException {
		SSHInputFieldHighlight();
		Thread.sleep(1000);
		SSHkInputFieldElement.click();
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.17 - Element of SSH Input Field ******************** *
	 * ***************************************************************************************
	 ******************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$ Start No.18 - Element of WireGuard Input Field $$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 18. Element of WireGuard Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[19]/div/div/input")
	WebElement wireGuardkInputFieldElement;

	// 18. Highlight the SSH Input Field
	public void wireGuardInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",wireGuardkInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", wireGuardkInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",wireGuardkInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", wireGuardkInputFieldElement);
			Thread.sleep(1000);
		}
	}

	// 18. Type to the WireGuard Input Field
	public ServerModuleElement typeToWireGuardInputField() throws InterruptedException {
		wireGuardInputFieldHighlight();
		Thread.sleep(1000);
		wireGuardkInputFieldElement.click();
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.18 - Element of WireGuard Input Field ************** *
	 * ***************************************************************************************
	 ******************************************************************************************/

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$ Start No.19 - Element of Is Free Checkbox Input Field $$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */

	// 19. Element of Is Free Checkbox Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[20]/div/div/input")
	WebElement isFreeInputCheckBox;

	// 19. Highlight the Is Free Checkbox Input Field
	public void isFreeCheckboxInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",isFreeInputCheckBox);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", isFreeInputCheckBox);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",isFreeInputCheckBox);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", isFreeInputCheckBox);
			Thread.sleep(1000);
		}
	}

	// 19. Type to the Is Free Checkbox Input Field
	public ServerModuleElement clickToIsFreeCheckboxInputField() throws InterruptedException {
		isFreeCheckboxInputFieldHighlight();
		Thread.sleep(1000);
		isFreeInputCheckBox.click();
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.20 - Element of Is Free Checkbox Input Field ******* *
	 * ***************************************************************************************
	 ******************************************************************************************/
	
	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$ Start No.21 -  Element of Submit Button Input Field  $$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 */
	

	// 21. Element of Submit Button Input Field
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement submitButtonElement;

	// 21. Highlight the Submit Button Input Field
	public void submitButtonElementHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", submitButtonElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", submitButtonElement);
			Thread.sleep(1000);
		}
	}

	// 21. Type to the Submit Button Input Field
	public ServerModuleElement clickToSubmitButton() throws InterruptedException {
		submitButtonElementHighlight();
		Thread.sleep(1000);
		submitButtonElement.click();
		return new ServerModuleElement();
	}

	/*************************************************************
	 * *****************************************************************************************
	 * ************************ End No.21 - Element of Submit Button Input Field ******* *
	 * ***************************************************************************************
	 ******************************************************************************************/
}
