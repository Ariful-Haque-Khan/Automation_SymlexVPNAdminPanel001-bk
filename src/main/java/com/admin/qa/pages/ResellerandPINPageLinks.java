package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerandPINPageLinks extends TestBase{
	
	
	//1. Reseller & PIN
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement resellerPINDropdown;
	
	//2. Reseller
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[1]/a")
	WebElement resellerListPageLink;
	
	//3. Single PIN Element
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")
	WebElement singlePINListPageLink;
	
	//4. PIN Batch Element
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[3]/a")
	WebElement pinBatchListPageLink;
	
	//5. Add PIN Validity
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[4]/a")
	WebElement addPINValidityListPageLink;
	
	//6. Reseller Panel Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[5]/a")
	WebElement resellerPanelListsListPageLink;
	
	//7. All Reseller Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[6]/a")
	WebElement allResellerListPageLink;
	
	//8. Online PIN Activation Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[7]/a")
	WebElement onlinePINActivationListPageLink;
	
	//9. Online PIN Activation Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[8]/a")
	WebElement onlinePINActivation2ListPageLink;
	
	public ResellerandPINPageLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Reseller & PIN's Drop Down
	public PageLinks clickOnResellerDropDownLink() {
		resellerPINDropdown.click();
		return new PageLinks();
	}
	//02. Click on Reseller List page Link
	public PageLinks clickOnResellerLink() {
		resellerListPageLink.click();
		return new PageLinks();
	}
	
	//03. Click on Single PIN List page Link
	public PageLinks clickOnSInglePINLink() {
		singlePINListPageLink.click();
		return new PageLinks();
	}
	
	//04. Click on PIN Batch List page Link
	public PageLinks clickOnPINBatchLink() {
		pinBatchListPageLink.click();
		return new PageLinks();
	}
	
	//05. Click on Add PIN Validity page Link
	public PageLinks clickOnAddPINValidityLink() {
		addPINValidityListPageLink.click();
		return new PageLinks();
	}
	
	//06. Click on Reseller Panel Lists page Link
	public PageLinks clickOnResellerPanelListsLink() {
		resellerPanelListsListPageLink.click();
		return new PageLinks();
	}
	
	//07. Click on All Reseller Lists page Link
	public PageLinks clickOnAllResellerListPageLinkListsLink() {
		allResellerListPageLink.click();
		return new PageLinks();
	}
	
	//08. Click on Online PIN Activation List PageLink Lists page Link
	public PageLinks clickOnOnlinePINActivationListPageLinkListsLink() {
		onlinePINActivationListPageLink.click();
		return new PageLinks();
	}
	
	//09. Click on Online PIN Activation List PageLink Lists page Link
	public PageLinks clickOnOnlinePINActivation2ListPageLinkListsLink() {
		onlinePINActivation2ListPageLink.click();
		return new PageLinks();
	}
}
