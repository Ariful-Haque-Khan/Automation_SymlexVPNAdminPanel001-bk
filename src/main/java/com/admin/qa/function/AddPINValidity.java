package com.admin.qa.function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.admin.qa.pages.EmailReport;
import com.crm.qa.base.TestBase;

public class AddPINValidity extends TestBase{
	public AddPINValidity(){
		PageFactory.initElements(driver, this);
	}
	
	
	public EmailReport openEmailListReport() {
		driver.get(props.getProperty("url")+"client/pinValidity");
		return new EmailReport();
	}
	
	//01. Element of Number of Days
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[1]/div/input")
	WebElement numberofDaysElement;
	
	//01. Type to the Number of Days
	public AddPINValidity typeToNumberofDays() {
		numberofDaysElement.sendKeys("1");
		return new AddPINValidity();
	}
	
	//2. Select from PIN Type Element
	public AddPINValidity typeelementDropDownField() throws InterruptedException {
		Select drp = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/select")));
		drp.selectByIndex(1);
		return new AddPINValidity(); 
	}
	
	//03. Element of Number of Days
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[1]/div[2]/div[3]/div/textarea")
	WebElement PINinCSVorNewLineElement;
	
	//03. Type to the Number of Days
	public AddPINValidity typeToPINinCSVorNewLine() {
		PINinCSVorNewLineElement.sendKeys("rumy1yr");
		return new AddPINValidity();
	}
	
	//04. Element of Form Submit Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/form/div/div[2]/input")
	WebElement submitButtonElement;
	
	//03. Type to the Number of Days
	public AddPINValidity clickOnSubmitButton() {
		submitButtonElement.click();
		return new AddPINValidity();
	}
}
