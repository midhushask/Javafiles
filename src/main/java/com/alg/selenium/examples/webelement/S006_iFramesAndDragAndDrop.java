package com.alg.selenium.examples.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S006_iFramesAndDragAndDrop {
	
	/*
	 * Concepts:
	 * Working with iFrames
	 * Drag and Drop
	 */
	
	public static void main(String[] args) throws InterruptedException {
		WebElement iFrameInside;
		WebElement Drag;
		WebElement Drop;
		
		WebDriver driver = WebDriverManager.launchDriver("CHROME");

		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		iFrameInside = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iFrameInside);
		
		//Second method to switch to the iFrame
		//driver.switchTo().frame(0);
		
		Drag = driver.findElement(By.id("draggable"));
		Drop = driver.findElement(By.id("droppable"));
		
		Actions builder= new Actions(driver);
		builder.dragAndDrop(Drag, Drop).build().perform();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
