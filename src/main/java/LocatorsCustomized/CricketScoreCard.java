package LocatorsCustomized;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();

		
		 driver.get("https://www.espncricinfo.com/series/8674/scorecard/1187716/new-zealand-women-vs-south-africa-women-3rd-odi-icc-womens-championship-2017-18-2021");
		Thread.sleep(5000);
		
				
//		System.out.println(getCBName("LR Down"));
//		System.out.println(getCBName("SW Bates"));
		
        getScoreCard("LR Down");
		driver.quit();
	}


//	public static String getCBName(String name) {
//	return driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td//following-sibling::td/span")).getText();	
//	}
	
	public static String getScoreCard(String name) {
    List<WebElement>list=driver.findElements(By.xpath("//a[text()='"+name+"']//parent::td//following-sibling::td//following-sibling::td"));
		
		int scorecard =list.size();
		System.out.println("Scorecard size is  " +scorecard);
		for(int i=0; i<scorecard;i++) {
			String score=list.get(i).getText();
			System.out.println(score);
	}
		return name;
	
	}
}
