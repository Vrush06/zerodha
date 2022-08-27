package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert8 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Alert alt = driver.switchTo().alert();
		String t1 = alt.getText();
		Thread.sleep(2000);
		System.out.println(t1);
		Thread.sleep(2000);
		alt.sendKeys("No");
		Thread.sleep(5000);
		alt.accept();
	}

}
