package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOrangehrm7 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rtionline.gov.in/");
		WebElement language = driver.findElement(By.xpath("//select[@id='lan']"));
		
		Select s=new Select(language);
		
		//s.selectByIndex(1);
		
		//s.selectByValue("en");
		s.selectByVisibleText("Hindi");
		
		
	}
	
}
	



