package com.neotech.review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCSS {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		driver.get(url);

		Thread.sleep(2000);
		
//		# (hashtag) means id
//		#twotabsearchtextbox -> any element with id = twotabsearchtextbox
//		input#twotabsearchtextbox -> any input with id = twotabsearchtextbox

//		. (period) means class
//		input.mango -> input with class mango

		WebElement searchText = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchText.sendKeys("Haaland jersey kids");
		Thread.sleep(1000);

		// span#nav-search-submit-text > input
		// Locate the span with id = nav-search-submit-text
		// Locate the direct-child input

		// Method chaining: locating the element and clicking on it
		driver.findElement(By.cssSelector("span#nav-search-submit-text > input")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
