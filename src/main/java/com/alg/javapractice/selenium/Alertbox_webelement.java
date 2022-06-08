package com.alg.javapractice.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertbox_webelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Working\\GenericTrainingWorkspace\\javatrianing\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		WebElement Alertbox1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		Alertbox1.click();
		Alert Alert=driver.switchTo().alert();
		Thread.sleep(3000);
		Alert.accept();
		WebElement Alertbox2= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		Alertbox2.click();
		Alert Alert1 =driver.switchTo().alert();
		Thread.sleep(3000);
		Alert1.dismiss();
		WebElement Alertbox3= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		Alertbox3.click();
		Alert Alert3=driver.switchTo().alert();
		
		Alert3.sendKeys("algorithm");
		Thread.sleep(3000);
		Alert3.dismiss();
		
		
		
		
		
	}

}
