package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		//headless = no browser
		//Browser is not visible and testing is happening behind the scene and it s very fast
		
		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * ChromeOptions co = new ChromeOptions(); 
		 * co.addArguments("--headless");
		 * co.addArguments("--incognito");
		 * 
		 * WebDriver driver = new ChromeDriver(co);
		 */
		
		 WebDriverManager.firefoxdriver().setup();
		 FirefoxOptions fo = new FirefoxOptions();
		 fo.addArguments("--headless");
		 //fo.addArguments("--incognito");
		 // pass the fo in FirefoxDriver()
		 WebDriver driver = new FirefoxDriver(fo);
		 
		
		driver.get("http://www.google.com"); 
		// Get the page title
		String title = driver.getTitle();
		System.out.println("Google Page title: "+ title);
		
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
	}

}
