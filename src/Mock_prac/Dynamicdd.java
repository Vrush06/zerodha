package Mock_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdd {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("white kurtis");
		Thread.sleep(2000);
		 List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='s-suggestion-container']/div"));
		 Thread.sleep(2000);
		 for(WebElement oneoption:alloptions) {
			 String text = oneoption.getText();
			 Thread.sleep(2000);
			 System.out.println(text);
			 if(text.contains("white kurtis anarkali")) {
				System.out.println("yessss"); 
				oneoption.click();
			 }
			  
		 }
		 
		 
		 
	}

}
