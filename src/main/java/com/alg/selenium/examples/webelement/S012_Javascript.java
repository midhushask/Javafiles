package com.alg.selenium.examples.webelement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S012_Javascript {
	
	/*
	 * Concepts:
	 * Execute JavaScript
	 */
	
	public static void main(String[] args) throws InterruptedException {
		//Scroll down a web page
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		
		driver.get("https://www.timeanddate.com/worldclock/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,350)");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
