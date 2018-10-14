package com.qshore.java.examples;

public class SwitchExample {
		
	public static final String MONDAY = "monDay";
	public static final String TUESDAY = "tues";
	public static final String WEDNESDAY = "wed";
	public static final String THURSDAY = "thursda";
	public static final String FRIDAY = "friday";
	public static final String SATURDAY = "sat";
	public static final String SUNDAY = "SUNDay";
	
	
	public void printWeek(String weekday) {

		switch (weekday) {
		case SUNDAY:
			System.out.println("I am sunday");
			break;
		case "monDay":
			System.out.println("In Monday");
			break;
		case "tues":
			System.out.println("In Tues");
			break;
		case "wed":
			System.out.println("In Wed");
			break;
		case "thursda":
			System.out.println("In Thus");
			break;
		case FRIDAY:
			System.out.println("In Fri");
			break;
		case SATURDAY:
			System.out.println("In Sat");
			break;
		default:
			System.out.println("I am in default, nothing matches");
			break;
		}
	}
	public void test1() {
		String browser = "chrome";
		if (browser.equals("firefox")) {
			System.out.println("In firefox");
		} else if (browser.equals("ie")) {
			System.out.println("In Internet Explorer");
		} else if (browser.equals("firefox")) {
			System.out.println("In firefox");
		}
		
		
	}

	public void test2() {
		String browser = "chrome";
		switch (browser) {
		case "firefox":
			System.out.println("In firefox");
			System.out.println("Launching browser");
			break;
		case "chrome":
			System.out.println("In chrome");
			System.out.println("Launching browser");
			break;
		case "ie":
			System.out.println("In firefox");
			System.out.println("Launching browser");
			break;

		default:
			break;
		}

		if (browser.equals("firefox")) {
			System.out.println("In firefox");
		} else if (browser.equals("ie")) {
			System.out.println("In Internet Explorer");
		} else if (browser.equals("firefox")) {
			System.out.println("In firefox");
		}
	}

	
	public void selectMonth(MONTH month) {
		
		switch (month) {
		case APRIL:
			System.out.println("april");
			break;
		case AUGUST:
			System.out.println("april");
			break;
		case DECEMBER:
			System.out.println("april");
			break;
		case FEBRUARY:
			System.out.println("april");
			break;
		case JANUARY:
			System.out.println("april");
			break;
		case JULY:
			System.out.println("april");
			break;
		case JUNE:
			System.out.println("april");
			break;
			
		default:
			break;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		SwitchExample ex = new SwitchExample();
		ex.selectMonth(MONTH.APRIL);
	}
	
	
	
}
