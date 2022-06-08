package com.alg.selenium.examples.webelement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.alg.selenium.examples.webdriver.WebDriverManager;
import com.google.common.io.Files;

public class S011_TakeScreenshot {
	
	/*
	 * Concepts:
	 * Take screenshot
	 */
	
	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		
		driver.get("https://www.facebook.com/");
		
		try {
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile, new File("screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
