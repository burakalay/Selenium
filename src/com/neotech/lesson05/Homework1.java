package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ===========HW-1==========
Open chrome browser
Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
Enter valid username
Clear username and enter again valid username
Leave password field empty
Click on login button
Verify error message with text "Invalid Login or Password." is displayed.
 * @author Burak
 *
 */
public class Homework1 {
public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_username")).clear();
		
		Thread.sleep(2000);

		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(1000);

		WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_status\"]"));
		
		if(errorMessage.isDisplayed()) {
			System.out.println("Error message is displayed");
			System.out.println("Test passed.");
		}else {System.out.println("Test failed.");}
		
		driver.quit();
	}

}
