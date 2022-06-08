package com.alg.javatraining.examples;

public class JavaExample002_FunctionsAndObjects {
	
	/*
	   Purpose:
			User defined functions
			Objects
			Global Variables
			Local Variables
		Interview Perspective:
			None
		Next Steps:
			Return type
			Parameters
	 */

	//String globalVariable = "JavaTraining";
	
	public void testCase1() {
		//System.out.println("Global variable can be accessed here - " + globalVariable);
		System.out.println("test case 1 begins");
		openChromeBrowser();
		login();
		//Code here to check if login page is displayed
		closeChromeBrowser();
	}
	
	public void testCase2() {
		//System.out.println("Global variable can be accessed here - " + globalVariable);
		System.out.println("test case 2 begins");
		openChromeBrowser();
		login();
		//Check if error message is displayed 'Invalid Credentials'
		closeChromeBrowser();
	}
	
	public void openChromeBrowser() {
		//String localVariable = "Chrome";
		//System.out.println("Local variable can be accessed here - " + localVariable);
		System.out.println("Chrome browser opened");
	}
	
	public void login() {
		//System.out.println("Local variable cannot be accessed here - " + localVariable);
		System.out.println("User id entered");
		System.out.println("password entered");
		System.out.println("Click login button");
	}
	
	public void closeChromeBrowser() {
		System.out.println("Chrome browser closed");
	}
	
	public static void main(String[] args) {
		JavaExample002_FunctionsAndObjects obj1 = new JavaExample002_FunctionsAndObjects();
		obj1.testCase1();
		obj1.testCase2();
	}

}
