package com.neotech.review2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass{

	// https://nxtgenaiacademy.com/alertandpopup/
	
	
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("confirmalertbox")).click();
		
		// When alert is open, you cannot interact with the main page
		// driver.findElement(By.name("promptalertbox1234"));
	   // We need to take care of the Alert (JavaScript Pop-up)
		
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		
		System.out.println("The text of the Alert -> " + confirmAlert.getText());
		
		// confirmAlert.dismiss(); // Clicking on Cancel
		confirmAlert.accept(); // Clicking on OK
		Thread.sleep(1000);
		
		//After we accept/dismiss the alert, we can interact with the main page
		driver.findElement(By.name("promptalertbox1234")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		promptAlert.sendKeys("Yes");
		promptAlert.accept();
		
		Thread.sleep(2000);
		tearDown();
		
	}

}
