package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable1 {
	
	
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("file:///C:/HTML%20code/singledd1.html");
		WebElement multi = driver.findElement(By.xpath("//select[@id='Hotel']"));
		
		Select s=new Select(multi);
		List<WebElement> text = s.getOptions();
		for(WebElement onetext:text) {
			String store = onetext.getText();
			System.out.println(store);
		}
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByVisibleText("kabab");
		
		Thread.sleep(2000);
	    s.deselectAll();
}

}
