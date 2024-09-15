package testNGcode;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class priorityIN_Test_NG {
	@Test (priority =1)
	public void LogIN() {
		System.out.println("User Log In");
	}
@Test (priority = 2)
public void SerachFlight() {
	System.out.println("Serach Flight");
}
@Test (priority=3)
public void BookFlight() {
	System.out.println("Book Flight");
	
}
@Test (priority = 4)
public void payment() {
	System.out.println("Money Recived");
	
}
@Test (priority = 5)
public void LogOut() {
	System.out.println("User Log Out");
}
}
