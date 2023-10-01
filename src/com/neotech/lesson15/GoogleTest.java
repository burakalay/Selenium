package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class GoogleTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// //https://www.google.com/

		setUp();

		WebElement searchBox = driver.findElement(By.name("q"));
		
		sendText(searchBox, "bitcoin");
		
		wait(2);
		
		searchBox.sendKeys(Keys.ENTER);
		
       wait(2);
		
		
		tearDown();
	}

}
