package testNGcode;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HarsAssart_vs_SoftAssart {
@Test
	public void GTC01() {
System.out.println("This is my first logic");
Assert.assertTrue(true);

System.out.println("This is my second logic");
Assert.assertTrue(false);

System.out.println("This is my third logic");
Assert.assertTrue(true);


}
@Test
public void GTC02() {
	SoftAssert s=new SoftAssert();
	
	System.out.println("THIS IS FIRST SOFT ASSERT");
	s.assertTrue(true);
	
	System.out.println("THIS IS SECONF SOFT ASSERT");
	s.assertTrue(false);
	
	System.out.println("THIS IS THIRD SOFT ASSERT");
	s.assertTrue(true);
	
	s.assertAll();
	
	
}

}