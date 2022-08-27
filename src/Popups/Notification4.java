package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		
		c.addArguments("--disable-notification");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
	}

}
