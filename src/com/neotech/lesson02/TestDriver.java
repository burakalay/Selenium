package com.neotech.lesson02;

public class TestDriver {

	public static void main(String[] args) {

	I_WebDriver driver = new C_ChromeDriver();
	
	driver.get("www.amazon.com");
	driver.getTitle();
	driver.close();
	driver.quit();
		
		
		
	}

}
