/*
 * @author: Md.Abdullah Al Rumy
 */
package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtils;
import com.crm.qa.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties props;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	

	public TestBase() {

		try {
			props = new Properties();

			FileInputStream ip = new FileInputStream("E:\\selenium\\SymlexAdminPanel001\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			//C:\project\eclipse\SymlexResPanel001
			//E:\\selenium\\SymlexAdminPanel001
			props.load(ip);
			System.out.println(props.getProperty("url"));
			System.out.println(props.getProperty("browser"));
		}

		catch (FileNotFoundException ip) {
			ip.printStackTrace();
		}

		catch (IOException io) {
			io.printStackTrace();
		}

	}

	public void initialization() {
		if (props.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\jar_files\\chromedriver_win32\\103\\chromedriver.exe");
			driver = new ChromeDriver(); // launch chrome browser
		} else if (props.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"E:\\selenium\\SymlexAdminPanel001\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver(); // launch edge browser
			EdgeOptions options = new EdgeOptions();
			//capability = DesiredCapabilities.edge();
			
		} else if (props.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\eclipse\\geckodriver_v0_33_0\\geckodriver.exe");
			driver = new FirefoxDriver(); // launch firefox browser
		}
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of WebEventListener handler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		//Assign that to event listener driver to WebDriver.
		driver = e_driver;

		driver.manage().window().maximize(); // maximize the windows
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(props.getProperty("url"));

	}

	public void tearDown() {
		driver.quit();
	}

}
