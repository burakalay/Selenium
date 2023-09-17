package com.neotech.lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass {
/**
 * Open chrome browser
Go to "https://www.techlistic.com/p/demo-selenium-practice.html"
Verify table contains "Financial Center".
Print name of all column headers
Print data of all rows
Quit Browser
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		
		String expected = "Financial Center";
		String actual = table.getText();
		
		if (actual.contains(expected))
		{
			System.out.println(expected + " is in the table!");
		}
		else
		{
			System.out.println(expected + " is NOT in the table!");
		}
		
		System.out.println("----- All Column Headers -------");
		
		List<WebElement> tHead = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		
		for(WebElement data: tHead) {
			System.out.print(data.getText() + " | ");
		}
		System.out.println();
		
		System.out.println("----- All Row Data -------");
		
/*	List<WebElement> tBody = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		
		
		for (WebElement bData: tBody) {
			
			System.out.println(bData.getText());
			
		}
		
	*/	
		
List<WebElement>  rowData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		
		for (WebElement row : rowData)
		{
			System.out.println(row.getText());
		}
		
		
		tearDown();		
		
		
	}

}
