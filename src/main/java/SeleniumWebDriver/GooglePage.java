package SeleniumWebDriver;

public class GooglePage {

	public static void main(String[] args) {
		BrowserUtil bu = new BrowserUtil();
		bu.LaunchBrowser("chrome");
		bu.getUrl("https://google.com");
		System.out.println(bu.getTitle());
		System.out.println(bu.getCurrentUrl());

	}

}
