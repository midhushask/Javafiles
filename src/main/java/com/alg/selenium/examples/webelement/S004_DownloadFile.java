package com.alg.selenium.examples.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S004_DownloadFile {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("32 bit Windows IE")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
