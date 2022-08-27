package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains6 {
	
	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]")).sendKeys("friends series");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'CcAdNb')]")).submit();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@data-hveid,'CAIQBA')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[contains(@id,'yDmH0d')]")).click();
		
		
	}

}
