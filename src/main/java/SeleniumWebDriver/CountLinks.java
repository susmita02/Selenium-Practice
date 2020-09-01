package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountLinks {

	public static void main(String[] args) {

               WebDriver driver;
	
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				driver.get("https://freshworks.com");

			List<WebElement> list =driver.findElements(By.xpath("//div[@class='footer-main']//a"));
			System.out.println(list.size());
			for(WebElement ele : list) {
			System.out.println(ele.getText());
			}
//	WebElement platformlinktext=driver.findElement(By.linkText("platform"));
//	
//	if(platformlinktext.isDisplayed()) {
//		String platformText=platformlinktext.getText();
//		System.out.println(platformText);
//	}
		
//	list.stream().forEach(ele ->System.out.println(ele.getText());
	list.stream().forEach(ele -> System.out.println(ele.getText()));
	
	
	}
//	List<WebElement> list =driver.findElements(By.xpath("//div[@class='footer-main']//a"));

}
