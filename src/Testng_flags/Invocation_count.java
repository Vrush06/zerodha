package Testng_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count {
	
	@Test(invocationCount = 20)
	public void invo() {
		Reporter.log("10 runs",true);
	}

}
