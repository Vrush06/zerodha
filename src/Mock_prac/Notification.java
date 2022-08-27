package Mock_prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.hdfc.com/f");
	}

}
