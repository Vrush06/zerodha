package Dynamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona3 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		Thread.sleep(2000);
		//death
		String recovered = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[3]")).getText();
		System.out.println(recovered);
	}
		

}
