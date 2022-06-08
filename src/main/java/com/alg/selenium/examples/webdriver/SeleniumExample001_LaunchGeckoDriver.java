package com.alg.selenium.examples.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample001_LaunchGeckoDriver {
	
	public WebDriver launchGeckoDriver() {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void main(String args[]) {
		SeleniumExample001_LaunchGeckoDriver obj = new SeleniumExample001_LaunchGeckoDriver();
		WebDriver driver = obj.launchGeckoDriver();
		driver.get("https://demoqa.com/");
		driver.quit();
	}

}
