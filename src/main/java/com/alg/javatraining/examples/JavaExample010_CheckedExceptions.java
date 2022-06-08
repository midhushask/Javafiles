package com.alg.javatraining.examples;

public class JavaExample010_CheckedExceptions {

	/*
	 * Compile time exceptions - Checked exception
	 * 		throws
	 */

	String[] tranId = {"Abc123", "Abc234"};

	public String getTranId(int i) throws Exception{
		return tranId[i];
	}

	public void testCase1(){
		/*
		for(int i=0;i<=2; i++){
			System.out.println("Tran ID " + i + " - " + getTranId(i));
		}
		*/

		/*
		for(int i=0;i<=3; i++){
			try{
				System.out.println("Tran ID " + i + " - " + getTranId(i));
			}catch(Exception e){
				System.out.println("Error accessing Tran Id - " + i);
			}
		} 
		*/
	}

	public static void main(String args[]){
		System.out.println("Exception Handling - Checked Exception");
		JavaExample010_CheckedExceptions obj1 = new JavaExample010_CheckedExceptions();
		obj1.testCase1();

		System.out.println("End of Exception Handling - Checked Exception");
	}


}
