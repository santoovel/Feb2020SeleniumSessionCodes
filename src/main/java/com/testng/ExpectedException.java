package com.testng;

import org.testng.annotations.Test;

public class ExpectedException {

	// this is just feature and not much used in selenium
	@Test(expectedExceptions = ArithmeticException.class)
	public void test1() {
		System.out.println("test1");
		int i= 9/0;
		System.out.println("ABC"); // will not be printed
	}
	
}
