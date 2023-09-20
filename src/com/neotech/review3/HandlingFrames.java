package com.neotech.review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://the-internet.herokuapp.com/iframe

		setUp();

		// 1st way, switching by index
		// driver.switchTo().frame(0);

		// 2nd way, switching by Id or Name
		// driver.switchTo().frame("mce_0_ifr");

		// 3rd way, switching by WebElement
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frameElement);

		WebElement bodyElement = driver.findElement(By.xpath("//body[@id='tinymce']"));

		bodyElement.clear();
		bodyElement.sendKeys("AC Milan is better than Inter Milan");
		Thread.sleep(2000);

		// This will throw an exception NoSuchElementException
		// because the focus is inside the frame
		// but the element is outside of the frame
		// driver.findElement(By.linkText("Elemental Selenium")).click();

		// We need to switch the focus to the main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();

		Thread.sleep(2000);

		tearDown();

		// HW for middle-class students :)
		// Go to https://the-internet.herokuapp.com/nested_frames
		// Go to the frame with name frameset-middle
		// Go to the frame with index 1
		// Verify the that text of the body is MIDDLE

	}
}