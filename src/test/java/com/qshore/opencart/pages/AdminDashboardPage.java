package com.qshore.opencart.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qshore.opencart.testscripts.CreateProductTest;

public class AdminDashboardPage {
	
	private static Logger log = LogManager.getLogger(CreateProductTest.class);
	WebDriver driver = null;

	public AdminDashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	/*public void clickOnCategories() {
		driver.findElement(By.cssSelector("#menu-catalog a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
	}*/
	
	public void clickOnProducts() {
		log.info("I am in clickOnProducts method");
		driver.findElement(By.cssSelector("#menu-catalog a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}
	
	
	public void clickOnItem(String name) {
		driver.findElement(By.cssSelector("#menu-catalog a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]")).click();
	}
	
	
	
}
