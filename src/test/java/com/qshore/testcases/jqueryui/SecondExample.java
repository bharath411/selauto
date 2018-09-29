package com.qshore.testcases.jqueryui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondExample {

	
	ChromeDriver driver = null;
	String url = "https://web.tie1.eu1.social.dynamics.com/app/33843/";
	
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
	
	@Test
	public void test1() {
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bharath");
		
	}
}
