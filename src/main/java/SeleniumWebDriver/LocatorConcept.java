package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	
//		1. id:
		
		By username=By.id("username");
		By password = By.id("password");
		By login = By.id("loginBtn");
	
		
//		Approach : 1
//		driver.findElement(username).sendKeys("test@test.com");
//		driver.findElement(password).sendKeys("12345");
//		driver.findElement(login).click();
		
//		Approach : 2
//		getElement(username).sendKeys("test@test.com");
//		getElement(password).sendKeys("12345");
//		getElement(login).click();

		
//		Approach : 3
//		doSendKeys(username, "test@test.com");
//		doSendKeys(password, "12345");
//		doClick(login);
		
		
//		2. Name:
		
//	driver.findElement(By.name("username"));
	
//	    3. ClassName:
	
//		4. Xpath: Address of element in html DOM
		
//		5. CSS Selector: Address of element in html DOM
		
//		6. Link text: only for links with  "a" html tag
		
//      7. Partial Link text	: only for links but not recommended to use
		
//		8. Tag name: html tag
		
//		driver.findElement(By.tagName("h1"));
	
	}
	
	
	

}
