package com.alg.selenium.examples.webelement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S003_RobotClassUploadFile {
	
	/*
	 * Concepts:
	 * Upload a file
	 * 	- Robot class
	 */

	public static void main(String[] args) throws InterruptedException, AWTException {
		// Start browser
		WebDriver driver;
		driver = WebDriverManager.launchDriver("CHROME");

		driver.get("http://my.monsterindia.com/create_account.html");
		Thread.sleep(2000);
		
		// This will click on Browse button
		driver.findElement(By.xpath("//input[@id='file-upload']/preceding-sibling::label[@class='upload-file']")).click();
		System.out.println("Browse button clicked");
		
		// Specify the file location with extension
		StringSelection sel = new StringSelection("C:\\Working\\Algrithm Inc\\Trainig\\Resume.docx");

		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);

		// Wait for 5 seconds
		Thread.sleep(5000); 

		// Create object of Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		//Press Enter 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
