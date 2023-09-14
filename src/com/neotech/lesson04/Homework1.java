package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	/**
	 *  Using xPath ONLY
         TC 2: Mercury Tours Registration: 
        Open chrome browser
        Go to “http://demo.guru99.com/test/newtours/”
        Click on Register Link
        Fill out all required info
        Click Submit
        User successfully registered
	 * @param args
	 * @throws InterruptedException 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://demo.guru99.com/test/newtours/";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Burak");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Alay");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("545455544");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Obrakadabra17");
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("bostanli");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("İzmir");

		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Karsiyaka");
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("35590");
		
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("Turkey");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Obrakadabra17");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("112233");
		
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("112233");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
