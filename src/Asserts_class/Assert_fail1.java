package Asserts_class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail1 {
	@Test
	public void Tc1() {
		Reporter.log("running TC1",true); 
		Assert.fail();//verification 1
		System.out.println("I AM AFTER FAIL");//verification 2 
		
	}
	@Test
	public void Tc2() {
		Reporter.log("I am from TC 2");
	}

}
