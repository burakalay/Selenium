package com.neotech.personalPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {

		//https://demo.seleniumeasy.com/basic-select-dropdown-demo.html
		
		System.setProperty("webdriver.chromedriver", "webdriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	    
	    Thread.sleep(2000);
	    
	    driver.manage().window().maximize();
		
	    
	    WebElement dropDownmenu = driver.findElement(By.id("select-demo"));
	    
	    Select dd = new Select(dropDownmenu);
	    
	 dd.selectByIndex(2);
	    
	    Thread.sleep(1500);
	    
	   List<WebElement> menuList = driver.findElements(By.id("select-demo"));
	   
	   for(WebElement txt : menuList) {
		   
		   System.out.println(txt.getText());
	   }
	   
	   Thread.sleep(1000);
	   
	 
	   
	   System.out.println("---------MULTIPLE SELECTION----------");
	   
	   WebElement multipleSelect = driver.findElement(By.id("multi-select"));
	   
	   Select dd2 = new Select(multipleSelect);
	   
	boolean isMultiple = dd2.isMultiple();
	
	System.out.println("Dropdown 2 is multiple? --> "+isMultiple);

	if(isMultiple) {
	
		List<WebElement> options = dd2.getOptions();
		
		for(WebElement we: options) {
			
			String text = we.getText();
			System.out.println("The visible text value is: " + text);
			dd2.selectByVisibleText(text);
			Thread.sleep(2000);
			
		}
		dd2.selectByIndex(0);
		dd2.selectByIndex(3);
		dd2.selectByIndex(4);
		   
		
		
	}

	   
	   
	   
		   
		   Thread.sleep(1000);
		   
		   driver.quit();
	   }
	}

