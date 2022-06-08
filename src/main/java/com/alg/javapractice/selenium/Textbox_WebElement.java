package com.alg.javapractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Textbox_WebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com");
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("hasmidhusha@gmail.com");
		WebElement appendbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendbox.sendKeys("add");
		WebElement edit_defaultbox=driver.findElement(By.name("username"));
		String value=edit_defaultbox.getAttribute("value");
		System.out.println(value);
		WebElement clearbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearbox.clear();
		WebElement disablebox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		boolean enable=disablebox.isEnabled();
		System.out.println("enable box is displayed=" +enable);
		driver.quit();
	}

}
