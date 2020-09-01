package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		ChromeOptions co= new ChromeOptions();
		
		co.addArguments("--headless");
//		co.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		

		
		
		
		 driver.get("http://www.google.com");
		 System.out.println(driver.getTitle());

	}

}
