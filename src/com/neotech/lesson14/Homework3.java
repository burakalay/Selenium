package com.neotech.lesson14;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework3 extends CommonMethods{
/**
 * Homework 3: 
Go to url: https://hrm.neotechacademy.com/
Log in using our custom methods
Go to PIM menu
Add an employee
Upload another image in the employee photo
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {

		
setUp();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		
		wait(2);
		
		click(driver.findElement(By.xpath("//*[@id=\"divLogin\"]/div[2]/div/form/div[3]/button")));
		
		
		//Click on PIM
		click(driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")));

		
		//Click on Add Employee
		click(driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]/span[2]")));
		
		
		waitForVisibility(driver.findElement(By.xpath("//*[@id=\"photo-preview-lable\"]")));
		
		//Send Name
		sendText(driver.findElement(By.xpath("//*[@id=\"first-name-box\"]")), "Michael");
		
		wait(1);
		
		//Send Middle Name
		sendText(driver.findElement(By.xpath("//*[@id=\"middle-name-box\"]")), "Gary");
		
		wait(1);
		
		//Send Lastname
		sendText(driver.findElement(By.xpath("//*[@id=\"last-name-box\"]")), "Scott");
		
		wait(1);
		
		Select dd = new Select(driver.findElement(By.xpath("//*[@id=\"location\"]")));
		
		dd.selectByVisibleText("New York Sales Office");
		
		WebElement emp = driver.findElement(By.xpath("//*[@id=\"employeeId\"]"));
		
		String empID = emp.getAttribute("value");
		
		wait(1);
		
		String filePath = System.getProperty("user.dir")+ "/screenshots/Lesson13/FileUpload.png";
		WebElement photo = driver.findElement(By.xpath("//*[@id=\"photo-preview-lable\"]"));
		
		sendText(driver.findElement(By.xpath("//*[@id=\"photo-preview-lable\"]")), filePath);
		
		wait(10);

		//Click on Save
		click(driver.findElement(By.xpath("//*[@id=\"modal-save-button\"]")));
		
List<WebElement> table = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[2]"));
		
		for(WebElement a: table) {
			
			if(a.getText().equals(empID)) {
				
				click(emp);
				
				break;
				
			}
			
		}
		System.out.println("Employee ID is: "+empID);
		wait(3);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			Files.copy(sourceFile, new File("screenshots/Lesson13/screenshotEmp.png"));
			System.out.println("New employee has been added successfully");
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!!!");
		}
		
		wait(1);
		
		tearDown();
		
	}

}
