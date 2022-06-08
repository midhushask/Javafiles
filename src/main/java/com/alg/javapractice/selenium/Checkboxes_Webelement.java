package com.alg.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxes_Webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("Webdriver.gecko.driver","C:\\Working\\GenericTrainingWorkspace\\javatrianing\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.leafground.com/pages/checkbox.html");
	WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
	checkbox.click();
	WebElement checkbox2check=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
	boolean status=checkbox2check.isSelected();
	System.out.println(status);
	WebElement checkbox3deselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
	checkbox3deselect.click();
	
	}
	
}
	