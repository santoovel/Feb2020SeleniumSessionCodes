package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob="23-Nov-1975";
		
		selectDropDown(day,dob.split("-")[0]);
		selectDropDown(month,dob.split("-")[1]);
		selectDropDown(year,dob.split("-")[2]);
		
		/*
		 * Select select = new Select(month);
		 * 
		 * List<WebElement> valuesList = select.getOptions();
		 * System.out.println(valuesList.size());
		 * 
		 * for(int i = 0; i< valuesList.size();i++) { // instead of selectbyvisibletext
		 * if(valuesList.get(i).getText().equals("Jun")){ valuesList.get(i).click();
		 * break; }
		 * 
		 * }
		 */

	}
	
	
	
	// Generic methods
	public static void selectDropDown(WebElement element, String value) {
		Select select = new Select(element);
		  
		  List<WebElement> valuesList = select.getOptions();
		  System.out.println(valuesList.size());
		  
		  for(int i = 0; i< valuesList.size();i++) {
			// instead of selectbyvisibletext
			if(valuesList.get(i).getText().equals(value)){
				  valuesList.get(i).click();
				  break;
			  }
			  
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
