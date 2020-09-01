package LocatorsCustomized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hubspot {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();

		
		 driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By username = By.id("username");
		By password = By.id("password");
		By Login = By.id("loginBtn");
		
		WebElement UName = driver.findElement(username);
		WebElement Pwd = driver.findElement(password);
		WebElement LgnBtn = driver.findElement(Login);
		
		
		UName.sendKeys("susmitaupasana86@gmail.com");
		Pwd.sendKeys("Upasana@02");
		LgnBtn.click();
		Thread.sleep(5000);
		driver.navigate().to("https://app.hubspot.com/contacts/8245324/contacts/list/view/all/");
		Thread.sleep(5000);
		
//		Backward traversing in xpath
		//input[@id='username']/../../..
		
//      Child Xpath
		//div[@class = 'private-form__input-wrapper']//child::input[@id='username']
		
//		Parent Xpath
		//input[@id='username']//parent::div
		
//		Ancestor Xpath
		//input[@id='username']//acestor::div
		
//      Siblings Xpath
        //span[text()='Susmita P']//ancestor::td//preceding-sibling::td
		//span[text()='"+name+"']//ancestor::td//following-sibling::td/a
		
//		driver.findElement(By.xpath("//span[text()='Susmita P']//ancestor::td//preceding-sibling::td")).click();
		selectContact("Susmita P");
		String email =getContactEmail("upasana P");
		System.out.println(email);
		driver.quit();
	}
	
	public static void selectContact(String name) {
		
	driver.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//preceding-sibling::td")).click();
		
	}
	public static String getContactEmail(String name) {
		
		return driver.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//following-sibling::td/a")).getText();
			
		}
}
