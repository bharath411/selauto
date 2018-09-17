package com.qshore.testcases.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestExample2 {
	@BeforeClass
	public void presetup() {
		System.out.println("In presetup of testexample2");
	}
	
	@AfterClass
	public void postsetup() {
		System.out.println("In postsetup of testexample2");
	}
	@Test
	public void test1() {
		System.out.println("I am test1 of testexample2");
	}
	
	@Test
	public void test2() {
		System.out.println("I am test2 of testexample2");
	}
	
	@BeforeSuite
	public void firstMeth() {
		System.out.println("This should be first method to be executed");
	}
	
	@AfterSuite
	public void postMeth() {
		System.out.println("This should be last method to be executed");
	}
}
