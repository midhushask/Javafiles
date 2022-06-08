package com.alg.selenium.examples.webdriver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
	
	public static WebDriver launchDriver(String browser) {
		WebDriver driver=null;
		switch(browser) {
			case "CHROME" : driver = launchChrome();
			break;
			
			case "FIREFOX" : driver = launchFireFox();
			break;
		}
		return driver;
	}
	
	private static WebDriver launchChrome() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//To disable pop up "Disable developer mode extensions" and automation info-bar message
		options.setExperimentalOption("useAutomationExtension", false); 
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
		
		//Download file location settings
		passwordSavePopPref.put("profile.default_content_settings.popups", 0);
		passwordSavePopPref.put("download.default_directory", "C:\\Working\\Algrithm Inc\\Trainig");
		
		options.setExperimentalOption("prefs", passwordSavePopPref);
		options.addArguments("--test-type");
    	driver = new ChromeDriver(options);
		
    	return driver;
	}
	
	private static WebDriver launchFireFox() {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
