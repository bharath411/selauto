package com.qshore.opencart.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.qshore.java.examples.BrowserNames;
import com.qshore.opencart.commons.CustomListener;
import com.qshore.opencart.commons.ExcelHandler;
import com.qshore.opencart.commons.LanguageProperties;
import com.qshore.opencart.commons.PropertiesHandler;
@Listeners(value=CustomListener.class)
public class BaseTestCase {


	protected static WebDriver driver = null;
	String url = "";
	String browser = "";
	String language="";
	public ExcelHandler excelHandler = null;
	public PropertiesHandler props = null;
	public LanguageProperties langProps = null;
	public static WebDriver getDriver() {
		return driver;
	}
	
	@BeforeSuite
	public void beforeSuite() {
		excelHandler = new ExcelHandler();
		props = new PropertiesHandler();
		url = props.getValue("appurl");
		browser = props.getValue("browser");
		language = props.getValue("language");
		langProps= new LanguageProperties(language);
	}
	@BeforeMethod
	public void init() {
		BrowserNames b  = BrowserNames.fromString(browser);
		switch (b) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case firefox:
			System.setProperty("webdriver.gecko.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
			driver = new FirefoxDriver();
			break;
		case IE:
			System.setProperty("webdriver.ie.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			break;
		case SAFARI:
			System.setProperty("webdriver.safari.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
			driver = new SafariDriver();
			break;
		default:
			Assert.fail("Browser not matches");
			break;
		}
		if(browser.equals("chrome")) {
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
}
