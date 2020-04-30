package com.testng;

import org.testng.annotations.Test;

public class DependsOn {

	@Test
	public void login() {
		System.out.println("login");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="login",priority=1)
	public void home() {
		System.out.println("home");
	}
	@Test(dependsOnMethods="login",priority=2)
	public void search() {
		System.out.println("search");
	}
	
}
