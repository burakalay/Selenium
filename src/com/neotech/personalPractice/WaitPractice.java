package com.neotech.personalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractice {

	public static void main(String[] args) {

		// http://webdriveruniversity.com/Ajax-Loader/index.html

		System.setProperty("webdriver.driver.chromedriver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://webdriveruniversity.com/Ajax-Loader/index.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"button1\"]/p")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")));

		WebElement popupMessage = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[2]"));

		String text = popupMessage.getText();

		System.out.println(text);

		driver.quit();

	}

}
