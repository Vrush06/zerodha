package Asserts_class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Assert_Notequals1 {
	
	@Test
	public void TC2() {
		Reporter.log("running TC2",true);
		String expR="Rinky";
		String actR="Rinky";
		Assert.assertNotEquals(expR,actR);
	}

}
