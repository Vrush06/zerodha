package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains8 {
	public static void main(String[] args) {

		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://us05web.zoom.us/signin");
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vrush137151@gmail.com");
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("06jan1998");
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary signin user']")).click();
			
			
		
	}

}
