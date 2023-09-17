package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework3 extends BaseClass {

	/**
	 *   Add Employee
        Open chrome browser
        Go to "https://hrm.neotechacademy.com/"
        Login into the application
        Click on PIM > Add Employee 
        Add Employee
        Log out 
        Quit the browser
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get the username in cofiguration file and send it to the username box
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		Thread.sleep(1000);
		
		
		//log in
		driver.findElement(By.xpath("//*[@id=\"divLogin\"]/div[2]/div/form/div[3]/button")).submit();
		//navigate to PIM menu
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")).click();
		//click on Add Employee
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name-box")));
		
		//Giving employeee infos
		
		WebElement firstNameBox = driver.findElement(By.xpath("//*[@id=\"first-name-box\"]"));
		
		firstNameBox.sendKeys("Michael");
		
		driver.findElement(By.xpath("//*[@id=\"middle-name-box\"]")).sendKeys("Jeffrey");
		
		driver.findElement(By.xpath("//*[@id=\"last-name-box\"]")).sendKeys("Jordan");
		
		WebElement dd = driver.findElement(By.xpath("//*[@id=\"location\"]"));
		
		Select select = new Select(dd);	
		
		select.selectByVisibleText("Australian Regional HQ");
		
		driver.findElement(By.xpath("//*[@id=\"modal-save-button\"]")).click();
		
		tearDown();
		
		
		
		
	}

}
