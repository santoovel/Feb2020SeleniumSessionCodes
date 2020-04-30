package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> linksList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println("Totla links are :" + linksList.size());
		
		for(int i = 0 ; i < linksList.size(); i++) {
			String text = linksList.get(i).getText();
			
			// to click  links on new tab's
			//String opentabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
			// linksList.get(i).sendKeys(opentabs);
			
			
		   //	driver.navigate().to(linksList.get(i));
			  // to click on links
			   System.out.println(text);
			   linksList.get(i).click(); 
			  
			   linksList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			
			 
		}
	}

}
