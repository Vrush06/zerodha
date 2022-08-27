package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification6 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		//ChromeOptions co=new ChromeOptions();
		//Thread.sleep(2000);
		//co.addArguments("--disable-notifications");
				WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/f");
		
	}

}
