package com.qshore.testcases.carwale;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Carwale {
	WebDriver driver = null;
	String url = "https://www.carwale.com/";
	
	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void testExample() {
		
		driver.findElement(By.id("globalSearch")).sendKeys("mar");
		List<WebElement> ele = driver.findElements(By.xpath("//ul[contains(@class,'topSearchAutocomplete')]/li"));
		
		for (WebElement webElement : ele) {
			System.out.println(webElement.getText());
		}
		
		driver.get("");
		
		Navigation nav = driver.navigate();
		nav.to("");
		nav.refresh();
		nav.forward();
		nav.back();
		
		
		
		//driver.findElement(By.xpath(xpathExpression))
		driver.findElement(By.xpath("//ul[contains(@class,'topSearchAutocomplete')]/li[1]/a")).click();
		
		
		Actions actions = new Actions(driver);
		
		
	}

}
