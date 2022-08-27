package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class2 {
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement cont;
	
	public Pom_class2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin() {
		pin.sendKeys("171992");
	
	}
	public void clickcont() {
		cont.click();
	}

}
