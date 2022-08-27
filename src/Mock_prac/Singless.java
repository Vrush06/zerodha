package Mock_prac;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Singless {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://gaana.com/");
	    //i want to take scrnshot of particular element(inspect element store in ref variable)
	    WebElement gTitle = driver.findElement(By.xpath("//a[@class='logo']"));
	    File src = gTitle.getScreenshotAs(OutputType.FILE);
	    //store at destination
	    File dest=new File("C:\\Manual\\Automation\\ss\\gaanatitle.jpg");
	    //source to destination
	    Files.copy(src, dest);
	    
	}


}
