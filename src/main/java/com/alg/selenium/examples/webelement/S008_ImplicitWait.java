package com.alg.selenium.examples.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S008_ImplicitWait {
	
	/*
	 * Concepts:
	 * Implicit Wait
	 * Hidden - Not Displayed element
	 */
	
	public static void main(String[] args) {
		WebElement hidden;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		hidden = driver.findElement(By.xpath("//div[@id='globalContainer']/following-sibling::span/img"));
		
		System.out.println("The webelement hidden is displayed? -> " + hidden.isDisplayed());
		
		driver.quit();
	}

}
