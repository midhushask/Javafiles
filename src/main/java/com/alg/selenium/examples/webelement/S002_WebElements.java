package com.alg.selenium.examples.webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S002_WebElements {
	
	/*
	 * Concepts:
	 * WebDriver.findElements()
	 * Loop through List<WebElement>
	 * Select value from dropdown
	 * 	- List<WebElement>
	 * 	- Select class
	 * WebElement.findElement() or WebElement.findElements()
	 * By.linkText()
	 * By.tagName()
	 */
	
	public void WebTables() throws InterruptedException {
		WebDriver driver;
		WebElement createAccountButton;
		List<WebElement> dates;
		WebElement months;
		WebElement year;
		List<WebElement> years;
		
		driver = WebDriverManager.launchDriver("CHROME");
		driver.get("https://www.facebook.com/");
		
		//Click on create account button
		createAccountButton = driver.findElement(By.linkText("Create new account"));
		createAccountButton.click();
		
		Thread.sleep(3000);
		
		//findElements will return all the matching xpath elements when index is not used
		dates = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println("Number of dates: " + dates.size());
		
		//Loop through list of webelement - Normal for loop
		for(int i=0;i<dates.size();i++) {
			System.out.println(dates.get(i).getText());
		}
		
		//Loop through list of webelement - New for loop
		for(WebElement element:dates) {
			System.out.println(element.getText());
		}
		
		//Select a value from dropdown - Normal loop through list of Webelements
		for(WebElement element:dates) {
			if(element.getText().contentEquals("15")) {
				element.click();
				Thread.sleep(2000);
				break;
			}
		}
		
		//To show that findElements will return only one WebElement if index is used
		dates = driver.findElements(By.xpath("//select[@id='day']/option[10]"));
		System.out.println("Number of dates: " + dates.size());
		
		//Select a value from dropdown - Select class
		months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("11");
		Thread.sleep(2000);
		month.selectByVisibleText("Feb");
		Thread.sleep(2000);
		month.selectByIndex(3);
		Thread.sleep(2000);
		
		//Advanced findElement strategy
		year = driver.findElement(By.id("year"));
		years = year.findElements(By.tagName("option"));
		System.out.println("Number of years: " + years.size());
		
		driver.quit();
	}
	
	public static void main(String args[]) throws InterruptedException {
		S002_WebElements obj = new S002_WebElements();
		obj.WebTables();
	}

}
