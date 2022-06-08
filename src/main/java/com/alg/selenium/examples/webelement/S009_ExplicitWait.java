package com.alg.selenium.examples.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S009_ExplicitWait {
	
	/*
	 * Concepts:
	 * Explicit Wait
	 */
	
	public static void main(String[] args) {
		WebElement hidden;
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get("https://www.facebook.com/");

		hidden = driver.findElement(By.xpath("//div[@id='globalContainer']/following-sibling::span/img"));
		System.out.println("The webelement hidden is displayed? -> " + hidden.isDisplayed());
		
		//Explicit wait
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			hidden = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='globalContainer']/following-sibling::span/img")));		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("The Webelement hidden is not displayed");
		}
		
		driver.quit();
	}
}
