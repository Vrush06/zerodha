package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendiv2 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://optinmonster.com/what-is-a-popup-notification/");
		Thread.sleep(40000);
		driver.findElement(By.xpath("//button[@class='CloseButton__ButtonElement-sc-79mh24-0 bdHEhC ranger-CloseButton ranger-close ranger-ClosePosition--top-right']"));
	}
	

}
