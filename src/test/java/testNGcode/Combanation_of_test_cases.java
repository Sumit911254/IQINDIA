package testNGcode;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Combanation_of_test_cases {
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void login2() {
		System.out.println("login2");
	
	}
	@Test
	public void login3() {
		System.out.println("login3");
	}
	@Test
	public void login4() {
		System.out.println("login4");
		}
	
	@BeforeMethod
	public void reg() {
		System.out.println("reg");
	}
@AfterMethod
public void logout() {
	System.out.println("logout");
}

	
}


