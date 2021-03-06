package com.alg.selenium.examples.webdriver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumExample002_LaunchChromeDriver {
	
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
		SeleniumExample002_LaunchChromeDriver obj = new SeleniumExample002_LaunchChromeDriver();
		WebDriver driver = obj.launchChromeDriver();
		driver.get("https://demoqa.com/");
		driver.quit();
	}

}
