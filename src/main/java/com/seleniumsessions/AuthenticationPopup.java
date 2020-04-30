package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {

	public static void main(String[] args) {
	//	http://the-internet.herokuapp.com/
		
		// admin, admin
		
			
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	// method 1
	//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	// method 2
	String username = "admin";
	String password ="password";
	
	driver.get("http://"+username+ ":" +password+ "@the-internet.herokuapp.com/basic_auth");
	
	// this pop up is not part of browser and not javascript alert
	// send uname and pwd along with link
	driver.manage().window().maximize();
	
	
	

	}

}
