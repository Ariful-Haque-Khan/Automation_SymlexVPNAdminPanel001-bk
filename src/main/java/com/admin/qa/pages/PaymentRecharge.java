package com.admin.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PaymentRecharge extends TestBase{
	
	public PaymentRecharge(){
		PageFactory.initElements(driver, this);
	}
	
	//01. Open URL of Receipt Report Link
	public PaymentRecharge openReceiptReport() {
		driver.get(props.getProperty("url")+"ResellerPaymentAndRechargeReports/transaction_report");
		return new PaymentRecharge();
	}
	
	//02. Open URL of Recharged Report Link
	public PaymentRecharge openRechargedReport() {
		driver.get(props.getProperty("url")+"ResellerPaymentAndRechargeReports/recharged_report");
		return new PaymentRecharge();
	}
	
	//03. Open URL of Balance Report Link
	public PaymentRecharge openBalanceRepoprt() {
		driver.get(props.getProperty("url")+"ResellerPaymentAndRechargeReports/balance_report");
		return new PaymentRecharge();
	}
	
}
