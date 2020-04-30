package com.seleniumsessions;

public class XpathCustom {

	public static void main(String[] args) {
		
		//xpath: address of the element in html dom
		//1. absolute xpath: /html/body/dev/dev[2]/div[3]/ul/li/a
		//2. relative xpath/ custom: //input[@id='testid']
		
		//htmltag[@attributeproperty='value']
		//input[@id='username']
		//*[@id='username']  //always use htmltag instead of * performance
		
		//htmltag[@attributeproperty1='value' and @attributeproperty1='value' ]
		//input[@id='username' and @type='email']
		//button[@id='loginBtn' and @type='submit']
		
		//button[@type='submit']
		
		//input[@name='username']
		
		 // (//input[@class='form-control'])[1]
		//  (//input[@class='form-control'])[2]
		
		// (//input[@class='form-control'])[position()=1]
		// (//input[@class='form-control'])[position()=2]
				
		// (//input[@class='form-control'])[last()]
		
		//Linktext
		
		// //i18n-string[text()='Sign up']
		
		// //a[text()='Sign Up']
		
	//	//i18n-string[text()='Don't have an account?']
		
		//*[text()='Remember me']
		
	//	//a[@href='https://register.freecrm.com/register/']  // never use href like this
		
		//a : total links
		
	//	driver.findElements: //ul[@class='nav navbar-nav navbar-right']/li/a
		
		//ul[@class='nav navbar-nav navbar-right']/li/a[text()='Pricing']
		//li/a[text()='Pricing']
		//a[text()='Pricing']  imp
		
		//ul[@class='list-nav-links']/li/a   //horizontal
		
		// //div[@id='main_b_footer_second_block']/ul/li/a    //vertical
		
		//div[@id='main_b_footer_second_block']//li   // for indirect child / for direct child
		
		//div/input  single slash gives direct count of elements====> 2 elements
		//div//input double slash gives direct and indirect count of elementsindirect=== 3 elements
		
		// contains() == to handle dynamic elements
		
		//input[contains(@id,'username')]  contains() for partial part ,
		//input[contains(@id,'user')] 
		//input[contains(@id,'name')]
		
		//input[contains(@id,'name') and @type='email' ]
		//input[contains(@id,'name') and contains(@type,'email') ]  
		
		// contains and text both
		
		//i18n-string[contains(@data-key,'login.signupLink.cta') and text()='Sign up' ]
		
		//input[@id='username'] 
		
		//i18n-string[contains(text(),'Sign up')]
		
		// Custom CSSSelector
		
		// id ==> #valueofID ==> #id or htmltag#id ( good one)
		//class ==> .classname
		
		 // #username
		// input#username
		 
		// .login-email
		// input.login-email
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
				

	}

}
