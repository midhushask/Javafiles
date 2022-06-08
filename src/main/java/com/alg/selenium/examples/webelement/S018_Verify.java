package com.alg.selenium.examples.webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class S018_Verify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// code to maximize chrome browser
		driver.manage().window().maximize();

		String baseURL = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(baseURL);

		SoftAssert softAssert = new SoftAssert();
		String getActualTitle = driver.getTitle();
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Practice Page");

		softAssert.assertEquals(getActualTitle, "Practice Page");

		softAssert.assertNotEquals(getActualTitle, "Practice Page");
		softAssert.assertNull(verifyTitle);
		softAssert.assertNotNull(verifyTitle);
		softAssert.assertAll();

		// code to close chrome driver
		driver.close();
	}

}
