package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute6 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("friends series");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='CcAdNb']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-hveid='CAIQBA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[@id='yDmH0d']")).click();
		
		
		
		
		
		
	}

}
