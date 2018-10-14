package com.qshore.opencart.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LanguageProperties {

	Properties props = null;

	public LanguageProperties(String language) {
		init(language);
	}

	public void init(String language) {
		String filepath = language + ".properties";
		File file = new File(".\\src\\test\\resources\\i18n\\" + filepath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			props = new Properties();
			props.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getValue(String key) {
		return props.getProperty(key, "");
	}
}
