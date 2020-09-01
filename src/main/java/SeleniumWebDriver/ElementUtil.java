package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	/**
	 * 
	 * This is used to create webelement with the basis of locator
	 * @param locator
	 * @return webelement
	 */
	public  WebElement getElement(By locator) {
		WebElement element= driver.findElement(locator);
		return element;
	}
	
	public  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public  void doClick(By locator) {
		getElement(locator).click();
	}
	
	public  boolean doIsDisplayed(By locator) {
			return getElement(locator).isDisplayed();
		
	}
	
	public void doLinkClick(List<WebElement> list,String value ) {
		
		System.out.println(list.size());
		for(WebElement ele : list) {
		String text= ele.getText();
		if(text.equalsIgnoreCase(value)) {
			ele.click();
			break;
		}
		}
	}
	
//*********************** Dropdown Select Util******************************
	
		public  void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
			select.selectByIndex(index);
		}
		
		public  void doSelectByVisibleText(By locator, String value) {
			
			Select select = new Select(getElement(locator));
			select.selectByVisibleText(value);
		}
		public  void doSelectByValue(By locator, String value) {
			
			Select select = new Select(getElement(locator));
			select.selectByValue(value);
		}
		
		public  void doClickDropdownList(By locator, String value) {
			
			Select select = new Select(getElement(locator));
			List<WebElement> List =select.getOptions();
			System.out.println(List.size());
			
			for(WebElement ele: List) {
			String text=ele.getText();
			
			if(text.equalsIgnoreCase(value)) {
				ele.click();
				break;
			}
			}
		}
        public  int doDropdownListCount(By locator) {
			
			Select select = new Select(getElement(locator));
			List<WebElement> List =select.getOptions();
			return List.size();
			
		}
        
          public void doDropdownList(By locator) {
			
			Select select = new Select(getElement(locator));
			List<WebElement> List =select.getOptions();
			List.stream().forEach(ele->System.out.println(ele.getText()));
			
		}
          public void doclickDropdownWithoutSelect(By locator, String value) {
      		List<WebElement>  List= driver.findElements(locator);
      		for(WebElement ele: List) {
      			String text = ele.getText();
      			if(text.equalsIgnoreCase(value)) {
      				ele.click();
      				break;
      			}
      		}
      	}
          
          public void doClickSuggessionBox(By locator, String value) {
        	  
        	  List<WebElement> List =driver.findElements(locator);
  			
  			System.out.println(List.size());
  			for(WebElement ele:List ) {
  				 String text= ele.getText();
  				 
  				 if(text.equalsIgnoreCase(value)) {
  					 ele.click();
  					 break;
  				 }
  			}

          }
          
//          ************************** Action Class************************
          
          public  void mousehoverclick(By locator1, By locator2) {
  			Actions action = new Actions(driver);
  			 action.moveToElement(getElement(locator1)).build().perform();
  			 (getElement(locator2)).click();
  		}
  		public  void multimousehoverclick(By locator1, By locator2, By locator3) {
  			Actions action = new Actions(driver);
  			 action.moveToElement(getElement(locator1)).moveToElement(getElement(locator1)).build().perform();
  			 (getElement(locator3)).click();
  		}
  		
  		
  		
}
