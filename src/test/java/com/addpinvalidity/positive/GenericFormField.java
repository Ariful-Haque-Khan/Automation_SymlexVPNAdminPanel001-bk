/*
 * @author: Md. Abdullah Al Rumy, 
 * @company: Kolpolok Limited.
*/

package com.addpinvalidity.positive;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.admin.qa.function.AddPINValidity;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TestingPro;
import com.crm.qa.util.TestUtils;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;

public class GenericFormField extends TestBase{
	
	 private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
	  private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
	  private static final String TOKENS_DIRECTORY_PATH = "tokens";

	  /**
	   * Global instance of the scopes required by this quickstart.
	   * If modifying these scopes, delete your previously saved tokens/ folder.
	   */
	  private static final List<String> SCOPES =
	      Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
	  private static final String CREDENTIALS_FILE_PATH = "/credential_google_sheet_api.json";

	  /**
	   * Creates an authorized Credential object.
	   *
	   * @param HTTP_TRANSPORT The network HTTP Transport.
	   * @return An authorized Credential object.
	   * @throws IOException If the credentials.json file cannot be found.
	   */
	  private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT)
	      throws IOException {
	    // Load client secrets.
	    InputStream in = TestingPro.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
	    if (in == null) {
	      throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
	    }
	    GoogleClientSecrets clientSecrets =
	        GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

	    // Build flow and trigger user authorization request.
	    GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
	        HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
	        .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
	        .setAccessType("offline")
	        .build();
	    LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
	    return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
	  }
	
	
	LoginPage loginPage;

	TestUtils testUtils;
	AddPINValidity addPINValidity;
	
	//Initializing PageFactory
	public GenericFormField() {
		super();   //Call the Constructor of the Super class - TestBase
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtils = new TestUtils();
	}

	
	//@Test(priority=1)
	@Ignore
	public void showingWhetherFrontEndValidationfortheNumberofDaysFieldorNot() throws IOException, InterruptedException {
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password"));
		addPINValidity.openAddPINvalidityReport();/*open the Add PIN Validity Page.*/
		addPINValidity.clickOnSubmitButton();/* click on the Pop Up No Button */
		//addPINValidity.getTextofNumberofDaysValidationText();
		Assert.assertEquals(addPINValidity.getTextofNumberofDaysValidationText(), "This field is required.");
	}
	
	//@Test(priority=1)
	//@Ignore
	public void showingWhetherFrontEndValidationforthePINinCSVorNewLineFieldorNot() throws IOException, InterruptedException {
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password"));
		addPINValidity.openAddPINvalidityReport();/*open the Add PIN Validity Page.*/
		addPINValidity.clickOnSubmitButton();/* click on the Pop Up No Button */
		Assert.assertEquals(addPINValidity.getTextofPINinCSVorNewLineValidationText(), "This field is required.");
	}
	
	//@Test(priority=1)
	@Ignore
	public void checktheResultbyputtingDataContainIntergerValuefortheNumberofDays_TC_SAD_APV_P003() throws IOException, InterruptedException, GeneralSecurityException {
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password"));	
		// Build a new authorized API client service.
	    final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
	    final String spreadsheetId = "1JEEXR4f8gOM0htUV8PYFUfqVKjsZWQAFeSI1Lv-442g";
	    final String range = "DatasheetforAddPINValidity!A2:A4";
	    Sheets service =
	        new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
	            .setApplicationName(APPLICATION_NAME)
	            .build();
	    ValueRange response = service.spreadsheets().values()
	        .get(spreadsheetId, range)
	        .execute();
	    //System.out.println(response.getValues());
	    List<List<Object>> values = response.getValues();
	    int i=1;
	    //System.out.println((CharSequence[]) (values.get(i-1).get(0)));
	    try {
		    for (List row : values) {
		    	i++;
		    	addPINValidity.openAddPINvalidityReport();/*open the Add PIN Validity Page.*/
		    	System.out.println("hello...");
				addPINValidity.typeToNumberofDaysWithParam((String) values.get(i-1).get(0));/*Type in the PIN Type Input Field.*/
				System.out.println("hello...");
				addPINValidity.typeToPINinCSVorNewLine();/*Type in the PIN in CSV or New Line Input Field.*/
				addPINValidity.clickOnSubmitButton();/* click on the Pop Up No Button */
				addPINValidity.clickPopUpYesButton();/* click on the Pop Up Yes Button */
				Assert.assertEquals(addPINValidity.getTextofMessageafterSuccessfullyaddpinValidity(), "Success! Validity has been increase successful for 1pin");
		    	//System.out.println(values.get(i-1).get(0));
		    }
	    }catch (Exception e) {
	        System.out.println(e);
	    }
	}
	
	@Test(priority=1)
	//@Ignore
	public void checktheresultbyputtingdatacontainfractionalvaluefortheNumberofDaysField_TC_SAD_APV_N004() throws IOException, InterruptedException, GeneralSecurityException {
		addPINValidity = loginPage.addPINValidityLogin(props.getProperty("username"),props.getProperty("password"));	
		// Build a new authorized API client service.
	    final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
	    final String spreadsheetId = "1JEEXR4f8gOM0htUV8PYFUfqVKjsZWQAFeSI1Lv-442g";
	    final String range = "DatasheetforAddPINValidity!A6:A8";
	    Sheets service =
	        new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
	            .setApplicationName(APPLICATION_NAME)
	            .build();
	    ValueRange response = service.spreadsheets().values()
	        .get(spreadsheetId, range)
	        .execute();
	    //System.out.println(response.getValues());
	    List<List<Object>> values = response.getValues();
	    int i=1;
	    //System.out.println((CharSequence[]) (values.get(i-1).get(0)));
	    try {
		    for (List row : values) {
		    	i++;
		    	addPINValidity.openAddPINvalidityReport();/*open the Add PIN Validity Page.*/
				addPINValidity.typeToNumberofDaysWithParam((String) values.get(i-1).get(0));/*Type in the PIN Type Input Field.*/
				addPINValidity.typeToPINinCSVorNewLine();/*Type in the PIN in CSV or New Line Input Field.*/
				addPINValidity.clickOnSubmitButton();/* click on the Pop Up No Button */
				//addPINValidity.clickPopUpYesButton();/* click on the Pop Up Yes Button */
				Assert.assertEquals(addPINValidity.getFrontendNumberofDaysfornotnumberinaddpinvalidity(), "Please enter a value greater than or equal to 1.");
		    	//System.out.println(values.get(i-1).get(0));
		    }
	    }catch (Exception e) {
	        System.out.println(e);
	    }
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		super.tearDown();
	}*/

}
