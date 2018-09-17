package com.qshore.testcases.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class CollExample {

	
	// List --> ArrayList
	// Set --> HashSet
	// Map --> HashMap
		// They are interfaces.
	// How to create
	// How to add values
	// How to retrieve values 
	// How to delete values in it
	
	// Purpose of each type.
	//Lists are index based. indexes start with 0. 
	//@Test
	public void test2() {
		ArrayList ar = new ArrayList();
		ar.add("bharath");
		ar.add(true);
		ar.add(34);
		ar.add('c');
		ar.add(45.5);
		ar.add(342);
		System.out.println(ar.size());
		//System.out.println(ar.get(2));

		for(int i = 0; i< ar.size() ; i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println(ar.remove(2));
		

		for(int i = 0; i< ar.size() ; i++) {
			System.out.println(ar.get(i));
		}
		
		for(Object obj : ar) {
			System.out.println(obj);
		}
	}
	
	//@Test
	public void setExample() {
		
		HashSet set = new HashSet();
		set.add("bharath");
		set.add(true);
		set.add("kuamr");
		
		System.out.println(set.size());
		
		for(Object obj : set) {
			System.out.println(obj);
		}
		
		set.add("kuamr");
		System.out.println(set.size());
		set.remove("kuamr");
		System.out.println(set.size());
		
		set.remove("");
	}
	
	@Test
	public void testMap() {
		
		HashMap map = new HashMap();
		map.put(1, "bharath");
		map.put(true,"kumar");
		map.put(false,"asda");
		System.out.println(map.size());
		map.put(1,"dfdss");
		
		System.out.println(map.size());
		
		System.out.println(map.get(1));
		
		Set st = map.keySet();
		
		for( Object oj : st) {
			System.out.println(map.get(oj));
		}
		
		map.remove(1);
	}
	
	
	
	
	
	
}
