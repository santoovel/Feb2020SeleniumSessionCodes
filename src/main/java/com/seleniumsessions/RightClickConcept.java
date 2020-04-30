package com.seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(5000);
		// right click on it take all actions click on copy
				//ul/li[contains(@class='context-menu-item')]/span
		
		// task is use By locator
		//WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//By day=By.id("day");
		
		By rightClickMe = By.xpath("//span[text()='right click me']");
		
		
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-item')]/span"));
		
		
		// call the method
		//doRightClick(driver,rightClickMe,optionsList,"Copy");
		//ElementUtil util = new ElementUtil(driver);
		//List<String> rightClickOptionsList = util.getRightClickOptions(driver,rightClickMe,optionsList);
		//System.out.println("Total rightClickOptionsList is "+ rightClickOptionsList.size());
		//System.out.println(rightClickOptionsList);
	}
	
	
	public static void doRightClick(WebDriver driver,By locator, List<WebElement> optionsList, String value) {
		
		ElementUtil elementUtil = new ElementUtil(driver);
		Actions action = new Actions(driver);
		action.contextClick(elementUtil.getElement(locator)).build().perform();
		
		System.out.println("total right click options:==> "+ optionsList.size());
		
		for(int i = 0; i< optionsList.size();i++) {
			String text = optionsList.get(i).getText();
			System.out.println(i+ "==> "+ text);
			if(text.equals(value)) {
				optionsList.get(i).click();
				break;
			}
			
		}
	}

	/*
	 * public static List<String> getRightClickOptions(WebDriver driver,By locator,
	 * List<WebElement> optionsList) { ElementUtil elementUtil = new
	 * ElementUtil(driver); List<String> ar = new ArrayList<String>(); Actions
	 * action = new Actions(driver);
	 * action.contextClick(elementUtil.getElement(locator)).build().perform();
	 * System.out.println("total right click options:==> "+ optionsList.size());
	 * 
	 * for(int i = 0; i< optionsList.size();i++) { String text =
	 * optionsList.get(i).getText(); ar.add(text); } return ar; }
	 */

	
}
