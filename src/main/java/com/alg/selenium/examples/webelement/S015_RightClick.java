package com.alg.selenium.examples.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S015_RightClick {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		driver.get("https://demoqa.com/buttons");
		   System.out.println("demoqa webpage displayed");
			
		   //Maximize browser window
		   driver.manage().window().maximize();
			 
		   //Instantiate Action Class
		   Actions actions = new Actions(driver);
			 
		   //Retrieve WebElement to perform right click
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
			 
		   //Right Click the button to display Context Menu&nbsp;
		   actions.contextClick(btnElement).build().perform();
		   System.out.println("Right click Context Menu displayed");
		   
		   Thread.sleep(2000);
			  
		   // Close the main window 
		   driver.quit();
	}

}
