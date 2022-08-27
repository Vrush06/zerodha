package Mock_prac;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_exa {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1646");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//switch to popup
		
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		Thread.sleep(3000);
		alt.accept();
		//alt.dismiss();
		
		
		System.out.println(text);
	}

}
