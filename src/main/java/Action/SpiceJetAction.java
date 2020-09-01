package Action;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetAction {

		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();

			driver.get("https://www.spicejet.com/");
			
			Thread.sleep(10000);
//			 By addon = By.id("highlight-addons");
//			 By SpiceMAX = By.xpath("//li[@id= 'header-addons']/ul[@class='add-ons-tab']/li/a[contains(text(), 'SpiceMAX')]");
//			 
//			 WebElement addonselect = driver.findElement(addon);
//			 WebElement SpiceMaxclick = driver.findElement(SpiceMAX);
			 
			 
			 
//			 Actions action = new Actions(driver);
//			 action.moveToElement(addonselect).build().perform();
//			 SpiceMaxclick.click();
//			 mousehoverclick(addon, SpiceMAX);
			
			By login = By.xpath("//a[@id='ctl00_HyperLinkLogin'][text()='Login / Signup']");
			By SpiceclbMember = By.xpath("//li[@class='hide-mobile']/a[text()='SpiceClub Members']");
			By MemberLogin = By.xpath("//ul//li[@class='hide-desktop']/a[text()='Member Login']");
			
			WebElement loginele = driver.findElement(login);
			WebElement SpiceMbrele = driver.findElement(SpiceclbMember);
			WebElement Memberlogele = driver.findElement(MemberLogin);
			
			Actions action = new Actions(driver);
			action.moveToElement(loginele).perform();
			System.out.println("Login button clicked");
			action.moveToElement(SpiceMbrele).perform();
			System.out.println("spicemember button clicked");
//     		action.moveToElement(Memberlogele).click().perform();
//			Thread.sleep(2000);
			Memberlogele.click();
			System.out.println("memberlogin button clicked");
					 
	}

		public  static WebElement getElement(By locator1) {
			WebElement element= driver.findElement(locator1);
			return element;
		}
		
		public static void mousehoverclick(By locator1, By locator2) {
			Actions action = new Actions(driver);
			 action.moveToElement(getElement(locator1)).build().perform();
			 (getElement(locator2)).click();
		}
		public static void multimousehoverclick(By locator1, By locator2, By locator3) {
			Actions action = new Actions(driver);
			 action.moveToElement(getElement(locator1)).moveToElement(getElement(locator1)).build().perform();
			 (getElement(locator3)).click();
		}
		
		

}
