package com.qshore.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCategoriesListPage {

	WebDriver driver = null;

	public AdminCategoriesListPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickCreateCatButton() {
		driver.findElement(By.cssSelector(".btn-primary")).click();
	}
}
