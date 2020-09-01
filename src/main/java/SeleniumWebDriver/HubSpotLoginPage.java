package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.LaunchBrowser("chrome");
		br.getUrl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		
		By username=By.id("username");
		By password = By.id("password");
		By login = By.id("loginBtn");
		
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKeys(username, "test@test.com");
		eu.doSendKeys(password, "test@test.com");
		eu.doClick(login);
	}

}
