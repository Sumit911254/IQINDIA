package lestenerTestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners  (ITestLestnerClass.class)
public class Test01 {
	
	@Test (priority=1)
	public void GTC1() {
		System.out.println("inside GTC1");
		Assert.assertTrue("GTC1 is fail", false);
	}
	@Test (priority=2)
	public void GTC2() {
		System.out.println("inside GTC2");
		
		
	}
	@Test (dependsOnMethods="GTC1",priority=3)
	public void GTC3() {
		
		System.out.println("inside GTC3");
	}
	@Test(priority=4)
	public void GTC4() {
		System.out.println("inside GTC4");
		
	}
	@Test(priority=5)
	public void GTC5() {
		
		System.out.println("inside GTC5");
	}
	
	
	
	
	

}
