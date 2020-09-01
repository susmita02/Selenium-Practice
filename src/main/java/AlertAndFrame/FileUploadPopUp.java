package AlertAndFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	
//	Can import by using sendkeys as file path from system when type = file
		static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			

			driver.get("http://admin:admin@the-internet.heroku.com/basic-auth");
			driver.findElement(By.name("upfile")).sendKeys("c:\\admin");

	}

}
