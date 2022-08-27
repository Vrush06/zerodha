package Ankush_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Group_index {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    //enter UN
	    driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
	    //enter the PWD
	    driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
	    //click on login btn
	    driver.findElement(By.xpath("(//div)[13]")).click();
	   
	    
	}

}
