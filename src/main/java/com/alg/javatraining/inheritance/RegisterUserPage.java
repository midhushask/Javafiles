package com.alg.javatraining.inheritance;

public class RegisterUserPage extends BasePage{
	
	public void registerUser(String sFirstName, String sLastName) {
		enterText(sFirstName);
		enterText(sLastName);
		click();
	}
	
	public String getErrorMessage() {
		return getText();
	}

}
