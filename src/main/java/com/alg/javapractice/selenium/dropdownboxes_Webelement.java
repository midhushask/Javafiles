package com.alg.javapractice.selenium;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownboxes_Webelement {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Working\\GenericTrainingWorkspace\\javatrianing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com");
		WebElement dropbox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/h5"));
		dropbox.click();
		WebElement dropbox1=driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropbox1);
		select.selectByIndex(3);
		WebElement dropbox2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select"));
		Select select1=new Select(dropbox2);
		select1.selectByVisibleText("Appium");
		select1.selectByValue("4");
		WebElement dropbox4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select select2=new Select(dropbox4);
		List <WebElement> listoption =select2.getOptions();
		int size=listoption.size();
		System.out.println(size);
	    dropbox4.sendKeys("Selinium");
		
		

	}
}