package com.alg.selenium.examples.webelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S005_Alerts {
	
	/*
	 * Concepts:
	 * Alert class
	 */
	
	public void testCase1() throws InterruptedException {
		WebElement alertButton;
				
		//Start browser
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		
		alertButton = driver.findElement(By.xpath("//div[@id='demo']/following-sibling::input"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(2000);
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	public void testCase2() throws InterruptedException {
		WebElement alertButton;
		WebElement label;
		
		//Start browser
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		
		alertButton = driver.findElement(By.xpath("//button[text()='Get Confirmation']"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(2000);
		
		alert.dismiss();
		
		Thread.sleep(2000);
		
		label = driver.findElement(By.id("demo"));
		System.out.println("Message after clicking on alert: " + label.getText());
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		S005_Alerts obj = new S005_Alerts();
		obj.testCase1();
		obj.testCase2();
	}

}
