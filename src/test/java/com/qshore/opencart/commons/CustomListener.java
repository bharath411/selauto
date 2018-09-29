package com.qshore.opencart.commons;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qshore.opencart.testscripts.BaseTestCase;

public class CustomListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("My passed test case :" + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		WebDriver driver = BaseTestCase.getDriver();
		ScreenshotHandler sc = new ScreenshotHandler(driver);
		String methName = result.getMethod().getMethodName();
		sc.capture(methName+".jpeg");
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
