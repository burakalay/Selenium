package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
/**
 * 1) Navigate to
http://samples.gwtproject.org/samples/Showcase/Showcase.html#!Cw
FileUpload
2) Upload file
3) Verify file got successfully uploaded and take screenshot
 * @author Burak
 *
 */
public class Task extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		String filePath = System.getProperty("user.dir")+"/screenshots/HRM/screenshot01.png";
		
		
		sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath);
		
		wait(3);
		
		click(driver.findElement(By.xpath("//button[@class='gwt-Button']")));
		
		
		//the alert will show up
				System.out.println("Alert Text: " + getAlertText());
				acceptAlert();
				//take a screenshot:
				TakesScreenshot ts = (TakesScreenshot) driver;
				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
				
				try {
					Files.copy(sourceFile, new File("screenshots/Lesson13/FileUpload.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		tearDown();
	}

}
