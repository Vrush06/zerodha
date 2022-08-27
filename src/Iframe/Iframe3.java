package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		    Thread.sleep(4000);
		driver.switchTo().frame("iframeResult");	
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Vrushali");
		
	}

}
