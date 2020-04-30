package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSessionConcept {

	public static void main(String[] args) {
		 WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("http://google.com");
		 String title = driver.getTitle();
		 System.out.println("Google Page title: "+ title);
		 
		 // when we quit the browser, Session ID will become null
		// driver.quit(); closes all the browsers
		 
		// keep checkpoint and debug the application to see session id see driver properties
		 // after quitting the browser we cannot perform operation, we get exception below
		 System.out.println(driver.getTitle()); // org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		 
		 driver.close(); // closes only that particular browser
		 // invalid session id after closing the browser.
		 // Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		// keep checkpoint and debug the application to see session id is invalid/expired or not
		 System.out.println(driver.getTitle());
		 
		 
		 //org.openqa.selenium.NoSuchSessionException
		 // when we quit the browser, Session ID will become null
		 // when we cloase the browser, Session ID will become invalid/expired
	}

}
