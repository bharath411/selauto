package com.qshore.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDashboardPage {
	
	WebDriver driver = null;

	public AdminDashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	/*public void clickOnCategories() {
		driver.findElement(By.cssSelector("#menu-catalog a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
	}*/
	
	public void clickOnProducts() {
		driver.findElement(By.cssSelector("#menu-catalog a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}
	
	
	public void clickOnItem(String name) {
		driver.findElement(By.cssSelector("#menu-catalog a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]")).click();
	}
	
	
	
}
