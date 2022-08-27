package Asserts_class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class False2 {
	
	@Test
	public void False() {
		Reporter.log("vdyg");
		boolean s = false;
		
		Assert.assertFalse(s);
	}

}
