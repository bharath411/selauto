package com.qshore.opencart.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminProductsAddPage {

	WebDriver driver = null;

	public AdminProductsAddPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createProduct(String productName, String metaTitle, String metaDisc) {

		driver.findElement(By.id("input-name1")).sendKeys(productName);
		driver.findElement(By.id("input-meta-title1")).sendKeys(metaTitle);
		driver.findElement(By.id("input-meta-description1")).sendKeys(metaDisc);

		driver.findElement(By.cssSelector(".btn-primary")).click();
	}

	public String getMessage() {
		return driver.findElement(By.cssSelector(".alert-danger")).getText();
	}
}
