package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyGroup5 {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input)[14]")).sendKeys("vrush137151@gmail.com");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//input)[15]")).sendKeys("06jan1998");
			Thread.sleep(3000);

			driver.findElement(By.xpath("(//button)[1]")).click();
		}




}
