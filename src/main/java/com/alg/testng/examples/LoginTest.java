package com.alg.testng.examples;

import org.testng.annotations.Test;

public class LoginTest {
	
	//Launch Webdriver
	//Redirect url
	
	@Test(priority=0, groups= {"LoginTest", "Regression"})
	public void loginValidCredentials() {		
		//login("validUserId@gmail.com", "validPassword");
		System.out.println("loginValidCredentials");
	}
	
	@Test(priority=1, groups= {"LoginTest"})
	public void loginInvalidCredentials() {
		//login("invalidUserId@gmail.com", "invalidPassword");
		System.out.println("loginInvalidCredentials");
	}

}
