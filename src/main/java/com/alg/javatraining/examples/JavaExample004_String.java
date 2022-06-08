package com.alg.javatraining.examples;

public class JavaExample004_String {
	
	/*
	 	Purpose:
			String class
			String functions/methods
		Interview Perspective:
			None
		Next Steps:
			arrays
	 */

	
	public String getUpperCaseData(String sData) {
		String upperCaseData = sData.toUpperCase();
		return upperCaseData;
	}
	
	public String getLowerCaseData(String sData) {
		return sData.toLowerCase();
	}
	
	public String removeLeadingAndTrailingSpace(String sData) {
		return sData.trim();
	}
	
	public int getStringLength(String sData) {
		return sData.length();
	}
	
	public String stringReplace(String sData, String replaceString, String replaceWithString) {
		return sData.replace(replaceString, replaceWithString);
	}
	
	public boolean checkContentEquals(String sData, String sStartsWithData) {
		if(sData.contentEquals(sStartsWithData)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		JavaExample004_String obj1 = new JavaExample004_String();
		System.out.println(obj1.getUpperCaseData("javaTrAinING"));
		System.out.println(obj1.getLowerCaseData("javaTrAinING"));
		System.out.println(obj1.removeLeadingAndTrailingSpace("  java training  "));
		System.out.println(obj1.getStringLength("javaTraining"));
		System.out.println(obj1.stringReplace("Java is a programming lang", "lang", "language"));
		System.out.println(obj1.checkContentEquals("JavaTraining", "Java"));
	}

}
