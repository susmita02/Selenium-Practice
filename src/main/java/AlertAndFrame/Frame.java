package AlertAndFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	
	
	 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
	//1. Frame by index		
//		driver.switchTo().frame(2);
		
//	2. Frame by name
//		driver.switchTo().frame("main");
		
//3. Frame by webelement
		driver.switchTo().frame(driver.findElement(By.name("main")));
		WebElement header = driver.findElement(By.tagName("h2"));
		System.out.println(header);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
