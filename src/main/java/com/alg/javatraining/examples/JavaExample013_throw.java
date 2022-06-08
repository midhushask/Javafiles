package com.alg.javatraining.examples;

public class JavaExample013_throw {
	
	public void checkEligibilty(int stuage, int stuweight){
		if(stuage<12 && stuweight<40) {
			throw new ArithmeticException("Student is not eligible for registration | Age - " + stuage + " | Weight - " + stuweight); 
		}else{
			System.out.println("Entries Valid!!"); 
		}
	} 

	public static void main(String args[]){ 
		System.out.println("Welcome to the Registration process!!");
		JavaExample013_throw obj = new JavaExample013_throw();
		obj.checkEligibilty(10, 39); 
		System.out.println("Have a nice day.."); 
	}

}
