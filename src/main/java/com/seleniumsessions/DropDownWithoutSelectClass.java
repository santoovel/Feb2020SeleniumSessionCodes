package com.seleniumsessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		String dob="25-Jan-2019";
		
		String dayOptionXpath = "//select[@id='day']/option";
		String monthOptionXpath = "//select[@id='month']/option";
		String yearOptionXpath = "//select[@id='year']/option";
		
		String dayOptioncss = "select#day option";
		String monthOptioncss = "select#month option";
		String yearOptioncss = "select#year option";

			doSelectValue(driver,"xpath",dayOptionXpath,dob.split("-")[0]);
			doSelectValue(driver,"xpath",monthOptionXpath,dob.split("-")[1]);
			doSelectValue(driver,"xpath",yearOptionXpath,dob.split("-")[2]);
			
			doSelectValue(driver,"css",dayOptioncss,dob.split("-")[0]);
			doSelectValue(driver,"css",dayOptioncss,dob.split("-")[0]);
			doSelectValue(driver,"css",dayOptioncss,dob.split("-")[0]);
		
		/*
		 * List<WebElement> valuesList =
		 * driver.findElements(By.xpath("//select[@id='day']/option")); for(int i = 0;
		 * i< valuesList.size();i++) { if(valuesList.get(i).getText().equals("10")) {
		 * valuesList.get(i).click(); } }
		 */
	}
	
	
	public static void doSelectValue(WebDriver driver, String locator,String locatorValue ,String value) {
		
		List<WebElement> valuesList = null;
		if(locator.equals("xpath"))
				{
			valuesList=driver.findElements(By.xpath(locator));
		}
		else if(locator.equals("css")){
			valuesList=driver.findElements(By.cssSelector(locator));
		}
		
		System.out.println(valuesList.size());
	
	
		for(int i = 0; i< valuesList.size();i++) {
		if(valuesList.get(i).getText().equals(value))
		{ 
			valuesList.get(i).click();
		}
		}
		
	}

}
