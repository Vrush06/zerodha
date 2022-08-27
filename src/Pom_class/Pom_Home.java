package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Home {
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement userid;
	
	public Pom_Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyuserid() {
		String actId = userid.getText();
		String expId = "DPG458";
		if(actId.equals(expId)) {
			System.out.println("TC is passed");
		}
		else {
			System.out.println("Tc is failed");
		}
	}
}
