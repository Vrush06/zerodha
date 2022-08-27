package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown4 {
	
	public static void main(String[] args) throws Throwable {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Taehyung bts");
			Thread.sleep(2000);
			List<WebElement> getall = driver.findElements(By.xpath("//div[@class='pcTkSc']/div"));
			Thread.sleep(2000);
			for(WebElement getone:getall) {
				String list = getone.getText();
				Thread.sleep(2000);
				System.out.println(list);
				
				if(list.contains("taehyung bts photo")) {
					System.out.println("mil gaya");
					Thread.sleep(2000);
					getone.click();
					
				}
			}
				
			
			
	}

			
		


}
