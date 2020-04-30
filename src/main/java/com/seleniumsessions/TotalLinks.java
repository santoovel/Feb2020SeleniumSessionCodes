package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//driver.get("https://www.google.in/");
		
		// get total links on the page
		//and text of each link but ignore the blank text
		// Links --> <a href="" signup/>
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		 int totalLinks = linkList.size();
		 System.out.println("Total Links on the page : "+ totalLinks);
		 
		 for(int i=0; i<totalLinks; i++) {
			String linkText = linkList.get(i).getText();
			
			 //To ignore the blank text and to get index number
			if(!linkText.isEmpty()) {
			System.out.print( i +"====>" + linkText+ "====>");
			}
			String attributeText = linkList.get(i).getAttribute("href");
			System.out.println(attributeText);
		 }
	}

}
