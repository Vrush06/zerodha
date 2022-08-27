package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown1 {
	
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Friends series");
		Thread.sleep(2000);
	    List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	    Thread.sleep(2000);
		for(  WebElement oneoption:alloptions) {
			String text = oneoption.getText();
			System.out.println(text);
			if(text.contains("friends series characters")) {
				oneoption.click();
				break;
			}
		}
		
		
	}

}
