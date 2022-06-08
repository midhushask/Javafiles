package com.alg.selenium.examples.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S017_MouseHoverOver {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		// Launch the URL 
        driver.get("https://demoqa.com/menu/");
        System.out.println("demoqa webpage Displayed");
	    
		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
                
        //Instantiate Action Class        
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover 
    	WebElement menuOption = driver.findElement(By.linkText("Main Item 2"));
    	//Mouse hover menuOption 'Music'
    	actions.moveToElement(menuOption).perform();
    	System.out.println("Main Item 2");
    	
    	//Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
    	WebElement subMenuOption = driver.findElement(By.linkText("SUB SUB LIST »")); 
    	//Mouse hover menuOption 'Rock'
    	actions.moveToElement(subMenuOption).perform();
    	System.out.println("SUB SUB LIST");
    	
    	Thread.sleep(2000);
    	
        // Close the main window 
    	driver.quit();
	}

}
