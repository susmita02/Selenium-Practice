package SeleniumWebDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		String browser= "chrome";
		
		BrowserUtil br=new BrowserUtil();
		br.LaunchBrowser(browser);
		
		br.getUrl("https:/google.com");
		
		System.out.println(br.getTitle());

	}

}
