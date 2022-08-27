package Asserts_class;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert2 {
	
	@Test
	public void softy1() {
		Reporter.log("hii",true);//verify1
		String s1="bsj";
		String s2="hfg";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(s1, s2);
		
		
		Reporter.log("hey hii",true);		
		sa.assertAll();
	}
	@Test
	public void softy2() {
		SoftAssert sa=new SoftAssert();
		sa.fail();
		Reporter.log("bye",true);
	}
	

}
