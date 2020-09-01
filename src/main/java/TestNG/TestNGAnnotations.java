package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	
	@BeforeSuite
	public void connectDB() {
	System.out.println("BS...Connect to DB ");
	}
	
	@BeforeTest
	public void createUserInDB() {
    System.out.println("BT...Create user in DB ");
	}
	
	@BeforeClass
	public void LoginToBrowser() {
    System.out.println("BC...Login to browser ");
	}
	
	@BeforeMethod
	public void logintoApp() {
    System.out.println("BM...Login to app ");
	}
	
	@Test
	public void homePageProfileTest() {
		System.out.println("Homepage profile Test");
	}
	
	
	
	
	
	@AfterMethod
	public void closeApp() {
		System.out.println("AM...Close App");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC...Close Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT..delete user.");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS..disconnect DB");
	}
	
	
	
	
	
	
	
	
	
}
