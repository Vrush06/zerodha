package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOrangehrm5 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a)[5]")).click();
		WebElement list=driver.findElement(By.xpath("//select[@id='gtranslate_selector']"));
		Select s=new Select(list);
		Thread.sleep(2000);
		s.selectByVisibleText("Deutsch");
		
		
		
	}

}
