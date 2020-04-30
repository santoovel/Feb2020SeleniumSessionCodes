package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandleEx1 {

	public static void main(String[] args) {
		// http://londonfreelance.org/courses/frames/index.html
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		driver.manage().window().maximize();
		
		// frame have 4 methods.. which is method overloading
		// driver.switchTo().frame("main");
		 //  driver.switchTo().frame(2);
		
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		//WebElement header = driver.findElement(By.tagName("h2"));
		
		WebElement header = driver.findElement(By.xpath("/html/body/h2"));
		System.out.println(header.getText());
		driver.switchTo().defaultContent();
		
		

	}

}
