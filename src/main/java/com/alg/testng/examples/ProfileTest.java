package com.alg.testng.examples;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProfileTest {
	
	@Test(priority=0, groups={"ProfileTest", "Regression"})
	public void editWorkStatus() {
		System.out.println("editWorkStatus");
	}
	
	@Test(priority=1, groups={"ProfileTest"})
	public void editCurrentResidence() {
		System.out.println("editCurrentResidence");
	}
	
	@Parameters({"hobby", "sports"})
	@Test(priority=2)
	public void editActivities(String sHobby, @Optional("IamOptional") String sSports) {
		System.out.println("editActivities - " + sHobby + " and " + sSports);
	}
	
	@Test(enabled=false)
	public void modifiedRequirement() {
		System.out.println("modifiedRequirement");
	}

}
