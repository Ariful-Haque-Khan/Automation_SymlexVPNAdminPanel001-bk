package com.admin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ResellerandPINPageLinks extends TestBase{
	
	
	//0. Reseller & PIN
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/a/span[1]")
	WebElement resellerPINDropdown;
	
	//1. Resellers
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[14]/a")
	WebElement resellersDropdown;
	
	//1222. pinListLinkTest
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[14]/ul/li[13]/a")
	WebElement pinListLinkTest;
	
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
	
	//10. Online PIN Migration Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[9]/a")
	WebElement onlinePINMigrationListPageLink;
	
	//11. Redcheck Pins Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[10]/a")
	WebElement redcheckPinsListPageLink;
	
	//12. Reseller Connected Users Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[11]/a")
	WebElement resellerConnectedUsersListPageLink;
	
	//13. Device Wise Reseller PINs Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[12]/a")
	WebElement deviceWiseResellerPINsListPageLink;
	
	//14. Suspicious Block PINs Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[13]/a")
	WebElement suspiciousBlockPINsListPageLink;
	
	//15. Return Pin Request Lists
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[3]/ul/li[14]/a")
	WebElement returnPinRequestListPageLink;
	
	public ResellerandPINPageLinks(){
		PageFactory.initElements(driver, this);
	}
	
	//00. Click on Reseller  Drop Down
	public ResellerandPINPageLinks clickOnResellerDropDownLinkNew() {
		resellersDropdown.click();
		return new ResellerandPINPageLinks();
	}
	
	//001122. Click on Reseller  Drop Down
	public ResellerandPINPageLinks clickOnPinListLinkTest() {
		pinListLinkTest.click();
		return new ResellerandPINPageLinks();
	}
	
	//01. Click on Reseller & PIN's Drop Down
	public ResellerandPINPageLinks clickOnResellerDropDownLink() {
		resellerPINDropdown.click();
		return new ResellerandPINPageLinks();
	}
	//02. Click on Reseller List page Link
	public ResellerandPINPageLinks clickOnResellerLink() {
		resellerListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//03. Click on Single PIN List page Link
	public ResellerandPINPageLinks clickOnSInglePINLink() {
		singlePINListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//04. Click on PIN Batch List page Link
	public ResellerandPINPageLinks clickOnPINBatchLink() {
		pinBatchListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//05. Click on Add PIN Validity page Link
	public PageLinks clickOnAddPINValidityLink() {
		addPINValidityListPageLink.click();
		return new PageLinks();
	}
	
	//06. Click on Reseller Panel Lists page Link
	public ResellerandPINPageLinks clickOnResellerPanelListsLink() {
		resellerPanelListsListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//07. Click on All Reseller Lists page Link
	public ResellerandPINPageLinks clickOnAllResellerListPageLinkListsLink() {
		allResellerListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//08. Click on Online PIN Activation List PageLink Lists page Link
	public ResellerandPINPageLinks clickOnOnlinePINActivationListPageLinkListsLink() {
		onlinePINActivationListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//09. Click on Online PIN Activation List PageLink Lists page Link
	public ResellerandPINPageLinks clickOnOnlinePINActivation2ListPageLinkListsLink() {
		onlinePINActivation2ListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//10. Click on Online PIN Migration List page Link
	public ResellerandPINPageLinks clickOnonlinePINMigrationLink() {
		onlinePINMigrationListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//11. Click on Redcheck Pins List page Link
	public ResellerandPINPageLinks clickOnRedcheckPinsLink() {
		redcheckPinsListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//12. Click on Reseller Connected Users page Link
	public ResellerandPINPageLinks clickOnResellerConnectedLink() {
		resellerConnectedUsersListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//13. Click on Device Wise Reseller PINs Lists page Link
	public ResellerandPINPageLinks clickOnDeviceWiseResellerListsLink() {
		deviceWiseResellerPINsListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//14. Click on Suspicious Block PINs Lists page Link
	public ResellerandPINPageLinks clickOnSuspiciousBlockPINsListPageLinkListsLink() {
		suspiciousBlockPINsListPageLink.click();
		return new ResellerandPINPageLinks();
	}
	
	//15. Click on Return Pin Request List PageLink Lists page Link
	public ResellerandPINPageLinks clickOnReturnPinRequestLinkListsLink() {
		returnPinRequestListPageLink.click();
		return new ResellerandPINPageLinks();
	}
}
