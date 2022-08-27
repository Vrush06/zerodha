package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//driver.findElement(By.xpath("https://demo.guru99.com/test/delete_customer.php"))
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
	    alt.accept();
		//alt.dismiss();
		String text = alt.getText();
		System.out.println(text);
		
	
	}

}
