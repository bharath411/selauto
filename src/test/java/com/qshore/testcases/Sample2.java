package com.qshore.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Sample2 {

	
	@Test
	public void test1() {
		
		System.out.println("In test1");
		String gridUrl = "http://localhost:4444/wd/hub";
		URL url=null;
		try {
			url = new URL(gridUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ChromeOptions co = new ChromeOptions();
		co.setCapability("browserName", "chrome");
		WebDriver driver = new RemoteWebDriver(url,co);
		driver.get("http://localhost:4444/grid/console");
	}
	
	@Test
	public void test2() {
		
		System.out.println("In test1");
		String gridUrl = "http://localhost:4444/wd/hub";
		URL url=null;
		try {
			url = new URL(gridUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Capabilities cap = DesiredCapabilities.firefox();
		WebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("http://localhost:4444/grid/console");
	}
}
