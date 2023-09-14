package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework3 extends BaseClass{
/**
 * Challenging Task
   Homework 3:
        Open chrome browser
        Go to "https://semantic-ui.com/modules/dropdown.html"
        Scroll down to "Multiple Selection"
        Click on drop down and select "CSS" and "HTML"
        Verify value has been selected
        Deselect 1 of the options from the dropdown
        Quit browser
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {
 
		setUp();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-tab='definition']/div[8]/div")).click();
		Thread.sleep(2000);
		
		// Click on CSS
				driver.findElement(By.xpath("//div[@data-tab='definition']//div[text()='CSS']")).click();
				Thread.sleep(3000);
		
				// Click on HTML
				driver.findElement(By.xpath("//div[@data-tab='definition']//div[text()='HTML']")).click();
				Thread.sleep(3000);
	
				// Remove the CSS option
				driver.findElement(By.xpath("//a[@data-value='css']/i")).click();
				Thread.sleep(3000);
		
				tearDown();
	}

}
