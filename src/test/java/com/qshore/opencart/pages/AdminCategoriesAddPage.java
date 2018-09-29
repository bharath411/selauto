package com.qshore.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCategoriesAddPage {
	
	WebDriver driver = null;
	public AdminCategoriesAddPage(WebDriver driver) {
		this.driver = driver;
	}
	public void addCategory() {

		driver.findElement(By.cssSelector("#input-name1")).sendKeys("cat2");
		driver.findElement(By.cssSelector("#input-meta-title1")).sendKeys("cat2 meta");
		driver.findElement(By.cssSelector(".btn-primary")).click();
	}
}
