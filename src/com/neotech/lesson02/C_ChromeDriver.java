package com.neotech.lesson02;

public class C_ChromeDriver implements I_WebDriver {

	@Override
	public void get(String url) {

		System.out.println("Navigate to "+ url);
		
	}

	@Override
	public String getTitle() {

		System.out.println("The title is: ");
		
		return "Page Title";
	}

	@Override
	public String getCurrentUrl() {
System.out.println("Chrome gets current url");
		
		return "Page Url";
	}

	@Override
	public void close() {
	System.out.println("Window has been closed");	
	}

	@Override
	public void quit() {

		System.out.println("Chrome has been closed");
	}

	
	
	
}
