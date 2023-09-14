package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
/**
 * TC 1: Frame verification
Open chrome browser
Go to https://demoqa.com/frames
Verify the headers in both frames
Quit the browser
 * @author Burak
 *
 */
public class Task extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		Thread.sleep(2000);

		WebElement parentFr = driver.findElement(By.xpath("//*[@id=\"frame1\"]"));
		driver.switchTo().frame(parentFr);
		
		WebElement p = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		
		String parentTxt = p.getText();
		Thread.sleep(1000);

		System.out.println("Parent frame's text is: "+parentTxt);
		
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);

		WebElement childFr = driver.findElement(By.xpath("//*[@id=\"frame2\"]"));
		
		driver.switchTo().frame(childFr);
		
		WebElement c = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		
		String childTxt = c.getText();
		
		System.out.println("child frame's text is: "+childTxt);

		
		tearDown();
		
		
	}

}
