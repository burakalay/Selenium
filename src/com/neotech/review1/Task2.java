package com.neotech.review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		// Go to https://demoqa.com/text-box
		// Fill the form and submit
	   // Use xPath or CSS Selector
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/text-box";
		driver.get(url);
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Donald Trump");
		
				driver.findElement(By.cssSelector("input[type='email']")).sendKeys("donald@trump.org");
		
				// Even though there are 2 elements, we will get the first one
				driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Mar o Lago");
		
				// Find an elements by using multiple attributes
				// CSS -> A textarea with class='form-control' AND id='currentAddress'
				// xPath -> //textarea[@class='form-control' and @id='currentAddress']
				driver.findElement(By.cssSelector("textarea[class='form-control'][id='permanentAddress']")).sendKeys("Jail");
		
				Thread.sleep(3000);
		
				driver.findElement(By.cssSelector("button#submit")).click();
		
				Thread.sleep(5000);
		
				driver.quit();
		
		
		
		
	}

}
