package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childsss {

	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
  		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
	    Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7028857228");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("06Jan1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("teddy bears");
		
}
}
