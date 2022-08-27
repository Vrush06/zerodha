package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		driver.switchTo().frame("packageFrame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='ActualMain']")).click();
//		Thread.sleep(2000);
//	
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		driver.switchTo().frame("packageListFrame");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).click();
//		
		
	}

}
