package com.neotech.lesson09;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		 driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[13]/a")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		 
		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

			wait.withTimeout(Duration.ofSeconds(10));
			wait.pollingEvery(Duration.ofSeconds(1));
			wait.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"input-example\\\"]/input")));
		 
	
		 
			WebElement text = driver.findElement(By.xpath("//*[@id=\'input-example\']/input"));
			
			Thread.sleep(3000);
			
			text.sendKeys("Hello");
			
			System.out.println("Text area is enabled? --> "+text.isEnabled());
			
			Thread.sleep(1000);
			tearDown();

	}

}
