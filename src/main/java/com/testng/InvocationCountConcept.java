package com.testng;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	// generally used in API testing
	@Test(invocationCount=10)
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test(invocationCount=20)
	public void createuserTest() {
		System.out.println("Create user Test");
	}
	
	
	
}
