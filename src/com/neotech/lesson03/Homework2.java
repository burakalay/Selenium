package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
/**
 * HW2: Facebook sign up:
Open chrome browser
Go to "https://www.facebook.com/"
Click on Sign Up link
Enter first name
Enter last name
Enter email address
Re-enter email address
Click on Sign Up button
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com";
		
		driver.get(url);
		
		Thread.sleep(1500);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("Yeni hesap oluştur")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.name("firstname")).sendKeys("Julius");
		Thread.sleep(1500);
		driver.findElement(By.name("lastname")).sendKeys("Caesar");
		Thread.sleep(1500);
		driver.findElement(By.name("reg_email__")).sendKeys("juliuscaesar.rome@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("juliuscaesar.rome@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.name("reg_passwd__")).sendKeys("asdasdf112233.Caesar");
		Thread.sleep(1500);
		driver.findElement(By.name("birthday_day")).sendKeys("12"); 
		Thread.sleep(1500);
		
		driver.findElement(By.name("birthday_month")).sendKeys("Tem"); 
		Thread.sleep(1500);
		driver.findElement(By.name("birthday_year")).sendKeys("1907"); 
		Thread.sleep(1500);
		
		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.name("websubmit")).click();   
		
		
		Thread.sleep(8000);
		
		driver.quit();
		
		
		
	}

}
