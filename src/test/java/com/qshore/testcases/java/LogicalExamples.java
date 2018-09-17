package com.qshore.testcases.java;

import org.testng.annotations.Test;

public class LogicalExamples {

	//@Test
	public void reverse_charAt() {
		String name= "bharath kumar reddy kristipati";
		int len= name.length();
		System.out.println(len);
		char c = name.charAt(0);
		System.out.println(c);
		c = name.charAt(10);
		System.out.println(c);
		String rev= "";
		for(int i = len-1 ; i>=0 ; i-- ) {
			c = name.charAt(i);
			rev = rev+ c;
		}
		System.out.println(rev);
	}
	
	
	//@Test
	public void reverse_chararray() {
		String name= "bharath kumar reddy kristipati";
		int len= name.length();
		String rev= "";
		
		char[]  ch = name.toCharArray();
		
		for(int i = ch.length-1; i>=0 ; i--) {
			rev= rev+ ch[i];
		}
		System.out.println(rev);
	}
	
	//@Test
	public void splitExample() {
		String name= "bharath kumar reddy kristipati";
		String ar[]=  name.split(" ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}	
	
	@Test
	public void reverse_words() {
		String name= "bharath kumar reddy kristipati";
		String rev_word = "kristipati reddy kumar bharath";
		String rev  = "";
		
		String ar[]=  name.split(" ");
		for (int i = ar.length -1 ; i >= 0; i--) {
			rev = rev + ar[i]+ " ";
		}
		System.out.println(rev);
	}
	
	@Test
	public void reverse_words_chars() {
		String name= "bharath kumar reddy kristipati";
		String rev_word = "itapitsirk ydder ramuk htarahb";
		String rev  = "";
		
		String ar[]=  name.split(" ");
		for (int i = ar.length -1 ; i >= 0; i--) {
			
			rev = rev + ar[i]+ " ";
		}
		
		for (String string : ar) {
			
		}
		System.out.println(rev);
	}
}
