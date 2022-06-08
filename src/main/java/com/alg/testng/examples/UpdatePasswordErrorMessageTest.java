package com.alg.testng.examples;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UpdatePasswordErrorMessageTest {
	
	@DataProvider(name="passwordErrorMessageDataProvider", parallel=true)
	public static Object[][] passwordErrorMessageDataProvider(){
		String[][] passwordErrorMessageTestData = new String[3][2];
		passwordErrorMessageTestData[0][0] = "password1";
		passwordErrorMessageTestData[0][1] = "Atleast one uppercase character required";
		passwordErrorMessageTestData[1][0] = "Password";
		passwordErrorMessageTestData[1][1] = "Atleast one numeric character required";
		passwordErrorMessageTestData[2][0] = "Pass1";
		passwordErrorMessageTestData[2][1] = "Atleast 8 character length required";
		
		return passwordErrorMessageTestData;
	}
			
	@Test(dataProvider="passwordErrorMessageDataProvider")
	public void updatePasswordErrorMessage(String sPassword, String sExpectedErrorMessage) {
		//Launch WebDriver
		//Redirect url
		//Enter sPassword
		//Click on create
		//getText()
		String sActualErrorMessage = "Atleast one uppercase character required";
		System.out.println("Input password: " + sPassword + " | Expected error message: " + sExpectedErrorMessage);
		Assert.assertEquals(sExpectedErrorMessage, sActualErrorMessage);
	}

}
