package com.alg.selenium.examples.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S001_WebElementMethods {
	
	public void WebElementMethodExamples() {
		WebDriver driver;
		WebElement fullNameTextBox;
		WebElement fullNameLabel;
		WebElement submitButton;
		WebElement homeCheckbox;
		
		//Launch the webdriver		
		driver = WebDriverManager.launchDriver("CHROME");
		
		//Navigate to url
		driver.get("https://demoqa.com/text-box");
		
		//Enter data in text box
		fullNameTextBox = driver.findElement(By.id("userName"));
		fullNameTextBox.sendKeys("Sachin Tendulkar");
		
		//Clear data in text box
		fullNameTextBox.clear();
		
		//Read data from UI
		fullNameLabel = driver.findElement(By.id("userName-label"));
		String fullNameLabelText = fullNameLabel.getText();
		System.out.println(fullNameLabelText);
		
		//Check if button is enabled
		submitButton = driver.findElement(By.id("submit"));
		if(submitButton.isEnabled()) {
			System.out.println("Submit button enabled");
		}else {
			System.out.println("Submit button disabled");
		}
		
		//Check if button is displayed
		if(submitButton.isDisplayed()) {
			System.out.println("Submit button displayed");
		}else {
			System.out.println("Submit button not displayed");
		}
		
		//Check check box is selected or not
		driver.get("https://demoqa.com/checkbox");
		homeCheckbox = driver.findElement(By.xpath("//*[@class='rct-checkbox']/*"));
		if(homeCheckbox.isSelected()) {
			System.out.println("Checkbox selected");
		}else {
			System.out.println("Checkbox not selected");
		}
		
		homeCheckbox.click();
		homeCheckbox = driver.findElement(By.xpath("//*[@class='rct-checkbox']/*"));
		if(homeCheckbox.getAttribute("class").contains("rct-icon-check")) {
			System.out.println("Checkbox selected");
		}else {
			System.out.println("Checkbox not selected");
		}
		
		driver.quit();
	}
	
	public static void main(String args[]) {
		S001_WebElementMethods obj = new S001_WebElementMethods();
		obj.WebElementMethodExamples();
	}

}
