package com.qshore.opencart.commons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHandler {
	
	WebDriver driver = null;
	public ScreenshotHandler(WebDriver driver){
		this.driver = driver;
	}
	public void capture(String filename) {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File ph = new File(filename);
		try {
			FileUtils.copyFile(source, ph);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
