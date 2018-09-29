package com.qshore.testcases.sample.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class TextFileOps {

	// @Test
	public void test1() {

		File file = new File("D:\\abc1.txt");

		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			boolean flag = true;
			String st = "";
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//@Test
	public void test2() {

		File file = new File("D:\\abc1.txt");

		try {

			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);

			int a = bis.read();
			System.out.println(a);
			char c = 0;

			boolean flag = true;
			while ((a = bis.read()) != -1) {
				c = (char) a;
				System.out.print(c);
			}
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void testwrite1() {
		
		File file = new File("D:\\out.txt");
		
		try {
			FileWriter writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			String st = "I am bharath";
			bw.write(st);
			bw.close();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void testwrite2() {
		
		File file = new File("D:\\out.txt");
		
		try {
			FileOutputStream writer = new FileOutputStream(file);
			BufferedOutputStream bw = new BufferedOutputStream(writer);
			String st = "My name is kristipati";
			byte[] bb = st.getBytes();
			bw.write(bb);
			bw.close();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
