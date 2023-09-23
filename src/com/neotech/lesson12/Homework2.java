package com.neotech.lesson12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods{

	// WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
	// https://accounts.google.com/signup
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		wait(2);
		
		System.out.println("Title -> " + driver.getTitle());
		
		driver.findElement(By.linkText("Yardım")).click();
		
		wait(2);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println("The number of open windows/tabs -> " + allWindowHandles.size());

		
		switchToChildWindow();
		
		String title2 = driver.getTitle();
		System.out.println("Title -> " + title2);
		
		wait(2);
		
		// This will only close the focused tab/window
		driver.close();
		wait(2);

		tearDown();
		
		
	}

}
