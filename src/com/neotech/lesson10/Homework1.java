package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {
/**
 * TC: Update Customer Information

1) Open chrome browser
2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
3) Login to the application
4) Verify customer "Susan McLaren" is present in the table
5) Click on customer details
6) Update customers last name and credit card info
7) Verify updated customers name and credit card number is displayed in table
8) Close browser
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		WebElement verifyCus = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
		String expected = "Susan McLaren";
		
		String actual = verifyCus.getText();
			
		if(actual.contains(expected)) {
			System.out.println("The customer is in the table");
		}	else {
			System.out.println("The customer is not in the table");
		}
		
		Thread.sleep(2000);
		
	System.out.println("-------------Changing the Last Name-------------------");
	
	WebElement customerDetails = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[13]/input"));
	
	customerDetails.click();
	
	WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
	
	customerName.clear();
	
	Thread.sleep(3000);
	
	customerName.sendKeys("Susan Jordan");
	
	WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
	
	cardNumber.clear();
	
	Thread.sleep(3000);
	
	cardNumber.sendKeys("999888777555");
	
	Thread.sleep(1500);
	
	driver.findElement(By.linkText("Update")).click();
	
	String expectedLastName= "Jordan";
	
	String expectedCardNumber ="999888777555";
	
	
	WebElement newCustomer = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[6]"));
	
	String uptaded = newCustomer.getText();
	
	if(uptaded.contains(expectedLastName)&& uptaded.contains(expectedCardNumber)) {
		
		System.out.println("Test Passed --> Customer last name and Card Number has been updated successfully");
		System.out.println("New last name: "+expectedLastName);
		System.out.println("New card number: "+expectedCardNumber);
		
	}else {
		System.out.println("Test failed!");
	}
	
	Thread.sleep(1500);
	
	tearDown();
	
	
	
	}
		
		
	}


