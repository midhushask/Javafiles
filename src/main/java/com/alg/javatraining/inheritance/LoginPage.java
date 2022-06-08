package com.alg.javatraining.inheritance;

public class LoginPage extends BasePage{
	
	public void Login(String sUserId, String sPassword) {
		enterText(sUserId);
		enterText(sPassword);
		click();
	}

}
