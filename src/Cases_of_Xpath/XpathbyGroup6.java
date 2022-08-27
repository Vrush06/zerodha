package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyGroup6 {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("friends series");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div)[37]")).submit();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a)[9]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//body)[1]")).click();
		
}

}
