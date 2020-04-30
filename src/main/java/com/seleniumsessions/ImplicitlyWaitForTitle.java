package com.seleniumsessions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitForTitle {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//implicitlyWait not works for titles and Urls
		//System.out.println(driver.getTitle());
		
		 WebElement emailId=driver.findElement(By.id("username"));
		 emailId.sendKeys(("Naveen@gmail.com"));
		 
			//implicitlyWait not works for titles and Urls
			System.out.println(driver.getTitle());
		
	}

}
