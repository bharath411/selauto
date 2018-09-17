package com.qshore.testcases.sample;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExample1 {

	
	@BeforeMethod
	public void launchBrowser(){
		System.out.println("launching the browser");
	}
	@AfterMethod
	public void teardown() {
		System.out.println("Closing the browser");
	}
	@Test
	public void test1() {
		System.out.println("I am test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am test2");
		String expected = "abc";
		String actual = "xyz";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void test3() {
		System.out.println("I am test3");
	}
	@BeforeClass
	public void presetup() {
		System.out.println("In presetup");
	}
	
	@AfterClass
	public void postsetup() {
		System.out.println("In postsetup");
	}
}
