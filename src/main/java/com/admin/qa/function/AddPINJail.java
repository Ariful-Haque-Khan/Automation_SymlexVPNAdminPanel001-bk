package com.admin.qa.function;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.admin.qa.pages.EmailReport;
import com.crm.qa.base.TestBase;

public class AddPINJail extends TestBase{
	public AddPINJail(){
		PageFactory.initElements(driver, this);
	}
	
	public EmailReport openAddPINJail() {
		driver.get(props.getProperty("url")+"client/addPinToSuspiciousBlockList");
		return new EmailReport();
	}
	
	//01. Element of PIN or Username
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[1]/div/textarea")
	WebElement pinorUsernameElement;
	
	//01. Type to the PIN or Username
	public AddPINJail typeToPINorUsernames() {
		pinorUsernameElement.sendKeys("1");
		return new AddPINJail();
	}
	
	
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[1]/div[2]/div[2]/div/span")
	WebElement dropDownIPBundlemainSelect;
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement searchInDropDown;
	
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	WebElement valueForSearch;
	
	
	//2. Select from PIN Type Element
	public AddPINJail searchandtypeelementDropDownField() throws InterruptedException {
		dropDownIPBundlemainSelect.click();
		searchInDropDown.sendKeys("back");
		valueForSearch.click();
		return new AddPINJail(); 
	}
	
	//03. Element of Save Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div/div[2]/input[3]")
	WebElement saveButtonElement;
	
	//03. Type to the Save Button
	public AddPINJail clickONSaveButton() {
		saveButtonElement.click();
		return new AddPINJail();
	}
}
