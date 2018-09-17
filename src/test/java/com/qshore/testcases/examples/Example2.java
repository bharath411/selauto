package com.qshore.testcases.examples;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example2 {

	
	@Test(enabled=false)
	public void test1() {
		System.out.println("I am test1");
	}
	
	@Test()
	public void test2() {
		System.out.println("I am test2");
		String expected = "abc";
		String actual = "xyz";
		Assert.assertEquals(actual, expected);
	}
}
