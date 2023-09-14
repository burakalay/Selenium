package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("burakalay17@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asdasdf112233FBB");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type]")).click();
		
		WebElement weborders = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/table/tbody/tr/td[1]"));
		
		if(weborders.isDisplayed()) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!");
		}
		
	}

}
