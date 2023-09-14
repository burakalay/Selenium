package com.neotech.lesson04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
/**
 *      Using Css ONLY
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
		
		
		
		
		
		
	}

}
