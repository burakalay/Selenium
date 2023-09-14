package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	    // Test Case
		// Open chrome browser
		// Go to “https://demo.guru99.com/test/newtours/”
		// Click on Register Link
		//
		// Fill out just
		// First Name:
		// Last Name:
		// Phone:
		// Email:
		// And Click Submit

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chromedriver", "webdriver.chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://demo.guru99.com/test/newtours/";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register here")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Burak");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("Alay");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("5454372310");
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("burakalay17@gmail.com");
		
		Thread.sleep(3000);
		
        driver.findElement(By.name("submit")).click();
        
        Thread.sleep(2000);
        
        driver.quit();
	}

}
