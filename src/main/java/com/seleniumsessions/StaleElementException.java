package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://classic.crmpro.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Naveen");
		driver.navigate().refresh(); // we will get stale element exception new dom will come
		// staled means not fresh and element is not fresh
		
		username = driver.findElement(By.name("username"));
		username.sendKeys("SeleniumUser");  
		
		
	}

}
