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
import com.admin.qa.function.AdBannerListElement;
import com.admin.qa.function.AddNewAdminPanelElement;
import com.admin.qa.function.AppCrcBlockListElement;
import com.admin.qa.function.CampaignModuleElement;
import com.admin.qa.function.AddNewEventCode;
import com.admin.qa.function.IPListElement;
import com.admin.qa.function.IpBundleElement;
import com.admin.qa.function.AddNewMenuPermission;
import com.admin.qa.function.NoticeForUsersElement;
import com.admin.qa.function.AddNewPaymentMethod;
import com.admin.qa.function.SubscriptionCodesElement;
import com.admin.qa.function.ResellerClient_AffiliatorClientElement;
import com.admin.qa.function.AddNewRole;
import com.admin.qa.function.ServerModuleElement;
import com.admin.qa.function.WebsiteFormRequestElement;
import com.admin.qa.function.AddNewSignUpBlacklistDomain;
import com.admin.qa.function.AddPINJail;
import com.admin.qa.function.AddPINValidity;
import com.admin.qa.function.PushTemplateListElement;
import com.admin.qa.function.AddServerLockSchedule;
import com.admin.qa.function.AddSubEventCode;
import com.admin.qa.function.AppListElement;
import com.admin.qa.function.NewAdminCreation;
import com.admin.qa.function.NewCustomizeResellerPanel;
import com.admin.qa.function.OnlinePINActivation;
import com.admin.qa.function.OnlinePINMigration;
import com.admin.qa.function.ProfileInformation;
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
	
	public ResellerClient_AffiliatorClientElement addNewResellerClientLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ResellerClient_AffiliatorClientElement(); //HomePage is the landing page for LoginPage
	}
	
	public NewCustomizeResellerPanel customPanelNameLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new NewCustomizeResellerPanel(); //HomePage is the landing page for LoginPage
	}
	
	public ServerModuleElement addNewServerLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ServerModuleElement(); // Add New Server page for LoginPage
	}
	
	public AppListElement createNewAppLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AppListElement(); // Add New Server page for LoginPage
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
    
    public PushTemplateListElement addPushTemplateLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new PushTemplateListElement(); // Login form Push Automation Form page
	}
    
    public NoticeForUsersElement addNewNoticeLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new NoticeForUsersElement(); // Login form Push Automation Form page
	}
    
    public AdBannerListElement addNewBannerLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AdBannerListElement(); // Login form Add New Banner Form page
	}
    
    public AddNewRatePlan addNewRatePlanLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewRatePlan(); // Login form Add New Banner Form page
	}

	public IPListElement addNewIPLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new IPListElement(); //Login form Add New IP Form page
	}
	
	public CampaignModuleElement addNewCampaignLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new CampaignModuleElement(); //Login form Add New Campaign Form page
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
	
	public AddNewMenuPermission addNewMenuPermissionLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewMenuPermission(); //Login form Add New Role Form page
	}
	
	public AddNewSignUpBlacklistDomain addNewSignUpBlacklistDomainLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewSignUpBlacklistDomain(); //Login form Add New Role Form page
	}
	
	public AppCrcBlockListElement addNewBlockAppCRCLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AppCrcBlockListElement(); //Login form Add New Role Form page
	}
	
   public ProfileInformation profileInformationLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new ProfileInformation(); //Login form Add New Role Form page
	}
   
   public AddNewEventCode addNewEventCodeLogin(String uname , String pwd) {
		
 		username.sendKeys(uname);
 		password.sendKeys(pwd);
 		loginBtn.click();
 		
 		return new AddNewEventCode(); //Login form Add New Role Form page
 	}
     
   public AddSubEventCode addSubEventCodeLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddSubEventCode(); //Login form Add New Role Form page
	}
   
   public WebsiteFormRequestElement websiteFormRequestLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new WebsiteFormRequestElement(); //Login form Add New Role Form page
	}
   
   public IpBundleElement ipBundleElementLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new IpBundleElement(); //Login form Add New IP BundleForm page
	}
   
   public AddServerLockSchedule addServerLockScheduleLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddServerLockSchedule(); //Login form Add Server Lock Schedule page 
	}
   
   public AddNewAdminPanelElement addNewAdminPanelElementLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new AddNewAdminPanelElement(); //Login form Add Server Lock Schedule page 
	}
   
   public SubscriptionCodesElement addNewPinBatchLogin(String uname , String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new SubscriptionCodesElement(); //Login form Add New PIN Batch page 
	}
}
