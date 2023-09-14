package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

/**
 *      Facebook dropdown verification
        Open chrome browser
        Go to https://www.facebook.com/r.php

        Verify:

        month dd has 12 month options
        day dd has 31 day options
        year dd has 118 year options

        Select your date of birth	

        Quit browser
 * @author Burak
 *
 */
public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		
		Select day = new Select(driver.findElement(By.id("day")));
		Select month = new Select(driver.findElement(By.id("month")));
		Select year = new Select(driver.findElement(By.id("year")));
		
		if(day.getOptions().size()==31 && month.getOptions().size()==12 && year.getOptions().size()==119) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		
		Thread.sleep(2000);
		
		day.selectByIndex(4);
		month.selectByIndex(3);
		year.selectByVisibleText("1996");
		
		Thread.sleep(4000);
		
		tearDown();
		
	}

}
