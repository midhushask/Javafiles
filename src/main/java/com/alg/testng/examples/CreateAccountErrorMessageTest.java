package com.alg.testng.examples;

import org.testng.annotations.Test;

public class CreateAccountErrorMessageTest {
	
	@Test(priority=2)
	public void missingFirstName() {
		System.out.println("missingFirstName");
	}
	
	@Test(priority=3)
	public void missingLastName() {
		System.out.println("missingLastName");
	}
	
	@Test(priority=4)
	public void missingEmail() {
		System.out.println("missingEmail");
	}

}
