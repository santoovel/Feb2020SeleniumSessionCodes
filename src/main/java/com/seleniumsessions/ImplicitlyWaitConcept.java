package com.seleniumsessions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//will be applied for all the webelements, and 15 secs applied dynamically
		//applied on driver.. webelements
		// selenium will be waiting for all the webelements to display
		
		// Implicitly wait is Global and it works only for WebElements not for Title or url
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		// static way we should not use
		// Thread.sleep(5000); 
	
		
		 WebElement emailId=driver.findElement(By.id("username"));//5secs
		 WebElement password=driver.findElement(By.id("password")); //1sec
		 WebElement loginButton=driver.findElement(By.id("loginBtn"));//0 sec

		 emailId.sendKeys(("Naveen@gmail.com"));
		 password.sendKeys(("Password"));
		 loginButton.click();
		 
		 //home page:
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //webele1... webelen --> 10 secs
		 
		 //search page: nullify the implicitly wait
		 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		 //webele1... webelen --> 0 secs
		 
		 ////home page:
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //webele1... webelen --> 10 secs
		 
	}

}
