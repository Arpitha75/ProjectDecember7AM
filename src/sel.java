import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sel {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver", "D:\\Java workspace\\FirstSelenium\\Driver\\IEDriverServer.exe");
		WebDriver web = new InternetExplorerDriver();
		
		web.get("https://www.facebook.com");
		String url = web.getCurrentUrl();
		System.out.println(url);
		String title = web.getTitle();
		System.out.println(title);
		
	}
	

}