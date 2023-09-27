package com.neotech.lesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods {
/**
 * Homework 2: Scroll Down Continuously
Open chrome browser
Go to "https://the-internet.herokuapp.com/"
Click on the "Infinite Scroll" link
Scroll down by 500 pixels 10 times
Wait 1 second between each scroll
Scroll into the view of tag h3 (Infinite Scroll)
Close the browser
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		click(driver.findElement(By.linkText("Infinite Scroll")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
        js.executeScript("window.scrollBy(0, 500)");
		
		
		
	}

}
