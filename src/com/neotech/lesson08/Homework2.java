package com.neotech.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
/**
 * 1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
2) Verify on the page header "Not a Friendly Topic" displayed
3) Click on the Inner Frame Check box
4) Choose baby Cat from Animals dropdown
5) Quit the browser
 * @author Burak
 *
 */
public class Homework2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		Thread.sleep(2000);
		
		String expectedHeaderTxt = "Topic : Not a Friendly Topic";
		
		WebElement headerTxt = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/label"));
		
		if(headerTxt.isDisplayed())
		{
		System.out.println("Test passed");
		System.out.println("Header text is: "+headerTxt.getText());
		}else {
			System.out.println("Test failed!");
		}
		
		Thread.sleep(2000);

		
		WebElement parentFrame = driver.findElement(By.xpath("//*[@id=\"frame1\"]"));
		
		driver.switchTo().frame(parentFrame);
		
		Thread.sleep(1000);

		WebElement childFrame1 = driver.findElement(By.xpath("//*[@id=\"frame3\"]"));
		
		driver.switchTo().frame(childFrame1);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"a\"]")).click();
		
		Thread.sleep(2000);
		
		tearDown();

		
		
	}

}
