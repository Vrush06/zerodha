package Mock_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("vrush137151@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("06jan1998");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).submit();//css
		
		
	}

}
