package com.qshore.testcases;

import java.time.Instant;

import org.testng.annotations.Test;

public class Sample1 {

	
	@Test
	public void test1() {
		System.out.println("Started at test1-- " + System.currentTimeMillis());
		System.out.println(Instant.now());
		System.out.println("I am test1");
		sleep(5);
		System.out.println("Completed at test1-- " + Instant.now());
	}
	@Test
	public void test2() {
		System.out.println("Started at test2 -- " + System.currentTimeMillis());
		System.out.println(Instant.now());
		System.out.println("I am test2");
		sleep(15);
		System.out.println("Completed at test2-- " + Instant.now());
	}
	@Test
	public void test3() {
		System.out.println("Started at test3-- " + System.currentTimeMillis());
		System.out.println(Instant.now());
		System.out.println("I am test3");
		sleep(3);
		System.out.println("Completed at test3-- " + Instant.now());
	}
	
	@Test
	public void test4() {
		System.out.println("Started at test4-- " + System.currentTimeMillis());
		System.out.println(Instant.now());
		System.out.println("I am test4");
		sleep(10);
		System.out.println("Completed at test4 -- " + Instant.now());
	}
	
	
	public void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
