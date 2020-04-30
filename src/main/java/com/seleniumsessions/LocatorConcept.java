package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws Exception {
	
		// hhttps://app.hubspot.com/login
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	//	driver.get("https://app.hubspot.com/login");  
		
		Thread.sleep(5000);
		
		// Create WebElement and + perform action on it
		
		
		// 1 . id  - 1st preference
		/*
		 * driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		 * driver.findElement(By.id("password")).sendKeys("test@123");
		 * driver.findElement(By.id("loginBtn")).click();
		 */
		
		/*
		WebElement email = 	driver.findElement(By.id("username"));
		WebElement password =  	driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		email.sendKeys("test@gmail.com");
		password.sendKeys("test@123");
		loginButton.click();
		email.sendKeys("san@gmail.com");
		*/
		
		
		// 2. name - 2nd preference
		
		 // http://classic.crmpro.com/
		
		//driver.get("http://classic.crmpro.com/");
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		//WebElement email = 	driver.findElement(By.name("username"));
		//email.sendKeys("test@gmail.com");
		
		//3. classname  - 4th preference
		
		//class and classname both are same
		// email class= form-control private-form__control login-email
		// password form-control private-form__control login-password m-bottom-3
		// try to use unique class name
		
		//driver.get("https://app.hubspot.com/login");  
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		//driver.findElement(By.className("login-password")).sendKeys("test@g123");
		//driver.findElement(By.className("m-bottom-3")).sendKeys("test@g123");
		
		// 4 . xpath  - 3rd preference
		
		//xpath is a locator, but not an attribute
		// this is the address of the element in DOM
		
		//input[@id='username']
		
	//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
	//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
	//	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		
		
		//5. cssSelector is a locator, not an attribute 3rd pref
		
		// href is hyperlink reference
		
	//	driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
	//	driver.findElement(By.cssSelector("#password")).sendKeys("test@gmail.com");
	//	driver.findElement(By.cssSelector("#loginBtn")).click();
		
		//6. linkText : only for links always rep by a tag 
		
		// 
		
		//driver.findElement(By.linkText("Sign up")).click();
		
		
		// partialLinkText: only for links
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//8. tagName  to check how many links present in page
		driver.get("https://www.freshworks.com");
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println("text");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
