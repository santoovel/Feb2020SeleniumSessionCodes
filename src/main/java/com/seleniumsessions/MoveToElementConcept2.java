package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept2 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement loginLink = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		WebElement spicejetMembersLink = driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"));
		
		doMoveToElement(driver,loginLink,spicejetMembersLink,"Member Login");
	}
	
	public static void doMoveToElement(WebDriver driver, WebElement ele1,WebElement ele2, String value ) {
		Actions action = new Actions(driver);
		action.moveToElement(ele1).build().perform();
		action.moveToElement(ele2).build().perform();
		driver.findElement(By.linkText(value)).click();
	}

}
