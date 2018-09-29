package com.qshore.testcases.naukari;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NaukariTest {

	ChromeDriver driver = null;
	String url = "http://www.naukri.com/";

	@BeforeMethod
	public void init() {
		// Launching the browser : chrome
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
		driver = new ChromeDriver();

		// Add implicite waits
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Launch the application -->
		driver.get(url);
	}
	
	@Test
	public void verifyPopups() {
		
		String mainHandle = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());
		for (String handle : set) {
			if(!handle.equals(mainHandle)) {
				driver.switchTo().window(handle);
				
				String title = driver.getTitle();
				
				if(title.contains("Virtusa")) {
					driver.findElement(By.xpath("//img[@alt='Virtusa Corporation']")).click();
				}else {
					driver.close();
				}
				
			}
		}
		
		
		
		
		
		
	}

}
