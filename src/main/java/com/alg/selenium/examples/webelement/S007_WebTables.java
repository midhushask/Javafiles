package com.alg.selenium.examples.webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S007_WebTables {
	
	/*
	 * Concepts:
	 * Working with tables
	 */
	
	public static void main(String[] args) {
		List<WebElement> rows;
		List<WebElement> column;
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		
		//Print number of rows in table
		System.out.println("Print number of rows in table");
		System.out.println("******************************");
		rows = driver.findElements(By.xpath("//div[@id='demo']/following-sibling::table/tbody/tr"));
		System.out.println("Number of rows: " + rows.size());
		
		//Print every column of every row - 1
		System.out.println("Print every column of every row - 1");
		System.out.println("************************************");
		for(WebElement individualRow:rows) {
			System.out.println("Row:");
			System.out.println("------------------------");
			List<WebElement> columns=individualRow.findElements(By.tagName("td"));
			for(WebElement individualColumn:columns) {
				System.out.println(individualColumn.getText());
			}
		}
		
		//Print every column of every row - 2
		System.out.println("Print every column of every row - 2");
		System.out.println("************************************");
		column = driver.findElements(By.xpath("//div[@id='demo']/following-sibling::table/tbody/tr/td"));
		for(WebElement individualColumn:column) {
			System.out.println(individualColumn.getText());
		}
		
		//Print every column of row number 2
		System.out.println("Print every column of every row number 2");
		System.out.println("*****************************************");
		column = driver.findElements(By.xpath("//div[@id='demo']/following-sibling::table/tbody/tr[2]/td"));
		for(WebElement individualColumn:column) {
			System.out.println(individualColumn.getText());
		}
		
		//Find row and then print its column values
		System.out.println("Find row and then print its column values");
		System.out.println("*****************************************");
		rows = driver.findElements(By.xpath("//div[@id='demo']/following-sibling::table/tbody/tr"));
		String sValue;
		for(int i=1;i<=rows.size();i++) {
			sValue = driver.findElement(By.xpath("//div[@id='demo']/following-sibling::table/tbody/tr[" + i + "]/td[1]")).getText();
			if(sValue.contentEquals("21")) {
				column = driver.findElements(By.xpath("//div[@id='demo']/following-sibling::table/tbody/tr[" + i + "]/td"));
				for(WebElement individualColumn:column) {
					System.out.println(individualColumn.getText());
				}
				break;
			}
		}
		
		//Print content of last row
		System.out.println("Print content of last row");
		System.out.println("*****************************************");
		column = driver.findElements(By.xpath("//div[@id='demo']/following-sibling::table/tbody/tr[last()]/td"));
		for(WebElement individualColumn:column) {
			System.out.println(individualColumn.getText());
		}
		
		driver.quit();
	}

}
