package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute11 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://hudl.talentlms.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Vrushalee.Yadav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='login-fields tl-form-password-field']")).sendKeys("06jan1998");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
	}

}
