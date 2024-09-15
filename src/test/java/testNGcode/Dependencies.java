package testNGcode;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Dependencies {
	
@Test 
public void SinIn() {
		System.out.println("User SinIn");
		Assert.fail();
	}
@Test (dependsOnMethods="SinIn")
public void BookTicket() {
	System.out.println("Book Confirm Ticket");
}
@Test (dependsOnMethods= {"SinIn","BookTicket"})
public void payment() {
	System.out.println("Pay Money");
}
@Test (dependsOnMethods= {"SinIn","BookTicket","payment"})
public void Recept() {
	System.out.println("Take Recept");
}
}
