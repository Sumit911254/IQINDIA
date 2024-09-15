package testNGcode;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertation_hard {
	
	@Test
	public void simple() {
	String actualresult= "Hi I m sumit";
	String expectedresult="Hi I m sumt";
	Assert.assertEquals(expectedresult, actualresult);
	//Assert.fail("This Test case was minor fail");
	}
	@Test
	public void medium() {
		boolean a=1<3;
		boolean b=3>5;
		boolean c=6<8;
		Assert.assertTrue(a);
		
	}
	@Test 
	public void high() {
		boolean b=3==3;
		Assert.assertTrue(b);
		
	}
    @Test
    public void hard() {
    	Assert.fail();
    	
    }

}
