package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	/**
	 * Open chrome browser Go to "https://demo.guru99.com/test/newtours/" Click on
	 * Register Link Fill out ALL required info Click Submit User successfully
	 * registered (Create the script using different locators)
	 * @throws InterruptedException 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://demo.guru99.com/test/newtours/";

		driver.get(url);
        driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Register here")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Burak");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("Alay");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("5454372310");
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).sendKeys("burakalay17@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("Bostanlı, Karşıyaka");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("İzmir");
		Thread.sleep(1000);
		driver.findElement(By.name("state")).sendKeys("Karşıyaka");
		Thread.sleep(1000);
		driver.findElement(By.name("postalCode")).sendKeys("35590");
		Thread.sleep(1000);		
		driver.findElement(By.name("country")).sendKeys("Turkey");
		Thread.sleep(1000);
	
		driver.findElement(By.id("email")).sendKeys("Obrakadabra17");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		
		driver.quit();
	
	}

}
