package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOrangehrm6 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/HTML%20code/Orang.html");
		WebElement list = driver.findElement(By.xpath("//select[@id='single']"));
		Select s =new Select(list);
		//s.selectByVisibleText("Admin");
		//s.selectByValue("c");
		s.selectByIndex(2);
	}

}
