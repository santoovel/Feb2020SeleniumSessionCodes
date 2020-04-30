package com.testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.testng.MyListenerTest.class)
public class HomeTest extends BaseClass {

	
	@Test
	public void header() {
		System.out.println("Header test");
	}
	
	
}
