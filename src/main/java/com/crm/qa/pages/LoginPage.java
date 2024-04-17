/*
 * @author: Naveen Kumar Rajashekar
 */
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.admin.qa.pages.ApplicationSectionLinks;
import com.admin.qa.pages.CampaignsSectionLinks;
import com.admin.qa.pages.PINsSectionLinks;
import com.admin.qa.pages.PaymentRecharge;
import com.admin.qa.pages.PushManagementSectionLinks;
import com.admin.qa.pages.RateSectionLinks;
import com.admin.qa.pages.ReportLog;
import com.admin.qa.pages.ReportsOfflinePINSectionLinks;
import com.admin.qa.pages.ResellerPanelSectionLinks;
import com.admin.qa.pages.ResellerReports;
import com.admin.qa.pages.ResellerRprtOnlinePINSectionLinks;
import com.admin.qa.pages.ResellerSectionLinks;
import com.admin.qa.pages.SSLCommerzTransaction;
import com.admin.qa.pages.SuccessStatusServerConnectionSection;
import com.admin.qa.pages.VPNServerSectionLinks;
import com.admin.qa.pages.UserPermissionSectionLinks;
import com.admin.qa.pages.IPManagementSectionLinks;
import com.admin.qa.pages.MailAddressSectionLinks;
import com.admin.qa.pages.OnlinePINReportsSectionLinks;
import com.admin.qa.function.AddNewBanner;
import com.admin.qa.function.AddNewCampaign;
import com.admin.qa.function.AddNewIP;
import com.admin.qa.function.AddNewNotice;
import com.admin.qa.function.AddNewPaymentMethod;
import com.admin.qa.function.AddNewResellerClient;
import com.admin.qa.function.AddNewRole;
import com.admin.qa.function.AddNewServer;
import com.admin.qa.function.AddPINJail;
import com.admin.qa.function.AddPINValidity;
import com.admin.qa.function.AddPushTemplate;
import com.admin.qa.function.CreateNewApp;
import com.admin.qa.function.NewAdminCreation;
import com.admin.qa.function.NewCustomizeResellerPanel;
import com.admin.qa.function.OnlinePINActivation;
import com.admin.qa.function.OnlinePINMigration;
import com.admin.qa.function.PushAutomationForm;
import com.admin.qa.function.SendBackgroundorSilentPushtoSinglePIN;
import com.admin.qa.function.SendPushtoUser;
import com.admin.qa.function.AddNewRatePlan;

import com.admin.qa.pages.AllLinksFromDB;
import com.crm.qa.base.TestBase;


public class LoginPage extends TestBase{
	
