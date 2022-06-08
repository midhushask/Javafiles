package com.alg.selenium.examples.webdriver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumExample003_WebDriverMethods {
	
	public WebDriver launchChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//To disable pop up "Disable developer mode extensions" and automation info-bar message
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		//Disable infobars, pop-up blocking and start maximized
		options.addArguments("disable-extensions");
		options.addArguments("disable-infobars");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-popup-blocking");
		
		//Disable password save pop up
		Map<String, Object> passwordSavePopPref = new HashMap<String, Object>();
		passwordSavePopPref.put("credentials_enable_service", false);
		passwordSavePopPref.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", passwordSavePopPref);
		
		WebDriver driver=new ChromeDriver(options);
		return driver;
	}
	
	public static void main(String args[]) {
		SeleniumExample003_WebDriverMethods obj = new SeleniumExample003_WebDriverMethods();
		WebDriver driver = obj.launchChromeDriver();
		
		//Redirect to URL
		driver.get("https://demoqa.com/");
		
		//Get Page Title
		System.out.println("Current Page Title - " + driver.getTitle());
		
		//Get Page URL
		System.out.println("Current URL - " + driver.getCurrentUrl());
		
		//Refresh
		driver.navigate().refresh();
		
		//Back
		driver.navigate().back();
		
		//Forward
		driver.navigate().forward();
		
		//Redirect to url using navigate().to()
		driver.navigate().to("https://demoqa.com/text-box");
		
		System.out.println("Current Page Title - " + driver.getTitle());
		System.out.println("Current URL - " + driver.getCurrentUrl());
		
		//Close the driver
		driver.quit();
	}

}
