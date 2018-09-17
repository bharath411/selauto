package com.qshore.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSearch2 {
	WebDriver driver = null;

	public void launchBrowser(String browser) {

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

	public void searchTest() {
		launchBrowser("chrome");
		driver.findElement(By.name("search")).sendKeys("iphone");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();

		driver.findElement(By.xpath("//img[@title='iPhone']")).click();

		String value = driver.findElement(By.xpath("//div[@id='content']//ul//h2")).getText();
		System.out.println(value);
		tearDown();
	}

	public void tearDown() {
		// driver.close();
		driver.quit();
	}

	public void monitorsTest() {
		launchBrowser("firefox");

		WebElement ele = driver.findElement(By.xpath("//a[text()='Components']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(ele).build().perform();

		driver.findElement(By.xpath("//a[contains( text(),'Monitors')]")).click();
		
		tearDown();
	}

	public static void main(String[] args) {
		TestSearch ts = new TestSearch();
		// ts.searchTest();
		ts.monitorsTest();
	}
}
