package Find_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Find_Elements1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:/www.google.com/");
		
		List<WebElement> all = driver.findElements(By.xpath("//div"));
		Thread.sleep(1000);
		System.out.println(all.size());
		for(WebElement one:all) {
			String print = one.getText();
			Thread.sleep(2000);
			System.out.println(print);
			Thread.sleep(1000);
		}
		
		
	}

}
