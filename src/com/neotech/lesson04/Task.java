package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
/**
 * Open chrome browser
Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
Enter valid username and password
Click on login button
Then verify "Web Orders" is displayed and also username is displayed right top corner
 */
		
System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		Thread.sleep(2000);
		
		WebElement weborders = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/table/tbody/tr/td[1]"));
		
		if(weborders.isDisplayed()) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!");
		}
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/table/tbody/tr/td[2]/div[1]"));
		
		if(username.isDisplayed()) {
			System.out.println("Test Passed!!");
		} else {
			System.out.println("Test failed!");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}
