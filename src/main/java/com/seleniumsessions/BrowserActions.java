package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {
	WebDriver driver;
	// this method is used to launch  the browser/ initi driver on basis of given browser
	public WebDriver launchBrowser(String browser) {

		//WebDriver driver= null; // never use this in local methods gives null pointer exception
		
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "ie":
			WebDriverManager.getInstance(InternetExplorerDriver.class).setup();
			driver = new InternetExplorerDriver();
			break;	
			
		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver= new SafariDriver();
			break;		
		default:
			System.out.println("Please pass the corect browser-->"+ browser);
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	
	
	
	public void launchUrl(String url) {
		driver.get(url);
		
	}
	
	public String doGetTitle() {
		return driver.getTitle();
		
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
}
