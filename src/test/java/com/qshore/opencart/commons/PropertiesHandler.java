package com.qshore.opencart.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesHandler {

	Properties props = null;
	
	public PropertiesHandler(){
		init();
	}
	
	public void init() {
		
		File file  =new File(".\\src\\test\\resources\\application.properties");
		FileInputStream fis = null;
		try {
			fis =new FileInputStream(file);
			props = new Properties();
			props.load(fis);
			
			System.out.println(props.getProperty("username"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getValue(String key) {
		return props.getProperty(key,"");
	}
}
