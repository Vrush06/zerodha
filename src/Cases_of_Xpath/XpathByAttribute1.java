package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://developers.kite.trade/login");
		driver.findElement(By.xpath("//input[@id='id_email']")).sendKeys("vrush0607@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("vrush137151");
		driver.findElement(By.xpath("//input[@class='button button-primary wide']")).submit();
		String a=driver.getTitle();
		Thread.sleep(2000);

		 String title = driver.getTitle();
		 String expected="My apps / Kite Connect developer";
		 if(title.equals(expected)) {
			 System.out.println("Test case is passed");
		 }
		 else {
			 System.out.println("Test case is failed");
		 }
		
	}

}
