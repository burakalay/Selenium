package com.neotech.review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.instagram.com/";
		
		         // driver.get(url);
				// will wait for the page and elements to be loaded
				// will NOT keep the history
				
		driver.navigate().to(url);
		// will NOT wait for the page and elements to be loaded
		// will keep the history
		Thread.sleep(1000);
		
		driver.manage().window().maximize(); // Will make full screen
		Thread.sleep(1000);
		
		
		driver.manage().window().minimize(); // Will minimize the screen
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.mlssoccer.com/");
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.fifa.com/");
		Thread.sleep(1000);
		
		driver.navigate().back(); // will bring us back to the second page
		Thread.sleep(1000);
		
		
		driver.navigate().back(); // will bring us back to the first page
		Thread.sleep(1000);
		
		
		driver.navigate().forward(); // will bring us forward to the second page
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
