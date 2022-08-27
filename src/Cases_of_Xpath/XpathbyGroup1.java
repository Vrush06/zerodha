package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyGroup1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://developers.kite.trade/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("vrush0607@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("vrush137151");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[4]")).click();
		
		Thread.sleep(2000);
		String a=driver.getTitle();
		driver.findElement(By.xpath("(//a)[6]")).click();
		
		String e="My apps / Kite Connect developer";
		if(a.equals(e)) {
			System.out.println("Successfully login and logout: TC is passed");
		}
		else {
			System.out.println("Unable to login & logout and logout: TC is failed");
		}
	}

}
