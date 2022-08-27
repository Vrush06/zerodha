package Ankush_Sir;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags {
	
	@Test(invocationCount=5)
	public void TC() {
		Reporter.log("running tc",true);
	}

}
