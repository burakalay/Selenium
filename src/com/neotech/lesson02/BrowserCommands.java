package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
//	1. Open chrome browser
//	2. Navigate to “https://www.zillow.com/”
//	3. Navigate to “https://www.google.com/”
//	4. Navigate back to Zillow Page
//	5. Refresh current page
//	6. Verify url contains “Zillow”
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		String url = "https://www.zillow.com/";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.contains("zillow")) {
			
			System.out.println("Url contains Zillow, test passed");
		}else {
			System.out.println("Test Failed.");
		}
		
		driver.close();
		
		
		
		
		
	}

}
