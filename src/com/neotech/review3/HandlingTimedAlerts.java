package com.neotech.review3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class HandlingTimedAlerts extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/alerts

		setUp();

		WebElement alertBtn = driver.findElement(By.id("btnAlert"));
		alertBtn.click();
		Thread.sleep(1000);

		// Handling the Alert
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("The text of the alert is -> " + alertText);
		alert.accept();
		Thread.sleep(1000);

		// Handling the Delayed Alert
		driver.findElement(By.id("btnDelayedAlert")).click();

		// Exception org.openqa.selenium.NoAlertPresentException: no such alert
		// The Alert is not present yet
		// alert = driver.switchTo().alert();

		// This kind of waiting is not good
		// Because I don't want to wait for too long
		// Thread.sleep(10000);
		// alert = driver.switchTo().alert();

		// I want to wait for the Alert to be present
		// Wait for a maximum of 30 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());

		// If the alert is present in 3 seconds, I will wait only 3 seconds

		alert = driver.switchTo().alert();
		Thread.sleep(1000); // I want to see the alert for 1 second

		alert.accept();
		Thread.sleep(1000); // I want to see the page after alert is closed

		tearDown();
	}

}
