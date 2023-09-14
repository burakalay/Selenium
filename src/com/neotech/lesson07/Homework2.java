package com.neotech.lesson07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

/**
 * Homework 2:
        Alert text verification
        Open chrome browser
        Go to https://demoqa.com/
        Click on "Alerts, Frame & Windows" link
        Click on "Alerts" links on the left side
        Click on button to see Alert
        Verify alert box with text "You clicked a button" is present
        Click on 3rd button in the page
        Verify alert box with text "Do you confirm action?" is present and click "confirm"
        Click on 4 th button in the page and enter your name and click ok.
        Quit browser
 * @author Burak
 *
 */
public class Homework2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
        String expectedText ="You clicked a button";
		
		String alertText = simpleAlert.getText();
		
		if(expectedText.equalsIgnoreCase(alertText)) {
			
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
         
         
         
         Thread.sleep(2000);
		
		System.out.println("The simple alert text is: " + alertText);
		
		simpleAlert.accept();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
