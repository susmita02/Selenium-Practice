package AlertAndFrame;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipConcept {

//To get tooltip click on F12>> source >> f8>> Then page will be freeze
//	Click on element and inspect tootip message box
		static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/tooltip/");
			
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			driver.findElement(By.id("age")).sendKeys("30");
			
			Actions actions = new Actions(driver); 
			actions.moveToElement(driver.findElement(By.id("age"))).perform();
			WebElement ele =driver.findElement(By.className("ui-tooltip-content"));
			
				System.out.println(ele.getText());

	}

}
