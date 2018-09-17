package com.qshore.testcases.withtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSearch2 {
	WebDriver driver = null;

	@BeforeMethod
	@Parameters(value="bb")
	public void launchBrowser(@Optional("firefox")String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\personal\\selenium-classes\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// Add implicite waits
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Launch the application -->
		driver.get("https://demo.opencart.com");
	}

	@Test
	public void searchTest() {
		driver.findElement(By.name("search")).sendKeys("iphone");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();

		driver.findElement(By.xpath("//img[@title='iPhone']")).click();

		String value = driver.findElement(By.xpath("//div[@id='content']//ul//h2")).getText();
		System.out.println(value);
	}

	@AfterMethod
	public void tearDown() {
		// driver.close();
		driver.quit();
	}

	@Test
	public void monitorsTest() {
		WebElement ele = driver.findElement(By.xpath("//a[text()='Components']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[contains( text(),'Monitors')]")).click();
	}

	
}
