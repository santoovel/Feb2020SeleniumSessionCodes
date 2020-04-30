package com.testng;

import org.testng.annotations.Test;

public class PriorityConceptTest {
// alpha order initially
//else priority
	//priority=0 also we can give
	// priority can be negative also
	// non priority will be executed first
	
	
	@Test(priority=-1)
	public void atest() {
		System.out.println("A test");
	}
	@Test(priority=-2)
	public void btest() {
		System.out.println("B test");
	}
	@Test(priority=1)
	public void ctest() {
		System.out.println("C test");
	}
	@Test(priority=2)
	public void dtest() {
		System.out.println("D test");
	}
	@Test()
	public void etest() {
		System.out.println("e test");
	}
}
