package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;
/**
 * 1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
3) On the Child Window, Enter your email ID and submit.
4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
5) Close the Child window on which credentials are displayed.Switch to the parent window.
6) Quit all browsers
 * @author Burak
 *
 */
public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println("The number of open windows/tabs -> " + allWindowHandles.size());

		Iterator<String> it = allWindowHandles.iterator();
		String window1 = it.next();
		String window2 = it.next();

		System.out.println("Window1 -> " + window1);
		System.out.println("Window2 -> " + window2);
		
		driver.switchTo().window(window2);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("burakalay17@gmail.clm");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		
		Thread.sleep(2000);


		driver.close();
		
		driver.switchTo().window(window1);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
