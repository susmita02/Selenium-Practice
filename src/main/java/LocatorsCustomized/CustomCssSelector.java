package LocatorsCustomized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomCssSelector {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
//		 text() function does not support in css
//		cannot do backward traversing in css
//		id= #id
//		classname=.classname
//		#username
//		#username.form-control
		driver.findElement(By.cssSelector("#username.form-control"));
		
//		input[id='username']
//		input[id='username'][type ='username']
//		form-control.private-form__control.login-password.m-bottom-3
//	Parent to child	
//		div.private-form__input-wrapper>input
//		div.private-form__input-wrapper input
		
//		ul.footer-nav>li>a
//		input[id*='username']------contains
//		input[id^='user']-----starts with
//		input[id$='name']-----ends with
		
//		comma in css
		
//		input#username,input#password
		
		
//		nth of type:
		
//		ul.footer-nav li:nth-of-type(2)---for specific index
//		ul.footer-nav li:nth-of-type(n)---for all element
//		ul.footer-nav li:nth-of-type(2) a
		
//to move from siblings to sibling use +	(only for following siblings)	
		
//	ul.footer-nav+li
		
//		input.form-control.private-form__control:not(#password)---not operator
		
		
	}

}
