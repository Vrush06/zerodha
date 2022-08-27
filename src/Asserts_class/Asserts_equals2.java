package Asserts_class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asserts_equals2 {
	
	@Test
	public void method() {
		String s1="Vrushalee";
		String s2="Vrushalee";
		String s3="Vrushali";
		Assert.assertEquals(s1, s2);
		Reporter.log(s3,true);
		System.out.println("It's passed");
	}


}
