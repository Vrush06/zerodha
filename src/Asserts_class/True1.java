package Asserts_class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class True1 {
	@Test
	public void mtrue() {
		Reporter.log("a to z",true);
		
		boolean org = true;
		
		Assert.assertTrue(org);
	}

}
