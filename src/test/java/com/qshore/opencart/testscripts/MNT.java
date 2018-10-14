package com.qshore.opencart.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MNT extends BaseTestCase {

	
	public void test2() {
		
		String expected = langProps.getValue("dashboard");
		driver.getPageSource();
		System.out.println(expected);
		String text = langProps.getValue("dashboard");
		String xpath = "//span[contains(text(),'"+text+"')]";
		WebElement ele = driver.findElement(By.cssSelector(".ms-crm-CommandBar-Menu"));
		String actual = ele.getText();
		
	}
}
