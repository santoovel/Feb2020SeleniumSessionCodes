package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		/*
		 * WebDriver driver; // It will download chromedriver.exe file automatically for
		 *  WebDriverManager.chromedriver().setup();
		 * 
		 * driver = new ChromeDriver(); driver.get("http://google.com"); // works fine
		 * without www
		 * 
		 * // Get the page title 
		 * String title = driver.getTitle();
		 * System.out.println("Google Page title: "+ title);
		 */
		
		String browser = "firefox";

		WebDriver driver = null;

		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else  if(browser.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			 WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
		//	System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			WebDriverManager.getInstance(InternetExplorerDriver.class).setup();
			driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
		//	System.setProperty("webdriver.safari.driver", "./Drivers/geckodriver.exe");
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		}
		else {
			System.out.println("browser is not found-- "+ browser);
		}

		//launch url
		driver.get("http://google.com");  // works fine without www
		
		driver.navigate().to("http://www.rediff.com/");

		// Get the page title
		String title = driver.getTitle();
		System.out.println(" Page title: "+ title);
		
		
		driver.quit();
	}

}
