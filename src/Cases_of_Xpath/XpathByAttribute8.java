package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute8 {

		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.udemy.com/join/login-popup/");
			
			
		    driver.findElement(By.xpath("//input[@id='email--1']")).sendKeys("manishachorghade6@gmail.com");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manisha@27");
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='submit-id-submit']")).click();
			Thread.sleep(2000);

			driver.close();
			

	}

}
