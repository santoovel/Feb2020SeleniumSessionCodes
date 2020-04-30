package com.seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		// Alert is an Interface
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("alert text is :: "+ text);
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct error message");
		}
		else {
			System.out.println("INCorrect error message");
		}
		alert.accept(); // click on ok
		//alert.dismiss(); // cancel the alert
		
		

	}

}
