package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class  AddNewServer extends TestBase{
	public AddNewServer(){
		PageFactory.initElements(driver, this);
	}
	
	public AddNewServer openAddNewServerPage() {
		driver.get(props.getProperty("url")+"VpnServer/create");
		return new AddNewServer();
	}
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.01 -   Element of  Server Name   $$$$$$$$$$$$$$$$$$$$$
	 					* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
	
	//01. Element of Server Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement serverNameDaysElement;
	
	//01. Highlight the Server Name Input Field
	public void serverNameInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverNameDaysElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNameDaysElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverNameDaysElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", serverNameDaysElement);
			Thread.sleep(1000);
		}
	}
	
	//01. Type to the Server Name
	public AddPINValidity typeToserverNameInputField() throws InterruptedException {
		serverNameInputFieldHighlight();
		serverNameDaysElement.sendKeys("test");
		return new AddPINValidity();
	}
	
	/*************************************************************
     									* *****************************************************************************************
	 									* ************************    End No.02 - Element of Server Name    ***********************
	 									* * ***************************************************************************************
	 									************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.02 -   Element of  IP   $$$$$$$$$$$$$$$$$$$$$$$$$
						 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						 										*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//02. Element of IP
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/input")
	WebElement ipInputFieldElement;
	
	//02. Highlight the IP Input Field
	public void ipInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ipInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ipInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//02. Type to the IP Input Field
	public AddPINValidity typeToipInputField() throws InterruptedException {
		ipInputFieldHighlight();
		ipInputFieldElement.sendKeys("123.");
		return new AddPINValidity();
	}
	
	/*************************************************************
							* *****************************************************************************************
							* ************************    End No.01 - Element of IP Input Field   *********************
							* * ***************************************************************************************
							************************************************************************************************************************/
	
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.03 -   Element of  IP Range Input Field   $$$$$$$
	 					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 															 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//03. Element of IP Range
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[3]/div/input[2]")
	WebElement ipRangeInputFieldElement;
	
	//03. Highlight the IP Range Input Field
	public void ipRangeInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ipRangeInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipRangeInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ipRangeInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", ipRangeInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//03. Type to the IP Input Field
	public AddPINValidity typeToipRangeInputField() throws InterruptedException {
		ipRangeInputFieldHighlight();
		ipRangeInputFieldElement.sendKeys("123.");
		return new AddPINValidity();
	}
	
	/*************************************************************
										* *****************************************************************************************
										* ************************    End No.03 - Element of IP Input Field   *********************
										* * ***************************************************************************************
										************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.04 -   Element of  Path Input Field   $$$$$$$$$$
		 				 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
												 *				 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//04. Element of Path Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/input")
	WebElement pathInputFieldElement;
	
	//04. Highlight the Path Input Field
	public void pathInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pathInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', '');", pathInputFieldElement);
			Thread.sleep(1000);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", pathInputFieldElement);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style', '');", pathInputFieldElement);
			Thread.sleep(1000);
		}
	}
	
	//04. Type to the IP Input Field
	public AddPINValidity typeTopathInputField() throws InterruptedException {
		pathInputFieldHighlight();
		pathInputFieldElement.sendKeys("test");
		return new AddPINValidity();
	}
	
	/*************************************************************
										* *****************************************************************************************
										* ************************    End No.04 - Element of Path Input Field   *******************
										* * ***************************************************************************************
										************************************************************************************************************************/
	
	/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.05 -   Element of Capacity Input Field   $$$$$$$$
		 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							 									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	//05. Element of Capacity Input Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[4]/div/input")
	WebElement capacityInputFieldElement;
	
	//05. Highlight the Capacity Input Field
	public void capacityInputFieldHighlight() throws InterruptedException {
		if (driver instanceof JavascriptExecutor) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", capacityInputFieldElement);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', '');", capacityInputFieldElement);
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", capacityInputFieldElement);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', '');", capacityInputFieldElement);
		Thread.sleep(1000);
		}
	}
	
	//05. Type to the Capacity Input Field
	public AddPINValidity capacityTopathInputField() throws InterruptedException {
		capacityInputFieldHighlight();
		pathInputFieldElement.sendKeys("80");
		return new AddPINValidity();
	}
	
	/*************************************************************
										* *****************************************************************************************
										* ************************    End No.05 - Element of Capacity Input Field   ***************
										* * ***************************************************************************************
										************************************************************************************************************************/
	
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.06 -   Element of Country Input Field   $$$$$$$$$
							 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			 														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//06. Element of Country Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/select")
		WebElement countryInputFieldElement;
		
		//06. Highlight the Country Input Field
		public void countrySelectFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", countryInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", countryInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", countryInputFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", countryInputFieldElement);
				Thread.sleep(1000);
			}
		}
		
		//06. Type to the Country Input Field
		public AddPINValidity countrySelectField() throws InterruptedException {
			countrySelectFieldHighlight();
			Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[6]/div/select")));
			drp.selectByIndex(8);
			return new AddPINValidity();
		}
		
		/*************************************************************
											* *****************************************************************************************
											* ************************    End No.06 - Element of Country Select Field   ***************
											* * ***************************************************************************************
											************************************************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.07 -   Element of City Input Field   $$$$$$$$$$$$
							 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			 														*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//07. Element of City Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[7]/div/input")
		WebElement cityInputFieldElement;
		
		//07. Highlight the City Input Field
		public void cityInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", cityInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", cityInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", cityInputFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", cityInputFieldElement);
				Thread.sleep(1000);
			}
		}
		
		//07. Type to the City Input Field
		public AddPINValidity typeToCityInputField() throws InterruptedException {
			cityInputFieldHighlight();
			cityInputFieldElement.sendKeys("80");
			return new AddPINValidity();
		}
		
		/*************************************************************
								* *****************************************************************************************
								* ************************    End No.07 - Element of City Input Field   *******************
								* * ***************************************************************************************
								************************************************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.08 -   Element of City Input Field   $$$$$$$$$$$$
		 					 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																	 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//08. Element of Location Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[8]/div/input[1]")
		WebElement locationInputFieldElement;
		
		//08. Highlight the Location Input Field
		public void locationInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", locationInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", locationInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", locationInputFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", locationInputFieldElement);
				Thread.sleep(1000);
			}
		}
		
		//08. Type to the Location Input Field
		public AddPINValidity typeToLocationInputField() throws InterruptedException {
			locationInputFieldHighlight();
			locationInputFieldElement.sendKeys("80");
			return new AddPINValidity();
		}
		
		/*************************************************************
											* *****************************************************************************************
											* ************************    End No.08 - Element of Location Input Field   ***************
											* * ***************************************************************************************
											************************************************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.09 -   Element of Order Priority Input Field   $$
		 				* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
											 					*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//09. Element of Order Priority Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[9]/div/input")
		WebElement orderPriorityInputFieldElement;
		
		//09. Highlight the Location Input Field
		public void orderPriorityInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", orderPriorityInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", orderPriorityInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", orderPriorityInputFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", orderPriorityInputFieldElement);
				Thread.sleep(1000);
			}
		}
		
		//09. Type to the Location Input Field
		public AddPINValidity typeToOrderPriorityInputField() throws InterruptedException {
			orderPriorityInputFieldHighlight();
			orderPriorityInputFieldElement.sendKeys("80");
			return new AddPINValidity();
		}
		
		/*************************************************************
											* *****************************************************************************************
											* ************************    End No.09 - Element of Order Priority Input Field   *********
											* * ***************************************************************************************
													*************************************************************************************************************/
		
			/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						    * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
						    * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$    Start No.10 -   Element of Server Price Input Field   $$$$
						    * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							 									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

			//10. Element of Server Price Input Field
			@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[10]/div/input")
			WebElement serverPriceInputFieldElement;
			
			//10. Highlight the Location Input Field
			public void serverPriceInputFieldHighlight() throws InterruptedException {
				if (driver instanceof JavascriptExecutor) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverPriceInputFieldElement);
					Thread.sleep(1000);
					js.executeScript("arguments[0].setAttribute('style', '');", serverPriceInputFieldElement);
					Thread.sleep(1000);
					js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", serverPriceInputFieldElement);
					Thread.sleep(2000);
					js.executeScript("arguments[0].setAttribute('style', '');", serverPriceInputFieldElement);
					Thread.sleep(1000);
				}
			}
			
			//10. Type to the Server Price Input Field
			public AddPINValidity typeToServerPriceInputFieldElementInputField() throws InterruptedException {
				serverPriceInputFieldHighlight();
				serverPriceInputFieldElement.sendKeys("800");
				return new AddPINValidity();
			}
			
			/*************************************************************
										* *****************************************************************************************
										* ************************    End No.10 - Element of Server Price Input Field   ***********
										* * ***************************************************************************************
												*************************************************************************************************************/
			
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			    		* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			    		* $$$$$$$$$$$$$$$$$ Start No.11 -   Element of Server Upload WireGuard Config? Checkbox Field   $$$$$$$
			    		* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
				 												*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//11. Element of Upload WireGuard Config? Checkbox Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[11]/div/input")
		WebElement uploadWireGuardConfigCheckboxFieldElement;
		
		//11. Highlight the Location Input Field
		public void uploadWireGuardConfigCheckboxFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", uploadWireGuardConfigCheckboxFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", uploadWireGuardConfigCheckboxFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", uploadWireGuardConfigCheckboxFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", uploadWireGuardConfigCheckboxFieldElement);
				Thread.sleep(1000);
			}
		}
		
		//11. Type to the  Upload WireGuard Config? Checkbox Field
		public AddPINValidity clickToUploadWireGuardConfigCheckboxField() throws InterruptedException {
			uploadWireGuardConfigCheckboxFieldHighlight();
			uploadWireGuardConfigCheckboxFieldElement.click();
			return new AddPINValidity();
		}
		
		/*************************************************************
											* *********************************************************************************************************
											* ************************    End No.11 - Element of  Upload WireGuard Config? Checkbox Field   ***********
											* * *******************************************************************************************************
																	************************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$    Start No.12 -   Element of Wireguard File Input Field   $$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
							 									*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//12. Element of Wireguard File Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[12]/div/input")
		WebElement wireGurdFileInputFieldElement;

		//12. Highlight the Wireguard File Input Field
		public void  wireGurdFileInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", wireGurdFileInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", wireGurdFileInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", wireGurdFileInputFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", wireGurdFileInputFieldElement);
				Thread.sleep(1000);
			}
		}

		//12. Type to the Wireguard File Input Field
		public AddPINValidity wireGurdFilePriorityInputField() throws InterruptedException {
			wireGurdFileInputFieldHighlight();
			wireGurdFileInputFieldElement.sendKeys("C:\\Users\\rumyk\\Downloads\\SideStore.conf");
			return new AddPINValidity();
		}
		
		/*************************************************************
									* *****************************************************************************************
									* ************************    End No.12 - Element of Wireguard File Input Field   *********
									* * ***************************************************************************************
											*************************************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 									  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 									  * $$$$$$$$$$$$$$$$$ Start No.13 -   Element of Is Active Checkbox Field   $$$$$$$$$$$$$$$$$$$$$$
		 									  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
 																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//13. Element of Is Active Checkbox Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[13]/div/div/input")
		WebElement isActiveCheckboxFieldElement;
		
		//13. Highlight the Location Input Field
		public void isActiveCheckboxFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isActiveCheckboxFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", isActiveCheckboxFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isActiveCheckboxFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", isActiveCheckboxFieldElement);
				Thread.sleep(1000);
			}
		}
		
		//13. Type to the Is Active Checkbox Field
		public AddPINValidity clickTIsActiveCheckboxField() throws InterruptedException {
			isActiveCheckboxFieldHighlight();
			isActiveCheckboxFieldElement.click();
			return new AddPINValidity();
		}
		
		/*************************************************************
											* ****************************************************************************************************
											* ************************    End No.13 - Element of Is Active Checkbox Field   **********************
											* * **************************************************************************************************
																	************************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  									  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  									  * $$$$$$$$$$$$$$$$$  Start No.14 -   Element of OpenVPN Checkbox Field   $$$$$$$$$$$$$$$$$$$$$$
		  									  * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		  									  							*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//14. Element of OpenVPN Checkbox Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[14]/div/div/input")
		WebElement openVPNCheckboxFieldElement;
		
		//14. Highlight the Location Input Field
		public void openVPNCheckboxFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", openVPNCheckboxFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", openVPNCheckboxFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", openVPNCheckboxFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", openVPNCheckboxFieldElement);
				Thread.sleep(1000);
			}
		}
		
		//14. Type to the OpenVPN Checkbox Field
		public AddPINValidity clickTOpenVPNCheckboxField() throws InterruptedException {
			//openVPNCheckboxFieldHighlight();
			Thread.sleep(1000);
			openVPNCheckboxFieldElement.click();
			return new AddPINValidity();
		}
		
		/*************************************************************
											* ****************************************************************************************************
											* ************************    End No.14 - Element of OpenVPN Checkbox Field   **********************
											* * **************************************************************************************************
																		********************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 							* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
									* $$$$$$$$$$$$$$$$$$$$$$$$$    Start No.15 -   Element of Anyconnect Input Field   $$$$$$$$$$$$$$$$
									* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//15. Element of Anyconnect Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[15]/div/div/input")
		WebElement anyconnectInputFieldElement;
		
		//15. Highlight the Wireguard File Input Field
		public void  anyconnectInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", anyconnectInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", anyconnectInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", anyconnectInputFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", anyconnectInputFieldElement);
				Thread.sleep(1000);
			}
		}
		
		//15. Type to the Anyconnect Input Field
		public AddPINValidity anyconnectInputField() throws InterruptedException {
			anyconnectInputFieldHighlight();
			anyconnectInputFieldElement.click();
			return new AddPINValidity();
		}
		
		/*************************************************************
											* *****************************************************************************************
											* ************************    End No.15 - Element of Anyconnect Input Field   *************
											* * ***************************************************************************************
																	******************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$    Start No.16 -   Element of Shadowsock Input Field   $$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//16. Element of Shadowsock Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[16]/div/div/input")
		WebElement shadowsockInputFieldElement;
		
		//16. Highlight the Shadowsock File Input Field
		public void  shadowshockInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", shadowsockInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", shadowsockInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", shadowsockInputFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", shadowsockInputFieldElement);
				Thread.sleep(1000);
			}
		}
		
		//16. Type to the Shadowsock Input Field
		public AddPINValidity shadowsockInputField() throws InterruptedException {
			shadowshockInputFieldHighlight();
			shadowsockInputFieldElement.click();
			return new AddPINValidity();
		}
		
		/*************************************************************
											* *****************************************************************************************
											* ************************    End No.16 - Element of Shadowsock Input Field   *************
											* * ***************************************************************************************
																	 ******************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$    Start No.17 -   Element of SSH Input Field   $$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//17. Element of SSH Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[17]/div/div/input")
		WebElement SSHkInputFieldElement;

		//17. Highlight the SSH Input Field
		public void  SSHInputFieldHighlight() throws InterruptedException {
				if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", SSHkInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", SSHkInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", SSHkInputFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", SSHkInputFieldElement);
				Thread.sleep(1000);
			}
		}

		//17. Type to the SSH Input Field
		public AddPINValidity SSHInputField() throws InterruptedException {
			SSHInputFieldHighlight();
			SSHkInputFieldElement.click();
			return new AddPINValidity();
		}
		
		/*************************************************************
											* *****************************************************************************************
											* ************************    End No.17 - Element of SSH Input Field   ********************
											* * ***************************************************************************************
											 						 ******************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$    Start No.18 -   Element of WireGuard Input Field   $$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//18. Element of WireGuard Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[18]/div/div/input")
		WebElement wireGuardkInputFieldElement;
		
		//18. Highlight the SSH Input Field
		public void  wireGuardInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", wireGuardkInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", wireGuardkInputFieldElement);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", wireGuardkInputFieldElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", wireGuardkInputFieldElement);
				Thread.sleep(1000);
			}
		}

		//18. Type to the SSH Input Field
		public AddPINValidity typeToWireGuardInputField() throws InterruptedException {
			Thread.sleep(1000);
			//SSHInputFieldHighlight();
			wireGuardkInputFieldElement.click();
			return new AddPINValidity();
		}
		
		/*************************************************************
											* *****************************************************************************************
											* ************************    End No.18 - Element of WireGuard Input Field   **************
											* * ***************************************************************************************
					 						 						******************************************************************************************/
		
		/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 								* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$    Start No.19 -   Element of Is Free Checkbox Input Field   $$$$$$$$$$$$$$$$
										* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
																*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

		//19. Element of Is Free Checkbox Input Field
		@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[19]/div/div/input")
		WebElement isFreeInputCheckBox;
		
		//19. Highlight the Is Free Checkbox Input Field
		public void  isFreeCheckboxInputFieldHighlight() throws InterruptedException {
			if (driver instanceof JavascriptExecutor) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isFreeInputCheckBox);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', '');", isFreeInputCheckBox);
				Thread.sleep(1000);
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", isFreeInputCheckBox);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', '');", isFreeInputCheckBox);
				Thread.sleep(1000);
			}
		}
		
		//19. Type to the Is Free Checkbox Input Field
		public AddPINValidity clickToIsFreeCheckboxInputField() throws InterruptedException {
			Thread.sleep(1000);
			//SSHInputFieldHighlight();
			isFreeInputCheckBox.click();
			return new AddPINValidity();
		}
		
		/*************************************************************
											* *****************************************************************************************
											* ************************    End No.19 - Element of Is Free Checkbox Input Field   *******
											* * ***************************************************************************************
						 												******************************************************************************************/
	
}
