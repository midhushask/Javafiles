package com.alg.javapractice.selenium;

import java.util.Set;

import org.apache.tools.ant.taskdefs.Replace.NestedString;
import org.apache.tools.ant.taskdefs.condition.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Advancedwindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.gecko.driver","C:\\Working\\GenericTrainingWorkspace\\javatrianing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		String windowhandle1=driver.getWindowHandle();
		WebElement Windowparent1=driver.findElement(By.id("home"));
		Windowparent1.click();
		Set<String> handles=driver.getWindowHandles();
		for (String newwindow : handles) 
		{
			driver.switchTo().window(newwindow);
			
		}
		WebElement edit=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a"));
		edit.click();
		driver.close();
		driver.switchTo().window(windowhandle1);
		WebElement multiplewindow=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		multiplewindow.click();
		Set<String>newwindows=driver.getWindowHandles();
		int size=newwindows.size();
		System.out.println("the number of child window=" +size);
	
	for(String allwindow:handles) {
		if (!allwindow.equals(windowhandle1))  {
			driver.switchTo().window(allwindow).close();
		}
	}
	}
			
		
		}	
	


