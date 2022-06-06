package com.admin.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ResellerAddFormValidationElement extends TestBase{
	
	
	//1. Reseller Section Drop Down
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[2]")
	WebElement resellerSectionDropdown;
	
	//2. Reseller Name
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[1]/div/input")
	WebElement resellerName;
	
	//3. Reseller List Page Link
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/ul/li[1]/a")
	WebElement resellerListPageLink;
	
	//4. Reseller Add Button in the Reseller Table List Page
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[2]/a[1]")
	WebElement resellerAddButtonintheResellerTableListPage;
	
	//5. Login User name Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[2]/div/input")
	WebElement loginUsernameElement;
	
	//6. Password Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/div/input")
	WebElement passwordElementPage;
	
	//7. Initial Balance Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[4]/div/input")
	WebElement initialBalanceElement;
	
	//8. Credit Limit Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[5]/div/input")
	WebElement  creditLimitElement;
	
	//9. IP Bundle Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[6]/div/select")
	WebElement ipBundleElement;
	
	//10. Rate Plan Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[8]/div/select")
	WebElement ratePlanElement;
	
	//11. PIN Reset Option Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[9]/div/select")
	WebElement pinResetOptionElement;
	
	//12. Reseller Panel Type Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[10]/div[1]/select")
	WebElement resellerPanelTypeElement;
	
	//13. App PIN Login Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[11]/div/select")
	WebElement appPINLoginElement;
	
	//14. Is Customize Panel Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[15]/div/select")
	WebElement isCustomizePanelElement;
	
	//15. Has Limit of PIN Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[17]/div/select")
	WebElement hasLimitofPINElement;
	
	//16. Type Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[1]/div/div[2]/div[19]/div[1]/select")
	WebElement typeElement;
			
	//17. Type Element
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/form/div[5]/input[3]")
	WebElement submitButtonElement;
	
	
	public ResellerAddFormValidationElement(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Reseller Section Drop Down
	public ResellerAddFormValidationElement resellerSectionDropdown() {
		resellerSectionDropdown.click();
		return new ResellerAddFormValidationElement();
	}
	
	//02. Type on Reseller Name
	public ResellerAddFormValidationElement typeonResellerName() {
		resellerName.sendKeys("Asgar Tempo");
		return new ResellerAddFormValidationElement();
	}
	
	//03. Click on Reseller List Page Link
	public SearchandFilterSectionInResellerPage resellerListPageLink() {
		resellerListPageLink.click();
		return new SearchandFilterSectionInResellerPage();
	}
	
	//04. Click on Reseller Add Button in the Reseller Table List Page
	public SearchandFilterSectionInResellerPage clickonResellerAddButtonintheResellerTableListPage() {
		resellerAddButtonintheResellerTableListPage.click();
		return new SearchandFilterSectionInResellerPage();
	}
	
	//05. Type on Login User Name
	public SearchandFilterSectionInResellerPage typeonLoginUsername() {
		loginUsernameElement.sendKeys("");
		return new SearchandFilterSectionInResellerPage();
	}
	
	//06. Type on Password
	public SearchandFilterSectionInResellerPage typeonPassword() {
		passwordElementPage.sendKeys("AsgarTempo123@");
		return new SearchandFilterSectionInResellerPage();
	}
	
	//07. Type on Initial Balance
	public SearchandFilterSectionInResellerPage typeonInitialBalance() {
		initialBalanceElement.sendKeys("123");
		return new SearchandFilterSectionInResellerPage();
	}
	
	//08. Type on Credit Limit
	public SearchandFilterSectionInResellerPage typeonCreditLimit() {
		creditLimitElement.sendKeys("450");
		return new SearchandFilterSectionInResellerPage();
	}
	
	//09. Select IP Bundle
	public SearchandFilterSectionInResellerPage selectIPBundle() {
		Select dropdown = new Select(ipBundleElement);
		dropdown.selectByIndex(1);
		//passwordElementPage.sendKeys("Test Reseller");
		return new SearchandFilterSectionInResellerPage();
	}
	
	//10. Select Rate Plan
	public SearchandFilterSectionInResellerPage selectRatePlan() {
		Select dropdown = new Select(ratePlanElement);
		dropdown.selectByIndex(1);
		return new SearchandFilterSectionInResellerPage();
	}
	
	//11. Select PIN Reset Option
	public SearchandFilterSectionInResellerPage selectPINResetOption() {
		Select dropdown = new Select(pinResetOptionElement);
		dropdown.selectByIndex(1);
		return new SearchandFilterSectionInResellerPage();
	}
	
	//12. Select Reseller Panel Type
	public SearchandFilterSectionInResellerPage selectResellerPanelType() {
		Select dropdown = new Select(resellerPanelTypeElement);
		dropdown.selectByIndex(1);
		return new SearchandFilterSectionInResellerPage();
	}
	
	//13. Select on App PIN Login
	public SearchandFilterSectionInResellerPage typeonAppPINLogin() {
		Select dropdown = new Select(appPINLoginElement);
		dropdown.selectByIndex(1);
		return new SearchandFilterSectionInResellerPage();
	}
	
	//14. Select on Is Customize Panel
	public SearchandFilterSectionInResellerPage typeonIsCustomizePanel() {
		Select dropdown = new Select(isCustomizePanelElement);
		dropdown.selectByIndex(1);
		return new SearchandFilterSectionInResellerPage();
	}
	
	//15. Select Has Limit of PIN
	public SearchandFilterSectionInResellerPage selectHasLimitofPIN() {
		Select dropdown = new Select(hasLimitofPINElement);
		dropdown.selectByIndex(1);
		return new SearchandFilterSectionInResellerPage();
	}
	
	//16. Type on Type
	public SearchandFilterSectionInResellerPage typeonType() {
		typeElement.sendKeys("Test Reseller");
		return new SearchandFilterSectionInResellerPage();
	}
	
	//17. Type on Type
	public SearchandFilterSectionInResellerPage formSubmiton() {
		submitButtonElement.click();
		return new SearchandFilterSectionInResellerPage();
	}
	
}
