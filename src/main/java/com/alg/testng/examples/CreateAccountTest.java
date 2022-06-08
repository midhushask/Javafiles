package com.alg.testng.examples;

import org.testng.annotations.Test;

public class CreateAccountTest {
	
	@Test(priority=0)
	public void createValidAccount() {
		System.out.println("createValidAccount");
	}
	
	@Test(priority=1)
	public void createDuplicateAccount() {
		System.out.println("createDuplicateAccount");
	}

}
