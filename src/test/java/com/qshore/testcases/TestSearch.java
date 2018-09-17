package com.qshore.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSearch {

	public void searchTest() {
		// Launching the browser : chrome
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Add implicite waits
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Launch the application -->
		driver.get("https://demo.opencart.com");

		driver.findElement(By.name("search")).sendKeys("iphone");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();

		driver.findElement(By.xpath("//img[@title='iPhone']")).click();

		String value = driver.findElement(By.xpath("//div[@id='content']//ul//h2")).getText();
		System.out.println(value);
		driver.close();
	}

	public void monitorsTest() {
		// Launching the browser : chrome
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Add implicite waits
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Launch the application -->
		driver.get("https://demo.opencart.com");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Components']"));

		Actions actions = new Actions(driver);
		
		actions.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("//a[contains( text(),'Monitors')]")).click();
	}
	
	public static void main(String[] args) {
		TestSearch ts = new TestSearch();
		//ts.searchTest();
		ts.monitorsTest();
	}

}
