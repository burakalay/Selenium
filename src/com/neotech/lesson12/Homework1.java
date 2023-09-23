package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods{
// FrameDemo at com.neotech.lesson07 using the CommonMethods.java
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		wait(2);
		
		switchToFrame(0);
		
		WebElement el = driver.findElement(By.xpath("//input[@id='age']"));
		
		sendText(el, "27");
		
		wait(2);
		
		tearDown();
		
		
		
	}

}
