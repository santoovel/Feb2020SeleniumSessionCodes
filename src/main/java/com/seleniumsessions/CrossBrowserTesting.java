package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {

		String browser = "firefox";

		WebDriver driver = null;

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else  if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.safari.driver", "./Drivers/geckodriver.exe");
			driver = new SafariDriver();
		}
		else {
			System.out.println("browser is not found-- "+ browser);
		}

		//launch url
		driver.get("http://google.com");  // works fine without www

		// Get the page title
		String title = driver.getTitle();
		System.out.println("Google Page title: "+ title);
		
		
		driver.quit();
	}

	
}
