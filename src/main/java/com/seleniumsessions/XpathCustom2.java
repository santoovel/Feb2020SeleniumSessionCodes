package com.seleniumsessions;

public class XpathCustom2 {

	public static void main(String[] args) {
		
		//input[starts-with(@id,'user')]
		
		// https://app.hubspot.com/contacts/6329229/contacts/list/view/all/
		
		// to get the check box in contacts page
		//span[text()='Rudra LN3']//ancestor::td//preceding-sibling::td//input
		
		// ancestor is grand parent
		//preceding-sibling is before one
		//following-sibling is right side one next one
		
		
		
		// to get the mail id in contacts page 
		//span[text()='Vandana LN1']//ancestor::td//following-sibling::td//a

		
		// https://classic.freecrm.com/index.cfm?CFID=828929&CFTOKEN=35973812&jsessionid=483063afeda887820093a5a2a1348a3d2a31
		
		//reverse
		
		//a[text()='Ajay Kumar']//parent::td//preceding-sibling::td/input[@type='checkbox']
		
		//a[text()='Ajay Kumar']//parent::td//following-sibling::td/a
		
		//a[text()='Ajay Kumar']//parent::td//following-sibling::td/a[@_name]
		
		//https://www.espncricinfo.com/series/19832/scorecard/1220280/england-vs-sri-lanka-8th-match-carlton-&-united-series-retrolive-2019-20
		
		
		
		
		
		
	}

}
