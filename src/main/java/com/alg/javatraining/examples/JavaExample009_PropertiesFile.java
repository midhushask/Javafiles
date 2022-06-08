package com.alg.javatraining.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JavaExample009_PropertiesFile {
	
	/*
	 * Concept:
	 * Working with Properties file
	 */
	
	//This example talks about Properties file 
	public Properties openProperties(String fileName) throws FileNotFoundException, IOException{
		Properties prop = new Properties();
		
		//To open the file in read mode
		InputStream input = new FileInputStream(fileName);
		
		prop.load(input);
		input.close();
		
		return prop;
	}
		
	public void  testcase1(){			
		Properties propTc1 = new Properties();
		
		try {
			propTc1 = openProperties("Test1.Properties");
			String url = propTc1.getProperty("url");
			System.out.println(url);
			System.out.println(propTc1.getProperty("password"));
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("General Exception");
		}finally{
			System.out.println("Finally block executed");
		}
		
		//Some lines of code
	}
	
	public void testcase2(){
		Properties propTc2 = new Properties();
		
		try {
			propTc2 = openProperties("Test2.Properties");
			System.out.println(propTc2.getProperty("Country"));
			System.out.println(propTc2.getProperty("State"));
		} catch (Exception e) {
			System.out.println("Exception in test case 2 |");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {		
		JavaExample009_PropertiesFile obj1 = new JavaExample009_PropertiesFile();
		obj1.testcase1();
		obj1.testcase2();
	}

}