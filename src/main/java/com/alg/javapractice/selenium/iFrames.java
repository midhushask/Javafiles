package com.alg.javapractice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Working\\GenericTrainingWorkspace\\javatrianing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.id("click"));
		frame1.click();
		String text=frame1.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2=driver.findElement(By.id("click1"));
		frame2.click();
		String text2=frame2.getText();
		System.out.println(text2);
		driver.switchTo().defaultContent();
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
		int numberframes=totalframes.size();
		System.out.println("numberof frames="+ numberframes);
		
		driver.quit();
		

	}

}
