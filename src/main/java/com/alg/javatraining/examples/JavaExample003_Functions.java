package com.alg.javatraining.examples;

public class JavaExample003_Functions {
	
	/*
	   Purpose:
			Functions - Return type
			Functions - Parameters
		Interview Perspective:
			None
		Next Steps:
			String
	 */
	
	/*
	 * String actualResult = readErrorMessage();
		if(actualResult.trim().contentEquals("Invalid user credentials")) {
			System.out.println("Test case 2 pass");
		}else {
			System.out.println("Test case 2 fail");
		}
	 */

	public void testCase1() {
		System.out.println("test case 1 begins");
		openChromeBrowser();
		login("abc@gmail.com", "pass_word");
		//Code to check if logout button is displayed
		closeChromeBrowser();
	}
	
	public void testCase2() {
		System.out.println("test case 2 begins");
		openChromeBrowser();
		login("abc@gmail.com", "password");
		String actualResult = readErrorMessage();
		if(actualResult.contentEquals("Invalid user credentials")) {
			System.out.println("Test case 2 pass");
		}else {
			System.out.println("Test case 2 fail");
		}
		closeChromeBrowser();
	}
	
	public void openChromeBrowser() {
		System.out.println("Chrome browser opened");
	}
	
	public void login(String userId, String password) {
		System.out.println("Enter user id - " + userId);
		System.out.println("Enter password - " + password);
		System.out.println("Click login button");
	}
	
	public void closeChromeBrowser() {
		System.out.println("Chrome browser closed");
	}
	
	public String readErrorMessage() {
		//Code to read the error message from the window pop up on the launched web browser
		String errorMessage = "Invalid user credentials";
		return errorMessage;
	}
	
	public static void main(String[] args) {
		JavaExample003_Functions obj1 = new JavaExample003_Functions();
		obj1.testCase2();
	}

}
