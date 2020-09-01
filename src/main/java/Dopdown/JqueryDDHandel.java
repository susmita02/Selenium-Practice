package Dopdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDDHandel {

	
		static WebDriver driver;
		static final String All_Value = "all";
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			

			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
			Thread.sleep(2000);
			driver.findElement(By.id("justAnInputBox")).click();
			Thread.sleep(2000);
		
			
		By choice = By.xpath("//span[@class='comboTreeItemTitle']");
// List<WebElement> choicelist =driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
 selectChoiceValue(choice, JqueryDDHandel.All_Value);
// 
// System.out.println(choicelist.size());
// 
//   for(WebElement ele: choicelist) {
//	 
//	
//	 String text =ele.getText();
//	 System.out.println(text);
//	 if(text.equals("choice 1")) {
//		 ele.click();
//		 break;
//	 }
// }
 driver.quit();
	}
	
//		3 dot parameter for selecting multiple values(String ...)
     public static void selectChoiceValue(By locator, String... value) {
	  List<WebElement> choicelist =driver.findElements(locator);
	  
//	  for single select and multiselect
 if(!value[0].equalsIgnoreCase(JqueryDDHandel.All_Value)) {
	 
	   for(WebElement ele: choicelist) {
		 		
		 String text =ele.getText();
		 for(int i =0; i<value.length; i++) {
			if(text.equals(value[i])) {
				 ele.click();
				 break;
			 }
		 }
	   } 
      } 
// for all values
 else {
	 try {
		 for(WebElement all: choicelist) {
			 all.click();
	 }
	 
	 }catch (Exception e) {
		e.printStackTrace();
	}
 }
	 
  }
}
