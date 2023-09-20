package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass{
/**
 * =================   Lesson 09 HW 2 =================================
TC: Delete Orders

1) Open chrome browser
2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
3) Login to the application
4) Click on the checkbox of all orders with product FamilyAlbum
5) Delete Selected orders
6) Verify the orders have been deleted
7) Quit the browser
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {

setUp();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
		
	 String expected = "FamilyAlbum";
	 
	 List<WebElement> tableRow = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
	 
	 
	 
	 for(int i=0; i<tableRow.size(); i++) {
		 
		 String rowText = tableRow.get(i).getText();
		 
		 if(rowText.contains(expected)) {
			 
			 driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]")).get(i-1).click();
		
					 }
			 
			 
			 Thread.sleep(1000);
		 }
	 driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
	 
	 WebElement newTable = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]"));
	 String newData = newTable.getText();
	 
	 
	 if(!newData.contains(expected)) {
		 System.out.println(expected+" has been deleted successfully!");
		 System.out.println("Test passed!");
	 }else {
		 System.out.println("Test failed!");
	 }
tearDown();
	}
	 
	}


