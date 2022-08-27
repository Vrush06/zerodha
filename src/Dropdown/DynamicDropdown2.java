package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("7028857228");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]")).sendKeys("06jan1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		
		
	}

}
