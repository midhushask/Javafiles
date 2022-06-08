package com.alg.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton_webelement {
	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.gecko.driver","C:\\Working\\GenericTrainingWorkspace\\javatrianing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://leafground.com/pages/radio.html");
	WebElement radiobutton1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
	WebElement radiobutton2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
	boolean status1=radiobutton1.isSelected();
	boolean status2=radiobutton2.isSelected();
	System.out.println("radiobutton1="+status1);
	System.out.println("radiobutton2="+status2);
	radiobutton1.click();
	if(status1==true) {
	
	System.out.println("radiobutton1 is default selected");
	}
	else {
	System.out.println("radiobutton2 isdefault selected");
}
	
	}
	}
	

