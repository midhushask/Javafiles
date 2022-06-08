package com.alg.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("Webdriver.gecko.driver","C:\\Working\\GenericTrainingWorkspace\\javatrianing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement dragbox=driver.findElement(By.id("draggable"));
		WebElement dropbox=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		//action.clickAndHold(dragbox).moveToElement(dropbox).release(dropbox).build().perform();
		action.dragAndDrop(dragbox, dropbox).build().perform();
		driver.quit();
	}

}
