package com.qshore.opencart.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.qshore.opencart.commons.CustomListener;
@Listeners(value=CustomListener.class)
public class BaseTestCase {


	protected static WebDriver driver = null;
	String url = "https://demo.opencart.com/admin";


	public static WebDriver getDriver() {
		return driver;
	}
	@BeforeMethod
	public void init() {
		// Launching the browser : chrome
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
		driver = new ChromeDriver();

		// Add implicite waits
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Launch the application -->
		driver.get(url);
	}
}
