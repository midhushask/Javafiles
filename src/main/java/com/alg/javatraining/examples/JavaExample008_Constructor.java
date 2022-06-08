package com.alg.javatraining.examples;

public class JavaExample008_Constructor {
	
	String sName;
	
	public JavaExample008_Constructor() {
		System.out.println("Constructor");
		sName="abc";
	}
	
	public JavaExample008_Constructor(String stringDataType) {
		System.out.println("Constructor Overloading and Parameterized Constructor - " + stringDataType);
		sName=stringDataType;
	}
	
	public JavaExample008_Constructor(String stringDataType, int intDataType) {
		System.out.println("Constructor Overloading and Parameterized Constructor - " + stringDataType + " & " + intDataType);
	}
	
	public static void main(String[] args) {
		JavaExample008_Constructor obj1 = new JavaExample008_Constructor();
		JavaExample008_Constructor obj2 = new JavaExample008_Constructor("JavaTraining");
		JavaExample008_Constructor obj3 = new JavaExample008_Constructor("JavaTraining", 1);
	}

}
