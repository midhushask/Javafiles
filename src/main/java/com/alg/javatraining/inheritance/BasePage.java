package com.alg.javatraining.inheritance;

public class BasePage {
	
	public void openBrowser() {
		
	}
	
	public void click() {
		//Some code which will click on the required button
	}
	
	public void enterText(String sData) {
		//Some code which will enter sData into the required textbox
		System.out.println("Entering data - " + sData);
	}
	
	public String getText() {
		//Some code which will read/get data from the required label
		return "Error Message";
	}
	
	public void selectOptionFromDropdown() {
		//Some code which will select option from the required dropdown
	}
	
	public void selectDataInCalendar() {
		
	}
	
	public boolean isEnabled() {
		return true;
	}

}
