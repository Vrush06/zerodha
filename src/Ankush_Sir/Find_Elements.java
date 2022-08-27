package Ankush_Sir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		 driver.navigate().refresh();
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 driver.navigate().refresh();
		List<WebElement> ele=driver.findElements(By.xpath("//a"));
		
		for(WebElement i:ele) {
			String str=i.getText();
			System.out.println(str);
			
			
		}
		
	}

}
