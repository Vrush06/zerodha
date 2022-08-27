package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		Thread.sleep(2000);
		
		String actual =driver.getTitle();
		Thread.sleep(2000);
		String expected="actiTIME - Enter Time-Track";
		Thread.sleep(2000);
		
		if(actual.equals(expected)) {
			System.out.println("Test case pass : home page is opened");
		}
		else {
			System.out.println("Test case fail : home page is not opened");
		}
		
	}

}
