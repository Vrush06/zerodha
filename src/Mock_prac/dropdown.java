package Mock_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Facebook Community']")).submit();
		
	WebElement dropdown = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		Select s= new Select(dropdown);
//	
//		s.selectByIndex(4);
//		s.selectByVisibleText("OpenCart Partners");
		driver.findElement(By.xpath("//a[text()='Facebook Community']")).submit();
	}

}
