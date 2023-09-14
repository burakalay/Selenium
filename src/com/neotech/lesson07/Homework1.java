package com.neotech.lesson07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass{
/**
 *      Amazon Department List Verification
        Open chrome browser
        Go to "http://amazon.com/"
        Verify how many department options available.
        Print each department 
        Select Computers
        Quit browser
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
		
		WebElement departmentList = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		
		Select dp = new Select(departmentList);
		
		List<WebElement> list = dp.getOptions();
		
		System.out.println("The size of the department list: "+list.size());
		
		Thread.sleep(2000);
		
		System.out.println(departmentList.getText());
		
		Thread.sleep(2000);
		
		dp.selectByVisibleText("Computers");
		
		Thread.sleep(2000);
		
		tearDown();
	
		}
		
	}


