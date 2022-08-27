package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyGroup2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div)[13]")).click();
		Thread.sleep(2000);
		String actual =driver.getTitle();
		System.out.println(actual);
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
