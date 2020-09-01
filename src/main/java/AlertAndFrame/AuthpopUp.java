package AlertAndFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthpopUp {

	
		static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
//			 Pass username/password along with url
			driver.get("http://admin:admin@the-internet.heroku.com/basic-auth");

	}

}
