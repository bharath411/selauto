package com.qshore.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminProductsListPage {

	WebDriver driver = null;

	public AdminProductsListPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickCreateProductButton() {
		driver.findElement(By.cssSelector(".btn-primary")).click();
	}
}
