package com.neotech.lesson05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Radio Button Practice Open chrome browser Go to
 * "https://demoqa.com/radio-button" Verify if all radio buttons are displayed
 * and clickable Click on all radio buttons Verify radio buttons has been
 * clicked successfully Quit browser
 * 
 * @author Burak
 *
 */
public class Homework2 {
	public static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		Thread.sleep(1000);
		
		WebElement yesRadio = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
		WebElement impRadio = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
		WebElement noRadio =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]/label"));
		
		
		
	if(yesRadio.isDisplayed() && yesRadio.isEnabled()) {
			yesRadio.click();
			Thread.sleep(1000);
			System.out.println("yesRadio is working properly");
		}   else {
			System.out.println("yesRadio is not working properly");
		}
		
		Thread.sleep(1000);
		
		if(impRadio.isDisplayed() && impRadio.isEnabled()) {
			impRadio.click();
			Thread.sleep(1000);
			System.out.println("impRadio is working properly");
		}   else {
			System.out.println("impRadio is not working properly");
		}
		
		Thread.sleep(1000);
		
		if(noRadio.isDisplayed() && noRadio.isEnabled()) {
			noRadio.click();
			if(noRadio.isSelected()) {
				
			System.out.println("noRadio is working properly"); 
		}   else {
			System.out.println("noRadio is not working properly");
		}}

		Thread.sleep(1000);
		
		driver.quit();
	}

}
