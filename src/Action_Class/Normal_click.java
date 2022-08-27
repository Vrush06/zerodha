package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Normal_click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		WebElement ref = driver.findElement(By.xpath("//span[text()='Cart']"));
		Actions a=new Actions(driver);
		a.moveToElement(ref).click().perform();		
		
	}

}
