package com.qshore.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAddAddress {

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
	
	public void tearDown() {
		// driver.close();
		driver.quit();
	}

	
	public void verifyAddress() {
		
		launchBrowser("firefox");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		//Login
		String email = "bharath.selenium26@gmail.com";
		String password = "selenium123";
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Click on Address book
		driver.findElement(By.xpath("//a[text()='Address Book']")).click();
		
		driver.findElement(By.xpath("//a[text()='New Address']")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("abc");
		driver.findElement(By.id("input-lastname")).sendKeys("xyz");
		driver.findElement(By.id("input-address-1")).sendKeys("gachibowli");
		driver.findElement(By.id("input-city")).sendKeys("hyderabad");
		driver.findElement(By.id("input-postcode")).sendKeys("500032");
		
		//Selecting an option from drop down.
		
		WebElement countrySelectEle = driver.findElement(By.id("input-country"));
		
		Select select = new Select(countrySelectEle);
		select.selectByVisibleText("India");
		
		driver.navigate().refresh();
		
		WebElement selectState =  driver.findElement(By.id("input-zone"));
		Select selectEle = new Select(selectState);
		selectEle.selectByValue("4231");
		
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
	}
	
	public static void main(String[] args) {
		TestAddAddress add = new TestAddAddress();
		add.verifyAddress();
	}
	
	

}
