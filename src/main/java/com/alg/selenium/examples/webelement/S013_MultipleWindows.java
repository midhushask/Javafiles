package com.alg.selenium.examples.webelement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S013_MultipleWindows {
	
	/*
	 * Concept:
	 * 	Multiple browser (window) 
	 */

	public static void main(String[] args) throws InterruptedException {
		// Open browser
		WebDriver driver=WebDriverManager.launchDriver("CHROME");
		 
		 driver.get("https://demoqa.com/browser-windows");

	        // Open new child window within the main window
	        driver.findElement(By.id("windowButton")).click();

	        //Get handles of the windows
	        String mainWindowHandle = driver.getWindowHandle(); //abc1
	        Set<String> allWindowHandles = driver.getWindowHandles(); //abc1, abc2
	        Iterator<String> iterator = allWindowHandles.iterator();

	        // Here we will check if child window has other child windows and will fetch the heading of the child window
	        while (iterator.hasNext()) {
	            String ChildWindow = iterator.next();
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	                driver.switchTo().window(ChildWindow);
	                WebElement text = driver.findElement(By.id("sampleHeading"));
	                System.out.println("Heading of child window is " + text.getText());
	                Thread.sleep(2000);
	                driver.close();
	            }
	        }
		
		//once all pop up closed now switch to parent window
		driver.switchTo().window(mainWindowHandle);
		
		//Wait for 2 seconds and close the parent window
		Thread.sleep(2000);
		driver.quit();
	}

}
