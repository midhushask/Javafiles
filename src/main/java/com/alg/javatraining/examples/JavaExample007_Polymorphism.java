package com.alg.javatraining.examples;

public class JavaExample007_Polymorphism {
	
	//Polymorphism - Compile time - Method Overloading
		//Different number of parameters
		//Different DataType of parameters
		//Different sequence of parameters
	
	public void login(String userId, String password) {
		System.out.println("Entering user id - " + userId);
		System.out.println("Entering password - " + password);
		System.out.println("Click login");
	}
	
	public void login(String password) {
		System.out.println("Entering password - " + password);
		System.out.println("Click login");
	}
	
	public void differentDataType(String stringDataType) {
		
	}
	
	public void differentDataType(int intDataType) {
		
	}
	
	public void differentSequence(String stringDataType, int intDataType) {
		
	}
	
	public void differentSequence(int intDataType, String stringDataType) {
		
	}
	

	/*
	public int differentReturnType(String stringDataType) {
		
	}
	
	public String differentReturnType(String stringDataType) {
		
	}
	*/
	
	public static void main(String[] args) {
		JavaExample007_Polymorphism obj1 = new JavaExample007_Polymorphism();
		obj1.login("ValidUserId", "Valid Password");
		obj1.login("Valid Password");
	}

}
