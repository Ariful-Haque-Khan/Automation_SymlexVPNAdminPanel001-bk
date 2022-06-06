package com.admin.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SearchandFilterSectionInResellerPage extends TestBase{
	
	
	//1. Reseller Section Drop Down
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/a/span[2]")
	WebElement resellerSectionDropdown;
	
	//2. Reseller List Page Link
	@FindBy(xpath="/html/body/div[2]/aside/section/ul/li[4]/ul/li[1]/a")
	WebElement resellerListPageLink;
	
	//3. Login Search Field
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[1]/input")
	WebElement loginSearchField;
	
	//4. Search Button
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[1]/div[8]/a")
	WebElement searchButton;
	
	//5. Login Column of Reseller Table List 
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div[2]/div/div/form/div[2]/div/table")
	WebElement resellerTableListLogin;
	
	//6. Reseller Add Button in the Reseller Table List Page
	@FindBy(xpath="/html/body/div[2]/div/section[1]/div/div[2]/a[1]")
	WebElement resellerAddButtonintheResellerTableListPage;
	
	public SearchandFilterSectionInResellerPage(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Click on Reseller Section Drop Down
	public SearchandFilterSectionInResellerPage resellerSectionDropdown() {
		resellerSectionDropdown.click();
		return new SearchandFilterSectionInResellerPage();
	}
	
	//02. Click on Reseller List Page Link
	public SearchandFilterSectionInResellerPage resellerListPageLink() {
		resellerListPageLink.click();
		return new SearchandFilterSectionInResellerPage();
	}
	
	//03. Put Text on Login Search Field
	public SearchandFilterSectionInResellerPage loginSearchFieldElement() {
		loginSearchField.sendKeys("33339999999xxxxddddd1222.mahfuz4....@@@@!!.....#@");
		return new SearchandFilterSectionInResellerPage();
	}
	
	//04. Put Text on Login Search Field
	public SearchandFilterSectionInResellerPage searchButtonElement() {
		searchButton.click();
		return new SearchandFilterSectionInResellerPage();
	}
	
	//05. Login Column of Reseller Table List
	public SearchandFilterSectionInResellerPage loginColumnofResellerTableList() {
		
		 List<WebElement> rowsList = resellerTableListLogin.findElements(By.tagName("tr"));

         List<WebElement> columnsList = null;

        for (WebElement row : rowsList) {
                System.out.println();
                columnsList = row.findElements(By.tagName("td"));

                 for (WebElement column : columnsList) {
                        System.out.print(column.getText() + ", ");
                }

        }
        return new SearchandFilterSectionInResellerPage();
	}
	
	//06. Click on Reseller Add Button in the Reseller Table List Page
	public SearchandFilterSectionInResellerPage clickonResellerAddButtonintheResellerTableListPage() {
		resellerAddButtonintheResellerTableListPage.click();
		return new SearchandFilterSectionInResellerPage();
	}
	
}
