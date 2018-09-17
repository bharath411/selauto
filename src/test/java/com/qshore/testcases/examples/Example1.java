package com.qshore.testcases.examples;

import org.testng.annotations.Test;

public class Example1 {

	@Test(priority=1)
	public void login() {
		System.out.println("In login");
	}
	
	@Test(priority=2)
	public void verifyProduct() {
		System.out.println("In verifyProduct");
	}
	
	@Test(priority=2)
	public void updateProduct() {
		System.out.println("In updateProduct");
	}
	
	@Test(priority=3)
	public void logout() {
		System.out.println("In logout");
	}
	
	@Test
	public void sample() {
		System.out.println("sample");
	}
}
