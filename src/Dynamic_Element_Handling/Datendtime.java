package Dynamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datendtime {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/uk/london");
		Thread.sleep(2000);
		String time = driver.findElement(By.xpath("//span[@class='h1']")).getText();
		
		System.out.println(time);
		Thread.sleep(5000);
		String time1 = driver.findElement(By.xpath("//span[@class='h1']")).getText();
		System.out.println(time1);
		
		
	}

}
