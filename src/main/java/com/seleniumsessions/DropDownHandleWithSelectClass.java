package com.seleniumsessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

// select based dropdown
public class DropDownHandleWithSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		  Select select = new Select(day);
		  select.selectByVisibleText("15");
		  //this is the best one select.selectByIndex(20); // will use when values never change
		  select.selectByValue("9"); // value tag should be there
		  
		  System.out.println(select.isMultiple());
		  
		  Select select1 = new Select(month); select1.selectByVisibleText("Jun");
		  //this is the best one select1.selectByIndex(2); // will use when values  never change
		  select1.selectByValue("9"); // value tag should be there
		  
		  
		  Select select2 = new Select(year); 
		  select2.selectByVisibleText("1990");
		  
		  List<WebElement> dayList = select.getOptions();
		  
		  System.out.println("Total size is : "+ dayList.size());
		  for(int i = 0; i<dayList.size();i++) {
			  System.out.println(dayList.get(i).getText());
		  }
		  
		  List<WebElement> monthList = select1.getOptions();
		  
		  System.out.println("Total size is : "+ dayList.size());
		  for(int i = 0; i<monthList.size();i++) {
			  System.out.println(dayList.get(i).getText());
		  }
		  
		  
		  
		// Here we are creating 3 dropdowns, we are creating 3 select classes
		
		selectDropDownByValue(day,"5");
		selectDropDownByValue(month,"Feb");
		selectDropDownByValue(year,"2005");
		
		
		
		getDropdownValues(day);
		  getDropdownValues(month);
		  getDropdownValues(year);
	}
	
	public static void selectDropDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	public static void selectDropDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void getDropdownValues(WebElement element) {
		 Select select = new Select(element); 
	  List<WebElement> optionsList = select.getOptions();
	 
		  System.out.println("Total size is : "+ optionsList.size());
		  for(int i = 0; i<optionsList.size();i++) {
			  System.out.println(optionsList.get(i).getText());
		  }
	}
	
	
	}


