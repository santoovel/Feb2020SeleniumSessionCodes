package com.seleniumsessions;

public class GoogleTestBrowserActions {

	public static void main(String[] args) {
		
		BrowserActions br = new  BrowserActions();
		br.launchBrowser("chrome");
		br.launchUrl("http:///www.google.com");
		//br.launchUrl("http:///www.rediff.com");
		
		String title = br.doGetTitle();
		System.out.println("Google page Title is : "+ title);
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		br.closeBrowser();
		br.quitBrowser();

	}

}
