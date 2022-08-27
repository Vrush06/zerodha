package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookwithddf {

	@FindBy(xpath="//input[@id='email']")private WebElement number;
	@FindBy(xpath="//input[@id='pass']")private WebElement pwd;
	@FindBy(xpath="//button[text()='Log In']")private WebElement enter;
	
	public Facebookwithddf(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void m1(String mail) {
		number.sendKeys(mail);
	}
	public void m2(String pass) {
		pwd.sendKeys(pass);
		enter.click();
	}
	

}