	//Load PageFactory(OR - Object Repository)
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="userPassword")
	WebElement password;
	
	//@FindBy(xpath="//input[@id='submit']")
	@FindBy(name="commit")
	//[@id="login_form"]/form/button
	WebElement loginBtn;
	
	@FindBy(name="Logout")
	WebElement logoutBtn;
	
	//Initializing PageFactory
	public LoginPage() {
		PageFactory.initElements(driver, this); //this --> points to current class object.
	}
	
	public String validateLoginPageTitle() {
		//System.out.print(driver.getTitle());
		return driver.getTitle(); 
	}
	
	public void openTheLink() {
		//driver.get(props.getProperty("url")+"campaign/campaignList");
		driver.get("google.com");
	}
	
	public HomePage login(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage(); //HomePage is the landing page for LoginPage
	}
	
	public CampaignsSectionLinks loginCampaignsSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new CampaignsSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public IPManagementSectionLinks loginPagelinkinIPManagement(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new IPManagementSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public MailAddressSectionLinks loginMailAddressSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new MailAddressSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public OnlinePINReportsSectionLinks loginOnlinePINReportSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new OnlinePINReportsSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public PINsSectionLinks loginPINsSectionLinksSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new PINsSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public ResellerSectionLinks loginResellerSectionLinksSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ResellerSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public RateSectionLinks loginRateSectionLinksSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new RateSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public ResellerPanelSectionLinks loginResellerPanelSectionLinksSectionLinksSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ResellerPanelSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public VPNServerSectionLinks loginResellerVPNServerSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new VPNServerSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public UserPermissionSectionLinks loginUserPermissionSectionLinksSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new UserPermissionSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public PushManagementSectionLinks loginPushManagementSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new PushManagementSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public ApplicationSectionLinks loginApplicationSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ApplicationSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public ApplicationSectionLinks logoutApplicationSuccessStatusSectionLinks() {
		logoutBtn.click();		
		return new ApplicationSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public ResellerRprtOnlinePINSectionLinks loginResellerRprtOnlinePINSuccessStatusSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ResellerRprtOnlinePINSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public ReportsOfflinePINSectionLinks loginReportsOfflinePINSectionLinks(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ReportsOfflinePINSectionLinks(); //HomePage is the landing page for LoginPage
	}
	
	public AllLinksFromDB AllLinksFromDBStatus(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AllLinksFromDB(); //HomePage is the landing page for LoginPage
	}
	
	public ResellerReports ResellerReportsLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ResellerReports(); //HomePage is the landing page for LoginPage
	}
	
	public SSLCommerzTransaction SSLCommerzTransactionLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new SSLCommerzTransaction(); //HomePage is the landing page for LoginPage
	}
	
	public PaymentRecharge PaymentRechargeLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new PaymentRecharge(); //HomePage is the landing page for LoginPage
	}
	
	public SuccessStatusServerConnectionSection SuccessStatusServerConnectionSectionLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new SuccessStatusServerConnectionSection(); //HomePage is the landing page for LoginPage
	}
	
	public ReportLog ReportLogLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ReportLog(); //HomePage is the landing page for LoginPage
	}
	
	public AddPINValidity addPINValidityLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddPINValidity(); //HomePage is the landing page for LoginPage
	}
	
	public OnlinePINActivation onlinePINActivationLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new OnlinePINActivation(); //HomePage is the landing page for LoginPage
	}
	
	public OnlinePINMigration onlinePINMigrationLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new OnlinePINMigration(); //HomePage is the landing page for LoginPage
	}
	
	public AddPINJail addPINJailLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddPINJail(); //HomePage is the landing page for LoginPage
	}
	
	public SendBackgroundorSilentPushtoSinglePIN sendBackgroundorSilentPushtoSinglePINLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new SendBackgroundorSilentPushtoSinglePIN(); //HomePage is the landing page for LoginPage
	}
	
	public AddNewResellerClient addNewResellerClientLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewResellerClient(); //HomePage is the landing page for LoginPage
	}
	
	public NewCustomizeResellerPanel customPanelNameLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new NewCustomizeResellerPanel(); //HomePage is the landing page for LoginPage
	}
	
	public AddNewServer addNewServerLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewServer(); // Add New Server page for LoginPage
	}
	
	public CreateNewApp createNewAppLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new CreateNewApp(); // Add New Server page for LoginPage
	}
	
	public PushAutomationForm pushAutomationLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new PushAutomationForm(); // Login form Push Automation Form page
	}
	
    public SendPushtoUser sendPushtoUserLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new SendPushtoUser(); // Login form Push Automation Form page
	}
    
    public AddPushTemplate addPushTemplateLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddPushTemplate(); // Login form Push Automation Form page
	}
    
    public AddNewNotice addNewNoticeLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewNotice(); // Login form Push Automation Form page
	}
    
    public AddNewBanner addNewBannerLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewBanner(); // Login form Add New Banner Form page
	}
    
    public AddNewRatePlan addNewRatePlan(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewRatePlan(); // Login form Add New Banner Form page
	}

	public AddNewIP addNewIPLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewIP(); //Login form Add New IP Form page
	}
	
	public AddNewCampaign addNewCampaignLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewCampaign(); //Login form Add New Campaign Form page
	}
	
	public NewAdminCreation newAdminCreationLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new NewAdminCreation(); //Login form New Admin Creation Form page
	}
	
	public AddNewRole addNewRoleLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewRole(); //Login form Add New Role Form page
	}
	
	public AddNewPaymentMethod addNewPaymentMethodLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewPaymentMethod(); //Login form Add New Role Form page
	}
	

	
    
}
