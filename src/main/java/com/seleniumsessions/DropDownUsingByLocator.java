package com.seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownUsingByLocator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		
		List<String> dayList = getDropdownValues(driver,day);
		
		System.out.println("total days==> "+ dayList.size());
		System.out.println(dayList);
		
		List<String> monthList = getDropdownValues(driver,month);
		System.out.println("total months==> "+ monthList.size());
		System.out.println(monthList);
		
		List<String> yearList = getDropdownValues(driver,year);
		System.out.println("total years==> "+ yearList.size());
		System.out.println(yearList);
		
	}
	
	public static List<String> getDropdownValues(WebDriver driver,By locator) {
		List<String> ar = new ArrayList<String>();
		ElementUtil2 elementUtil = new ElementUtil2(driver);
		//elementUtil.getElement(locator);
		
		 Select select = new Select(elementUtil.getElement(locator)); 
		 
	    List<WebElement> optionsList = select.getOptions();
	 
		 // System.out.println("Total size is : "+ optionsList.size());
		  for(int i = 0; i<optionsList.size();i++) {
			//  System.out.println(optionsList.get(i).getText());
			  ar.add(optionsList.get(i).getText());
		  }
		  
		  return ar;
	}

}
