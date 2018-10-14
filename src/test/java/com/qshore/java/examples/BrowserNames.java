package com.qshore.java.examples;

public enum BrowserNames {

	firefox,CHROME,IE,SAFARI;
	
	String value  = "";
	
	BrowserNames() {
		value = toString();
	}
	public String getBrowser() {
		return value;
	}
	public static BrowserNames fromString(String browser) {
		if (browser == null) {
			return null;
		}
		for (BrowserNames browserName : BrowserNames.values()) {
			if (browser.equalsIgnoreCase(browserName.getBrowser())) {
				return browserName;
			}
		}
		return null;
	}
}

