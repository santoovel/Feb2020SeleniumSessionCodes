package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// get and navigate both are used to launch URL
		driver.get("http:www//google.com/");    // driver wait till the whole site or page gets loaded

		driver.navigate().to("https://www.rediff.com/"); //driver will not wait till the whole site or page gets loaded
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		
		
		
		// Get the page title
		String title = driver.getTitle();
		System.out.println("Page title: "+ title);


	}

}
