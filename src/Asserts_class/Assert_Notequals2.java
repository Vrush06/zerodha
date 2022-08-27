package Asserts_class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Notequals2 {
	
	@Test
	public void notequal() {
		String m1="Devansh";
		String m2="Piyansh";
		String m3="Devansh";
		
		Assert.assertNotEquals(m1, m2);
		Assert.assertNotEquals(m1, m3);
		
	}

}
