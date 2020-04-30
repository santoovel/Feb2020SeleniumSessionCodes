package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		
		//if we click on choose file , a desktop popup will appear
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\SanthoshVeluri\\Desktop\\Hi.txt");
		// this  works when we have type="file".. request the developer
		// if we dont have we cannot do it with selenium and autoit
		
		
		
		
		
		

	}

}
