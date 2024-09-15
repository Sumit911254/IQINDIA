package testNGcode;

import org.testng.annotations.Test;

public class enabledfalse_IN_Test_NG {
	@Test (priority =1,enabled =false)
	public void LogIN() {
		System.out.println("User Log In");
	}
@Test (priority = 2)
public void SerachFlight() {
	System.out.println("Serach Flight");
}
@Test (priority = 3,enabled=false)
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
