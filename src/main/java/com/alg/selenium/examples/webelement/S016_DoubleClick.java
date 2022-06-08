package com.alg.selenium.examples.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S016_DoubleClick {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		// Launch the URL 
		driver.get("https://demoqa.com/buttons"); 
		System.out.println("Demoqa Web Page Displayed"); 
		
		//Maximize browser window 
		driver.manage().window().maximize(); 
		
		//Instantiate Action Class 
		Actions actions = new Actions(driver); 
		
		//Retrieve WebElement to perform double click WebElement
		WebElement btnElement = driver.findElement(By.id("doubleClickBtn")); 
		
		//Double Click the button 
		actions.doubleClick(btnElement).build().perform(); 
		
		Thread.sleep(2000);
		
		//Close the main window 
		driver.quit();
	}

}
