package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute4 {
	
	public static void main(String[] args) throws Throwable{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();	
			
	}
}
