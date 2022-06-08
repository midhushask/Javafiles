package com.alg.javatraining.examples;

public class JavaExample006_Loops {
	
	/*
	 	Purpose:
			Loops
		Interview Perspective:
			None
		Next Steps:
			Inheritance
	 */
	
	String[] arrayVariable = new String[5];//0-4
	
	public void loops() {
		//For loop
		for(int i=0;i<arrayVariable.length;i++) {
			arrayVariable[i]="Initialized";
		}
		for(int i=0;i<arrayVariable.length;i++) {
			System.out.println(arrayVariable[i]);
		}
		for(String singleVariable:arrayVariable) {
			System.out.println(singleVariable);
		}
		
		//Assignment
			//https://www.javatpoint.com/control-flow-in-java
			/*
			 Java provides three types of control flow statements.

				Decision Making statements
					if statements
					switch statement
				Loop statements
					do while loop
					while loop
					for loop
					for-each loop
				Jump statements
					break statement
					continue statement
			 */
	}
	
	public static void main(String[] args) {
		JavaExample006_Loops obj1 = new JavaExample006_Loops();
		obj1.loops();
	}

}
