package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cb {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("SAMSUNG Galaxy F22 (Denim Black, 64 GB)")).click();
	    Thread.sleep(2000);
	    
	    
	}
	

}
