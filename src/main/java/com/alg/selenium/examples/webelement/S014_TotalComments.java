package com.alg.selenium.examples.webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alg.selenium.examples.webdriver.WebDriverManager;

public class S014_TotalComments {
	
	/*
	 * Interview question
	 * 	To print the total number of comments
	 */

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.launchDriver("CHROME");
		driver.get("http://slashdot.org/");

		//String cmtcnt = driver.findElement(By.xpath("//table[@class='thisday-tb']/tbody/tr/td[3]")).getText();
		//System.out.println(cmtcnt);     
		List<WebElement> comment_cnt = driver.findElements(By.xpath("//table[@class='thisday-tb']/tbody/tr/td[3]"));
		
		System.out.println(comment_cnt.size());
		int total = 0;
		for(int i=0; i<comment_cnt.size(); i++){
			String Str_count = comment_cnt.get(i).getText();
			int count = Integer.parseInt(Str_count);
			total = total +count;
			}
		
		System.out.println("Total no of comments =" +total);
		driver.quit();	
	}

}
