package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
/**
 * Homework 1: Use WebDriverWait
        Verify element is enabled
        Open chrome browser
        Go to "https://the-internet.herokuapp.com/"
        Click on the "Dynamic Controls" link
        Click on enable button
        Enter "Hello" and verify text is entered successfully
        Close the browser
 * @author Burak
 *
 */
public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
	 driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[13]/a")).click();
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
	 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"))));
	 
		WebElement text = driver.findElement(By.xpath("//*[@id=\'input-example\']/input"));
		
		Thread.sleep(3000);
		
		text.sendKeys("Hello");
		
		System.out.println("Text area is enabled? --> "+text.isEnabled());
		
		Thread.sleep(1000);
		tearDown();
	}

}
