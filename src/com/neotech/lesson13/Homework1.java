package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;
/**
 * Homework 1:
Open chrome browser
Go to https://demo.guru99.com/test/drag_drop.html
Drag the following blocks in different ways
Drag BANK to DEBIT SIDE
Drag SALES to CREDIT SIDE
Drag 5000 to DEBIT SIDE
Drag 5000 to CREDIT SIDE
Close the browser
 * @author Burak
 *
 */
public class Homework1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement sales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		
		WebElement fiveTho = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		
		WebElement debitSide = driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/div"));
		
		WebElement creditSide = driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/div"));
		
		WebElement debitAmount = driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/div"));
		
		WebElement creditAmount = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(bank, debitSide).perform();
		
		wait(2);
		
		action.dragAndDrop(sales, creditSide).perform();
		
		wait(2);

		
		action.dragAndDrop(fiveTho, creditAmount).perform();
		
		wait(2);

		action.dragAndDrop(fiveTho, debitAmount).perform();

		wait(2);
		
	tearDown();

	}

}
