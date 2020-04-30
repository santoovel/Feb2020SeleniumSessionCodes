package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics1 {

	public static void main(String[] args) {
	
		WebDriver driver;
		
		// on windows
		//c:\\drivers\\chromedrivers.exe
		
		// to get rid of output warnings for chrome
		
		System.setProperty("webdriver.chrome.silentOutput","true");
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch Google chrome
		driver = new ChromeDriver(); // inside dafault construtor they wrote the code to launch the code to launch browser
		
		driver.manage().window().maximize(); // clicks on maximize button
		driver.manage().window().fullscreen(); // full screen mode no url shown also
		driver.manage().deleteAllCookies();
		
		
		// WebDriver driver2 = new WebDriver();  //cannot instantiate webdriver cannot create object of interface
		//ChromeDriver driver1 = new ChromeDriver(); we can do this but not suggestable if new browser comes tomorrow
		
		
		//driver.get("http://www.google.com");
		
		//driver.get("www.google.com");  // exception invalid argument http:// is mandate
		
		//launch url
		driver.get("http://google.com");  // works fine without www

		// Get the page title
		String title = driver.getTitle();
		System.out.println("Google Page title: "+ title);
		
		//Validation point: actual vs expected result
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		//get current url
		
		System.out.println("Current url is: "+ driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		
		// to verify url
		if(url.contains("google")) {
			System.out.println("correct url");
		}
		else {
			System.out.println("Incorrect url");
		}
		
		// to verify page source
		//System.out.println("Page source is : "+ driver.getPageSource())
		
		//to  quit browser
		
		driver.quit();
		
		// to close andbrowser
		//driver.close();
	}

}
