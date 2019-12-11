import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Java workspace\\FirstSelenium\\Driver\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/");
		drive.manage().window().maximize();
		WebElement Email = drive.findElement(By.name("email"));
		Email.sendKeys("9080291481");
		WebElement Pass = drive.findElement(By.name("pass"));
		Pass.sendKeys("Jesus@123");
		//WebElement login = drive.findElement(By.name("email"));
		//Email.sendKeys("9080291481");
		//drive.close();
		
		//WebDriver drive1 = new ChromeDriver();
		drive.get("https://www.redbus.in/");
		drive.manage().window().maximize();
		WebElement from = drive.findElement(By.id("src"));
		from.sendKeys("Chennai");
		WebElement to = drive.findElement(By.id("dest"));
		to.sendKeys("Mumbai");
		
		

	}

}
