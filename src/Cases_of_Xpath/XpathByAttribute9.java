package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute9 {
       public static void main(String[] args) {
		
    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
   		
   		   WebDriver driver = new ChromeDriver();
   		   driver.get("https://login.mailchimp.com/?_ga=2.25114106.1136654013.1658296488-2117999935.1658162971");
   		
   	
   		
   		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vrush0607@gmail.com");
   		
   		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vrush@137151");
   		
   		    driver.findElement(By.xpath("//button[@type='submit']")).click();
   		
   		
	}
		
        
		
	


}
