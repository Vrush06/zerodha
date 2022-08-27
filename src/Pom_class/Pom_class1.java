package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class1 {
	
	//declaration
	@FindBy(xpath="//input[@id='userid']") private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement loginbutton;
	
	//initialization
	public Pom_class1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//implementation
	public void enterusername() {
		username.sendKeys("DPG458");
	}
	public void enterpassword() {
		password.sendKeys("Amol@1234");
	}
	public void clickloginbutton() {
		loginbutton.click();
	}

}
