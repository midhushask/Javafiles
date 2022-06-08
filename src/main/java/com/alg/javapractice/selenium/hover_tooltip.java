package com.alg.javapractice.selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class hover_tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.gecko.driver","C:\\Working\\GenericTrainingWorkspace\\javatrianing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		WebElement hoverbox=driver.findElement(By.id("age"));
		Actions action=new Actions(driver);
		action.moveToElement(hoverbox).build().perform();
		String tooltip=hoverbox.getAttribute("title");
		
		System.out.println(tooltip);
		driver.quit();
	}

}
