package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * HW2: Opening Page on Firefox Browser
   Open Firefox browser
   Navigate to “https://www.redfin.com/”
   Verify that you have navigated to (https://www.redfin.com/)
   End the Session (close the browser).
 * @author Burak
 *
 */
public class Homework2Redfin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.geckodriver", "webdriver.geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		String url = ("https://www.redfin.com/");
		
		driver.get(url);
		
		String actualURL = driver.getCurrentUrl();
		
		
		if(url.equalsIgnoreCase(actualURL)) {
			
			System.out.println("You have nagited to "+ actualURL);
			System.out.println("Test Passed");
		} else {
			System.out.println("Nope, it's wronge website");
			System.out.println("Current URL is: "+actualURL);
			System.out.println("Expected URL is: "+url);
			}
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
