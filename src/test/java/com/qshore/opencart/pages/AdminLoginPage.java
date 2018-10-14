package com.qshore.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {

	WebDriver driver = null;

	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void login(String user, String pass) {
		WebElement usernameEle = driver.findElement(By.id("input-username"));
		usernameEle.clear();
		usernameEle.sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("admin");

		driver.findElement(By.cssSelector(".btn-primary")).click();
	}
}
