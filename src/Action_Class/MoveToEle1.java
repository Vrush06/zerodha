package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToEle1 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		WebElement shop = driver.findElement(By.xpath("//span[text()='Bags & Footwear']"));
		Actions act =new Actions(driver);
		//use moveToElement()
		Thread.sleep(3000);
		act.moveToElement(shop).perform();	
	}
}
