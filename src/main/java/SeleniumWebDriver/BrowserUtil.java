package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	WebDriver driver;
	
	/**
	 * To initiate browser
	 * @param Browser
	 * @return driver
	 */
	
	public WebDriver LaunchBrowser(String Browser) {
		
	
		if(Browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
			
		}
		else if(Browser.equalsIgnoreCase("ie")) {
		
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("No browser found");
		}
		
		return driver; 
		 
	}
	
	/**
	 * This is to launch url
	 * @param url
	 */
	public void getUrl(String url) {
		driver.get(url);
	}
	
	/**
	 * This is to get page title
	 * @param title
	 * @return Page title
	 */
public String getTitle() {
		
	return driver.getTitle();
	
	}
public String getCurrentUrl() {
	return driver.getCurrentUrl();
}

}
