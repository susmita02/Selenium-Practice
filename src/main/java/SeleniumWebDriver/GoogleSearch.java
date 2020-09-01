package SeleniumWebDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			BrowserUtil br = new BrowserUtil();
			driver = br.LaunchBrowser("chrome");
			br.getUrl("https://www.google.com");
			By name = By.name("q");
			ElementUtil eu = new ElementUtil(driver);
			eu.doSendKeys(name, "testing");
			Thread.sleep(5000);
			By suggessionbox = By.xpath("//div[@class= 'UUbT9']//ul[@class='erkvQe']/li//div[@class='sbl1']/span");
			
			eu.doClickSuggessionBox(suggessionbox, "testing interview questions");
			

	}

}
