package com.alg.javapractice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class OpenFirefoxGoogle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Working\\GenericTrainingWorkspace\\javatrianing\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
	
	
	
}