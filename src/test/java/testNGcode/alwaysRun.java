package testNGcode;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class alwaysRun {
	
@Test 
public void SinIn() {
		System.out.println("User SinIn");
		Assert.fail();
		
	}
@Test (dependsOnMethods="SinIn",alwaysRun=true)
public void BookTicket() {
	System.out.println("Book Confirm Ticket");
}
@Test (dependsOnMethods= {"SinIn","BookTicket"},alwaysRun=true)
public void payment() {
	System.out.println("Pay Money");
}
@Test (dependsOnMethods= {"SinIn","BookTicket","payment"})
public void Recept() {
	System.out.println("Take Recept");
}
}
