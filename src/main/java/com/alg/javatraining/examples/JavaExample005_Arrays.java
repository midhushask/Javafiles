package com.alg.javatraining.examples;

public class JavaExample005_Arrays {
	
	/*
	 	Purpose:
			Arrays
		Interview Perspective:
			None
		Next Steps:
			loops
	 */
	
	String singleVariable;
	String[] arrayVariable = new String[2];
	
	public void initializeSingleVariable() {
		System.out.println("Before initialization - " + singleVariable);
		singleVariable="JavaTraining";
		System.out.println("After initialization - " + singleVariable);
		
		//Changing value of variable
		singleVariable="JAVATRAINING";
		System.out.println("After changing value - " + singleVariable);
	}
	
	public void initializeArrayVariable() {
		System.out.println("Before initialization - " + arrayVariable[0] + " & " + arrayVariable[1]);
		arrayVariable[0]="Java";
		arrayVariable[1]="Training";
		//arrayVariable[2]="JavaTraining";
		System.out.println("After initialization - " + arrayVariable[0] + " & " + arrayVariable[1]);
		System.out.println("Size of the array - " + arrayVariable.length);
	}
	
	public void declareAndInitializeArray() {
		String[] localArrayVariable = new String[] {"Java", "Training"};
		System.out.println("Value of local array variable - " + localArrayVariable[0] + " & " + localArrayVariable[1]);
		
		//Changing the values of array
		localArrayVariable[0] = "abc";
		
		System.out.println("After changing value: Value of local array variable - " + localArrayVariable[0] + " & " + localArrayVariable[1]);
	}
	
	
	public static void main(String[] args) {
		JavaExample005_Arrays obj1 = new JavaExample005_Arrays();
		obj1.initializeSingleVariable();
		obj1.initializeArrayVariable();
		obj1.declareAndInitializeArray();
	}

}
