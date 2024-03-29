package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		 By emailId=By.id("username");
		 By password=By.id("password");
		 By loginButton=By.id("loginBtn");
		 By signUp=By.linkText(("Sign up"));
		 
		 getElementWithWait(driver,emailId,6).sendKeys("naveen@gmail.com"); // loop from 0 to 6
		 
		 isElementDisplayed(driver,emailId,6);
		 
		 driver.findElement(password).sendKeys("test@123");
		 driver.findElement(loginButton).click();
	}
	
	//custom wait
	public static WebElement getElementWithWait(WebDriver driver, By locator, int timeout) {
		WebElement element = null;
		for(int i=0; i<timeout;i++) {
			try {
				element = driver.findElement(locator);
				break;
			} 
			catch(Exception e) {
				System.out.println("waiting for element to present on the page==>"+i+"seconds");
				try {
					Thread.sleep(1000); // we have to wait till element exists
				} catch (InterruptedException e1) {
					
				}
			}
			
		}
		return element;
		
	}
	
	public static boolean isElementDisplayed(WebDriver driver, By locator, int timeout) {
		WebElement element = null;
		boolean flag=false;
		for(int i=0; i<timeout;i++) {
			try {
				element = driver.findElement(locator);
				flag=element.isDisplayed();
				break;
			} 
			catch(Exception e) {
				System.out.println("waiting for element to present on the page==>"+i+"seconds");
				try {
					Thread.sleep(1000); // we have to wait till element exists
				} catch (InterruptedException e1) {
					
				}
			}
			
		}
		return flag;
		
	}
	
	

}
