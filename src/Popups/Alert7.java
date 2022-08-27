package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert7 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
		
		Alert al = driver.switchTo().alert();
		String text1 = al.getText();
		System.out.println(text1);
		al.accept();
		
	}

}
