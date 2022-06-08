package com.alg.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons_Webelement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
		button.click();
		WebElement getposition_button=driver.findElement(By.id("position"));
		Point location=getposition_button.getLocation();
		int X_coordinate=location.getX();
		int Y_coordinate=location.getY();
		System.out.println("x coordinate ofposition button= "+X_coordinate);
		System.out.println("y coordinate of position button="+Y_coordinate);
		WebElement getcolour_button=driver.findElement(By.id("color"));
		String colour=getcolour_button.getCssValue("background-color:lightblue");
		System.out.println(colour);
		WebElement size_button=driver.findElement(By.id("size"));
		Dimension size=size_button.getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		System.out.println("the height of  sizebuttonis="+height);
		System.out.println("the width of  sizebuttonis="+width);
		driver.quit();
		
		

}
	
	
}