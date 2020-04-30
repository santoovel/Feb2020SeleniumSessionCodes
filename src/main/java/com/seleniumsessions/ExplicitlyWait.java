package com.seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		System.out.println(driver.getTitle());
		
		// Explicitly wait : 
		
		getElementWihExpWait(driver,10,By.id("username")).sendKeys("test@123");;
		WebDriverWait wait = new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		
	
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		
		 WebElement emailId=driver.findElement(By.id("username"));
		 emailId.sendKeys(("Naveen@gmail.com"));
		 
		 WebElement password=driver.findElement(By.id("password")); 
		 WebElement loginButton=driver.findElement(By.id("loginBtn"));

		 password.sendKeys(("Password"));
		 loginButton.click();
	}

	public static WebElement getElementWihExpWait(WebDriver driver, int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
}
