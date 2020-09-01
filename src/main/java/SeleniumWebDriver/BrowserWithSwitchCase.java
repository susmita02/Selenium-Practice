package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWithSwitchCase {

	public static void main(String[] args) {
		
		
		
		
		WebDriver driver = null ;
		String browser = "chrome";
		
		switch (browser) {
		
		case "chrome":
			
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			break;
		case "fireFox":
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
				break;
		default:
			break;
		}
		
		driver.get("http://google.com");

	}

}
