package com.testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Before Suite method
Before Test method
Before Class method

Before Method method
Test 1
After Method method

After Class method
After Test method
After Suite method

BS
BT
BC

BM t1 AM
BM t2 AM

AC
AT
AS

 * 
 * 
 */
public class TestNGAnnotations {

// pre conditions --> Test + Asserts ===> Post conditions steps
// Before -> @Test --> After

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("prepare test data");
		System.out.println("Before Suite method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println(" Create DB connection");
		System.out.println("Before Test method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launch Browser and URL");
		System.out.println("Before Class method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Login to application");
		System.out.println("Before Method method");
	}
	
	@Test
	public void test1() {
		System.out.println("Check user details");
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Check user created or not");
		System.out.println("Test 2");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("logout");
		System.out.println("After Method method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("close browser");
		System.out.println("After Class method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("disconnect database");
		System.out.println("After Test method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("delete the test data");
		System.out.println("After Suite method");
	}
	
	
}
