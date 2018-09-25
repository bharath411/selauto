package com.qshore.testcases.jqueryui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJuery {
	ChromeDriver driver = null;
	String url = "http://jqueryui.com/";
	
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
	public void testDroppable() {
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frameElement);
		
		String value = driver.findElement(By.xpath("//div[@id='draggable']")).getText();
		System.out.println(value);
		
		WebElement draggable =driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		
		Actions actions  = new Actions(driver);
		actions.dragAndDrop(draggable, droppable).build().perform();
		
		String ast = driver.findElement(By.id("droppable")).getText();
		System.out.println(ast);
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	}

}
