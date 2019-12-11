import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQa {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Java workspace\\FirstSelenium\\Driver\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.toolsqa.com/automation-practice-table/");
		drive.manage().window().maximize();
		List<WebElement> Trows = drive.findElements(By.tagName("tr"));
		
		for(int i=0; i<Trows.size();i++)
		{
			
			WebElement Trow = Trows.get(i);
			
			List<WebElement> Tdatas = Trow.findElements(By.tagName("td"));
			
			for(int j=0; j<Tdatas.size();j++)
			{
				
				WebElement Tdata = Tdatas.get(j);
				
				String text = Tdata.getText();
				
					if(text.equals("Dubai")) {
					System.out.println(text);
					
					String we = Trow.getText();
					System.out.println(we);
					
					//WebDriver drive1 = new ChromeDriver();
					drive.get("https://www.facebook.com");
					drive.manage().window().maximize();
					
					WebElement from = drive.findElement(By.id("email"));
					from.sendKeys(text);
				}
				
					
			}
			
			
			
		}
		
		
	
	}

}
