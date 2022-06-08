package com.alg.testng.examples;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class MessageTest {
	
	@Test(priority=0)
	public void postMessage() {
		System.out.println("postMessage");
		Assert.assertEquals("Expected XYZ", "Actual ABC");
	}
	
	@Test(priority=1, dependsOnMethods= {"postMessage"})
	public void editMessage() {
		System.out.println("editMessage");
	}
	
	@Test(priority=2, dependsOnMethods= {"postMessage"}, alwaysRun=true)
	public void logOut() {
		System.out.println("logOut");
	}

}
