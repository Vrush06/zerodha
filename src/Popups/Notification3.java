package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
    	c.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(c);
		
		
		
		driver.get("https://optinmonster.com/what-is-a-popup-notification/");
	}

}
