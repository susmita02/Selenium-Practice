package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMLogin {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.LaunchBrowser("chrome");
		br.getUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//	By FreeTrial = By.className("trial-btn");
//	
//	WebElement ele = driver.findElement(FreeTrial);
//		
//		
		ElementUtil eu = new ElementUtil(driver);
//		
//		boolean b =eu.doIsDisplayed(FreeTrial);
//		System.out.println(b);
		
		
		By country=By.id("Form_submitForm_Country");
		By industry = By.id("Form_submitForm_Industry");
		eu.doSelectByIndex(industry, 2);
//		eu.doSelectByValue(country, "India");
		eu.doClickDropdownList(country, "India");
		
	
	
//		WebElement countryli = driver.findElement(country);
//		Select select = new Select(countryli);
//		List<WebElement> countryList =select.getOptions();
//		System.out.println(countryList.size());
//		
//		for(WebElement ele: countryList) {
//		String text=ele.getText();
//		
//		if(text.equalsIgnoreCase("India")) {
//			ele.click();
//		}
//		}
		
		

}
	public static WebElement getElement(By locator) {
		WebElement element= driver.findElement(locator);
		return element;
	}
	
	
	
}