package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyGroup7 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[3]")).submit();
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//button)[3]")).click();
	
}
		

}
