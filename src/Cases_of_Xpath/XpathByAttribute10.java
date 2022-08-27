package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute10 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.pocketfm.com/");
			
			driver.findElement(By.xpath("//img[@src='http://djhonz7dexnot.cloudfront.net/e909c82114e8872f78969f5cb671abb9ba6be727.webp']")).click();
			driver.findElement(By.xpath("//div[@class='ShowDetails_showData__3ng6v']")).submit();
	}

}
