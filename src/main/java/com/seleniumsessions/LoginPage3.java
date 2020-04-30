package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage3 {

	//By locators ---- page objects

	static By emailId = By.id("username");
	static By password = By.id("password");
	static By loginButton = By.id("loginBtn");
	static By signUpLink = By.linkText("Sign up");
	// static By homePageHeader = By.className("private-page__title");
	static By homePageHeader = By.cssSelector("h1.private-page__title");

	
	
	public static void main(String args[]) throws Exception {
		BrowserActions br= new BrowserActions();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		ElementUtil2 elementUtil = new ElementUtil2(driver);
		
		/* can use like this initially
		 * 
		 * elementUtil.getElement(emailId).sendKeys("naveenanimation30@gmail.com");
		 * elementUtil.getElement(password).sendKeys("Test@1234");
		 * elementUtil.getElement(loginButton).click();
		 */
		
		// 2nd approach and less noisy
		elementUtil.doSendKeys(emailId, "naveenanimation30@gmail.com");
		elementUtil.doSendKeys(password, "Test@1234");
		elementUtil.doClick(loginButton);
		
		Thread.sleep(7000);
		
		
		
		String header = elementUtil.doGetText(homePageHeader);
		
		System.out.println("Home page header is: ==" + header);
		
		if(header.contains("Sales Dashboard")) {
			System.out.println("User logged in successfully ....");
		}
		else {
			System.out.println("Could not login ....");
		}
		
		
		System.out.println("Title is + "+br.doGetTitle());
		
		
		
	}

}