package com.qshore.testcases.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.qshore.testcases.examples.Example1;

public class ArrExample {

	// @Test
	public void test1() {

		int i = 10;
		i = 20;

		// How to define them
		// How to read them

		int j[] = { 1, 2, 3, 4, 5 };

		System.out.println(j.length);

		String st[] = { "a", "bharath", "53" };

		System.out.println(st[0]);
		System.out.println(j[3]);

		int[] k = { 4, 3, 4, 3, 3, 6, 4 };
		for (int m = 0; m < k.length; m++) {
			System.out.println(k[m]);
		}
	}

	// @Test
	public void test2() {
		int i = 0;
		int j = 10;
		int k = j / i;
		System.out.println(k);
	}

	// @Test
	public void test3() {
		Example1 ex = null;
		ex.updateProduct();
	}

	// @Test
	public void test4() {
		try {
			int i[] = { 1, 23, 4, 2 };

			System.out.println(i[0]);
			System.out.println(i[3]);
			System.out.println(i[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Something went wrong");
		} finally {
			System.out.println("In finally block");
		}

	}

	// @Test
	public void test5() {
		try {
			File file = new File("D:\\bharath.txt");
			Thread.sleep(1000);
			int i[] = { 1, 23, 4, 2 };
			System.out.println(i[0]);
			System.out.println(i[3]);
			System.out.println(i[4]);
			FileInputStream fis = new FileInputStream(file);

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

	//@Test
	public void test6() {
		try {
			Thread.sleep(1000);
			int i[] = { 1, 23, 4, 2 };
			System.out.println(i[4]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sleep() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	//@Test
	public void test8() throws InterruptedException {
		sleep();
	}
	
	@Test
	public void test9() {
		
		int i[] = new int[4];
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		String st[] = new String[5];
	}
}
