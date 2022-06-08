package com.alg.javatraining.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaExample012_Collections {
	String name="Toronto";
	String arrayName[] = {"Pankaj", "Session1"};
	List<String> listNames = new ArrayList<String>();
	Map<String, String> logMap = new HashMap<String, String>();
	
	public void testCase1(){
		listNames.add("Session 1");
		listNames.add("Session 2");
		listNames.add("Session 3");
		
		System.out.println("-----------Test Case 1 (First For Loop) -------------");
		for(int i=0; i<listNames.size(); i++){
			System.out.println(listNames.get(i));
		}
		
		System.out.println("-----------Test Case 1 (Second For Loop) -------------");
		for(String n1 : listNames){
			System.out.println("New for loop - " + n1);
		}
	}
	
	public void testCase2(){
		logMap.put("1", "Session1");
		logMap.put("2", "Session2");
		
		System.out.println("-----------Test Case 2 (Accessing Map Using get Method) -------------");
		
		System.out.println(logMap.get("1"));
		System.out.println(logMap.get("2"));
	}
	
	public void testCase3(){
		logMap.put("1", "Session3");
		logMap.put("2", "Session4");
	
		System.out.println("-----------Test Case 3 (Accesing Map Using EntrySet Object)-------------");
		
		for (Map.Entry<String, String> entry : logMap.entrySet()){
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}
	
	public void testCase4(){
		System.out.println("-----------Test Case 4 (Array of String) -------------");

		System.out.println("Value of array at index 0 - " + arrayName[0]);
		arrayName[0] = "Date";
	}

	public static void main(String args[]){
		JavaExample012_Collections obj1 = new JavaExample012_Collections();
		obj1.testCase1();
		obj1.testCase2();
		obj1.testCase3();
		obj1.testCase4();
	}


}
