package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOrangehrm1 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		Select s=new Select(dropdown);
		
		//select by index
		//s.selectByIndex(2);
		
		//Select by value
		s.selectByIndex(1);
		
		//select by visible text
		//s.selectByVisibleText("ESS");
		

		
	}

}
