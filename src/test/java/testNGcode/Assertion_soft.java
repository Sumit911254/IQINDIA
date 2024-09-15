package testNGcode;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assertion_soft {
	
	@Test
	public void learn() {
		SoftAssert s=new SoftAssert();
		int a=12;
		int b=12;
		System.out.println("Sum of number" + (a+b));
		s.assertTrue(true, "Successful Pass");
		
		boolean b1=1<2;
		boolean b2=2>6;
		Assert.fail();
		
		//s.assertAll();
		
		
	}

	
}

