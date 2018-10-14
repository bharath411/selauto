package com.qshore.opencart.pages;

import org.openqa.selenium.Alert;
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
	
	public void removeProduct() {
		driver.findElement(By.cssSelector(".btn-danger")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
}
