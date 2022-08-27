package Ankush_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //open the browser
	    driver.get("https://demo.actitime.com/login.do");
	    
	    //enter the UN
	    driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	    
	    //enter the PWD
	    driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	    
	    //click on login button
	    driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	}
	
	

}
