package com.alg.javatraining.examples;

public class JavaExample011_UncheckedExceptions {
	
	/*
	 * Concept:
	 * Run-time exceptions - Unchecked exception
	 	Try and Catch
		Multiple try catch
		Increasing order of exceptions in catch block
		Using Exception e
		Finally Block
		Nested try and catch
	 */
	
	/*
	 * Real time use:
	 * 	While writing BasePage class in Selenium, we use
	 * 	Selenium classes have lot of methods which would throw exception like WebElementNotFoundException, TimeoutException etc.,
	 */
	
	public void testCase1(){
		String[] tranId = {"Abc123", "Abc234"};
		String name = null;
		
		/*
		for(int i=0;i<=2; i++){
			System.out.println("Tran ID " + i + " - " + tranId[i]);
		}
		*/
		
		for(int i=0;i<=3; i++){		
			try{
				System.out.println("Tran ID " + i + " - " + tranId[i]);
				//System.out.println("Trying to print the size of name " + name.length());
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Error accessing Tran Id - " + i + " | " + e.getMessage() + " | ");
				e.printStackTrace();
			}
		
			/*
			catch(NullPointerException e){
				System.out.println("Exception thrown for Null - " + e.getMessage() + " | ");
			}catch(Exception e){
				System.out.println("Exception thrown - " + e.getMessage() + " | ");
			}finally{
				System.out.println("Final statement");
			}
			*/

		}
	
		/*
		 for(int i=0;i<=3; i++){
			try{
				try{
					System.out.println("Tran ID " + i + " - " + tranId[i]);
				}catch(Exception e){
					System.out.println("Exception - Nested try catch");
				}
				System.out.println("Trying to print the value of name " + name.length());
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Error accessing Tran Id - " + i + " | " + e.getMessage() + " | ");
				System.out.println("Tran ID " + i + " - " + tranId[0]);
				e.printStackTrace();
			}catch(NullPointerException e){
				System.out.println("name is null");
			}catch(Exception e){
				System.out.println("Exception thrown - " + e.getMessage() + " | ");
			}finally{
				System.out.println("Final statement");
			}
		} 
		 */
	}

	public static void main(String args[]){
		System.out.println("Exception Handling - Unchecked Exception");
		JavaExample011_UncheckedExceptions obj1 = new JavaExample011_UncheckedExceptions();
		obj1.testCase1();
		
		System.out.println("End of Exception Handling - Unchecked Exception");
	}


}
