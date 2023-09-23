package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class Task extends CommonMethods {
//https://hrm.neotechacademy.com
	public static void main(String[] args) throws InterruptedException {

		setUp();

		wait(2);
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		sendText(username,"Admin");
		
		wait(2);
		
		driver.findElement(By.xpath("//*[@id=\"divLogin\"]/div[2]/div/form/div[3]/button")).click();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
	
		try {
			Files.copy(sourceFile, new File("screenshots/HRM/screenshot01.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save it!!!");
		}
	
	 
		wait(1);
		
		tearDown();
		
	}
	
	

}
